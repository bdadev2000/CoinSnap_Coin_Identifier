package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.dycreator.e.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBButton extends Button implements InterBase {
    private Map<String, String> a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f12669b;

    /* renamed from: c, reason: collision with root package name */
    private String f12670c;

    public MBButton(Context context) {
        super(context);
        this.f12670c = "";
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

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f12669b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f12669b.get("mbridgeAttached").booleanValue()) {
            e.e("mbridgeAttached").a(this.f12670c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f12669b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f12669b.get("mbridgeDetached").booleanValue()) {
            e.e("mbridgeDetached").a(this.f12670c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f12669b = c.a(str);
        if (campaignEx != null) {
            this.f12670c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f12670c = "";
        this.a = c.a(context, attributeSet);
        a.a(this, attributeSet);
        c.a(this.a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12670c = "";
    }
}
