package com.bytedance.sdk.component.adexpress.AlY;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public class vc {
    private static final byte[] YFl = YFl("VP8X");

    private static void AlY(ImageView imageView, byte[] bArr, int i10, int i11) {
        Bitmap YFl2 = new com.bytedance.sdk.component.wN.tN.Sg.YFl(i10, i11, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i10, i11).YFl(bArr);
        if (YFl2 != null) {
            imageView.setImageBitmap(YFl2);
        }
    }

    public static void Sg(ImageView imageView, byte[] bArr, int i10, int i11) {
        if (TextUtils.equals("png", com.bytedance.sdk.component.utils.qsH.YFl(Arrays.copyOfRange(bArr, 0, com.bytedance.sdk.component.utils.qsH.YFl())))) {
            tN(imageView, bArr, i10, i11);
        } else {
            YFl(imageView, bArr, i10, i11);
        }
    }

    private static byte[] YFl(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    private static void tN(ImageView imageView, byte[] bArr, int i10, int i11) {
        AlY(imageView, bArr, i10, i11);
    }

    public static void YFl(ImageView imageView, byte[] bArr, int i10, int i11) {
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
        AlY(imageView, bArr, i10, i11);
    }

    public static boolean YFl(byte[] bArr, int i10) {
        boolean YFl2;
        int i11;
        try {
            YFl2 = YFl(bArr, i10 + 12, YFl);
            i11 = i10 + 20;
        } catch (Throwable unused) {
        }
        if (bArr.length <= i11) {
            return false;
        }
        return YFl2 && ((bArr[i11] & 2) == 2);
    }

    private static boolean YFl(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
