// To parse the JSON, install Klaxon and do:
//
//   val bank = Bank.fromJson(jsonString)

package br.com.stracini.guilherme.bancosbrasileiros

import com.beust.klaxon.*

private val klaxon = Klaxon()

class Bank(elements: Collection<BankElement>) : ArrayList<BankElement>(elements) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = Bank(klaxon.parseArray<BankElement>(json)!!)
    }
}

data class BankElement (
    @Json(name = "COMPE")
    val compe: String,

    @Json(name = "ISPB")
    val ispb: String,

    @Json(name = "Document")
    val document: String,

    @Json(name = "LongName")
    val longName: String,

    @Json(name = "ShortName")
    val shortName: String,

    @Json(name = "Network")
    val network: String,

    @Json(name = "Type")
    val type: String,

    @Json(name = "Url")
    val url: String? = null,

    @Json(name = "DateOperationStarted")
    val dateOperationStarted: String

    @Json(name = "DateRegistered")
    val dateRegistered: String,

    @Json(name = "DateUpdated")
    val dateUpdated: String
)
