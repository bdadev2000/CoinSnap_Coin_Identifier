package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes3.dex */
public final class zzatt {
    public static String zza(byte[] bArr, boolean z10) {
        return Base64.encodeToString(bArr, true != z10 ? 2 : 11);
    }

    public static byte[] zzb(String str, boolean z10) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, 2);
        if (decode.length == 0 && str.length() > 0) {
            throw new IllegalArgumentException("Unable to decode ".concat(str));
        }
        return decode;
    }
}
