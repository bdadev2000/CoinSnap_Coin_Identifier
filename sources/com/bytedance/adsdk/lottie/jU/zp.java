package com.bytedance.adsdk.lottie.jU;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class zp implements jU {
    private final HttpURLConnection zp;

    public zp(HttpURLConnection httpURLConnection) {
        this.zp = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.lottie.jU.jU
    public String KS() {
        return this.zp.getContentType();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.zp.disconnect();
    }

    @Override // com.bytedance.adsdk.lottie.jU.jU
    public String jU() {
        try {
            if (zp()) {
                return null;
            }
            return "Unable to fetch " + this.zp.getURL() + ". Failed with " + this.zp.getResponseCode() + "\n" + zp(this.zp);
        } catch (IOException e4) {
            return e4.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.lottie.jU.jU
    public InputStream lMd() throws IOException {
        return this.zp.getInputStream();
    }

    @Override // com.bytedance.adsdk.lottie.jU.jU
    public boolean zp() {
        try {
            return this.zp.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    private String zp(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }
}
