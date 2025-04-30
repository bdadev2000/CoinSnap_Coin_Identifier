package com.mbridge.msdk.newreward.function.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f17047a = 1;
    public static int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f17048c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f17049d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f17050e = 4;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f17051f;

    /* renamed from: g, reason: collision with root package name */
    private String f17052g;

    /* renamed from: h, reason: collision with root package name */
    private int f17053h = 21;

    /* renamed from: i, reason: collision with root package name */
    private int f17054i = b;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<String> f17055j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f17056k = new ArrayList();
    private List<String> l = new ArrayList();
    private List<String> m = new ArrayList();

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.f17051f;
    }

    public final String b() {
        return this.f17052g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.f17055j;
        if (arrayList == null) {
            return "";
        }
        return arrayList.toString();
    }

    public final String d() {
        List<String> list = this.f17056k;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String e() {
        List<String> list = this.l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String f() {
        List<String> list = this.m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final int g() {
        return this.f17053h;
    }

    public final int h() {
        return this.f17054i;
    }

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        this.f17051f = bVar;
    }

    public final void b(String str) {
        try {
            List<String> list = this.f17056k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.f17055j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            List<String> list = this.l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void d(String str) {
        this.f17052g = str;
    }

    public final void a(int i9) {
        this.f17054i = i9;
    }
}
