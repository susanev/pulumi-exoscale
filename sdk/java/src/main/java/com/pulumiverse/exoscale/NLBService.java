// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.exoscale.NLBServiceArgs;
import com.pulumiverse.exoscale.Utilities;
import com.pulumiverse.exoscale.inputs.NLBServiceState;
import com.pulumiverse.exoscale.outputs.NLBServiceHealthcheck;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * An existing NLB service may be imported by `&lt;nlb-ID&gt;/&lt;service-ID&gt;@&lt;zone&gt;`console
 * 
 * ```sh
 *  $ pulumi import exoscale:index/nLBService:NLBService \
 * ```
 * 
 *  exoscale_nlb_service.my_nlb_service \
 * 
 *  f81d4fae-7dec-11d0-a765-00a0c91e6bf6/9ecc6b8b-73d4-4211-8ced-f7f29bb79524@ch-gva-2
 * 
 */
@ResourceType(type="exoscale:index/nLBService:NLBService")
public class NLBService extends com.pulumi.resources.CustomResource {
    /**
     * A free-form text describing the NLB service.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A free-form text describing the NLB service.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The service health checking configuration (may only bet set at creation time). Structure is documented below.
     * 
     */
    @Export(name="healthchecks", type=List.class, parameters={NLBServiceHealthcheck.class})
    private Output<List<NLBServiceHealthcheck>> healthchecks;

    /**
     * @return The service health checking configuration (may only bet set at creation time). Structure is documented below.
     * 
     */
    public Output<List<NLBServiceHealthcheck>> healthchecks() {
        return this.healthchecks;
    }
    /**
     * The exoscale.InstancePool (ID) to forward traffic to.
     * 
     */
    @Export(name="instancePoolId", type=String.class, parameters={})
    private Output<String> instancePoolId;

    /**
     * @return The exoscale.InstancePool (ID) to forward traffic to.
     * 
     */
    public Output<String> instancePoolId() {
        return this.instancePoolId;
    }
    /**
     * The NLB service name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The NLB service name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parent exoscale.NLB ID.
     * 
     */
    @Export(name="nlbId", type=String.class, parameters={})
    private Output<String> nlbId;

    /**
     * @return The parent exoscale.NLB ID.
     * 
     */
    public Output<String> nlbId() {
        return this.nlbId;
    }
    /**
     * The healthcheck port.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The healthcheck port.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The protocol (`tcp`|`udp`; default: `tcp`).
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    /**
     * @return The protocol (`tcp`|`udp`; default: `tcp`).
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> state() {
        return this.state;
    }
    /**
     * The strategy (`round-robin`|`source-hash`; default: `round-robin`).
     * 
     */
    @Export(name="strategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> strategy;

    /**
     * @return The strategy (`round-robin`|`source-hash`; default: `round-robin`).
     * 
     */
    public Output<Optional<String>> strategy() {
        return Codegen.optional(this.strategy);
    }
    /**
     * The (TCP/UDP) port to forward traffic to (on target instance pool members).
     * 
     */
    @Export(name="targetPort", type=Integer.class, parameters={})
    private Output<Integer> targetPort;

    /**
     * @return The (TCP/UDP) port to forward traffic to (on target instance pool members).
     * 
     */
    public Output<Integer> targetPort() {
        return this.targetPort;
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
    public NLBService(String name) {
        this(name, NLBServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NLBService(String name, NLBServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NLBService(String name, NLBServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/nLBService:NLBService", name, args == null ? NLBServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NLBService(String name, Output<String> id, @Nullable NLBServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/nLBService:NLBService", name, state, makeResourceOptions(options, id));
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
    public static NLBService get(String name, Output<String> id, @Nullable NLBServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NLBService(name, id, state, options);
    }
}