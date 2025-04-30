package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
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
public class MBTextView extends TextView implements InterBase, InterEffect {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15055a;
    public AttributeSet attrs;
    private Animator b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f15056c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f15057d;

    /* renamed from: e, reason: collision with root package name */
    private String f15058e;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBTextView$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15059a;

        static {
            int[] iArr = new int[c.values().length];
            f15059a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15059a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBTextView(Context context) {
        super(context);
        this.f15055a = false;
        this.f15058e = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap b = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = (c) b.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                int i10 = AnonymousClass1.f15059a[cVar.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        String attributeValue = attributeSet.getAttributeValue(i9);
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
                    String attributeValue2 = attributeSet.getAttributeValue(i9);
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
        Map<String, String> map = this.f15056c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f15056c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f15056c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f15056c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f15056c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f15056c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f15056c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f15056c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f15056c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f15056c.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (this.f15055a) {
            return true;
        }
        return super.isFocused();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Animator animator = this.b;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f15057d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f15057d.get("mbridgeAttached").booleanValue()) {
            L.g("mbridgeAttached").a(this.f15058e);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.b;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f15057d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f15057d.get("mbridgeDetached").booleanValue()) {
            L.g("mbridgeDetached").a(this.f15058e);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
        this.b = animator;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f15057d = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f15058e = campaignEx.getCampaignUnitId();
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f15055a = false;
        this.f15058e = "";
        this.attrs = attributeSet;
        try {
            this.f15056c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f15056c, this);
        } catch (Exception e4) {
            ad.b("TextView", e4.getMessage());
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15055a = false;
        this.f15058e = "";
    }
}
