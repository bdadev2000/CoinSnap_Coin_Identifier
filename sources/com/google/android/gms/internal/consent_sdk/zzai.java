package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzai {
    private Application zza;

    private zzai() {
    }

    public final zza zza() {
        zzdp.zzb(this.zza, Application.class);
        return new zzag(this.zza, null);
    }

    public final zzai zzb(Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }

    public /* synthetic */ zzai(zzah zzahVar) {
    }
}
