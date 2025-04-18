package com.google.android.gms.ads.internal.util.client;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzr implements zze {

    @Nullable
    private final String zza;

    public zzr() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dd, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() != false) goto L41;
     */
    @Override // com.google.android.gms.ads.internal.util.client.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = ". "
            java.lang.String r1 = "Received non-success response code "
            java.lang.String r2 = "Error while pinging URL: "
            java.lang.String r3 = "Error while parsing ping URL: "
            java.lang.String r4 = "Pinging URL: "
            r5 = 0
            boolean r6 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            if (r6 == 0) goto L16
            r6 = 263(0x107, float:3.69E-43)
            android.net.TrafficStats.setThreadStatsTag(r6)     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
        L16:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            r6.<init>(r4)     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            r6.append(r10)     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            java.lang.String r4 = r6.toString()     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            com.google.android.gms.ads.internal.util.client.zzm.zze(r4)     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            java.net.URI r4 = new java.net.URI     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            r4.<init>(r10)     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            java.net.URL r4 = r4.toURL()     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = r9.zza     // Catch: java.lang.Throwable -> L94
            r7 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r7)     // Catch: java.lang.Throwable -> L94
            r8 = 1
            r4.setInstanceFollowRedirects(r8)     // Catch: java.lang.Throwable -> L94
            r4.setReadTimeout(r7)     // Catch: java.lang.Throwable -> L94
            if (r6 == 0) goto L4d
            java.lang.String r7 = "User-Agent"
            r4.setRequestProperty(r7, r6)     // Catch: java.lang.Throwable -> L94
        L4d:
            r4.setUseCaches(r5)     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.ads.internal.util.client.zzl r6 = new com.google.android.gms.ads.internal.util.client.zzl     // Catch: java.lang.Throwable -> L94
            r7 = 0
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L94
            r6.zzc(r4, r7)     // Catch: java.lang.Throwable -> L94
            int r7 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L94
            r6.zze(r4, r7)     // Catch: java.lang.Throwable -> L94
            r6 = 200(0xc8, float:2.8E-43)
            if (r7 < r6) goto L6b
            r6 = 300(0x12c, float:4.2E-43)
            if (r7 < r6) goto L69
            goto L6b
        L69:
            r5 = r8
            goto L82
        L6b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L94
            r6.append(r7)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = " from pinging URL: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L94
            r6.append(r10)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)     // Catch: java.lang.Throwable -> L94
        L82:
            r4.disconnect()     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 == 0) goto Ldd
            goto Lda
        L8c:
            r1 = move-exception
            goto L9b
        L8e:
            r1 = move-exception
            goto L9b
        L90:
            r1 = move-exception
            goto Lbb
        L92:
            r1 = move-exception
            goto Lbb
        L94:
            r1 = move-exception
            r4.disconnect()     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
            throw r1     // Catch: java.lang.RuntimeException -> L8c java.io.IOException -> L8e java.net.URISyntaxException -> L90 java.lang.IndexOutOfBoundsException -> L92 java.lang.Throwable -> L99
        L99:
            r10 = move-exception
            goto Lde
        L9b:
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L99
            r3.append(r10)     // Catch: java.lang.Throwable -> L99
            r3.append(r0)     // Catch: java.lang.Throwable -> L99
            r3.append(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r10)     // Catch: java.lang.Throwable -> L99
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 == 0) goto Ldd
            goto Lda
        Lbb:
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L99
            r2.append(r10)     // Catch: java.lang.Throwable -> L99
            r2.append(r0)     // Catch: java.lang.Throwable -> L99
            r2.append(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r10)     // Catch: java.lang.Throwable -> L99
            boolean r10 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r10 == 0) goto Ldd
        Lda:
            android.net.TrafficStats.clearThreadStatsTag()
        Ldd:
            return r5
        Lde:
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r0 == 0) goto Le7
            android.net.TrafficStats.clearThreadStatsTag()
        Le7:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.zzr.zza(java.lang.String):boolean");
    }

    public zzr(@Nullable String str) {
        this.zza = str;
    }
}
