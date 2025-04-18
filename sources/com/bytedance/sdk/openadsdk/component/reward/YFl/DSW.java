package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes.dex */
public class DSW extends nc implements Handler.Callback {
    int AlY;
    long Sg;
    boolean YFl;
    private final Handler qO;
    int tN;

    /* renamed from: vc, reason: collision with root package name */
    boolean f10579vc;
    int wN;

    public DSW(YFl yFl) {
        super(yFl);
        this.qO = new Handler(this);
        this.YFl = false;
        this.Sg = 0L;
        this.tN = 0;
        this.AlY = 0;
        this.wN = 0;
        this.f10579vc = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YoT() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if ((1.0f - (this.tN / this.AlY)) * 100.0f >= com.bytedance.sdk.openadsdk.core.lG.AlY().Ga(String.valueOf(this.eT.f10591vc)).f10745vc) {
            z10 = true;
        } else {
            z10 = false;
        }
        int YFl = com.bytedance.sdk.openadsdk.core.lG.AlY().YFl(String.valueOf(this.eT.f10591vc));
        if (YFl == 0) {
            com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl = this.lG;
            if (yFl != null) {
                z11 = yFl.vc();
            } else {
                z11 = false;
            }
            if (this.pDU) {
                z11 = true;
            }
            if (z10 && z11) {
                z12 = true;
            }
        } else if (YFl == 1) {
            z12 = z10;
        }
        if (z12) {
            this.eT.ZU.YFl(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.nc
    public void AlY() {
        com.bytedance.sdk.openadsdk.core.widget.Sg sg2;
        if (!this.GA) {
            return;
        }
        super.AlY();
        if (DeviceUtils.DSW() == 0) {
            this.eT.iY = true;
        }
        YFl yFl = this.eT;
        if (yFl.iY) {
            yFl.Sco.Sg(true);
            Sg(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg3 = this.eT.Vmj;
        if ((sg3 == null || (sg2 = sg3.GA) == null || !sg2.isShowing()) && DSW() > 0) {
            YFl(0L);
        }
    }

    public int DSW() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.nc
    public boolean NjR() {
        return this.f10579vc;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.nc
    public com.bytedance.sdk.openadsdk.YoT.wN Sg() {
        return new com.bytedance.sdk.openadsdk.YoT.wN() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.DSW.1
            @Override // com.bytedance.sdk.openadsdk.YoT.wN
            public void YFl() {
                DSW.this.YoT();
            }
        };
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 900 && this.DSW && Ne.tN(this.eT.Sg) && !this.Wwa.get()) {
            int i10 = message.arg1;
            if (i10 > 0) {
                this.eT.Sco.AlY(true);
                int i11 = this.wN - (this.AlY - i10);
                if (i11 == i10) {
                    this.eT.Sco.YFl(String.valueOf(i10), null);
                } else if (i11 > 0) {
                    this.eT.Sco.YFl(String.valueOf(i10), String.format(com.bytedance.sdk.component.utils.qO.YFl(this.eT.UI.getApplicationContext(), "tt_skip_ad_time_text"), Integer.valueOf(i11)));
                } else {
                    this.f10579vc = true;
                    if (Ne.nc(this.eT.Sg)) {
                        this.eT.Sco.tN();
                        this.eT.Sco.wN(true);
                    } else {
                        this.eT.qO.set(true);
                        this.eT.Vmj.EH();
                    }
                }
                Message obtain = Message.obtain();
                obtain.what = 900;
                int i12 = i10 - 1;
                obtain.arg1 = i12;
                this.qO.sendMessageDelayed(obtain, 1000L);
                this.tN = i12;
            } else {
                this.f10579vc = true;
                if (Ne.nc(this.NjR) && (!Ne.VOe(this.NjR) || !this.lG.wN())) {
                    this.eT.Sco.tN();
                    this.eT.Sco.wN(true);
                } else {
                    this.eT.Sco.AlY(false);
                    this.eT.qO.set(true);
                    this.eT.Vmj.EH();
                }
                com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl = this.lG;
                if (yFl == null || yFl.wN()) {
                    this.pDU = true;
                }
            }
            YoT();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.nc
    public void qsH() {
        if (!this.GA) {
            return;
        }
        this.qO.removeMessages(900);
        this.qO.removeMessages(600);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.nc
    public void tN() {
        if (!this.GA) {
            return;
        }
        this.DSW = true;
        this.lG.YFl();
        this.eT.mn.vc();
        this.AlY = this.NjR.VJb();
        this.wN = com.bytedance.sdk.openadsdk.core.lG.AlY().YFl(String.valueOf(this.eT.f10591vc), this.NjR.TMt());
        this.Sg = System.currentTimeMillis();
        Handler handler = this.qO;
        handler.sendMessage(handler.obtainMessage(900, this.AlY, 0));
        this.eT.ZU.eT();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.nc
    public void vc() {
        if (!this.GA || this.EH) {
            return;
        }
        super.vc();
        this.qO.removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.nc
    public void wN() {
        if (!this.GA) {
            return;
        }
        super.wN();
        if (Ne.tN(this.eT.Sg)) {
            this.eT.zG.removeMessages(600);
        }
        this.qO.removeMessages(900);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.nc
    public void Sg(int i10) {
        this.tN = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.nc
    public void YFl() {
        if (this.GA && !this.YoT) {
            super.YFl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.nc
    public void YFl(long j3) {
        if (this.GA && this.DSW) {
            Message obtain = Message.obtain();
            obtain.what = 900;
            obtain.arg1 = DSW();
            this.qO.sendMessageDelayed(obtain, j3);
        }
    }
}
