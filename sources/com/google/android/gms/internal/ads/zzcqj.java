package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcqj implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzcqj(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        boolean booleanValue = ((zzcqp) this.zza).zzb().booleanValue();
        zzein zzb = ((zzeio) this.zzb).zzb();
        zzekn zzb2 = ((zzeko) this.zzc).zzb();
        if (true != booleanValue) {
            return zzb2;
        }
        return zzb;
    }
}
