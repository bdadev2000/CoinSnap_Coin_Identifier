package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzka implements zznr {
    private final /* synthetic */ zziv zza;

    public zzka(zziv zzivVar) {
        this.zza = zzivVar;
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zza("auto", str2, bundle, str);
        } else {
            this.zza.zzb("auto", str2, bundle);
        }
    }
}
