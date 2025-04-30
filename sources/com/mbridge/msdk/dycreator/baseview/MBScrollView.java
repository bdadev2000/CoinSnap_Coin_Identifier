package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.applovin.impl.L;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MBScrollView extends ScrollView implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f15022a;
    private Map<String, Boolean> b;

    /* renamed from: c, reason: collision with root package name */
    private String f15023c;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBScrollView$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15024a;

        static {
            int[] iArr = new int[c.values().length];
            f15024a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15024a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15024a[c.contentDescription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15024a[c.fadingEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15024a[c.visibility.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15024a[c.layout_marginBottom.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MBScrollView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f15023c = "";
        this.f15022a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        com.mbridge.msdk.dycreator.e.c.a(this.f15022a, this);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f15022a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f15022a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f15022a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f15022a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f15022a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f15022a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f15022a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f15022a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f15022a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f15022a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.b;
        if (map != null && map.containsKey("mbridgeAttached") && this.b.get("mbridgeAttached").booleanValue()) {
            L.g("mbridgeAttached").a(this.f15023c);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.b;
        if (map != null && map.containsKey("mbridgeDetached") && this.b.get("mbridgeDetached").booleanValue()) {
            L.g("mbridgeDetached").a(this.f15023c);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, c> c9 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = c9.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                int i10 = AnonymousClass1.f15024a[cVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            setContentDescription(attributeSet.getAttributeValue(i9));
                        }
                    } else {
                        String attributeValue = attributeSet.getAttributeValue(i9);
                        if (attributeValue.startsWith("#")) {
                            setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i9)));
                        } else {
                            if (attributeValue.startsWith("@drawable/")) {
                                attributeValue = attributeValue.substring(10);
                            }
                            setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + "/" + attributeValue + ".png")));
                        }
                    }
                } else {
                    String attributeValue2 = attributeSet.getAttributeValue(i9);
                    if (attributeValue2.startsWith("@+id/")) {
                        setId(attributeValue2.substring(5).hashCode());
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.b = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f15023c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap<String, c> c9 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = c9.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                Log.e("MBscrollviewparam", cVar.toString());
            }
            if (cVar != null) {
                int i10 = AnonymousClass1.f15024a[cVar.ordinal()];
                if (i10 == 4) {
                    setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i9, false));
                } else if (i10 == 5) {
                    String attributeValue = attributeSet.getAttributeValue(i9);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i10 == 6) {
                    generateDefaultLayoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i9));
                }
            }
        }
        return generateDefaultLayoutParams;
    }
}
