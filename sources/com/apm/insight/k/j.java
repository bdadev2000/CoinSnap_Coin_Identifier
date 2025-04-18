package com.apm.insight.k;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class j {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f3213b;

    /* renamed from: c, reason: collision with root package name */
    private String f3214c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3215d;

    /* renamed from: e, reason: collision with root package name */
    private f f3216e;

    /* renamed from: f, reason: collision with root package name */
    private m f3217f;

    public j(String str, String str2, boolean z10) {
        this.f3214c = str2;
        this.f3215d = z10;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f3213b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f3213b.setDoOutput(true);
        this.f3213b.setDoInput(true);
        this.f3213b.setRequestMethod("POST");
        this.f3213b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z10) {
            this.f3216e = new f(this.f3213b.getOutputStream());
        } else {
            this.f3213b.setRequestProperty("Content-Encoding", "gzip");
            this.f3217f = new m(this.f3213b.getOutputStream());
        }
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.a + "--\r\n").getBytes();
        if (this.f3215d) {
            this.f3217f.write(bytes);
            this.f3217f.b();
            this.f3217f.a();
        } else {
            this.f3216e.write(bytes);
            this.f3216e.flush();
            this.f3216e.a();
        }
        int responseCode = this.f3213b.getResponseCode();
        if (responseCode != 200) {
            throw new IOException(eb.j.i("Server returned non-OK status: ", responseCode));
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f3213b.getInputStream()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            arrayList.add(readLine);
        }
        bufferedReader.close();
        this.f3213b.disconnect();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        return sb2.toString();
    }

    public void a(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder("--");
        sb2.append(this.a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f3215d) {
            this.f3217f.write(sb2.toString().getBytes());
        } else {
            this.f3216e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else {
                (this.f3215d ? this.f3217f : this.f3216e).write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f3215d) {
            this.f3217f.write("\r\n".getBytes());
        } else {
            this.f3216e.write("\r\n".getBytes());
            this.f3216e.flush();
        }
    }

    public void a(String str, String str2) {
        a(str, str2, false);
    }

    public void a(String str, String str2, boolean z10) {
        StringBuilder sb2 = new StringBuilder("--");
        sb2.append(this.a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Type: text/plain; charset=");
        sb2.append(this.f3214c);
        sb2.append("\r\n\r\n");
        try {
            if (this.f3215d) {
                this.f3217f.write(sb2.toString().getBytes());
            } else {
                this.f3216e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z10) {
            bytes = com.apm.insight.i.i().getEncryptImpl().a(bytes);
        }
        try {
            if (this.f3215d) {
                this.f3217f.write(bytes);
                this.f3217f.write("\r\n".getBytes());
            } else {
                this.f3216e.write(bytes);
                this.f3216e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public void a(String str, File... fileArr) {
        StringBuilder sb2 = new StringBuilder("--");
        sb2.append(this.a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f3215d) {
            this.f3217f.write(sb2.toString().getBytes());
        } else {
            this.f3216e.write(sb2.toString().getBytes());
        }
        com.apm.insight.l.h.a(this.f3215d ? this.f3217f : this.f3216e, fileArr);
        if (this.f3215d) {
            this.f3217f.write("\r\n".getBytes());
        } else {
            this.f3216e.write("\r\n".getBytes());
            this.f3216e.flush();
        }
    }
}
