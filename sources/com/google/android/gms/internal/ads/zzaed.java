package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzaed {
    @Nullable
    public static zzcd zza(zzadv zzadvVar, boolean z8) throws IOException {
        zzaho zzahoVar;
        if (z8) {
            zzahoVar = null;
        } else {
            zzahoVar = zzahq.zza;
        }
        zzcd zza = new zzael().zza(zzadvVar, zzahoVar);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzaef zzb(zzfu zzfuVar) {
        zzfuVar.zzL(1);
        int zzo = zzfuVar.zzo();
        long zzd = zzfuVar.zzd();
        long j7 = zzo;
        int i9 = zzo / 18;
        long[] jArr = new long[i9];
        long[] jArr2 = new long[i9];
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            long zzt = zzfuVar.zzt();
            if (zzt == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = zzt;
            jArr2[i10] = zzfuVar.zzt();
            zzfuVar.zzL(2);
            i10++;
        }
        zzfuVar.zzL((int) ((zzd + j7) - zzfuVar.zzd()));
        return new zzaef(jArr, jArr2);
    }
}
