package woowacourse.shopping.data.mapper

import woowacourse.shopping.data.CartProductEntity
import woowacourse.shopping.model.CartProduct

fun CartProductEntity.toDomain(): CartProduct {
    return CartProduct(
        name = name,
        price = price,
        imageUrl = imageUrl,
        createdAt = createdAt,
    )
}