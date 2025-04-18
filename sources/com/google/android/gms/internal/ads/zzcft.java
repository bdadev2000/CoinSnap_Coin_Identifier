package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes3.dex */
final class zzcft implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbyk zza;
    final /* synthetic */ zzcfw zzb;

    public zzcft(zzcfw zzcfwVar, zzbyk zzbykVar) {
        this.zza = zzbykVar;
        this.zzb = zzcfwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzX(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
