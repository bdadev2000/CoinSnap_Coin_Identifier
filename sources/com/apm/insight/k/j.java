package com.apm.insight.k;

import androidx.fragment.app.FragmentTransaction;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.foundation.entity.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f5903a;
    private HttpURLConnection b;

    /* renamed from: c, reason: collision with root package name */
    private String f5904c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5905d;

    /* renamed from: e, reason: collision with root package name */
    private f f5906e;

    /* renamed from: f, reason: collision with root package name */
    private m f5907f;

    public j(String str, String str2, boolean z8) {
        this.f5904c = str2;
        this.f5905d = z8;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f5903a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        this.b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.b.setDoOutput(true);
        this.b.setDoInput(true);
        this.b.setRequestMethod("POST");
        this.b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z8) {
            this.f5906e = new f(this.b.getOutputStream());
        } else {
            this.b.setRequestProperty("Content-Encoding", "gzip");
            this.f5907f = new m(this.b.getOutputStream());
        }
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f5903a + "--\r\n").getBytes();
        if (this.f5905d) {
            this.f5907f.write(bytes);
            this.f5907f.b();
            this.f5907f.a();
        } else {
            this.f5906e.write(bytes);
            this.f5906e.flush();
            this.f5906e.a();
        }
        int responseCode = this.b.getResponseCode();
        if (responseCode != 200) {
            throw new IOException(o.h(responseCode, "Server returned non-OK status: "));
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getInputStream()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            arrayList.add(readLine);
        }
        bufferedReader.close();
        this.b.disconnect();
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    public void a(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb = new StringBuilder("--");
        AbstractC2914a.j(sb, this.f5903a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f5905d) {
            this.f5907f.write(sb.toString().getBytes());
        } else {
            this.f5906e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else {
                (this.f5905d ? this.f5907f : this.f5906e).write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f5905d) {
            this.f5907f.write("\r\n".getBytes());
        } else {
            this.f5906e.write("\r\n".getBytes());
            this.f5906e.flush();
        }
    }

    public void a(String str, String str2) {
        a(str, str2, false);
    }

    public void a(String str, String str2, boolean z8) {
        StringBuilder sb = new StringBuilder("--");
        AbstractC2914a.j(sb, this.f5903a, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=");
        sb.append(this.f5904c);
        sb.append("\r\n\r\n");
        try {
            if (this.f5905d) {
                this.f5907f.write(sb.toString().getBytes());
            } else {
                this.f5906e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z8) {
            bytes = com.apm.insight.i.i().getEncryptImpl().a(bytes);
        }
        try {
            if (this.f5905d) {
                this.f5907f.write(bytes);
                this.f5907f.write("\r\n".getBytes());
            } else {
                this.f5906e.write(bytes);
                this.f5906e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public void a(String str, File... fileArr) {
        StringBuilder sb = new StringBuilder("--");
        AbstractC2914a.j(sb, this.f5903a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f5905d) {
            this.f5907f.write(sb.toString().getBytes());
        } else {
            this.f5906e.write(sb.toString().getBytes());
        }
        com.apm.insight.l.i.a(this.f5905d ? this.f5907f : this.f5906e, fileArr);
        if (this.f5905d) {
            this.f5907f.write("\r\n".getBytes());
        } else {
            this.f5906e.write("\r\n".getBytes());
            this.f5906e.flush();
        }
    }
}
