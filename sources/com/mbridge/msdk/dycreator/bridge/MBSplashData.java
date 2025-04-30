package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public class MBSplashData implements a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f15224a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f15225c;

    /* renamed from: d, reason: collision with root package name */
    private String f15226d;

    /* renamed from: e, reason: collision with root package name */
    private String f15227e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f15228f;

    /* renamed from: g, reason: collision with root package name */
    private int f15229g;

    /* renamed from: h, reason: collision with root package name */
    private int f15230h;

    /* renamed from: i, reason: collision with root package name */
    private float f15231i;

    /* renamed from: j, reason: collision with root package name */
    private float f15232j;

    /* renamed from: k, reason: collision with root package name */
    private int f15233k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f15224a = dyOption;
        this.f15228f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f15225c;
    }

    public String getAppInfo() {
        return this.b;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public CampaignEx getBindData() {
        return this.f15228f;
    }

    public int getClickType() {
        return this.f15233k;
    }

    public String getCountDownText() {
        return this.f15226d;
    }

    public DyOption getDyOption() {
        return this.f15224a;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public DyOption getEffectData() {
        return this.f15224a;
    }

    public int getLogoImage() {
        return this.f15230h;
    }

    public String getLogoText() {
        return this.f15227e;
    }

    public int getNoticeImage() {
        return this.f15229g;
    }

    public float getxInScreen() {
        return this.f15231i;
    }

    public float getyInScreen() {
        return this.f15232j;
    }

    public void setAdClickText(String str) {
        this.f15225c = str;
    }

    public void setAppInfo(String str) {
        this.b = str;
    }

    public void setClickType(int i9) {
        this.f15233k = i9;
    }

    public void setCountDownText(String str) {
        this.f15226d = str;
    }

    public void setLogoImage(int i9) {
        this.f15230h = i9;
    }

    public void setLogoText(String str) {
        this.f15227e = str;
    }

    public void setNoticeImage(int i9) {
        this.f15229g = i9;
    }

    public void setxInScreen(float f9) {
        this.f15231i = f9;
    }

    public void setyInScreen(float f9) {
        this.f15232j = f9;
    }
}
