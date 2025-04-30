package com.bytedance.sdk.component.adexpress.COT;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.zp.RCv;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class jU {
    private WeakReference<RCv> zp;

    public jU(RCv rCv) {
        this.zp = new WeakReference<>(rCv);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<RCv> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            this.zp.get().invokeMethod(str);
        }
    }

    public void zp(RCv rCv) {
        this.zp = new WeakReference<>(rCv);
    }
}
