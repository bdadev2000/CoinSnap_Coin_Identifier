package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public class MBImageView extends ImageView implements InterBase {
    private Map<String, Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private String f12681b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f12682c;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBImageView$1, reason: invalid class name */
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
                a[c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f12681b = "";
        if (context != null && attributeSet != null) {
            try {
                this.f12682c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            } catch (Exception e2) {
                ad.b("MBImageView", e2.getMessage());
                return;
            }
        }
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(context, attributeSet));
        com.mbridge.msdk.dycreator.e.c.a(this.f12682c, this);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap<String, c> c10 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = c10.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.a[cVar.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            String attributeValue = attributeSet.getAttributeValue(i10);
                            if (!TextUtils.isEmpty(attributeValue)) {
                                if (attributeValue.equals("invisible")) {
                                    setVisibility(4);
                                } else if (attributeValue.equalsIgnoreCase("gone")) {
                                    setVisibility(8);
                                }
                            }
                        }
                    } else {
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
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
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
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
        Map<String, String> map = this.f12682c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f12682c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f12682c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f12682c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f12682c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f12682c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f12682c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f12682c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f12682c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f12682c.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.a;
        if (map != null && map.containsKey("mbridgeAttached") && this.a.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12681b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.a;
        if (map != null && map.containsKey("mbridgeDetached") && this.a.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12681b);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.a = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f12681b = campaignEx.getCampaignUnitId();
        }
    }
}
