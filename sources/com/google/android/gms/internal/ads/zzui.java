package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class zzui {
    private static final AtomicLong zza = new AtomicLong();

    public zzui(long j3, zzgi zzgiVar, long j10) {
        Uri uri = zzgiVar.zza;
        Collections.emptyMap();
    }

    public zzui(long j3, zzgi zzgiVar, Uri uri, Map map, long j10, long j11, long j12) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
