// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.exoscale.ComputeInstanceArgs;
import com.pulumiverse.exoscale.Utilities;
import com.pulumiverse.exoscale.inputs.ComputeInstanceState;
import com.pulumiverse.exoscale.outputs.ComputeInstanceNetworkInterface;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * An existing compute instance may be imported by `&lt;ID&gt;@&lt;zone&gt;`console
 * 
 * ```sh
 *  $ pulumi import exoscale:index/computeInstance:ComputeInstance \
 * ```
 * 
 *  exoscale_compute_instance.my_instance \
 * 
 *  f81d4fae-7dec-11d0-a765-00a0c91e6bf6@ch-gva-2
 * 
 */
@ResourceType(type="exoscale:index/computeInstance:ComputeInstance")
public class ComputeInstance extends com.pulumi.resources.CustomResource {
    /**
     * A list of exoscale.AntiAffinityGroup (IDs) to attach to the instance (may only be set at creation time).
     * 
     */
    @Export(name="antiAffinityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> antiAffinityGroupIds;

    /**
     * @return A list of exoscale.AntiAffinityGroup (IDs) to attach to the instance (may only be set at creation time).
     * 
     */
    public Output<Optional<List<String>>> antiAffinityGroupIds() {
        return Codegen.optional(this.antiAffinityGroupIds);
    }
    /**
     * The instance creation date.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The instance creation date.
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
     * The instance disk size (GiB; at least `10`). **WARNING**: updating this attribute stops/restarts the instance.
     * 
     */
    @Export(name="diskSize", type=Integer.class, parameters={})
    private Output<Integer> diskSize;

    /**
     * @return The instance disk size (GiB; at least `10`). **WARNING**: updating this attribute stops/restarts the instance.
     * 
     */
    public Output<Integer> diskSize() {
        return this.diskSize;
    }
    /**
     * A list of exoscale.ElasticIP (IDs) to attach to the instance.
     * 
     */
    @Export(name="elasticIpIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> elasticIpIds;

    /**
     * @return A list of exoscale.ElasticIP (IDs) to attach to the instance.
     * 
     */
    public Output<Optional<List<String>>> elasticIpIds() {
        return Codegen.optional(this.elasticIpIds);
    }
    /**
     * Enable IPv6 on the instance (boolean; default: `false`).
     * 
     */
    @Export(name="ipv6", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ipv6;

    /**
     * @return Enable IPv6 on the instance (boolean; default: `false`).
     * 
     */
    public Output<Optional<Boolean>> ipv6() {
        return Codegen.optional(this.ipv6);
    }
    /**
     * The instance (main network interface) IPv6 address (if enabled).
     * 
     */
    @Export(name="ipv6Address", type=String.class, parameters={})
    private Output<String> ipv6Address;

    /**
     * @return The instance (main network interface) IPv6 address (if enabled).
     * 
     */
    public Output<String> ipv6Address() {
        return this.ipv6Address;
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
     * The compute instance name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The compute instance name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Private network interfaces (may be specified multiple times). Structure is documented below.
     * 
     */
    @Export(name="networkInterfaces", type=List.class, parameters={ComputeInstanceNetworkInterface.class})
    private Output</* @Nullable */ List<ComputeInstanceNetworkInterface>> networkInterfaces;

    /**
     * @return Private network interfaces (may be specified multiple times). Structure is documented below.
     * 
     */
    public Output<Optional<List<ComputeInstanceNetworkInterface>>> networkInterfaces() {
        return Codegen.optional(this.networkInterfaces);
    }
    /**
     * (Deprecated) A list of private networks (IDs) attached to the instance. Please use the `network_interface.*.network_id` argument instead.
     * 
     * @deprecated
     * Use the network_interface block instead.
     * 
     */
    @Deprecated /* Use the network_interface block instead. */
    @Export(name="privateNetworkIds", type=List.class, parameters={String.class})
    private Output<List<String>> privateNetworkIds;

    /**
     * @return (Deprecated) A list of private networks (IDs) attached to the instance. Please use the `network_interface.*.network_id` argument instead.
     * 
     */
    public Output<List<String>> privateNetworkIds() {
        return this.privateNetworkIds;
    }
    /**
     * The instance (main network interface) IPv4 address.
     * 
     */
    @Export(name="publicIpAddress", type=String.class, parameters={})
    private Output<String> publicIpAddress;

    /**
     * @return The instance (main network interface) IPv4 address.
     * 
     */
    public Output<String> publicIpAddress() {
        return this.publicIpAddress;
    }
    /**
     * A list of exoscale.SecurityGroup (IDs) to attach to the instance.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return A list of exoscale.SecurityGroup (IDs) to attach to the instance.
     * 
     */
    public Output<Optional<List<String>>> securityGroupIds() {
        return Codegen.optional(this.securityGroupIds);
    }
    /**
     * The exoscale.SSHKey (name) to authorize in the instance (may only be set at creation time).
     * 
     */
    @Export(name="sshKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> sshKey;

    /**
     * @return The exoscale.SSHKey (name) to authorize in the instance (may only be set at creation time).
     * 
     */
    public Output<Optional<String>> sshKey() {
        return Codegen.optional(this.sshKey);
    }
    /**
     * The instance state (`running` or `stopped`; default: `running`).
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The instance state (`running` or `stopped`; default: `running`).
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The exoscale.getComputeTemplate (ID) to use when creating the instance.
     * 
     */
    @Export(name="templateId", type=String.class, parameters={})
    private Output<String> templateId;

    /**
     * @return The exoscale.getComputeTemplate (ID) to use when creating the instance.
     * 
     */
    public Output<String> templateId() {
        return this.templateId;
    }
    /**
     * The instance type (`&lt;family&gt;.&lt;size&gt;`, e.g. `standard.medium`; use the [Exoscale CLI][cli] - `exo compute instance-type list` - for the list of available types). **WARNING**: updating this attribute stops/restarts the instance.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The instance type (`&lt;family&gt;.&lt;size&gt;`, e.g. `standard.medium`; use the [Exoscale CLI][cli] - `exo compute instance-type list` - for the list of available types). **WARNING**: updating this attribute stops/restarts the instance.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * [cloud-init][cloud-init] configuration (no need to base64-encode or gzip it as the provider will take care of it).
     * 
     */
    @Export(name="userData", type=String.class, parameters={})
    private Output</* @Nullable */ String> userData;

    /**
     * @return [cloud-init][cloud-init] configuration (no need to base64-encode or gzip it as the provider will take care of it).
     * 
     */
    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
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
    public ComputeInstance(String name) {
        this(name, ComputeInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ComputeInstance(String name, ComputeInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ComputeInstance(String name, ComputeInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/computeInstance:ComputeInstance", name, args == null ? ComputeInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ComputeInstance(String name, Output<String> id, @Nullable ComputeInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/computeInstance:ComputeInstance", name, state, makeResourceOptions(options, id));
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
    public static ComputeInstance get(String name, Output<String> id, @Nullable ComputeInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ComputeInstance(name, id, state, options);
    }
}
