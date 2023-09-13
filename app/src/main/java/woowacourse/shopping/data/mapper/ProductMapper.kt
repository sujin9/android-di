package woowacourse.shopping.data.mapper

import woowacourse.shopping.data.CartProductEntity
import woowacourse.shopping.model.CartProduct
import woowacourse.shopping.model.Product

fun Product.toEntity(): CartProductEntity {
    return CartProductEntity(
        name = name,
        price = price,
        imageUrl = imageUrl,
    )
}

fun Product.toCartProduct(id: Long): CartProduct {
    return CartProduct(
        id = id,
        name = name,
        price = price,
        imageUrl = imageUrl,
        createdAt = System.currentTimeMillis(),
    )
}
