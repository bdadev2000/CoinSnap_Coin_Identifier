package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.vc.YI;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes.dex */
public class NjR extends FrameLayout implements qsH {
    private View AlY;
    private com.bytedance.sdk.component.adexpress.vc.Wwa DSW;
    private int NjR;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN Sg;
    private Context YFl;
    private com.bytedance.sdk.component.adexpress.Sg.GA YoT;
    private com.bytedance.sdk.component.adexpress.dynamic.AlY.nc eT;

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10390nc;
    private View.OnTouchListener qsH;
    private com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10391vc;
    private DSW wN;

    public NjR(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        super(context);
        this.YFl = context;
        this.Sg = wNVar;
        this.tN = dsw;
        DSW();
    }

    private void DSW() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.f10391vc = this.tN.BPI();
        this.NjR = this.tN.fIu();
        this.f10390nc = this.tN.RX();
        DSW YFl = nc.YFl(this.YFl, this.Sg, this.tN, this.eT, this.YoT);
        this.wN = YFl;
        if (YFl != null) {
            this.AlY = YFl.tN();
            if (this.tN.zG()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.f10391vc, "6")) {
                if (this.tN.tQ() && !TextUtils.isEmpty(this.tN.ib())) {
                    this.DSW = new com.bytedance.sdk.component.adexpress.vc.Wwa(this.YFl, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW.YFl(this.tN.ib()));
                } else {
                    this.DSW = new com.bytedance.sdk.component.adexpress.vc.Wwa(this.YFl, Color.parseColor("#99000000"));
                }
                FrameLayout frameLayout = new FrameLayout(this.YFl);
                frameLayout.addView(this.DSW, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.tN.NjR.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NjR.this.DSW.Sg();
                    }
                });
            }
            if (YFl(this.f10391vc) && com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                int parseColor = Color.parseColor("#99000000");
                if (this.tN.tQ() && !TextUtils.isEmpty(this.tN.ib())) {
                    try {
                        parseColor = com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW.YFl(this.tN.ib());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.YFl);
                view.setBackgroundColor(parseColor);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.wN.tN());
            YFl(this.wN.tN());
            setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NjR() {
        if (this.qsH != null) {
            setOnClickListener((View.OnClickListener) this.Sg.getDynamicClickListener());
            performClick();
            if (!this.tN.YP()) {
                setVisibility(8);
            }
        }
    }

    private boolean qsH() {
        if (this.tN.RX() || TextUtils.equals("9", this.f10391vc) || TextUtils.equals("16", this.f10391vc) || TextUtils.equals("17", this.f10391vc) || TextUtils.equals("18", this.f10391vc) || TextUtils.equals("20", this.f10391vc) || TextUtils.equals("29", this.f10391vc) || TextUtils.equals("10", this.f10391vc)) {
            return false;
        }
        return true;
    }

    public void AlY() {
        DSW dsw = this.wN;
        if (dsw != null) {
            dsw.Sg();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            DSW dsw = this.wN;
            if (dsw != null) {
                dsw.Sg();
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.Sg(e2.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.qsH instanceof com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.tN) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void tN() {
        DSW dsw = this.wN;
        if (dsw != null) {
            dsw.YFl();
        }
    }

    public void vc() {
        if (this.AlY != null && TextUtils.equals(this.f10391vc, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            View view = this.AlY;
            if (view instanceof com.bytedance.sdk.component.adexpress.vc.tN) {
                ((com.bytedance.sdk.component.adexpress.vc.tN) view).AlY();
            }
        }
    }

    public void wN() {
        if (this.AlY != null && TextUtils.equals(this.f10391vc, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            View view = this.AlY;
            if (view instanceof com.bytedance.sdk.component.adexpress.vc.tN) {
                ((com.bytedance.sdk.component.adexpress.vc.tN) view).tN();
            }
        }
    }

    private boolean YFl(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.qsH
    public void Sg() {
        if (qsH()) {
            setOnClickListener((View.OnClickListener) this.Sg.getDynamicClickListener());
            performClick();
            if (this.tN.YP()) {
                return;
            }
            setVisibility(8);
        }
    }

    public NjR(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw, com.bytedance.sdk.component.adexpress.dynamic.AlY.nc ncVar, com.bytedance.sdk.component.adexpress.Sg.GA ga2) {
        super(context);
        this.YFl = context;
        this.Sg = wNVar;
        this.tN = dsw;
        this.eT = ncVar;
        this.YoT = ga2;
        DSW();
    }

    private void YFl(ViewGroup viewGroup) {
        if (this.AlY == null) {
            return;
        }
        String str = this.f10391vc;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c10 = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c10 = 1;
                    break;
                }
                break;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                if (str.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    c10 = 2;
                    break;
                }
                break;
            case 53:
                if (str.equals(CampaignEx.CLICKMODE_ON)) {
                    c10 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c10 = 4;
                    break;
                }
                break;
            case 55:
                if (str.equals("7")) {
                    c10 = 5;
                    break;
                }
                break;
            case 56:
                if (str.equals("8")) {
                    c10 = 6;
                    break;
                }
                break;
            case 57:
                if (str.equals("9")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1571:
                if (str.equals("14")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1573:
                if (str.equals("16")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1574:
                if (str.equals("17")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1575:
                if (str.equals("18")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1598:
                if (str.equals("20")) {
                    c10 = 16;
                    break;
                }
                break;
            case 1600:
                if (str.equals("22")) {
                    c10 = 17;
                    break;
                }
                break;
            case 1601:
                if (str.equals("23")) {
                    c10 = 18;
                    break;
                }
                break;
            case 1602:
                if (str.equals("24")) {
                    c10 = 19;
                    break;
                }
                break;
            case 1603:
                if (str.equals("25")) {
                    c10 = 20;
                    break;
                }
                break;
            case 1607:
                if (str.equals("29")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.wN(this, this.NjR);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case 1:
            case 4:
                if (!this.tN.tQ() || TextUtils.isEmpty(this.tN.ib())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.vc(this);
                break;
            case 2:
            case 5:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.Sg(this, this);
                break;
            case 3:
                if (this.tN.tQ() && !TextUtils.isEmpty(this.tN.ib())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW.YFl(this.tN.ib()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.tN(this);
                this.AlY.setTag(2);
                break;
            case 6:
            case '\t':
                this.Sg.setClipChildren(false);
                this.Sg.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.Sg.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.vc(this);
                break;
            case 7:
            case 14:
                this.AlY.setTag(2);
                break;
            case '\b':
                this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.AlY(this, this.NjR, this.f10390nc);
                break;
            case '\n':
                this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.tN(this);
                this.AlY.setTag(2);
                break;
            case 11:
            case 19:
                if (this.f10391vc.equals("24") && com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    this.Sg.setClipChildren(false);
                    this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.vc(this);
                    break;
                } else {
                    this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.wN(this, this.NjR);
                    break;
                }
            case '\f':
                this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.Sg(this, this);
                break;
            case '\r':
                View view = this.AlY;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.vc.qO) && ((com.bytedance.sdk.component.adexpress.vc.qO) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.vc.qO) this.AlY).getShakeLayout().setTag(2);
                }
                this.AlY.setTag(2);
                break;
            case 15:
                View view2 = this.AlY;
                if (view2 != null && (view2 instanceof YI) && ((YI) view2).getWriggleLayout() != null) {
                    ((YI) this.AlY).getWriggleLayout().setTag(2);
                }
                this.AlY.setTag(2);
                break;
            case 16:
                this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.YFl(this, this.NjR, viewGroup);
                break;
            case 17:
                if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.qsH(this, this.f10390nc);
                    break;
                } else {
                    this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.DSW(this, this.NjR, viewGroup);
                    break;
                }
            case 18:
                if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.vc(this);
                    break;
                }
                break;
            case 20:
                if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.qsH(this, this.f10390nc);
                    break;
                }
                break;
            case 21:
                View view3 = this.AlY;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.vc.vc) && ((com.bytedance.sdk.component.adexpress.vc.vc) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.vc.vc) this.AlY).getShakeView().setTag(2);
                }
                this.qsH = new com.bytedance.sdk.component.adexpress.dynamic.tN.YFl.wN(this, this.NjR);
                break;
        }
        View.OnTouchListener onTouchListener = this.qsH;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (qsH()) {
            this.AlY.setTag(2);
            setOnClickListener((View.OnClickListener) this.Sg.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.qsH
    public void YFl() {
        if (TextUtils.equals(this.f10391vc, "6")) {
            com.bytedance.sdk.component.adexpress.vc.Wwa wwa = this.DSW;
            if (wwa != null) {
                wwa.tN();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.tN.NjR.2
                    @Override // java.lang.Runnable
                    public void run() {
                        NjR.this.NjR();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.f10391vc, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.tN.NjR.3
                @Override // java.lang.Runnable
                public void run() {
                    NjR.this.NjR();
                }
            }, 400L);
        } else {
            NjR();
        }
    }
}
