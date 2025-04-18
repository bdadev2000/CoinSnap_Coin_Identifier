package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.GS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Sg implements GS {
    List<AlY> YFl = new ArrayList();

    public Sg(View view, List<com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl> it = list.iterator();
        while (it.hasNext()) {
            AlY YFl = tN.YFl().YFl(view, it.next());
            if (YFl != null) {
                this.YFl.add(YFl);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.GS
    public void Sg() {
        Iterator<AlY> it = this.YFl.iterator();
        while (it.hasNext()) {
            try {
                it.next().Sg();
            } catch (Exception unused) {
            }
        }
    }

    public void YFl() {
        Iterator<AlY> it = this.YFl.iterator();
        while (it.hasNext()) {
            try {
                it.next().tN();
            } catch (Exception unused) {
            }
        }
    }
}
