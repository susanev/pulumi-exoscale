// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getSecurityGroup(args?: GetSecurityGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetSecurityGroupResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("exoscale:index/getSecurityGroup:getSecurityGroup", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecurityGroup.
 */
export interface GetSecurityGroupArgs {
    /**
     * The security group ID to match (conflicts with `name`)
     */
    id?: string;
    /**
     * The name to match (conflicts with `id`)
     */
    name?: string;
}

/**
 * A collection of values returned by getSecurityGroup.
 */
export interface GetSecurityGroupResult {
    readonly id?: string;
    readonly name?: string;
}

export function getSecurityGroupOutput(args?: GetSecurityGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecurityGroupResult> {
    return pulumi.output(args).apply(a => getSecurityGroup(a, opts))
}

/**
 * A collection of arguments for invoking getSecurityGroup.
 */
export interface GetSecurityGroupOutputArgs {
    /**
     * The security group ID to match (conflicts with `name`)
     */
    id?: pulumi.Input<string>;
    /**
     * The name to match (conflicts with `id`)
     */
    name?: pulumi.Input<string>;
}
