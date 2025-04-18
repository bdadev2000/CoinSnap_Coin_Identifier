package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public interface ro {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f7386b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7387c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7388d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.a = i10;
            this.f7386b = bArr;
            this.f7387c = i11;
            this.f7388d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.f7387c == aVar.f7387c && this.f7388d == aVar.f7388d && Arrays.equals(this.f7386b, aVar.f7386b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f7386b) + (this.a * 31)) * 31) + this.f7387c) * 31) + this.f7388d;
        }
    }

    default int a(e5 e5Var, int i10, boolean z10) {
        return a(e5Var, i10, z10, 0);
    }

    int a(e5 e5Var, int i10, boolean z10, int i11);

    void a(long j3, int i10, int i11, int i12, a aVar);

    void a(d9 d9Var);

    void a(yg ygVar, int i10, int i11);

    default void a(yg ygVar, int i10) {
        a(ygVar, i10, 0);
    }
}
