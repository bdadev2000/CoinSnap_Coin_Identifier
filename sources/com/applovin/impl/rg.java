package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class rg {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f26307a = new AtomicReference();

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

    public static String a(com.applovin.impl.sdk.j jVar) {
        InputStream inputStream;
        String str = (String) f26307a.get();
        if (StringUtils.isValidString(str)) {
            return str;
        }
        URL b2 = b();
        BufferedReader bufferedReader = null;
        if (b2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (((Boolean) jVar.a(sj.D)).booleanValue()) {
            try {
                InputStream a2 = jVar.B().a(b2.toString(), null, false, new u2());
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(a2));
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
                    if (a2 != null) {
                        a2.close();
                    }
                } finally {
                }
            } catch (Throwable th3) {
                jVar.J().a("OpenMeasurementTestParameters", th3);
                jVar.E().a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th3);
            }
        } else {
            try {
                inputStream = jVar.B().a(b2.toString(), null, false, new u2());
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
                            yp.a(inputStream, jVar);
                            yp.a(bufferedReader, jVar);
                            String sb2 = sb.toString();
                            f26307a.set(sb2);
                            return sb2;
                        }
                    }
                    yp.a(inputStream, jVar);
                    yp.a(bufferedReader3, jVar);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                inputStream = null;
            }
        }
        String sb22 = sb.toString();
        f26307a.set(sb22);
        return sb22;
    }
}
