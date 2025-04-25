package com.google.android.gms.internal.tflite;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zzs {
    public static final /* synthetic */ int zza = 0;

    @Nullable
    private static volatile zzr zzc = null;
    private static volatile boolean zzd = false;
    private static final Object zzb = new Object();
    private static final AtomicReference zze = new AtomicReference();
    private static final zzu zzf = new zzu(new Object() { // from class: com.google.android.gms.internal.tflite.zzq
    });
    private static final AtomicInteger zzg = new AtomicInteger();

    public static void zza(final Context context) {
        if (zzc != null || context == null) {
            return;
        }
        Object obj = zzb;
        synchronized (obj) {
            if (zzc == null) {
                synchronized (obj) {
                    zzr zzrVar = zzc;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzrVar == null || zzrVar.zza() != context) {
                        zzo.zza();
                        zzt.zza();
                        zzc = new zzn(context, zzy.zza(new zzv() { // from class: com.google.android.gms.internal.tflite.zzp
                        }));
                        zzg.incrementAndGet();
                    }
                }
            }
        }
    }
}
