package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.safedk.android.a.g;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class zzard extends zzaqq {
    public zzard() {
        throw null;
    }

    @VisibleForTesting
    public static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzapu((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaqq
    public final zzara zza(zzaqc zzaqcVar, Map map) throws IOException, zzapk {
        String zzk = zzaqcVar.zzk();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzaqcVar.zzl());
        URL url = new URL(zzk);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzb = zzaqcVar.zzb();
        httpURLConnection.setConnectTimeout(zzb);
        httpURLConnection.setReadTimeout(zzb);
        boolean z2 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        TournamentShareDialogURIBuilder.scheme.equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (zzaqcVar.zza() != 0) {
                httpURLConnection.setRequestMethod(g.f29074c);
                byte[] zzx = zzaqcVar.zzx();
                if (zzx != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                    dataOutputStream.write(zzx);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (httpUrlConnectionGetResponseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzaqcVar.zza();
            if ((httpUrlConnectionGetResponseCode >= 100 && httpUrlConnectionGetResponseCode < 200) || httpUrlConnectionGetResponseCode == 204 || httpUrlConnectionGetResponseCode == 304) {
                zzara zzaraVar = new zzara(httpUrlConnectionGetResponseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                return zzaraVar;
            }
            try {
                return new zzara(httpUrlConnectionGetResponseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzarb(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z2 = true;
                if (!z2) {
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public zzard(zzarc zzarcVar, SSLSocketFactory sSLSocketFactory) {
    }
}
