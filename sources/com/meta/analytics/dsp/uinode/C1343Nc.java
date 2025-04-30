package com.meta.analytics.dsp.uinode;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1343Nc extends WebChromeClient {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-91, -47, -48, -43, -47, -50, -57, -126, -49, -57, -43, -43, -61, -55, -57, -100, -126, -102, -67, -81, -78, -73, -68, -75, 110, -66, -64, -67, -75, -64, -77, -63, -63, -120, 110};
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (BuildConfigApi.isDebug()) {
            String str = A00(0, 17, 30) + consoleMessage.message();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i9) {
        if (BuildConfigApi.isDebug()) {
            String str = A00(17, 18, 10) + i9;
        }
    }
}
