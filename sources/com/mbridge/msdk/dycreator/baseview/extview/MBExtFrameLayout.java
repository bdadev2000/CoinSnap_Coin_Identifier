package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBExtFrameLayout extends MBridgeFramLayout implements InterBase {
    private Map<String, String> a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f12814b;

    /* renamed from: c, reason: collision with root package name */
    private String f12815c;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtFrameLayout$1, reason: invalid class name */
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
                a[c.layout_gravity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.layout_margin.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.layout_marginLeft.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.layout_marginRight.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.layout_marginTop.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.layout_marginBottom.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public MBExtFrameLayout(Context context) {
        super(context);
        this.f12815c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f12814b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f12814b.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12815c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f12814b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f12814b.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12815c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f12814b = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f12815c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap b3 = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) b3.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("w")) {
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
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("w")) {
                                generateDefaultLayoutParams.width = -2;
                                break;
                            } else {
                                generateDefaultLayoutParams.height = b.a().b(attributeValue2);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.width = -1;
                            break;
                        }
                    case 3:
                        generateDefaultLayoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i10));
                        break;
                    case 4:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i10));
                        generateDefaultLayoutParams.setMargins(b10, b10, b10, b10);
                        break;
                    case 5:
                        generateDefaultLayoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 6:
                        generateDefaultLayoutParams.rightMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 7:
                        generateDefaultLayoutParams.topMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 8:
                        generateDefaultLayoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    public MBExtFrameLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f12815c = "";
        try {
            this.a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.a, this);
        } catch (Exception e2) {
            ad.b("MBExtFrameLayout", e2.getMessage());
        }
    }

    public MBExtFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12815c = "";
    }
}
