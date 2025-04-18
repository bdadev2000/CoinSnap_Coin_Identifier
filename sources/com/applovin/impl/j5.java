package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j5 {
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5439c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5440d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f5441e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5442f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5443g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5444h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5445i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5446j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f5447k;

    /* loaded from: classes.dex */
    public static final class b {
        private Uri a;

        /* renamed from: b, reason: collision with root package name */
        private long f5448b;

        /* renamed from: c, reason: collision with root package name */
        private int f5449c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f5450d;

        /* renamed from: e, reason: collision with root package name */
        private Map f5451e;

        /* renamed from: f, reason: collision with root package name */
        private long f5452f;

        /* renamed from: g, reason: collision with root package name */
        private long f5453g;

        /* renamed from: h, reason: collision with root package name */
        private String f5454h;

        /* renamed from: i, reason: collision with root package name */
        private int f5455i;

        /* renamed from: j, reason: collision with root package name */
        private Object f5456j;

        public b() {
            this.f5449c = 1;
            this.f5451e = Collections.emptyMap();
            this.f5453g = -1L;
        }

        public j5 a() {
            a1.a(this.a, "The uri must be set.");
            return new j5(this.a, this.f5448b, this.f5449c, this.f5450d, this.f5451e, this.f5452f, this.f5453g, this.f5454h, this.f5455i, this.f5456j);
        }

        public b b(int i10) {
            this.f5449c = i10;
            return this;
        }

        public b b(String str) {
            this.a = Uri.parse(str);
            return this;
        }

        public b a(int i10) {
            this.f5455i = i10;
            return this;
        }

        public b a(byte[] bArr) {
            this.f5450d = bArr;
            return this;
        }

        private b(j5 j5Var) {
            this.a = j5Var.a;
            this.f5448b = j5Var.f5438b;
            this.f5449c = j5Var.f5439c;
            this.f5450d = j5Var.f5440d;
            this.f5451e = j5Var.f5441e;
            this.f5452f = j5Var.f5443g;
            this.f5453g = j5Var.f5444h;
            this.f5454h = j5Var.f5445i;
            this.f5455i = j5Var.f5446j;
            this.f5456j = j5Var.f5447k;
        }

        public b a(Map map) {
            this.f5451e = map;
            return this;
        }

        public b a(String str) {
            this.f5454h = str;
            return this;
        }

        public b a(long j3) {
            this.f5452f = j3;
            return this;
        }

        public b a(Uri uri) {
            this.a = uri;
            return this;
        }
    }

    private j5(Uri uri, long j3, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j12 = j3 + j10;
        boolean z10 = true;
        a1.a(j12 >= 0);
        a1.a(j10 >= 0);
        if (j11 <= 0 && j11 != -1) {
            z10 = false;
        }
        a1.a(z10);
        this.a = uri;
        this.f5438b = j3;
        this.f5439c = i10;
        this.f5440d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f5441e = Collections.unmodifiableMap(new HashMap(map));
        this.f5443g = j10;
        this.f5442f = j12;
        this.f5444h = j11;
        this.f5445i = str;
        this.f5446j = i11;
        this.f5447k = obj;
    }

    public static String a(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final String b() {
        return a(this.f5439c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(b());
        sb2.append(" ");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.f5443g);
        sb2.append(", ");
        sb2.append(this.f5444h);
        sb2.append(", ");
        sb2.append(this.f5445i);
        sb2.append(", ");
        return vd.e.g(sb2, this.f5446j, "]");
    }

    public b a() {
        return new b();
    }

    public boolean b(int i10) {
        return (this.f5446j & i10) == i10;
    }
}
