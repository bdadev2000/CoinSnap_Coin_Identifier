package com.bytedance.sdk.component.adexpress.jU;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.YW;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public class COT {
    private static void KS(ImageView imageView, byte[] bArr, int i9, int i10) {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(wrap);
            try {
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                imageView.setImageDrawable(decodeDrawable);
                return;
            } catch (IOException unused) {
                return;
            }
        }
        jU(imageView, bArr, i9, i10);
    }

    private static void jU(ImageView imageView, byte[] bArr, int i9, int i10) {
        Bitmap zp = new com.bytedance.sdk.component.COT.KS.lMd.zp(i9, i10, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i9, i10).zp(bArr);
        if (zp != null) {
            imageView.setImageBitmap(zp);
        }
    }

    private static void lMd(ImageView imageView, byte[] bArr, int i9, int i10) {
        jU(imageView, bArr, i9, i10);
    }

    public static void zp(ImageView imageView, byte[] bArr, int i9, int i10) {
        if (TextUtils.equals("png", YW.zp(Arrays.copyOfRange(bArr, 0, YW.zp())))) {
            lMd(imageView, bArr, i9, i10);
        } else {
            KS(imageView, bArr, i9, i10);
        }
    }
}
