package com.mbridge.msdk.tracker.network.toolbox;

import com.adjust.sdk.Constants;
import com.mbridge.msdk.tracker.network.u;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class h extends com.mbridge.msdk.tracker.network.toolbox.a {
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f15485b;

    /* loaded from: classes4.dex */
    public static class a extends FilterInputStream {
        private final HttpURLConnection a;

        public a(HttpURLConnection httpURLConnection) {
            super(h.b(httpURLConnection));
            this.a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.a.disconnect();
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends m {
    }

    public h() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private h(b bVar) {
        this(bVar, null);
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public final g a(u<?> uVar, Map<String, String> map) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        String a10 = uVar.i() == 0 ? d.a(uVar.k(), uVar) : uVar.k();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(uVar.c());
        b bVar = this.a;
        if (bVar != null) {
            String a11 = bVar.a(a10);
            if (a11 == null) {
                throw new IOException(vd.e.e("URL blocked by rewriter: ", a10));
            }
            a10 = a11;
        }
        URL url = new URL(a10);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int u = uVar.u();
        httpURLConnection.setConnectTimeout(u);
        httpURLConnection.setReadTimeout(u);
        boolean z10 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (Constants.SCHEME.equals(url.getProtocol()) && (sSLSocketFactory = this.f15485b) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            switch (uVar.i()) {
                case 0:
                    httpURLConnection.setRequestMethod("GET");
                    break;
                case 1:
                    httpURLConnection.setRequestMethod("POST");
                    a(httpURLConnection, uVar);
                    break;
                case 2:
                    httpURLConnection.setRequestMethod("PUT");
                    a(httpURLConnection, uVar);
                    break;
                case 3:
                    httpURLConnection.setRequestMethod("DELETE");
                    break;
                case 4:
                    httpURLConnection.setRequestMethod("HEAD");
                    break;
                case 5:
                    httpURLConnection.setRequestMethod("OPTIONS");
                    break;
                case 6:
                    httpURLConnection.setRequestMethod("TRACE");
                    break;
                case 7:
                    httpURLConnection.setRequestMethod("PATCH");
                    a(httpURLConnection, uVar);
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                if (!((uVar.i() == 4 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) ? false : true)) {
                    g gVar = new g(responseCode, a(httpURLConnection.getHeaderFields()));
                    httpURLConnection.disconnect();
                    return gVar;
                }
                try {
                    return new g(responseCode, a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new a(httpURLConnection));
                } catch (Throwable th2) {
                    th = th2;
                    z10 = true;
                    if (!z10) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.a = bVar;
        this.f15485b = sSLSocketFactory;
    }

    private static List<com.mbridge.msdk.tracker.network.h> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.mbridge.msdk.tracker.network.h(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private void a(HttpURLConnection httpURLConnection, u<?> uVar) throws IOException {
        byte[] p10 = uVar.p();
        if (p10 != null) {
            a(httpURLConnection, uVar, p10);
        }
    }

    private void a(HttpURLConnection httpURLConnection, u<?> uVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", uVar.o());
        }
        int length = bArr.length;
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
