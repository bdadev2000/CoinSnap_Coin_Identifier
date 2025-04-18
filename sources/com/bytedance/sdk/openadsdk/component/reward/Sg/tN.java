package com.bytedance.sdk.openadsdk.component.reward.Sg;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.nc;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.core.widget.eT;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class tN extends Sg {
    public tN(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        super(yFl);
    }

    private static ImageView AlY(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY.setScaleType(ImageView.ScaleType.FIT_XY);
        alY.setImageResource(qO.AlY(context, "tt_up_slide"));
        alY.setId(GA.VOe);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(GS.tN(context, 18.0f), GS.tN(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = GS.tN(context, 45.0f);
        alY.setLayoutParams(layoutParams);
        return alY;
    }

    public static void Sg(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setOrientation(1);
        frameLayout.addView(wNVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        tNVar.setId(GA.zB);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        wNVar.addView(tNVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar2 = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        tNVar2.setId(GA.f10821nc);
        tNVar.addView(tNVar2, new FrameLayout.LayoutParams(-1, -1));
        tNVar2.addView(Sg.YFl(context));
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar3 = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        tNVar3.setId(GA.Wwa);
        tNVar3.setVisibility(8);
        tNVar3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        tNVar2.addView(tNVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY.setId(GA.qO);
        alY.setScaleType(ImageView.ScaleType.FIT_CENTER);
        tNVar3.addView(alY, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.AlY.Sg(tNVar);
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar4 = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        tNVar4.setId(GA.aIu);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        wNVar.addView(tNVar4, layoutParams3);
        tNVar4.addView(Sg(context));
        LinearLayout tN = tN(context);
        tN.setBackgroundColor(Color.parseColor("#70161823"));
        tNVar4.addView(tN);
        tN.addView(AlY(context));
        com.bytedance.sdk.openadsdk.component.reward.view.AlY.YFl(tNVar4);
    }

    public static boolean YFl(Wwa wwa) {
        return rkt.Sg(wwa) || rkt.tN(wwa) || rkt.AlY(wwa);
    }

    private static LinearLayout tN(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setId(GA.Ne);
        wNVar.setOrientation(1);
        wNVar.setVisibility(8);
        wNVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return wNVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void DSW() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void GA() {
        nc ncVar;
        rkt rktVar;
        if (rkt.Sg(this.YFl.Sg) && (ncVar = this.YFl.lu) != null && (rktVar = ncVar.EH) != null) {
            if (rktVar.tN()) {
                this.YFl.lu.Sg(0);
                this.YFl.rkt.set(true);
            } else {
                this.YFl.lG.set(true);
                YFl(true, false, true, 80);
            }
        }
        if (rkt.tN(this.YFl.Sg) || rkt.AlY(this.YFl.Sg)) {
            YFl(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public RFEndCardBackUpLayout qsH() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean vc() {
        if (rkt.Sg(this.YFl.Sg)) {
            return true;
        }
        if (!rkt.tN(this.YFl.Sg) && !rkt.AlY(this.YFl.Sg)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean wN() {
        return true;
    }

    public static void YFl(Wwa wwa, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        if (rkt.Sg(wwa)) {
            Sg(frameLayout);
        } else if (!rkt.tN(wwa) && !rkt.AlY(wwa)) {
            Sg.YFl(frameLayout, yFl);
        } else {
            tN(frameLayout);
        }
    }

    public static void tN(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        tNVar.setId(GA.aIu);
        frameLayout.addView(tNVar, new FrameLayout.LayoutParams(-1, -1));
        tNVar.addView(Sg(context));
        LinearLayout tN = tN(context);
        tN.setBackgroundColor(Color.parseColor("#99161823"));
        tNVar.addView(tN);
        tN.addView(AlY(context));
        com.bytedance.sdk.openadsdk.component.reward.view.AlY.YFl(tNVar);
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar2 = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        tNVar2.setId(GA.zB);
        frameLayout.addView(tNVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar3 = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        tNVar3.setId(GA.f10821nc);
        tNVar2.addView(tNVar3, new FrameLayout.LayoutParams(-1, -1));
        tNVar3.addView(Sg.YFl(context));
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar4 = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        tNVar4.setId(GA.Wwa);
        tNVar4.setVisibility(8);
        tNVar4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        tNVar3.addView(tNVar4, layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY.setId(GA.qO);
        alY.setScaleType(ImageView.ScaleType.FIT_CENTER);
        tNVar4.addView(alY, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.AlY.Sg(tNVar2);
        View eTVar = new eT(context);
        eTVar.setId(GA.Sco);
        eTVar.setClickable(true);
        eTVar.setFocusable(true);
        frameLayout.addView(eTVar, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void YFl(com.bytedance.sdk.openadsdk.component.reward.view.DSW dsw) {
        YFl(this.Sg, dsw, this.YFl);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void YFl(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl;
        com.bytedance.sdk.openadsdk.utils.eT eTVar;
        if (!rkt.tN(this.YFl.Sg) || (eTVar = (yFl = this.YFl).Bn) == null) {
            return;
        }
        eTVar.YFl(yFl.Sg.NjR().Sg() * 1000);
    }

    private static com.bytedance.sdk.component.NjR.AlY Sg(Context context) {
        com.bytedance.sdk.component.NjR.AlY alY = new com.bytedance.sdk.component.NjR.AlY(context, true);
        alY.setId(GA.wXo);
        alY.setLayerType(2, null);
        alY.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return alY;
    }
}
