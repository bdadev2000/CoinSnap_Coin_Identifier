package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class xb {
    public TextView a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f8964b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f8965c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f8966d;

    /* renamed from: e, reason: collision with root package name */
    private yb f8967e;

    /* renamed from: f, reason: collision with root package name */
    private int f8968f;

    public int a() {
        return this.f8968f;
    }

    public yb b() {
        return this.f8967e;
    }

    public void a(int i10) {
        this.f8968f = i10;
    }

    public void a(yb ybVar) {
        this.f8967e = ybVar;
        this.a.setText(ybVar.k());
        this.a.setTextColor(ybVar.l());
        if (this.f8964b != null) {
            if (!TextUtils.isEmpty(ybVar.f())) {
                this.f8964b.setTypeface(null, 0);
                this.f8964b.setVisibility(0);
                this.f8964b.setText(ybVar.f());
                this.f8964b.setTextColor(ybVar.g());
                if (ybVar.p()) {
                    this.f8964b.setTypeface(null, 1);
                }
            } else {
                this.f8964b.setVisibility(8);
            }
        }
        if (this.f8965c != null) {
            if (ybVar.h() > 0) {
                this.f8965c.setImageResource(ybVar.h());
                this.f8965c.setColorFilter(ybVar.i());
                this.f8965c.setVisibility(0);
            } else {
                this.f8965c.setVisibility(8);
            }
        }
        if (this.f8966d != null) {
            if (ybVar.d() > 0) {
                this.f8966d.setImageResource(ybVar.d());
                this.f8966d.setColorFilter(ybVar.e());
                this.f8966d.setVisibility(0);
                return;
            }
            this.f8966d.setVisibility(8);
        }
    }
}
