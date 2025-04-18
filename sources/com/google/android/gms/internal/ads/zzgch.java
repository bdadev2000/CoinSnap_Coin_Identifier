package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgch {
    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
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
            boolean r0 = com.google.android.gms.internal.ads.zzgci.zzb(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            com.google.android.gms.internal.ads.zzfwq.zzf(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            int r3 = java.lang.Math.getExponent(r5)
            r4 = -1022(0xfffffffffffffc02, float:NaN)
            if (r3 < r4) goto L71
            int[] r3 = com.google.android.gms.internal.ads.zzgcg.zza
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L69;
                case 2: goto L68;
                case 3: goto L5f;
                case 4: goto L55;
                case 5: goto L4d;
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
            if (r5 <= 0) goto L65
            r1 = r2
            goto L65
        L4d:
            if (r0 < 0) goto L50
            r1 = r2
        L50:
            boolean r5 = zzd(r5)
            goto L5c
        L55:
            if (r0 >= 0) goto L58
            r1 = r2
        L58:
            boolean r5 = zzd(r5)
        L5c:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L65
        L5f:
            boolean r5 = zzd(r5)
            r1 = r5 ^ 1
        L65:
            if (r1 == 0) goto L68
            int r0 = r0 + r2
        L68:
            return r0
        L69:
            boolean r5 = zzd(r5)
            com.google.android.gms.internal.ads.zzgcn.zzb(r5)
            return r0
        L71:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = zza(r5, r7)
            int r5 = r5 + (-52)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgch.zza(double, java.math.RoundingMode):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (java.lang.Math.abs(r8 - r4) == 0.5d) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long zzb(double r8, java.math.RoundingMode r10) {
        /*
            boolean r0 = com.google.android.gms.internal.ads.zzgci.zzb(r8)
            if (r0 == 0) goto Lb8
            int[] r0 = com.google.android.gms.internal.ads.zzgcg.zza
            int r1 = r10.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r4 = 0
            switch(r0) {
                case 1: goto L76;
                case 2: goto L65;
                case 3: goto L56;
                case 4: goto L7d;
                case 5: goto L45;
                case 6: goto L40;
                case 7: goto L2b;
                case 8: goto L1c;
                default: goto L16;
            }
        L16:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L1c:
            double r4 = java.lang.Math.rint(r8)
            double r6 = r8 - r4
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7e
            goto L7d
        L2b:
            double r4 = java.lang.Math.rint(r8)
            double r6 = r8 - r4
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7e
            double r2 = java.lang.Math.copySign(r2, r8)
            double r4 = r2 + r8
            goto L7e
        L40:
            double r4 = java.lang.Math.rint(r8)
            goto L7e
        L45:
            boolean r0 = zzc(r8)
            if (r0 == 0) goto L4c
            goto L7d
        L4c:
            long r2 = (long) r8
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L53
            r0 = r1
            goto L54
        L53:
            r0 = -1
        L54:
            long r4 = (long) r0
            goto L73
        L56:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7d
            boolean r0 = zzc(r8)
            if (r0 == 0) goto L61
            goto L7d
        L61:
            long r2 = (long) r8
            r4 = 1
            goto L73
        L65:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L7d
            boolean r0 = zzc(r8)
            if (r0 == 0) goto L70
            goto L7d
        L70:
            long r2 = (long) r8
            r4 = -1
        L73:
            long r2 = r2 + r4
            double r4 = (double) r2
            goto L7e
        L76:
            boolean r0 = zzc(r8)
            com.google.android.gms.internal.ads.zzgcn.zzb(r0)
        L7d:
            r4 = r8
        L7e:
            r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r2 = r2 - r4
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L8a
            r0 = r1
            goto L8b
        L8a:
            r0 = r2
        L8b:
            r6 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L92
            goto L93
        L92:
            r1 = r2
        L93:
            r0 = r0 & r1
            if (r0 == 0) goto L98
            long r8 = (long) r4
            return r8
        L98:
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
        Lb8:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "input is infinite or NaN"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgch.zzb(double, java.math.RoundingMode):long");
    }

    public static boolean zzc(double d10) {
        if (!zzgci.zzb(d10)) {
            return false;
        }
        if (d10 != 0.0d && 52 - Long.numberOfTrailingZeros(zzgci.zza(d10)) > Math.getExponent(d10)) {
            return false;
        }
        return true;
    }

    public static boolean zzd(double d10) {
        if (d10 > 0.0d && zzgci.zzb(d10)) {
            long zza = zzgci.zza(d10);
            if ((zza & ((-1) + zza)) == 0) {
                return true;
            }
        }
        return false;
    }
}
