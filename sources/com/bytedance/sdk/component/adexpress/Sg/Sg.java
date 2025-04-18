package com.bytedance.sdk.component.adexpress.Sg;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.Sg.nc;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* loaded from: classes.dex */
public class Sg implements nc {
    private qsH AlY;
    private com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl Sg;
    private Context YFl;
    private ThemeStatusBroadcastReceiver tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10353vc;
    private GA wN;

    public Sg(Context context, GA ga2, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.wN.qsH qsh, qsH qsh2, com.bytedance.sdk.component.adexpress.dynamic.vc.YFl yFl, com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl yFl2) {
        this.YFl = context;
        this.wN = ga2;
        this.tN = themeStatusBroadcastReceiver;
        this.AlY = qsh2;
        if (yFl2 != null) {
            this.Sg = yFl2;
        } else {
            this.Sg = new com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl(context, themeStatusBroadcastReceiver, z10, qsh, ga2, yFl);
        }
        this.Sg.YFl(this.AlY);
        if (qsh instanceof com.bytedance.sdk.component.adexpress.dynamic.wN.DSW) {
            this.f10353vc = 3;
        } else {
            this.f10353vc = 2;
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.AlY Sg() {
        com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl yFl = this.Sg;
        if (yFl != null) {
            return yFl.AlY();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc
    public boolean YFl(final nc.YFl yFl) {
        this.wN.wN().YFl(this.f10353vc);
        this.Sg.YFl(new DSW() { // from class: com.bytedance.sdk.component.adexpress.Sg.Sg.1
            @Override // com.bytedance.sdk.component.adexpress.Sg.DSW
            public void YFl(View view, pDU pdu) {
                if (yFl.tN()) {
                    return;
                }
                Sg.this.wN.wN().wN(Sg.this.f10353vc);
                Sg.this.wN.wN().vc(Sg.this.f10353vc);
                Sg.this.wN.wN().nc();
                EH Sg = yFl.Sg();
                if (Sg == null) {
                    return;
                }
                Sg.YFl(Sg.this.Sg, pdu);
                yFl.YFl(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.Sg.DSW
            public void YFl(int i10, String str) {
                Sg.this.wN.wN().YFl(Sg.this.f10353vc, i10, str, yFl.Sg(Sg.this));
                if (yFl.Sg(Sg.this)) {
                    yFl.YFl(Sg.this);
                    return;
                }
                EH Sg = yFl.Sg();
                if (Sg == null) {
                    return;
                }
                Sg.a_(i10);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc
    public void YFl() {
        com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl yFl = this.Sg;
        if (yFl != null) {
            yFl.Sg();
        }
    }
}
