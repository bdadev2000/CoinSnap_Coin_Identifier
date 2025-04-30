package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzabf extends zzto {
    public zzabf(Throwable th, @Nullable zztp zztpVar, @Nullable Surface surface) {
        super(th, zztpVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
