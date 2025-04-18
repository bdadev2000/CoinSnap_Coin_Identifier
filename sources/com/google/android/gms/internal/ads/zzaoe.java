package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
final class zzaoe implements zzacl {
    private final zzer zza;
    private final zzek zzb = new zzek();
    private final int zzc;

    public zzaoe(int i2, zzer zzerVar, int i3) {
        this.zzc = i2;
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final zzack zza(zzadc zzadcVar, long j2) throws IOException {
        int zza;
        int zza2;
        long zzf = zzadcVar.zzf();
        int min = (int) Math.min(112800L, zzadcVar.zzd() - zzf);
        this.zzb.zzI(min);
        zzadcVar.zzh(this.zzb.zzN(), 0, min);
        zzek zzekVar = this.zzb;
        int zze = zzekVar.zze();
        long j3 = -1;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        while (zzekVar.zzb() >= 188 && (zza2 = (zza = zzaop.zza(zzekVar.zzN(), zzekVar.zzd(), zze)) + Opcodes.NEWARRAY) <= zze) {
            long zzb = zzaop.zzb(zzekVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 <= j2) {
                    j5 = zza;
                    if (100000 + zzb2 <= j2) {
                        j4 = zzb2;
                    }
                } else if (j4 == -9223372036854775807L) {
                    return zzack.zzd(zzb2, zzf);
                }
                return zzack.zze(zzf + j5);
            }
            zzekVar.zzL(zza2);
            j3 = zza2;
        }
        return j4 != -9223372036854775807L ? zzack.zzf(j4, zzf + j3) : zzack.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzb() {
        byte[] bArr = zzeu.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
