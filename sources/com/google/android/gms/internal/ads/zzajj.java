package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes3.dex */
final class zzajj implements zzadq {
    final /* synthetic */ zzajl zza;

    public /* synthetic */ zzajj(zzajl zzajlVar, zzajk zzajkVar) {
        this.zza = zzajlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        zzajw zzajwVar;
        long j3;
        zzajl zzajlVar = this.zza;
        zzajwVar = zzajlVar.zzd;
        j3 = zzajlVar.zzf;
        return zzajwVar.zzf(j3);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        zzajw zzajwVar;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        zzajl zzajlVar = this.zza;
        zzajwVar = zzajlVar.zzd;
        long zzg = zzajwVar.zzg(j3);
        j10 = zzajlVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzajl zzajlVar2 = this.zza;
        j11 = zzajlVar2.zzc;
        j12 = zzajlVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j11 - j12));
        j13 = this.zza.zzf;
        long longValue = multiply.divide(BigInteger.valueOf(j13)).longValue() + j10;
        zzajl zzajlVar3 = this.zza;
        j14 = zzajlVar3.zzb;
        j15 = zzajlVar3.zzc;
        zzadr zzadrVar = new zzadr(j3, Math.max(j14, Math.min(longValue - 30000, j15 - 1)));
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
