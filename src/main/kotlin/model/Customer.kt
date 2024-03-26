package ro.etataru.storemgmt.model

import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id: String, val firstname: String, val lastName: String, val email: String) {
}

val customerStorage = mutableListOf<Customer>()