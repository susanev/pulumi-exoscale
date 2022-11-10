// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.exoscale.SKSNodepoolArgs;
import com.pulumiverse.exoscale.Utilities;
import com.pulumiverse.exoscale.inputs.SKSNodepoolState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * An existing SKS node pool may be imported by `&lt;cluster-ID&gt;/&lt;nodepool-ID&gt;@&lt;zone&gt;`console
 * 
 * ```sh
 *  $ pulumi import exoscale:index/sKSNodepool:SKSNodepool \
 * ```
 * 
 *  exoscale_sks_nodepool.my_sks_nodepool \
 * 
 *  f81d4fae-7dec-11d0-a765-00a0c91e6bf6/9ecc6b8b-73d4-4211-8ced-f7f29bb79524@ch-gva-2
 * 
 */
@ResourceType(type="exoscale:index/sKSNodepool:SKSNodepool")
public class SKSNodepool extends com.pulumi.resources.CustomResource {
    /**
     * A list of exoscale.AntiAffinityGroup (IDs) to be attached to the managed instances.
     * 
     */
    @Export(name="antiAffinityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> antiAffinityGroupIds;

    /**
     * @return A list of exoscale.AntiAffinityGroup (IDs) to be attached to the managed instances.
     * 
     */
    public Output<Optional<List<String>>> antiAffinityGroupIds() {
        return Codegen.optional(this.antiAffinityGroupIds);
    }
    /**
     * The parent exoscale.SKSCluster ID.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The parent exoscale.SKSCluster ID.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The pool creation date.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The pool creation date.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * A deploy target ID.
     * 
     */
    @Export(name="deployTargetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> deployTargetId;

    /**
     * @return A deploy target ID.
     * 
     */
    public Output<Optional<String>> deployTargetId() {
        return Codegen.optional(this.deployTargetId);
    }
    /**
     * A free-form text describing the pool.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A free-form text describing the pool.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The managed instances disk size (GiB; default: `50`).
     * 
     */
    @Export(name="diskSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> diskSize;

    /**
     * @return The managed instances disk size (GiB; default: `50`).
     * 
     */
    public Output<Optional<Integer>> diskSize() {
        return Codegen.optional(this.diskSize);
    }
    /**
     * The underlying exoscale.InstancePool ID.
     * 
     */
    @Export(name="instancePoolId", type=String.class, parameters={})
    private Output<String> instancePoolId;

    /**
     * @return The underlying exoscale.InstancePool ID.
     * 
     */
    public Output<String> instancePoolId() {
        return this.instancePoolId;
    }
    /**
     * The string used to prefix the managed instances name (default `pool`).
     * 
     */
    @Export(name="instancePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> instancePrefix;

    /**
     * @return The string used to prefix the managed instances name (default `pool`).
     * 
     */
    public Output<Optional<String>> instancePrefix() {
        return Codegen.optional(this.instancePrefix);
    }
    /**
     * The managed compute instances type (`&lt;family&gt;.&lt;size&gt;`, e.g. `standard.medium`; use the [Exoscale CLI][cli] - `exo compute instance-type list` - for the list of available types).
     * 
     */
    @Export(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return The managed compute instances type (`&lt;family&gt;.&lt;size&gt;`, e.g. `standard.medium`; use the [Exoscale CLI][cli] - `exo compute instance-type list` - for the list of available types).
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * A map of key/value labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A map of key/value labels.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The SKS node pool name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The SKS node pool name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of exoscale.PrivateNetwork (IDs) to be attached to the managed instances.
     * 
     */
    @Export(name="privateNetworkIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> privateNetworkIds;

    /**
     * @return A list of exoscale.PrivateNetwork (IDs) to be attached to the managed instances.
     * 
     */
    public Output<Optional<List<String>>> privateNetworkIds() {
        return Codegen.optional(this.privateNetworkIds);
    }
    /**
     * A list of exoscale.SecurityGroup (IDs) to be attached to the managed instances.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return A list of exoscale.SecurityGroup (IDs) to be attached to the managed instances.
     * 
     */
    public Output<Optional<List<String>>> securityGroupIds() {
        return Codegen.optional(this.securityGroupIds);
    }
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    public Output<Integer> size() {
        return this.size;
    }
    /**
     * The current pool state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current pool state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A map of key/value Kubernetes [taints][taints] (`&lt;value&gt;:&lt;effect&gt;`).
     * 
     */
    @Export(name="taints", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> taints;

    /**
     * @return A map of key/value Kubernetes [taints][taints] (`&lt;value&gt;:&lt;effect&gt;`).
     * 
     */
    public Output<Optional<Map<String,String>>> taints() {
        return Codegen.optional(this.taints);
    }
    /**
     * The managed instances template ID.
     * 
     */
    @Export(name="templateId", type=String.class, parameters={})
    private Output<String> templateId;

    /**
     * @return The managed instances template ID.
     * 
     */
    public Output<String> templateId() {
        return this.templateId;
    }
    /**
     * The managed instances version.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The managed instances version.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The Exoscale [Zone][zone] name.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The Exoscale [Zone][zone] name.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SKSNodepool(String name) {
        this(name, SKSNodepoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SKSNodepool(String name, SKSNodepoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SKSNodepool(String name, SKSNodepoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/sKSNodepool:SKSNodepool", name, args == null ? SKSNodepoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SKSNodepool(String name, Output<String> id, @Nullable SKSNodepoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/sKSNodepool:SKSNodepool", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SKSNodepool get(String name, Output<String> id, @Nullable SKSNodepoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SKSNodepool(name, id, state, options);
    }
}