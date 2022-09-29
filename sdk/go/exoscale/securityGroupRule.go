// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package exoscale

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manage Exoscale [Security Group](https://community.exoscale.com/documentation/compute/security-groups/) Rules.
//
// ## Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumiverse/pulumi-exoscale/sdk/go/exoscale"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			mySecurityGroup, err := exoscale.NewSecurityGroup(ctx, "mySecurityGroup", nil)
//			if err != nil {
//				return err
//			}
//			_, err = exoscale.NewSecurityGroupRule(ctx, "mySecurityGroupRule", &exoscale.SecurityGroupRuleArgs{
//				SecurityGroupId: mySecurityGroup.ID(),
//				Type:            pulumi.String("INGRESS"),
//				Protocol:        pulumi.String("TCP"),
//				Cidr:            pulumi.String("0.0.0.0/0"),
//				StartPort:       pulumi.Int(80),
//				EndPort:         pulumi.Int(80),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// An existing security group rule may be imported by `<security-group-ID>/<security-group-rule-ID>`console
//
// ```sh
//
//	$ pulumi import exoscale:index/securityGroupRule:SecurityGroupRule \
//
// ```
//
//	exoscale_security_group_rule.my_security_group_rule \
//
//	f81d4fae-7dec-11d0-a765-00a0c91e6bf6/9ecc6b8b-73d4-4211-8ced-f7f29bb79524
type SecurityGroupRule struct {
	pulumi.CustomResourceState

	// An (`INGRESS`) source / (`EGRESS`) destination IP subnet (in [CIDR notation][cidr]) to match (conflicts with `userSecurityGroup`/`userSecurityGroupId`).
	// * `startPort`/`endPort` - A `TCP`/`UDP` port range to match.
	// * `icmpType`/`icmpCode` - An ICMP/ICMPv6 [type/code][icmp] to match.
	Cidr pulumi.StringPtrOutput `pulumi:"cidr"`
	// A free-form text describing the security group rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	EndPort     pulumi.IntPtrOutput    `pulumi:"endPort"`
	IcmpCode    pulumi.IntPtrOutput    `pulumi:"icmpCode"`
	IcmpType    pulumi.IntPtrOutput    `pulumi:"icmpType"`
	// The network protocol to match (`TCP`, `UDP`, `ICMP`, `ICMPv6`, `AH`, `ESP`, `GRE`, `IPIP` or `ALL`)
	Protocol pulumi.StringPtrOutput `pulumi:"protocol"`
	// The parent security group name. Please use the `securityGroupId` argument along the SecurityGroup data source instead.
	SecurityGroup pulumi.StringOutput `pulumi:"securityGroup"`
	// The parent SecurityGroup ID.
	SecurityGroupId pulumi.StringOutput `pulumi:"securityGroupId"`
	StartPort       pulumi.IntPtrOutput `pulumi:"startPort"`
	// The traffic direction to match (`INGRESS` or `EGRESS`).
	Type pulumi.StringOutput `pulumi:"type"`
	// An (`INGRESS`) source / (`EGRESS`) destination security group name to match (conflicts with `cidr`/`userSecurityGroupId`). Please use the `userSecurityGroupId` argument along the SecurityGroup data source instead.
	UserSecurityGroup pulumi.StringOutput `pulumi:"userSecurityGroup"`
	// An (`INGRESS`) source / (`EGRESS`) destination security group ID to match (conflicts with `cidr`/`user_security_group)`).
	UserSecurityGroupId pulumi.StringPtrOutput `pulumi:"userSecurityGroupId"`
}

// NewSecurityGroupRule registers a new resource with the given unique name, arguments, and options.
func NewSecurityGroupRule(ctx *pulumi.Context,
	name string, args *SecurityGroupRuleArgs, opts ...pulumi.ResourceOption) (*SecurityGroupRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource SecurityGroupRule
	err := ctx.RegisterResource("exoscale:index/securityGroupRule:SecurityGroupRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecurityGroupRule gets an existing SecurityGroupRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecurityGroupRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecurityGroupRuleState, opts ...pulumi.ResourceOption) (*SecurityGroupRule, error) {
	var resource SecurityGroupRule
	err := ctx.ReadResource("exoscale:index/securityGroupRule:SecurityGroupRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecurityGroupRule resources.
type securityGroupRuleState struct {
	// An (`INGRESS`) source / (`EGRESS`) destination IP subnet (in [CIDR notation][cidr]) to match (conflicts with `userSecurityGroup`/`userSecurityGroupId`).
	// * `startPort`/`endPort` - A `TCP`/`UDP` port range to match.
	// * `icmpType`/`icmpCode` - An ICMP/ICMPv6 [type/code][icmp] to match.
	Cidr *string `pulumi:"cidr"`
	// A free-form text describing the security group rule.
	Description *string `pulumi:"description"`
	EndPort     *int    `pulumi:"endPort"`
	IcmpCode    *int    `pulumi:"icmpCode"`
	IcmpType    *int    `pulumi:"icmpType"`
	// The network protocol to match (`TCP`, `UDP`, `ICMP`, `ICMPv6`, `AH`, `ESP`, `GRE`, `IPIP` or `ALL`)
	Protocol *string `pulumi:"protocol"`
	// The parent security group name. Please use the `securityGroupId` argument along the SecurityGroup data source instead.
	SecurityGroup *string `pulumi:"securityGroup"`
	// The parent SecurityGroup ID.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	StartPort       *int    `pulumi:"startPort"`
	// The traffic direction to match (`INGRESS` or `EGRESS`).
	Type *string `pulumi:"type"`
	// An (`INGRESS`) source / (`EGRESS`) destination security group name to match (conflicts with `cidr`/`userSecurityGroupId`). Please use the `userSecurityGroupId` argument along the SecurityGroup data source instead.
	UserSecurityGroup *string `pulumi:"userSecurityGroup"`
	// An (`INGRESS`) source / (`EGRESS`) destination security group ID to match (conflicts with `cidr`/`user_security_group)`).
	UserSecurityGroupId *string `pulumi:"userSecurityGroupId"`
}

type SecurityGroupRuleState struct {
	// An (`INGRESS`) source / (`EGRESS`) destination IP subnet (in [CIDR notation][cidr]) to match (conflicts with `userSecurityGroup`/`userSecurityGroupId`).
	// * `startPort`/`endPort` - A `TCP`/`UDP` port range to match.
	// * `icmpType`/`icmpCode` - An ICMP/ICMPv6 [type/code][icmp] to match.
	Cidr pulumi.StringPtrInput
	// A free-form text describing the security group rule.
	Description pulumi.StringPtrInput
	EndPort     pulumi.IntPtrInput
	IcmpCode    pulumi.IntPtrInput
	IcmpType    pulumi.IntPtrInput
	// The network protocol to match (`TCP`, `UDP`, `ICMP`, `ICMPv6`, `AH`, `ESP`, `GRE`, `IPIP` or `ALL`)
	Protocol pulumi.StringPtrInput
	// The parent security group name. Please use the `securityGroupId` argument along the SecurityGroup data source instead.
	SecurityGroup pulumi.StringPtrInput
	// The parent SecurityGroup ID.
	SecurityGroupId pulumi.StringPtrInput
	StartPort       pulumi.IntPtrInput
	// The traffic direction to match (`INGRESS` or `EGRESS`).
	Type pulumi.StringPtrInput
	// An (`INGRESS`) source / (`EGRESS`) destination security group name to match (conflicts with `cidr`/`userSecurityGroupId`). Please use the `userSecurityGroupId` argument along the SecurityGroup data source instead.
	UserSecurityGroup pulumi.StringPtrInput
	// An (`INGRESS`) source / (`EGRESS`) destination security group ID to match (conflicts with `cidr`/`user_security_group)`).
	UserSecurityGroupId pulumi.StringPtrInput
}

func (SecurityGroupRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*securityGroupRuleState)(nil)).Elem()
}

type securityGroupRuleArgs struct {
	// An (`INGRESS`) source / (`EGRESS`) destination IP subnet (in [CIDR notation][cidr]) to match (conflicts with `userSecurityGroup`/`userSecurityGroupId`).
	// * `startPort`/`endPort` - A `TCP`/`UDP` port range to match.
	// * `icmpType`/`icmpCode` - An ICMP/ICMPv6 [type/code][icmp] to match.
	Cidr *string `pulumi:"cidr"`
	// A free-form text describing the security group rule.
	Description *string `pulumi:"description"`
	EndPort     *int    `pulumi:"endPort"`
	IcmpCode    *int    `pulumi:"icmpCode"`
	IcmpType    *int    `pulumi:"icmpType"`
	// The network protocol to match (`TCP`, `UDP`, `ICMP`, `ICMPv6`, `AH`, `ESP`, `GRE`, `IPIP` or `ALL`)
	Protocol *string `pulumi:"protocol"`
	// The parent security group name. Please use the `securityGroupId` argument along the SecurityGroup data source instead.
	SecurityGroup *string `pulumi:"securityGroup"`
	// The parent SecurityGroup ID.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	StartPort       *int    `pulumi:"startPort"`
	// The traffic direction to match (`INGRESS` or `EGRESS`).
	Type string `pulumi:"type"`
	// An (`INGRESS`) source / (`EGRESS`) destination security group name to match (conflicts with `cidr`/`userSecurityGroupId`). Please use the `userSecurityGroupId` argument along the SecurityGroup data source instead.
	UserSecurityGroup *string `pulumi:"userSecurityGroup"`
	// An (`INGRESS`) source / (`EGRESS`) destination security group ID to match (conflicts with `cidr`/`user_security_group)`).
	UserSecurityGroupId *string `pulumi:"userSecurityGroupId"`
}

// The set of arguments for constructing a SecurityGroupRule resource.
type SecurityGroupRuleArgs struct {
	// An (`INGRESS`) source / (`EGRESS`) destination IP subnet (in [CIDR notation][cidr]) to match (conflicts with `userSecurityGroup`/`userSecurityGroupId`).
	// * `startPort`/`endPort` - A `TCP`/`UDP` port range to match.
	// * `icmpType`/`icmpCode` - An ICMP/ICMPv6 [type/code][icmp] to match.
	Cidr pulumi.StringPtrInput
	// A free-form text describing the security group rule.
	Description pulumi.StringPtrInput
	EndPort     pulumi.IntPtrInput
	IcmpCode    pulumi.IntPtrInput
	IcmpType    pulumi.IntPtrInput
	// The network protocol to match (`TCP`, `UDP`, `ICMP`, `ICMPv6`, `AH`, `ESP`, `GRE`, `IPIP` or `ALL`)
	Protocol pulumi.StringPtrInput
	// The parent security group name. Please use the `securityGroupId` argument along the SecurityGroup data source instead.
	SecurityGroup pulumi.StringPtrInput
	// The parent SecurityGroup ID.
	SecurityGroupId pulumi.StringPtrInput
	StartPort       pulumi.IntPtrInput
	// The traffic direction to match (`INGRESS` or `EGRESS`).
	Type pulumi.StringInput
	// An (`INGRESS`) source / (`EGRESS`) destination security group name to match (conflicts with `cidr`/`userSecurityGroupId`). Please use the `userSecurityGroupId` argument along the SecurityGroup data source instead.
	UserSecurityGroup pulumi.StringPtrInput
	// An (`INGRESS`) source / (`EGRESS`) destination security group ID to match (conflicts with `cidr`/`user_security_group)`).
	UserSecurityGroupId pulumi.StringPtrInput
}

func (SecurityGroupRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*securityGroupRuleArgs)(nil)).Elem()
}

