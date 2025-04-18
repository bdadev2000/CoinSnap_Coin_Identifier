package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcka implements com.google.android.gms.ads.nonagon.signalgeneration.zzw {
    private final zzciy zza;
    private zzcvw zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzau zzc;

    public /* synthetic */ zzcka(zzciy zzciyVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzw zza(zzcvw zzcvwVar) {
        this.zzb = zzcvwVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzw zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar) {
        this.zzc = zzauVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzx zzc() {
        zzhgf.zzc(this.zzb, zzcvw.class);
        zzhgf.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzau.class);
        return new zzckb(this.zza, this.zzc, new zzcta(), new zzcuz(), new zzdta(), this.zzb, null, null, null);
    }
}
