package com.applovin.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface x7 {

    /* loaded from: classes.dex */
    public static final class a {
        private final byte[] a;

        /* renamed from: b, reason: collision with root package name */
        private final String f8956b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8957c;

        public a(byte[] bArr, String str, int i10) {
            this.a = bArr;
            this.f8956b = str;
            this.f8957c = i10;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.f8956b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(x7 x7Var, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* loaded from: classes.dex */
    public interface c {
        x7 a(UUID uuid);
    }

    /* loaded from: classes.dex */
    public static final class d {
        private final byte[] a;

        /* renamed from: b, reason: collision with root package name */
        private final String f8958b;

        public d(byte[] bArr, String str) {
            this.a = bArr;
            this.f8958b = str;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.f8958b;
        }
    }

    a a(byte[] bArr, List list, int i10, HashMap hashMap);

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
