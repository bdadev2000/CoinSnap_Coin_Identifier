package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes4.dex */
public final class zzbx implements zzdn {
    private final zzds zza;

    public zzbx(zzds zzdsVar) {
        this.zza = zzdsVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final /* bridge */ /* synthetic */ Object zza() {
        return new zzbw((Application) this.zza.zza());
    }
}
