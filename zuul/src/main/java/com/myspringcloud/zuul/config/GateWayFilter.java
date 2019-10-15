package com.myspringcloud.zuul.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class GateWayFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run()  {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        String headerToken = request.getHeader("token");
        if(StringUtils.isBlank(token) && StringUtils.isBlank(headerToken)) {
            currentContext.setResponseBody("not permission");
            currentContext.setResponseStatusCode(401);
            currentContext.setSendZuulResponse(false);
        }
        return null;
    }
}
