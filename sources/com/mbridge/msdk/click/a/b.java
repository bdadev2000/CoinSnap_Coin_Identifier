package com.mbridge.msdk.click.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class b {
    public static int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f12492b = 1;

    /* renamed from: c, reason: collision with root package name */
    private String f12493c;

    /* renamed from: d, reason: collision with root package name */
    private int f12494d;

    /* renamed from: e, reason: collision with root package name */
    private HashSet<String> f12495e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private long f12496f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private CampaignEx f12497g;

    /* renamed from: h, reason: collision with root package name */
    private String f12498h;

    /* renamed from: i, reason: collision with root package name */
    private int f12499i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12500j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12501k;

    /* renamed from: l, reason: collision with root package name */
    private int f12502l;

    public b(String str, String str2) {
        this.f12493c = str;
        b(str2);
    }

    public final boolean a() {
        return this.f12500j;
    }

    public final boolean b() {
        return this.f12501k;
    }

    public final int c() {
        return this.f12502l;
    }

    public final int d() {
        return this.f12499i;
    }

    public final String e() {
        return this.f12498h;
    }

    public final CampaignEx f() {
        return this.f12497g;
    }

    public final String g() {
        return this.f12493c;
    }

    public final int h() {
        return this.f12494d;
    }

    public final HashSet<String> i() {
        return this.f12495e;
    }

    public final long j() {
        return this.f12496f;
    }

    public final void a(boolean z10) {
        this.f12500j = z10;
    }

    public final void b(boolean z10) {
        this.f12501k = z10;
    }

    public final void a(int i10) {
        this.f12502l = i10;
    }

    public final void b(int i10) {
        this.f12499i = i10;
    }

    public final void a(String str) {
        this.f12498h = str;
    }

    public final void b(String str) {
        this.f12494d++;
        this.f12495e.add(str);
    }

    public final void a(CampaignEx campaignEx) {
        this.f12497g = campaignEx;
    }
}
