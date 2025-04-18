package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class EH {
    private double AlY;
    private int Sg;
    private String YFl;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10681vc;
    private boolean wN;

    public double AlY() {
        return this.AlY;
    }

    public String DSW() {
        return this.f10681vc;
    }

    public int Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public int tN() {
        return this.tN;
    }

    public boolean vc() {
        return this.wN;
    }

    public boolean wN() {
        return !TextUtils.isEmpty(this.YFl) && this.Sg > 0 && this.tN > 0;
    }

    public void Sg(int i10) {
        this.tN = i10;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public void Sg(String str) {
        this.f10681vc = str;
    }

    public void YFl(int i10) {
        this.Sg = i10;
    }

    public void YFl(boolean z10) {
        this.wN = z10;
    }
}
