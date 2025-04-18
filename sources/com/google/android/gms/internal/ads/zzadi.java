package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzadi implements zzadq {
    private final zzdu zza;
    private final zzdu zzb;
    private long zzc;

    public zzadi(long[] jArr, long[] jArr2, long j3) {
        boolean z10;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        if (length2 > 0 && jArr2[0] > 0) {
            int i10 = length2 + 1;
            zzdu zzduVar = new zzdu(i10);
            this.zza = zzduVar;
            zzdu zzduVar2 = new zzdu(i10);
            this.zzb = zzduVar2;
            zzduVar.zzc(0L);
            zzduVar2.zzc(0L);
        } else {
            this.zza = new zzdu(length2);
            this.zzb = new zzdu(length2);
        }
        this.zza.zzd(jArr);
        this.zzb.zzd(jArr2);
        this.zzc = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        zzdu zzduVar = this.zzb;
        if (zzduVar.zza() == 0) {
            zzadr zzadrVar = zzadr.zza;
            return new zzado(zzadrVar, zzadrVar);
        }
        int zzb = zzen.zzb(zzduVar, j3, true, true);
        zzadr zzadrVar2 = new zzadr(this.zzb.zzb(zzb), this.zza.zzb(zzb));
        if (zzadrVar2.zzb != j3) {
            zzdu zzduVar2 = this.zzb;
            if (zzb != zzduVar2.zza() - 1) {
                int i10 = zzb + 1;
                return new zzado(zzadrVar2, new zzadr(zzduVar2.zzb(i10), this.zza.zzb(i10)));
            }
        }
        return new zzado(zzadrVar2, zzadrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return this.zzb.zza() > 0;
    }
}
