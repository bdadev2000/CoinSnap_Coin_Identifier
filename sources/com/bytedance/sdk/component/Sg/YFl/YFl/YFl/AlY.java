package com.bytedance.sdk.component.Sg.YFl.YFl.YFl;

import android.text.TextUtils;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.eT;

/* loaded from: classes.dex */
public class AlY extends eT {
    public YFl NjR;
    public wN qsH;

    public AlY(eT.YFl yFl) {
        super(yFl);
        wN wNVar = new wN();
        this.qsH = wNVar;
        this.NjR = new YFl(wNVar.Sg());
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.eT
    public com.bytedance.sdk.component.Sg.YFl.AlY YFl() {
        return this.qsH;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.eT
    public com.bytedance.sdk.component.Sg.YFl.Sg YFl(GA ga2) {
        ga2.YFl(this);
        if (ga2.Sg() == null || ga2.Sg().YFl() == null || TextUtils.isEmpty(ga2.Sg().YFl().toString())) {
            return null;
        }
        if (YFl.YFl != null && YFl.YFl.Sg() && this.NjR.wN() && !"setting".equals(ga2.vc())) {
            Sg sg2 = new Sg(ga2, this.NjR);
            this.NjR.tN().add(sg2);
            return sg2;
        }
        Sg sg3 = new Sg(ga2, this.qsH);
        this.qsH.tN().add(sg3);
        return sg3;
    }
}
