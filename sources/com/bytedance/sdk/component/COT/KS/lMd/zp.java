package com.bytedance.sdk.component.COT.KS.lMd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class zp {
    private int COT;
    private final int HWF;
    private final Bitmap.Config KS;
    private final int QR;
    private final int YW = 3840;
    private final int dT = 104857600;
    private int jU;
    private final ImageView.ScaleType ku;
    public static final ImageView.ScaleType zp = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config lMd = Bitmap.Config.ARGB_4444;

    public zp(int i9, int i10, ImageView.ScaleType scaleType, Bitmap.Config config, int i11, int i12) {
        this.KS = config;
        this.jU = i9;
        this.COT = i10;
        this.ku = scaleType;
        this.HWF = i11;
        this.QR = i12;
        zp(i9, i10);
    }

    public static int zp(int i9, int i10, int i11, int i12, int i13, int i14) {
        double min = Math.min(i9 / i11, i10 / i12);
        if (i13 > 0 && i14 > 0) {
            min = Math.max(min, Math.min(Math.max(i9, i10) / Math.max(i13, i14), Math.min(i9, i10) / Math.min(i13, i14)));
        }
        float f9 = 1.0f;
        while (true) {
            float f10 = 2.0f * f9;
            if (f10 > min) {
                return (int) f9;
            }
            f9 = f10;
        }
    }

    private static int zp(int i9, int i10, int i11, int i12, ImageView.ScaleType scaleType) {
        if (i9 == 0 && i10 == 0) {
            return i11;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i9 == 0 ? i11 : i9;
        }
        if (i9 == 0) {
            return (int) (i11 * (i10 / i12));
        }
        if (i10 == 0) {
            return i9;
        }
        double d2 = i12 / i11;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d9 = i10;
            return ((double) i9) * d2 < d9 ? (int) (d9 / d2) : i9;
        }
        double d10 = i10;
        return ((double) i9) * d2 > d10 ? (int) (d10 / d2) : i9;
    }

    public Bitmap zp(byte[] bArr) {
        Bitmap decodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.jU == 0 && this.COT == 0) {
            options.inPreferredConfig = this.KS;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i9 = options.outWidth;
            int i10 = options.outHeight;
            int zp2 = zp(this.jU, this.COT, i9, i10, this.ku);
            int zp3 = zp(this.COT, this.jU, i10, i9, this.ku);
            options.inJustDecodeBounds = false;
            options.inSampleSize = zp(i9, i10, zp2, zp3, this.HWF, this.QR);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > zp2 || decodeByteArray.getHeight() > zp3)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, zp2, zp3, true);
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

    private void zp(int i9, int i10) {
        if (i9 > 3840 && i10 > 3840) {
            if (i9 > i10) {
                this.jU = 3840;
                this.COT = (i10 * 3840) / i9;
                return;
            } else {
                this.jU = (i9 * 3840) / i10;
                this.COT = 3840;
                return;
            }
        }
        if (i9 > 3840) {
            this.jU = 3840;
            this.COT = (i10 * 3840) / i9;
        } else if (i10 > 3840) {
            this.jU = (i9 * 3840) / i10;
            this.COT = 3840;
        }
    }
}
