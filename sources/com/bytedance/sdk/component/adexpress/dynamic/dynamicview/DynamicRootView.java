package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.KS.HWF;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.lMd.Bj;
import com.bytedance.sdk.component.adexpress.lMd.rV;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.jU, com.bytedance.sdk.component.adexpress.theme.zp {
    private List<com.bytedance.sdk.component.adexpress.dynamic.KS> Bj;
    private DynamicBaseWidget COT;
    private com.bytedance.sdk.component.adexpress.dynamic.COT.zp HWF;
    public View KS;
    private Context KVG;
    private ThemeStatusBroadcastReceiver QR;
    private ViewGroup YW;
    private tG dQp;
    private int dT;
    private Bj jU;
    private com.bytedance.sdk.component.adexpress.dynamic.lMd ku;
    boolean lMd;
    private int rV;
    private int tG;
    private com.bytedance.sdk.component.adexpress.dynamic.COT vDp;
    private Map<Integer, String> vwr;
    private String woN;
    protected final rV zp;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z8, tG tGVar, com.bytedance.sdk.component.adexpress.dynamic.COT.zp zpVar) {
        super(context);
        this.YW = null;
        this.dT = 0;
        this.Bj = new ArrayList();
        this.tG = 0;
        this.rV = 0;
        this.KVG = context;
        rV rVVar = new rV();
        this.zp = rVVar;
        rVVar.zp(2);
        this.HWF = zpVar;
        zpVar.zp(this);
        this.QR = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.zp(this);
        this.lMd = z8;
        this.dQp = tGVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void a_() {
        try {
            this.vDp.zp();
        } catch (Exception unused) {
        }
    }

    public String getBgColor() {
        return this.woN;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.vwr;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.COT.zp getDynamicClickListener() {
        return this.HWF;
    }

    public int getLogoUnionHeight() {
        return this.tG;
    }

    public Bj getRenderListener() {
        return this.jU;
    }

    public tG getRenderRequest() {
        return this.dQp;
    }

    public int getScoreCountWithIcon() {
        return this.rV;
    }

    public ViewGroup getTimeOut() {
        return this.YW;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.KS> getTimeOutListener() {
        return this.Bj;
    }

    public int getTimedown() {
        return this.dT;
    }

    public void setBgColor(String str) {
        this.woN = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.vwr = map;
    }

    public void setDislikeView(View view) {
        this.HWF.lMd(view);
    }

    public void setLogoUnionHeight(int i9) {
        this.tG = i9;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.lMd lmd) {
        this.ku = lmd;
    }

    public void setRenderListener(Bj bj) {
        this.jU = bj;
        this.HWF.zp(bj);
    }

    public void setScoreCountWithIcon(int i9) {
        this.rV = i9;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void setSoundMute(boolean z8) {
        com.bytedance.sdk.component.adexpress.dynamic.lMd lmd = this.ku;
        if (lmd != null) {
            lmd.setSoundMute(z8);
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.YW = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.KS ks) {
        this.Bj.add(ks);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void setTimeUpdate(int i9) {
        this.vDp.setTimeUpdate(i9);
    }

    public void setTimedown(int i9) {
        this.dT = i9;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.COT cot) {
        this.vDp = cot;
    }

    public void zp(ku kuVar, int i9) {
        this.COT = zp(kuVar, this, i9);
        this.zp.zp(true);
        this.zp.zp(this.COT.COT);
        this.zp.lMd(this.COT.HWF);
        this.zp.zp(this.KS);
        this.jU.zp(this.zp);
    }

    public DynamicBaseWidget zp(ku kuVar, ViewGroup viewGroup, int i9) {
        if (kuVar == null) {
            return null;
        }
        List<ku> Bj = kuVar.Bj();
        DynamicBaseWidget zp = com.bytedance.sdk.component.adexpress.dynamic.zp.lMd.zp(this.KVG, this, kuVar);
        if (zp instanceof DynamicUnKnowView) {
            zp(i9 == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        zp(kuVar);
        zp.KS();
        if (viewGroup != null) {
            viewGroup.addView(zp);
            zp(viewGroup, kuVar);
        }
        if (Bj == null || Bj.size() <= 0) {
            return null;
        }
        Iterator<ku> it = Bj.iterator();
        while (it.hasNext()) {
            zp(it.next(), zp, i9);
        }
        return zp;
    }

    private void zp(ku kuVar) {
        HWF COT;
        com.bytedance.sdk.component.adexpress.dynamic.KS.COT dT = kuVar.dT();
        if (dT == null || (COT = dT.COT()) == null) {
            return;
        }
        this.zp.lMd(COT.KVS());
    }

    private void zp(ViewGroup viewGroup, ku kuVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !kuVar.ox()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void zp(double d2, double d9, double d10, double d11, float f9) {
        this.zp.KS(d2);
        this.zp.jU(d9);
        this.zp.COT(d10);
        this.zp.HWF(d11);
        this.zp.zp(f9);
        this.zp.lMd(f9);
        this.zp.KS(f9);
        this.zp.jU(f9);
    }

    public void zp(int i9, String str) {
        this.zp.zp(false);
        this.zp.lMd(i9);
        this.zp.zp(str);
        this.jU.zp(this.zp);
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.zp
    public void zp(int i9) {
        DynamicBaseWidget dynamicBaseWidget = this.COT;
        if (dynamicBaseWidget == null) {
            return;
        }
        dynamicBaseWidget.zp(i9);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jU
    public void zp(CharSequence charSequence, int i9, int i10, boolean z8) {
        for (int i11 = 0; i11 < this.Bj.size(); i11++) {
            if (this.Bj.get(i11) != null) {
                this.Bj.get(i11).zp(charSequence, i9 == 1, i10, z8);
            }
        }
    }
}
