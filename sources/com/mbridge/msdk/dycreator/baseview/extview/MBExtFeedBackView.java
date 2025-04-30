package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.L;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MBExtFeedBackView extends FeedBackButton implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f15143a;
    private Map<String, Boolean> b;

    /* renamed from: c, reason: collision with root package name */
    private String f15144c;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtFeedBackView$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15145a;

        static {
            int[] iArr = new int[c.values().length];
            f15145a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15145a[c.text.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15145a[c.ellipsize.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15145a[c.singleLine.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15145a[c.lines.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15145a[c.drawableLeft.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15145a[c.drawablePadding.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15145a[c.fadingEdge.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15145a[c.scrollHorizontally.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15145a[c.textColor.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15145a[c.textSize.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15145a[c.visibility.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15145a[c.background.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15145a[c.textStyle.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15145a[c.style.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15145a[c.contentDescription.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15145a[c.tag.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15145a[c.gravity.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f15145a[c.padding.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f15145a[c.paddingTop.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f15145a[c.paddingBottom.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f15145a[c.paddingLeft.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f15145a[c.paddingRight.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f15145a[c.paddingStart.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f15145a[c.paddingEnd.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f15145a[c.layout_width.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f15145a[c.layout_height.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public MBExtFeedBackView(Context context) {
        super(context);
        this.f15144c = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap b = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            c cVar = (c) b.get(attributeSet.getAttributeName(i9));
            if (cVar != null) {
                int i10 = AnonymousClass1.f15145a[cVar.ordinal()];
                if (i10 != 26) {
                    if (i10 == 27) {
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
        Map<String, String> map = this.f15143a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f15143a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f15143a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f15143a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f15143a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f15143a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f15143a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f15143a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f15143a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f15143a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.b;
        if (map != null && map.containsKey("mbridgeAttached") && this.b.get("mbridgeAttached").booleanValue()) {
            L.g("mbridgeAttached").a(this.f15144c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.b;
        if (map != null && map.containsKey("mbridgeDetached") && this.b.get("mbridgeDetached").booleanValue()) {
            L.g("mbridgeDetached").a(this.f15144c);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String str;
        HashMap<String, c> c9 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            c cVar = c9.get(attributeSet.getAttributeName(i13));
            if (cVar != null) {
                Log.d("setupview", cVar.toString());
                switch (AnonymousClass1.f15145a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i13);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i13);
                        if (TextUtils.isEmpty(attributeValue2)) {
                            break;
                        } else if (attributeValue2.startsWith("@string/")) {
                            setText(b.a().e(attributeSet.getAttributeValue(i13)));
                            break;
                        } else {
                            setText(attributeValue2);
                            break;
                        }
                    case 3:
                        String attributeValue3 = attributeSet.getAttributeValue(i13);
                        if (TextUtils.isEmpty(attributeValue3)) {
                            break;
                        } else {
                            if (attributeValue3.equals(TtmlNode.END)) {
                                setEllipsize(TextUtils.TruncateAt.END);
                            }
                            if (attributeValue3.equals("start")) {
                                setEllipsize(TextUtils.TruncateAt.START);
                            }
                            if (attributeValue3.equals("middle")) {
                                setEllipsize(TextUtils.TruncateAt.MIDDLE);
                            }
                            if (attributeValue3.equals("marquee")) {
                                setEllipsize(TextUtils.TruncateAt.MARQUEE);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 4:
                        setSingleLine(attributeSet.getAttributeBooleanValue(i13, false));
                        break;
                    case 5:
                        setLines(attributeSet.getAttributeIntValue(i13, 1));
                        break;
                    case 6:
                        String attributeValue4 = attributeSet.getAttributeValue(i13);
                        if (attributeValue4.startsWith("@drawable/")) {
                            str = attributeValue4.substring(10);
                        } else {
                            str = "";
                        }
                        if (TextUtils.isEmpty(str)) {
                            break;
                        } else {
                            Drawable drawable = getResources().getDrawable(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "drawable"));
                            drawable.setBounds(0, 0, ai.a(getContext(), 14.0f), ai.a(getContext(), 14.0f));
                            setCompoundDrawables(drawable, null, null, null);
                            break;
                        }
                    case 7:
                        setCompoundDrawablePadding(b.a().b(attributeSet.getAttributeValue(i13)));
                        break;
                    case 8:
                        setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i13, false));
                        break;
                    case 9:
                        setHorizontallyScrolling(attributeSet.getAttributeBooleanValue(i13, false));
                        break;
                    case 10:
                        setTextColor(b.a().a(attributeSet.getAttributeValue(i13)));
                        break;
                    case 11:
                        if (TextUtils.isEmpty(attributeSet.getAttributeValue(i13))) {
                            break;
                        } else {
                            setTextSize(b.a().b(r8));
                            break;
                        }
                    case 12:
                        String attributeValue5 = attributeSet.getAttributeValue(i13);
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
                    case 13:
                        String attributeValue6 = attributeSet.getAttributeValue(i13);
                        if (attributeValue6.startsWith("#")) {
                            setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i13)));
                            break;
                        } else {
                            if (attributeValue6.startsWith("@drawable/")) {
                                attributeValue6 = attributeValue6.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue6, "drawable", getContext().getPackageName()));
                            break;
                        }
                    case 14:
                        if (TtmlNode.BOLD.equalsIgnoreCase(attributeSet.getAttributeValue(i13))) {
                            setTypeface(Typeface.defaultFromStyle(1));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        String attributeValue7 = attributeSet.getAttributeValue(i13);
                        String substring = attributeValue7.substring(attributeValue7.indexOf("/") + 1);
                        setTextAppearance(getContext(), b.a().d("R.style." + substring));
                        break;
                    case 16:
                        String attributeValue8 = attributeSet.getAttributeValue(i13);
                        if (TextUtils.isEmpty(attributeValue8)) {
                            break;
                        } else {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.e.b.f15274a.get(attributeValue8.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        }
                    case 17:
                        String attributeValue9 = attributeSet.getAttributeValue(i13);
                        if (TextUtils.isEmpty(attributeValue9)) {
                            break;
                        } else {
                            String str2 = com.mbridge.msdk.dycreator.e.b.f15274a.get(attributeValue9.substring(8));
                            if (TextUtils.isEmpty(str2)) {
                                break;
                            } else {
                                setTag(str2);
                                break;
                            }
                        }
                    case 18:
                        setGravity(b.a().c(attributeSet.getAttributeValue(i13)));
                        break;
                    case 19:
                        int b = b.a().b(attributeSet.getAttributeValue(i13));
                        setPadding(b, b, b, b);
                        break;
                    case 20:
                        i12 = b.a().b(attributeSet.getAttributeValue(i13));
                        setPadding(i9, i12, i10, i11);
                        break;
                    case 21:
                        i11 = b.a().b(attributeSet.getAttributeValue(i13));
                        setPadding(i9, i12, i10, i11);
                        break;
                    case 22:
                        i9 = b.a().b(attributeSet.getAttributeValue(i13));
                        setPadding(i9, i12, i10, i11);
                        break;
                    case 23:
                        i10 = b.a().b(attributeSet.getAttributeValue(i13));
                        setPadding(i9, i12, i10, i11);
                        break;
                    case 24:
                        setPadding(b.a().b(attributeSet.getAttributeValue(i13)), i12, i10, i11);
                        break;
                    case 25:
                        setPadding(i9, i12, b.a().b(attributeSet.getAttributeValue(i13)), i11);
                        break;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.b = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f15144c = campaignEx.getCampaignUnitId();
        }
    }

    public MBExtFeedBackView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f15144c = "";
        try {
            this.f15143a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f15143a, this);
        } catch (Exception e4) {
            ad.b("MBExtFeedBackView", e4.getMessage());
        }
    }

    public MBExtFeedBackView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15144c = "";
    }
}
