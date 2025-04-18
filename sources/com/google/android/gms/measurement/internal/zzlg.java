package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlg implements Runnable {
    private final URL zza;
    private final zzld zzb;
    private final String zzc;
    private final Map<String, String> zzd;
    private final /* synthetic */ zzle zze;

    public zzlg(zzle zzleVar, String str, URL url, byte[] bArr, Map<String, String> map, zzld zzldVar) {
        this.zze = zzleVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzldVar);
        this.zza = url;
        this.zzb = zzldVar;
        this.zzc = str;
        this.zzd = null;
    }

    private final void zzb(final int i10, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.zze.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlf
            @Override // java.lang.Runnable
            public final void run() {
                zzlg.this.zza(i10, exc, bArr, map);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] zza;
        this.zze.zzr();
        int i10 = 0;
        try {
            URLConnection zza2 = com.google.android.gms.internal.measurement.zzcy.zza().zza(this.zza, "client-measurement");
            if (zza2 instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) zza2;
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    i10 = httpURLConnection.getResponseCode();
                    map = httpURLConnection.getHeaderFields();
                } catch (IOException e2) {
                    e = e2;
                    map = null;
                } catch (Throwable th2) {
                    th = th2;
                    map = null;
                }
                try {
                    zzle zzleVar = this.zze;
                    zza = zzle.zza(httpURLConnection);
                    httpURLConnection.disconnect();
                    zzb(i10, null, zza, map);
                    return;
                } catch (IOException e10) {
                    e = e10;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i10, e, null, map);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i10, null, null, map);
                    throw th;
                }
            }
            throw new IOException("Failed to obtain HTTP connection");
        } catch (IOException e11) {
            e = e11;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            map = null;
        }
    }

    public final /* synthetic */ void zza(int i10, Exception exc, byte[] bArr, Map map) {
        this.zzb.zza(this.zzc, i10, exc, bArr, map);
    }
}
