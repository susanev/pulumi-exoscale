// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * An existing DNS domain may be imported by `<name>`console
 *
 * ```sh
 *  $ pulumi import exoscale:index/domain:Domain \
 * ```
 *
 *  exoscale_domain.my_domain \
 *
 *  my.domain
 */
export class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState, opts?: pulumi.CustomResourceOptions): Domain {
        return new Domain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'exoscale:index/domain:Domain';

    /**
     * Returns true if the given object is an instance of Domain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Domain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Domain.__pulumiType;
    }

    /**
     * Whether the DNS domain has automatic renewal enabled (boolean).
     *
     * @deprecated Not used, will be removed in the future
     */
    public /*out*/ readonly autoRenew!: pulumi.Output<boolean>;
    /**
     * The domain expiration date, if known.
     *
     * @deprecated Not used, will be removed in the future
     */
    public /*out*/ readonly expiresOn!: pulumi.Output<string>;
    /**
     * The DNS domain name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The domain state.
     *
     * @deprecated Not used, will be removed in the future
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * A security token that can be used as an alternative way to manage DNS domains via the Exoscale API.
     *
     * @deprecated Not used, will be removed in the future
     */
    public /*out*/ readonly token!: pulumi.Output<string>;

    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainArgs | DomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainState | undefined;
            resourceInputs["autoRenew"] = state ? state.autoRenew : undefined;
            resourceInputs["expiresOn"] = state ? state.expiresOn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["token"] = state ? state.token : undefined;
        } else {
            const args = argsOrState as DomainArgs | undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["autoRenew"] = undefined /*out*/;
            resourceInputs["expiresOn"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["token"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Domain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * Whether the DNS domain has automatic renewal enabled (boolean).
     *
     * @deprecated Not used, will be removed in the future
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The domain expiration date, if known.
     *
     * @deprecated Not used, will be removed in the future
     */
    expiresOn?: pulumi.Input<string>;
    /**
     * The DNS domain name.
     */
    name?: pulumi.Input<string>;
    /**
     * The domain state.
     *
     * @deprecated Not used, will be removed in the future
     */
    state?: pulumi.Input<string>;
    /**
     * A security token that can be used as an alternative way to manage DNS domains via the Exoscale API.
     *
     * @deprecated Not used, will be removed in the future
     */
    token?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * The DNS domain name.
     */
    name?: pulumi.Input<string>;
}
