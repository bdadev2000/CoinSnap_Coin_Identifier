package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
final class zzbez extends zzbfa {
    @Nullable
    private static final String zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i10 < str.length() && str.charAt(i10) == ',') {
            i10++;
        }
        while (length > 0) {
            int i11 = length - 1;
            if (str.charAt(i11) != ',') {
                break;
            }
            length = i11;
        }
        if (length < i10) {
            return null;
        }
        if (i10 == 0) {
            if (length == str.length()) {
                return str;
            }
        } else {
            i9 = i10;
        }
        return str.substring(i9, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final String zza(@Nullable String str, String str2) {
        String zzb = zzb(str);
        String zzb2 = zzb(str2);
        if (TextUtils.isEmpty(zzb)) {
            return zzb2;
        }
        if (TextUtils.isEmpty(zzb2)) {
            return zzb;
        }
        return o.k(zzb, ",", zzb2);
    }
}
