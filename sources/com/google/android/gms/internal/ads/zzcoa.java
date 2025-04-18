package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcoa implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzcoa(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzayi zzayiVar = (zzayi) this.zza.zzb();
        return new zzcnt(zzayiVar.zzc(), (zzbor) this.zzb.zzb(), zzfil.zzc());
    }
}
