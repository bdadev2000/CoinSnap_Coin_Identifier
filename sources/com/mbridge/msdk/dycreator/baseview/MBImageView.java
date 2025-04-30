package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public class MBImageView extends ImageView implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Boolean> f14997a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f14998c;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBImageView$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14999a;

        static {
            int[] iArr = new int[c.values().length];
            f14999a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14999a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14999a[c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context);
        this.b = "";
        if (context != null && attributeSet != null) {
            try {
                this.f14998c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            } catch (Exception e4) {
                ad.b("MBImageView", e4.getMessage());
                return;
            }
        }
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(context, attributeSet));
        com.mbridge.msdk.dycreator.e.c.a(this.f14998c, this);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap<String, c> c9 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = c9.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                int i10 = AnonymousClass1.f14999a[cVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            String attributeValue = attributeSet.getAttributeValue(i9);
                            if (!TextUtils.isEmpty(attributeValue)) {
                                if (attributeValue.equals("invisible")) {
                                    setVisibility(4);
                                } else if (attributeValue.equalsIgnoreCase("gone")) {
                                    setVisibility(8);
                                }
                            }
                        }
                    } else {
                        String attributeValue2 = attributeSet.getAttributeValue(i9);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                layoutParams.height = -2;
                            } else {
                                layoutParams.height = b.a().b(attributeValue2);
                            }
                        } else {
                            layoutParams.height = -1;
                        }
                    }
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i9);
                    if (!attributeValue3.startsWith("f") && !attributeValue3.startsWith("m")) {
                        if (attributeValue3.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().b(attributeValue3);
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
        Map<String, String> map = this.f14998c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f14998c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f14998c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f14998c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f14998c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f14998c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f14998c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f14998c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f14998c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f14998c.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f14997a;
        if (map != null && map.containsKey("mbridgeAttached") && this.f14997a.get("mbridgeAttached").booleanValue()) {
            L.g("mbridgeAttached").a(this.b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f14997a;
        if (map != null && map.containsKey("mbridgeDetached") && this.f14997a.get("mbridgeDetached").booleanValue()) {
            L.g("mbridgeDetached").a(this.b);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f14997a = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.b = campaignEx.getCampaignUnitId();
        }
    }
}
