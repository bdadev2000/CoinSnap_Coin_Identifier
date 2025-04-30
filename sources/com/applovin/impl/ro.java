package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public interface ro {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f10523a;
        public final byte[] b;

        /* renamed from: c, reason: collision with root package name */
        public final int f10524c;

        /* renamed from: d, reason: collision with root package name */
        public final int f10525d;

        public a(int i9, byte[] bArr, int i10, int i11) {
            this.f10523a = i9;
            this.b = bArr;
            this.f10524c = i10;
            this.f10525d = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f10523a == aVar.f10523a && this.f10524c == aVar.f10524c && this.f10525d == aVar.f10525d && Arrays.equals(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.b) + (this.f10523a * 31)) * 31) + this.f10524c) * 31) + this.f10525d;
        }
    }

    default int a(e5 e5Var, int i9, boolean z8) {
        return a(e5Var, i9, z8, 0);
    }

    int a(e5 e5Var, int i9, boolean z8, int i10);

    void a(long j7, int i9, int i10, int i11, a aVar);

    void a(d9 d9Var);

    void a(yg ygVar, int i9, int i10);

    default void a(yg ygVar, int i9) {
        a(ygVar, i9, 0);
    }
}
