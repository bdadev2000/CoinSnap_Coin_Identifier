package com.google.android.gms.tflite.dynamite.internal;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zze {
    private final long zza;
    private final Object zzb;

    public zze(long j, Object obj, boolean z) {
        this.zza = j;
        this.zzb = obj;
    }

    Object getLogger() {
        return this.zzb;
    }

    public long getTflApi() {
        return this.zza;
    }

    boolean shouldUseInitV2() {
        return false;
    }
}
