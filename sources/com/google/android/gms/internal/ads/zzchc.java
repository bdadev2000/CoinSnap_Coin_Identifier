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
import com.mbridge.msdk.foundation.entity.o;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzchc extends WebChromeClient {
    private final zzchd zza;

    public zzchc(zzchd zzchdVar) {
        this.zza = zzchdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzchd)) {
            return webView.getContext();
        }
        zzchd zzchdVar = (zzchd) webView;
        Activity zzi = zzchdVar.zzi();
        if (zzi != null) {
            return zzi;
        }
        return zzchdVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzchd)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzL = ((zzchd) webView).zzL();
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
        String g9 = AbstractC2914a.g(o.o("JS: ", message, " (", sourceId, ":"), consoleMessage.lineNumber(), ")");
        if (g9.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i9 = zzchb.zza[consoleMessage.messageLevel().ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3 && i9 != 4) {
                    if (i9 != 5) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzi(g9);
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzm.zze(g9);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi(g9);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(g9);
            }
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzg(g9);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z8, boolean z9, Message message) {
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
    public final void onExceededDatabaseQuota(String str, String str2, long j7, long j9, long j10, WebStorage.QuotaUpdater quotaUpdater) {
        long j11 = 5242880 - j10;
        if (j11 <= 0) {
            quotaUpdater.updateQuota(j7);
            return;
        }
        if (j7 == 0) {
            if (j9 > j11 || j9 > 1048576) {
                j9 = 0;
            }
        } else if (j9 == 0) {
            j9 = Math.min(Math.min(131072L, j11) + j7, 1048576L);
        } else {
            if (j9 <= Math.min(1048576 - j7, j11)) {
                j7 += j9;
            }
            j9 = j7;
        }
        quotaUpdater.updateQuota(j9);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z8;
        if (callback != null) {
            zzchd zzchdVar = this.zza;
            com.google.android.gms.ads.internal.zzu.zzp();
            if (!com.google.android.gms.ads.internal.util.zzt.zzA(zzchdVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzchd zzchdVar2 = this.zza;
                com.google.android.gms.ads.internal.zzu.zzp();
                if (!com.google.android.gms.ads.internal.util.zzt.zzA(zzchdVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z8 = false;
                    callback.invoke(str, z8, true);
                }
            }
            z8 = true;
            callback.invoke(str, z8, true);
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
    public final void onShowCustomView(View view, int i9, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zza.zzL();
        if (zzL == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzL.zzC(view, customViewCallback);
            zzL.zzA(i9);
        }
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z8) {
        zzchd zzchdVar;
        com.google.android.gms.ads.internal.zzb zzd;
        try {
            zzchdVar = this.zza;
        } catch (WindowManager.BadTokenException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to display Dialog.", e4);
        }
        if (zzchdVar != null && zzchdVar.zzN() != null && this.zza.zzN().zzd() != null && (zzd = this.zza.zzN().zzd()) != null && !zzd.zzc()) {
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(context);
        zzK.setTitle(str2);
        if (z8) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            zzK.setView(linearLayout).setPositiveButton(R.string.ok, new zzcha(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcgz(jsPromptResult)).setOnCancelListener(new zzcgy(jsPromptResult)).create().show();
        } else {
            zzK.setMessage(str3).setPositiveButton(R.string.ok, new zzcgx(jsResult)).setNegativeButton(R.string.cancel, new zzcgw(jsResult)).setOnCancelListener(new zzcgv(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
