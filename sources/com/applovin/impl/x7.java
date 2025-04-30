package com.applovin.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface x7 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f12157a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final int f12158c;

        public a(byte[] bArr, String str, int i9) {
            this.f12157a = bArr;
            this.b = str;
            this.f12158c = i9;
        }

        public byte[] a() {
            return this.f12157a;
        }

        public String b() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(x7 x7Var, byte[] bArr, int i9, int i10, byte[] bArr2);
    }

    /* loaded from: classes.dex */
    public interface c {
        x7 a(UUID uuid);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f12159a;
        private final String b;

        public d(byte[] bArr, String str) {
            this.f12159a = bArr;
            this.b = str;
        }

        public byte[] a() {
            return this.f12159a;
        }

        public String b() {
            return this.b;
        }
    }

    a a(byte[] bArr, List list, int i9, HashMap hashMap);

    void a();

    void a(b bVar);

    void a(byte[] bArr);

    void a(byte[] bArr, byte[] bArr2);

    boolean a(byte[] bArr, String str);

    d b();

    Map b(byte[] bArr);

    byte[] b(byte[] bArr, byte[] bArr2);

    int c();

    void c(byte[] bArr);

    x4 d(byte[] bArr);

    byte[] d();
}
