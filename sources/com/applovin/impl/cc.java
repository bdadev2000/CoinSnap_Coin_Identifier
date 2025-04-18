package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class cc {

    /* renamed from: a, reason: collision with root package name */
    public TextView f23264a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f23265b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f23266c;
    public ImageView d;
    private dc e;

    /* renamed from: f, reason: collision with root package name */
    private int f23267f;

    public int a() {
        return this.f23267f;
    }

    public dc b() {
        return this.e;
    }

    public void a(int i2) {
        this.f23267f = i2;
    }

    public void a(dc dcVar) {
        this.e = dcVar;
        this.f23264a.setText(dcVar.k());
        this.f23264a.setTextColor(dcVar.l());
        if (this.f23265b != null) {
            if (!TextUtils.isEmpty(dcVar.f())) {
                this.f23265b.setTypeface(null, 0);
                this.f23265b.setVisibility(0);
                this.f23265b.setText(dcVar.f());
                this.f23265b.setTextColor(dcVar.g());
                if (dcVar.p()) {
                    this.f23265b.setTypeface(null, 1);
                }
            } else {
                this.f23265b.setVisibility(8);
            }
        }
        if (this.f23266c != null) {
            if (dcVar.h() > 0) {
                this.f23266c.setImageResource(dcVar.h());
                this.f23266c.setColorFilter(dcVar.i());
                this.f23266c.setVisibility(0);
            } else {
                this.f23266c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (dcVar.d() > 0) {
                this.d.setImageResource(dcVar.d());
                this.d.setColorFilter(dcVar.e());
                this.d.setVisibility(0);
                return;
            }
            this.d.setVisibility(8);
        }
    }
}
