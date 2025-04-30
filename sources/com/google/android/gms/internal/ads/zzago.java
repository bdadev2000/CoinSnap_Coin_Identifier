package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzago extends zzaei {
    final /* synthetic */ zzaet zza;
    final /* synthetic */ zzagp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzago(zzagp zzagpVar, zzaet zzaetVar, zzaet zzaetVar2) {
        super(zzaetVar);
        this.zza = zzaetVar2;
        this.zzb = zzagpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaei, com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        long j9;
        long j10;
        zzaer zzg = this.zza.zzg(j7);
        zzaeu zzaeuVar = zzg.zza;
        long j11 = zzaeuVar.zzc;
        j9 = this.zzb.zzb;
        zzaeu zzaeuVar2 = new zzaeu(zzaeuVar.zzb, j9 + j11);
        zzaeu zzaeuVar3 = zzg.zzb;
        long j12 = zzaeuVar3.zzc;
        j10 = this.zzb.zzb;
        return new zzaer(zzaeuVar2, new zzaeu(zzaeuVar3.zzb, j10 + j12));
    }
}
