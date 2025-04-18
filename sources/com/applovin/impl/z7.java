package com.applovin.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface z7 {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f28308a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28309b;

        /* renamed from: c, reason: collision with root package name */
        private final int f28310c;

        public a(byte[] bArr, String str, int i2) {
            this.f28308a = bArr;
            this.f28309b = str;
            this.f28310c = i2;
        }

        public byte[] a() {
            return this.f28308a;
        }

        public String b() {
            return this.f28309b;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(z7 z7Var, byte[] bArr, int i2, int i3, byte[] bArr2);
    }

    /* loaded from: classes3.dex */
    public interface c {
        z7 a(UUID uuid);
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f28311a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28312b;

        public d(byte[] bArr, String str) {
            this.f28311a = bArr;
            this.f28312b = str;
        }

        public byte[] a() {
            return this.f28311a;
        }

        public String b() {
            return this.f28312b;
        }
    }

    a a(byte[] bArr, List list, int i2, HashMap hashMap);

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

    z4 d(byte[] bArr);

    byte[] d();
}
