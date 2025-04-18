package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzacz {
    @Nullable
    public static zzbd zza(zzacs zzacsVar, boolean z10) throws IOException {
        zzagi zzagiVar;
        if (z10) {
            zzagiVar = null;
        } else {
            zzagiVar = zzagk.zza;
        }
        zzbd zza = new zzadh().zza(zzacsVar, zzagiVar);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzadb zzb(zzed zzedVar) {
        zzedVar.zzM(1);
        int zzo = zzedVar.zzo();
        long zzd = zzedVar.zzd();
        long j3 = zzo;
        int i10 = zzo / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long zzt = zzedVar.zzt();
            if (zzt == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = zzt;
            jArr2[i11] = zzedVar.zzt();
            zzedVar.zzM(2);
            i11++;
        }
        zzedVar.zzM((int) ((zzd + j3) - zzedVar.zzd()));
        return new zzadb(jArr, jArr2);
    }
}
