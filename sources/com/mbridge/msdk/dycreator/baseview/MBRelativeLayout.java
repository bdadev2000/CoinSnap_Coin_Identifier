package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBRelativeLayout extends RelativeLayout implements InterBase {
    private float a;

    /* renamed from: b, reason: collision with root package name */
    private float f12695b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f12696c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f12697d;

    /* renamed from: e, reason: collision with root package name */
    private String f12698e;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBRelativeLayout$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.layout_alignParentBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.layout_alignParentTop.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.layout_centerVertical.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.layout_below.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.layout_above.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.layout_toLeftOf.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.layout_toRightOf.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.layout_toEndOf.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.layout_margin.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[c.layout_marginLeft.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[c.layout_marginRight.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[c.layout_marginTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[c.layout_marginBottom.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[c.layout_alignParentRight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[c.layout_alignParentLeft.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[c.layout_alignTop.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[c.layout_alignLeft.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[c.layout_alignRight.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[c.layout_alignBottom.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[c.layout_centerInParent.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[c.layout_alignParentEnd.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public MBRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12698e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f12696c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f12696c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f12696c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f12696c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f12696c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f12696c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f12696c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f12696c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f12696c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f12696c.get("mbridgeStrategy");
        }
        return "";
    }

    public float getxInScreen() {
        return this.a;
    }

    public float getyInScreen() {
        return this.f12695b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f12697d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f12697d.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12698e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f12697d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f12697d.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12698e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.a = motionEvent.getRawX();
        this.f12695b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            try {
                View childAt = getChildAt(i14);
                if (childAt instanceof MBLinearLayout) {
                    MBLinearLayout mBLinearLayout = (MBLinearLayout) childAt;
                    for (int i15 = 0; i15 < mBLinearLayout.getChildCount(); i15++) {
                    }
                }
            } catch (Exception e2) {
                ad.b("MBRelativeLayouts", e2.getMessage());
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f12697d = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f12698e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        HashMap b3 = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) b3.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (!attributeValue.startsWith("fill") && !attributeValue.startsWith("match")) {
                            if (attributeValue.startsWith("w")) {
                                layoutParams.width = -2;
                                break;
                            } else {
                                layoutParams.width = b.a().b(attributeValue);
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            break;
                        }
                        break;
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (!attributeValue2.startsWith("fill") && !attributeValue2.startsWith("match")) {
                            if (attributeValue2.startsWith("wrap")) {
                                layoutParams.height = -2;
                                break;
                            } else {
                                layoutParams.height = b.a().b(attributeValue2);
                                break;
                            }
                        } else {
                            layoutParams.height = -1;
                            break;
                        }
                    case 3:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(14, -1);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(12, -1);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(10, -1);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(15, -1);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (attributeValue3.startsWith("@+id")) {
                            e.q(attributeValue3, 5, layoutParams, 3);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (attributeValue4.startsWith("@+id")) {
                            e.q(attributeValue4, 5, layoutParams, 2);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (attributeValue5.startsWith("@+id")) {
                            e.q(attributeValue5, 5, layoutParams, 0);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (attributeValue6.startsWith("@+id")) {
                            e.q(attributeValue6, 5, layoutParams, 1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        String attributeValue7 = attributeSet.getAttributeValue(i10);
                        if (attributeValue7.startsWith("@+id")) {
                            e.q(attributeValue7, 5, layoutParams, 17);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i10));
                        layoutParams.setMargins(b10, b10, b10, b10);
                        break;
                    case 13:
                        layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 14:
                        layoutParams.rightMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 15:
                        layoutParams.topMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 16:
                        layoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 17:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(11, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(9, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        String attributeValue8 = attributeSet.getAttributeValue(i10);
                        if (attributeValue8.startsWith("@+id")) {
                            e.q(attributeValue8, 5, layoutParams, 6);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        String attributeValue9 = attributeSet.getAttributeValue(i10);
                        if (attributeValue9.startsWith("@+id")) {
                            e.q(attributeValue9, 5, layoutParams, 5);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        String attributeValue10 = attributeSet.getAttributeValue(i10);
                        if (attributeValue10.startsWith("@+id")) {
                            e.q(attributeValue10, 5, layoutParams, 7);
                            break;
                        } else {
                            break;
                        }
                    case 22:
                        String attributeValue11 = attributeSet.getAttributeValue(i10);
                        if (attributeValue11.startsWith("@+id")) {
                            e.q(attributeValue11, 5, layoutParams, 8);
                            break;
                        } else {
                            break;
                        }
                    case 23:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(13, -1);
                            break;
                        } else {
                            break;
                        }
                    case 24:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(21, -1);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return layoutParams;
    }

    public MBRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f12698e = "";
        try {
            this.f12696c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f12696c, this);
        } catch (Exception e2) {
            ad.b("MBRelativeLayouts", e2.getMessage());
        }
    }

    public MBRelativeLayout(Context context) {
        super(context);
        this.f12698e = "";
    }
}
