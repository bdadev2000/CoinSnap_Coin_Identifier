package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static String f18118a = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_count INTEGER)";
    static String b = "DROP TABLE IF EXISTS %s";

    /* renamed from: c, reason: collision with root package name */
    private final e f18119c;

    /* renamed from: d, reason: collision with root package name */
    private int f18120d;

    /* renamed from: e, reason: collision with root package name */
    private int f18121e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18122f;

    /* renamed from: g, reason: collision with root package name */
    private long f18123g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18124h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18125i = false;

    public i(e eVar) {
        this.f18119c = eVar;
        this.f18122f = eVar.e();
    }

    public final void a(boolean z8) {
        this.f18124h = z8;
    }

    public final void b(boolean z8) {
        this.f18125i = z8;
    }

    public final e c() {
        return this.f18119c;
    }

    public final int d() {
        return this.f18120d;
    }

    public final int e() {
        return this.f18121e;
    }

    public final String f() {
        return this.f18122f;
    }

    public final long g() {
        return this.f18123g;
    }

    public final boolean a() {
        return this.f18124h;
    }

    public final boolean b() {
        return this.f18125i;
    }

    public final void a(int i9) {
        this.f18120d = i9;
    }

    public final void b(int i9) {
        this.f18121e = i9;
    }

    public final void a(long j7) {
        this.f18123g = j7;
    }
}
