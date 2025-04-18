package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBExtMBridgeImageView extends MBridgeImageView implements InterBase {
    private Map<String, String> a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f12819b;

    /* renamed from: c, reason: collision with root package name */
    private String f12820c;

    /* renamed from: d, reason: collision with root package name */
    private int f12821d;

    /* renamed from: e, reason: collision with root package name */
    private int f12822e;

    /* renamed from: f, reason: collision with root package name */
    private int f12823f;

    /* renamed from: g, reason: collision with root package name */
    private int f12824g;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBridgeImageView$1, reason: invalid class name */
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
                a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBExtMBridgeImageView(Context context) {
        super(context);
        this.f12820c = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> c10 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = c10.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.a[cVar.ordinal()];
                if (i11 != 6) {
                    if (i11 != 13) {
                        if (i11 == 14) {
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
                } else {
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

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f12819b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f12819b.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12820c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f12819b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f12819b.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12820c);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, c> c10 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = c10.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i10), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i10)));
                                break;
                            } else {
                                if (strArr != null && strArr.length == 3) {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                }
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i10)));
                                break;
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                            break;
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue3)) {
                            break;
                        } else {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.e.b.a.get(attributeValue3.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        }
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            String str = com.mbridge.msdk.dycreator.e.b.a.get(attributeValue4.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setTag(str);
                                break;
                            }
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue5)) {
                            break;
                        } else if (attributeValue5.equals("invisible")) {
                            setVisibility(4);
                            break;
                        } else if (attributeValue5.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue6)) {
                            break;
                        } else if (attributeValue6.equals("fitXY")) {
                            setScaleType(ImageView.ScaleType.FIT_XY);
                            break;
                        } else if (attributeValue6.equals("centerInside")) {
                            setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            break;
                        } else if (attributeValue6.equals("centerCrop")) {
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        int b3 = b.a().b(attributeSet.getAttributeValue(i10));
                        this.f12824g = b3;
                        this.f12823f = b3;
                        this.f12822e = b3;
                        this.f12821d = b3;
                        setPadding(b3, b3, b3, b3);
                        break;
                    case 9:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i10));
                        this.f12822e = b10;
                        setPadding(this.f12821d, b10, this.f12823f, this.f12824g);
                        break;
                    case 10:
                        int b11 = b.a().b(attributeSet.getAttributeValue(i10));
                        this.f12824g = b11;
                        setPadding(this.f12821d, this.f12822e, this.f12823f, b11);
                        break;
                    case 11:
                        int b12 = b.a().b(attributeSet.getAttributeValue(i10));
                        this.f12821d = b12;
                        setPadding(b12, this.f12822e, this.f12823f, this.f12824g);
                        break;
                    case 12:
                        int b13 = b.a().b(attributeSet.getAttributeValue(i10));
                        this.f12823f = b13;
                        setPadding(this.f12821d, this.f12822e, b13, this.f12824g);
                        break;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f12819b = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f12820c = campaignEx.getCampaignUnitId();
        }
    }

    public MBExtMBridgeImageView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f12820c = "";
        try {
            this.a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.a, this);
        } catch (Exception e2) {
            ad.b("MBExtMBridgeImageView", e2.getMessage());
        }
    }

    public MBExtMBridgeImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12820c = "";
    }
}
