package com.applovin.impl;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class y3 {

    /* renamed from: a, reason: collision with root package name */
    private static final y3 f28060a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final y3 f28061b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final y3 f28062c = new b(1);

    /* loaded from: classes2.dex */
    public class a extends y3 {
        public a() {
            super(null);
        }

        public y3 a(int i2) {
            if (i2 < 0) {
                return y3.f28061b;
            }
            return i2 > 0 ? y3.f28062c : y3.f28060a;
        }

        @Override // com.applovin.impl.y3
        public y3 b(boolean z2, boolean z3) {
            return a(k2.a(z3, z2));
        }

        @Override // com.applovin.impl.y3
        public int d() {
            return 0;
        }

        @Override // com.applovin.impl.y3
        public y3 a(int i2, int i3) {
            return a(ub.a(i2, i3));
        }

        @Override // com.applovin.impl.y3
        public y3 a(long j2, long j3) {
            return a(sc.a(j2, j3));
        }

        @Override // com.applovin.impl.y3
        public y3 a(Object obj, Object obj2, Comparator comparator) {
            return a(comparator.compare(obj, obj2));
        }

        @Override // com.applovin.impl.y3
        public y3 a(boolean z2, boolean z3) {
            return a(k2.a(z2, z3));
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends y3 {
        final int d;

        public b(int i2) {
            super(null);
            this.d = i2;
        }

        @Override // com.applovin.impl.y3
        public y3 a(int i2, int i3) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public y3 b(boolean z2, boolean z3) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public int d() {
            return this.d;
        }

        @Override // com.applovin.impl.y3
        public y3 a(long j2, long j3) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public y3 a(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public y3 a(boolean z2, boolean z3) {
            return this;
        }
    }

    private y3() {
    }

    public /* synthetic */ y3(a aVar) {
        this();
    }

    public static y3 e() {
        return f28060a;
    }

    public abstract y3 a(int i2, int i3);

    public abstract y3 a(long j2, long j3);

    public abstract y3 a(Object obj, Object obj2, Comparator comparator);

    public abstract y3 a(boolean z2, boolean z3);

    public abstract y3 b(boolean z2, boolean z3);

    public abstract int d();
}