type SecurityGroupRuleInput interface {
	pulumi.Input

	ToSecurityGroupRuleOutput() SecurityGroupRuleOutput
	ToSecurityGroupRuleOutputWithContext(ctx context.Context) SecurityGroupRuleOutput
}

func (*SecurityGroupRule) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityGroupRule)(nil)).Elem()
}

func (i *SecurityGroupRule) ToSecurityGroupRuleOutput() SecurityGroupRuleOutput {
	return i.ToSecurityGroupRuleOutputWithContext(context.Background())
}

func (i *SecurityGroupRule) ToSecurityGroupRuleOutputWithContext(ctx context.Context) SecurityGroupRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityGroupRuleOutput)
}

// SecurityGroupRuleArrayInput is an input type that accepts SecurityGroupRuleArray and SecurityGroupRuleArrayOutput values.
// You can construct a concrete instance of `SecurityGroupRuleArrayInput` via:
//
//	SecurityGroupRuleArray{ SecurityGroupRuleArgs{...} }
type SecurityGroupRuleArrayInput interface {
	pulumi.Input

	ToSecurityGroupRuleArrayOutput() SecurityGroupRuleArrayOutput
	ToSecurityGroupRuleArrayOutputWithContext(context.Context) SecurityGroupRuleArrayOutput
}

