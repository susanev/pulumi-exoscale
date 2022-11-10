// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.exoscale.IAMAccessKeyArgs;
import com.pulumiverse.exoscale.Utilities;
import com.pulumiverse.exoscale.inputs.IAMAccessKeyState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="exoscale:index/iAMAccessKey:IAMAccessKey")
public class IAMAccessKey extends com.pulumi.resources.CustomResource {
    /**
     * The IAM access key (identifier).
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The IAM access key (identifier).
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * The IAM access key name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The IAM access key name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of API operations to restrict the key to.
     * 
     */
    @Export(name="operations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> operations;

    /**
     * @return A list of API operations to restrict the key to.
     * 
     */
    public Output<Optional<List<String>>> operations() {
        return Codegen.optional(this.operations);
    }
    /**
     * A list of API [resources][iam-resource] to restrict the key to (`&lt;domain&gt;/&lt;type&gt;:&lt;name&gt;`).
     * 
     */
    @Export(name="resources", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> resources;

    /**
     * @return A list of API [resources][iam-resource] to restrict the key to (`&lt;domain&gt;/&lt;type&gt;:&lt;name&gt;`).
     * 
     */
    public Output<Optional<List<String>>> resources() {
        return Codegen.optional(this.resources);
    }
    /**
     * (Sensitive) The key secret.
     * 
     */
    @Export(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    /**
     * @return (Sensitive) The key secret.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }
    /**
     * A list of tags to restrict the key to.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tags to restrict the key to.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsOperations", type=List.class, parameters={String.class})
    private Output<List<String>> tagsOperations;

    public Output<List<String>> tagsOperations() {
        return this.tagsOperations;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMAccessKey(String name) {
        this(name, IAMAccessKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMAccessKey(String name, @Nullable IAMAccessKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMAccessKey(String name, @Nullable IAMAccessKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/iAMAccessKey:IAMAccessKey", name, args == null ? IAMAccessKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IAMAccessKey(String name, Output<String> id, @Nullable IAMAccessKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/iAMAccessKey:IAMAccessKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "key",
                "secret"
            ))
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
    public static IAMAccessKey get(String name, Output<String> id, @Nullable IAMAccessKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IAMAccessKey(name, id, state, options);
    }
}
