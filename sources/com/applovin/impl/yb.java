package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class yb {
    protected c a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f9167b;

    /* renamed from: c, reason: collision with root package name */
    protected SpannedString f9168c;

    /* renamed from: d, reason: collision with root package name */
    protected SpannedString f9169d;

    /* renamed from: e, reason: collision with root package name */
    protected String f9170e;

    /* renamed from: f, reason: collision with root package name */
    protected String f9171f;

    /* renamed from: g, reason: collision with root package name */
    protected int f9172g;

    /* renamed from: h, reason: collision with root package name */
    protected int f9173h;

    /* renamed from: i, reason: collision with root package name */
    protected int f9174i;

    /* renamed from: j, reason: collision with root package name */
    protected int f9175j;

    /* renamed from: k, reason: collision with root package name */
    protected int f9176k;

    /* renamed from: l, reason: collision with root package name */
    protected int f9177l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f9178m;

    /* loaded from: classes.dex */
    public static class b {
        final c a;

        /* renamed from: b, reason: collision with root package name */
        boolean f9179b;

        /* renamed from: c, reason: collision with root package name */
        SpannedString f9180c;

        /* renamed from: d, reason: collision with root package name */
        SpannedString f9181d;

        /* renamed from: e, reason: collision with root package name */
        String f9182e;

        /* renamed from: f, reason: collision with root package name */
        String f9183f;

        /* renamed from: g, reason: collision with root package name */
        int f9184g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f9185h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f9186i = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: j, reason: collision with root package name */
        int f9187j = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: k, reason: collision with root package name */
        int f9188k = 0;

        /* renamed from: l, reason: collision with root package name */
        int f9189l = 0;

        /* renamed from: m, reason: collision with root package name */
        boolean f9190m;

        public b(c cVar) {
            this.a = cVar;
        }

        public b a(String str) {
            this.f9183f = str;
            return this;
        }

        public b b(String str) {
            this.f9182e = str;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(int i10) {
            this.f9185h = i10;
            return this;
        }

        public b b(int i10) {
            this.f9189l = i10;
            return this;
        }

        public b a(Context context) {
            this.f9185h = R.drawable.applovin_ic_disclosure_arrow;
            this.f9189l = r3.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public b b(boolean z10) {
            this.f9190m = z10;
            return this;
        }

        public b c(int i10) {
            this.f9187j = i10;
            return this;
        }

        public b d(int i10) {
            this.f9186i = i10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f9180c = spannedString;
            return this;
        }

        public b a(boolean z10) {
            this.f9179b = z10;
            return this;
        }

        public b a(SpannedString spannedString) {
            this.f9181d = spannedString;
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

        private final int a;

        c(int i10) {
            this.a = i10;
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
            return this.a;
        }
    }

    private yb(b bVar) {
        this.f9172g = 0;
        this.f9173h = 0;
        this.f9174i = ViewCompat.MEASURED_STATE_MASK;
        this.f9175j = ViewCompat.MEASURED_STATE_MASK;
        this.f9176k = 0;
        this.f9177l = 0;
        this.a = bVar.a;
        this.f9167b = bVar.f9179b;
        this.f9168c = bVar.f9180c;
        this.f9169d = bVar.f9181d;
        this.f9170e = bVar.f9182e;
        this.f9171f = bVar.f9183f;
        this.f9172g = bVar.f9184g;
        this.f9173h = bVar.f9185h;
        this.f9174i = bVar.f9186i;
        this.f9175j = bVar.f9187j;
        this.f9176k = bVar.f9188k;
        this.f9177l = bVar.f9189l;
        this.f9178m = bVar.f9190m;
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f9171f;
    }

    public String c() {
        return this.f9170e;
    }

    public int d() {
        return this.f9173h;
    }

    public int e() {
        return this.f9177l;
    }

    public SpannedString f() {
        return this.f9169d;
    }

    public int g() {
        return this.f9175j;
    }

    public int h() {
        return this.f9172g;
    }

    public int i() {
        return this.f9176k;
    }

    public int j() {
        return this.a.b();
    }

    public SpannedString k() {
        return this.f9168c;
    }

    public int l() {
        return this.f9174i;
    }

    public int m() {
        return this.a.c();
    }

    public boolean o() {
        return this.f9167b;
    }

    public boolean p() {
        return this.f9178m;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public yb(c cVar) {
        this.f9172g = 0;
        this.f9173h = 0;
        this.f9174i = ViewCompat.MEASURED_STATE_MASK;
        this.f9175j = ViewCompat.MEASURED_STATE_MASK;
        this.f9176k = 0;
        this.f9177l = 0;
        this.a = cVar;
    }
}
