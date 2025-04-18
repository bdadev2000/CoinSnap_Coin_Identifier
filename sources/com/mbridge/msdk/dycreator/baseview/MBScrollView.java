package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBScrollView extends ScrollView implements InterBase {
    private Map<String, String> a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f12699b;

    /* renamed from: c, reason: collision with root package name */
    private String f12700c;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBScrollView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.contentDescription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.fadingEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.visibility.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.layout_marginBottom.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MBScrollView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f12700c = "";
        this.a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        com.mbridge.msdk.dycreator.e.c.a(this.a, this);
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

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f12699b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f12699b.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12700c);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f12699b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f12699b.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12700c);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, c> c10 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = c10.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.a[cVar.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            setContentDescription(attributeSet.getAttributeValue(i10));
                        }
                    } else {
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("#")) {
                            setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i10)));
                        } else {
                            if (attributeValue.startsWith("@drawable/")) {
                                attributeValue = attributeValue.substring(10);
                            }
                            setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + "/" + attributeValue + ".png")));
                        }
                    }
                } else {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith("@+id/")) {
                        setId(attributeValue2.substring(5).hashCode());
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f12699b = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f12700c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap<String, c> c10 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = c10.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                Log.e("MBscrollviewparam", cVar.toString());
            }
            if (cVar != null) {
                int i11 = AnonymousClass1.a[cVar.ordinal()];
                if (i11 == 4) {
                    setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i10, false));
                } else if (i11 == 5) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i11 == 6) {
                    generateDefaultLayoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i10));
                }
            }
        }
        return generateDefaultLayoutParams;
    }
}
