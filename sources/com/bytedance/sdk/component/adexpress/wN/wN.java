package com.bytedance.sdk.component.adexpress.wN;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.component.sdk.annotation.UiThread;
import com.bytedance.sdk.component.YFl.UZM;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class wN {
    private static volatile wN NjR = null;
    private static int qsH = 10;

    /* renamed from: vc, reason: collision with root package name */
    private static int f10432vc = 10;
    private static final byte[] wN = new byte[0];
    private final AtomicBoolean DSW = new AtomicBoolean(false);
    private List<com.bytedance.sdk.component.NjR.AlY> YFl = new ArrayList();
    private List<com.bytedance.sdk.component.NjR.AlY> Sg = new ArrayList();
    private Map<Integer, tN> tN = new HashMap();
    private Map<Integer, AlY> AlY = new HashMap();

    private wN() {
        com.bytedance.sdk.component.adexpress.YFl.YFl.tN tN = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN();
        if (tN != null) {
            f10432vc = tN.nc();
            qsH = tN.eT();
        }
    }

    private void DSW(com.bytedance.sdk.component.NjR.AlY alY) {
        alY.removeAllViews();
        alY.tN();
        alY.setWebChromeClient(null);
        alY.setWebViewClient(null);
        alY.setDownloadListener(null);
        alY.setJavaScriptEnabled(true);
        alY.setAppCacheEnabled(false);
        alY.setSupportZoom(false);
        alY.setUseWideViewPort(true);
        alY.setJavaScriptCanOpenWindowsAutomatically(true);
        alY.setDomStorageEnabled(true);
        alY.setBuiltInZoomControls(false);
        alY.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        alY.setLoadWithOverviewMode(false);
        alY.setDefaultTextEncodingName("UTF-8");
        alY.setDefaultFontSize(16);
    }

    public static wN YFl() {
        if (NjR == null) {
            synchronized (wN.class) {
                if (NjR == null) {
                    NjR = new wN();
                }
            }
        }
        return NjR;
    }

    public void AlY(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null) {
            return;
        }
        if (this.YFl.size() >= f10432vc) {
            try {
                Context context = alY.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                alY.YoT();
                return;
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
        if (this.YFl.contains(alY)) {
            return;
        }
        try {
            Context context2 = alY.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                alY.setRecycler(true);
                this.YFl.add(alY);
                tN();
            }
        } catch (Throwable th3) {
            tN();
            th3.getMessage();
        }
    }

    @UiThread
    public void Sg(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null) {
            return;
        }
        DSW(alY);
        alY.b_("SDK_INJECT_GLOBAL");
        vc(alY);
        YFl(alY);
    }

    @UiThread
    public void tN(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null) {
            return;
        }
        DSW(alY);
        alY.b_("SDK_INJECT_GLOBAL");
        vc(alY);
        AlY(alY);
    }

    public void vc(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null) {
            return;
        }
        tN tNVar = this.tN.get(Integer.valueOf(alY.hashCode()));
        if (tNVar != null) {
            tNVar.YFl(null);
        }
        alY.b_("SDK_INJECT_GLOBAL");
    }

    public boolean wN(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null) {
            return false;
        }
        try {
            Context context = alY.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            alY.YoT();
            return true;
        } catch (Throwable th2) {
            th2.getMessage();
            return true;
        }
    }

    public com.bytedance.sdk.component.NjR.AlY Sg(Context context, String str) {
        if (tN() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.AlY.wN.YFl(str) && tN() <= 1) {
            tN();
            return null;
        }
        com.bytedance.sdk.component.NjR.AlY remove = this.YFl.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                tN();
            }
            return remove;
        } catch (Throwable unused) {
            tN();
            return null;
        }
    }

    public int tN() {
        return this.YFl.size();
    }

    public com.bytedance.sdk.component.NjR.AlY YFl(Context context, String str) {
        if (AlY() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.AlY.wN.YFl(str) && AlY() <= 1) {
            AlY();
            return null;
        }
        com.bytedance.sdk.component.NjR.AlY remove = this.Sg.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                AlY();
            }
            return remove;
        } catch (Throwable unused) {
            AlY();
            return null;
        }
    }

    public int AlY() {
        return this.Sg.size();
    }

    public void Sg() {
        for (com.bytedance.sdk.component.NjR.AlY alY : this.YFl) {
            if (alY != null) {
                try {
                    Context context = alY.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    alY.YoT();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.YFl.clear();
        for (com.bytedance.sdk.component.NjR.AlY alY2 : this.Sg) {
            if (alY2 != null) {
                try {
                    Context context2 = alY2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    alY2.YoT();
                } catch (Throwable th3) {
                    th3.getMessage();
                }
            }
        }
        this.Sg.clear();
    }

    public void YFl(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null) {
            return;
        }
        if (this.Sg.size() >= qsH) {
            try {
                Context context = alY.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                alY.YoT();
                return;
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
        if (this.Sg.contains(alY)) {
            return;
        }
        try {
            Context context2 = alY.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                alY.setRecycler(true);
                this.Sg.add(alY);
                AlY();
            }
        } catch (Throwable th3) {
            AlY();
            th3.getMessage();
        }
    }

    public void Sg(int i10) {
        synchronized (wN) {
            qsH = i10;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void YFl(com.bytedance.sdk.component.NjR.AlY alY, Sg sg2) {
        if (alY == null || sg2 == null) {
            return;
        }
        tN tNVar = this.tN.get(Integer.valueOf(alY.hashCode()));
        if (tNVar != null) {
            tNVar.YFl(sg2);
        } else {
            tNVar = new tN(sg2);
            this.tN.put(Integer.valueOf(alY.hashCode()), tNVar);
        }
        alY.YFl(tNVar, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void YFl(WebView webView, UZM uzm, String str) {
        if (webView == null || uzm == null || TextUtils.isEmpty(str)) {
            return;
        }
        AlY alY = this.AlY.get(Integer.valueOf(webView.hashCode()));
        if (alY != null) {
            alY.YFl(uzm);
        } else {
            alY = new AlY(uzm);
            this.AlY.put(Integer.valueOf(webView.hashCode()), alY);
        }
        webView.addJavascriptInterface(alY, str);
    }

    public void YFl(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        AlY alY = this.AlY.get(Integer.valueOf(webView.hashCode()));
        if (alY != null) {
            alY.YFl(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void YFl(int i10) {
        synchronized (wN) {
            f10432vc = i10;
        }
    }
}
