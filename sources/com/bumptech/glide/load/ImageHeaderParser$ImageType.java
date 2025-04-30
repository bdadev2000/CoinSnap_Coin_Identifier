package com.bumptech.glide.load;

import N1.d;

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

    public final boolean b;

    ImageHeaderParser$ImageType(boolean z8) {
        this.b = z8;
    }

    public boolean hasAlpha() {
        return this.b;
    }

    public boolean isWebp() {
        int i9 = d.f2086a[ordinal()];
        if (i9 == 1 || i9 == 2 || i9 == 3) {
            return true;
        }
        return false;
    }
}
