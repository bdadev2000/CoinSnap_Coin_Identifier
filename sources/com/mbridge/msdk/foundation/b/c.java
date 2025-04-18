package com.mbridge.msdk.foundation.b;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class c {
    public static int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f12992b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f12993c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f12994d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f12995e = 4;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f12996f;

    /* renamed from: g, reason: collision with root package name */
    private String f12997g;

    /* renamed from: h, reason: collision with root package name */
    private int f12998h = 21;

    /* renamed from: i, reason: collision with root package name */
    private int f12999i = f12992b;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<String> f13000j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f13001k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<String> f13002l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private List<String> f13003m = new ArrayList();

    public final CopyOnWriteArrayList<CampaignEx> a() {
        return this.f12996f;
    }

    public final String b() {
        return this.f12997g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.f13000j;
        return arrayList == null ? "" : arrayList.toString();
    }

    public final String d() {
        List<String> list = this.f13001k;
        return list == null ? "" : list.toString();
    }

    public final String e() {
        List<String> list = this.f13002l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String f() {
        List<String> list = this.f13003m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final int g() {
        return this.f12999i;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f12996f = copyOnWriteArrayList;
    }

    public final void b(String str) {
        try {
            List<String> list = this.f13001k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.f13000j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            List<String> list = this.f13002l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void d(String str) {
        this.f12997g = str;
    }

    public final void a(int i10) {
        this.f12999i = i10;
    }
}
