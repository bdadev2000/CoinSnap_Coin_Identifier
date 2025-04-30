package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzamx {
    @Nullable
    public static zzamy zza(@Nullable zzamy zzamyVar, @Nullable String[] strArr, Map map) {
        int length;
        int i9 = 0;
        if (zzamyVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzamy) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzamy zzamyVar2 = new zzamy();
                while (i9 < length2) {
                    zzamyVar2.zzl((zzamy) map.get(strArr[i9]));
                    i9++;
                }
                return zzamyVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzamyVar.zzl((zzamy) map.get(strArr[0]));
                return zzamyVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i9 < length) {
                    zzamyVar.zzl((zzamy) map.get(strArr[i9]));
                    i9++;
                }
            }
        }
        return zzamyVar;
    }
}
