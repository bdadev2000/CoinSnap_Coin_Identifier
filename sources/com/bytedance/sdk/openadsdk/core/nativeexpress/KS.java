package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class KS {
    private static volatile KS KS;
    private static int lMd;
    private final List<DspHtmlWebView> zp = new ArrayList();

    public static KS zp() {
        if (KS == null) {
            synchronized (KS.class) {
                try {
                    if (KS == null) {
                        KS = new KS();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return KS;
    }

    public int KS() {
        return this.zp.size();
    }

    @Nullable
    public DspHtmlWebView lMd() {
        DspHtmlWebView remove;
        if (KS() > 0 && (remove = this.zp.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void KS(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView == null || dspHtmlWebView.getWebView() == null) {
            return;
        }
        if (dspHtmlWebView.getParent() != null) {
            ((ViewGroup) dspHtmlWebView.getParent()).removeView(dspHtmlWebView);
        }
        try {
            dspHtmlWebView.removeAllViews();
            dspHtmlWebView.KS();
            dspHtmlWebView.setWebChromeClient(null);
            dspHtmlWebView.setWebViewClient(null);
            dspHtmlWebView.setDownloadListener(null);
            dspHtmlWebView.setDefaultTextEncodingName("UTF-8");
            dspHtmlWebView.setAllowFileAccess(false);
            dspHtmlWebView.setJavaScriptEnabled(true);
            dspHtmlWebView.setAppCacheEnabled(true);
            dspHtmlWebView.setDatabaseEnabled(true);
            dspHtmlWebView.setSupportZoom(false);
            dspHtmlWebView.getWebView().setLayerType(0, null);
            dspHtmlWebView.setBackgroundColor(0);
            dspHtmlWebView.getWebView().setHorizontalScrollBarEnabled(false);
            dspHtmlWebView.getWebView().setHorizontalScrollbarOverlay(false);
            dspHtmlWebView.getWebView().setVerticalScrollBarEnabled(false);
            dspHtmlWebView.getWebView().setVerticalScrollbarOverlay(false);
            dspHtmlWebView.zp(true);
            dspHtmlWebView.dT();
            dspHtmlWebView.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void lMd(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView != null) {
            if (this.zp.size() >= lMd) {
                dspHtmlWebView.vDp();
            } else {
                if (this.zp.contains(dspHtmlWebView)) {
                    return;
                }
                KS(dspHtmlWebView);
                this.zp.add(dspHtmlWebView);
            }
        }
    }

    public void zp(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView != null) {
            lMd(dspHtmlWebView);
        }
    }
}
