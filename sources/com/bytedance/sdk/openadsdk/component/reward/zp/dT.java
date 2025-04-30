package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class dT {
    private boolean COT = false;
    private final Activity KS;
    private final zp jU;
    com.bytedance.sdk.component.adexpress.dynamic.jU lMd;
    TopProxyLayout zp;

    public dT(zp zpVar) {
        this.KS = zpVar.oB;
        this.jU = zpVar;
    }

    public void COT(boolean z8) {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.setSkipEnable(z8);
        }
    }

    public void HWF() {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.KS();
        }
    }

    public void KS(boolean z8) {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSound(z8);
        }
    }

    public void jU(boolean z8) {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSkip(z8);
        }
    }

    public void lMd(boolean z8) {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.setSoundMute(z8);
        }
        com.bytedance.sdk.component.adexpress.dynamic.jU jUVar = this.lMd;
        if (jUVar != null) {
            jUVar.setSoundMute(z8);
        }
    }

    public void zp() {
        if (this.COT) {
            return;
        }
        this.COT = true;
        TopProxyLayout topProxyLayout = (TopProxyLayout) this.KS.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.IhO);
        this.zp = topProxyLayout;
        if (topProxyLayout != null) {
            zp zpVar = this.jU;
            topProxyLayout.zp(zpVar.HWF, zpVar.zp);
            if (this.jU.zp.Fm()) {
                zp(false);
            } else {
                zp(this.jU.zp.bQm());
            }
        }
    }

    public void COT() {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.lMd();
        }
    }

    public void KS() {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.COT();
        }
    }

    public void jU() {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.zp();
        }
    }

    public void lMd() {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.jU();
        }
    }

    public void lMd(int i9) {
        View findViewById;
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout == null || topProxyLayout.getITopLayout() == null || i9 == 0 || (findViewById = this.zp.getITopLayout().findViewById(520093713)) == null || !(findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || findViewById.getWidth() <= 0 || findViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        findViewById.getLocationOnScreen(iArr);
        int width = i9 - (findViewById.getWidth() + iArr[0]);
        if (width < WNy.lMd(this.KS, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin = (WNy.lMd(this.KS, 16.0f) - width) + ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin;
            findViewById.requestLayout();
        }
    }

    public void zp(boolean z8) {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.setShowDislike(z8);
        }
    }

    public void zp(String str, CharSequence charSequence) {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.zp(String.valueOf(str), charSequence);
        }
    }

    public void zp(CharSequence charSequence) {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.setSkipText(charSequence);
        }
    }

    public void zp(com.bytedance.sdk.openadsdk.component.reward.top.lMd lmd) {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout != null) {
            topProxyLayout.setListener(lmd);
        }
    }

    public void zp(com.bytedance.sdk.component.adexpress.dynamic.jU jUVar) {
        this.lMd = jUVar;
    }

    public void zp(int i9) {
        TopProxyLayout topProxyLayout = this.zp;
        if (topProxyLayout == null || !(topProxyLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.zp.getLayoutParams()).topMargin = i9 - WNy.lMd(this.KS, 20.0f);
    }
}
