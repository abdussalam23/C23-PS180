package com.capstone.masaala.data.model

import com.google.gson.annotations.SerializedName

data class UploadResponse(

	@field:SerializedName("result")
	val result: Result? = null,

	@field:SerializedName("image")
	val image: Image? = null
)

data class Result(

	@field:SerializedName("probability")
	val probability: Any? = null,

	@field:SerializedName("className")
	val className: String? = null
)

data class Image(

	@field:SerializedName("fieldname")
	val fieldname: String? = null,

	@field:SerializedName("path")
	val path: String? = null,

	@field:SerializedName("filename")
	val filename: String? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("originalname")
	val originalname: String? = null,

	@field:SerializedName("destination")
	val destination: String? = null,

	@field:SerializedName("mimetype")
	val mimetype: String? = null,

	@field:SerializedName("encoding")
	val encoding: String? = null
)
