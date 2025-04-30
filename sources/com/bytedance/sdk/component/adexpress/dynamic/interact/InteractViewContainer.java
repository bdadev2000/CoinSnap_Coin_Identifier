package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpShakeView;
import com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView;
import com.bytedance.sdk.component.adexpress.widget.RippleView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes.dex */
public class InteractViewContainer extends FrameLayout implements YW {
    private com.bytedance.sdk.component.adexpress.dynamic.KS.dT Bj;
    private ku COT;
    private String HWF;
    private com.bytedance.sdk.component.adexpress.dynamic.KS.QR KS;
    private RippleView QR;
    private int YW;
    private boolean dT;
    private View jU;
    private View.OnTouchListener ku;
    private DynamicBaseWidget lMd;
    private DynamicBrushMaskView tG;
    private com.bytedance.sdk.component.adexpress.lMd.tG vDp;
    private Context zp;

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        super(context);
        this.zp = context;
        this.lMd = dynamicBaseWidget;
        this.KS = qr;
        QR();
    }

    private void QR() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.HWF = this.KS.Iv();
        this.YW = this.KS.si();
        this.dT = this.KS.qtv();
        ku zp = dT.zp(this.zp, this.lMd, this.KS, this.Bj, this.vDp);
        this.COT = zp;
        if (zp != null) {
            this.jU = zp.KS();
            if (this.KS.aax()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.HWF, "6")) {
                if (this.KS.Vjb() && !TextUtils.isEmpty(this.KS.fs())) {
                    this.QR = new RippleView(this.zp, com.bytedance.sdk.component.adexpress.dynamic.KS.QR.zp(this.KS.fs()));
                } else {
                    this.QR = new RippleView(this.zp, Color.parseColor("#99000000"));
                }
                FrameLayout frameLayout = new FrameLayout(this.zp);
                frameLayout.addView(this.QR, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.1
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.QR.lMd();
                    }
                });
            }
            if (TextUtils.equals(this.HWF, "20")) {
                this.tG = (DynamicBrushMaskView) this.COT.KS();
            }
            if (zp(this.HWF) && com.bytedance.sdk.component.adexpress.jU.lMd()) {
                int parseColor = Color.parseColor("#99000000");
                if (this.KS.Vjb() && !TextUtils.isEmpty(this.KS.fs())) {
                    try {
                        parseColor = com.bytedance.sdk.component.adexpress.dynamic.KS.QR.zp(this.KS.fs());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.zp);
                view.setBackgroundColor(parseColor);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.COT.KS());
            zp(this.COT.KS());
            setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YW() {
        if (this.ku != null) {
            setOnClickListener((View.OnClickListener) this.lMd.getDynamicClickListener());
            performClick();
            if (!this.KS.bQm()) {
                setVisibility(8);
            }
        }
    }

    private boolean ku() {
        if (this.KS.qtv() || TextUtils.equals("9", this.HWF) || TextUtils.equals("16", this.HWF) || TextUtils.equals("17", this.HWF) || TextUtils.equals("18", this.HWF) || TextUtils.equals("20", this.HWF) || TextUtils.equals("29", this.HWF) || TextUtils.equals("10", this.HWF)) {
            return false;
        }
        return true;
    }

    public void COT() {
        if (this.jU != null && TextUtils.equals(this.HWF, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            View view = this.jU;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).KS();
            }
        }
    }

    public void HWF() {
        if (this.jU != null && TextUtils.equals(this.HWF, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            View view = this.jU;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).jU();
            }
        }
    }

    public void KS() {
        ku kuVar = this.COT;
        if (kuVar != null) {
            kuVar.zp();
        }
    }

    public void jU() {
        ku kuVar = this.COT;
        if (kuVar != null) {
            kuVar.lMd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            ku kuVar = this.COT;
            if (kuVar != null) {
                kuVar.lMd();
            }
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.lMd(e4.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.ku instanceof com.bytedance.sdk.component.adexpress.dynamic.interact.zp.KS) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private boolean zp(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.YW
    public void lMd() {
        if (ku()) {
            setOnClickListener((View.OnClickListener) this.lMd.getDynamicClickListener());
            performClick();
            if (this.KS.bQm()) {
                return;
            }
            setVisibility(8);
        }
    }

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr, com.bytedance.sdk.component.adexpress.dynamic.KS.dT dTVar, com.bytedance.sdk.component.adexpress.lMd.tG tGVar) {
        super(context);
        this.zp = context;
        this.lMd = dynamicBaseWidget;
        this.KS = qr;
        this.Bj = dTVar;
        this.vDp = tGVar;
        QR();
    }

    private void zp(ViewGroup viewGroup) {
        if (this.jU == null) {
            return;
        }
        String str = this.HWF;
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c9 = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c9 = 1;
                    break;
                }
                break;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                if (str.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    c9 = 2;
                    break;
                }
                break;
            case 53:
                if (str.equals(CampaignEx.CLICKMODE_ON)) {
                    c9 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c9 = 4;
                    break;
                }
                break;
            case 55:
                if (str.equals("7")) {
                    c9 = 5;
                    break;
                }
                break;
            case 56:
                if (str.equals("8")) {
                    c9 = 6;
                    break;
                }
                break;
            case 57:
                if (str.equals("9")) {
                    c9 = 7;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c9 = '\b';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c9 = '\t';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c9 = '\n';
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c9 = 11;
                    break;
                }
                break;
            case 1571:
                if (str.equals("14")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 1573:
                if (str.equals("16")) {
                    c9 = '\r';
                    break;
                }
                break;
            case 1574:
                if (str.equals("17")) {
                    c9 = 14;
                    break;
                }
                break;
            case 1575:
                if (str.equals("18")) {
                    c9 = 15;
                    break;
                }
                break;
            case 1598:
                if (str.equals("20")) {
                    c9 = 16;
                    break;
                }
                break;
            case 1600:
                if (str.equals("22")) {
                    c9 = 17;
                    break;
                }
                break;
            case 1601:
                if (str.equals("23")) {
                    c9 = 18;
                    break;
                }
                break;
            case 1602:
                if (str.equals("24")) {
                    c9 = 19;
                    break;
                }
                break;
            case 1603:
                if (str.equals("25")) {
                    c9 = 20;
                    break;
                }
                break;
            case 1607:
                if (str.equals("29")) {
                    c9 = 21;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.COT(this, this.YW);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case 1:
            case 4:
                if (!this.KS.Vjb() || TextUtils.isEmpty(this.KS.fs())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.HWF(this);
                break;
            case 2:
            case 5:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.lMd(this, this);
                break;
            case 3:
                if (this.KS.Vjb() && !TextUtils.isEmpty(this.KS.fs())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.KS.QR.zp(this.KS.fs()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.KS(this);
                this.jU.setTag(2);
                break;
            case 6:
            case '\t':
                this.lMd.setClipChildren(false);
                this.lMd.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.lMd.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.HWF(this);
                break;
            case 7:
            case 14:
                this.jU.setTag(2);
                break;
            case '\b':
                this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.jU(this, this.YW, this.dT);
                break;
            case '\n':
                this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.KS(this);
                this.jU.setTag(2);
                break;
            case 11:
            case 19:
                if (this.HWF.equals("24") && com.bytedance.sdk.component.adexpress.jU.lMd()) {
                    this.lMd.setClipChildren(false);
                    this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.HWF(this);
                    break;
                } else {
                    this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.COT(this, this.YW);
                    break;
                }
            case '\f':
                this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.lMd(this, this);
                break;
            case '\r':
                View view = this.jU;
                if (view != null && (view instanceof ShakeAnimationView) && ((ShakeAnimationView) view).getShakeLayout() != null) {
                    ((ShakeAnimationView) this.jU).getShakeLayout().setTag(2);
                }
                this.jU.setTag(2);
                break;
            case 15:
                View view2 = this.jU;
                if (view2 != null && (view2 instanceof WriggleGuideAnimationView) && ((WriggleGuideAnimationView) view2).getWriggleLayout() != null) {
                    ((WriggleGuideAnimationView) this.jU).getWriggleLayout().setTag(2);
                }
                this.jU.setTag(2);
                break;
            case 16:
                this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.zp(this, this.YW, viewGroup);
                break;
            case 17:
                if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                    this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.ku(this, this.dT);
                    break;
                } else {
                    this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.QR(this, this.YW, viewGroup);
                    break;
                }
            case 18:
                if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                    this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.HWF(this);
                    break;
                }
                break;
            case 20:
                if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                    this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.ku(this, this.dT);
                    break;
                }
                break;
            case 21:
                View view3 = this.jU;
                if (view3 != null && (view3 instanceof ClickSlideUpShakeView) && ((ClickSlideUpShakeView) view3).getShakeView() != null) {
                    ((ClickSlideUpShakeView) this.jU).getShakeView().setTag(2);
                }
                this.ku = new com.bytedance.sdk.component.adexpress.dynamic.interact.zp.COT(this, this.YW);
                break;
        }
        View.OnTouchListener onTouchListener = this.ku;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (ku()) {
            this.jU.setTag(2);
            setOnClickListener((View.OnClickListener) this.lMd.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.YW
    public void zp() {
        if (TextUtils.equals(this.HWF, "6")) {
            RippleView rippleView = this.QR;
            if (rippleView != null) {
                rippleView.KS();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.YW();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.HWF, "20")) {
            DynamicBrushMaskView dynamicBrushMaskView = this.tG;
            if (dynamicBrushMaskView != null) {
                dynamicBrushMaskView.zp();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.3
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.YW();
                    }
                }, 400L);
                return;
            }
            return;
        }
        YW();
    }
}
