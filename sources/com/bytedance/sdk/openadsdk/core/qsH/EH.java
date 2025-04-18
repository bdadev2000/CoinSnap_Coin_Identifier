package com.bytedance.sdk.openadsdk.core.qsH;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.GS;
import l5.a;
import l5.g;

/* loaded from: classes.dex */
public class EH extends com.bytedance.sdk.openadsdk.core.GA.Sg.vc implements View.OnClickListener {
    private boolean rkt;

    public EH(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str, com.bytedance.sdk.openadsdk.AlY.DSW dsw) {
        super(context, wwa, false, str, false, false, dsw);
        this.rkt = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    private void Wwa() {
        DSW();
        RelativeLayout relativeLayout = this.DSW;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.YFl.BPI().f23461f, this.YFl.BPI().f23457b, this.YFl.BPI().a, this.qsH, this.YFl);
            }
        }
        lG();
    }

    private void lG() {
        GS.YFl((View) this.DSW, 0);
        GS.YFl((View) this.qsH, 0);
        GS.YFl((View) this.f10630nc, 8);
    }

    public void AlY() {
        ImageView imageView = this.f10630nc;
        if (imageView != null) {
            GS.YFl((View) imageView, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc
    public void Sg() {
        if (!this.wN || !VOe.Sg(this.YoT)) {
            this.AlY = false;
        }
        super.Sg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc
    public void YFl(boolean z10) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.NjR;
        if (imageView != null && imageView.getVisibility() == 0) {
            GS.wN(this.DSW);
        }
        tN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        ImageView imageView = this.NjR;
        if (imageView != null && imageView.getVisibility() == 0) {
            Wwa();
        } else {
            super.onWindowFocusChanged(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        ImageView imageView = this.NjR;
        if (imageView != null && imageView.getVisibility() == 0) {
            Wwa();
        } else {
            super.onWindowVisibilityChanged(i10);
        }
    }

    public void setCanInterruptVideoPlay(boolean z10) {
        this.rkt = z10;
    }

    public void setShouldCheckNetChange(boolean z10) {
        g gVar = this.Sg;
        if (gVar != null) {
            gVar.wN(z10);
        }
    }

    public void setShowAdInteractionView(boolean z10) {
        a GA;
        g gVar = this.Sg;
        if (gVar != null && (GA = gVar.GA()) != null) {
            GA.YFl(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc
    public void tN() {
        if (this.rkt) {
            super.tN();
        }
    }

    public void wN() {
        DSW();
        GS.YFl((View) this.DSW, 0);
    }
}
