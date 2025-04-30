package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes2.dex */
public final class zzavo {
    public static String zza(byte[] bArr, boolean z8) {
        int i9;
        if (true != z8) {
            i9 = 2;
        } else {
            i9 = 11;
        }
        return Base64.encodeToString(bArr, i9);
    }

    public static byte[] zzb(String str, boolean z8) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, 2);
        if (decode.length == 0 && str.length() > 0) {
            throw new IllegalArgumentException("Unable to decode ".concat(str));
        }
        return decode;
    }
}
