package com.bumptech.glide.load.engine;

/* loaded from: classes7.dex */
public interface Resource<Z> {
    Z get();

    Class<Z> getResourceClass();

    int getSize();

    void recycle();
}
