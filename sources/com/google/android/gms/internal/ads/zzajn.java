package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzajn extends zzajw {

    @Nullable
    private zzadc zza;

    @Nullable
    private zzajm zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final long zza(zzed zzedVar) {
        if (zzd(zzedVar.zzN())) {
            int i10 = (zzedVar.zzN()[2] & UByte.MAX_VALUE) >> 4;
            if (i10 != 6) {
                if (i10 == 7) {
                    i10 = 7;
                }
                int zza = zzacy.zza(zzedVar, i10);
                zzedVar.zzL(0);
                return zza;
            }
            zzedVar.zzM(4);
            zzedVar.zzx();
            int zza2 = zzacy.zza(zzedVar, i10);
            zzedVar.zzL(0);
            return zza2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final boolean zzc(zzed zzedVar, long j3, zzajt zzajtVar) {
        byte[] zzN = zzedVar.zzN();
        zzadc zzadcVar = this.zza;
        if (zzadcVar == null) {
            zzadc zzadcVar2 = new zzadc(zzN, 17);
            this.zza = zzadcVar2;
            zzajtVar.zza = zzadcVar2.zzc(Arrays.copyOfRange(zzN, 9, zzedVar.zze()), null);
            return true;
        }
        if ((zzN[0] & Byte.MAX_VALUE) == 3) {
            zzadb zzb = zzacz.zzb(zzedVar);
            zzadc zzf = zzadcVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzajm(zzf, zzb);
            return true;
        }
        if (!zzd(zzN)) {
            return true;
        }
        zzajm zzajmVar = this.zzb;
        if (zzajmVar != null) {
            zzajmVar.zza(j3);
            zzajtVar.zzb = this.zzb;
        }
        zzajtVar.zza.getClass();
        return false;
    }
}
