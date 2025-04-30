package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.applovin.impl.L;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MBExtMBRotationView extends MBRotationView implements InterBase {
    private Map<String, String> b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Boolean> f15149c;

    /* renamed from: d, reason: collision with root package name */
    private String f15150d;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBRotationView$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15151a;

        static {
            int[] iArr = new int[c.values().length];
            f15151a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15151a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15151a[c.contentDescription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15151a[c.visibility.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15151a[c.layout_width.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15151a[c.layout_height.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15151a[c.layout_gravity.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15151a[c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15151a[c.layout_margin.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public MBExtMBRotationView(Context context) {
        super(context);
        this.f15150d = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.b;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.b.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.b;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.b.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.b;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.b.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.b;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.b.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.b;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.b.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f15149c;
        if (map != null && map.containsKey("mbridgeAttached") && this.f15149c.get("mbridgeAttached").booleanValue()) {
            L.g("mbridgeAttached").a(this.f15150d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f15149c;
        if (map != null && map.containsKey("mbridgeDetached") && this.f15149c.get("mbridgeDetached").booleanValue()) {
            L.g("mbridgeDetached").a(this.f15150d);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, c> c9 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = c9.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                int i10 = AnonymousClass1.f15151a[cVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
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
                            setContentDescription(attributeSet.getAttributeValue(i9));
                        }
                    } else {
                        String attributeValue2 = attributeSet.getAttributeValue(i9);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i9)));
                            } else {
                                if (strArr != null && strArr.length == 3) {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                    } catch (Exception unused2) {
                                    }
                                }
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i9)));
                            }
                        } else if (attributeValue2.startsWith("@color/")) {
                            setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i9)));
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + "/" + attributeValue2 + ".png")));
                        }
                    }
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i9);
                    if (attributeValue3.startsWith("@+id/")) {
                        setId(attributeValue3.substring(5).hashCode());
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f15149c = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f15150d = campaignEx.getCampaignUnitId();
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
                switch (AnonymousClass1.f15151a[cVar.ordinal()]) {
                    case 5:
                        String attributeValue = attributeSet.getAttributeValue(i9);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("w")) {
                                layoutParams.width = -2;
                                break;
                            } else {
                                layoutParams.width = b.a().b(attributeValue);
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            break;
                        }
                    case 6:
                        String attributeValue2 = attributeSet.getAttributeValue(i9);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("w")) {
                                layoutParams.width = -2;
                                break;
                            } else {
                                layoutParams.height = b.a().b(attributeValue2);
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            break;
                        }
                        break;
                    case 7:
                        layoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i9));
                        break;
                    case 8:
                        layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i9));
                        break;
                    case 9:
                        int b8 = b.a().b(attributeSet.getAttributeValue(i9));
                        layoutParams.setMargins(b8, b8, b8, b8);
                        break;
                }
            }
        }
        return layoutParams;
    }

    public MBExtMBRotationView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f15150d = "";
        try {
            this.b = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.b, this);
        } catch (Exception e4) {
            ad.b("MBExtMBRotationView", e4.getMessage());
        }
    }

    public MBExtMBRotationView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15150d = "";
    }
}
