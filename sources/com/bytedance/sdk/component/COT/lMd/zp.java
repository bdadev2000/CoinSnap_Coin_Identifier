package com.bytedance.sdk.component.COT.lMd;

import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class zp implements com.bytedance.sdk.component.COT.jU<jU> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.bytedance.sdk.component.COT.jU
    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public jU<byte[]> zp(com.bytedance.sdk.component.COT.COT cot) {
        Closeable closeable;
        InputStream inputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2 = null;
        r1 = null;
        Map<String, String> map = null;
        int i9 = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(cot.zp()).openConnection()));
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (MalformedURLException e4) {
                e = e4;
                inputStream = null;
                bArr = null;
            } catch (IOException e9) {
                e = e9;
                inputStream = null;
                bArr = null;
            } catch (Throwable th) {
                th = th;
                closeable = null;
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(inputStream2);
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable);
                throw th;
            }
            try {
                byte[] bArr2 = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } catch (MalformedURLException e10) {
                        e = e10;
                        bArr = null;
                    } catch (IOException e11) {
                        e = e11;
                        bArr = null;
                    }
                }
                i9 = 200;
                bArr = byteArrayOutputStream.toByteArray();
            } catch (MalformedURLException e12) {
                e = e12;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(inputStream);
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable2);
                return new jU<>(i9, bArr, message, map);
            } catch (IOException e13) {
                e = e13;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(inputStream);
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable2);
                return new jU<>(i9, bArr, message, map);
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                inputStream2 = inputStream;
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(inputStream2);
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable);
                throw th;
            }
            try {
                if (cot.lMd()) {
                    map = zp(httpURLConnection);
                }
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(inputStream);
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(byteArrayOutputStream);
                message = "success";
            } catch (MalformedURLException e14) {
                e = e14;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(inputStream);
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable2);
                return new jU<>(i9, bArr, message, map);
            } catch (IOException e15) {
                e = e15;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(inputStream);
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable2);
                return new jU<>(i9, bArr, message, map);
            }
            return new jU<>(i9, bArr, message, map);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private Map<String, String> zp(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }
}
