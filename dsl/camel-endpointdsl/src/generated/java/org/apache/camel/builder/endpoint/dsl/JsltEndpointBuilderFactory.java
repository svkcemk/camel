/* Generated by camel build tools - do NOT edit this file! */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Query or transform JSON payloads using JSLT.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JsltEndpointBuilderFactory {

    /**
     * Builder for endpoint for the JSLT component.
     */
    public interface JsltEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedJsltEndpointBuilder advanced() {
            return (AdvancedJsltEndpointBuilder) this;
        }

        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowContextMapAll the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder allowContextMapAll(boolean allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowContextMapAll the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder allowContextMapAll(String allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowTemplateFromHeader the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder allowTemplateFromHeader(boolean allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowTemplateFromHeader the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder allowTemplateFromHeader(String allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * If true, the mapper will use the USE_BIG_DECIMAL_FOR_FLOATS in
         * serialization features.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param mapBigDecimalAsFloats the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder mapBigDecimalAsFloats(boolean mapBigDecimalAsFloats) {
            doSetProperty("mapBigDecimalAsFloats", mapBigDecimalAsFloats);
            return this;
        }
        /**
         * If true, the mapper will use the USE_BIG_DECIMAL_FOR_FLOATS in
         * serialization features.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param mapBigDecimalAsFloats the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder mapBigDecimalAsFloats(String mapBigDecimalAsFloats) {
            doSetProperty("mapBigDecimalAsFloats", mapBigDecimalAsFloats);
            return this;
        }
        /**
         * Setting a custom JSON Object Mapper to be used.
         * 
         * The option is a:
         * <code>com.fasterxml.jackson.databind.ObjectMapper</code> type.
         * 
         * Group: producer
         * 
         * @param objectMapper the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder objectMapper(com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
            doSetProperty("objectMapper", objectMapper);
            return this;
        }
        /**
         * Setting a custom JSON Object Mapper to be used.
         * 
         * The option will be converted to a
         * <code>com.fasterxml.jackson.databind.ObjectMapper</code> type.
         * 
         * Group: producer
         * 
         * @param objectMapper the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder objectMapper(String objectMapper) {
            doSetProperty("objectMapper", objectMapper);
            return this;
        }
        /**
         * If true, JSON in output message is pretty printed.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         * 
         * @param prettyPrint the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder prettyPrint(boolean prettyPrint) {
            doSetProperty("prettyPrint", prettyPrint);
            return this;
        }
        /**
         * If true, JSON in output message is pretty printed.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         * 
         * @param prettyPrint the value to set
         * @return the dsl builder
         */
        default JsltEndpointBuilder prettyPrint(String prettyPrint) {
            doSetProperty("prettyPrint", prettyPrint);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JSLT component.
     */
    public interface AdvancedJsltEndpointBuilder
            extends
                EndpointProducerBuilder {
        default JsltEndpointBuilder basic() {
            return (JsltEndpointBuilder) this;
        }

        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedJsltEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedJsltEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface JsltBuilders {
        /**
         * JSLT (camel-jslt)
         * Query or transform JSON payloads using JSLT.
         * 
         * Category: transformation
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-jslt
         * 
         * @return the dsl builder for the headers' name.
         */
        default JsltHeaderNameBuilder jslt() {
            return JsltHeaderNameBuilder.INSTANCE;
        }
        /**
         * JSLT (camel-jslt)
         * Query or transform JSON payloads using JSLT.
         * 
         * Category: transformation
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-jslt
         * 
         * Syntax: <code>jslt:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * @param path resourceUri
         * @return the dsl builder
         */
        default JsltEndpointBuilder jslt(String path) {
            return JsltEndpointBuilderFactory.endpointBuilder("jslt", path);
        }
        /**
         * JSLT (camel-jslt)
         * Query or transform JSON payloads using JSLT.
         * 
         * Category: transformation
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-jslt
         * 
         * Syntax: <code>jslt:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceUri
         * @return the dsl builder
         */
        default JsltEndpointBuilder jslt(String componentName, String path) {
            return JsltEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the JSLT component.
     */
    public static class JsltHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final JsltHeaderNameBuilder INSTANCE = new JsltHeaderNameBuilder();

        /**
         * The JSLT Template as String.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code JsltString}.
         */
        public String jsltString() {
            return "CamelJsltString";
        }
        /**
         * The resource URI.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code JsltResourceUri}.
         */
        public String jsltResourceUri() {
            return "CamelJsltResourceUri";
        }
    }
    static JsltEndpointBuilder endpointBuilder(String componentName, String path) {
        class JsltEndpointBuilderImpl extends AbstractEndpointBuilder implements JsltEndpointBuilder, AdvancedJsltEndpointBuilder {
            public JsltEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new JsltEndpointBuilderImpl(path);
    }
}