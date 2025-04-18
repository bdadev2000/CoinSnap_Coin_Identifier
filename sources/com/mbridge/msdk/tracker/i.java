package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class i implements Serializable {
    static String a = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_count INTEGER)";

    /* renamed from: b, reason: collision with root package name */
    static String f15378b = "DROP TABLE IF EXISTS %s";

    /* renamed from: c, reason: collision with root package name */
    private final e f15379c;

    /* renamed from: d, reason: collision with root package name */
    private int f15380d;

    /* renamed from: e, reason: collision with root package name */
    private int f15381e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15382f;

    /* renamed from: g, reason: collision with root package name */
    private long f15383g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15384h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15385i = false;

    public i(e eVar) {
        this.f15379c = eVar;
        this.f15382f = eVar.e();
    }

    public final void a(boolean z10) {
        this.f15384h = z10;
    }

    public final void b(boolean z10) {
        this.f15385i = z10;
    }

    public final e c() {
        return this.f15379c;
    }

    public final int d() {
        return this.f15380d;
    }

    public final int e() {
        return this.f15381e;
    }

    public final String f() {
        return this.f15382f;
    }

    public final long g() {
        return this.f15383g;
    }

    public final boolean a() {
        return this.f15384h;
    }

    public final boolean b() {
        return this.f15385i;
    }

    public final void a(int i10) {
        this.f15380d = i10;
    }

    public final void b(int i10) {
        this.f15381e = i10;
    }

    public final void a(long j3) {
        this.f15383g = j3;
    }
}
