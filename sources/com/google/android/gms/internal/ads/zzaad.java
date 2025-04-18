package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzaad extends zzsp {
    public zzaad(Throwable th2, @Nullable zzsq zzsqVar, @Nullable Surface surface) {
        super(th2, zzsqVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
