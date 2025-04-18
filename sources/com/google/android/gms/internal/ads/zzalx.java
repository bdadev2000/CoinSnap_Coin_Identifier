package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzalx {
    @Nullable
    public static zzaly zza(@Nullable zzaly zzalyVar, @Nullable String[] strArr, Map map) {
        int length;
        int i2 = 0;
        if (zzalyVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzaly) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzaly zzalyVar2 = new zzaly();
                while (i2 < length2) {
                    zzalyVar2.zzl((zzaly) map.get(strArr[i2]));
                    i2++;
                }
                return zzalyVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzalyVar.zzl((zzaly) map.get(strArr[0]));
                return zzalyVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i2 < length) {
                    zzalyVar.zzl((zzaly) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return zzalyVar;
    }
}
