package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzbcx extends zzbcy {
    @Nullable
    private static final String zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < str.length() && str.charAt(i11) == ',') {
            i11++;
        }
        while (length > 0) {
            int i12 = length - 1;
            if (str.charAt(i12) != ',') {
                break;
            }
            length = i12;
        }
        if (length < i11) {
            return null;
        }
        if (i11 == 0) {
            if (length == str.length()) {
                return str;
            }
        } else {
            i10 = i11;
        }
        return str.substring(i10, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    public final String zza(@Nullable String str, String str2) {
        String zzb = zzb(str);
        String zzb2 = zzb(str2);
        if (TextUtils.isEmpty(zzb)) {
            return zzb2;
        }
        if (TextUtils.isEmpty(zzb2)) {
            return zzb;
        }
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(zzb, ",", zzb2);
    }
}
