package com.mbridge.msdk.foundation.b;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static int f15351a = 1;
    public static int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f15352c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f15353d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f15354e = 4;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f15355f;

    /* renamed from: g, reason: collision with root package name */
    private String f15356g;

    /* renamed from: h, reason: collision with root package name */
    private int f15357h = 21;

    /* renamed from: i, reason: collision with root package name */
    private int f15358i = b;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<String> f15359j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f15360k = new ArrayList();
    private List<String> l = new ArrayList();
    private List<String> m = new ArrayList();

    public final CopyOnWriteArrayList<CampaignEx> a() {
        return this.f15355f;
    }

    public final String b() {
        return this.f15356g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.f15359j;
        if (arrayList == null) {
            return "";
        }
        return arrayList.toString();
    }

    public final String d() {
        List<String> list = this.f15360k;
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
        return this.f15358i;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f15355f = copyOnWriteArrayList;
    }

    public final void b(String str) {
        try {
            List<String> list = this.f15360k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.f15359j;
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
        this.f15356g = str;
    }

    public final void a(int i9) {
        this.f15358i = i9;
    }
}
