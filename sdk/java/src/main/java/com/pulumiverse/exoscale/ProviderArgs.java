// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * Exoscale CloudStack API endpoint (by default: https://api.exoscale.com/v1)
     * 
     */
    @Import(name="computeEndpoint")
    private @Nullable Output<String> computeEndpoint;

    /**
     * @return Exoscale CloudStack API endpoint (by default: https://api.exoscale.com/v1)
     * 
     */
    public Optional<Output<String>> computeEndpoint() {
        return Optional.ofNullable(this.computeEndpoint);
    }

    /**
     * CloudStack ini configuration filename (by default: cloudstack.ini)
     * 
     */
    @Import(name="config")
    private @Nullable Output<String> config;

    /**
     * @return CloudStack ini configuration filename (by default: cloudstack.ini)
     * 
     */
    public Optional<Output<String>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * @deprecated
     * Does nothing
     * 
     */
    @Deprecated /* Does nothing */
    @Import(name="delay", json=true)
    private @Nullable Output<Integer> delay;

    /**
     * @deprecated
     * Does nothing
     * 
     */
    @Deprecated /* Does nothing */
    public Optional<Output<Integer>> delay() {
        return Optional.ofNullable(this.delay);
    }

    /**
     * Exoscale DNS API endpoint (by default: https://api.exoscale.com/dns)
     * 
     */
    @Import(name="dnsEndpoint", required=true)
    private Output<String> dnsEndpoint;

    /**
     * @return Exoscale DNS API endpoint (by default: https://api.exoscale.com/dns)
     * 
     */
    public Output<String> dnsEndpoint() {
        return this.dnsEndpoint;
    }

    @Import(name="environment")
    private @Nullable Output<String> environment;

    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Defines if the user-data of compute instances should be gzipped (by default: true)
     * 
     */
    @Import(name="gzipUserData", json=true)
    private @Nullable Output<Boolean> gzipUserData;

    /**
     * @return Defines if the user-data of compute instances should be gzipped (by default: true)
     * 
     */
    public Optional<Output<Boolean>> gzipUserData() {
        return Optional.ofNullable(this.gzipUserData);
    }

    /**
     * Exoscale API key
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Exoscale API key
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * @deprecated
     * Use region instead
     * 
     */
    @Deprecated /* Use region instead */
    @Import(name="profile")
    private @Nullable Output<String> profile;

    /**
     * @deprecated
     * Use region instead
     * 
     */
    @Deprecated /* Use region instead */
    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    /**
     * CloudStack ini configuration section name (by default: cloudstack)
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return CloudStack ini configuration section name (by default: cloudstack)
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Exoscale API secret
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return Exoscale API secret
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * Timeout in seconds for waiting on compute resources to become available (by default: 300)
     * 
     */
    @Import(name="timeout", required=true, json=true)
    private Output<Integer> timeout;

    /**
     * @return Timeout in seconds for waiting on compute resources to become available (by default: 300)
     * 
     */
    public Output<Integer> timeout() {
        return this.timeout;
    }

    /**
     * @deprecated
     * Use key instead
     * 
     */
    @Deprecated /* Use key instead */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @deprecated
     * Use key instead
     * 
     */
    @Deprecated /* Use key instead */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.computeEndpoint = $.computeEndpoint;
        this.config = $.config;
        this.delay = $.delay;
        this.dnsEndpoint = $.dnsEndpoint;
        this.environment = $.environment;
        this.gzipUserData = $.gzipUserData;
        this.key = $.key;
        this.profile = $.profile;
        this.region = $.region;
        this.secret = $.secret;
        this.timeout = $.timeout;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeEndpoint Exoscale CloudStack API endpoint (by default: https://api.exoscale.com/v1)
         * 
         * @return builder
         * 
         */
        public Builder computeEndpoint(@Nullable Output<String> computeEndpoint) {
            $.computeEndpoint = computeEndpoint;
            return this;
        }

        /**
         * @param computeEndpoint Exoscale CloudStack API endpoint (by default: https://api.exoscale.com/v1)
         * 
         * @return builder
         * 
         */
        public Builder computeEndpoint(String computeEndpoint) {
            return computeEndpoint(Output.of(computeEndpoint));
        }

        /**
         * @param config CloudStack ini configuration filename (by default: cloudstack.ini)
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<String> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config CloudStack ini configuration filename (by default: cloudstack.ini)
         * 
         * @return builder
         * 
         */
        public Builder config(String config) {
            return config(Output.of(config));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Does nothing
         * 
         */
        @Deprecated /* Does nothing */
        public Builder delay(@Nullable Output<Integer> delay) {
            $.delay = delay;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Does nothing
         * 
         */
        @Deprecated /* Does nothing */
        public Builder delay(Integer delay) {
            return delay(Output.of(delay));
        }

        /**
         * @param dnsEndpoint Exoscale DNS API endpoint (by default: https://api.exoscale.com/dns)
         * 
         * @return builder
         * 
         */
        public Builder dnsEndpoint(Output<String> dnsEndpoint) {
            $.dnsEndpoint = dnsEndpoint;
            return this;
        }

        /**
         * @param dnsEndpoint Exoscale DNS API endpoint (by default: https://api.exoscale.com/dns)
         * 
         * @return builder
         * 
         */
        public Builder dnsEndpoint(String dnsEndpoint) {
            return dnsEndpoint(Output.of(dnsEndpoint));
        }

        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param gzipUserData Defines if the user-data of compute instances should be gzipped (by default: true)
         * 
         * @return builder
         * 
         */
        public Builder gzipUserData(@Nullable Output<Boolean> gzipUserData) {
            $.gzipUserData = gzipUserData;
            return this;
        }

        /**
         * @param gzipUserData Defines if the user-data of compute instances should be gzipped (by default: true)
         * 
         * @return builder
         * 
         */
        public Builder gzipUserData(Boolean gzipUserData) {
            return gzipUserData(Output.of(gzipUserData));
        }

        /**
         * @param key Exoscale API key
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Exoscale API key
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use region instead
         * 
         */
        @Deprecated /* Use region instead */
        public Builder profile(@Nullable Output<String> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use region instead
         * 
         */
        @Deprecated /* Use region instead */
        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        /**
         * @param region CloudStack ini configuration section name (by default: cloudstack)
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region CloudStack ini configuration section name (by default: cloudstack)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secret Exoscale API secret
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Exoscale API secret
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param timeout Timeout in seconds for waiting on compute resources to become available (by default: 300)
         * 
         * @return builder
         * 
         */
        public Builder timeout(Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Timeout in seconds for waiting on compute resources to become available (by default: 300)
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use key instead
         * 
         */
        @Deprecated /* Use key instead */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use key instead
         * 
         */
        @Deprecated /* Use key instead */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public ProviderArgs build() {
            $.dnsEndpoint = Objects.requireNonNull($.dnsEndpoint, "expected parameter 'dnsEndpoint' to be non-null");
            $.timeout = Objects.requireNonNull($.timeout, "expected parameter 'timeout' to be non-null");
            return $;
        }
    }

}
