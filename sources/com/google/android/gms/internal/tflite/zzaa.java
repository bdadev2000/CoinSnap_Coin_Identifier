package com.google.android.gms.internal.tflite;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zzaa {

    @CheckForNull
    private String zza = null;

    public final zzaa zza(String str) {
        String.format(Locale.ROOT, "TFLiteClient-%d", 0);
        this.zza = "TFLiteClient-%d";
        return this;
    }

    public final ThreadFactory zzb() {
        String str = this.zza;
        return new zzz(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, null, null, null);
    }
}
