/**

*/
package com.amazonaws.blox;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link com.amazonaws.blox.Blox}.
 * 
 * @see com.amazonaws.blox.Blox#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class BloxClientBuilder extends SdkSyncClientBuilder<BloxClientBuilder, Blox> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("joufu8ief9.execute-api.us-west-2.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "us-west-2";

    /**
     * Package private constructor - builder should be created via {@link Blox#builder()}
     */
    BloxClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of Blox using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of Blox.
     */
    @Override
    protected Blox build(AwsSyncClientParams params) {
        return new BloxClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
