package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class NU extends WebChromeClient {
    public static byte[] A03;
    public static String[] A04 = {"YcV2lPdb1GD", "n5DgX5QSw4FQX59vcvxBmCs4C4mD4", "EksZFw55Ld98qazTViJtw6pSuONG6", "FQxvmp8vruM", "8OOSEuFQ7OrFhHkYKSo1UtYVyasxVGnA", "3ltH6wFp1GB97FT9l8RHOrWs4kHkX0iG", "Qgk2ZsNAH7VHvpqjGWkwA7olVBMIpezg", "lYuGhUBeP576iz9ihjd4qaMvDoX6gejl"};
    public final WeakReference<C1070Yn> A00;
    public final WeakReference<NS> A01;
    public final WeakReference<NO> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 79;
            if (A04[5].charAt(31) != 'G') {
                throw new RuntimeException();
            }
            A04[4] = "SJN5rebrF3WLAsOm1fkdotQMSgQRMUzH";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-108, -103, -108, 5, 40, 43, 36, -33, 2, 39, 46, 46, 50, 36, 49, -21, -8, -18, -4, -7, -13, -18, -72, -13, -8, -2, -17, -8, -2, -72, -21, -19, -2, -13, -7, -8, -72, -47, -49, -34, -23, -51, -39, -40, -34, -49, -40, -34, -53, -40, -50, -36, -39, -45, -50, -104, -45, -40, -34, -49, -40, -34, -104, -51, -53, -34, -49, -47, -39, -36, -29, -104, -71, -70, -81, -72, -85, -84, -74, -81, Ascii.FF, -6, -9, -12, Ascii.VT, -2, -6, Ascii.FF};
    }

    static {
        A01();
    }

    public NU(WeakReference<C1070Yn> weakReference, WeakReference<NS> weakReference2, WeakReference<NO> weakReference3) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
        this.A02 = weakReference3;
    }

    private boolean A02(ValueCallback valueCallback) {
        boolean z10;
        ValueCallback valueCallback2;
        ValueCallback valueCallback3;
        C1070Yn c1070Yn = this.A00.get();
        if (c1070Yn != null && c1070Yn.A0D() != null) {
            z10 = U1.A09;
            if (z10) {
                valueCallback2 = U1.A08;
                if (valueCallback2 != null) {
                    valueCallback3 = U1.A08;
                    valueCallback3.onReceiveValue(null);
                    ValueCallback unused = U1.A08 = null;
                }
                ValueCallback unused2 = U1.A08 = valueCallback;
                try {
                    Intent intent = new Intent(A00(15, 33, 59));
                    intent.addCategory(A00(48, 32, 27));
                    intent.setType(A00(0, 3, 27));
                    c1070Yn.A0D().startActivityForResult(Intent.createChooser(intent, A00(3, 12, 112)), 1001);
                    return true;
                } catch (Exception e2) {
                    c1070Yn.A07().A9b(A00(80, 8, 70), C8A.A2b, new C8B(e2));
                    ValueCallback unused3 = U1.A08 = null;
                    return false;
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        NO no = this.A02.get();
        if (!TextUtils.isEmpty(message) && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.LOG && no != null) {
            no.A04(message);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        NO timingLogger = this.A02.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        NS ns = this.A01.get();
        if (ns != null) {
            ns.ACn(i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        NS listener = this.A01.get();
        if (listener != null) {
            listener.ACq(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return A02(filePathCallback);
    }
}
