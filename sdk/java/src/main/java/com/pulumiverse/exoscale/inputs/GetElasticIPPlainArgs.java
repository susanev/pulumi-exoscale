// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetElasticIPPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetElasticIPPlainArgs Empty = new GetElasticIPPlainArgs();

    /**
     * The Elastic IP (EIP) ID to match (conflicts with `ip_address`).
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The Elastic IP (EIP) ID to match (conflicts with `ip_address`).
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The EIP IPv4 or IPv6 address to match (conflicts with `id`).
     * 
     */
    @Import(name="ipAddress")
    private @Nullable String ipAddress;

    /**
     * @return The EIP IPv4 or IPv6 address to match (conflicts with `id`).
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The Exocale [Zone][zone] name.
     * 
     */
    @Import(name="zone", required=true)
    private String zone;

    /**
     * @return The Exocale [Zone][zone] name.
     * 
     */
    public String zone() {
        return this.zone;
    }

    private GetElasticIPPlainArgs() {}

    private GetElasticIPPlainArgs(GetElasticIPPlainArgs $) {
        this.id = $.id;
        this.ipAddress = $.ipAddress;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetElasticIPPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetElasticIPPlainArgs $;

        public Builder() {
            $ = new GetElasticIPPlainArgs();
        }

        public Builder(GetElasticIPPlainArgs defaults) {
            $ = new GetElasticIPPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The Elastic IP (EIP) ID to match (conflicts with `ip_address`).
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param ipAddress The EIP IPv4 or IPv6 address to match (conflicts with `id`).
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param zone The Exocale [Zone][zone] name.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetElasticIPPlainArgs build() {
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
