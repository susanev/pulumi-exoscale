// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumiverse.exoscale.inputs.ElasticIPHealthcheckArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElasticIPArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElasticIPArgs Empty = new ElasticIPArgs();

    /**
     * The Elastic IP (EIP) address family (`inet4` or `inet6`; default: `inet4`).
     * 
     */
    @Import(name="addressFamily")
    private @Nullable Output<String> addressFamily;

    /**
     * @return The Elastic IP (EIP) address family (`inet4` or `inet6`; default: `inet4`).
     * 
     */
    public Optional<Output<String>> addressFamily() {
        return Optional.ofNullable(this.addressFamily);
    }

    /**
     * A free-form text describing the Elastic IP (EIP).
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A free-form text describing the Elastic IP (EIP).
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Healthcheck configuration for *managed* EIPs. Structure is documented below.
     * 
     */
    @Import(name="healthcheck")
    private @Nullable Output<ElasticIPHealthcheckArgs> healthcheck;

    /**
     * @return Healthcheck configuration for *managed* EIPs. Structure is documented below.
     * 
     */
    public Optional<Output<ElasticIPHealthcheckArgs>> healthcheck() {
        return Optional.ofNullable(this.healthcheck);
    }

    /**
     * The Exoscale [Zone][zone] name.
     * 
     */
    @Import(name="zone", required=true)
    private Output<String> zone;

    /**
     * @return The Exoscale [Zone][zone] name.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    private ElasticIPArgs() {}

    private ElasticIPArgs(ElasticIPArgs $) {
        this.addressFamily = $.addressFamily;
        this.description = $.description;
        this.healthcheck = $.healthcheck;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElasticIPArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElasticIPArgs $;

        public Builder() {
            $ = new ElasticIPArgs();
        }

        public Builder(ElasticIPArgs defaults) {
            $ = new ElasticIPArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressFamily The Elastic IP (EIP) address family (`inet4` or `inet6`; default: `inet4`).
         * 
         * @return builder
         * 
         */
        public Builder addressFamily(@Nullable Output<String> addressFamily) {
            $.addressFamily = addressFamily;
            return this;
        }

        /**
         * @param addressFamily The Elastic IP (EIP) address family (`inet4` or `inet6`; default: `inet4`).
         * 
         * @return builder
         * 
         */
        public Builder addressFamily(String addressFamily) {
            return addressFamily(Output.of(addressFamily));
        }

        /**
         * @param description A free-form text describing the Elastic IP (EIP).
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A free-form text describing the Elastic IP (EIP).
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param healthcheck Healthcheck configuration for *managed* EIPs. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder healthcheck(@Nullable Output<ElasticIPHealthcheckArgs> healthcheck) {
            $.healthcheck = healthcheck;
            return this;
        }

        /**
         * @param healthcheck Healthcheck configuration for *managed* EIPs. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder healthcheck(ElasticIPHealthcheckArgs healthcheck) {
            return healthcheck(Output.of(healthcheck));
        }

        /**
         * @param zone The Exoscale [Zone][zone] name.
         * 
         * @return builder
         * 
         */
        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The Exoscale [Zone][zone] name.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ElasticIPArgs build() {
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}