package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class ng {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f9338a = new AtomicReference();

    public static String a() {
        return "iabtechlab-Applovin";
    }

    public static URL b() {
        try {
            return new URL("https://compliance.iabtechnologylab.com/compliance-js/omid-validation-verification-script-v1-APPLOVIN-01102024.js");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c() {
        return "iabtechlab.com-omid";
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        InputStream inputStream;
        String str = (String) f9338a.get();
        if (StringUtils.isValidString(str)) {
            return str;
        }
        URL b = b();
        BufferedReader bufferedReader = null;
        if (b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (((Boolean) kVar.a(oj.f9629M)).booleanValue()) {
            try {
                InputStream a6 = kVar.D().a(b.toString(), (List) null, false, new C0748s2());
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(a6));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                            sb.append("\n");
                        } catch (Throwable th) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    if (a6 != null) {
                        a6.close();
                    }
                } finally {
                }
            } catch (Throwable th3) {
                kVar.L().a("OpenMeasurementTestParameters", th3);
                kVar.B().a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th3);
            }
        } else {
            try {
                inputStream = kVar.D().a(b.toString(), (List) null, false, new C0748s2());
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String readLine2 = bufferedReader3.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            sb.append(readLine2);
                            sb.append("\n");
                        } catch (Throwable unused) {
                            bufferedReader = bufferedReader3;
                            zp.a((Closeable) inputStream, kVar);
                            zp.a((Closeable) bufferedReader, kVar);
                            String sb2 = sb.toString();
                            f9338a.set(sb2);
                            return sb2;
                        }
                    }
                    zp.a((Closeable) inputStream, kVar);
                    zp.a((Closeable) bufferedReader3, kVar);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                inputStream = null;
            }
        }
        String sb22 = sb.toString();
        f9338a.set(sb22);
        return sb22;
    }
}
