package com.example.shoppingadmin.UI.Sheets.ProductModels


data class Products(
    var productDisplayImage: String,
    var productDisplayImages: List<String>,
    var productName: String,
    var productDes: String,
    var productPrice: Long,
    var productDiscountPercent: Long,
    var productSize: List<String>,
    var productColor: List<ProductColor>
)

data class ProductColor(var colorName: String?=null, var colorCode: Int?=null)