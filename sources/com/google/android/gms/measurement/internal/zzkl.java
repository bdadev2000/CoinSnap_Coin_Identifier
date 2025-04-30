package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkl implements Runnable {
    private final URL zza;
    private final zzkm zzb;
    private final String zzc;
    private final Map<String, String> zzd;
    private final /* synthetic */ zzkj zze;

    public zzkl(zzkj zzkjVar, String str, URL url, byte[] bArr, Map<String, String> map, zzkm zzkmVar) {
        this.zze = zzkjVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzkmVar);
        this.zza = url;
        this.zzb = zzkmVar;
        this.zzc = str;
        this.zzd = null;
    }

    private final void zzb(final int i9, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.zze.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzko
            @Override // java.lang.Runnable
            public final void run() {
                zzkl.this.zza(i9, exc, bArr, map);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] zza;
        this.zze.zzr();
        int i9 = 0;
        try {
            URLConnection zza2 = com.google.android.gms.internal.measurement.zzcq.zza().zza(this.zza, "client-measurement");
            if (zza2 instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) zza2;
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    i9 = httpURLConnection.getResponseCode();
                    map = httpURLConnection.getHeaderFields();
                } catch (IOException e4) {
                    e = e4;
                    map = null;
                } catch (Throwable th) {
                    th = th;
                    map = null;
                }
                try {
                    zzkj zzkjVar = this.zze;
                    zza = zzkj.zza(httpURLConnection);
                    httpURLConnection.disconnect();
                    zzb(i9, null, zza, map);
                    return;
                } catch (IOException e9) {
                    e = e9;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i9, e, null, map);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i9, null, null, map);
                    throw th;
                }
            }
            throw new IOException("Failed to obtain HTTP connection");
        } catch (IOException e10) {
            e = e10;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }

    public final /* synthetic */ void zza(int i9, Exception exc, byte[] bArr, Map map) {
        this.zzb.zza(this.zzc, i9, exc, bArr, map);
    }
}
