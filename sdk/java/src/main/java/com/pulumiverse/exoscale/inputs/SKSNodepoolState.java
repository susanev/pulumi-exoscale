// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SKSNodepoolState extends com.pulumi.resources.ResourceArgs {

    public static final SKSNodepoolState Empty = new SKSNodepoolState();

    /**
     * A list of exoscale.AntiAffinityGroup (IDs) to be attached to the managed instances.
     * 
     */
    @Import(name="antiAffinityGroupIds")
    private @Nullable Output<List<String>> antiAffinityGroupIds;

    /**
     * @return A list of exoscale.AntiAffinityGroup (IDs) to be attached to the managed instances.
     * 
     */
    public Optional<Output<List<String>>> antiAffinityGroupIds() {
        return Optional.ofNullable(this.antiAffinityGroupIds);
    }

    /**
     * The parent exoscale.SKSCluster ID.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The parent exoscale.SKSCluster ID.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The pool creation date.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The pool creation date.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * A deploy target ID.
     * 
     */
    @Import(name="deployTargetId")
    private @Nullable Output<String> deployTargetId;

    /**
     * @return A deploy target ID.
     * 
     */
    public Optional<Output<String>> deployTargetId() {
        return Optional.ofNullable(this.deployTargetId);
    }

    /**
     * A free-form text describing the pool.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A free-form text describing the pool.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The managed instances disk size (GiB; default: `50`).
     * 
     */
    @Import(name="diskSize")
    private @Nullable Output<Integer> diskSize;

    /**
     * @return The managed instances disk size (GiB; default: `50`).
     * 
     */
    public Optional<Output<Integer>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    /**
     * The underlying exoscale.InstancePool ID.
     * 
     */
    @Import(name="instancePoolId")
    private @Nullable Output<String> instancePoolId;

    /**
     * @return The underlying exoscale.InstancePool ID.
     * 
     */
    public Optional<Output<String>> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }

    /**
     * The string used to prefix the managed instances name (default `pool`).
     * 
     */
    @Import(name="instancePrefix")
    private @Nullable Output<String> instancePrefix;

    /**
     * @return The string used to prefix the managed instances name (default `pool`).
     * 
     */
    public Optional<Output<String>> instancePrefix() {
        return Optional.ofNullable(this.instancePrefix);
    }

    /**
     * The managed compute instances type (`&lt;family&gt;.&lt;size&gt;`, e.g. `standard.medium`; use the [Exoscale CLI][cli] - `exo compute instance-type list` - for the list of available types).
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The managed compute instances type (`&lt;family&gt;.&lt;size&gt;`, e.g. `standard.medium`; use the [Exoscale CLI][cli] - `exo compute instance-type list` - for the list of available types).
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * A map of key/value labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return A map of key/value labels.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The SKS node pool name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The SKS node pool name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of exoscale.PrivateNetwork (IDs) to be attached to the managed instances.
     * 
     */
    @Import(name="privateNetworkIds")
    private @Nullable Output<List<String>> privateNetworkIds;

    /**
     * @return A list of exoscale.PrivateNetwork (IDs) to be attached to the managed instances.
     * 
     */
    public Optional<Output<List<String>>> privateNetworkIds() {
        return Optional.ofNullable(this.privateNetworkIds);
    }

    /**
     * A list of exoscale.SecurityGroup (IDs) to be attached to the managed instances.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return A list of exoscale.SecurityGroup (IDs) to be attached to the managed instances.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    @Import(name="size")
    private @Nullable Output<Integer> size;

    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The current pool state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current pool state.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A map of key/value Kubernetes [taints][taints] (`&lt;value&gt;:&lt;effect&gt;`).
     * 
     */
    @Import(name="taints")
    private @Nullable Output<Map<String,String>> taints;

    /**
     * @return A map of key/value Kubernetes [taints][taints] (`&lt;value&gt;:&lt;effect&gt;`).
     * 
     */
    public Optional<Output<Map<String,String>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    /**
     * The managed instances template ID.
     * 
     */
    @Import(name="templateId")
    private @Nullable Output<String> templateId;

    /**
     * @return The managed instances template ID.
     * 
     */
    public Optional<Output<String>> templateId() {
        return Optional.ofNullable(this.templateId);
    }

    /**
     * The managed instances version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The managed instances version.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The Exoscale [Zone][zone] name.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The Exoscale [Zone][zone] name.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private SKSNodepoolState() {}

    private SKSNodepoolState(SKSNodepoolState $) {
        this.antiAffinityGroupIds = $.antiAffinityGroupIds;
        this.clusterId = $.clusterId;
        this.createdAt = $.createdAt;
        this.deployTargetId = $.deployTargetId;
        this.description = $.description;
        this.diskSize = $.diskSize;
        this.instancePoolId = $.instancePoolId;
        this.instancePrefix = $.instancePrefix;
        this.instanceType = $.instanceType;
        this.labels = $.labels;
        this.name = $.name;
        this.privateNetworkIds = $.privateNetworkIds;
        this.securityGroupIds = $.securityGroupIds;
        this.size = $.size;
        this.state = $.state;
        this.taints = $.taints;
        this.templateId = $.templateId;
        this.version = $.version;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SKSNodepoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SKSNodepoolState $;

        public Builder() {
            $ = new SKSNodepoolState();
        }

        public Builder(SKSNodepoolState defaults) {
            $ = new SKSNodepoolState(Objects.requireNonNull(defaults));
        }

        /**
         * @param antiAffinityGroupIds A list of exoscale.AntiAffinityGroup (IDs) to be attached to the managed instances.
         * 
         * @return builder
         * 
         */
        public Builder antiAffinityGroupIds(@Nullable Output<List<String>> antiAffinityGroupIds) {
            $.antiAffinityGroupIds = antiAffinityGroupIds;
            return this;
        }

        /**
         * @param antiAffinityGroupIds A list of exoscale.AntiAffinityGroup (IDs) to be attached to the managed instances.
         * 
         * @return builder
         * 
         */
        public Builder antiAffinityGroupIds(List<String> antiAffinityGroupIds) {
            return antiAffinityGroupIds(Output.of(antiAffinityGroupIds));
        }

        /**
         * @param antiAffinityGroupIds A list of exoscale.AntiAffinityGroup (IDs) to be attached to the managed instances.
         * 
         * @return builder
         * 
         */
        public Builder antiAffinityGroupIds(String... antiAffinityGroupIds) {
            return antiAffinityGroupIds(List.of(antiAffinityGroupIds));
        }

        /**
         * @param clusterId The parent exoscale.SKSCluster ID.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
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

        /**
         * @param createdAt The pool creation date.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The pool creation date.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param deployTargetId A deploy target ID.
         * 
         * @return builder
         * 
         */
        public Builder deployTargetId(@Nullable Output<String> deployTargetId) {
            $.deployTargetId = deployTargetId;
            return this;
        }

        /**
         * @param deployTargetId A deploy target ID.
         * 
         * @return builder
         * 
         */
        public Builder deployTargetId(String deployTargetId) {
            return deployTargetId(Output.of(deployTargetId));
        }

        /**
         * @param description A free-form text describing the pool.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A free-form text describing the pool.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diskSize The managed instances disk size (GiB; default: `50`).
         * 
         * @return builder
         * 
         */
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize The managed instances disk size (GiB; default: `50`).
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        /**
         * @param instancePoolId The underlying exoscale.InstancePool ID.
         * 
         * @return builder
         * 
         */
        public Builder instancePoolId(@Nullable Output<String> instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        /**
         * @param instancePoolId The underlying exoscale.InstancePool ID.
         * 
         * @return builder
         * 
         */
        public Builder instancePoolId(String instancePoolId) {
            return instancePoolId(Output.of(instancePoolId));
        }

        /**
         * @param instancePrefix The string used to prefix the managed instances name (default `pool`).
         * 
         * @return builder
         * 
         */
        public Builder instancePrefix(@Nullable Output<String> instancePrefix) {
            $.instancePrefix = instancePrefix;
            return this;
        }

        /**
         * @param instancePrefix The string used to prefix the managed instances name (default `pool`).
         * 
         * @return builder
         * 
         */
        public Builder instancePrefix(String instancePrefix) {
            return instancePrefix(Output.of(instancePrefix));
        }

        /**
         * @param instanceType The managed compute instances type (`&lt;family&gt;.&lt;size&gt;`, e.g. `standard.medium`; use the [Exoscale CLI][cli] - `exo compute instance-type list` - for the list of available types).
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The managed compute instances type (`&lt;family&gt;.&lt;size&gt;`, e.g. `standard.medium`; use the [Exoscale CLI][cli] - `exo compute instance-type list` - for the list of available types).
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param labels A map of key/value labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A map of key/value labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The SKS node pool name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The SKS node pool name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateNetworkIds A list of exoscale.PrivateNetwork (IDs) to be attached to the managed instances.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkIds(@Nullable Output<List<String>> privateNetworkIds) {
            $.privateNetworkIds = privateNetworkIds;
            return this;
        }

        /**
         * @param privateNetworkIds A list of exoscale.PrivateNetwork (IDs) to be attached to the managed instances.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkIds(List<String> privateNetworkIds) {
            return privateNetworkIds(Output.of(privateNetworkIds));
        }

        /**
         * @param privateNetworkIds A list of exoscale.PrivateNetwork (IDs) to be attached to the managed instances.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkIds(String... privateNetworkIds) {
            return privateNetworkIds(List.of(privateNetworkIds));
        }

        /**
         * @param securityGroupIds A list of exoscale.SecurityGroup (IDs) to be attached to the managed instances.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds A list of exoscale.SecurityGroup (IDs) to be attached to the managed instances.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds A list of exoscale.SecurityGroup (IDs) to be attached to the managed instances.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param state The current pool state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current pool state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param taints A map of key/value Kubernetes [taints][taints] (`&lt;value&gt;:&lt;effect&gt;`).
         * 
         * @return builder
         * 
         */
        public Builder taints(@Nullable Output<Map<String,String>> taints) {
            $.taints = taints;
            return this;
        }

        /**
         * @param taints A map of key/value Kubernetes [taints][taints] (`&lt;value&gt;:&lt;effect&gt;`).
         * 
         * @return builder
         * 
         */
        public Builder taints(Map<String,String> taints) {
            return taints(Output.of(taints));
        }

        /**
         * @param templateId The managed instances template ID.
         * 
         * @return builder
         * 
         */
        public Builder templateId(@Nullable Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        /**
         * @param templateId The managed instances template ID.
         * 
         * @return builder
         * 
         */
        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        /**
         * @param version The managed instances version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The managed instances version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param zone The Exoscale [Zone][zone] name.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
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

        public SKSNodepoolState build() {
            return $;
        }
    }

}