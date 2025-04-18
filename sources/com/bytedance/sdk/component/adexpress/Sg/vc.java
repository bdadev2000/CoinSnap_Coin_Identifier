package com.bytedance.sdk.component.adexpress.Sg;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.Sg.nc;

/* loaded from: classes.dex */
public class vc implements nc {
    private YFl Sg;
    private Context YFl;
    private GA tN;

    public vc(Context context, GA ga2, YFl yFl) {
        this.YFl = context;
        this.Sg = yFl;
        this.tN = ga2;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc
    public void YFl() {
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc
    public boolean YFl(final nc.YFl yFl) {
        this.tN.wN().vc();
        this.Sg.YFl(new DSW() { // from class: com.bytedance.sdk.component.adexpress.Sg.vc.1
            @Override // com.bytedance.sdk.component.adexpress.Sg.DSW
            public void YFl(View view, pDU pdu) {
                if (yFl.tN()) {
                    return;
                }
                EH Sg = yFl.Sg();
                if (Sg != null) {
                    Sg.YFl(vc.this.Sg, pdu);
                }
                yFl.YFl(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.Sg.DSW
            public void YFl(int i10, String str) {
                EH Sg = yFl.Sg();
                if (Sg != null) {
                    Sg.a_(i10);
                }
            }
        });
        return true;
    }

    public void YFl(tN tNVar) {
        this.Sg.YFl(tNVar);
    }
}
