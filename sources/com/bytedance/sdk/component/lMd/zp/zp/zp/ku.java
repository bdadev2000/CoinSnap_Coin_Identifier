package com.bytedance.sdk.component.lMd.zp.zp.zp;

import com.bytedance.sdk.component.lMd.zp.KVG;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class ku extends KVG {
    InputStream lMd;
    HttpURLConnection zp;

    public ku(HttpURLConnection httpURLConnection) throws IOException {
        this.zp = httpURLConnection;
        this.lMd = new HWF(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.lMd.zp.KVG
    public com.bytedance.sdk.component.lMd.zp.YW COT() {
        if (this.zp.getContentType() != null) {
            return com.bytedance.sdk.component.lMd.zp.YW.zp(this.zp.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.KVG
    public InputStream KS() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.KVG, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.lMd.close();
            this.zp.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.lMd.zp.KVG
    public byte[] jU() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.lMd.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.lMd.zp.KVG
    public String lMd() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.lMd));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.lMd.zp.KVG
    public long zp() {
        try {
            return this.zp.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public ku(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.zp = httpURLConnection;
        this.lMd = new HWF(inputStream, httpURLConnection);
    }
}
