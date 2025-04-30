package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabs implements DisplayManager.DisplayListener {
    final /* synthetic */ zzabu zza;
    private final DisplayManager zzb;

    public zzabs(zzabu zzabuVar, DisplayManager displayManager) {
        this.zza = zzabuVar;
        this.zzb = displayManager;
    }

    private final Display zzc() {
        return this.zzb.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i9) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i9) {
        if (i9 == 0) {
            zzabu.zzb(this.zza, zzc());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i9) {
    }

    public final void zza() {
        this.zzb.registerDisplayListener(this, zzgd.zzx(null));
        zzabu.zzb(this.zza, zzc());
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
    }
}
