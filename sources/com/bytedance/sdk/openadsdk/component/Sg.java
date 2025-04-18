package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.Sg.Sg;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.NjR;
import com.bytedance.sdk.openadsdk.core.qsH.qO;
import com.bytedance.sdk.openadsdk.core.qsH.qsH;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg extends tN {
    private boolean eT;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.NjR.Sg f10575nc;

    public Sg(Activity activity, Wwa wwa, FrameLayout frameLayout, YFl yFl, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.qsH.YFl yFl2) {
        super(activity, wwa, frameLayout, yFl, i10, z10, yFl2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.tN
    public int AlY() {
        return this.f10575nc.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.tN
    public void Sg() {
        this.f10575nc.NjR();
    }

    @Override // com.bytedance.sdk.openadsdk.component.tN
    public void tN() {
        super.tN();
        com.bytedance.sdk.openadsdk.component.NjR.Sg sg2 = this.f10575nc;
        if (sg2 != null) {
            sg2.eT();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.tN
    public void YFl(ViewGroup viewGroup) {
        Pair<Float, Float> YFl = com.bytedance.sdk.openadsdk.core.qsH.YFl.YFl.YFl(this.YFl.getWindow(), this.DSW);
        com.bytedance.sdk.openadsdk.component.NjR.Sg sg2 = new com.bytedance.sdk.openadsdk.component.NjR.Sg(this.YFl, this.Sg, new AdSlot.Builder().setCodeId(String.valueOf(this.Sg.kU())).setExpressViewAcceptedSize(((Float) YFl.first).floatValue(), ((Float) YFl.second).floatValue()).build(), "open_ad");
        this.f10575nc = sg2;
        sg2.setTopListener(this.wN);
        this.f10575nc.setExpressVideoListenerProxy(this.wN);
        this.f10575nc.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.Sg.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
                Sg.this.wN.AlY();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                if (Sg.this.f10575nc.GA()) {
                    Sg.this.eT = true;
                    Sg sg3 = Sg.this;
                    Sg.super.YFl((ViewGroup) sg3.AlY);
                    Sg.super.YFl();
                    Sg.super.Sg();
                    return;
                }
                if (Sg.this.Sg.Zu()) {
                    Sg.this.wN.tN();
                    return;
                }
                Sg sg4 = Sg.this;
                if (sg4.tN) {
                    if (sg4.YFl(sg4.f10575nc.getVideoFrameLayout())) {
                        Sg.this.wN.tN();
                        return;
                    } else {
                        Sg.this.wN.AlY();
                        return;
                    }
                }
                sg4.wN.tN();
            }
        });
        this.Sg.qsH(1);
        this.AlY.addView(this.f10575nc, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.tN
    public void YFl() {
        NjR YFl = com.bytedance.sdk.openadsdk.component.YFl.Sg.YFl(this.Sg, this.YFl, this.NjR, this.f10575nc);
        YFl.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.component.Sg.2
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg.YFl
            public void YFl(View view, int i10) {
                Sg.this.wN.wN();
            }
        });
        this.f10575nc.setClickListener(YFl);
        qsH Sg = com.bytedance.sdk.openadsdk.component.YFl.Sg.Sg(this.Sg, this.YFl, this.NjR, this.f10575nc);
        this.f10575nc.setClickCreativeListener(Sg);
        Sg.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.component.Sg.3
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg.YFl
            public void YFl(View view, int i10) {
                Sg.this.wN.wN();
            }
        });
        this.f10575nc.setBackupListener(new com.bytedance.sdk.component.adexpress.Sg.tN() { // from class: com.bytedance.sdk.openadsdk.component.Sg.4
            @Override // com.bytedance.sdk.component.adexpress.Sg.tN
            public boolean YFl(ViewGroup viewGroup, int i10) {
                StringBuilder sb2 = new StringBuilder("isUseBackup() called with: view = [");
                sb2.append(viewGroup);
                sb2.append("], errCode = [");
                sb2.append(i10);
                sb2.append("]");
                try {
                    ((qO) viewGroup).YoT();
                    new com.bytedance.sdk.openadsdk.component.NjR.YFl(Sg.this.YFl).YFl((qO) Sg.this.f10575nc);
                    return true;
                } catch (Exception e2) {
                    Log.e("AppOpenAdExpressManager", "", e2);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.tN
    public void YFl(int i10, int i11, boolean z10) {
        if (this.eT) {
            super.YFl(i10, i11, z10);
        } else {
            this.f10575nc.setTime(String.valueOf(i10), i11, 0, z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.tN
    public JSONObject YFl(JSONObject jSONObject) {
        return this.f10575nc.YFl(jSONObject, this.Sg);
    }
}
