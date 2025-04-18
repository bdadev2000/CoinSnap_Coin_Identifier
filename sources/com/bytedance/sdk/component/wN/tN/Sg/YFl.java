package com.bytedance.sdk.component.wN.tN.Sg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class YFl {
    private int AlY;
    private final int DSW;
    private final int NjR = 3840;

    /* renamed from: nc, reason: collision with root package name */
    private final int f10472nc = 104857600;
    private final ImageView.ScaleType qsH;
    private final Bitmap.Config tN;

    /* renamed from: vc, reason: collision with root package name */
    private final int f10473vc;
    private int wN;
    public static final ImageView.ScaleType YFl = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config Sg = Bitmap.Config.ARGB_4444;

    public YFl(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.tN = config;
        this.AlY = i10;
        this.wN = i11;
        this.qsH = scaleType;
        this.f10473vc = i12;
        this.DSW = i13;
        YFl(i10, i11);
    }

    public static int YFl(int i10, int i11, int i12, int i13, int i14, int i15) {
        double min = Math.min(i10 / i12, i11 / i13);
        if (i14 > 0 && i15 > 0) {
            min = Math.max(min, Math.min(Math.max(i10, i11) / Math.max(i14, i15), Math.min(i10, i11) / Math.min(i14, i15)));
        }
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > min) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int YFl(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i10 == 0 ? i12 : i10;
        }
        if (i10 == 0) {
            return (int) (i12 * (i11 / i13));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = i13 / i12;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d11 = i11;
            return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
        }
        double d12 = i11;
        return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
    }

    public Bitmap YFl(byte[] bArr) {
        Bitmap decodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.AlY == 0 && this.wN == 0) {
            options.inPreferredConfig = this.tN;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int YFl2 = YFl(this.AlY, this.wN, i10, i11, this.qsH);
            int YFl3 = YFl(this.wN, this.AlY, i11, i10, this.qsH);
            options.inJustDecodeBounds = false;
            options.inSampleSize = YFl(i10, i11, YFl2, YFl3, this.f10473vc, this.DSW);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > YFl2 || decodeByteArray.getHeight() > YFl3)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, YFl2, YFl3, true);
                if (createScaledBitmap != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray != null && decodeByteArray.getByteCount() > 104857600) {
            int width = decodeByteArray.getWidth() / 2;
            int height = decodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeByteArray, width, height, true);
                if (createScaledBitmap2 != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                return createScaledBitmap2;
            }
        }
        return decodeByteArray;
    }

    private void YFl(int i10, int i11) {
        if (i10 > 3840 && i11 > 3840) {
            if (i10 > i11) {
                this.AlY = 3840;
                this.wN = (i11 * 3840) / i10;
                return;
            } else {
                this.AlY = (i10 * 3840) / i11;
                this.wN = 3840;
                return;
            }
        }
        if (i10 > 3840) {
            this.AlY = 3840;
            this.wN = (i11 * 3840) / i10;
        } else if (i11 > 3840) {
            this.AlY = (i10 * 3840) / i11;
            this.wN = 3840;
        }
    }
}
