package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzefc implements zzefb {
    public final zzefb zza;
    private final zzfwh zzb;

    public zzefc(zzefb zzefbVar, zzfwh zzfwhVar) {
        this.zza = zzefbVar;
        this.zzb = zzfwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(zzfff zzfffVar, zzfet zzfetVar) {
        return zzgei.zzm(this.zza.zza(zzfffVar, zzfetVar), this.zzb, zzcaj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        return this.zza.zzb(zzfffVar, zzfetVar);
    }
}
