package com.bytedance.sdk.component.adexpress.wN;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class tN {
    private WeakReference<Sg> YFl;

    public tN(Sg sg2) {
        this.YFl = new WeakReference<>(sg2);
    }

    public void YFl(Sg sg2) {
        this.YFl = new WeakReference<>(sg2);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get();
        }
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            return this.YFl.get().adInfo();
        }
        return "";
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            return this.YFl.get().appInfo();
        }
        return "";
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get().changeVideoState(str);
        }
    }

    @JavascriptInterface
    public void chooseAdResult(String str) {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get().chooseAdResult(str);
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get().clickEvent(str);
        }
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get().dynamicTrack(str);
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            return this.YFl.get().getCurrentVideoState();
        }
        return "";
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            return this.YFl.get().getData(str);
        }
        return "";
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            return this.YFl.get().getTemplateInfo();
        }
        return "";
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get().initRenderFinish();
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get().muteVideo(str);
        }
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get().renderDidFinish(str);
        }
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get().YFl(str);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<Sg> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get().skipVideo();
        }
    }
}
