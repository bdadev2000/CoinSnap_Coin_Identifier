package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.inter.InterEffect;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBFrameLayout extends FrameLayout implements InterBase, InterEffect {
    private Animator a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f12674b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Boolean> f12675c;

    /* renamed from: d, reason: collision with root package name */
    private String f12676d;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBFrameLayout$1, reason: invalid class name */
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
                a[c.layout_marginLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.layout_margin.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MBFrameLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f12676d = "";
        try {
            this.f12674b = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f12674b, this);
        } catch (Exception e2) {
            ad.b("MBFrameLayout", e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f12674b;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f12674b.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f12674b;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f12674b.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f12674b;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f12674b.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f12674b;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f12674b.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f12674b;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f12674b.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            Animator animator = this.a;
            if (animator != null) {
                animator.start();
            }
        } catch (Exception e2) {
            ad.b("MBFrameLayout", e2.getMessage());
        }
        Map<String, Boolean> map = this.f12675c;
        if (map != null && map.containsKey("mbridgeAttached") && this.f12675c.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12676d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            Animator animator = this.a;
            if (animator != null) {
                animator.cancel();
            }
        } catch (Exception e2) {
            ad.b("MBFrameLayout", e2.getMessage());
        }
        Map<String, Boolean> map = this.f12675c;
        if (map != null && map.containsKey("mbridgeDetached") && this.f12675c.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12676d);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
        this.a = animator;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f12675c = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f12676d = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        HashMap b3 = b.a().b();
        layoutParams.width = -2;
        layoutParams.height = -2;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) b3.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.a[cVar.ordinal()];
                if (i11 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                        if (attributeValue.startsWith("w")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().b(attributeValue);
                        }
                    } else {
                        layoutParams.width = -1;
                    }
                } else if (i11 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                        if (attributeValue2.startsWith("w")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.height = b.a().b(attributeValue2);
                        }
                    } else {
                        layoutParams.width = -1;
                    }
                } else if (i11 == 3) {
                    layoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i10));
                } else if (i11 == 4) {
                    layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i10));
                } else if (i11 == 5) {
                    int b10 = b.a().b(attributeSet.getAttributeValue(i10));
                    layoutParams.setMargins(b10, b10, b10, b10);
                }
            }
        }
        return layoutParams;
    }
}
