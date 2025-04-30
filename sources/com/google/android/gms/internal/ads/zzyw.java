package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes2.dex */
final class zzyw implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzze zza;

    public zzyw(zzyx zzyxVar, zzze zzzeVar) {
        this.zza = zzzeVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z8) {
        zzze.zzi(this.zza);
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z8) {
        zzze.zzi(this.zza);
    }
}
