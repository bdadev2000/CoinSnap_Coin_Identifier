package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class pDU {
    private final YFl AlY;
    com.bytedance.sdk.component.adexpress.dynamic.AlY Sg;
    com.bytedance.sdk.openadsdk.component.reward.top.tN YFl;
    private final Activity tN;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10595vc;
    private boolean wN = false;

    public pDU(YFl yFl) {
        this.tN = yFl.UI;
        this.AlY = yFl;
    }

    public void AlY(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar;
        if (this.f10595vc || (tNVar = this.YFl) == null) {
            return;
        }
        tNVar.setShowSkip(z10);
    }

    public void Sg(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.dynamic.AlY alY = this.Sg;
        if (alY != null) {
            alY.setSoundMute(z10);
        }
    }

    public void YFl() {
        if (this.wN) {
            return;
        }
        this.wN = true;
        YFl yFl = this.AlY;
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar = yFl.ZLB;
        if (tNVar != null) {
            this.YFl = tNVar;
            this.f10595vc = true;
        } else {
            this.YFl = (com.bytedance.sdk.openadsdk.component.reward.top.tN) yFl.mB.findViewById(com.bytedance.sdk.openadsdk.utils.GA.f10824oc);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar2 = this.YFl;
        if (tNVar2 != null) {
            tNVar2.YFl(this.AlY.Sg);
            if (this.AlY.Sg.yn()) {
                YFl(false);
            } else {
                YFl(this.AlY.Sg.Gnp());
            }
        }
    }

    public void tN(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar;
        if (this.f10595vc || (tNVar = this.YFl) == null) {
            return;
        }
        tNVar.setShowSound(z10);
    }

    public void vc() {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar;
        if (!this.f10595vc && (tNVar = this.YFl) != null) {
            tNVar.setSkipInvisiable();
        }
    }

    public void wN(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar;
        if (this.f10595vc || (tNVar = this.YFl) == null) {
            return;
        }
        tNVar.setSkipEnable(z10);
    }

    public void AlY() {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.clickSkip();
        }
    }

    public void tN() {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar;
        if (this.f10595vc || (tNVar = this.YFl) == null) {
            return;
        }
        tNVar.showSkipButton();
    }

    public void wN() {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.clickSound();
        }
    }

    public void Sg() {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar;
        if (this.f10595vc || (tNVar = this.YFl) == null) {
            return;
        }
        tNVar.showCountDownText();
    }

    public void YFl(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar;
        if (this.f10595vc || (tNVar = this.YFl) == null) {
            return;
        }
        tNVar.setShowDislike(z10);
    }

    public void YFl(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar;
        if (this.f10595vc || (tNVar = this.YFl) == null) {
            return;
        }
        tNVar.setTime(String.valueOf(str), charSequence);
    }

    public void YFl(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar;
        if (this.f10595vc || (tNVar = this.YFl) == null) {
            return;
        }
        tNVar.setSkipText(charSequence);
    }

    public void YFl(com.bytedance.sdk.openadsdk.component.reward.top.Sg sg2) {
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.setListener(sg2);
        }
    }

    public void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY alY) {
        this.Sg = alY;
    }

    public void YFl(int i10) {
        View findViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar = this.YFl;
        if (tNVar == null || tNVar.getITopLayout() == null || i10 == 0 || (findViewById = this.YFl.getITopLayout().findViewById(520093713)) == null || !(findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || findViewById.getWidth() <= 0 || findViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        findViewById.getLocationOnScreen(iArr);
        int width = i10 - (findViewById.getWidth() + iArr[0]);
        if (width < GS.tN(this.tN, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin = (GS.tN(this.tN, 16.0f) - width) + ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin;
            findViewById.requestLayout();
        }
    }
}
