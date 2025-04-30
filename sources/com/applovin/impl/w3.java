package com.applovin.impl;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class w3 {

    /* renamed from: a, reason: collision with root package name */
    private static final w3 f11890a = new a();
    private static final w3 b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final w3 f11891c = new b(1);

    /* loaded from: classes.dex */
    public class a extends w3 {
        public a() {
            super(null);
        }

        public w3 a(int i9) {
            if (i9 < 0) {
                return w3.b;
            }
            return i9 > 0 ? w3.f11891c : w3.f11890a;
        }

        @Override // com.applovin.impl.w3
        public w3 b(boolean z8, boolean z9) {
            return a(AbstractC0709i2.a(z9, z8));
        }

        @Override // com.applovin.impl.w3
        public int d() {
            return 0;
        }

        @Override // com.applovin.impl.w3
        public w3 a(int i9, int i10) {
            return a(pb.a(i9, i10));
        }

        @Override // com.applovin.impl.w3
        public w3 a(long j7, long j9) {
            return a(nc.a(j7, j9));
        }

        @Override // com.applovin.impl.w3
        public w3 a(Object obj, Object obj2, Comparator comparator) {
            return a(comparator.compare(obj, obj2));
        }

        @Override // com.applovin.impl.w3
        public w3 a(boolean z8, boolean z9) {
            return a(AbstractC0709i2.a(z8, z9));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends w3 {

        /* renamed from: d, reason: collision with root package name */
        final int f11892d;

        public b(int i9) {
            super(null);
            this.f11892d = i9;
        }

        @Override // com.applovin.impl.w3
        public w3 a(int i9, int i10) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public w3 b(boolean z8, boolean z9) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public int d() {
            return this.f11892d;
        }

        @Override // com.applovin.impl.w3
        public w3 a(long j7, long j9) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public w3 a(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public w3 a(boolean z8, boolean z9) {
            return this;
        }
    }

    private w3() {
    }

    public static w3 e() {
        return f11890a;
    }

    public abstract w3 a(int i9, int i10);

    public abstract w3 a(long j7, long j9);

    public abstract w3 a(Object obj, Object obj2, Comparator comparator);

    public abstract w3 a(boolean z8, boolean z9);

    public abstract w3 b(boolean z8, boolean z9);

    public abstract int d();

    public /* synthetic */ w3(a aVar) {
        this();
    }
}
