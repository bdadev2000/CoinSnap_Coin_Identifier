package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes4.dex */
public final class zzgdk {
    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = com.google.android.gms.internal.ads.zzgdl.zzb(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            com.google.android.gms.internal.ads.zzfxz.zzf(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            int r3 = java.lang.Math.getExponent(r5)
            r4 = -1022(0xfffffffffffffc02, float:NaN)
            if (r3 < r4) goto L6f
            int[] r3 = com.google.android.gms.internal.ads.zzgdj.zza
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L67;
                case 2: goto L66;
                case 3: goto L5e;
                case 4: goto L56;
                case 5: goto L4c;
                case 6: goto L33;
                case 7: goto L33;
                case 8: goto L33;
                default: goto L2d;
            }
        L2d:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L33:
            long r5 = java.lang.Double.doubleToRawLongBits(r5)
            r3 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r5 = r5 & r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r5 = r5 | r3
            double r5 = java.lang.Double.longBitsToDouble(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L66
            goto L65
        L4c:
            if (r0 < 0) goto L4f
            r1 = r2
        L4f:
            boolean r5 = zzd(r5)
        L53:
            r5 = r5 ^ r2
            r5 = r5 & r1
            goto L63
        L56:
            if (r0 >= 0) goto L59
            r1 = r2
        L59:
            boolean r5 = zzd(r5)
            goto L53
        L5e:
            boolean r5 = zzd(r5)
            r5 = r5 ^ r2
        L63:
            if (r5 == 0) goto L66
        L65:
            int r0 = r0 + r2
        L66:
            return r0
        L67:
            boolean r5 = zzd(r5)
            com.google.android.gms.internal.ads.zzgdq.zzb(r5)
            return r0
        L6f:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = zza(r5, r7)
            int r5 = r5 + (-52)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdk.zza(double, java.math.RoundingMode):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (java.lang.Math.abs(r8 - r2) == 0.5d) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long zzb(double r8, java.math.RoundingMode r10) {
        /*
            boolean r0 = com.google.android.gms.internal.ads.zzgdl.zzb(r8)
            if (r0 == 0) goto Lb9
            int[] r0 = com.google.android.gms.internal.ads.zzgdj.zza
            int r1 = r10.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            switch(r0) {
                case 1: goto L77;
                case 2: goto L68;
                case 3: goto L57;
                case 4: goto L7e;
                case 5: goto L44;
                case 6: goto L3f;
                case 7: goto L2b;
                case 8: goto L1c;
                default: goto L16;
            }
        L16:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L1c:
            double r2 = java.lang.Math.rint(r8)
            double r6 = r8 - r2
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L7f
            goto L7e
        L2b:
            double r2 = java.lang.Math.rint(r8)
            double r6 = r8 - r2
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L7f
            double r2 = java.lang.Math.copySign(r4, r8)
            double r2 = r2 + r8
            goto L7f
        L3f:
            double r2 = java.lang.Math.rint(r8)
            goto L7f
        L44:
            boolean r0 = zzc(r8)
            if (r0 == 0) goto L4b
            goto L7e
        L4b:
            long r4 = (long) r8
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L52
            r0 = r1
            goto L53
        L52:
            r0 = -1
        L53:
            long r2 = (long) r0
            long r4 = r4 + r2
            double r2 = (double) r4
            goto L7f
        L57:
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7e
            boolean r0 = zzc(r8)
            if (r0 == 0) goto L62
            goto L7e
        L62:
            long r2 = (long) r8
            r4 = 1
        L65:
            long r2 = r2 + r4
            double r2 = (double) r2
            goto L7f
        L68:
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L7e
            boolean r0 = zzc(r8)
            if (r0 == 0) goto L73
            goto L7e
        L73:
            long r2 = (long) r8
            r4 = -1
            goto L65
        L77:
            boolean r0 = zzc(r8)
            com.google.android.gms.internal.ads.zzgdq.zzb(r0)
        L7e:
            r2 = r8
        L7f:
            r4 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r4 = r4 - r2
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 0
            if (r0 >= 0) goto L8b
            r0 = r1
            goto L8c
        L8b:
            r0 = r4
        L8c:
            r5 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L93
            goto L94
        L93:
            r1 = r4
        L94:
            r0 = r0 & r1
            if (r0 == 0) goto L99
            long r8 = (long) r2
            return r8
        L99:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "rounded value is out of range for input "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " and rounding mode "
            r1.append(r8)
            r1.append(r10)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lb9:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "input is infinite or NaN"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdk.zzb(double, java.math.RoundingMode):long");
    }

    public static boolean zzc(double d) {
        if (zzgdl.zzb(d)) {
            return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || 52 - Long.numberOfTrailingZeros(zzgdl.zza(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean zzd(double d) {
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && zzgdl.zzb(d)) {
            long zza = zzgdl.zza(d);
            if ((zza & ((-1) + zza)) == 0) {
                return true;
            }
        }
        return false;
    }
}
