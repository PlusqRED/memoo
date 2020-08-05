package com.grape.memoo.handler.error;

//@Component
//@Order(-1)
//public class GlobalErrorWebExceptionHandler extends AbstractErrorWebExceptionHandler {
//
//    public GlobalErrorWebExceptionHandler(ErrorAttributes errorAttributes, ResourceProperties resourceProperties, ApplicationContext applicationContext, ServerCodecConfigurer configurer) {
//        super(errorAttributes, resourceProperties, applicationContext);
//        this.setMessageWriters(configurer.getWriters());
//    }
//
//    @Override
//    protected RouterFunction<ServerResponse> getRoutingFunction(ErrorAttributes errorAttributes) {
//        return RouterFunctions.route(RequestPredicates.POST("/user"), this::renderErrorResponseMessage);
//    }
//
//    private Mono<ServerResponse> renderErrorResponseMessage(ServerRequest serverRequest) {
//        Map<String, Object> errorAttributes = getErrorAttributes(serverRequest, ErrorAttributeOptions.defaults());
//        errorAttributes.put("message", "Name is empty");
//        return ServerResponse.status(HttpStatus.BAD_REQUEST)
//                .contentType(MediaType.APPLICATION_JSON)
//                .bodyValue(errorAttributes);
//    }
//}
