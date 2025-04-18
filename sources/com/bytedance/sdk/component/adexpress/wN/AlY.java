package com.bytedance.sdk.component.adexpress.wN;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.YFl.UZM;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class AlY {
    private WeakReference<UZM> YFl;

    public AlY(UZM uzm) {
        this.YFl = new WeakReference<>(uzm);
    }

    public void YFl(UZM uzm) {
        this.YFl = new WeakReference<>(uzm);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<UZM> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            this.YFl.get().invokeMethod(str);
        }
    }
}
