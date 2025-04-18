package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfbo implements zzfhw {
    private final zzfck zza;

    public zzfbo(zzfck zzfckVar) {
        this.zza = zzfckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final ua.b zza(zzfhx zzfhxVar) {
        zzfbp zzfbpVar = (zzfbp) zzfhxVar;
        return ((zzfbl) this.zza).zzb(zzfbpVar.zzb, zzfbpVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final void zzb(zzfhl zzfhlVar) {
        zzfhlVar.zza = ((zzfbl) this.zza).zza();
    }
}
