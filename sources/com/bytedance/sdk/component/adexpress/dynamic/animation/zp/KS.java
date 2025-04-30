package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class KS {
    private static volatile KS zp;

    private KS() {
    }

    public static KS zp() {
        if (zp == null) {
            synchronized (KS.class) {
                try {
                    if (zp == null) {
                        zp = new KS();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public jU zp(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        if (zpVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(zpVar.YW())) {
            return new Bj(view, zpVar);
        }
        if ("translate".equals(zpVar.YW())) {
            return new dQp(view, zpVar);
        }
        if ("ripple".equals(zpVar.YW())) {
            return new ku(view, zpVar);
        }
        if ("marquee".equals(zpVar.YW())) {
            return new QR(view, zpVar);
        }
        if ("waggle".equals(zpVar.YW())) {
            return new KVG(view, zpVar);
        }
        if ("shine".equals(zpVar.YW())) {
            return new vDp(view, zpVar);
        }
        if ("swing".equals(zpVar.YW())) {
            return new rV(view, zpVar);
        }
        if ("fade".equals(zpVar.YW())) {
            return new zp(view, zpVar);
        }
        if ("rubIn".equals(zpVar.YW())) {
            return new dT(view, zpVar);
        }
        if ("rotate".equals(zpVar.YW())) {
            return new YW(view, zpVar);
        }
        if ("cutIn".equals(zpVar.YW())) {
            return new HWF(view, zpVar);
        }
        if ("stretch".equals(zpVar.YW())) {
            return new tG(view, zpVar);
        }
        if ("bounce".equals(zpVar.YW())) {
            return new COT(view, zpVar);
        }
        return null;
    }
}
