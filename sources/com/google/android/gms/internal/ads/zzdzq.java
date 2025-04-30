package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes2.dex */
public final class zzdzq implements zzhkp {
    private final zzhlg zza;

    public zzdzq(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzhkx.zzb(applicationInfo);
        return applicationInfo;
    }
}
