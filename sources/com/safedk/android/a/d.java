package com.safedk.android.a;

import android.os.Build;
import com.google.common.net.HttpHeaders;
import com.safedk.android.utils.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29066a = "MultipartUtility";

    /* renamed from: c, reason: collision with root package name */
    private static final String f29067c = "\r\n";

    /* renamed from: b, reason: collision with root package name */
    private final String f29068b;
    private final f d;
    private final String e;

    /* renamed from: f, reason: collision with root package name */
    private final OutputStream f29069f;

    /* renamed from: g, reason: collision with root package name */
    private final PrintWriter f29070g;

    /* renamed from: h, reason: collision with root package name */
    private int f29071h = 0;

    public d(String str, String str2, String str3, int i2, Map<String, String> map) throws IOException {
        Logger.d(f29066a, "ctor started, requestURL = " + str2);
        this.e = str3;
        this.f29068b = "BOUNDARY-BOUNDARY" + System.currentTimeMillis() + "BOUNDARY";
        this.d = new f(new URL(str2).openConnection());
        this.d.a(str);
        this.d.a(false);
        this.d.b(true);
        this.d.d(true);
        this.d.a("Content-Type", "multipart/form-data; boundary=" + this.f29068b);
        this.d.a(HttpHeaders.USER_AGENT, "AppLovinQualityService/5.4.6 (Android " + Build.VERSION.RELEASE + ")");
        this.d.a(HttpHeaders.ACCEPT_ENCODING, "gzip,deflate");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.d.a(entry.getKey(), entry.getValue());
        }
        this.d.a(i2);
        this.d.b(i2);
        this.f29069f = this.d.a();
        this.f29070g = new PrintWriter((Writer) new OutputStreamWriter(this.f29069f, str3), true);
    }

    public void a(String str, String str2) {
        this.f29070g.append((CharSequence) "--").append((CharSequence) this.f29068b).append((CharSequence) f29067c);
        this.f29070g.append((CharSequence) "Content-Disposition: form-data; name=\"").append((CharSequence) str).append((CharSequence) "\"").append((CharSequence) f29067c);
        this.f29070g.append((CharSequence) "Content-Type: text/plain; charset=").append((CharSequence) this.e).append((CharSequence) f29067c);
        this.f29070g.append((CharSequence) f29067c);
        this.f29070g.append((CharSequence) str2).append((CharSequence) f29067c);
        this.f29070g.flush();
    }

    public void a(String str, File file, boolean z2) throws IOException {
        String name = file.getName();
        if (z2) {
            this.f29070g.append((CharSequence) "--").append((CharSequence) this.f29068b).append((CharSequence) f29067c);
            this.f29070g.append((CharSequence) "Content-Disposition: form-data; name=\"").append((CharSequence) str).append((CharSequence) "\"; filename=\"").append((CharSequence) name).append((CharSequence) "\"").append((CharSequence) f29067c);
            this.f29070g.append((CharSequence) "Content-Type: application/octet-stream").append((CharSequence) f29067c);
            this.f29070g.append((CharSequence) f29067c);
        }
        this.f29070g.flush();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                this.f29069f.write(bArr, 0, read);
            } else {
                this.f29069f.flush();
                fileInputStream.close();
                this.f29070g.append((CharSequence) f29067c);
                this.f29070g.flush();
                return;
            }
        }
    }

    public void b(String str, String str2) {
        this.f29070g.append((CharSequence) str).append((CharSequence) ": ").append((CharSequence) str2).append((CharSequence) f29067c);
        this.f29070g.flush();
    }

    public List<String> a() throws IOException {
        Logger.d(f29066a, "finish started");
        ArrayList arrayList = new ArrayList();
        this.f29070g.append((CharSequence) f29067c).flush();
        this.f29070g.append((CharSequence) "--").append((CharSequence) this.f29068b).append((CharSequence) "--").append((CharSequence) f29067c);
        this.f29070g.close();
        this.f29071h = this.d.b();
        Logger.d(f29066a, "Response code = " + this.f29071h);
        if (this.f29071h < 200 || this.f29071h >= 300) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.d.g()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            Logger.e(f29066a, "Error message: " + ((Object) sb));
            throw new IOException("Server returned non-OK status: " + this.f29071h);
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.d.e()));
        while (true) {
            String readLine2 = bufferedReader2.readLine();
            if (readLine2 != null) {
                arrayList.add(readLine2);
            } else {
                bufferedReader2.close();
                this.d.d();
                return arrayList;
            }
        }
    }

    public int b() {
        return this.f29071h;
    }
}
