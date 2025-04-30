package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.KVG;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class lMd extends com.bytedance.sdk.component.ku.ku {
    private final List<? extends com.bytedance.sdk.component.ku.ku> zp;

    public lMd(String str, List<? extends com.bytedance.sdk.component.ku.ku> list) {
        super(str);
        this.zp = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.ku.ku> list;
        if (KVG.KS(com.bytedance.sdk.openadsdk.core.KVG.zp()) != 0 && (list = this.zp) != null) {
            Iterator<? extends com.bytedance.sdk.component.ku.ku> it = list.iterator();
            while (it.hasNext()) {
                QUv.zp(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.ku.zp().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
