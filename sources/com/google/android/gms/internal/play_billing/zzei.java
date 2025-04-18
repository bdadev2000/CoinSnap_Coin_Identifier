package com.google.android.gms.internal.play_billing;

import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class zzei {
    private final Object zza;
    private final int zzb;

    public zzei(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzei)) {
            return false;
        }
        zzei zzeiVar = (zzei) obj;
        return this.zza == zzeiVar.zza && this.zzb == zzeiVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
