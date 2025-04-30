package com.bytedance.sdk.component.adexpress.COT;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.component.sdk.annotation.UiThread;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.component.zp.RCv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class COT {
    private static final byte[] COT = new byte[0];
    private static int HWF = 10;
    private static volatile COT YW = null;
    private static int ku = 10;
    private final AtomicBoolean QR = new AtomicBoolean(false);
    private List<SSWebView> zp = new ArrayList();
    private List<SSWebView> lMd = new ArrayList();
    private Map<Integer, KS> KS = new HashMap();
    private Map<Integer, jU> jU = new HashMap();

    private COT() {
        com.bytedance.sdk.component.adexpress.zp.zp.KS KS = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS();
        if (KS != null) {
            HWF = KS.dT();
            ku = KS.Bj();
        }
    }

    private void QR(SSWebView sSWebView) {
        sSWebView.removeAllViews();
        sSWebView.KS();
        sSWebView.setWebChromeClient(null);
        sSWebView.setWebViewClient(null);
        sSWebView.setDownloadListener(null);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setAppCacheEnabled(false);
        sSWebView.setSupportZoom(false);
        sSWebView.setUseWideViewPort(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setBuiltInZoomControls(false);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        sSWebView.setLoadWithOverviewMode(false);
        sSWebView.setDefaultTextEncodingName("UTF-8");
        sSWebView.setDefaultFontSize(16);
    }

    public static COT zp() {
        if (YW == null) {
            synchronized (COT.class) {
                try {
                    if (YW == null) {
                        YW = new COT();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return YW;
    }

    public boolean COT(SSWebView sSWebView) {
        if (sSWebView == null) {
            return false;
        }
        try {
            Context context = sSWebView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            sSWebView.vDp();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void HWF(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        KS ks = this.KS.get(Integer.valueOf(sSWebView.hashCode()));
        if (ks != null) {
            ks.zp(null);
        }
        sSWebView.b_("SDK_INJECT_GLOBAL");
    }

    @UiThread
    public void KS(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        QR(sSWebView);
        sSWebView.b_("SDK_INJECT_GLOBAL");
        HWF(sSWebView);
        jU(sSWebView);
    }

    public void jU(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.zp.size() >= HWF) {
            try {
                Context context = sSWebView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                sSWebView.vDp();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.zp.contains(sSWebView)) {
            return;
        }
        try {
            Context context2 = sSWebView.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                sSWebView.setRecycler(true);
                this.zp.add(sSWebView);
                KS();
            }
        } catch (Throwable th2) {
            KS();
            th2.getMessage();
        }
    }

    @UiThread
    public void lMd(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        QR(sSWebView);
        sSWebView.b_("SDK_INJECT_GLOBAL");
        HWF(sSWebView);
        zp(sSWebView);
    }

    public int KS() {
        return this.zp.size();
    }

    public SSWebView lMd(Context context, String str) {
        if (KS() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.jU.jU.zp(str) && KS() <= 1) {
            KS();
            return null;
        }
        SSWebView remove = this.zp.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                KS();
            }
            return remove;
        } catch (Throwable unused) {
            KS();
            return null;
        }
    }

    public SSWebView zp(Context context, String str) {
        if (jU() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.jU.jU.zp(str) && jU() <= 1) {
            jU();
            return null;
        }
        SSWebView remove = this.lMd.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                jU();
            }
            return remove;
        } catch (Throwable unused) {
            jU();
            return null;
        }
    }

    public int jU() {
        return this.lMd.size();
    }

    public void lMd() {
        for (SSWebView sSWebView : this.zp) {
            if (sSWebView != null) {
                try {
                    Context context = sSWebView.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    sSWebView.vDp();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.zp.clear();
        for (SSWebView sSWebView2 : this.lMd) {
            if (sSWebView2 != null) {
                try {
                    Context context2 = sSWebView2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    sSWebView2.vDp();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.lMd.clear();
    }

    public void zp(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.lMd.size() >= ku) {
            try {
                Context context = sSWebView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                sSWebView.vDp();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.lMd.contains(sSWebView)) {
            return;
        }
        try {
            Context context2 = sSWebView.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                sSWebView.setRecycler(true);
                this.lMd.add(sSWebView);
                jU();
            }
        } catch (Throwable th2) {
            jU();
            th2.getMessage();
        }
    }

    public void lMd(int i9) {
        synchronized (COT) {
            ku = i9;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void zp(SSWebView sSWebView, lMd lmd) {
        if (sSWebView == null || lmd == null) {
            return;
        }
        KS ks = this.KS.get(Integer.valueOf(sSWebView.hashCode()));
        if (ks != null) {
            ks.zp(lmd);
        } else {
            ks = new KS(lmd);
            this.KS.put(Integer.valueOf(sSWebView.hashCode()), ks);
        }
        sSWebView.zp(ks, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void zp(WebView webView, RCv rCv, String str) {
        if (webView == null || rCv == null || TextUtils.isEmpty(str)) {
            return;
        }
        jU jUVar = this.jU.get(Integer.valueOf(webView.hashCode()));
        if (jUVar != null) {
            jUVar.zp(rCv);
        } else {
            jUVar = new jU(rCv);
            this.jU.put(Integer.valueOf(webView.hashCode()), jUVar);
        }
        webView.addJavascriptInterface(jUVar, str);
    }

    public void zp(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        jU jUVar = this.jU.get(Integer.valueOf(webView.hashCode()));
        if (jUVar != null) {
            jUVar.zp(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void zp(int i9) {
        synchronized (COT) {
            HWF = i9;
        }
    }
}
