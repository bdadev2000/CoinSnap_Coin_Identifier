package com.bytedance.sdk.openadsdk.core.qsH;

import com.bytedance.sdk.openadsdk.utils.mn;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GA implements com.bytedance.adsdk.ugeno.core.EH, com.bytedance.sdk.component.adexpress.Sg.NjR {
    private final String AlY;
    private final String Sg;
    private final com.bytedance.sdk.openadsdk.AlY.AlY.wN YFl;
    private final com.bytedance.sdk.openadsdk.core.model.Wwa tN;
    private long wN;

    public GA(com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar, String str, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str2) {
        this.YFl = wNVar;
        this.Sg = str;
        this.AlY = str2;
        this.tN = wwa;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void AlY() {
        this.YFl.YFl();
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void DSW() {
        this.YFl.YFl(true);
        this.YFl.GA();
        mn.Sg(new com.bytedance.sdk.component.qsH.qsH("native_success") { // from class: com.bytedance.sdk.openadsdk.core.qsH.GA.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(GA.this.tN, GA.this.Sg, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void NjR() {
        this.YFl.EH();
    }

    public void eT() {
        this.YFl.eT();
        this.YFl.YoT();
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void nc() {
        this.YFl.Sg();
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void qsH() {
        this.YFl.pDU();
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void tN(int i10) {
        if (i10 == 3) {
            this.YFl.AlY("dynamic_sub_analysis2_end");
        } else {
            this.YFl.AlY("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void vc(int i10) {
        final String str;
        System.currentTimeMillis();
        if (i10 == 3) {
            this.YFl.DSW("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.YFl.DSW("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.YFl.YFl(true);
        mn.Sg(new com.bytedance.sdk.component.qsH.qsH("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.qsH.GA.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(GA.this.tN, GA.this.Sg, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void wN() {
        this.YFl.Sg();
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void AlY(int i10) {
        if (i10 == 3) {
            this.YFl.AlY("dynamic_sub_render2_start");
        } else {
            this.YFl.AlY("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void Sg(int i10) {
        if (i10 == 3) {
            this.YFl.AlY("dynamic_sub_analysis2_start");
        } else {
            this.YFl.AlY("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void YFl(boolean z10) {
        this.YFl.YFl(z10 ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void wN(int i10) {
        if (i10 == 3) {
            this.YFl.AlY("dynamic_sub_render2_end");
        } else {
            this.YFl.AlY("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void YFl(int i10, String str) {
        this.YFl.YFl(i10, str);
        eT.YFl("Web", i10, str, this.Sg, this.AlY, this.tN);
    }

    @Override // com.bytedance.adsdk.ugeno.core.EH
    public void tN() {
        this.YFl.wN("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.EH
    public void Sg() {
        this.YFl.wN("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void YFl(int i10) {
        this.wN = System.currentTimeMillis();
        if (i10 == 3) {
            this.YFl.tN("dynamic_render2_start");
        } else {
            this.YFl.tN("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void vc() {
        this.YFl.tN();
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.NjR
    public void YFl(int i10, int i11, String str, boolean z10) {
        if (!z10) {
            this.YFl.YFl(true);
        }
        if (i10 == 3) {
            this.YFl.Sg(i11, "dynamic_render2_error");
        } else {
            this.YFl.Sg(i11, "dynamic_render_error");
        }
        eT.YFl("NDR", i11, str, this.Sg, this.AlY, this.tN);
    }

    @Override // com.bytedance.adsdk.ugeno.core.EH
    public void YFl() {
        this.YFl.wN("ugen_render_start");
        this.YFl.wN("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.EH
    public void YFl(com.bytedance.adsdk.ugeno.core.pDU pdu) {
        if (pdu.YFl() == 0) {
            this.YFl.wN("ugen_sub_render_end");
            this.YFl.vc("ugen_render_success");
        } else {
            this.YFl.tN(pdu.YFl(), "ugen_render_error");
            eT.YFl("UGen", pdu.YFl(), pdu.Sg(), this.Sg, this.AlY, this.tN);
        }
        this.YFl.YFl(true);
    }
}
