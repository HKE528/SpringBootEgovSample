package com.example.testGeov.config;

import org.egovframe.rte.fdl.cmmn.trace.LeaveaTrace;
import org.egovframe.rte.fdl.cmmn.trace.handler.DefaultTraceHandler;
import org.egovframe.rte.fdl.cmmn.trace.handler.TraceHandler;
import org.egovframe.rte.fdl.cmmn.trace.manager.DefaultTraceHandleManager;
import org.egovframe.rte.fdl.cmmn.trace.manager.TraceHandlerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;

@Configuration
public class CommonConfig {

    //EgovAbstractServiceImpl 관련 설정!!!
    //LeaveaTrace 빈 작성 해줘야 함
    @Bean
    public LeaveaTrace leaveaTrace(DefaultTraceHandleManager traceHandleManager) {
        LeaveaTrace leaveaTrace = new LeaveaTrace();
        leaveaTrace.setTraceHandlerServices(new TraceHandlerService[]{traceHandleManager});
        return leaveaTrace;
    }

    @Bean
    public DefaultTraceHandleManager traceHandleManager(AntPathMatcher antPathMatcher, DefaultTraceHandler defaultTraceHandler) {
        DefaultTraceHandleManager defaultTraceHandleManager = new DefaultTraceHandleManager();
        defaultTraceHandleManager.setReqExpMatcher(antPathMatcher);
        defaultTraceHandleManager.setPatterns(new String[]{"*"});
        defaultTraceHandleManager.setHandlers(new TraceHandler[]{defaultTraceHandler});
        return defaultTraceHandleManager;
    }

    @Bean
    public AntPathMatcher antPathMatcher() {
        AntPathMatcher antPathMatcher = new AntPathMatcher();
        return antPathMatcher;
    }

    @Bean
    public DefaultTraceHandler defaultTraceHandler() {
        DefaultTraceHandler defaultTraceHandler = new DefaultTraceHandler();
        return defaultTraceHandler;
    }

}
