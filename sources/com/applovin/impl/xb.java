package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class xb {

    /* renamed from: a, reason: collision with root package name */
    public TextView f12165a;
    public TextView b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f12166c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f12167d;

    /* renamed from: e, reason: collision with root package name */
    private yb f12168e;

    /* renamed from: f, reason: collision with root package name */
    private int f12169f;

    public int a() {
        return this.f12169f;
    }

    public yb b() {
        return this.f12168e;
    }

    public void a(int i9) {
        this.f12169f = i9;
    }

    public void a(yb ybVar) {
        this.f12168e = ybVar;
        this.f12165a.setText(ybVar.k());
        this.f12165a.setTextColor(ybVar.l());
        if (this.b != null) {
            if (!TextUtils.isEmpty(ybVar.f())) {
                this.b.setTypeface(null, 0);
                this.b.setVisibility(0);
                this.b.setText(ybVar.f());
                this.b.setTextColor(ybVar.g());
                if (ybVar.p()) {
                    this.b.setTypeface(null, 1);
                }
            } else {
                this.b.setVisibility(8);
            }
        }
        if (this.f12166c != null) {
            if (ybVar.h() > 0) {
                this.f12166c.setImageResource(ybVar.h());
                this.f12166c.setColorFilter(ybVar.i());
                this.f12166c.setVisibility(0);
            } else {
                this.f12166c.setVisibility(8);
            }
        }
        if (this.f12167d != null) {
            if (ybVar.d() > 0) {
                this.f12167d.setImageResource(ybVar.d());
                this.f12167d.setColorFilter(ybVar.e());
                this.f12167d.setVisibility(0);
                return;
            }
            this.f12167d.setVisibility(8);
        }
    }
}
