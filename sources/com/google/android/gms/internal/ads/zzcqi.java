package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcqi implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzcqi(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        zzffo zza = ((zzcwd) this.zza).zza();
        zzegv zzb = ((zzegw) this.zzb).zzb();
        zzegc zzb2 = ((zzegd) this.zzc).zzb();
        if (zza.zza() == null) {
            return zzb2;
        }
        return zzb;
    }
}
