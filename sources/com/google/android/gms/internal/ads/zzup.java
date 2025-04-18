package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class zzup {
    private static final AtomicLong zza = new AtomicLong();

    public zzup(long j2, zzgm zzgmVar, long j3) {
        Uri uri = zzgmVar.zza;
        Collections.emptyMap();
    }

    public zzup(long j2, zzgm zzgmVar, Uri uri, Map map, long j3, long j4, long j5) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
