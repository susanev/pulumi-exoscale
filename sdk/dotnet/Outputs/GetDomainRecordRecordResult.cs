// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Exoscale.Outputs
{

    [OutputType]
    public sealed class GetDomainRecordRecordResult
    {
        /// <summary>
        /// The domain record content.
        /// </summary>
        public readonly string? Content;
        /// <summary>
        /// The exoscale.Domain name to match.
        /// </summary>
        public readonly string? Domain;
        /// <summary>
        /// The record ID to match.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The domain record name to match.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The record priority.
        /// </summary>
        public readonly int? Prio;
        /// <summary>
        /// The record type to match.
        /// </summary>
        public readonly string? RecordType;
        /// <summary>
        /// The record TTL.
        /// </summary>
        public readonly int? Ttl;

        [OutputConstructor]
        private GetDomainRecordRecordResult(
            string? content,

            string? domain,

            string? id,

            string? name,

            int? prio,

            string? recordType,

            int? ttl)
        {
            Content = content;
            Domain = domain;
            Id = id;
            Name = name;
            Prio = prio;
            RecordType = recordType;
            Ttl = ttl;
        }
    }
}
