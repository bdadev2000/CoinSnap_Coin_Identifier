package com.bytedance.sdk.component.Sg.YFl.YFl.YFl;

import com.bytedance.sdk.component.Sg.YFl.rkt;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class qsH extends rkt {
    InputStream Sg;
    HttpURLConnection YFl;

    public qsH(HttpURLConnection httpURLConnection) throws IOException {
        this.YFl = httpURLConnection;
        this.Sg = new vc(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.rkt
    public byte[] AlY() {
        try {
            byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.Sg.read(bArr);
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

    @Override // com.bytedance.sdk.component.Sg.YFl.rkt
    public String Sg() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.Sg));
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

    @Override // com.bytedance.sdk.component.Sg.YFl.rkt
    public long YFl() {
        try {
            return this.YFl.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.rkt, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.Sg.close();
            this.YFl.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.rkt
    public InputStream tN() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.rkt
    public com.bytedance.sdk.component.Sg.YFl.NjR wN() {
        if (this.YFl.getContentType() != null) {
            return com.bytedance.sdk.component.Sg.YFl.NjR.YFl(this.YFl.getContentType());
        }
        return null;
    }

    public qsH(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.YFl = httpURLConnection;
        this.Sg = new vc(inputStream, httpURLConnection);
    }
}
