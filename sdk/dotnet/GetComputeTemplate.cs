// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Exoscale
{
    public static class GetComputeTemplate
    {
        public static Task<GetComputeTemplateResult> InvokeAsync(GetComputeTemplateArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetComputeTemplateResult>("exoscale:index/getComputeTemplate:getComputeTemplate", args ?? new GetComputeTemplateArgs(), options.WithDefaults());

        public static Output<GetComputeTemplateResult> Invoke(GetComputeTemplateInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetComputeTemplateResult>("exoscale:index/getComputeTemplate:getComputeTemplate", args ?? new GetComputeTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetComputeTemplateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A template category filter (default: `featured`); among:
        /// </summary>
        [Input("filter")]
        public string? Filter { get; set; }

        /// <summary>
        /// The compute instance template ID to match (conflicts with `name`).
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The template name to match (conflicts with `id`).
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The Exoscale [Zone][zone] name.
        /// </summary>
        [Input("zone", required: true)]
        public string Zone { get; set; } = null!;

        public GetComputeTemplateArgs()
        {
        }
        public static new GetComputeTemplateArgs Empty => new GetComputeTemplateArgs();
    }

    public sealed class GetComputeTemplateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A template category filter (default: `featured`); among:
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// The compute instance template ID to match (conflicts with `name`).
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The template name to match (conflicts with `id`).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Exoscale [Zone][zone] name.
        /// </summary>
        [Input("zone", required: true)]
        public Input<string> Zone { get; set; } = null!;

        public GetComputeTemplateInvokeArgs()
        {
        }
        public static new GetComputeTemplateInvokeArgs Empty => new GetComputeTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetComputeTemplateResult
    {
        public readonly string? Filter;
        public readonly string? Id;
        public readonly string? Name;
        /// <summary>
        /// Username to use to log into a compute instance based on this template
        /// </summary>
        public readonly string Username;
        public readonly string Zone;

        [OutputConstructor]
        private GetComputeTemplateResult(
            string? filter,

            string? id,

            string? name,

            string username,

            string zone)
        {
            Filter = filter;
            Id = id;
            Name = name;
            Username = username;
            Zone = zone;
        }
    }
}
