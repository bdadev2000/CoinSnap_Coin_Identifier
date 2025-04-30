package com.mbridge.msdk.click.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f14783a = 0;
    public static int b = 1;

    /* renamed from: c, reason: collision with root package name */
    private String f14784c;

    /* renamed from: d, reason: collision with root package name */
    private int f14785d;

    /* renamed from: e, reason: collision with root package name */
    private HashSet<String> f14786e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private long f14787f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private CampaignEx f14788g;

    /* renamed from: h, reason: collision with root package name */
    private String f14789h;

    /* renamed from: i, reason: collision with root package name */
    private int f14790i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14791j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14792k;
    private int l;

    public b(String str, String str2) {
        this.f14784c = str;
        b(str2);
    }

    public final boolean a() {
        return this.f14791j;
    }

    public final boolean b() {
        return this.f14792k;
    }

    public final int c() {
        return this.l;
    }

    public final int d() {
        return this.f14790i;
    }

    public final String e() {
        return this.f14789h;
    }

    public final CampaignEx f() {
        return this.f14788g;
    }

    public final String g() {
        return this.f14784c;
    }

    public final int h() {
        return this.f14785d;
    }

    public final HashSet<String> i() {
        return this.f14786e;
    }

    public final long j() {
        return this.f14787f;
    }

    public final void a(boolean z8) {
        this.f14791j = z8;
    }

    public final void b(boolean z8) {
        this.f14792k = z8;
    }

    public final void a(int i9) {
        this.l = i9;
    }

    public final void b(int i9) {
        this.f14790i = i9;
    }

    public final void a(String str) {
        this.f14789h = str;
    }

    public final void b(String str) {
        this.f14785d++;
        this.f14786e.add(str);
    }

    public final void a(CampaignEx campaignEx) {
        this.f14788g = campaignEx;
    }
}
