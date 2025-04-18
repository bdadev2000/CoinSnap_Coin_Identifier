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
    private static final AtomicReference a = new AtomicReference();

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
        String str = (String) a.get();
        if (StringUtils.isValidString(str)) {
            return str;
        }
        URL b3 = b();
        BufferedReader bufferedReader = null;
        if (b3 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (((Boolean) kVar.a(oj.M)).booleanValue()) {
            try {
                InputStream a10 = kVar.D().a(b3.toString(), (List) null, false, new s2());
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(a10));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                            sb2.append("\n");
                        } finally {
                        }
                    }
                    bufferedReader2.close();
                    if (a10 != null) {
                        a10.close();
                    }
                } finally {
                }
            } catch (Throwable th2) {
                kVar.L().a("OpenMeasurementTestParameters", th2);
                kVar.B().a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th2);
            }
        } else {
            try {
                inputStream = kVar.D().a(b3.toString(), (List) null, false, new s2());
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String readLine2 = bufferedReader3.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            sb2.append(readLine2);
                            sb2.append("\n");
                        } catch (Throwable unused) {
                            bufferedReader = bufferedReader3;
                            zp.a((Closeable) inputStream, kVar);
                            zp.a((Closeable) bufferedReader, kVar);
                            String sb3 = sb2.toString();
                            a.set(sb3);
                            return sb3;
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
        String sb32 = sb2.toString();
        a.set(sb32);
        return sb32;
    }
}
