package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
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

/* loaded from: classes3.dex */
public final class zzaqq extends zzaqd {
    public zzaqq() {
        throw null;
    }

    public zzaqq(zzaqp zzaqpVar, SSLSocketFactory sSLSocketFactory) {
    }

    public static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzaph((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaqd
    public final zzaqn zza(zzapp zzappVar, Map map) throws IOException, zzaox {
        String zzk = zzappVar.zzk();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzappVar.zzl());
        URL url = new URL(zzk);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzb = zzappVar.zzb();
        httpURLConnection.setConnectTimeout(zzb);
        httpURLConnection.setReadTimeout(zzb);
        boolean z10 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        Constants.SCHEME.equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (zzappVar.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] zzx = zzappVar.zzx();
                if (zzx != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(zzx);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                zzappVar.zza();
                if ((responseCode < 100 || responseCode >= 200) && responseCode != 204 && responseCode != 304) {
                    try {
                        return new zzaqn(responseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzaqo(httpURLConnection));
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        if (!z10) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                zzaqn zzaqnVar = new zzaqn(responseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzaqnVar;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
