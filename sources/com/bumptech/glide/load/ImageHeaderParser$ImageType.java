package com.bumptech.glide.load;

import e4.e;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f9688b;

    ImageHeaderParser$ImageType(boolean z10) {
        this.f9688b = z10;
    }

    public boolean hasAlpha() {
        return this.f9688b;
    }

    public boolean isWebp() {
        int i10 = e.a[ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }
}
