package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes3.dex */
public final class zzo implements zzdn {
    private final zzds zza;
    private final zzds zzb;

    public zzo(zzds zzdsVar, zzds zzdsVar2) {
        this.zza = zzdsVar;
        this.zzb = zzdsVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzl zza() {
        return new zzl((Application) this.zza.zza(), (zzap) this.zzb.zza());
    }
}
