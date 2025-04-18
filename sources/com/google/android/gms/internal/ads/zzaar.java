package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaar implements DisplayManager.DisplayListener {
    final /* synthetic */ zzaat zza;
    private final DisplayManager zzb;

    public zzaar(zzaat zzaatVar, DisplayManager displayManager) {
        this.zza = zzaatVar;
        this.zzb = displayManager;
    }

    private final Display zzc() {
        return this.zzb.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            zzaat.zzb(this.zza, zzc());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    public final void zza() {
        this.zzb.registerDisplayListener(this, zzen.zzy(null));
        zzaat.zzb(this.zza, zzc());
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
    }
}
