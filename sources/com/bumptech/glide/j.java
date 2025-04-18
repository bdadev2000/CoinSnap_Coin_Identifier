package com.bumptech.glide;

import java.util.List;

/* loaded from: classes.dex */
public final class j extends i {
    public j(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public j(Object obj, List list) {
        super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }

    public j(Class cls, Class cls2) {
        super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Class cls, int i10) {
        super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        if (i10 != 3) {
            return;
        }
        super("Failed to find source encoder for data class: " + cls);
    }

    public j() {
        super("Failed to find image header parser.");
    }
}
