package com.bytedance.sdk.openadsdk.core.qsH;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AlY {
    private static int Sg;
    private static volatile AlY tN;
    private final List<wN> YFl = new ArrayList();

    public static AlY YFl() {
        if (tN == null) {
            synchronized (AlY.class) {
                if (tN == null) {
                    tN = new AlY();
                }
            }
        }
        return tN;
    }

    @Nullable
    public wN Sg() {
        wN remove;
        if (tN() > 0 && (remove = this.YFl.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    public int tN() {
        return this.YFl.size();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void tN(wN wNVar) {
        if (wNVar == null || wNVar.getWebView() == null) {
            return;
        }
        if (wNVar.getParent() != null) {
            ((ViewGroup) wNVar.getParent()).removeView(wNVar);
        }
        try {
            wNVar.removeAllViews();
            wNVar.tN();
            wNVar.setWebChromeClient(null);
            wNVar.setWebViewClient(null);
            wNVar.setDownloadListener(null);
            wNVar.setDefaultTextEncodingName("UTF-8");
            wNVar.setAllowFileAccess(false);
            wNVar.setJavaScriptEnabled(true);
            wNVar.setAppCacheEnabled(true);
            wNVar.setDatabaseEnabled(true);
            wNVar.setSupportZoom(false);
            wNVar.getWebView().setLayerType(0, null);
            wNVar.setBackgroundColor(0);
            wNVar.getWebView().setHorizontalScrollBarEnabled(false);
            wNVar.getWebView().setHorizontalScrollbarOverlay(false);
            wNVar.getWebView().setVerticalScrollBarEnabled(false);
            wNVar.getWebView().setVerticalScrollbarOverlay(false);
            wNVar.YFl(true);
            wNVar.nc();
            wNVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void Sg(wN wNVar) {
        if (wNVar != null) {
            if (this.YFl.size() >= Sg) {
                wNVar.YoT();
            } else {
                if (this.YFl.contains(wNVar)) {
                    return;
                }
                tN(wNVar);
                this.YFl.add(wNVar);
            }
        }
    }

    public void YFl(wN wNVar) {
        if (wNVar != null) {
            Sg(wNVar);
        }
    }
}
