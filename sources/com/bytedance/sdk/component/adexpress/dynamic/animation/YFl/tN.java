package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class tN {
    private static volatile tN YFl;

    private tN() {
    }

    public static tN YFl() {
        if (YFl == null) {
            synchronized (tN.class) {
                if (YFl == null) {
                    YFl = new tN();
                }
            }
        }
        return YFl;
    }

    public AlY YFl(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        if (yFl == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(yFl.NjR())) {
            return new eT(view, yFl);
        }
        if ("translate".equals(yFl.NjR())) {
            return new EH(view, yFl);
        }
        if ("ripple".equals(yFl.NjR())) {
            return new qsH(view, yFl);
        }
        if ("marquee".equals(yFl.NjR())) {
            return new DSW(view, yFl);
        }
        if ("waggle".equals(yFl.NjR())) {
            return new rkt(view, yFl);
        }
        if ("shine".equals(yFl.NjR())) {
            return new YoT(view, yFl);
        }
        if ("swing".equals(yFl.NjR())) {
            return new pDU(view, yFl);
        }
        if ("fade".equals(yFl.NjR())) {
            return new YFl(view, yFl);
        }
        if ("rubIn".equals(yFl.NjR())) {
            return new nc(view, yFl);
        }
        if ("rotate".equals(yFl.NjR())) {
            return new NjR(view, yFl);
        }
        if ("cutIn".equals(yFl.NjR())) {
            return new vc(view, yFl);
        }
        if ("stretch".equals(yFl.NjR())) {
            return new GA(view, yFl);
        }
        if ("bounce".equals(yFl.NjR())) {
            return new wN(view, yFl);
        }
        return null;
    }
}
