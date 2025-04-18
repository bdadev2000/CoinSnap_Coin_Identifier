package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzafe implements zzacl {
    private final zzadm zza;
    private final int zzb;
    private final zzadh zzc = new zzadh();

    public /* synthetic */ zzafe(zzadm zzadmVar, int i2, zzafd zzafdVar) {
        this.zza = zzadmVar;
        this.zzb = i2;
    }

    private final long zzc(zzadc zzadcVar) throws IOException {
        while (zzadcVar.zze() < zzadcVar.zzd() - 6) {
            zzadm zzadmVar = this.zza;
            int i2 = this.zzb;
            zzadh zzadhVar = this.zzc;
            long zze = zzadcVar.zze();
            byte[] bArr = new byte[2];
            zzadcVar.zzh(bArr, 0, 2);
            if ((((bArr[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[1] & UnsignedBytes.MAX_VALUE)) != i2) {
                zzadcVar.zzj();
                zzadcVar.zzg((int) (zze - zzadcVar.zzf()));
            } else {
                zzek zzekVar = new zzek(16);
                System.arraycopy(bArr, 0, zzekVar.zzN(), 0, 2);
                zzekVar.zzK(zzadf.zza(zzadcVar, zzekVar.zzN(), 2, 14));
                zzadcVar.zzj();
                zzadcVar.zzg((int) (zze - zzadcVar.zzf()));
                if (zzadi.zzc(zzekVar, zzadmVar, i2, zzadhVar)) {
                    break;
                }
            }
            zzadcVar.zzg(1);
        }
        if (zzadcVar.zze() < zzadcVar.zzd() - 6) {
            return this.zzc.zza;
        }
        zzadcVar.zzg((int) (zzadcVar.zzd() - zzadcVar.zze()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final zzack zza(zzadc zzadcVar, long j2) throws IOException {
        long zzf = zzadcVar.zzf();
        long zzc = zzc(zzadcVar);
        long zze = zzadcVar.zze();
        zzadcVar.zzg(Math.max(6, this.zza.zzc));
        long zzc2 = zzc(zzadcVar);
        return (zzc > j2 || zzc2 <= j2) ? zzc2 <= j2 ? zzack.zzf(zzc2, zzadcVar.zze()) : zzack.zzd(zzc, zzf) : zzack.zze(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final /* synthetic */ void zzb() {
    }
}
