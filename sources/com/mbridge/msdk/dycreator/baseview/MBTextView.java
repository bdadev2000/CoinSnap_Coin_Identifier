package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
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
public class MBTextView extends TextView implements InterBase, InterEffect {
    private boolean a;
    public AttributeSet attrs;

    /* renamed from: b, reason: collision with root package name */
    private Animator f12731b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f12732c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f12733d;

    /* renamed from: e, reason: collision with root package name */
    private String f12734e;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBTextView$1, reason: invalid class name */
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
        }
    }

    public MBTextView(Context context) {
        super(context);
        this.a = false;
        this.f12734e = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap b3 = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) b3.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.a[cVar.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("wrap")) {
                                layoutParams.height = -2;
                            } else {
                                layoutParams.height = b.a().b(attributeValue);
                            }
                        } else {
                            layoutParams.height = -1;
                        }
                    }
                } else {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                        if (attributeValue2.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().b(attributeValue2);
                        }
                    } else {
                        layoutParams.width = -1;
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f12732c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f12732c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f12732c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f12732c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f12732c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f12732c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f12732c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f12732c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f12732c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f12732c.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (this.a) {
            return true;
        }
        return super.isFocused();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Animator animator = this.f12731b;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f12733d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f12733d.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12734e);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f12731b;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f12733d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f12733d.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12734e);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
        this.f12731b = animator;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f12733d = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f12734e = campaignEx.getCampaignUnitId();
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet) {
        super(context);
        this.a = false;
        this.f12734e = "";
        this.attrs = attributeSet;
        try {
            this.f12732c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f12732c, this);
        } catch (Exception e2) {
            ad.b("TextView", e2.getMessage());
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = false;
        this.f12734e = "";
    }
}
