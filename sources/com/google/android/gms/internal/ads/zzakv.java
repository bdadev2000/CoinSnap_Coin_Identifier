package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes2.dex */
final class zzakv implements zzaet {
    final /* synthetic */ zzakw zza;

    public /* synthetic */ zzakv(zzakw zzakwVar, zzaku zzakuVar) {
        this.zza = zzakwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        zzali zzaliVar;
        long j7;
        zzakw zzakwVar = this.zza;
        zzaliVar = zzakwVar.zzd;
        j7 = zzakwVar.zzf;
        return zzaliVar.zzf(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        zzali zzaliVar;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        zzakw zzakwVar = this.zza;
        zzaliVar = zzakwVar.zzd;
        long zzg = zzaliVar.zzg(j7);
        j9 = zzakwVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzakw zzakwVar2 = this.zza;
        j10 = zzakwVar2.zzc;
        j11 = zzakwVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j10 - j11));
        j12 = this.zza.zzf;
        long longValue = multiply.divide(BigInteger.valueOf(j12)).longValue() + j9;
        zzakw zzakwVar3 = this.zza;
        j13 = zzakwVar3.zzb;
        j14 = zzakwVar3.zzc;
        zzaeu zzaeuVar = new zzaeu(j7, Math.max(j13, Math.min(longValue - 30000, j14 - 1)));
        return new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
