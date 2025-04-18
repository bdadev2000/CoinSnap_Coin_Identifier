package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzadj {
    @Nullable
    public static zzbk zza(zzadc zzadcVar, boolean z2) throws IOException {
        zzbk zza = new zzadr().zza(zzadcVar, z2 ? null : zzagu.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzadl zzb(zzek zzekVar) {
        zzekVar.zzM(1);
        int zzo = zzekVar.zzo();
        long zzd = zzekVar.zzd();
        long j2 = zzo;
        int i2 = zzo / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long zzt = zzekVar.zzt();
            if (zzt == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = zzt;
            jArr2[i3] = zzekVar.zzt();
            zzekVar.zzM(2);
            i3++;
        }
        zzekVar.zzM((int) ((zzd + j2) - zzekVar.zzd()));
        return new zzadl(jArr, jArr2);
    }
}
