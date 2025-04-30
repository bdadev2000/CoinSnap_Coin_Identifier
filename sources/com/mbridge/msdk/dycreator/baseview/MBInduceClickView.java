package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.applovin.impl.L;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.inter.InterEffect;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MBInduceClickView extends FrameLayout implements InterBase, InterEffect {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f15000a;
    private Map<String, Boolean> b;

    /* renamed from: c, reason: collision with root package name */
    private String f15001c;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBInduceClickView$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15002a;

        static {
            int[] iArr = new int[c.values().length];
            f15002a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15002a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15002a[c.layout_gravity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15002a[c.layout_marginLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15002a[c.layout_margin.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MBInduceClickView(Context context) {
        super(context);
        this.f15001c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f15000a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f15000a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f15000a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f15000a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f15000a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f15000a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f15000a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f15000a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f15000a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f15000a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.b;
        if (map != null && map.containsKey("mbridgeAttached") && this.b.get("mbridgeAttached").booleanValue()) {
            L.g("mbridgeAttached").a(this.f15001c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.b;
        if (map != null && map.containsKey("mbridgeDetached") && this.b.get("mbridgeDetached").booleanValue()) {
            L.g("mbridgeDetached").a(this.f15001c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.b = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f15001c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        HashMap b = b.a().b();
        layoutParams.width = -2;
        layoutParams.height = -2;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = (c) b.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                int i10 = AnonymousClass1.f15002a[cVar.ordinal()];
                if (i10 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i9);
                    if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                        if (attributeValue.startsWith("w")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().b(attributeValue);
                        }
                    } else {
                        layoutParams.width = -1;
                    }
                } else if (i10 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i9);
                    if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                        if (attributeValue2.startsWith("w")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.height = b.a().b(attributeValue2);
                        }
                    } else {
                        layoutParams.width = -1;
                    }
                } else if (i10 == 3) {
                    layoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i9));
                } else if (i10 == 4) {
                    layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i9));
                } else if (i10 == 5) {
                    int b8 = b.a().b(attributeSet.getAttributeValue(i9));
                    layoutParams.setMargins(b8, b8, b8, b8);
                }
            }
        }
        return layoutParams;
    }

    public MBInduceClickView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f15001c = "";
        if (context != null && attributeSet != null) {
            try {
                this.f15000a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            } catch (Exception e4) {
                ad.b("MBInduceClickView", e4.getMessage());
                return;
            }
        }
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        com.mbridge.msdk.dycreator.e.c.a(this.f15000a, this);
    }

    public MBInduceClickView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15001c = "";
    }
}
