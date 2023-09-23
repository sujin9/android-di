package woowacourse.shopping.di.module

import com.ssu.di.module.Module
import woowacourse.shopping.data.DefaultProductRepository
import woowacourse.shopping.repository.ProductRepository

class MainActivityModule : Module {
    fun provideProductRepository(): ProductRepository = DefaultProductRepository()
}