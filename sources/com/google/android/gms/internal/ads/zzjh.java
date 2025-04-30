package com.google.android.gms.internal.ads;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzjh extends zzcj {

    @Deprecated
    public static final zzn zzd = new zzn() { // from class: com.google.android.gms.internal.ads.zzjg
    };
    private static final String zzl = Integer.toString(1001, 36);
    private static final String zzm = Integer.toString(1002, 36);
    private static final String zzn = Integer.toString(1003, 36);
    private static final String zzo = Integer.toString(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, 36);
    private static final String zzp = Integer.toString(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 36);
    private static final String zzq = Integer.toString(1006, 36);
    public final int zze;

    @Nullable
    public final String zzf;
    public final int zzg;

    @Nullable
    public final zzan zzh;
    public final int zzi;

    @Nullable
    public final zzvo zzj;
    final boolean zzk;

    private zzjh(int i9, Throwable th, int i10) {
        this(i9, th, null, i10, null, -1, null, 4, false);
    }

    public static zzjh zzb(Throwable th, String str, int i9, @Nullable zzan zzanVar, int i10, boolean z8, int i11) {
        int i12;
        if (zzanVar == null) {
            i12 = 4;
        } else {
            i12 = i10;
        }
        return new zzjh(1, th, null, i11, str, i9, zzanVar, i12, z8);
    }

    public static zzjh zzc(IOException iOException, int i9) {
        return new zzjh(0, iOException, i9);
    }

    public static zzjh zzd(RuntimeException runtimeException, int i9) {
        return new zzjh(2, runtimeException, i9);
    }

    @CheckResult
    public final zzjh zza(@Nullable zzvo zzvoVar) {
        String message = getMessage();
        int i9 = zzgd.zza;
        return new zzjh(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzvoVar, this.zzc, this.zzk);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zzjh(int r14, @androidx.annotation.Nullable java.lang.Throwable r15, @androidx.annotation.Nullable java.lang.String r16, int r17, @androidx.annotation.Nullable java.lang.String r18, int r19, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzan r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L59
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L5f
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            int r2 = com.google.android.gms.internal.ads.zzgd.zza
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            java.lang.String r0 = x0.AbstractC2914a.h(r2, r1, r0)
            goto L5f
        L59:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L5f:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L6c
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L6c:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjh.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzan, int, boolean):void");
    }

    private zzjh(String str, @Nullable Throwable th, int i9, int i10, @Nullable String str2, int i11, @Nullable zzan zzanVar, int i12, @Nullable zzvo zzvoVar, long j7, boolean z8) {
        super(str, th, i9, j7);
        int i13;
        boolean z9;
        if (z8) {
            i13 = i10;
            if (i13 == 1) {
                i13 = 1;
                z9 = true;
            } else {
                z9 = false;
            }
        } else {
            i13 = i10;
            z9 = true;
        }
        zzeq.zzd(z9);
        zzeq.zzd(th != null);
        this.zze = i13;
        this.zzf = str2;
        this.zzg = i11;
        this.zzh = zzanVar;
        this.zzi = i12;
        this.zzj = zzvoVar;
        this.zzk = z8;
    }
}
