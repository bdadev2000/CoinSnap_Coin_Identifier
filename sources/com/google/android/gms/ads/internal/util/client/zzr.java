package com.google.android.gms.ads.internal.util.client;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzr implements zze {

    @Nullable
    private final String zza;

    public zzr() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00de, code lost:
    
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() != false) goto L42;
     */
    @Override // com.google.android.gms.ads.internal.util.client.zze
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = ". "
            java.lang.String r1 = "Error while parsing ping URL: "
            java.lang.String r2 = "Error while pinging URL: "
            java.lang.String r3 = "Received non-success response code "
            java.lang.String r4 = "Pinging URL: "
            r5 = 0
            boolean r6 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            if (r6 == 0) goto L1a
            r6 = 263(0x107, float:3.69E-43)
            android.net.TrafficStats.setThreadStatsTag(r6)     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            goto L1a
        L17:
            r10 = move-exception
            goto Le2
        L1a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            r6.append(r10)     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            com.google.android.gms.ads.internal.util.client.zzm.zze(r4)     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            java.net.URI r4 = new java.net.URI     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            java.net.URL r4 = r4.toURL()     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r9.zza     // Catch: java.lang.Throwable -> L52
            r7 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r7)     // Catch: java.lang.Throwable -> L52
            r8 = 1
            r4.setInstanceFollowRedirects(r8)     // Catch: java.lang.Throwable -> L52
            r4.setReadTimeout(r7)     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L54
            java.lang.String r7 = "User-Agent"
            r4.setRequestProperty(r7, r6)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r3 = move-exception
            goto L9b
        L54:
            r4.setUseCaches(r5)     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.ads.internal.util.client.zzl r6 = new com.google.android.gms.ads.internal.util.client.zzl     // Catch: java.lang.Throwable -> L52
            r7 = 0
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L52
            r6.zzc(r4, r7)     // Catch: java.lang.Throwable -> L52
            int r7 = com.safedk.android.internal.partials.AdMobNetworkBridge.httpUrlConnectionGetResponseCode(r4)     // Catch: java.lang.Throwable -> L52
            r6.zze(r4, r7)     // Catch: java.lang.Throwable -> L52
            r6 = 200(0xc8, float:2.8E-43)
            if (r7 < r6) goto L72
            r6 = 300(0x12c, float:4.2E-43)
            if (r7 < r6) goto L70
            goto L72
        L70:
            r5 = r8
            goto L89
        L72:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L52
            r6.append(r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = " from pinging URL: "
            r6.append(r3)     // Catch: java.lang.Throwable -> L52
            r6.append(r10)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)     // Catch: java.lang.Throwable -> L52
        L89:
            com.safedk.android.internal.partials.AdMobNetworkBridge.httpUrlConnectionDisconnect(r4)     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 == 0) goto Le1
            goto Lde
        L93:
            r1 = move-exception
            goto L9f
        L95:
            r1 = move-exception
            goto L9f
        L97:
            r2 = move-exception
            goto Lbf
        L99:
            r2 = move-exception
            goto Lbf
        L9b:
            com.safedk.android.internal.partials.AdMobNetworkBridge.httpUrlConnectionDisconnect(r4)     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
            throw r3     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L93 java.io.IOException -> L95 java.net.URISyntaxException -> L97 java.lang.IndexOutOfBoundsException -> L99
        L9f:
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L17
            r3.append(r10)     // Catch: java.lang.Throwable -> L17
            r3.append(r0)     // Catch: java.lang.Throwable -> L17
            r3.append(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r10)     // Catch: java.lang.Throwable -> L17
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 == 0) goto Le1
            goto Lde
        Lbf:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r3.append(r10)     // Catch: java.lang.Throwable -> L17
            r3.append(r0)     // Catch: java.lang.Throwable -> L17
            r3.append(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r10)     // Catch: java.lang.Throwable -> L17
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 == 0) goto Le1
        Lde:
            android.net.TrafficStats.clearThreadStatsTag()
        Le1:
            return r5
        Le2:
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r0 == 0) goto Leb
            android.net.TrafficStats.clearThreadStatsTag()
        Leb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.zzr.zza(java.lang.String):boolean");
    }

    public zzr(@Nullable String str) {
        this.zza = str;
    }
}
