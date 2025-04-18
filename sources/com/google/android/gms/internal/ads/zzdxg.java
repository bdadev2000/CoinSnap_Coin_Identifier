package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes3.dex */
public final class zzdxg implements zzhfx {
    private final zzhgp zza;

    public zzdxg(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzhgf.zzb(applicationInfo);
        return applicationInfo;
    }
}
