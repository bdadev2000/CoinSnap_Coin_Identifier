package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes2.dex */
public interface qo {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f26203a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f26204b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26205c;
        public final int d;

        public a(int i2, byte[] bArr, int i3, int i4) {
            this.f26203a = i2;
            this.f26204b = bArr;
            this.f26205c = i3;
            this.d = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26203a == aVar.f26203a && this.f26205c == aVar.f26205c && this.d == aVar.d && Arrays.equals(this.f26204b, aVar.f26204b);
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f26204b) + (this.f26203a * 31)) * 31) + this.f26205c) * 31) + this.d;
        }
    }

    default int a(g5 g5Var, int i2, boolean z2) {
        return a(g5Var, i2, z2, 0);
    }

    int a(g5 g5Var, int i2, boolean z2, int i3);

    void a(long j2, int i2, int i3, int i4, a aVar);

    void a(bh bhVar, int i2, int i3);

    void a(f9 f9Var);

    default void a(bh bhVar, int i2) {
        a(bhVar, i2, 0);
    }
}
