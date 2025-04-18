package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.PlayerView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBPlayerView extends PlayerView implements InterBase {
    private float a;

    /* renamed from: b, reason: collision with root package name */
    private float f12691b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f12692c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f12693d;

    /* renamed from: e, reason: collision with root package name */
    private String f12694e;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBPlayerView$1, reason: invalid class name */
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
                a[c.layout_centerVertical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.layout_weight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.gravity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.layout_margin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.layout_marginRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.layout_marginTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.layout_marginBottom.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.layout_gravity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public MBPlayerView(Context context) {
        super(context);
        this.f12694e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f12692c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f12692c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f12692c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f12692c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f12692c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f12692c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f12692c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f12692c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f12692c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f12692c.get("mbridgeStrategy");
        }
        return "";
    }

    public float getxInScreen() {
        return this.a;
    }

    public float getyInScreen() {
        return this.f12691b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f12693d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f12693d.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12694e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f12693d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f12693d.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12694e);
        }
    }

    @Override // com.mbridge.msdk.playercommon.PlayerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.a = motionEvent.getRawX();
        this.f12691b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f12693d = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f12694e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        HashMap b3 = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) b3.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("wrap")) {
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
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
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
                        break;
                    case 3:
                        layoutParams.gravity = 1;
                        break;
                    case 4:
                        layoutParams.gravity = 16;
                        break;
                    case 5:
                        layoutParams.weight = attributeSet.getAttributeFloatValue(i10, 0.0f);
                        break;
                    case 6:
                        setGravity(b.a().c(attributeSet.getAttributeValue(i10)));
                        break;
                    case 7:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i10));
                        layoutParams.bottomMargin = b10;
                        layoutParams.leftMargin = b10;
                        layoutParams.rightMargin = b10;
                        layoutParams.topMargin = b10;
                        break;
                    case 8:
                        layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 9:
                        layoutParams.rightMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 10:
                        layoutParams.topMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 11:
                        layoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 12:
                        layoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i10));
                        break;
                }
            }
        }
        return layoutParams;
    }

    public MBPlayerView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f12694e = "";
        try {
            this.f12692c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f12692c, this);
        } catch (Exception e2) {
            ad.b("MBLinearLayout", e2.getMessage());
        }
    }
}
