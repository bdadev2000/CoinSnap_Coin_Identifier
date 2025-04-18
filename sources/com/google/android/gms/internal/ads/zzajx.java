package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
final class zzajx implements zzaea {
    final /* synthetic */ zzajy zza;

    public /* synthetic */ zzajx(zzajy zzajyVar, zzajw zzajwVar) {
        this.zza = zzajyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        zzakj zzakjVar;
        long j2;
        zzajy zzajyVar = this.zza;
        zzakjVar = zzajyVar.zzd;
        j2 = zzajyVar.zzf;
        return zzakjVar.zzf(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        zzakj zzakjVar;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        zzajy zzajyVar = this.zza;
        zzakjVar = zzajyVar.zzd;
        long zzg = zzakjVar.zzg(j2);
        j3 = zzajyVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzajy zzajyVar2 = this.zza;
        j4 = zzajyVar2.zzc;
        j5 = zzajyVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j4 - j5));
        j6 = this.zza.zzf;
        long longValue = multiply.divide(BigInteger.valueOf(j6)).longValue() + j3;
        zzajy zzajyVar3 = this.zza;
        j7 = zzajyVar3.zzb;
        j8 = zzajyVar3.zzc;
        zzaeb zzaebVar = new zzaeb(j2, Math.max(j7, Math.min(longValue - 30000, j8 - 1)));
        return new zzady(zzaebVar, zzaebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return true;
    }
}
