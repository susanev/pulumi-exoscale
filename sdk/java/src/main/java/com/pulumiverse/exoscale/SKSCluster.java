// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.exoscale.SKSClusterArgs;
import com.pulumiverse.exoscale.Utilities;
import com.pulumiverse.exoscale.inputs.SKSClusterState;
import com.pulumiverse.exoscale.outputs.SKSClusterOidc;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * An existing SKS cluster may be imported by `&lt;ID&gt;@&lt;zone&gt;`console
 * 
 * ```sh
 *  $ pulumi import exoscale:index/sKSCluster:SKSCluster \
 * ```
 * 
 *  exoscale_sks_cluster.my_sks_cluster \
 * 
 *  f81d4fae-7dec-11d0-a765-00a0c91e6bf6@ch-gva-2
 * 
 */
@ResourceType(type="exoscale:index/sKSCluster:SKSCluster")
public class SKSCluster extends com.pulumi.resources.CustomResource {
    /**
     * @deprecated
     * This attribute has been replaced by `exoscale_ccm`/`metrics_server` attributes, it will be removed in a future release.
     * 
     */
    @Deprecated /* This attribute has been replaced by `exoscale_ccm`/`metrics_server` attributes, it will be removed in a future release. */
    @Export(name="addons", type=List.class, parameters={String.class})
    private Output<List<String>> addons;

    public Output<List<String>> addons() {
        return this.addons;
    }
    /**
     * The CA certificate (in PEM format) for TLS communications between the control plane and the aggregation layer (e.g. `metrics-server`).
     * 
     */
    @Export(name="aggregationCa", type=String.class, parameters={})
    private Output<String> aggregationCa;

    /**
     * @return The CA certificate (in PEM format) for TLS communications between the control plane and the aggregation layer (e.g. `metrics-server`).
     * 
     */
    public Output<String> aggregationCa() {
        return this.aggregationCa;
    }
    /**
     * Enable automatic upgrading of the control plane version (boolean; default: `false`).
     * 
     */
    @Export(name="autoUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoUpgrade;

    /**
     * @return Enable automatic upgrading of the control plane version (boolean; default: `false`).
     * 
     */
    public Output<Optional<Boolean>> autoUpgrade() {
        return Codegen.optional(this.autoUpgrade);
    }
    @Export(name="cni", type=String.class, parameters={})
    private Output</* @Nullable */ String> cni;

    public Output<Optional<String>> cni() {
        return Codegen.optional(this.cni);
    }
    /**
     * The CA certificate (in PEM format) for TLS communications between control plane components.
     * 
     */
    @Export(name="controlPlaneCa", type=String.class, parameters={})
    private Output<String> controlPlaneCa;

    /**
     * @return The CA certificate (in PEM format) for TLS communications between control plane components.
     * 
     */
    public Output<String> controlPlaneCa() {
        return this.controlPlaneCa;
    }
    /**
     * The cluster creation date.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The cluster creation date.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * A free-form text describing the cluster.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A free-form text describing the cluster.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The cluster API endpoint.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The cluster API endpoint.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * Deploy the Exoscale [Cloud Controller Manager][ccm] in the control plane (boolean; default: `true`; may only be set at creation time).
     * 
     */
    @Export(name="exoscaleCcm", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> exoscaleCcm;

    /**
     * @return Deploy the Exoscale [Cloud Controller Manager][ccm] in the control plane (boolean; default: `true`; may only be set at creation time).
     * 
     */
    public Output<Optional<Boolean>> exoscaleCcm() {
        return Codegen.optional(this.exoscaleCcm);
    }
    /**
     * The CA certificate (in PEM format) for TLS communications between kubelets and the control plane.
     * 
     */
    @Export(name="kubeletCa", type=String.class, parameters={})
    private Output<String> kubeletCa;

    /**
     * @return The CA certificate (in PEM format) for TLS communications between kubelets and the control plane.
     * 
     */
    public Output<String> kubeletCa() {
        return this.kubeletCa;
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
     * Deploy the [Kubernetes Metrics Server][ms] in the control plane (boolean; default: `true`; may only be set at creation time).
     * 
     */
    @Export(name="metricsServer", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> metricsServer;

    /**
     * @return Deploy the [Kubernetes Metrics Server][ms] in the control plane (boolean; default: `true`; may only be set at creation time).
     * 
     */
    public Output<Optional<Boolean>> metricsServer() {
        return Codegen.optional(this.metricsServer);
    }
    /**
     * The SKS cluster name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The SKS cluster name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The list of exoscale.SKSNodepool (IDs) attached to the cluster.
     * 
     */
    @Export(name="nodepools", type=List.class, parameters={String.class})
    private Output<List<String>> nodepools;

    /**
     * @return The list of exoscale.SKSNodepool (IDs) attached to the cluster.
     * 
     */
    public Output<List<String>> nodepools() {
        return this.nodepools;
    }
    /**
     * An OpenID Connect configuration to provide to the Kubernetes API server (may only be set at creation time). Structure is documented below.
     * 
     */
    @Export(name="oidc", type=SKSClusterOidc.class, parameters={})
    private Output<SKSClusterOidc> oidc;

    /**
     * @return An OpenID Connect configuration to provide to the Kubernetes API server (may only be set at creation time). Structure is documented below.
     * 
     */
    public Output<SKSClusterOidc> oidc() {
        return this.oidc;
    }
    /**
     * The service level of the control plane (`pro` or `starter`; default: `pro`; may only be set at creation time).
     * 
     */
    @Export(name="serviceLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceLevel;

    /**
     * @return The service level of the control plane (`pro` or `starter`; default: `pro`; may only be set at creation time).
     * 
     */
    public Output<Optional<String>> serviceLevel() {
        return Codegen.optional(this.serviceLevel);
    }
    /**
     * The cluster state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The cluster state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The version of the control plane (default: latest version available from the API; see `exo compute sks versions` for reference; may only be set at creation time).
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the control plane (default: latest version available from the API; see `exo compute sks versions` for reference; may only be set at creation time).
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
    public SKSCluster(String name) {
        this(name, SKSClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SKSCluster(String name, SKSClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SKSCluster(String name, SKSClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/sKSCluster:SKSCluster", name, args == null ? SKSClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SKSCluster(String name, Output<String> id, @Nullable SKSClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/sKSCluster:SKSCluster", name, state, makeResourceOptions(options, id));
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
    public static SKSCluster get(String name, Output<String> id, @Nullable SKSClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SKSCluster(name, id, state, options);
    }
}