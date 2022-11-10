// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainState extends com.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * Whether the DNS domain has automatic renewal enabled (boolean).
     * 
     * @deprecated
     * Not used, will be removed in the future
     * 
     */
    @Deprecated /* Not used, will be removed in the future */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return Whether the DNS domain has automatic renewal enabled (boolean).
     * 
     * @deprecated
     * Not used, will be removed in the future
     * 
     */
    @Deprecated /* Not used, will be removed in the future */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * The domain expiration date, if known.
     * 
     * @deprecated
     * Not used, will be removed in the future
     * 
     */
    @Deprecated /* Not used, will be removed in the future */
    @Import(name="expiresOn")
    private @Nullable Output<String> expiresOn;

    /**
     * @return The domain expiration date, if known.
     * 
     * @deprecated
     * Not used, will be removed in the future
     * 
     */
    @Deprecated /* Not used, will be removed in the future */
    public Optional<Output<String>> expiresOn() {
        return Optional.ofNullable(this.expiresOn);
    }

    /**
     * The DNS domain name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The DNS domain name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The domain state.
     * 
     * @deprecated
     * Not used, will be removed in the future
     * 
     */
    @Deprecated /* Not used, will be removed in the future */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The domain state.
     * 
     * @deprecated
     * Not used, will be removed in the future
     * 
     */
    @Deprecated /* Not used, will be removed in the future */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A security token that can be used as an alternative way to manage DNS domains via the Exoscale API.
     * 
     * @deprecated
     * Not used, will be removed in the future
     * 
     */
    @Deprecated /* Not used, will be removed in the future */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return A security token that can be used as an alternative way to manage DNS domains via the Exoscale API.
     * 
     * @deprecated
     * Not used, will be removed in the future
     * 
     */
    @Deprecated /* Not used, will be removed in the future */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private DomainState() {}

    private DomainState(DomainState $) {
        this.autoRenew = $.autoRenew;
        this.expiresOn = $.expiresOn;
        this.name = $.name;
        this.state = $.state;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainState $;

        public Builder() {
            $ = new DomainState();
        }

        public Builder(DomainState defaults) {
            $ = new DomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRenew Whether the DNS domain has automatic renewal enabled (boolean).
         * 
         * @return builder
         * 
         * @deprecated
         * Not used, will be removed in the future
         * 
         */
        @Deprecated /* Not used, will be removed in the future */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew Whether the DNS domain has automatic renewal enabled (boolean).
         * 
         * @return builder
         * 
         * @deprecated
         * Not used, will be removed in the future
         * 
         */
        @Deprecated /* Not used, will be removed in the future */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param expiresOn The domain expiration date, if known.
         * 
         * @return builder
         * 
         * @deprecated
         * Not used, will be removed in the future
         * 
         */
        @Deprecated /* Not used, will be removed in the future */
        public Builder expiresOn(@Nullable Output<String> expiresOn) {
            $.expiresOn = expiresOn;
            return this;
        }

        /**
         * @param expiresOn The domain expiration date, if known.
         * 
         * @return builder
         * 
         * @deprecated
         * Not used, will be removed in the future
         * 
         */
        @Deprecated /* Not used, will be removed in the future */
        public Builder expiresOn(String expiresOn) {
            return expiresOn(Output.of(expiresOn));
        }

        /**
         * @param name The DNS domain name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The DNS domain name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param state The domain state.
         * 
         * @return builder
         * 
         * @deprecated
         * Not used, will be removed in the future
         * 
         */
        @Deprecated /* Not used, will be removed in the future */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The domain state.
         * 
         * @return builder
         * 
         * @deprecated
         * Not used, will be removed in the future
         * 
         */
        @Deprecated /* Not used, will be removed in the future */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param token A security token that can be used as an alternative way to manage DNS domains via the Exoscale API.
         * 
         * @return builder
         * 
         * @deprecated
         * Not used, will be removed in the future
         * 
         */
        @Deprecated /* Not used, will be removed in the future */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token A security token that can be used as an alternative way to manage DNS domains via the Exoscale API.
         * 
         * @return builder
         * 
         * @deprecated
         * Not used, will be removed in the future
         * 
         */
        @Deprecated /* Not used, will be removed in the future */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public DomainState build() {
            return $;
        }
    }

}
