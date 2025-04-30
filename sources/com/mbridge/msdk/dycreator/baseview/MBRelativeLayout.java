package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.impl.L;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MBRelativeLayout extends RelativeLayout implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private float f15016a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f15017c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f15018d;

    /* renamed from: e, reason: collision with root package name */
    private String f15019e;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBRelativeLayout$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15020a;

        static {
            int[] iArr = new int[c.values().length];
            f15020a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15020a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15020a[c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15020a[c.layout_alignParentBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15020a[c.layout_alignParentTop.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15020a[c.layout_centerVertical.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15020a[c.layout_below.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15020a[c.layout_above.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15020a[c.layout_toLeftOf.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15020a[c.layout_toRightOf.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15020a[c.layout_toEndOf.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15020a[c.layout_margin.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15020a[c.layout_marginLeft.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15020a[c.layout_marginRight.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15020a[c.layout_marginTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15020a[c.layout_marginBottom.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15020a[c.layout_alignParentRight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15020a[c.layout_alignParentLeft.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f15020a[c.layout_alignTop.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f15020a[c.layout_alignLeft.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f15020a[c.layout_alignRight.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f15020a[c.layout_alignBottom.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f15020a[c.layout_centerInParent.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f15020a[c.layout_alignParentEnd.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public MBRelativeLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15019e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f15017c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f15017c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f15017c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f15017c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f15017c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f15017c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f15017c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f15017c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f15017c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f15017c.get("mbridgeStrategy");
        }
        return "";
    }

    public float getxInScreen() {
        return this.f15016a;
    }

    public float getyInScreen() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f15018d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f15018d.get("mbridgeAttached").booleanValue()) {
            L.g("mbridgeAttached").a(this.f15019e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f15018d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f15018d.get("mbridgeDetached").booleanValue()) {
            L.g("mbridgeDetached").a(this.f15019e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f15016a = motionEvent.getRawX();
        this.b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            try {
                View childAt = getChildAt(i13);
                if (childAt instanceof MBLinearLayout) {
                    MBLinearLayout mBLinearLayout = (MBLinearLayout) childAt;
                    for (int i14 = 0; i14 < mBLinearLayout.getChildCount(); i14++) {
                    }
                }
            } catch (Exception e4) {
                ad.b("MBRelativeLayouts", e4.getMessage());
            }
        }
        super.onLayout(z8, i9, i10, i11, i12);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f15018d = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f15019e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        HashMap b = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = (c) b.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                switch (AnonymousClass1.f15020a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i9);
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
                        String attributeValue2 = attributeSet.getAttributeValue(i9);
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
                        if (attributeSet.getAttributeBooleanValue(i9, false)) {
                            layoutParams.addRule(14, -1);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (attributeSet.getAttributeBooleanValue(i9, false)) {
                            layoutParams.addRule(12, -1);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (attributeSet.getAttributeBooleanValue(i9, false)) {
                            layoutParams.addRule(10, -1);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (attributeSet.getAttributeBooleanValue(i9, false)) {
                            layoutParams.addRule(15, -1);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue3 = attributeSet.getAttributeValue(i9);
                        if (attributeValue3.startsWith("@+id")) {
                            L.t(attributeValue3, 5, layoutParams, 3);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        String attributeValue4 = attributeSet.getAttributeValue(i9);
                        if (attributeValue4.startsWith("@+id")) {
                            L.t(attributeValue4, 5, layoutParams, 2);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        String attributeValue5 = attributeSet.getAttributeValue(i9);
                        if (attributeValue5.startsWith("@+id")) {
                            L.t(attributeValue5, 5, layoutParams, 0);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        String attributeValue6 = attributeSet.getAttributeValue(i9);
                        if (attributeValue6.startsWith("@+id")) {
                            L.t(attributeValue6, 5, layoutParams, 1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        String attributeValue7 = attributeSet.getAttributeValue(i9);
                        if (attributeValue7.startsWith("@+id")) {
                            L.t(attributeValue7, 5, layoutParams, 17);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int b8 = b.a().b(attributeSet.getAttributeValue(i9));
                        layoutParams.setMargins(b8, b8, b8, b8);
                        break;
                    case 13:
                        layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i9));
                        break;
                    case 14:
                        layoutParams.rightMargin = b.a().b(attributeSet.getAttributeValue(i9));
                        break;
                    case 15:
                        layoutParams.topMargin = b.a().b(attributeSet.getAttributeValue(i9));
                        break;
                    case 16:
                        layoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i9));
                        break;
                    case 17:
                        if (attributeSet.getAttributeBooleanValue(i9, false)) {
                            layoutParams.addRule(11, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        if (attributeSet.getAttributeBooleanValue(i9, false)) {
                            layoutParams.addRule(9, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        String attributeValue8 = attributeSet.getAttributeValue(i9);
                        if (attributeValue8.startsWith("@+id")) {
                            L.t(attributeValue8, 5, layoutParams, 6);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        String attributeValue9 = attributeSet.getAttributeValue(i9);
                        if (attributeValue9.startsWith("@+id")) {
                            L.t(attributeValue9, 5, layoutParams, 5);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        String attributeValue10 = attributeSet.getAttributeValue(i9);
                        if (attributeValue10.startsWith("@+id")) {
                            L.t(attributeValue10, 5, layoutParams, 7);
                            break;
                        } else {
                            break;
                        }
                    case 22:
                        String attributeValue11 = attributeSet.getAttributeValue(i9);
                        if (attributeValue11.startsWith("@+id")) {
                            L.t(attributeValue11, 5, layoutParams, 8);
                            break;
                        } else {
                            break;
                        }
                    case 23:
                        if (attributeSet.getAttributeBooleanValue(i9, false)) {
                            layoutParams.addRule(13, -1);
                            break;
                        } else {
                            break;
                        }
                    case 24:
                        if (attributeSet.getAttributeBooleanValue(i9, false)) {
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
        this.f15019e = "";
        try {
            this.f15017c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f15017c, this);
        } catch (Exception e4) {
            ad.b("MBRelativeLayouts", e4.getMessage());
        }
    }

    public MBRelativeLayout(Context context) {
        super(context);
        this.f15019e = "";
    }
}
