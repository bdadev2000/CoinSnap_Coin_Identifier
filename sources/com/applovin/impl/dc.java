package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* loaded from: classes3.dex */
public class dc {

    /* renamed from: a, reason: collision with root package name */
    protected c f23446a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f23447b;

    /* renamed from: c, reason: collision with root package name */
    protected SpannedString f23448c;
    protected SpannedString d;
    protected String e;

    /* renamed from: f, reason: collision with root package name */
    protected String f23449f;

    /* renamed from: g, reason: collision with root package name */
    protected int f23450g;

    /* renamed from: h, reason: collision with root package name */
    protected int f23451h;

    /* renamed from: i, reason: collision with root package name */
    protected int f23452i;

    /* renamed from: j, reason: collision with root package name */
    protected int f23453j;

    /* renamed from: k, reason: collision with root package name */
    protected int f23454k;

    /* renamed from: l, reason: collision with root package name */
    protected int f23455l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f23456m;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final c f23457a;

        /* renamed from: b, reason: collision with root package name */
        boolean f23458b;

        /* renamed from: c, reason: collision with root package name */
        SpannedString f23459c;
        SpannedString d;
        String e;

        /* renamed from: f, reason: collision with root package name */
        String f23460f;

        /* renamed from: g, reason: collision with root package name */
        int f23461g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f23462h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f23463i = -16777216;

        /* renamed from: j, reason: collision with root package name */
        int f23464j = -16777216;

        /* renamed from: k, reason: collision with root package name */
        int f23465k = 0;

        /* renamed from: l, reason: collision with root package name */
        int f23466l = 0;

        /* renamed from: m, reason: collision with root package name */
        boolean f23467m;

        public b(c cVar) {
            this.f23457a = cVar;
        }

        public b a(int i2) {
            this.f23462h = i2;
            return this;
        }

        public b b(int i2) {
            this.f23466l = i2;
            return this;
        }

        public b c(int i2) {
            this.f23464j = i2;
            return this;
        }

        public b d(int i2) {
            this.f23463i = i2;
            return this;
        }

        public b a(SpannedString spannedString) {
            this.d = spannedString;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f23459c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(String str) {
            this.f23460f = str;
            return this;
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b a(boolean z2) {
            this.f23458b = z2;
            return this;
        }

        public b b(boolean z2) {
            this.f23467m = z2;
            return this;
        }

        public b a(Context context) {
            this.f23462h = R.drawable.applovin_ic_disclosure_arrow;
            this.f23466l = t3.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public dc a() {
            return new dc(this);
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f23474a;

        c(int i2) {
            this.f23474a = i2;
        }

        public int b() {
            return this == SECTION ? R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? R.layout.mediation_debugger_list_section_centered : this == SIMPLE ? android.R.layout.simple_list_item_1 : this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f23474a;
        }
    }

    private dc(b bVar) {
        this.f23450g = 0;
        this.f23451h = 0;
        this.f23452i = -16777216;
        this.f23453j = -16777216;
        this.f23454k = 0;
        this.f23455l = 0;
        this.f23446a = bVar.f23457a;
        this.f23447b = bVar.f23458b;
        this.f23448c = bVar.f23459c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f23449f = bVar.f23460f;
        this.f23450g = bVar.f23461g;
        this.f23451h = bVar.f23462h;
        this.f23452i = bVar.f23463i;
        this.f23453j = bVar.f23464j;
        this.f23454k = bVar.f23465k;
        this.f23455l = bVar.f23466l;
        this.f23456m = bVar.f23467m;
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f23449f;
    }

    public String c() {
        return this.e;
    }

    public int d() {
        return this.f23451h;
    }

    public int e() {
        return this.f23455l;
    }

    public SpannedString f() {
        return this.d;
    }

    public int g() {
        return this.f23453j;
    }

    public int h() {
        return this.f23450g;
    }

    public int i() {
        return this.f23454k;
    }

    public int j() {
        return this.f23446a.b();
    }

    public SpannedString k() {
        return this.f23448c;
    }

    public int l() {
        return this.f23452i;
    }

    public int m() {
        return this.f23446a.c();
    }

    public boolean o() {
        return this.f23447b;
    }

    public boolean p() {
        return this.f23456m;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public dc(c cVar) {
        this.f23450g = 0;
        this.f23451h = 0;
        this.f23452i = -16777216;
        this.f23453j = -16777216;
        this.f23454k = 0;
        this.f23455l = 0;
        this.f23446a = cVar;
    }
}
