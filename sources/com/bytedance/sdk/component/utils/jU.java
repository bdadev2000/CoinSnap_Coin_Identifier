package com.bytedance.sdk.component.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class jU {
    public static Bitmap zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] zp(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getByteCount());
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap zp(Bitmap bitmap, int i9, int i10) {
        if (bitmap == null) {
            return null;
        }
        if (i9 <= 0 || i10 <= 0) {
            return bitmap;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (i9 < width && i10 < height) {
                Matrix matrix = new Matrix();
                matrix.postScale(i9 / width, i10 / height);
                return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            }
            return bitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }
}