type SecurityGroupRuleArray []SecurityGroupRuleInput

func (SecurityGroupRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityGroupRule)(nil)).Elem()
}

func (i SecurityGroupRuleArray) ToSecurityGroupRuleArrayOutput() SecurityGroupRuleArrayOutput {
	return i.ToSecurityGroupRuleArrayOutputWithContext(context.Background())
}

func (i SecurityGroupRuleArray) ToSecurityGroupRuleArrayOutputWithContext(ctx context.Context) SecurityGroupRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityGroupRuleArrayOutput)
}

// SecurityGroupRuleMapInput is an input type that accepts SecurityGroupRuleMap and SecurityGroupRuleMapOutput values.
// You can construct a concrete instance of `SecurityGroupRuleMapInput` via:
//
//	SecurityGroupRuleMap{ "key": SecurityGroupRuleArgs{...} }
type SecurityGroupRuleMapInput interface {
	pulumi.Input

	ToSecurityGroupRuleMapOutput() SecurityGroupRuleMapOutput
	ToSecurityGroupRuleMapOutputWithContext(context.Context) SecurityGroupRuleMapOutput
}

type SecurityGroupRuleMap map[string]SecurityGroupRuleInput

func (SecurityGroupRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityGroupRule)(nil)).Elem()
}

