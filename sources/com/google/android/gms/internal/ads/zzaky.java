package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzaky extends zzali {

    @Nullable
    private zzaeg zza;

    @Nullable
    private zzakx zzb;

    private static boolean zzd(byte[] bArr) {
        if (bArr[0] != -1) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final long zza(zzfu zzfuVar) {
        if (zzd(zzfuVar.zzM())) {
            int i9 = (zzfuVar.zzM()[2] & 255) >> 4;
            if (i9 != 6) {
                if (i9 == 7) {
                    i9 = 7;
                }
                int zza = zzaec.zza(zzfuVar, i9);
                zzfuVar.zzK(0);
                return zza;
            }
            zzfuVar.zzL(4);
            zzfuVar.zzw();
            int zza2 = zzaec.zza(zzfuVar, i9);
            zzfuVar.zzK(0);
            return zza2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final void zzb(boolean z8) {
        super.zzb(z8);
        if (z8) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final boolean zzc(zzfu zzfuVar, long j7, zzalf zzalfVar) {
        byte[] zzM = zzfuVar.zzM();
        zzaeg zzaegVar = this.zza;
        if (zzaegVar == null) {
            zzaeg zzaegVar2 = new zzaeg(zzM, 17);
            this.zza = zzaegVar2;
            zzalfVar.zza = zzaegVar2.zzc(Arrays.copyOfRange(zzM, 9, zzfuVar.zze()), null);
            return true;
        }
        if ((zzM[0] & Ascii.DEL) == 3) {
            zzaef zzb = zzaed.zzb(zzfuVar);
            zzaeg zzf = zzaegVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzakx(zzf, zzb);
            return true;
        }
        if (!zzd(zzM)) {
            return true;
        }
        zzakx zzakxVar = this.zzb;
        if (zzakxVar != null) {
            zzakxVar.zza(j7);
            zzalfVar.zzb = this.zzb;
        }
        zzalfVar.zza.getClass();
        return false;
    }
}
