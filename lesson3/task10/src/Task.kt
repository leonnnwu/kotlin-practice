// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProducts = this.customers.flatMap { it.orders.flatMap { it.products } }.toSet()

    return this.customers.fold(allProducts, {
        orderedByAll, customer ->
        orderedByAll.intersect(customer.orders.flatMap { it.products })
    })
}