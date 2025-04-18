package com.mbridge.msdk.newreward.function.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {
    public static int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f14442b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14443c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f14444d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f14445e = 4;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f14446f;

    /* renamed from: g, reason: collision with root package name */
    private String f14447g;

    /* renamed from: h, reason: collision with root package name */
    private int f14448h = 21;

    /* renamed from: i, reason: collision with root package name */
    private int f14449i = f14442b;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<String> f14450j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f14451k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<String> f14452l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private List<String> f14453m = new ArrayList();

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.f14446f;
    }

    public final String b() {
        return this.f14447g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.f14450j;
        return arrayList == null ? "" : arrayList.toString();
    }

    public final String d() {
        List<String> list = this.f14451k;
        return list == null ? "" : list.toString();
    }

    public final String e() {
        List<String> list = this.f14452l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String f() {
        List<String> list = this.f14453m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final int g() {
        return this.f14448h;
    }

    public final int h() {
        return this.f14449i;
    }

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        this.f14446f = bVar;
    }

    public final void b(String str) {
        try {
            List<String> list = this.f14451k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.f14450j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            List<String> list = this.f14452l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void d(String str) {
        this.f14447g = str;
    }

    public final void a(int i10) {
        this.f14449i = i10;
    }
}
