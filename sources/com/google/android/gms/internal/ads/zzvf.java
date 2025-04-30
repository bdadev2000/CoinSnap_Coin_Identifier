package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class zzvf {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzhh zza;
    public final Uri zzb;
    public final Map zzc;

    public zzvf(long j7, zzhh zzhhVar, Uri uri, Map map, long j9, long j10, long j11) {
        this.zza = zzhhVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
