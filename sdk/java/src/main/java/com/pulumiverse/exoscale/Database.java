// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.exoscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.exoscale.DatabaseArgs;
import com.pulumiverse.exoscale.Utilities;
import com.pulumiverse.exoscale.inputs.DatabaseState;
import com.pulumiverse.exoscale.outputs.DatabaseKafka;
import com.pulumiverse.exoscale.outputs.DatabaseMysql;
import com.pulumiverse.exoscale.outputs.DatabaseOpensearch;
import com.pulumiverse.exoscale.outputs.DatabasePg;
import com.pulumiverse.exoscale.outputs.DatabaseRedis;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * An existing database service may be imported by `&lt;name&gt;@&lt;zone&gt;`console
 * 
 * ```sh
 *  $ pulumi import exoscale:index/database:Database \
 * ```
 * 
 *  exoscale_database.my_database \
 * 
 *  my-database@ch-gva-2
 * 
 */
@ResourceType(type="exoscale:index/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * CA Certificate required to reach a DBaaS service through a TLS-protected connection.
     * 
     */
    @Export(name="caCertificate", type=String.class, parameters={})
    private Output<String> caCertificate;

    /**
     * @return CA Certificate required to reach a DBaaS service through a TLS-protected connection.
     * 
     */
    public Output<String> caCertificate() {
        return this.caCertificate;
    }
    /**
     * The creation date of the database service.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The creation date of the database service.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The disk size of the database service.
     * 
     */
    @Export(name="diskSize", type=Integer.class, parameters={})
    private Output<Integer> diskSize;

    /**
     * @return The disk size of the database service.
     * 
     */
    public Output<Integer> diskSize() {
        return this.diskSize;
    }
    /**
     * *kafka* database service type specific arguments. Structure is documented below.
     * 
     */
    @Export(name="kafka", type=DatabaseKafka.class, parameters={})
    private Output</* @Nullable */ DatabaseKafka> kafka;

    /**
     * @return *kafka* database service type specific arguments. Structure is documented below.
     * 
     */
    public Output<Optional<DatabaseKafka>> kafka() {
        return Codegen.optional(this.kafka);
    }
    /**
     * The day of week to perform the automated database service maintenance (`never`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`, `sunday`).
     * 
     */
    @Export(name="maintenanceDow", type=String.class, parameters={})
    private Output<String> maintenanceDow;

    /**
     * @return The day of week to perform the automated database service maintenance (`never`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`, `sunday`).
     * 
     */
    public Output<String> maintenanceDow() {
        return this.maintenanceDow;
    }
    /**
     * The time of day to perform the automated database service maintenance (`HH:MM:SS`)
     * 
     */
    @Export(name="maintenanceTime", type=String.class, parameters={})
    private Output<String> maintenanceTime;

    /**
     * @return The time of day to perform the automated database service maintenance (`HH:MM:SS`)
     * 
     */
    public Output<String> maintenanceTime() {
        return this.maintenanceTime;
    }
    /**
     * *mysql* database service type specific arguments. Structure is documented below.
     * 
     */
    @Export(name="mysql", type=DatabaseMysql.class, parameters={})
    private Output</* @Nullable */ DatabaseMysql> mysql;

    /**
     * @return *mysql* database service type specific arguments. Structure is documented below.
     * 
     */
    public Output<Optional<DatabaseMysql>> mysql() {
        return Codegen.optional(this.mysql);
    }
    /**
     * The name of the database service.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database service.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of CPUs of the database service.
     * 
     */
    @Export(name="nodeCpus", type=Integer.class, parameters={})
    private Output<Integer> nodeCpus;

    /**
     * @return The number of CPUs of the database service.
     * 
     */
    public Output<Integer> nodeCpus() {
        return this.nodeCpus;
    }
    /**
     * The amount of memory of the database service.
     * 
     */
    @Export(name="nodeMemory", type=Integer.class, parameters={})
    private Output<Integer> nodeMemory;

    /**
     * @return The amount of memory of the database service.
     * 
     */
    public Output<Integer> nodeMemory() {
        return this.nodeMemory;
    }
    /**
     * The number of nodes of the database service.
     * 
     */
    @Export(name="nodes", type=Integer.class, parameters={})
    private Output<Integer> nodes;

    /**
     * @return The number of nodes of the database service.
     * 
     */
    public Output<Integer> nodes() {
        return this.nodes;
    }
    /**
     * *opensearch* database service type specific arguments. Structure is documented below.
     * 
     */
    @Export(name="opensearch", type=DatabaseOpensearch.class, parameters={})
    private Output</* @Nullable */ DatabaseOpensearch> opensearch;

    /**
     * @return *opensearch* database service type specific arguments. Structure is documented below.
     * 
     */
    public Output<Optional<DatabaseOpensearch>> opensearch() {
        return Codegen.optional(this.opensearch);
    }
    /**
     * *pg* database service type specific arguments. Structure is documented below.
     * 
     */
    @Export(name="pg", type=DatabasePg.class, parameters={})
    private Output</* @Nullable */ DatabasePg> pg;

    /**
     * @return *pg* database service type specific arguments. Structure is documented below.
     * 
     */
    public Output<Optional<DatabasePg>> pg() {
        return Codegen.optional(this.pg);
    }
    /**
     * The plan of the database service (use the [Exoscale CLI][cli] - `exo dbaas type show &lt;TYPE&gt;` - for reference).
     * 
     */
    @Export(name="plan", type=String.class, parameters={})
    private Output<String> plan;

    /**
     * @return The plan of the database service (use the [Exoscale CLI][cli] - `exo dbaas type show &lt;TYPE&gt;` - for reference).
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }
    /**
     * *redis* database service type specific arguments. Structure is documented below.
     * 
     */
    @Export(name="redis", type=DatabaseRedis.class, parameters={})
    private Output</* @Nullable */ DatabaseRedis> redis;

    /**
     * @return *redis* database service type specific arguments. Structure is documented below.
     * 
     */
    public Output<Optional<DatabaseRedis>> redis() {
        return Codegen.optional(this.redis);
    }
    /**
     * The current state of the database service.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the database service.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The database service protection boolean flag against termination/power-off.
     * 
     */
    @Export(name="terminationProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminationProtection;

    /**
     * @return The database service protection boolean flag against termination/power-off.
     * 
     */
    public Output<Optional<Boolean>> terminationProtection() {
        return Codegen.optional(this.terminationProtection);
    }
    /**
     * The type of the database service (`kafka`, `mysql`, `opensearch`, `pg`, `redis`).
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the database service (`kafka`, `mysql`, `opensearch`, `pg`, `redis`).
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The date of the latest database service update.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The date of the latest database service update.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * The database service connection URI.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    /**
     * @return The database service connection URI.
     * 
     */
    public Output<String> uri() {
        return this.uri;
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
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/database:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("exoscale:index/database:Database", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "uri"
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
    public static Database get(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}