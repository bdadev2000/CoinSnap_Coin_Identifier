package com.bytedance.sdk.component.wN.Sg;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class YFl implements com.bytedance.sdk.component.wN.AlY<AlY> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.bytedance.sdk.component.wN.AlY
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public AlY<byte[]> YFl(com.bytedance.sdk.component.wN.wN wNVar) {
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
        int i10 = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(wNVar.YFl()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (MalformedURLException e2) {
                e = e2;
                inputStream = null;
                bArr = null;
            } catch (IOException e10) {
                e = e10;
                inputStream = null;
                bArr = null;
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream2);
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(closeable);
                throw th;
            }
            try {
                byte[] bArr2 = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } catch (MalformedURLException e11) {
                        e = e11;
                        bArr = null;
                    } catch (IOException e12) {
                        e = e12;
                        bArr = null;
                    }
                }
                i10 = 200;
                bArr = byteArrayOutputStream.toByteArray();
            } catch (MalformedURLException e13) {
                e = e13;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream);
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(closeable2);
                return new AlY<>(i10, bArr, message, map);
            } catch (IOException e14) {
                e = e14;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream);
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(closeable2);
                return new AlY<>(i10, bArr, message, map);
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                inputStream2 = inputStream;
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream2);
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(closeable);
                throw th;
            }
            try {
                if (wNVar.Sg()) {
                    map = YFl(httpURLConnection);
                }
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream);
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(byteArrayOutputStream);
                message = "success";
            } catch (MalformedURLException e15) {
                e = e15;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream);
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(closeable2);
                return new AlY<>(i10, bArr, message, map);
            } catch (IOException e16) {
                e = e16;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream);
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(closeable2);
                return new AlY<>(i10, bArr, message, map);
            }
            return new AlY<>(i10, bArr, message, map);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private Map<String, String> YFl(HttpURLConnection httpURLConnection) {
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
