package com.google.common.collect;

/* loaded from: classes3.dex */
public final class l1 extends a {

    /* renamed from: g, reason: collision with root package name */
    public static final l1 f11996g = new l1(new Object[0]);

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f11997d;

    /* renamed from: f, reason: collision with root package name */
    public final int f11998f;

    public l1(Object[] objArr) {
        super(0, 0);
        this.f11997d = objArr;
        this.f11998f = 0;
    }

    @Override // com.google.common.collect.a
    public final Object b(int i10) {
        return this.f11997d[this.f11998f + i10];
    }
}
