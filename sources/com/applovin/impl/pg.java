package com.applovin.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class pg {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6951b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6952c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6953d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6954e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6955f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6956g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6957h;

    /* renamed from: i, reason: collision with root package name */
    private final JSONArray f6958i;

    /* renamed from: j, reason: collision with root package name */
    private final List f6959j;

    /* renamed from: k, reason: collision with root package name */
    private final List f6960k;

    /* loaded from: classes.dex */
    public static class a {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private String f6961b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6962c;

        /* renamed from: d, reason: collision with root package name */
        private String f6963d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f6964e;

        /* renamed from: f, reason: collision with root package name */
        private String f6965f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f6966g;

        /* renamed from: h, reason: collision with root package name */
        private String f6967h;

        /* renamed from: i, reason: collision with root package name */
        private String f6968i;

        /* renamed from: j, reason: collision with root package name */
        private int f6969j;

        /* renamed from: k, reason: collision with root package name */
        private int f6970k;

        /* renamed from: l, reason: collision with root package name */
        private String f6971l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f6972m;

        /* renamed from: n, reason: collision with root package name */
        private JSONArray f6973n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f6974o;

        /* renamed from: p, reason: collision with root package name */
        private List f6975p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f6976q;

        /* renamed from: r, reason: collision with root package name */
        private List f6977r;

        public a a(String str) {
            this.f6965f = str;
            this.f6964e = true;
            return this;
        }

        public a b(String str) {
            this.f6967h = str;
            this.f6966g = true;
            return this;
        }

        public a c(String str) {
            this.f6971l = str;
            return this;
        }

        public a d(String str) {
            this.f6968i = str;
            return this;
        }

        public a e(String str) {
            this.f6963d = str;
            this.f6962c = true;
            return this;
        }

        public a f(String str) {
            this.f6961b = str;
            this.a = true;
            return this;
        }

        public String toString() {
            return "OpenRtbAdConfiguration.Builder(version$value=" + this.f6961b + ", title$value=" + this.f6963d + ", advertiser$value=" + this.f6965f + ", body$value=" + this.f6967h + ", mainImageUrl=" + this.f6968i + ", mainImageWidth=" + this.f6969j + ", mainImageHeight=" + this.f6970k + ", clickDestinationUrl=" + this.f6971l + ", clickTrackingUrls$value=" + this.f6973n + ", jsTrackers$value=" + this.f6975p + ", impressionUrls$value=" + this.f6977r + ")";
        }

        public pg a() {
            String str = this.f6961b;
            if (!this.a) {
                str = pg.h();
            }
            String str2 = str;
            String str3 = this.f6963d;
            if (!this.f6962c) {
                str3 = pg.i();
            }
            String str4 = str3;
            String str5 = this.f6965f;
            if (!this.f6964e) {
                str5 = pg.j();
            }
            String str6 = str5;
            String str7 = this.f6967h;
            if (!this.f6966g) {
                str7 = pg.k();
            }
            String str8 = str7;
            JSONArray jSONArray = this.f6973n;
            if (!this.f6972m) {
                jSONArray = pg.l();
            }
            JSONArray jSONArray2 = jSONArray;
            List list = this.f6975p;
            if (!this.f6974o) {
                list = pg.m();
            }
            List list2 = list;
            List list3 = this.f6977r;
            if (!this.f6976q) {
                list3 = pg.n();
            }
            return new pg(str2, str4, str6, str8, this.f6968i, this.f6969j, this.f6970k, this.f6971l, jSONArray2, list2, list3);
        }

        public a b(List list) {
            this.f6975p = list;
            this.f6974o = true;
            return this;
        }

        public a a(JSONArray jSONArray) {
            this.f6973n = jSONArray;
            this.f6972m = true;
            return this;
        }

        public a b(int i10) {
            this.f6969j = i10;
            return this;
        }

        public a a(List list) {
            this.f6977r = list;
            this.f6976q = true;
            return this;
        }

        public a a(int i10) {
            this.f6970k = i10;
            return this;
        }
    }

    public pg(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, JSONArray jSONArray, List list, List list2) {
        this.a = str;
        this.f6951b = str2;
        this.f6952c = str3;
        this.f6953d = str4;
        this.f6954e = str5;
        this.f6955f = i10;
        this.f6956g = i11;
        this.f6957h = str6;
        this.f6958i = jSONArray;
        this.f6959j = list;
        this.f6960k = list2;
    }

    private static String a() {
        return "";
    }

    private static String b() {
        return "";
    }

    private static JSONArray c() {
        return new JSONArray();
    }

    private static List d() {
        return new ArrayList();
    }

    private static List e() {
        return new ArrayList();
    }

    private static String f() {
        return "";
    }

    private static String g() {
        return "";
    }

    public static /* synthetic */ String h() {
        return g();
    }

    public static /* synthetic */ String i() {
        return f();
    }

    public static /* synthetic */ String j() {
        return a();
    }

    public static /* synthetic */ String k() {
        return b();
    }

    public static /* synthetic */ JSONArray l() {
        return c();
    }

    public static /* synthetic */ List m() {
        return e();
    }

    public static /* synthetic */ List n() {
        return d();
    }

    public static a o() {
        return new a();
    }

    public String p() {
        return this.f6952c;
    }

    public String q() {
        return this.f6953d;
    }

    public String r() {
        return this.f6957h;
    }

    public JSONArray s() {
        return this.f6958i;
    }

    public List t() {
        return this.f6960k;
    }

    public List u() {
        return this.f6959j;
    }

    public int v() {
        return this.f6956g;
    }

    public String w() {
        return this.f6954e;
    }

    public int x() {
        return this.f6955f;
    }

    public String y() {
        return this.f6951b;
    }

    public String z() {
        return this.a;
    }
}
