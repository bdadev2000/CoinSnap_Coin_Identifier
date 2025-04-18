package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzafj extends zzade {
    final /* synthetic */ zzadq zza;
    final /* synthetic */ zzafk zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafj(zzafk zzafkVar, zzadq zzadqVar, zzadq zzadqVar2) {
        super(zzadqVar);
        this.zza = zzadqVar2;
        this.zzb = zzafkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzade, com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        long j10;
        long j11;
        zzado zzg = this.zza.zzg(j3);
        zzadr zzadrVar = zzg.zza;
        long j12 = zzadrVar.zzc;
        j10 = this.zzb.zzb;
        zzadr zzadrVar2 = new zzadr(zzadrVar.zzb, j10 + j12);
        zzadr zzadrVar3 = zzg.zzb;
        long j13 = zzadrVar3.zzc;
        j11 = this.zzb.zzb;
        return new zzado(zzadrVar2, new zzadr(zzadrVar3.zzb, j11 + j13));
    }
}
