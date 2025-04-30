package com.applovin.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class pg {

    /* renamed from: a, reason: collision with root package name */
    private final String f10020a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10021c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10022d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10023e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10024f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10025g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10026h;

    /* renamed from: i, reason: collision with root package name */
    private final JSONArray f10027i;

    /* renamed from: j, reason: collision with root package name */
    private final List f10028j;

    /* renamed from: k, reason: collision with root package name */
    private final List f10029k;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f10030a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10031c;

        /* renamed from: d, reason: collision with root package name */
        private String f10032d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f10033e;

        /* renamed from: f, reason: collision with root package name */
        private String f10034f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f10035g;

        /* renamed from: h, reason: collision with root package name */
        private String f10036h;

        /* renamed from: i, reason: collision with root package name */
        private String f10037i;

        /* renamed from: j, reason: collision with root package name */
        private int f10038j;

        /* renamed from: k, reason: collision with root package name */
        private int f10039k;
        private String l;
        private boolean m;

        /* renamed from: n, reason: collision with root package name */
        private JSONArray f10040n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f10041o;

        /* renamed from: p, reason: collision with root package name */
        private List f10042p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f10043q;

        /* renamed from: r, reason: collision with root package name */
        private List f10044r;

        public a a(String str) {
            this.f10034f = str;
            this.f10033e = true;
            return this;
        }

        public a b(String str) {
            this.f10036h = str;
            this.f10035g = true;
            return this;
        }

        public a c(String str) {
            this.l = str;
            return this;
        }

        public a d(String str) {
            this.f10037i = str;
            return this;
        }

        public a e(String str) {
            this.f10032d = str;
            this.f10031c = true;
            return this;
        }

        public a f(String str) {
            this.b = str;
            this.f10030a = true;
            return this;
        }

        public String toString() {
            return "OpenRtbAdConfiguration.Builder(version$value=" + this.b + ", title$value=" + this.f10032d + ", advertiser$value=" + this.f10034f + ", body$value=" + this.f10036h + ", mainImageUrl=" + this.f10037i + ", mainImageWidth=" + this.f10038j + ", mainImageHeight=" + this.f10039k + ", clickDestinationUrl=" + this.l + ", clickTrackingUrls$value=" + this.f10040n + ", jsTrackers$value=" + this.f10042p + ", impressionUrls$value=" + this.f10044r + ")";
        }

        public pg a() {
            String str = this.b;
            if (!this.f10030a) {
                str = pg.h();
            }
            String str2 = str;
            String str3 = this.f10032d;
            if (!this.f10031c) {
                str3 = pg.i();
            }
            String str4 = str3;
            String str5 = this.f10034f;
            if (!this.f10033e) {
                str5 = pg.j();
            }
            String str6 = str5;
            String str7 = this.f10036h;
            if (!this.f10035g) {
                str7 = pg.k();
            }
            String str8 = str7;
            JSONArray jSONArray = this.f10040n;
            if (!this.m) {
                jSONArray = pg.l();
            }
            JSONArray jSONArray2 = jSONArray;
            List list = this.f10042p;
            if (!this.f10041o) {
                list = pg.m();
            }
            List list2 = list;
            List list3 = this.f10044r;
            if (!this.f10043q) {
                list3 = pg.n();
            }
            return new pg(str2, str4, str6, str8, this.f10037i, this.f10038j, this.f10039k, this.l, jSONArray2, list2, list3);
        }

        public a b(List list) {
            this.f10042p = list;
            this.f10041o = true;
            return this;
        }

        public a a(JSONArray jSONArray) {
            this.f10040n = jSONArray;
            this.m = true;
            return this;
        }

        public a b(int i9) {
            this.f10038j = i9;
            return this;
        }

        public a a(List list) {
            this.f10044r = list;
            this.f10043q = true;
            return this;
        }

        public a a(int i9) {
            this.f10039k = i9;
            return this;
        }
    }

    public pg(String str, String str2, String str3, String str4, String str5, int i9, int i10, String str6, JSONArray jSONArray, List list, List list2) {
        this.f10020a = str;
        this.b = str2;
        this.f10021c = str3;
        this.f10022d = str4;
        this.f10023e = str5;
        this.f10024f = i9;
        this.f10025g = i10;
        this.f10026h = str6;
        this.f10027i = jSONArray;
        this.f10028j = list;
        this.f10029k = list2;
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
        return this.f10021c;
    }

    public String q() {
        return this.f10022d;
    }

    public String r() {
        return this.f10026h;
    }

    public JSONArray s() {
        return this.f10027i;
    }

    public List t() {
        return this.f10029k;
    }

    public List u() {
        return this.f10028j;
    }

    public int v() {
        return this.f10025g;
    }

    public String w() {
        return this.f10023e;
    }

    public int x() {
        return this.f10024f;
    }

    public String y() {
        return this.b;
    }

    public String z() {
        return this.f10020a;
    }
}
