package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdox implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzdox(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        int i10 = ((zzcwd) this.zzc).zza().zzo.zza;
        if (i10 != 0) {
            if (i10 - 1 != 0) {
                return ((zzeko) this.zzb).zzb();
            }
            return ((zzeko) this.zza).zzb();
        }
        throw null;
    }
}
