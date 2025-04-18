package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e implements Serializable {
    private String a;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f15364d;

    /* renamed from: i, reason: collision with root package name */
    private h f15369i;

    /* renamed from: b, reason: collision with root package name */
    private int f15362b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f15363c = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f15367g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f15368h = 604800000;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15370j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15371k = false;

    /* renamed from: f, reason: collision with root package name */
    private long f15366f = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private String f15365e = UUID.randomUUID().toString();

    public e(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.f15362b;
    }

    public final int c() {
        return this.f15363c;
    }

    public final JSONObject d() {
        JSONObject jSONObject = this.f15364d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f15364d = jSONObject2;
        return jSONObject2;
    }

    public final String e() {
        return this.f15365e;
    }

    public final long f() {
        return this.f15366f;
    }

    public final long g() {
        return this.f15367g;
    }

    public final long h() {
        return this.f15368h;
    }

    public final h i() {
        return this.f15369i;
    }

    public final boolean j() {
        return this.f15370j;
    }

    public final boolean k() {
        return this.f15371k;
    }

    public final void a(int i10) {
        this.f15362b = i10;
    }

    public final void b(int i10) {
        this.f15363c = i10;
    }

    public final void c(long j3) {
        this.f15368h = j3;
    }

    public final void a(JSONObject jSONObject) {
        this.f15364d = jSONObject;
    }

    public final void b(long j3) {
        this.f15367g = j3;
    }

    public final void a(String str) {
        this.f15365e = str;
    }

    public final void a(long j3) {
        this.f15366f = j3;
    }

    public final void a(h hVar) {
        this.f15369i = hVar;
    }

    public final void a(boolean z10) {
        this.f15371k = z10;
    }
}
