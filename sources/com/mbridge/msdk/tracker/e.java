package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f18102a;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f18104d;

    /* renamed from: i, reason: collision with root package name */
    private h f18109i;
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f18103c = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f18107g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f18108h = 604800000;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18110j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18111k = false;

    /* renamed from: f, reason: collision with root package name */
    private long f18106f = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private String f18105e = UUID.randomUUID().toString();

    public e(String str) {
        this.f18102a = str;
    }

    public final String a() {
        return this.f18102a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.f18103c;
    }

    public final JSONObject d() {
        JSONObject jSONObject = this.f18104d;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f18104d = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    public final String e() {
        return this.f18105e;
    }

    public final long f() {
        return this.f18106f;
    }

    public final long g() {
        return this.f18107g;
    }

    public final long h() {
        return this.f18108h;
    }

    public final h i() {
        return this.f18109i;
    }

    public final boolean j() {
        return this.f18110j;
    }

    public final boolean k() {
        return this.f18111k;
    }

    public final void a(int i9) {
        this.b = i9;
    }

    public final void b(int i9) {
        this.f18103c = i9;
    }

    public final void c(long j7) {
        this.f18108h = j7;
    }

    public final void a(JSONObject jSONObject) {
        this.f18104d = jSONObject;
    }

    public final void b(long j7) {
        this.f18107g = j7;
    }

    public final void a(String str) {
        this.f18105e = str;
    }

    public final void a(long j7) {
        this.f18106f = j7;
    }

    public final void a(h hVar) {
        this.f18109i = hVar;
    }

    public final void a(boolean z8) {
        this.f18111k = z8;
    }
}
