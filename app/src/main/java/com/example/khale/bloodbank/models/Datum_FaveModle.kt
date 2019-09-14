package com.example.khale.bloodbank.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Datum_FaveModle(@field:SerializedName("id")
                      @field:Expose
                      var id: Int, @field:SerializedName("created_at")
                      @field:Expose
                      var createdAt: Any?, @field:SerializedName("updated_at")
                      @field:Expose
                      var updatedAt: Any?, @field:SerializedName("title")
                      @field:Expose
                      var title: String?, @field:SerializedName("content")
                      @field:Expose
                      var content: String?, @field:SerializedName("thumbnail")
                      @field:Expose
                      var thumbnail: String?, @field:SerializedName("publish_date")
                      @field:Expose
                      var publishDate: String?, @field:SerializedName("category_id")
                      @field:Expose
                      var categoryId: String?, @field:SerializedName("thumbnail_full_path")
                      @field:Expose
                      var thumbnailFullPath: String?, @field:SerializedName("is_favourite")
                      @field:Expose
                      var isIsFavourite: Boolean, @field:SerializedName("pivot")
                      @field:Expose
                      var pivot: Pivot_FaveModle?)
