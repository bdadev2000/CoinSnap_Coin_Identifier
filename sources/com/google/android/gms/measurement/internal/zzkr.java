package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkr implements zzor {
    private final /* synthetic */ zzjq zza;

    public zzkr(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, bundle, str);
        } else {
            this.zza.zzb(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, bundle);
        }
    }
}
