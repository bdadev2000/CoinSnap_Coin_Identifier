package com.bytedance.sdk.openadsdk.YFl.Sg.YFl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.YFl.Sg.qsH;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.qO;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class tN extends qsH {
    protected AdSlot NjR;
    private boolean YoT;
    protected String eT;

    /* renamed from: nc, reason: collision with root package name */
    protected qO f10525nc;
    protected final Context qsH;

    public tN(@NonNull Context context, Wwa wwa, AdSlot adSlot) {
        super(context, wwa, 5, true);
        this.eT = "embeded_ad";
        this.YoT = false;
        this.Sg.qsH(1);
        this.AlY.YFl(this);
        this.qsH = context;
        this.NjR = adSlot;
        YFl();
        Sg();
    }

    private void Sg() {
        qO qOVar = this.f10525nc;
        if (qOVar != null) {
            qOVar.setBackupListener(new com.bytedance.sdk.component.adexpress.Sg.tN() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN.1
                @Override // com.bytedance.sdk.component.adexpress.Sg.tN
                public boolean YFl(ViewGroup viewGroup, int i10) {
                    YFl yFl = new YFl(tN.this.f10525nc.getContext());
                    yFl.setExtraFuncationHelper(((qsH) tN.this).AlY);
                    yFl.YFl(tN.this.f10525nc);
                    return true;
                }
            });
        }
    }

    public qO AlY() {
        return this.f10525nc;
    }

    public void tN() {
        qO qOVar = this.f10525nc;
        if (qOVar != null) {
            qOVar.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN.2
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
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    if (!tN.this.f10525nc.GA()) {
                        tN.this.YFl(f10, f11);
                        if (tN.this.YoT) {
                            tN.this.f10525nc.qsH();
                            return;
                        }
                        return;
                    }
                    tN tNVar = tN.this;
                    Context context = tNVar.qsH;
                    Wwa wwa = ((qsH) tNVar).Sg;
                    tN tNVar2 = tN.this;
                    com.bytedance.sdk.openadsdk.YFl.Sg.Sg sg2 = new com.bytedance.sdk.openadsdk.YFl.Sg.Sg(context, wwa, 5, tNVar2.NjR, ((qsH) tNVar2).AlY, ((qsH) tN.this).YFl);
                    tN tNVar3 = tN.this;
                    if (tNVar3 instanceof Sg) {
                        sg2.YFl(((com.bytedance.sdk.openadsdk.core.qsH.Wwa) tNVar3.AlY()).getVideoAdListener());
                    }
                    ((qsH) tN.this).AlY.YFl((com.bytedance.sdk.openadsdk.core.Sg.YFl) tN.this.f10525nc.getClickCreativeListener());
                    PAGMediaView NjR = ((qsH) tN.this).AlY.NjR();
                    if (NjR == null) {
                        NjR = new PAGMediaView(tN.this.qsH);
                    }
                    tN.this.f10525nc.addView(NjR);
                }
            });
        }
    }

    public void wN() {
        qO qOVar = this.f10525nc;
        if (qOVar != null) {
            qOVar.NjR();
        }
    }

    public void YFl() {
        this.f10525nc = new qO(this.qsH, this.Sg, this.NjR, this.eT);
        tN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(float f10, float f11) {
        qO qOVar = this.f10525nc;
        if (qOVar != null && com.bytedance.sdk.openadsdk.core.eT.tN.YFl(qOVar.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = this.f10525nc.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.f10525nc.setLayoutParams(layoutParams);
            return;
        }
        int tN = GS.tN(this.qsH, f10);
        int tN2 = GS.tN(this.qsH, f11);
        ViewGroup.LayoutParams layoutParams2 = this.f10525nc.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(tN, tN2);
        } else {
            layoutParams2.width = tN;
            layoutParams2.height = tN2;
        }
        this.f10525nc.setLayoutParams(layoutParams2);
    }

    public void YFl(boolean z10) {
        this.YoT = z10;
    }
}
