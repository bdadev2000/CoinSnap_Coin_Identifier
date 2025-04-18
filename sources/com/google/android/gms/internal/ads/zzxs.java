package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzxs implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzyb zza;

    public zzxs(zzxt zzxtVar, zzyb zzybVar) {
        this.zza = zzybVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzu();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzu();
    }
}
