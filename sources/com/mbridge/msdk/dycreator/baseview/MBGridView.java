package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.GridView;
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
public class MBGridView extends GridView implements InterBase {
    private Map<String, String> a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f12677b;

    /* renamed from: c, reason: collision with root package name */
    private String f12678c;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBGridView$1, reason: invalid class name */
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
                a[c.fadingEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.visibility.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MBGridView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f12678c = "";
        try {
            this.a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.a, this);
        } catch (Exception e2) {
            ad.b("MBGridView", e2.getMessage());
        }
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

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f12677b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f12677b.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12678c);
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f12677b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f12677b.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12678c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f12677b = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f12678c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public AbsListView.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) generateDefaultLayoutParams();
        HashMap<String, c> c10 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = c10.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.a[cVar.ordinal()];
                if (i11 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                        if (attributeValue.startsWith("wrap")) {
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
                        if (attributeValue2.startsWith("wrap")) {
                            layoutParams.height = -2;
                        } else {
                            layoutParams.height = b.a().b(attributeValue2);
                        }
                    } else {
                        layoutParams.height = -1;
                    }
                } else if (i11 == 3) {
                    setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i10, false));
                } else if (i11 == 4) {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }
}
