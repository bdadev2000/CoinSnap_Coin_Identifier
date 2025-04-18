package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzaan extends zzsv {
    public zzaan(Throwable th, @Nullable zzsw zzswVar, @Nullable Surface surface) {
        super(th, zzswVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
