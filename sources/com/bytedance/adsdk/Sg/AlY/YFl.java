package com.bytedance.adsdk.Sg.AlY;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class YFl implements AlY {
    private final HttpURLConnection YFl;

    public YFl(HttpURLConnection httpURLConnection) {
        this.YFl = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.Sg.AlY.AlY
    public String AlY() {
        try {
            if (YFl()) {
                return null;
            }
            return "Unable to fetch " + this.YFl.getURL() + ". Failed with " + this.YFl.getResponseCode() + "\n" + YFl(this.YFl);
        } catch (IOException e2) {
            return e2.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.Sg.AlY.AlY
    public InputStream Sg() throws IOException {
        return this.YFl.getInputStream();
    }

    @Override // com.bytedance.adsdk.Sg.AlY.AlY
    public boolean YFl() {
        try {
            return this.YFl.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.YFl.disconnect();
    }

    @Override // com.bytedance.adsdk.Sg.AlY.AlY
    public String tN() {
        return this.YFl.getContentType();
    }

    private String YFl(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }
}
