package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class lMd implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.COT {
    List<jU> zp = new ArrayList();

    public lMd(View view, List<com.bytedance.sdk.component.adexpress.dynamic.KS.zp> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.KS.zp> it = list.iterator();
        while (it.hasNext()) {
            jU zp = KS.zp().zp(view, it.next());
            if (zp != null) {
                this.zp.add(zp);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.COT
    public void lMd() {
        Iterator<jU> it = this.zp.iterator();
        while (it.hasNext()) {
            try {
                it.next().lMd();
            } catch (Exception unused) {
            }
        }
    }

    public void zp() {
        Iterator<jU> it = this.zp.iterator();
        while (it.hasNext()) {
            try {
                it.next().KS();
            } catch (Exception unused) {
            }
        }
    }
}
