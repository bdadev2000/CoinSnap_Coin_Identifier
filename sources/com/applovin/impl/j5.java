package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f8395a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8396c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8397d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f8398e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8399f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8400g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8401h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8402i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8403j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f8404k;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f8405a;
        private long b;

        /* renamed from: c, reason: collision with root package name */
        private int f8406c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f8407d;

        /* renamed from: e, reason: collision with root package name */
        private Map f8408e;

        /* renamed from: f, reason: collision with root package name */
        private long f8409f;

        /* renamed from: g, reason: collision with root package name */
        private long f8410g;

        /* renamed from: h, reason: collision with root package name */
        private String f8411h;

        /* renamed from: i, reason: collision with root package name */
        private int f8412i;

        /* renamed from: j, reason: collision with root package name */
        private Object f8413j;

        public b() {
            this.f8406c = 1;
            this.f8408e = Collections.emptyMap();
            this.f8410g = -1L;
        }

        public j5 a() {
            AbstractC0669a1.a(this.f8405a, "The uri must be set.");
            return new j5(this.f8405a, this.b, this.f8406c, this.f8407d, this.f8408e, this.f8409f, this.f8410g, this.f8411h, this.f8412i, this.f8413j);
        }

        public b b(int i9) {
            this.f8406c = i9;
            return this;
        }

        public b b(String str) {
            this.f8405a = Uri.parse(str);
            return this;
        }

        public b a(int i9) {
            this.f8412i = i9;
            return this;
        }

        public b a(byte[] bArr) {
            this.f8407d = bArr;
            return this;
        }

        private b(j5 j5Var) {
            this.f8405a = j5Var.f8395a;
            this.b = j5Var.b;
            this.f8406c = j5Var.f8396c;
            this.f8407d = j5Var.f8397d;
            this.f8408e = j5Var.f8398e;
            this.f8409f = j5Var.f8400g;
            this.f8410g = j5Var.f8401h;
            this.f8411h = j5Var.f8402i;
            this.f8412i = j5Var.f8403j;
            this.f8413j = j5Var.f8404k;
        }

        public b a(Map map) {
            this.f8408e = map;
            return this;
        }

        public b a(String str) {
            this.f8411h = str;
            return this;
        }

        public b a(long j7) {
            this.f8409f = j7;
            return this;
        }

        public b a(Uri uri) {
            this.f8405a = uri;
            return this;
        }
    }

    private j5(Uri uri, long j7, int i9, byte[] bArr, Map map, long j9, long j10, String str, int i10, Object obj) {
        byte[] bArr2 = bArr;
        long j11 = j7 + j9;
        AbstractC0669a1.a(j11 >= 0);
        AbstractC0669a1.a(j9 >= 0);
        AbstractC0669a1.a(j10 > 0 || j10 == -1);
        this.f8395a = uri;
        this.b = j7;
        this.f8396c = i9;
        this.f8397d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f8398e = Collections.unmodifiableMap(new HashMap(map));
        this.f8400g = j9;
        this.f8399f = j11;
        this.f8401h = j10;
        this.f8402i = str;
        this.f8403j = i10;
        this.f8404k = obj;
    }

    public static String a(int i9) {
        if (i9 == 1) {
            return "GET";
        }
        if (i9 == 2) {
            return "POST";
        }
        if (i9 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final String b() {
        return a(this.f8396c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b());
        sb.append(" ");
        sb.append(this.f8395a);
        sb.append(", ");
        sb.append(this.f8400g);
        sb.append(", ");
        sb.append(this.f8401h);
        sb.append(", ");
        sb.append(this.f8402i);
        sb.append(", ");
        return AbstractC2914a.g(sb, this.f8403j, "]");
    }

    public boolean b(int i9) {
        return (this.f8403j & i9) == i9;
    }

    public b a() {
        return new b();
    }
}
