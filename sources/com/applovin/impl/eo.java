package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class eo {

    /* renamed from: a, reason: collision with root package name */
    private long[] f23737a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f23738b;

    /* renamed from: c, reason: collision with root package name */
    private int f23739c;
    private int d;

    public eo() {
        this(10);
    }

    private void b(long j2, Object obj) {
        int i2 = this.f23739c;
        int i3 = this.d;
        Object[] objArr = this.f23738b;
        int length = (i2 + i3) % objArr.length;
        this.f23737a[length] = j2;
        objArr[length] = obj;
        this.d = i3 + 1;
    }

    private Object d() {
        b1.b(this.d > 0);
        Object[] objArr = this.f23738b;
        int i2 = this.f23739c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f23739c = (i2 + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public synchronized void a(long j2, Object obj) {
        a(j2);
        b();
        b(j2, obj);
    }

    public synchronized Object c() {
        return this.d == 0 ? null : d();
    }

    public synchronized int e() {
        return this.d;
    }

    public eo(int i2) {
        this.f23737a = new long[i2];
        this.f23738b = a(i2);
    }

    public synchronized Object c(long j2) {
        return a(j2, true);
    }

    private void b() {
        int length = this.f23738b.length;
        if (this.d < length) {
            return;
        }
        int i2 = length * 2;
        long[] jArr = new long[i2];
        Object[] a2 = a(i2);
        int i3 = this.f23739c;
        int i4 = length - i3;
        System.arraycopy(this.f23737a, i3, jArr, 0, i4);
        System.arraycopy(this.f23738b, this.f23739c, a2, 0, i4);
        int i5 = this.f23739c;
        if (i5 > 0) {
            System.arraycopy(this.f23737a, 0, jArr, i4, i5);
            System.arraycopy(this.f23738b, 0, a2, i4, this.f23739c);
        }
        this.f23737a = jArr;
        this.f23738b = a2;
        this.f23739c = 0;
    }

    public synchronized void a() {
        this.f23739c = 0;
        this.d = 0;
        Arrays.fill(this.f23738b, (Object) null);
    }

    private void a(long j2) {
        if (this.d > 0) {
            if (j2 <= this.f23737a[((this.f23739c + r0) - 1) % this.f23738b.length]) {
                a();
            }
        }
    }

    private static Object[] a(int i2) {
        return new Object[i2];
    }

    private Object a(long j2, boolean z2) {
        Object obj = null;
        long j3 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j4 = j2 - this.f23737a[this.f23739c];
            if (j4 < 0 && (z2 || (-j4) >= j3)) {
                break;
            }
            obj = d();
            j3 = j4;
        }
        return obj;
    }

    public synchronized Object b(long j2) {
        return a(j2, false);
    }
}
