package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class YFl extends AlY {
    public YFl(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    public List<ObjectAnimator> YFl() {
        float Wwa = this.Sg.Wwa() / 100.0f;
        float qO = this.Sg.qO() / 100.0f;
        if ("reverse".equals(this.Sg.rkt()) && this.Sg.pDU() <= 0.0d) {
            qO = Wwa;
            Wwa = qO;
        }
        this.tN.setAlpha(Wwa);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "alpha", Wwa, qO).setDuration((int) (this.Sg.nc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(YFl(duration));
        return arrayList;
    }
}
