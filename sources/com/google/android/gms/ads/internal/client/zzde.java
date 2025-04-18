package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* loaded from: classes.dex */
public final class zzde extends zzdc {
    private final MuteThisAdListener zza;

    public zzde(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
        this.zza.onAdMuted();
    }
}
