namespace BancosBrasileiros
{
    using System;
    using Newtonsoft.Json;

    public class Bank
    {
        [JsonProperty("COMPE")]
        public string Compe { get; set; }

        [JsonProperty("ISPB")]
        public string Ispb { get; set; }

        [JsonProperty("Document")]
        public string Document { get; set; }

        [JsonProperty("LongName")]
        public string LongName { get; set; }

        [JsonProperty("ShortName")]
        public string ShortName { get; set; }

        [JsonProperty("Network")]
        public string Network { get; set;}

        [JsonProperty("Type")]
        public string Type { get; set;}

        [JsonProperty("Url")]
        public string Url { get; set; }

        [JsonProperty("DateOperationStarted")]
        public string DateOperationStarted { get; set;}

        [JsonProperty("DateRegistered")]
        public DateTimeOffset DateRegistered { get; set; }

        [JsonProperty("DateUpdated")]
        public DateTimeOffset DateUpdated { get; set; }
    }
}
