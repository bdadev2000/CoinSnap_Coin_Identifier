package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaft extends zzado {
    final /* synthetic */ zzaea zza;
    final /* synthetic */ zzafu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaft(zzafu zzafuVar, zzaea zzaeaVar, zzaea zzaeaVar2) {
        super(zzaeaVar);
        this.zza = zzaeaVar2;
        this.zzb = zzafuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzado, com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        long j3;
        long j4;
        zzady zzg = this.zza.zzg(j2);
        zzaeb zzaebVar = zzg.zza;
        long j5 = zzaebVar.zzc;
        j3 = this.zzb.zzb;
        zzaeb zzaebVar2 = new zzaeb(zzaebVar.zzb, j3 + j5);
        zzaeb zzaebVar3 = zzg.zzb;
        long j6 = zzaebVar3.zzc;
        j4 = this.zzb.zzb;
        return new zzady(zzaebVar2, new zzaeb(zzaebVar3.zzb, j4 + j6));
    }
}
