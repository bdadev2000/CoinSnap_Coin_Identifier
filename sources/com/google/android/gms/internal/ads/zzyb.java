package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes2.dex */
final class zzyb implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzyj zza;

    public zzyb(zzyc zzycVar, zzyj zzyjVar) {
        this.zza = zzyjVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z2) {
        zzyj.zzi(this.zza);
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z2) {
        zzyj.zzi(this.zza);
    }
}
