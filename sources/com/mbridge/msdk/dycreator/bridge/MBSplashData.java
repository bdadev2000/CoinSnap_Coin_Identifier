package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class MBSplashData implements a {
    private DyOption a;

    /* renamed from: b, reason: collision with root package name */
    private String f12875b;

    /* renamed from: c, reason: collision with root package name */
    private String f12876c;

    /* renamed from: d, reason: collision with root package name */
    private String f12877d;

    /* renamed from: e, reason: collision with root package name */
    private String f12878e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f12879f;

    /* renamed from: g, reason: collision with root package name */
    private int f12880g;

    /* renamed from: h, reason: collision with root package name */
    private int f12881h;

    /* renamed from: i, reason: collision with root package name */
    private float f12882i;

    /* renamed from: j, reason: collision with root package name */
    private float f12883j;

    /* renamed from: k, reason: collision with root package name */
    private int f12884k = 0;

    public MBSplashData(DyOption dyOption) {
        this.a = dyOption;
        this.f12879f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f12876c;
    }

    public String getAppInfo() {
        return this.f12875b;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public CampaignEx getBindData() {
        return this.f12879f;
    }

    public int getClickType() {
        return this.f12884k;
    }

    public String getCountDownText() {
        return this.f12877d;
    }

    public DyOption getDyOption() {
        return this.a;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public DyOption getEffectData() {
        return this.a;
    }

    public int getLogoImage() {
        return this.f12881h;
    }

    public String getLogoText() {
        return this.f12878e;
    }

    public int getNoticeImage() {
        return this.f12880g;
    }

    public float getxInScreen() {
        return this.f12882i;
    }

    public float getyInScreen() {
        return this.f12883j;
    }

    public void setAdClickText(String str) {
        this.f12876c = str;
    }

    public void setAppInfo(String str) {
        this.f12875b = str;
    }

    public void setClickType(int i10) {
        this.f12884k = i10;
    }

    public void setCountDownText(String str) {
        this.f12877d = str;
    }

    public void setLogoImage(int i10) {
        this.f12881h = i10;
    }

    public void setLogoText(String str) {
        this.f12878e = str;
    }

    public void setNoticeImage(int i10) {
        this.f12880g = i10;
    }

    public void setxInScreen(float f10) {
        this.f12882i = f10;
    }

    public void setyInScreen(float f10) {
        this.f12883j = f10;
    }
}
