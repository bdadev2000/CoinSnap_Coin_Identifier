package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzabo {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabm zza(byte[] bArr) throws zzbh {
        return zzb(new zzec(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzabm zzb(com.google.android.gms.internal.ads.zzec r11, boolean r12) throws com.google.android.gms.internal.ads.zzbh {
        /*
            int r0 = zzc(r11)
            int r1 = zzd(r11)
            r2 = 4
            int r3 = r11.zzd(r2)
            java.lang.String r4 = "mp4a.40."
            java.lang.String r4 = eb.j.i(r4, r0)
            r5 = 5
            r6 = 22
            if (r0 == r5) goto L1c
            r5 = 29
            if (r0 != r5) goto L2a
        L1c:
            int r1 = zzd(r11)
            int r0 = zzc(r11)
            if (r0 != r6) goto L2a
            int r3 = r11.zzd(r2)
        L2a:
            if (r12 == 0) goto Lc3
            r12 = 17
            r5 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L57
            if (r0 == r8) goto L57
            if (r0 == r9) goto L57
            if (r0 == r2) goto L57
            if (r0 == r5) goto L57
            r2 = 7
            if (r0 == r2) goto L57
            if (r0 == r12) goto L57
            switch(r0) {
                case 19: goto L57;
                case 20: goto L57;
                case 21: goto L57;
                case 22: goto L57;
                case 23: goto L57;
                default: goto L44;
            }
        L44:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported audio object type: "
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzbh r11 = com.google.android.gms.internal.ads.zzbh.zzc(r11)
            throw r11
        L57:
            boolean r2 = r11.zzp()
            if (r2 == 0) goto L64
            java.lang.String r2 = "AacUtil"
            java.lang.String r10 = "Unexpected frameLengthFlag = 1"
            com.google.android.gms.internal.ads.zzdt.zzf(r2, r10)
        L64:
            boolean r2 = r11.zzp()
            if (r2 == 0) goto L6f
            r2 = 14
            r11.zzn(r2)
        L6f:
            boolean r2 = r11.zzp()
            if (r3 == 0) goto Lbd
            r10 = 20
            if (r0 == r5) goto L7c
            if (r0 != r10) goto L7f
            r0 = r10
        L7c:
            r11.zzn(r9)
        L7f:
            if (r2 == 0) goto L9c
            if (r0 != r6) goto L89
            r2 = 16
            r11.zzn(r2)
            goto L8a
        L89:
            r6 = r0
        L8a:
            if (r6 == r12) goto L96
            r12 = 19
            if (r6 == r12) goto L96
            if (r6 == r10) goto L96
            r12 = 23
            if (r6 != r12) goto L99
        L96:
            r11.zzn(r9)
        L99:
            r11.zzn(r7)
        L9c:
            switch(r0) {
                case 17: goto La0;
                case 18: goto L9f;
                case 19: goto La0;
                case 20: goto La0;
                case 21: goto La0;
                case 22: goto La0;
                case 23: goto La0;
                default: goto L9f;
            }
        L9f:
            goto Lc3
        La0:
            int r11 = r11.zzd(r8)
            if (r11 == r8) goto La9
            if (r11 == r9) goto Laa
            goto Lc3
        La9:
            r9 = r11
        Laa:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported epConfig: "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzbh r11 = com.google.android.gms.internal.ads.zzbh.zzc(r11)
            throw r11
        Lbd:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        Lc3:
            int[] r11 = com.google.android.gms.internal.ads.zzabo.zzc
            r11 = r11[r3]
            r12 = -1
            r0 = 0
            if (r11 == r12) goto Ld1
            com.google.android.gms.internal.ads.zzabm r12 = new com.google.android.gms.internal.ads.zzabm
            r12.<init>(r1, r11, r4, r0)
            return r12
        Ld1:
            com.google.android.gms.internal.ads.zzbh r11 = com.google.android.gms.internal.ads.zzbh.zza(r0, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabo.zzb(com.google.android.gms.internal.ads.zzec, boolean):com.google.android.gms.internal.ads.zzabm");
    }

    private static int zzc(zzec zzecVar) {
        int zzd = zzecVar.zzd(5);
        if (zzd == 31) {
            return zzecVar.zzd(6) + 32;
        }
        return zzd;
    }

    private static int zzd(zzec zzecVar) throws zzbh {
        int zzd = zzecVar.zzd(4);
        if (zzd == 15) {
            if (zzecVar.zza() >= 24) {
                return zzecVar.zzd(24);
            }
            throw zzbh.zza("AAC header insufficient data", null);
        }
        if (zzd < 13) {
            return zzb[zzd];
        }
        throw zzbh.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
