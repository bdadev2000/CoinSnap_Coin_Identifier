package com.bytedance.sdk.component.adexpress.COT;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class KS {
    private WeakReference<lMd> zp;

    public KS(lMd lmd) {
        this.zp = new WeakReference<>(lmd);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get();
        }
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            return this.zp.get().adInfo();
        }
        return "";
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            return this.zp.get().appInfo();
        }
        return "";
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().changeVideoState(str);
        }
    }

    @JavascriptInterface
    public void chooseAdResult(String str) {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().chooseAdResult(str);
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().clickEvent(str);
        }
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().dynamicTrack(str);
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            return this.zp.get().getCurrentVideoState();
        }
        return "";
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            return this.zp.get().getTemplateInfo();
        }
        return "";
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().initRenderFinish();
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().muteVideo(str);
        }
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().renderDidFinish(str);
        }
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().zp(str);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<lMd> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().skipVideo();
        }
    }

    public void zp(lMd lmd) {
        this.zp = new WeakReference<>(lmd);
    }
}
