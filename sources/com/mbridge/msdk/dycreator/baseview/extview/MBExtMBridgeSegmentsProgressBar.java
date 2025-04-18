package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBExtMBridgeSegmentsProgressBar extends MBridgeSegmentsProgressBar implements InterBase {
    private Map<String, String> a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f12825b;

    /* renamed from: c, reason: collision with root package name */
    private String f12826c;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBridgeSegmentsProgressBar$1, reason: invalid class name */
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
                a[c.orientation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.visibility.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.padding.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.layout_width.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.layout_height.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.layout_centerHorizontal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.layout_centerVertical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.layout_weight.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.gravity.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.layout_margin.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[c.layout_marginLeft.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[c.layout_marginRight.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[c.layout_marginTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[c.layout_marginBottom.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[c.layout_gravity.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MBExtMBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f12826c = "";
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
        Map<String, Boolean> map = this.f12825b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f12825b.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12826c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f12825b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f12825b.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12826c);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, c> c10 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = c10.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.a[cVar.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    int b3 = b.a().b(attributeSet.getAttributeValue(i10));
                                    setPadding(b3, b3, b3, b3);
                                }
                            } else {
                                String attributeValue = attributeSet.getAttributeValue(i10);
                                if (!TextUtils.isEmpty(attributeValue)) {
                                    if (attributeValue.equals("invisible")) {
                                        setVisibility(4);
                                    } else if (attributeValue.equalsIgnoreCase("gone")) {
                                        setVisibility(8);
                                    }
                                }
                            }
                        } else if ("horizontal".equalsIgnoreCase(attributeSet.getAttributeValue(i10))) {
                            setOrientation(0);
                        } else {
                            setOrientation(1);
                        }
                    } else {
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i10)));
                            } else {
                                if (strArr != null && strArr.length == 3) {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                    } catch (Exception unused2) {
                                    }
                                }
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i10)));
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + "/" + attributeValue2 + ".png")));
                        }
                    }
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (attributeValue3.startsWith("@+id/")) {
                        setId(attributeValue3.substring(5).hashCode());
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap b3 = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) b3.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.a[cVar.ordinal()]) {
                    case 6:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("wrap")) {
                                generateDefaultLayoutParams.width = -2;
                                break;
                            } else {
                                generateDefaultLayoutParams.width = b.a().b(attributeValue);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.width = -1;
                            break;
                        }
                    case 7:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                generateDefaultLayoutParams.height = -2;
                                break;
                            } else {
                                generateDefaultLayoutParams.height = b.a().b(attributeValue2);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.height = -1;
                            break;
                        }
                        break;
                    case 8:
                        generateDefaultLayoutParams.gravity = 1;
                        break;
                    case 9:
                        generateDefaultLayoutParams.gravity = 16;
                        break;
                    case 10:
                        generateDefaultLayoutParams.weight = attributeSet.getAttributeFloatValue(i10, 0.0f);
                        break;
                    case 11:
                        setGravity(b.a().c(attributeSet.getAttributeValue(i10)));
                        break;
                    case 12:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i10));
                        generateDefaultLayoutParams.bottomMargin = b10;
                        generateDefaultLayoutParams.leftMargin = b10;
                        generateDefaultLayoutParams.rightMargin = b10;
                        generateDefaultLayoutParams.topMargin = b10;
                        break;
                    case 13:
                        generateDefaultLayoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 14:
                        generateDefaultLayoutParams.rightMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 15:
                        generateDefaultLayoutParams.topMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 16:
                        generateDefaultLayoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i10));
                        break;
                    case 17:
                        generateDefaultLayoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i10));
                        break;
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    public MBExtMBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context);
        this.f12826c = "";
        try {
            this.a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.a, this);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public MBExtMBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12826c = "";
    }
}
