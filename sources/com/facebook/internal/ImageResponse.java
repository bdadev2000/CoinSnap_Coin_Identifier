package com.facebook.internal;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ImageResponse {

    @Nullable
    private final Bitmap bitmap;

    @Nullable
    private final Exception error;
    private final boolean isCachedRedirect;

    @NotNull
    private final ImageRequest request;

    public ImageResponse(@NotNull ImageRequest imageRequest, @Nullable Exception exc, boolean z2, @Nullable Bitmap bitmap) {
        p0.a.s(imageRequest, "request");
        this.request = imageRequest;
        this.error = exc;
        this.isCachedRedirect = z2;
        this.bitmap = bitmap;
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final Exception getError() {
        return this.error;
    }

    @NotNull
    public final ImageRequest getRequest() {
        return this.request;
    }

    public final boolean isCachedRedirect() {
        return this.isCachedRedirect;
    }
}
