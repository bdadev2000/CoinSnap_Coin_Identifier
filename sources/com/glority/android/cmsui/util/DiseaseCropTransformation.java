package com.glority.android.cmsui.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: DiseaseCropTransformation.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/glority/android/cmsui/util/DiseaseCropTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "rects", "", "Landroid/graphics/RectF;", "roundCornerRadius", "", "(Ljava/util/List;F)V", "equals", "", "other", "", "getAlphaSafeBitmap", "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "maybeAlphaSafe", "getAlphaSafeConfig", "Landroid/graphics/Bitmap$Config;", "inBitmap", "hashCode", "", "transform", "toTransform", "targetW", "targetH", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class DiseaseCropTransformation extends BitmapTransformation {
    private static final ReentrantLock BITMAP_DRAWABLE_LOCK;
    private static final String ID = "com.glority.android.cmsui.util.DiseaseCropTransformation";
    private static final byte[] ID_BYTES;
    private final List<RectF> rects;
    private final float roundCornerRadius;

    /* JADX WARN: Multi-variable type inference failed */
    public DiseaseCropTransformation(List<? extends RectF> rects, float f) {
        Intrinsics.checkNotNullParameter(rects, "rects");
        this.rects = rects;
        this.roundCornerRadius = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01ba A[Catch: all -> 0x027b, TryCatch #0 {all -> 0x027b, blocks: (B:28:0x0141, B:30:0x016a, B:31:0x016f, B:33:0x0177, B:34:0x017c, B:36:0x0184, B:37:0x0189, B:39:0x0191, B:40:0x0196, B:42:0x019e, B:44:0x01a6, B:46:0x01ac, B:51:0x01ba, B:62:0x01c9, B:63:0x01d7, B:65:0x01dd, B:67:0x01ff), top: B:27:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bd A[SYNTHETIC] */
    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.graphics.Bitmap transform(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r30, android.graphics.Bitmap r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.util.DiseaseCropTransformation.transform(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool, android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(ID_BYTES);
        String obj = this.rects.toString();
        Charset charset = Charsets.UTF_8;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = obj.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        messageDigest.update(ByteBuffer.allocate(4).putFloat(this.roundCornerRadius).array());
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            DiseaseCropTransformation diseaseCropTransformation = (DiseaseCropTransformation) other;
            return !(Intrinsics.areEqual(this.rects, diseaseCropTransformation.rects) ^ true) && this.roundCornerRadius == diseaseCropTransformation.roundCornerRadius;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.android.cmsui.util.DiseaseCropTransformation");
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return (this.rects.hashCode() * 31) + Float.hashCode(this.roundCornerRadius);
    }

    private final Bitmap getAlphaSafeBitmap(BitmapPool pool, Bitmap maybeAlphaSafe) {
        Bitmap.Config alphaSafeConfig = getAlphaSafeConfig(maybeAlphaSafe);
        if (alphaSafeConfig == maybeAlphaSafe.getConfig()) {
            return maybeAlphaSafe;
        }
        Bitmap bitmap = pool.get(maybeAlphaSafe.getWidth(), maybeAlphaSafe.getHeight(), alphaSafeConfig);
        Intrinsics.checkNotNullExpressionValue(bitmap, "pool[maybeAlphaSafe.widt…aSafe.height, safeConfig]");
        new Canvas(bitmap).drawBitmap(maybeAlphaSafe, 0.0f, 0.0f, (Paint) null);
        return bitmap;
    }

    private final Bitmap.Config getAlphaSafeConfig(Bitmap inBitmap) {
        if (Bitmap.Config.RGBA_F16 == inBitmap.getConfig()) {
            return Bitmap.Config.RGBA_F16;
        }
        return Bitmap.Config.ARGB_8888;
    }

    static {
        byte[] bytes = "com.glority.android.cmsui.util.DiseaseCropTransformation".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        ID_BYTES = bytes;
        BITMAP_DRAWABLE_LOCK = new ReentrantLock();
    }
}
