//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Session4
{
    using System;
    using System.Collections.Generic;
    
    public partial class ItemAttractions
    {
        public long ID { get; set; }
        public System.Guid GUID { get; set; }
        public long ItemID { get; set; }
        public long AttractionID { get; set; }
        public Nullable<decimal> Distance { get; set; }
        public Nullable<long> DurationOnFoot { get; set; }
        public Nullable<long> DurationByCar { get; set; }
    
        public virtual Attractions Attractions { get; set; }
        public virtual Items Items { get; set; }
    }
}
