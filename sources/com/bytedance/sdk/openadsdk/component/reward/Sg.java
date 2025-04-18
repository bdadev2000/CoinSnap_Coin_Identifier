package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Sg extends com.bytedance.sdk.component.qsH.qsH {
    private final List<? extends com.bytedance.sdk.component.qsH.qsH> YFl;

    public Sg(String str, List<? extends com.bytedance.sdk.component.qsH.qsH> list) {
        super(str);
        this.YFl = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.qsH.qsH> list;
        if (com.bytedance.sdk.component.utils.EH.tN(lG.YFl()) != 0 && (list = this.YFl) != null) {
            Iterator<? extends com.bytedance.sdk.component.qsH.qsH> it = list.iterator();
            while (it.hasNext()) {
                mn.YFl(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.DSW.YFl().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
