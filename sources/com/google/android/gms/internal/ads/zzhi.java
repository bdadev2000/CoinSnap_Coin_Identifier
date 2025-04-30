package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzhi implements zzha {
    private final Context zza;
    private final zzha zzb;

    public zzhi(Context context) {
        zzhk zzhkVar = new zzhk();
        this.zza = context.getApplicationContext();
        this.zzb = zzhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzha
    public final /* bridge */ /* synthetic */ zzhb zza() {
        return new zzhj(this.zza, ((zzhk) this.zzb).zza());
    }
}
