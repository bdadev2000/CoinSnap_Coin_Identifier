package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* loaded from: classes3.dex */
public final class zzaza extends com.google.android.gms.ads.internal.client.zzcl {
    private final AppEventListener zza;

    public zzaza(AppEventListener appEventListener) {
        this.zza = appEventListener;
    }

    public final AppEventListener zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzc(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }
}
