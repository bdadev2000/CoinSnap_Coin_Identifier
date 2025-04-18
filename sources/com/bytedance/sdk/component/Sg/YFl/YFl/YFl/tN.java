package com.bytedance.sdk.component.Sg.YFl.YFl.YFl;

import com.bytedance.sdk.component.Sg.YFl.EH;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.qsH;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class tN implements qsH.YFl {
    GA Sg;
    List<com.bytedance.sdk.component.Sg.YFl.qsH> YFl;
    int tN = 0;

    public tN(List<com.bytedance.sdk.component.Sg.YFl.qsH> list, GA ga2) {
        this.YFl = list;
        this.Sg = ga2;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.qsH.YFl
    public GA YFl() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.qsH.YFl
    public EH YFl(GA ga2) throws IOException {
        this.Sg = ga2;
        int i10 = this.tN + 1;
        this.tN = i10;
        if (i10 >= this.YFl.size()) {
            return null;
        }
        return this.YFl.get(this.tN).YFl(this);
    }
}
