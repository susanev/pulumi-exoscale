// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.exoscale.AntiAffinityGroupArgs;
import com.pulumiverse.exoscale.Utilities;
import com.pulumiverse.exoscale.inputs.AntiAffinityGroupState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * An existing anti-affinity group may be imported by `&lt;ID&gt;`console
 * 
 * ```sh
 *  $ pulumi import exoscale:index/antiAffinityGroup:AntiAffinityGroup \
 * ```
 * 
 *  exoscale_anti_affinity_group.my_anti_affinity_group \
 * 
 *  f81d4fae-7dec-11d0-a765-00a0c91e6bf6
 * 
 */
@ResourceType(type="exoscale:index/antiAffinityGroup:AntiAffinityGroup")
public class AntiAffinityGroup extends com.pulumi.resources.CustomResource {
    /**
     * A free-form text describing the group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A free-form text describing the group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The anti-affinity group name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The anti-affinity group name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AntiAffinityGroup(String name) {
        this(name, AntiAffinityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AntiAffinityGroup(String name, @Nullable AntiAffinityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AntiAffinityGroup(String name, @Nullable AntiAffinityGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/antiAffinityGroup:AntiAffinityGroup", name, args == null ? AntiAffinityGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AntiAffinityGroup(String name, Output<String> id, @Nullable AntiAffinityGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/antiAffinityGroup:AntiAffinityGroup", name, state, makeResourceOptions(options, id));
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
    public static AntiAffinityGroup get(String name, Output<String> id, @Nullable AntiAffinityGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AntiAffinityGroup(name, id, state, options);
    }
}