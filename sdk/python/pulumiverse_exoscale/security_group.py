# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SecurityGroupArgs', 'SecurityGroup']

@pulumi.input_type
class SecurityGroupArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 external_sources: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SecurityGroup resource.
        :param pulumi.Input[str] description: A free-form text describing the group.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] external_sources: A list of external network sources, in [CIDR][cidr] notation.
        :param pulumi.Input[str] name: The security group name.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if external_sources is not None:
            pulumi.set(__self__, "external_sources", external_sources)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A free-form text describing the group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="externalSources")
    def external_sources(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of external network sources, in [CIDR][cidr] notation.
        """
        return pulumi.get(self, "external_sources")

    @external_sources.setter
    def external_sources(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "external_sources", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The security group name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SecurityGroupState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 external_sources: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SecurityGroup resources.
        :param pulumi.Input[str] description: A free-form text describing the group.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] external_sources: A list of external network sources, in [CIDR][cidr] notation.
        :param pulumi.Input[str] name: The security group name.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if external_sources is not None:
            pulumi.set(__self__, "external_sources", external_sources)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A free-form text describing the group.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="externalSources")
    def external_sources(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of external network sources, in [CIDR][cidr] notation.
        """
        return pulumi.get(self, "external_sources")

    @external_sources.setter
    def external_sources(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "external_sources", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The security group name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class SecurityGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 external_sources: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        An existing security group may be imported by `<ID>`console

        ```sh
         $ pulumi import exoscale:index/securityGroup:SecurityGroup \\
        ```

         exoscale_security_group.my_security_group \\

         f81d4fae-7dec-11d0-a765-00a0c91e6bf6

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A free-form text describing the group.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] external_sources: A list of external network sources, in [CIDR][cidr] notation.
        :param pulumi.Input[str] name: The security group name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SecurityGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        An existing security group may be imported by `<ID>`console

        ```sh
         $ pulumi import exoscale:index/securityGroup:SecurityGroup \\
        ```

         exoscale_security_group.my_security_group \\

         f81d4fae-7dec-11d0-a765-00a0c91e6bf6

        :param str resource_name: The name of the resource.
        :param SecurityGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecurityGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 external_sources: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecurityGroupArgs.__new__(SecurityGroupArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["external_sources"] = external_sources
            __props__.__dict__["name"] = name
        super(SecurityGroup, __self__).__init__(
            'exoscale:index/securityGroup:SecurityGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            external_sources: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'SecurityGroup':
        """
        Get an existing SecurityGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A free-form text describing the group.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] external_sources: A list of external network sources, in [CIDR][cidr] notation.
        :param pulumi.Input[str] name: The security group name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecurityGroupState.__new__(_SecurityGroupState)

        __props__.__dict__["description"] = description
        __props__.__dict__["external_sources"] = external_sources
        __props__.__dict__["name"] = name
        return SecurityGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A free-form text describing the group.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="externalSources")
    def external_sources(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of external network sources, in [CIDR][cidr] notation.
        """
        return pulumi.get(self, "external_sources")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The security group name.
        """
        return pulumi.get(self, "name")

