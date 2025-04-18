package com.applovin.impl;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class w3 {
    private static final w3 a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final w3 f8677b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final w3 f8678c = new b(1);

    /* loaded from: classes.dex */
    public class a extends w3 {
        public a() {
            super(null);
        }

        public w3 a(int i10) {
            if (i10 < 0) {
                return w3.f8677b;
            }
            return i10 > 0 ? w3.f8678c : w3.a;
        }

        @Override // com.applovin.impl.w3
        public w3 b(boolean z10, boolean z11) {
            return a(i2.a(z11, z10));
        }

        @Override // com.applovin.impl.w3
        public int d() {
            return 0;
        }

        @Override // com.applovin.impl.w3
        public w3 a(int i10, int i11) {
            return a(pb.a(i10, i11));
        }

        @Override // com.applovin.impl.w3
        public w3 a(long j3, long j10) {
            return a(nc.a(j3, j10));
        }

        @Override // com.applovin.impl.w3
        public w3 a(Object obj, Object obj2, Comparator comparator) {
            return a(comparator.compare(obj, obj2));
        }

        @Override // com.applovin.impl.w3
        public w3 a(boolean z10, boolean z11) {
            return a(i2.a(z10, z11));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends w3 {

        /* renamed from: d, reason: collision with root package name */
        final int f8679d;

        public b(int i10) {
            super(null);
            this.f8679d = i10;
        }

        @Override // com.applovin.impl.w3
        public w3 a(int i10, int i11) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public w3 b(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public int d() {
            return this.f8679d;
        }

        @Override // com.applovin.impl.w3
        public w3 a(long j3, long j10) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public w3 a(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public w3 a(boolean z10, boolean z11) {
            return this;
        }
    }

    private w3() {
    }

    public /* synthetic */ w3(a aVar) {
        this();
    }

    public static w3 e() {
        return a;
    }

    public abstract w3 a(int i10, int i11);

    public abstract w3 a(long j3, long j10);

    public abstract w3 a(Object obj, Object obj2, Comparator comparator);

    public abstract w3 a(boolean z10, boolean z11);

    public abstract w3 b(boolean z10, boolean z11);

    public abstract int d();
}
