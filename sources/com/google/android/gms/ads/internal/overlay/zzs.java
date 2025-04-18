package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzs extends AnimatorListenerAdapter {
    final /* synthetic */ zzu zza;

    public zzs(zzu zzuVar) {
        this.zza = zzuVar;
    }

    private final void zza(boolean z10) {
        ImageButton imageButton;
        this.zza.setEnabled(z10);
        imageButton = this.zza.zza;
        imageButton.setEnabled(z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zza(false);
    }
}
