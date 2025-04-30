package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.applovin.impl.L;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.dycreator.e.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes3.dex */
public class MBButton extends Button implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f14982a;
    private Map<String, Boolean> b;

    /* renamed from: c, reason: collision with root package name */
    private String f14983c;

    public MBButton(Context context) {
        super(context);
        this.f14983c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f14982a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f14982a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f14982a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f14982a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f14982a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f14982a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f14982a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f14982a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f14982a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f14982a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.b;
        if (map != null && map.containsKey("mbridgeAttached") && this.b.get("mbridgeAttached").booleanValue()) {
            L.g("mbridgeAttached").a(this.f14983c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.b;
        if (map != null && map.containsKey("mbridgeDetached") && this.b.get("mbridgeDetached").booleanValue()) {
            L.g("mbridgeDetached").a(this.f14983c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.b = c.a(str);
        if (campaignEx != null) {
            this.f14983c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f14983c = "";
        this.f14982a = c.a(context, attributeSet);
        a.a(this, attributeSet);
        c.a(this.f14982a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f14983c = "";
    }
}
