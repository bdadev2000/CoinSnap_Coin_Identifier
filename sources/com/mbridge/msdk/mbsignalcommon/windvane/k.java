package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public final class k extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    WindVaneWebView f16709a;
    private d b;

    public k(WindVaneWebView windVaneWebView) {
        this.f16709a = windVaneWebView;
    }

    public final void a(d dVar) {
        this.b = dVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        c signalCommunication = this.f16709a.getSignalCommunication();
        if (signalCommunication != null) {
            String message = consoleMessage.message();
            if (TextUtils.isEmpty(message) || !message.startsWith("mv://")) {
                return false;
            }
            ad.a("H5_ENTRY", "onConsoleMessage: message.length() = " + message.length() + " " + message);
            if (message.contains("wv_hybrid:") && signalCommunication.a("wv_hybrid:")) {
                String substring = message.substring(0, message.lastIndexOf(" ") + 1);
                ad.a("H5_ENTRY", "message = " + substring);
                signalCommunication.b(substring);
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        ad.b("H5_ENTRY", str2 + "");
        c signalCommunication = this.f16709a.getSignalCommunication();
        if (signalCommunication != null && str3 != null && signalCommunication.a(str3)) {
            signalCommunication.b(str2);
            jsPromptResult.confirm("");
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i9) {
        super.onProgressChanged(webView, i9);
        d dVar = this.b;
        if (dVar != null) {
            dVar.b(webView, i9);
        }
    }
}
