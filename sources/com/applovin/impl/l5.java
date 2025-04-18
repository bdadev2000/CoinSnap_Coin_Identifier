package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l5 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f24983a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24985c;
    public final byte[] d;
    public final Map e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24986f;

    /* renamed from: g, reason: collision with root package name */
    public final long f24987g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24988h;

    /* renamed from: i, reason: collision with root package name */
    public final String f24989i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24990j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f24991k;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f24992a;

        /* renamed from: b, reason: collision with root package name */
        private long f24993b;

        /* renamed from: c, reason: collision with root package name */
        private int f24994c;
        private byte[] d;
        private Map e;

        /* renamed from: f, reason: collision with root package name */
        private long f24995f;

        /* renamed from: g, reason: collision with root package name */
        private long f24996g;

        /* renamed from: h, reason: collision with root package name */
        private String f24997h;

        /* renamed from: i, reason: collision with root package name */
        private int f24998i;

        /* renamed from: j, reason: collision with root package name */
        private Object f24999j;

        public b() {
            this.f24994c = 1;
            this.e = Collections.emptyMap();
            this.f24996g = -1L;
        }

        public b a(int i2) {
            this.f24998i = i2;
            return this;
        }

        public b b(int i2) {
            this.f24994c = i2;
            return this;
        }

        public b a(long j2) {
            this.f24995f = j2;
            return this;
        }

        public b b(String str) {
            this.f24992a = Uri.parse(str);
            return this;
        }

        private b(l5 l5Var) {
            this.f24992a = l5Var.f24983a;
            this.f24993b = l5Var.f24984b;
            this.f24994c = l5Var.f24985c;
            this.d = l5Var.d;
            this.e = l5Var.e;
            this.f24995f = l5Var.f24987g;
            this.f24996g = l5Var.f24988h;
            this.f24997h = l5Var.f24989i;
            this.f24998i = l5Var.f24990j;
            this.f24999j = l5Var.f24991k;
        }

        public b a(Uri uri) {
            this.f24992a = uri;
            return this;
        }

        public b a(String str) {
            this.f24997h = str;
            return this;
        }

        public b a(Map map) {
            this.e = map;
            return this;
        }

        public b a(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public l5 a() {
            b1.a(this.f24992a, "The uri must be set.");
            return new l5(this.f24992a, this.f24993b, this.f24994c, this.d, this.e, this.f24995f, this.f24996g, this.f24997h, this.f24998i, this.f24999j);
        }
    }

    private l5(Uri uri, long j2, int i2, byte[] bArr, Map map, long j3, long j4, String str, int i3, Object obj) {
        byte[] bArr2 = bArr;
        long j5 = j2 + j3;
        boolean z2 = true;
        b1.a(j5 >= 0);
        b1.a(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z2 = false;
        }
        b1.a(z2);
        this.f24983a = uri;
        this.f24984b = j2;
        this.f24985c = i2;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f24987g = j3;
        this.f24986f = j5;
        this.f24988h = j4;
        this.f24989i = str;
        this.f24990j = i3;
        this.f24991k = obj;
    }

    public static String a(int i2) {
        if (i2 == 1) {
            return "GET";
        }
        if (i2 == 2) {
            return com.safedk.android.a.g.f29074c;
        }
        if (i2 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public boolean b(int i2) {
        return (this.f24990j & i2) == i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b());
        sb.append(" ");
        sb.append(this.f24983a);
        sb.append(", ");
        sb.append(this.f24987g);
        sb.append(", ");
        sb.append(this.f24988h);
        sb.append(", ");
        sb.append(this.f24989i);
        sb.append(", ");
        return androidx.compose.foundation.text.input.a.n(sb, this.f24990j, "]");
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return a(this.f24985c);
    }
}
