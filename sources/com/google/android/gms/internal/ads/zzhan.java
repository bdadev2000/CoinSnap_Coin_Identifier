package com.google.android.gms.internal.ads;

import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
final class zzhan {
    private final Object zza;
    private final int zzb;

    public zzhan(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhan)) {
            return false;
        }
        zzhan zzhanVar = (zzhan) obj;
        return this.zza == zzhanVar.zza && this.zzb == zzhanVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
