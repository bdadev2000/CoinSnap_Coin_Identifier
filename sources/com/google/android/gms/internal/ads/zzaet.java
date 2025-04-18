package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzaet implements zzacb {
    private final zzadc zza;
    private final int zzb;
    private final zzacx zzc = new zzacx();

    public /* synthetic */ zzaet(zzadc zzadcVar, int i10, zzaeu zzaeuVar) {
        this.zza = zzadcVar;
        this.zzb = i10;
    }

    private final long zzc(zzacs zzacsVar) throws IOException {
        while (zzacsVar.zze() < zzacsVar.zzd() - 6) {
            zzadc zzadcVar = this.zza;
            int i10 = this.zzb;
            zzacx zzacxVar = this.zzc;
            long zze = zzacsVar.zze();
            byte[] bArr = new byte[2];
            zzacsVar.zzh(bArr, 0, 2);
            if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i10) {
                zzacsVar.zzj();
                zzacsVar.zzg((int) (zze - zzacsVar.zzf()));
            } else {
                zzed zzedVar = new zzed(16);
                System.arraycopy(bArr, 0, zzedVar.zzN(), 0, 2);
                zzedVar.zzK(zzacv.zza(zzacsVar, zzedVar.zzN(), 2, 14));
                zzacsVar.zzj();
                zzacsVar.zzg((int) (zze - zzacsVar.zzf()));
                if (zzacy.zzc(zzedVar, zzadcVar, i10, zzacxVar)) {
                    break;
                }
            }
            zzacsVar.zzg(1);
        }
        if (zzacsVar.zze() >= zzacsVar.zzd() - 6) {
            zzacsVar.zzg((int) (zzacsVar.zzd() - zzacsVar.zze()));
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final zzaca zza(zzacs zzacsVar, long j3) throws IOException {
        long zzf = zzacsVar.zzf();
        long zzc = zzc(zzacsVar);
        long zze = zzacsVar.zze();
        zzacsVar.zzg(Math.max(6, this.zza.zzc));
        long zzc2 = zzc(zzacsVar);
        long zze2 = zzacsVar.zze();
        if (zzc <= j3 && zzc2 > j3) {
            return zzaca.zze(zze);
        }
        if (zzc2 <= j3) {
            return zzaca.zzf(zzc2, zze2);
        }
        return zzaca.zzd(zzc, zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final /* synthetic */ void zzb() {
    }
}
