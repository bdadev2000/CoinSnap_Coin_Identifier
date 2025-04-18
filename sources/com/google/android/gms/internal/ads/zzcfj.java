package com.google.android.gms.internal.ads;

import a4.j;
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
import vd.e;

/* loaded from: classes3.dex */
public final class zzcfj extends WebChromeClient {
    private final zzcfk zza;

    public zzcfj(zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcfk)) {
            return webView.getContext();
        }
        zzcfk zzcfkVar = (zzcfk) webView;
        Activity zzi = zzcfkVar.zzi();
        if (zzi != null) {
            return zzi;
        }
        return zzcfkVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcfk)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzL = ((zzcfk) webView).zzL();
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
        String g10 = e.g(j.p("JS: ", message, " (", sourceId, ":"), consoleMessage.lineNumber(), ")");
        if (g10.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = zzcfi.zza[consoleMessage.messageLevel().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    if (i10 != 5) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzi(g10);
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzm.zze(g10);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi(g10);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(g10);
            }
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzg(g10);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
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
    public final void onExceededDatabaseQuota(String str, String str2, long j3, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
        long j12 = 5242880 - j11;
        if (j12 <= 0) {
            quotaUpdater.updateQuota(j3);
            return;
        }
        if (j3 == 0) {
            if (j10 > j12 || j10 > 1048576) {
                j10 = 0;
            }
        } else if (j10 == 0) {
            j10 = Math.min(Math.min(131072L, j12) + j3, 1048576L);
        } else {
            if (j10 <= Math.min(1048576 - j3, j12)) {
                j3 += j10;
            }
            j10 = j3;
        }
        quotaUpdater.updateQuota(j10);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        if (callback != null) {
            zzcfk zzcfkVar = this.zza;
            com.google.android.gms.ads.internal.zzv.zzq();
            if (!com.google.android.gms.ads.internal.util.zzs.zzA(zzcfkVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzcfk zzcfkVar2 = this.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                if (!com.google.android.gms.ads.internal.util.zzs.zzA(zzcfkVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z10 = false;
                    callback.invoke(str, z10, true);
                }
            }
            z10 = true;
            callback.invoke(str, z10, true);
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
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zza.zzL();
        if (zzL == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzL.zzC(view, customViewCallback);
            zzL.zzA(i10);
        }
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        zzcfk zzcfkVar;
        com.google.android.gms.ads.internal.zzb zzd;
        try {
            zzcfkVar = this.zza;
        } catch (WindowManager.BadTokenException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to display Dialog.", e2);
        }
        if (zzcfkVar != null && zzcfkVar.zzN() != null && this.zza.zzN().zzd() != null && (zzd = this.zza.zzN().zzd()) != null && !zzd.zzc()) {
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzs.zzK(context);
        zzK.setTitle(str2);
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            zzK.setView(linearLayout).setPositiveButton(R.string.ok, new zzcfh(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcfg(jsPromptResult)).setOnCancelListener(new zzcff(jsPromptResult)).create().show();
        } else {
            zzK.setMessage(str3).setPositiveButton(R.string.ok, new zzcfe(jsResult)).setNegativeButton(R.string.cancel, new zzcfd(jsResult)).setOnCancelListener(new zzcfc(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
