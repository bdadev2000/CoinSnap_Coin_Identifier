package com.safedk.android.a;

import com.google.common.net.HttpHeaders;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29061a = "ConfigDownload";

    /* renamed from: b, reason: collision with root package name */
    private static final int f29062b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f29063c = {60000, 300000};
    private e d;
    private final String e;

    /* renamed from: f, reason: collision with root package name */
    private final String f29064f;

    public b(e eVar, String str, String str2) {
        this.d = new e();
        this.d = eVar;
        this.e = str;
        this.f29064f = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.a.b.run():void");
    }

    private String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            char[] cArr = new char[65536];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger.e(f29061a, "Failed to read configuration from input stream", e);
        }
        return sb.toString();
    }

    private int a(f fVar) throws IOException, HttpRetryException {
        InputStream inputStream = null;
        int b2 = fVar.b();
        Logger.d(f29061a, "response code = " + b2);
        try {
            if (b2 < 300) {
                try {
                    inputStream = fVar.e();
                    String a2 = a(inputStream);
                    Logger.d(f29061a, "response = " + a2);
                    this.d.a(a2, b(fVar));
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    Logger.e(f29061a, "Failed to get response from server", e);
                    this.d.a("Failed to read data from connection");
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th) {
                    Logger.e(f29061a, "Caught exception", th);
                    new CrashReporter().caughtException(th);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } else {
                if (b2 != 304) {
                    InputStream g2 = fVar.g();
                    String a3 = a(g2);
                    this.d.a(a3);
                    if (g2 != null) {
                        g2.close();
                    }
                    throw new HttpRetryException(a3, b2);
                }
                this.d.a(null, b(fVar));
            }
            return b2;
        } catch (Throwable th2) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    private int a(int i2) {
        return f29063c[i2];
    }

    private boolean a(Exception exc) {
        return (exc.getClass().isInstance(InterruptedIOException.class) || exc.getClass().isInstance(UnknownHostException.class) || exc.getClass().isInstance(MalformedURLException.class)) ? false : true;
    }

    private String b(f fVar) {
        return fVar.b(HttpHeaders.ETAG);
    }
}
