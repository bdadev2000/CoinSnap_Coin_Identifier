package com.bytedance.sdk.component.COT.KS.KS;

import android.graphics.BitmapFactory;

/* loaded from: classes.dex */
public class zp {
    public static boolean lMd(byte[] bArr) {
        if (bArr == null || bArr.length < 3 || bArr[0] != 71 || bArr[1] != 73 || bArr[2] != 70) {
            return false;
        }
        return true;
    }

    public static boolean zp(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outWidth <= 0) {
            return false;
        }
        return true;
    }
}
