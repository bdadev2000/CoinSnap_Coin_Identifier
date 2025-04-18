package com.bytedance.sdk.openadsdk.core.qsH;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class aIu extends com.bytedance.sdk.component.adexpress.Sg.YFl<YFl> {
    private com.bytedance.sdk.component.adexpress.Sg.tN AlY;
    private YFl Sg;
    AtomicBoolean YFl = new AtomicBoolean(false);
    private final View tN;

    /* renamed from: vc, reason: collision with root package name */
    private final com.bytedance.sdk.component.adexpress.Sg.GA f10727vc;
    private com.bytedance.sdk.component.adexpress.Sg.DSW wN;

    public aIu(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.Sg.GA ga2) {
        this.tN = view;
        this.f10727vc = ga2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg() {
        float realWidth;
        if (this.YFl.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.Sg.tN tNVar = this.AlY;
        boolean z10 = false;
        if (tNVar != null && tNVar.YFl((qO) this.tN, 0)) {
            z10 = true;
        }
        if (!z10) {
            this.wN.YFl(107, "backup false");
            return;
        }
        this.f10727vc.wN().DSW();
        YFl yFl = (YFl) this.tN.findViewWithTag("tt_express_backup_fl_tag_26");
        this.Sg = yFl;
        if (yFl != null) {
            com.bytedance.sdk.component.adexpress.Sg.pDU pdu = new com.bytedance.sdk.component.adexpress.Sg.pDU();
            YFl yFl2 = this.Sg;
            float f10 = 0.0f;
            if (yFl2 == null) {
                realWidth = 0.0f;
            } else {
                realWidth = yFl2.getRealWidth();
            }
            YFl yFl3 = this.Sg;
            if (yFl3 != null) {
                f10 = yFl3.getRealHeight();
            }
            pdu.YFl(true);
            pdu.YFl(realWidth);
            pdu.Sg(f10);
            this.wN.YFl(this.Sg, pdu);
            return;
        }
        this.wN.YFl(107, "backupview is null");
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    public void YFl(com.bytedance.sdk.component.adexpress.Sg.DSW dsw) {
        this.wN = dsw;
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.aIu.1
            @Override // java.lang.Runnable
            public void run() {
                aIu.this.Sg();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public YFl wN() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.YFl
    public void YFl(com.bytedance.sdk.component.adexpress.Sg.tN tNVar) {
        this.AlY = tNVar;
    }
}
