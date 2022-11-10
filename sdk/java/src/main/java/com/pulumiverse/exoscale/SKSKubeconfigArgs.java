// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SKSKubeconfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SKSKubeconfigArgs Empty = new SKSKubeconfigArgs();

    /**
     * The parent exoscale.SKSCluster ID.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The parent exoscale.SKSCluster ID.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    @Import(name="earlyRenewalSeconds")
    private @Nullable Output<Integer> earlyRenewalSeconds;

    public Optional<Output<Integer>> earlyRenewalSeconds() {
        return Optional.ofNullable(this.earlyRenewalSeconds);
    }

    /**
     * Group names in the generated Kubeconfig. The certificate present in the Kubeconfig will have these roles set in the Organization field.
     * 
     */
    @Import(name="groups", required=true)
    private Output<List<String>> groups;

    /**
     * @return Group names in the generated Kubeconfig. The certificate present in the Kubeconfig will have these roles set in the Organization field.
     * 
     */
    public Output<List<String>> groups() {
        return this.groups;
    }

    /**
     * The Time-to-Live of the Kubeconfig, after which it will expire / become invalid (seconds; default: 2592000 = 30 days).
     * 
     */
    @Import(name="ttlSeconds")
    private @Nullable Output<Double> ttlSeconds;

    /**
     * @return The Time-to-Live of the Kubeconfig, after which it will expire / become invalid (seconds; default: 2592000 = 30 days).
     * 
     */
    public Optional<Output<Double>> ttlSeconds() {
        return Optional.ofNullable(this.ttlSeconds);
    }

    /**
     * User name in the generated Kubeconfig. The certificate present in the Kubeconfig will also have this name set for the CN field.
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    /**
     * @return User name in the generated Kubeconfig. The certificate present in the Kubeconfig will also have this name set for the CN field.
     * 
     */
    public Output<String> user() {
        return this.user;
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

    private SKSKubeconfigArgs() {}

    private SKSKubeconfigArgs(SKSKubeconfigArgs $) {
        this.clusterId = $.clusterId;
        this.earlyRenewalSeconds = $.earlyRenewalSeconds;
        this.groups = $.groups;
        this.ttlSeconds = $.ttlSeconds;
        this.user = $.user;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SKSKubeconfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SKSKubeconfigArgs $;

        public Builder() {
            $ = new SKSKubeconfigArgs();
        }

        public Builder(SKSKubeconfigArgs defaults) {
            $ = new SKSKubeconfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The parent exoscale.SKSCluster ID.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The parent exoscale.SKSCluster ID.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder earlyRenewalSeconds(@Nullable Output<Integer> earlyRenewalSeconds) {
            $.earlyRenewalSeconds = earlyRenewalSeconds;
            return this;
        }

        public Builder earlyRenewalSeconds(Integer earlyRenewalSeconds) {
            return earlyRenewalSeconds(Output.of(earlyRenewalSeconds));
        }

        /**
         * @param groups Group names in the generated Kubeconfig. The certificate present in the Kubeconfig will have these roles set in the Organization field.
         * 
         * @return builder
         * 
         */
        public Builder groups(Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups Group names in the generated Kubeconfig. The certificate present in the Kubeconfig will have these roles set in the Organization field.
         * 
         * @return builder
         * 
         */
        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups Group names in the generated Kubeconfig. The certificate present in the Kubeconfig will have these roles set in the Organization field.
         * 
         * @return builder
         * 
         */
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param ttlSeconds The Time-to-Live of the Kubeconfig, after which it will expire / become invalid (seconds; default: 2592000 = 30 days).
         * 
         * @return builder
         * 
         */
        public Builder ttlSeconds(@Nullable Output<Double> ttlSeconds) {
            $.ttlSeconds = ttlSeconds;
            return this;
        }

        /**
         * @param ttlSeconds The Time-to-Live of the Kubeconfig, after which it will expire / become invalid (seconds; default: 2592000 = 30 days).
         * 
         * @return builder
         * 
         */
        public Builder ttlSeconds(Double ttlSeconds) {
            return ttlSeconds(Output.of(ttlSeconds));
        }

        /**
         * @param user User name in the generated Kubeconfig. The certificate present in the Kubeconfig will also have this name set for the CN field.
         * 
         * @return builder
         * 
         */
        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user User name in the generated Kubeconfig. The certificate present in the Kubeconfig will also have this name set for the CN field.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
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

        public SKSKubeconfigArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.groups = Objects.requireNonNull($.groups, "expected parameter 'groups' to be non-null");
            $.user = Objects.requireNonNull($.user, "expected parameter 'user' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
