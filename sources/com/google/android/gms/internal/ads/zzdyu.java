package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdyu implements zzhii {
    private final zzhja zza;

    public zzdyu(zzhja zzhjaVar) {
        this.zza = zzhjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzchu) this.zza).zza().getPackageName();
        zzhiq.zzb(packageName);
        return packageName;
    }
}
