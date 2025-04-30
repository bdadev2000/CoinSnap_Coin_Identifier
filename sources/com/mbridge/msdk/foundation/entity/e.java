package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f15553a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f15554c;

    /* renamed from: d, reason: collision with root package name */
    private int f15555d;

    /* renamed from: e, reason: collision with root package name */
    private int f15556e;

    /* renamed from: f, reason: collision with root package name */
    private String f15557f;

    /* renamed from: g, reason: collision with root package name */
    private String f15558g;

    /* renamed from: h, reason: collision with root package name */
    private String f15559h;

    /* renamed from: i, reason: collision with root package name */
    private int f15560i;

    /* renamed from: j, reason: collision with root package name */
    private String f15561j;

    /* renamed from: k, reason: collision with root package name */
    private int f15562k;
    private String l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private String f15563n;

    /* renamed from: o, reason: collision with root package name */
    private String f15564o;

    /* renamed from: p, reason: collision with root package name */
    private int f15565p;

    /* renamed from: q, reason: collision with root package name */
    private String f15566q;

    public static String a(List<e> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            e next = it.next();
            String str = next.f15566q;
            if (!TextUtils.isEmpty(str)) {
                String str2 = com.mbridge.msdk.foundation.controller.a.b.get(str);
                StringBuilder sb2 = new StringBuilder("u_stid=");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append("&");
                sb.append(sb2.toString());
            }
            Iterator<e> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                sb.append("rid=" + next.f15563n);
                sb.append("&rid_n=" + next.f15564o);
                sb.append("&network_type=" + next.m);
                sb.append("&network_str=" + next.l);
                sb.append("&cid=" + next.f15553a);
                sb.append("&click_type=" + next.f15555d);
                sb.append("&type=" + next.f15565p);
                sb.append("&click_duration=" + next.b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f15566q);
                sb.append("&last_url=" + next.f15561j);
                sb.append("&content=" + next.f15557f);
                sb.append("&code=" + next.f15556e);
                sb.append("&exception=" + next.f15558g);
                sb.append("&header=" + next.f15559h);
                sb.append("&landing_type=" + next.f15560i);
                sb.append("&link_type=" + next.f15562k);
                sb.append("&click_time=" + next.f15554c + "\n");
            } else {
                sb.append("rid=" + next.f15563n);
                sb.append("&rid_n=" + next.f15564o);
                sb.append("&cid=" + next.f15553a);
                sb.append("&click_type=" + next.f15555d);
                sb.append("&type=" + next.f15565p);
                sb.append("&click_duration=" + next.b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f15566q);
                sb.append("&last_url=" + next.f15561j);
                sb.append("&content=" + next.f15557f);
                sb.append("&code=" + next.f15556e);
                sb.append("&exception=" + next.f15558g);
                sb.append("&header=" + next.f15559h);
                sb.append("&landing_type=" + next.f15560i);
                sb.append("&link_type=" + next.f15562k);
                sb.append("&click_time=" + next.f15554c + "\n");
            }
            it = it2;
        }
        return sb.toString();
    }

    public final String b() {
        return this.f15563n;
    }

    public final String c() {
        return this.f15564o;
    }

    public final int d() {
        return this.m;
    }

    public final String e() {
        return this.l;
    }

    public final String f() {
        return this.f15553a;
    }

    public final int g() {
        return this.f15555d;
    }

    public final int h() {
        return this.f15565p;
    }

    public final String i() {
        return this.b;
    }

    public final String j() {
        return this.f15561j;
    }

    public final int k() {
        return this.f15556e;
    }

    public final String l() {
        return this.f15558g;
    }

    public final int m() {
        return this.f15560i;
    }

    public final int n() {
        return this.f15562k;
    }

    public final String o() {
        return this.f15554c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickTime [campaignId=");
        sb.append(this.f15553a);
        sb.append(", click_duration=");
        sb.append(this.b);
        sb.append(", lastUrl=");
        sb.append(this.f15561j);
        sb.append(", code=");
        sb.append(this.f15556e);
        sb.append(", excepiton=");
        sb.append(this.f15558g);
        sb.append(", header=");
        sb.append(this.f15559h);
        sb.append(", content=");
        sb.append(this.f15557f);
        sb.append(", type=");
        sb.append(this.f15565p);
        sb.append(", click_type=");
        return AbstractC2914a.g(sb, this.f15555d, "]");
    }

    public final void b(String str) {
        this.f15563n = str;
    }

    public final void c(String str) {
        this.l = str;
    }

    public final void d(String str) {
        this.f15558g = str;
    }

    public final void e(int i9) {
        this.f15562k = i9;
    }

    public final void f(String str) {
        this.f15559h = str;
    }

    public final void g(String str) {
        this.f15557f = str;
    }

    public final void h(String str) {
        this.f15561j = str;
    }

    public final void i(String str) {
        this.b = str;
    }

    public final void j(String str) {
        this.f15553a = str;
    }

    public final void k(String str) {
        this.f15564o = str;
    }

    public final void b(int i9) {
        this.f15555d = i9;
    }

    public final void c(int i9) {
        this.f15565p = i9;
    }

    public final void d(int i9) {
        this.f15560i = i9;
    }

    public final void e(String str) {
        this.f15554c = str;
    }

    public final void f(int i9) {
        this.f15556e = i9;
    }

    public final String a() {
        return this.f15566q;
    }

    public final void a(String str) {
        this.f15566q = str;
    }

    public final void a(int i9) {
        this.m = i9;
    }
}
