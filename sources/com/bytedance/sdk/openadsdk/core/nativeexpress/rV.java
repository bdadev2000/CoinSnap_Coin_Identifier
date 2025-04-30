package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class rV extends com.bytedance.sdk.component.adexpress.lMd.zp<BackupView> {
    private com.bytedance.sdk.component.adexpress.lMd.QR COT;
    private final com.bytedance.sdk.component.adexpress.lMd.tG HWF;
    private final View KS;
    private com.bytedance.sdk.component.adexpress.lMd.KS jU;
    private BackupView lMd;
    AtomicBoolean zp = new AtomicBoolean(false);

    public rV(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.lMd.tG tGVar) {
        this.KS = view;
        this.HWF = tGVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd() {
        float realWidth;
        if (this.zp.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.lMd.KS ks = this.jU;
        if (ks != null && ks.zp((NativeExpressView) this.KS, 0)) {
            this.HWF.COT().QR();
            BackupView backupView = (BackupView) this.KS.findViewWithTag("tt_express_backup_fl_tag_26");
            this.lMd = backupView;
            if (backupView != null) {
                com.bytedance.sdk.component.adexpress.lMd.rV rVVar = new com.bytedance.sdk.component.adexpress.lMd.rV();
                BackupView backupView2 = this.lMd;
                float f9 = 0.0f;
                if (backupView2 == null) {
                    realWidth = 0.0f;
                } else {
                    realWidth = backupView2.getRealWidth();
                }
                BackupView backupView3 = this.lMd;
                if (backupView3 != null) {
                    f9 = backupView3.getRealHeight();
                }
                rVVar.zp(true);
                rVVar.zp(realWidth);
                rVVar.lMd(f9);
                this.COT.zp(this.lMd, rVVar);
                return;
            }
            this.COT.zp(107, "backupview is null");
            return;
        }
        this.COT.zp(107, "backup false");
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    public void zp(com.bytedance.sdk.component.adexpress.lMd.QR qr) {
        this.COT = qr;
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.rV.1
            @Override // java.lang.Runnable
            public void run() {
                rV.this.lMd();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public BackupView COT() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.zp
    public void zp(com.bytedance.sdk.component.adexpress.lMd.KS ks) {
        this.jU = ks;
    }
}