func (i SecurityGroupRuleMap) ToSecurityGroupRuleMapOutput() SecurityGroupRuleMapOutput {
	return i.ToSecurityGroupRuleMapOutputWithContext(context.Background())
}

func (i SecurityGroupRuleMap) ToSecurityGroupRuleMapOutputWithContext(ctx context.Context) SecurityGroupRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityGroupRuleMapOutput)
}

type SecurityGroupRuleOutput struct{ *pulumi.OutputState }

func (SecurityGroupRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityGroupRule)(nil)).Elem()
}

func (o SecurityGroupRuleOutput) ToSecurityGroupRuleOutput() SecurityGroupRuleOutput {
	return o
}

func (o SecurityGroupRuleOutput) ToSecurityGroupRuleOutputWithContext(ctx context.Context) SecurityGroupRuleOutput {
	return o
}

// An (`INGRESS`) source / (`EGRESS`) destination IP subnet (in [CIDR notation][cidr]) to match (conflicts with `userSecurityGroup`/`userSecurityGroupId`).
// * `startPort`/`endPort` - A `TCP`/`UDP` port range to match.
// * `icmpType`/`icmpCode` - An ICMP/ICMPv6 [type/code][icmp] to match.
func (o SecurityGroupRuleOutput) Cidr() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.Cidr }).(pulumi.StringPtrOutput)
}

// A free-form text describing the security group rule.
func (o SecurityGroupRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o SecurityGroupRuleOutput) EndPort() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.IntPtrOutput { return v.EndPort }).(pulumi.IntPtrOutput)
}

