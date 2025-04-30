package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC09948o {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"Qr1EFu0kx1tI01867m6ODqfSZ9SwtWDI", "3TYgkAWbIjP9kMvunjr7VwfmqgOZ7ZQ4", "kyx9q1x7DLL5BxK3faNs604Sw4dxbCMr", "cJW9lkVABx2P1Kp63XktrUnlRFV2zQAL", "nhxLXaLaMxGTsXNVJcvnwyCHZZV2RS3H", "y9xLyKazRl3zNBUnfIZmAOMjGK0AXhl4", "DTEqb4TbXnNBCaxA5atVnYK0pSb9DMUi", "fZvghiN"};
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{76, 55, 42, 46, 45, 34, 67, 45, Ascii.EM, 8, 5, 9, 2, Ascii.SI, 9, 34, 9, Ascii.CAN, Ascii.ESC, 3, Ascii.RS, 7, 42, 3, Ascii.RS, 45, 2, 8, Ascii.RS, 3, 5, 8, 87, 42, 46, 63, 34, 67, 71, 87, 42, 46, 45, 58, 67, 81, 44, 40, 40, 60, 69, 101, Ascii.CAN, Ascii.FS, Ascii.DC2, Ascii.GS, 113, Ascii.RS, 99, 103, 118, 115, 10, 32, 36, 39, 36, 73, Ascii.DLE, Ascii.DC4, 0, 5, 121, 94, 71, 81, 64, 91, 66, 66, Ascii.DC4, 47, 42, 47, 46, 54, 47, 1, Ascii.CAN, Ascii.DC4, Ascii.SYN, 85, Ascii.GS, Ascii.SUB, Ascii.CAN, Ascii.RS, Ascii.EM, Ascii.DC4, Ascii.DC4, Ascii.DLE, 85, Ascii.SUB, Ascii.US, 8, 85, Ascii.DC2, Ascii.NAK, Ascii.SI, Ascii.RS, 9, Ascii.NAK, Ascii.SUB, Ascii.ETB, 85, Ascii.SO, Ascii.SUB, 53, 55, 60, 55, 32, 59, 49, 49, 45, 45, 41, 119, 56, 62, 60, 55, 45, 38, 32, 54, 33, Ascii.FF, 50, 52, 54, 61, 39, 60, 58, 44, 59, Ascii.SYN, 40, 46, 44, 39, 61, Ascii.SYN, 37, 40, 58, 61, Ascii.SYN, 59, 44, 47, 59, 44, 58, 33, 48, 34, 37, Ascii.CAN, 49, 46, 34, 48};
    }

    static {
        A08();
        A00 = A00(80, 7, 82);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    public static String A01(C09647f c09647f) {
        return WebSettings.getDefaultUserAgent(c09647f);
    }

    public static String A02(final C09647f c09647f) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.8n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final String call() {
                AtomicReference atomicReference;
                AtomicReference atomicReference2;
                atomicReference = AbstractC09948o.A04;
                String browserUserAgent = (String) atomicReference.get();
                if (browserUserAgent != null) {
                    return browserUserAgent;
                }
                WebView webView = new WebView(C09647f.this.getApplicationContext());
                webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.ads.redexgen.X.8m
                    @Override // android.webkit.WebViewClient
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        NY.A02(C8A.A2h);
                        return true;
                    }
                });
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    atomicReference2 = AbstractC09948o.A04;
                    atomicReference2.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i9 = 0; i9 < 3; i9++) {
            ExecutorC1297Li.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th) {
                A09(c09647f, th);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C09647f c09647f, C8K c8k) {
        String A07 = c8k.A07();
        if (TextUtils.isEmpty(A07)) {
            boolean andSet = A03.getAndSet(true);
            String[] strArr = A02;
            if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "SlGltdwaGCQXXY2U2bjZ1NfeES9SOW6r";
            strArr2[0] = "AnJMWH4pc3dV3Xqon1tLsffrk7nZCcYt";
            if (!andSet) {
                AnonymousClass89 A072 = c09647f.A07();
                int i9 = C8A.A1Z;
                String bundle = A00(73, 7, 29);
                C8B c8b = new C8B(bundle);
                String bundle2 = A00(116, 7, 65);
                A072.A9a(bundle2, i9, c8b);
            }
        }
        return A07;
    }

    public static String A04(C09647f c09647f, boolean z8) {
        if (c09647f == null) {
            return A00;
        }
        if (z8) {
            return System.getProperty(A00(123, 10, 74));
        }
        AtomicReference<String> atomicReference = A04;
        String str = atomicReference.get();
        if (str != null) {
            return str;
        }
        long A012 = AbstractC1224Ig.A01(c09647f);
        String A002 = A00(143, 23, 90);
        String A003 = A00(133, 10, 64);
        String userAgentString = A00(88, 28, 104);
        if (A012 > 0) {
            SharedPreferences sharedPreferences = c09647f.getSharedPreferences(ProcessUtils.getProcessSpecificName(userAgentString, c09647f), 0);
            String string = sharedPreferences.getString(A003, null);
            long spUserAgentRefresh = sharedPreferences.getLong(A002, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - spUserAgentRefresh < A012) {
                atomicReference.set(string);
                return string;
            }
        }
        String str2 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                str2 = A01(c09647f);
                atomicReference.set(str2);
            } catch (Throwable t9) {
                A09(c09647f, t9);
            }
        }
        if (str2 == null) {
            str2 = A02(c09647f);
        }
        if (str2 == null) {
            String str3 = A00;
            String[] strArr = A02;
            String str4 = strArr[2];
            String browserUserAgent = strArr[6];
            if (str4.charAt(19) == browserUserAgent.charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "StKvz6zSFpxDJ9oVJdJRJeNQczVDnPLD";
            strArr2[3] = "N8R2WFi4AoJsdw6tflYfsN6oN8Vo9HPM";
            return str3;
        }
        if (A012 > 0) {
            SharedPreferences sharedPreferences2 = c09647f.getSharedPreferences(ProcessUtils.getProcessSpecificName(userAgentString, c09647f), 0);
            sharedPreferences2.edit().putString(A003, A04.get()).apply();
            sharedPreferences2.edit().putLong(A002, System.currentTimeMillis()).apply();
        }
        return str2;
    }

    public static String A05(C8K c8k, C09647f c09647f) {
        if (AbstractC1224Ig.A04(c09647f)) {
            return A00(63, 5, 117) + A03(c09647f, c8k) + A00(39, 6, 127) + c8k.A06() + A00(45, 6, 121) + c8k.A04() + A00(38, 1, 111);
        }
        return A00(0, 0, 40);
    }

    public static String A06(C8K c8k, C09647f c09647f, boolean z8) {
        return A04(c09647f, z8) + A00(0, 38, 127) + c09647f.A04().A8H() + A00(57, 6, 54) + C8K.A04 + A00(38, 1, 111) + A05(c8k, c09647f) + A00(68, 5, 69) + c09647f.A04().A8I() + A00(51, 6, 77) + Locale.getDefault().toString() + A00(87, 1, 79);
    }

    public static void A09(C09647f c09647f, Throwable th) {
        c09647f.A07().A9a(A00(166, 8, 84), C8A.A2g, new C8B(th));
    }
}
