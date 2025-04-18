package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes3.dex */
final class zzcfp implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbyh zza;
    final /* synthetic */ zzcfs zzb;

    public zzcfp(zzcfs zzcfsVar, zzbyh zzbyhVar) {
        this.zza = zzbyhVar;
        this.zzb = zzcfsVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
