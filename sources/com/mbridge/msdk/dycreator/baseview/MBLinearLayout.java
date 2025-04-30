package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.applovin.impl.L;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MBLinearLayout extends LinearLayout implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private float f15003a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f15004c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f15005d;

    /* renamed from: e, reason: collision with root package name */
    private String f15006e;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBLinearLayout$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15007a;

        static {
            int[] iArr = new int[c.values().length];
            f15007a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15007a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15007a[c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15007a[c.layout_centerVertical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15007a[c.layout_weight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15007a[c.gravity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15007a[c.layout_margin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15007a[c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15007a[c.layout_marginRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15007a[c.layout_marginTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15007a[c.layout_marginBottom.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15007a[c.layout_gravity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public MBLinearLayout(Context context) {
        super(context);
        this.f15006e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f15004c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f15004c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f15004c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f15004c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f15004c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f15004c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f15004c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f15004c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f15004c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f15004c.get("mbridgeStrategy");
        }
        return "";
    }

    public float getxInScreen() {
        return this.f15003a;
    }

    public float getyInScreen() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f15005d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f15005d.get("mbridgeAttached").booleanValue()) {
            L.g("mbridgeAttached").a(this.f15006e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f15005d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f15005d.get("mbridgeDetached").booleanValue()) {
            L.g("mbridgeDetached").a(this.f15006e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f15003a = motionEvent.getRawX();
        this.b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f15005d = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f15006e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap b = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = (c) b.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                switch (AnonymousClass1.f15007a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i9);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("wrap")) {
                                generateDefaultLayoutParams.width = -2;
                                break;
                            } else {
                                generateDefaultLayoutParams.width = b.a().b(attributeValue);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.width = -1;
                            break;
                        }
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i9);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                generateDefaultLayoutParams.height = -2;
                                break;
                            } else {
                                generateDefaultLayoutParams.height = b.a().b(attributeValue2);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.height = -1;
                            break;
                        }
                        break;
                    case 3:
                        generateDefaultLayoutParams.gravity = 1;
                        break;
                    case 4:
                        generateDefaultLayoutParams.gravity = 16;
                        break;
                    case 5:
                        generateDefaultLayoutParams.weight = attributeSet.getAttributeFloatValue(i9, 0.0f);
                        break;
                    case 6:
                        setGravity(b.a().c(attributeSet.getAttributeValue(i9)));
                        break;
                    case 7:
                        int b8 = b.a().b(attributeSet.getAttributeValue(i9));
                        generateDefaultLayoutParams.bottomMargin = b8;
                        generateDefaultLayoutParams.leftMargin = b8;
                        generateDefaultLayoutParams.rightMargin = b8;
                        generateDefaultLayoutParams.topMargin = b8;
                        break;
                    case 8:
                        generateDefaultLayoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i9));
                        break;
                    case 9:
                        generateDefaultLayoutParams.rightMargin = b.a().b(attributeSet.getAttributeValue(i9));
                        break;
                    case 10:
                        generateDefaultLayoutParams.topMargin = b.a().b(attributeSet.getAttributeValue(i9));
                        break;
                    case 11:
                        generateDefaultLayoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i9));
                        break;
                    case 12:
                        generateDefaultLayoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i9));
                        break;
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f15006e = "";
        this.f15004c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        com.mbridge.msdk.dycreator.e.c.a(this.f15004c, this);
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15006e = "";
    }
}
