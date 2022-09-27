// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * !> **WARNING:** This resource is **DEPRECATED** and will be removed in the next major version. Please use exoscale.ComputeInstance `elasticIpIds` list instead.
 */
export class SecondaryIPAddress extends pulumi.CustomResource {
    /**
     * Get an existing SecondaryIPAddress resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecondaryIPAddressState, opts?: pulumi.CustomResourceOptions): SecondaryIPAddress {
        return new SecondaryIPAddress(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'exoscale:index/secondaryIPAddress:SecondaryIPAddress';

    /**
     * Returns true if the given object is an instance of SecondaryIPAddress.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecondaryIPAddress {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecondaryIPAddress.__pulumiType;
    }

    /**
     * The compute instance ID.
     */
    public readonly computeId!: pulumi.Output<string>;
    /**
     * The Elastic IP (EIP) address.
     */
    public readonly ipAddress!: pulumi.Output<string>;
    /**
     * The network (ID) the compute instance NIC is attached to.
     */
    public /*out*/ readonly networkId!: pulumi.Output<string>;
    /**
     * The network interface (NIC) ID.
     */
    public /*out*/ readonly nicId!: pulumi.Output<string>;

    /**
     * Create a SecondaryIPAddress resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecondaryIPAddressArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecondaryIPAddressArgs | SecondaryIPAddressState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecondaryIPAddressState | undefined;
            resourceInputs["computeId"] = state ? state.computeId : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["nicId"] = state ? state.nicId : undefined;
        } else {
            const args = argsOrState as SecondaryIPAddressArgs | undefined;
            if ((!args || args.computeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'computeId'");
            }
            if ((!args || args.ipAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipAddress'");
            }
            resourceInputs["computeId"] = args ? args.computeId : undefined;
            resourceInputs["ipAddress"] = args ? args.ipAddress : undefined;
            resourceInputs["networkId"] = undefined /*out*/;
            resourceInputs["nicId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecondaryIPAddress.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecondaryIPAddress resources.
 */
export interface SecondaryIPAddressState {
    /**
     * The compute instance ID.
     */
    computeId?: pulumi.Input<string>;
    /**
     * The Elastic IP (EIP) address.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The network (ID) the compute instance NIC is attached to.
     */
    networkId?: pulumi.Input<string>;
    /**
     * The network interface (NIC) ID.
     */
    nicId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecondaryIPAddress resource.
 */
export interface SecondaryIPAddressArgs {
    /**
     * The compute instance ID.
     */
    computeId: pulumi.Input<string>;
    /**
     * The Elastic IP (EIP) address.
     */
    ipAddress: pulumi.Input<string>;
}
