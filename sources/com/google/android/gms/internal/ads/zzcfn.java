package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.internal.security.CertificateUtil;

/* loaded from: classes3.dex */
public final class zzcfn extends WebChromeClient {
    private final zzcfo zza;

    public zzcfn(zzcfo zzcfoVar) {
        this.zza = zzcfoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcfo)) {
            return webView.getContext();
        }
        zzcfo zzcfoVar = (zzcfo) webView;
        Activity zzi = zzcfoVar.zzi();
        return zzi != null ? zzi : zzcfoVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcfo)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzL = ((zzcfo) webView).zzL();
        if (zzL == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        String n2 = androidx.compose.foundation.text.input.a.n(androidx.compose.foundation.text.input.a.t("JS: ", message, " (", sourceId, CertificateUtil.DELIMITER), consoleMessage.lineNumber(), ")");
        if (n2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i2 = zzcfm.zza[consoleMessage.messageLevel().ordinal()];
        if (i2 == 1) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg(n2);
        } else if (i2 == 2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(n2);
        } else if (i2 == 3 || i2 == 4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi(n2);
        } else if (i2 != 5) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi(n2);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zze(n2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z2, boolean z3, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        long j5 = 5242880 - j4;
        if (j5 <= 0) {
            quotaUpdater.updateQuota(j2);
            return;
        }
        if (j2 == 0) {
            if (j3 > j5 || j3 > 1048576) {
                j3 = 0;
            }
        } else if (j3 == 0) {
            j3 = Math.min(Math.min(131072L, j5) + j2, 1048576L);
        } else {
            if (j3 <= Math.min(1048576 - j2, j5)) {
                j2 += j3;
            }
            j3 = j2;
        }
        quotaUpdater.updateQuota(j3);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z2;
        if (callback != null) {
            zzcfo zzcfoVar = this.zza;
            com.google.android.gms.ads.internal.zzu.zzp();
            if (!com.google.android.gms.ads.internal.util.zzt.zzA(zzcfoVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzcfo zzcfoVar2 = this.zza;
                com.google.android.gms.ads.internal.zzu.zzp();
                if (!com.google.android.gms.ads.internal.util.zzt.zzA(zzcfoVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z2 = false;
                    callback.invoke(str, z2, true);
                }
            }
            z2 = true;
            callback.invoke(str, z2, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zza.zzL();
        if (zzL == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zza.zzL();
        if (zzL == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzL.zzC(view, customViewCallback);
            zzL.zzA(i2);
        }
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z2) {
        zzcfo zzcfoVar;
        com.google.android.gms.ads.internal.zzb zzd;
        try {
            zzcfoVar = this.zza;
        } catch (WindowManager.BadTokenException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to display Dialog.", e);
        }
        if (zzcfoVar != null && zzcfoVar.zzN() != null && this.zza.zzN().zzd() != null && (zzd = this.zza.zzN().zzd()) != null && !zzd.zzc()) {
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(context);
        zzK.setTitle(str2);
        if (z2) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            zzK.setView(linearLayout).setPositiveButton(R.string.ok, new zzcfl(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcfk(jsPromptResult)).setOnCancelListener(new zzcfj(jsPromptResult)).create().show();
        } else {
            zzK.setMessage(str3).setPositiveButton(R.string.ok, new zzcfi(jsResult)).setNegativeButton(R.string.cancel, new zzcfh(jsResult)).setOnCancelListener(new zzcfg(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
