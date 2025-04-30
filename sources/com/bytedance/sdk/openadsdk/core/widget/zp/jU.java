package com.bytedance.sdk.openadsdk.core.widget.zp;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.lMd.dT;
import com.bytedance.sdk.openadsdk.utils.dQp;

/* loaded from: classes.dex */
public class jU extends WebChromeClient {
    private static final String zp = "WebChromeClient";
    private dT KS;
    private final RCv lMd;

    public jU(RCv rCv, dT dTVar) {
        this.lMd = rCv;
        this.KS = dTVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i9, String str2) {
        if (!TextUtils.isEmpty(str)) {
            zp(str);
        }
        super.onConsoleMessage(str, i9, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i9) {
        super.onProgressChanged(webView, i9);
        dT dTVar = this.KS;
        if (dTVar != null) {
            dTVar.zp(webView, i9);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    private boolean zp(@NonNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                tG.KS().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.zp.jU.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dQp.zp(Uri.parse(str), jU.this.lMd);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !zp(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }
}
