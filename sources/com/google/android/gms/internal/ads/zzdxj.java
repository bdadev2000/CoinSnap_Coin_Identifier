package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdxj implements zzhfx {
    private final zzhgp zza;

    public zzdxj(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzchq) this.zza).zza().getPackageName();
        zzhgf.zzb(packageName);
        return packageName;
    }
}
