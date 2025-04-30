package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class yb {

    /* renamed from: a, reason: collision with root package name */
    protected c f12369a;
    protected boolean b;

    /* renamed from: c, reason: collision with root package name */
    protected SpannedString f12370c;

    /* renamed from: d, reason: collision with root package name */
    protected SpannedString f12371d;

    /* renamed from: e, reason: collision with root package name */
    protected String f12372e;

    /* renamed from: f, reason: collision with root package name */
    protected String f12373f;

    /* renamed from: g, reason: collision with root package name */
    protected int f12374g;

    /* renamed from: h, reason: collision with root package name */
    protected int f12375h;

    /* renamed from: i, reason: collision with root package name */
    protected int f12376i;

    /* renamed from: j, reason: collision with root package name */
    protected int f12377j;

    /* renamed from: k, reason: collision with root package name */
    protected int f12378k;
    protected int l;
    protected boolean m;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final c f12379a;
        boolean b;

        /* renamed from: c, reason: collision with root package name */
        SpannedString f12380c;

        /* renamed from: d, reason: collision with root package name */
        SpannedString f12381d;

        /* renamed from: e, reason: collision with root package name */
        String f12382e;

        /* renamed from: f, reason: collision with root package name */
        String f12383f;

        /* renamed from: g, reason: collision with root package name */
        int f12384g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f12385h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f12386i = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: j, reason: collision with root package name */
        int f12387j = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: k, reason: collision with root package name */
        int f12388k = 0;
        int l = 0;
        boolean m;

        public b(c cVar) {
            this.f12379a = cVar;
        }

        public b a(String str) {
            this.f12383f = str;
            return this;
        }

        public b b(String str) {
            this.f12382e = str;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(int i9) {
            this.f12385h = i9;
            return this;
        }

        public b b(int i9) {
            this.l = i9;
            return this;
        }

        public b a(Context context) {
            this.f12385h = R.drawable.applovin_ic_disclosure_arrow;
            this.l = r3.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public b b(boolean z8) {
            this.m = z8;
            return this;
        }

        public b c(int i9) {
            this.f12387j = i9;
            return this;
        }

        public b d(int i9) {
            this.f12386i = i9;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f12380c = spannedString;
            return this;
        }

        public b a(boolean z8) {
            this.b = z8;
            return this;
        }

        public b a(SpannedString spannedString) {
            this.f12381d = spannedString;
            return this;
        }

        public yb a() {
            return new yb(this);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f12395a;

        c(int i9) {
            this.f12395a = i9;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return android.R.layout.simple_list_item_1;
            }
            if (this == DETAIL) {
                return R.layout.applovin_debugger_list_item_detail;
            }
            return R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f12395a;
        }
    }

    private yb(b bVar) {
        this.f12374g = 0;
        this.f12375h = 0;
        this.f12376i = ViewCompat.MEASURED_STATE_MASK;
        this.f12377j = ViewCompat.MEASURED_STATE_MASK;
        this.f12378k = 0;
        this.l = 0;
        this.f12369a = bVar.f12379a;
        this.b = bVar.b;
        this.f12370c = bVar.f12380c;
        this.f12371d = bVar.f12381d;
        this.f12372e = bVar.f12382e;
        this.f12373f = bVar.f12383f;
        this.f12374g = bVar.f12384g;
        this.f12375h = bVar.f12385h;
        this.f12376i = bVar.f12386i;
        this.f12377j = bVar.f12387j;
        this.f12378k = bVar.f12388k;
        this.l = bVar.l;
        this.m = bVar.m;
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f12373f;
    }

    public String c() {
        return this.f12372e;
    }

    public int d() {
        return this.f12375h;
    }

    public int e() {
        return this.l;
    }

    public SpannedString f() {
        return this.f12371d;
    }

    public int g() {
        return this.f12377j;
    }

    public int h() {
        return this.f12374g;
    }

    public int i() {
        return this.f12378k;
    }

    public int j() {
        return this.f12369a.b();
    }

    public SpannedString k() {
        return this.f12370c;
    }

    public int l() {
        return this.f12376i;
    }

    public int m() {
        return this.f12369a.c();
    }

    public boolean o() {
        return this.b;
    }

    public boolean p() {
        return this.m;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public yb(c cVar) {
        this.f12374g = 0;
        this.f12375h = 0;
        this.f12376i = ViewCompat.MEASURED_STATE_MASK;
        this.f12377j = ViewCompat.MEASURED_STATE_MASK;
        this.f12378k = 0;
        this.l = 0;
        this.f12369a = cVar;
    }
}
