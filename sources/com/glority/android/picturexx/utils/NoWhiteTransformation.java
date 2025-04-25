package com.glority.android.picturexx.utils;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoWhiteTransformation.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/utils/NoWhiteTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "<init>", "()V", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", "transform", "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "toTransform", "outWidth", "", "outHeight", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class NoWhiteTransformation extends BitmapTransformation {
    public static final int $stable = 0;

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        int width = toTransform.getWidth();
        for (int i = 0; i < width; i++) {
            int height = toTransform.getHeight();
            for (int i2 = 0; i2 < height; i2++) {
                int pixel = toTransform.getPixel(i, i2);
                if (-1 <= pixel && pixel < 14936309) {
                    toTransform.setPixel(i, i2, 0);
                }
            }
        }
        return toTransform;
    }
}