func (o SecurityGroupRuleOutput) IcmpCode() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.IntPtrOutput { return v.IcmpCode }).(pulumi.IntPtrOutput)
}

func (o SecurityGroupRuleOutput) IcmpType() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.IntPtrOutput { return v.IcmpType }).(pulumi.IntPtrOutput)
}

// The network protocol to match (`TCP`, `UDP`, `ICMP`, `ICMPv6`, `AH`, `ESP`, `GRE`, `IPIP` or `ALL`)
func (o SecurityGroupRuleOutput) Protocol() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.Protocol }).(pulumi.StringPtrOutput)
}

// The parent security group name. Please use the `securityGroupId` argument along the SecurityGroup data source instead.
func (o SecurityGroupRuleOutput) SecurityGroup() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringOutput { return v.SecurityGroup }).(pulumi.StringOutput)
}

// The parent SecurityGroup ID.
func (o SecurityGroupRuleOutput) SecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringOutput { return v.SecurityGroupId }).(pulumi.StringOutput)
}

func (o SecurityGroupRuleOutput) StartPort() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.IntPtrOutput { return v.StartPort }).(pulumi.IntPtrOutput)
}

// The traffic direction to match (`INGRESS` or `EGRESS`).
func (o SecurityGroupRuleOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// An (`INGRESS`) source / (`EGRESS`) destination security group name to match (conflicts with `cidr`/`userSecurityGroupId`). Please use the `userSecurityGroupId` argument along the SecurityGroup data source instead.
func (o SecurityGroupRuleOutput) UserSecurityGroup() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringOutput { return v.UserSecurityGroup }).(pulumi.StringOutput)
}

// An (`INGRESS`) source / (`EGRESS`) destination security group ID to match (conflicts with `cidr`/`user_security_group)`).
func (o SecurityGroupRuleOutput) UserSecurityGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.UserSecurityGroupId }).(pulumi.StringPtrOutput)
}

type SecurityGroupRuleArrayOutput struct{ *pulumi.OutputState }

func (SecurityGroupRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityGroupRule)(nil)).Elem()
}

func (o SecurityGroupRuleArrayOutput) ToSecurityGroupRuleArrayOutput() SecurityGroupRuleArrayOutput {
	return o
}

func (o SecurityGroupRuleArrayOutput) ToSecurityGroupRuleArrayOutputWithContext(ctx context.Context) SecurityGroupRuleArrayOutput {
	return o
}

func (o SecurityGroupRuleArrayOutput) Index(i pulumi.IntInput) SecurityGroupRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecurityGroupRule {
		return vs[0].([]*SecurityGroupRule)[vs[1].(int)]
	}).(SecurityGroupRuleOutput)
}

type SecurityGroupRuleMapOutput struct{ *pulumi.OutputState }

func (SecurityGroupRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityGroupRule)(nil)).Elem()
}

func (o SecurityGroupRuleMapOutput) ToSecurityGroupRuleMapOutput() SecurityGroupRuleMapOutput {
	return o
}

func (o SecurityGroupRuleMapOutput) ToSecurityGroupRuleMapOutputWithContext(ctx context.Context) SecurityGroupRuleMapOutput {
	return o
}

func (o SecurityGroupRuleMapOutput) MapIndex(k pulumi.StringInput) SecurityGroupRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecurityGroupRule {
		return vs[0].(map[string]*SecurityGroupRule)[vs[1].(string)]
	}).(SecurityGroupRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityGroupRuleInput)(nil)).Elem(), &SecurityGroupRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityGroupRuleArrayInput)(nil)).Elem(), SecurityGroupRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityGroupRuleMapInput)(nil)).Elem(), SecurityGroupRuleMap{})
	pulumi.RegisterOutputType(SecurityGroupRuleOutput{})
	pulumi.RegisterOutputType(SecurityGroupRuleArrayOutput{})
	pulumi.RegisterOutputType(SecurityGroupRuleMapOutput{})
}
