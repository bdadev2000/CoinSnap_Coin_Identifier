package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class zzgm {
    private static zzgm zza;
    private static final Duration zzb;
    private final zzhy zzc;
    private final TelemetryLoggingClient zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    static {
        Duration ofMinutes;
        ofMinutes = Duration.ofMinutes(30L);
        zzb = ofMinutes;
    }

    private zzgm(Context context, zzhy zzhyVar) {
        this.zzd = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.zzc = zzhyVar;
    }

    public static zzgm zza(zzhy zzhyVar) {
        if (zza == null) {
            zza = new zzgm(zzhyVar.zza(), zzhyVar);
        }
        return zza;
    }

    public final /* synthetic */ void zza(long j3, Exception exc) {
        this.zze.set(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[Catch: all -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:11:0x0035, B:15:0x001d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zza(int r21, int r22, long r23, long r25, int r27) {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            com.google.android.gms.measurement.internal.zzhy r0 = r1.zzc     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.common.util.Clock r0 = r0.zzb()     // Catch: java.lang.Throwable -> L6a
            long r2 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L6a
            java.util.concurrent.atomic.AtomicLong r0 = r1.zze     // Catch: java.lang.Throwable -> L6a
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L6a
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L1d
        L1b:
            r0 = r5
            goto L31
        L1d:
            java.util.concurrent.atomic.AtomicLong r0 = r1.zze     // Catch: java.lang.Throwable -> L6a
            long r6 = r0.get()     // Catch: java.lang.Throwable -> L6a
            long r6 = r2 - r6
            java.time.Duration r0 = com.google.android.gms.measurement.internal.zzgm.zzb     // Catch: java.lang.Throwable -> L6a
            long r8 = n0.u0.b(r0)     // Catch: java.lang.Throwable -> L6a
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L30
            goto L1b
        L30:
            r0 = r4
        L31:
            if (r0 != 0) goto L35
            monitor-exit(r20)
            return
        L35:
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zzd     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.common.internal.TelemetryData r6 = new com.google.android.gms.common.internal.TelemetryData     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.common.internal.MethodInvocation[] r5 = new com.google.android.gms.common.internal.MethodInvocation[r5]     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.common.internal.MethodInvocation r19 = new com.google.android.gms.common.internal.MethodInvocation     // Catch: java.lang.Throwable -> L6a
            r8 = 36301(0x8dcd, float:5.0869E-41)
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r7 = r19
            r9 = r22
            r11 = r23
            r13 = r25
            r18 = r27
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L6a
            r5[r4] = r19     // Catch: java.lang.Throwable -> L6a
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L6a
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.tasks.Task r0 = r0.log(r6)     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.measurement.internal.zzgl r4 = new com.google.android.gms.measurement.internal.zzgl     // Catch: java.lang.Throwable -> L6a
            r4.<init>()     // Catch: java.lang.Throwable -> L6a
            r0.addOnFailureListener(r4)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r20)
            return
        L6a:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgm.zza(int, int, long, long, int):void");
    }
}
