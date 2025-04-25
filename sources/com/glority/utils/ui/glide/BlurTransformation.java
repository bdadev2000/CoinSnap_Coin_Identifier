package com.glority.utils.ui.glide;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.glority.utils.UtilsApp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class BlurTransformation extends BitmapTransformation {
    private static final int DEFAULT_DOWN_SAMPLING = 1;
    private static final int MAX_RADIUS = 25;
    private final int radius;
    private final int sampling;
    private static final ReentrantLock BITMAP_DRAWABLE_LOCK = new ReentrantLock();
    private static final String ID = "com.glority.utils.ui.glide.BlurTransformation";
    private static final byte[] ID_BYTES = ID.getBytes(CHARSET);

    public BlurTransformation() {
        this.radius = 25;
        this.sampling = 1;
    }

    public BlurTransformation(int i, int i2) {
        this.radius = i;
        this.sampling = i2;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = this.sampling;
        int i4 = width / i3;
        int i5 = height / i3;
        Bitmap.Config alphaSafeConfig = getAlphaSafeConfig(bitmap);
        Bitmap alphaSafeBitmap = getAlphaSafeBitmap(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(i4, i5, alphaSafeConfig);
        bitmap2.setHasAlpha(true);
        ReentrantLock reentrantLock = BITMAP_DRAWABLE_LOCK;
        reentrantLock.lock();
        RenderScript create = RenderScript.create(UtilsApp.getApp());
        try {
            Canvas canvas = new Canvas(bitmap2);
            float f = 1.0f / this.sampling;
            canvas.scale(f, f);
            canvas.drawBitmap(alphaSafeBitmap, 0.0f, 0.0f, new Paint(6));
            create.setMessageHandler(new RenderScript.RSMessageHandler());
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap2, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setInput(createFromBitmap);
            create2.setRadius(this.radius);
            create2.forEach(createTyped);
            createTyped.copyTo(bitmap2);
            create.destroy();
            reentrantLock.unlock();
            return bitmap2;
        } catch (Throwable th) {
            create.destroy();
            BITMAP_DRAWABLE_LOCK.unlock();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.radius).array());
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.sampling).array());
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BlurTransformation blurTransformation = (BlurTransformation) obj;
        return this.radius == blurTransformation.radius && this.sampling == blurTransformation.sampling;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return 1537990849 + (this.radius * 1000) + (this.sampling * 10);
    }

    private Bitmap getAlphaSafeBitmap(BitmapPool bitmapPool, Bitmap bitmap) {
        Bitmap.Config alphaSafeConfig = getAlphaSafeConfig(bitmap);
        if (alphaSafeConfig == bitmap.getConfig()) {
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), alphaSafeConfig);
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmap2;
    }

    private Bitmap.Config getAlphaSafeConfig(Bitmap bitmap) {
        if (Bitmap.Config.RGBA_F16 == bitmap.getConfig()) {
            return Bitmap.Config.RGBA_F16;
        }
        return Bitmap.Config.ARGB_8888;
    }
}
