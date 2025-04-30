package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdzv implements zzhkp {
    private final zzhlg zza;

    public zzdzv(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcjj) this.zza).zza().getPackageName();
        zzhkx.zzb(packageName);
        return packageName;
    }
}
