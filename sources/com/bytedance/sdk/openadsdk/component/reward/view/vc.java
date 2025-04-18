package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.component.reward.YFl.lG;
import com.bytedance.sdk.openadsdk.component.reward.YFl.qO;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class vc {
    private qO AlY;

    @Nullable
    private RFEndCardBackUpLayout Sg;
    private final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl YFl;
    private boolean tN;
    private boolean wN;

    public vc(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.YFl = yFl;
    }

    public void AlY() {
        qO qOVar = this.AlY;
        if (qOVar != null) {
            qOVar.Sg();
        }
    }

    public void Sg() {
        this.wN = true;
        GS.YFl((View) this.Sg, 0);
    }

    public void YFl() {
        if (this.tN) {
            return;
        }
        this.tN = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.YFl.mB.findViewById(GA.qjy);
        this.Sg = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.YFl);
        }
        if (this.YFl.Sg.yn()) {
            this.AlY = new qO(this.YFl);
        }
    }

    public void tN() {
        qO qOVar = this.AlY;
        if (qOVar != null) {
            qOVar.YFl();
        }
    }

    public boolean vc() {
        return this.wN;
    }

    public boolean wN() {
        qO qOVar = this.AlY;
        if (qOVar != null) {
            return qOVar.tN();
        }
        return false;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.Sg.wN wNVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.Sg;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        GS.YFl(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.vc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        qO qOVar = this.AlY;
        if (qOVar != null) {
            qOVar.YFl(wNVar);
        }
    }

    public boolean YFl(lG lGVar) {
        this.wN = true;
        qO qOVar = this.AlY;
        if (qOVar == null || !qOVar.YFl(lGVar)) {
            return false;
        }
        GS.YFl((View) this.Sg, 0);
        return true;
    }

    public void YFl(int i10) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.Sg;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i10);
    }
}
