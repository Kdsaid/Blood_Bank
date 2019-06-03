package com.example.khale.bloodbank.models


class ImageModel {

    private var image_drawable: Int = 0

    fun getImage_drawables(): Int {
        return image_drawable
    }

    fun setImage_drawables(image_drawable: Int) {
        this.image_drawable = image_drawable
    }
}