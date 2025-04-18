package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f13181b;

    /* renamed from: c, reason: collision with root package name */
    private String f13182c;

    /* renamed from: d, reason: collision with root package name */
    private int f13183d;

    /* renamed from: e, reason: collision with root package name */
    private int f13184e;

    /* renamed from: f, reason: collision with root package name */
    private String f13185f;

    /* renamed from: g, reason: collision with root package name */
    private String f13186g;

    /* renamed from: h, reason: collision with root package name */
    private String f13187h;

    /* renamed from: i, reason: collision with root package name */
    private int f13188i;

    /* renamed from: j, reason: collision with root package name */
    private String f13189j;

    /* renamed from: k, reason: collision with root package name */
    private int f13190k;

    /* renamed from: l, reason: collision with root package name */
    private String f13191l;

    /* renamed from: m, reason: collision with root package name */
    private int f13192m;

    /* renamed from: n, reason: collision with root package name */
    private String f13193n;

    /* renamed from: o, reason: collision with root package name */
    private String f13194o;

    /* renamed from: p, reason: collision with root package name */
    private int f13195p;

    /* renamed from: q, reason: collision with root package name */
    private String f13196q;

    public static String a(List<e> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            e next = it.next();
            String str = next.f13196q;
            if (!TextUtils.isEmpty(str)) {
                String str2 = com.mbridge.msdk.foundation.controller.a.f13020b.get(str);
                StringBuilder sb3 = new StringBuilder("u_stid=");
                if (str2 == null) {
                    str2 = "";
                }
                sb3.append(str2);
                sb3.append("&");
                sb2.append(sb3.toString());
            }
            Iterator<e> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                sb2.append("rid=" + next.f13193n);
                sb2.append("&rid_n=" + next.f13194o);
                sb2.append("&network_type=" + next.f13192m);
                sb2.append("&network_str=" + next.f13191l);
                sb2.append("&cid=" + next.a);
                sb2.append("&click_type=" + next.f13183d);
                sb2.append("&type=" + next.f13195p);
                sb2.append("&click_duration=" + next.f13181b);
                sb2.append("&key=2000013");
                sb2.append("&unit_id=" + next.f13196q);
                sb2.append("&last_url=" + next.f13189j);
                sb2.append("&content=" + next.f13185f);
                sb2.append("&code=" + next.f13184e);
                sb2.append("&exception=" + next.f13186g);
                sb2.append("&header=" + next.f13187h);
                sb2.append("&landing_type=" + next.f13188i);
                sb2.append("&link_type=" + next.f13190k);
                sb2.append("&click_time=" + next.f13182c + "\n");
            } else {
                sb2.append("rid=" + next.f13193n);
                sb2.append("&rid_n=" + next.f13194o);
                sb2.append("&cid=" + next.a);
                sb2.append("&click_type=" + next.f13183d);
                sb2.append("&type=" + next.f13195p);
                sb2.append("&click_duration=" + next.f13181b);
                sb2.append("&key=2000013");
                sb2.append("&unit_id=" + next.f13196q);
                sb2.append("&last_url=" + next.f13189j);
                sb2.append("&content=" + next.f13185f);
                sb2.append("&code=" + next.f13184e);
                sb2.append("&exception=" + next.f13186g);
                sb2.append("&header=" + next.f13187h);
                sb2.append("&landing_type=" + next.f13188i);
                sb2.append("&link_type=" + next.f13190k);
                sb2.append("&click_time=" + next.f13182c + "\n");
            }
            it = it2;
        }
        return sb2.toString();
    }

    public final String b() {
        return this.f13193n;
    }

    public final String c() {
        return this.f13194o;
    }

    public final int d() {
        return this.f13192m;
    }

    public final String e() {
        return this.f13191l;
    }

    public final String f() {
        return this.a;
    }

    public final int g() {
        return this.f13183d;
    }

    public final int h() {
        return this.f13195p;
    }

    public final String i() {
        return this.f13181b;
    }

    public final String j() {
        return this.f13189j;
    }

    public final int k() {
        return this.f13184e;
    }

    public final String l() {
        return this.f13186g;
    }

    public final int m() {
        return this.f13188i;
    }

    public final int n() {
        return this.f13190k;
    }

    public final String o() {
        return this.f13182c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickTime [campaignId=");
        sb2.append(this.a);
        sb2.append(", click_duration=");
        sb2.append(this.f13181b);
        sb2.append(", lastUrl=");
        sb2.append(this.f13189j);
        sb2.append(", code=");
        sb2.append(this.f13184e);
        sb2.append(", excepiton=");
        sb2.append(this.f13186g);
        sb2.append(", header=");
        sb2.append(this.f13187h);
        sb2.append(", content=");
        sb2.append(this.f13185f);
        sb2.append(", type=");
        sb2.append(this.f13195p);
        sb2.append(", click_type=");
        return vd.e.g(sb2, this.f13183d, "]");
    }

    public final void b(String str) {
        this.f13193n = str;
    }

    public final void c(String str) {
        this.f13191l = str;
    }

    public final void d(String str) {
        this.f13186g = str;
    }

    public final void e(int i10) {
        this.f13190k = i10;
    }

    public final void f(String str) {
        this.f13187h = str;
    }

    public final void g(String str) {
        this.f13185f = str;
    }

    public final void h(String str) {
        this.f13189j = str;
    }

    public final void i(String str) {
        this.f13181b = str;
    }

    public final void j(String str) {
        this.a = str;
    }

    public final void k(String str) {
        this.f13194o = str;
    }

    public final void b(int i10) {
        this.f13183d = i10;
    }

    public final void c(int i10) {
        this.f13195p = i10;
    }

    public final void d(int i10) {
        this.f13188i = i10;
    }

    public final void e(String str) {
        this.f13182c = str;
    }

    public final void f(int i10) {
        this.f13184e = i10;
    }

    public final String a() {
        return this.f13196q;
    }

    public final void a(String str) {
        this.f13196q = str;
    }

    public final void a(int i10) {
        this.f13192m = i10;
    }
}
