package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
final class zzbdf extends zzbdg {
    @Nullable
    private static final String zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < str.length() && str.charAt(i3) == ',') {
            i3++;
        }
        while (length > 0) {
            int i4 = length - 1;
            if (str.charAt(i4) != ',') {
                break;
            }
            length = i4;
        }
        if (length < i3) {
            return null;
        }
        if (i3 != 0) {
            i2 = i3;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i2, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final String zza(@Nullable String str, String str2) {
        String zzb = zzb(str);
        String zzb2 = zzb(str2);
        return TextUtils.isEmpty(zzb) ? zzb2 : TextUtils.isEmpty(zzb2) ? zzb : androidx.compose.foundation.text.input.a.k(zzb, ",", zzb2);
    }
}
