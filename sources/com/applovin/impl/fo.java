package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fo {

    /* renamed from: a, reason: collision with root package name */
    private long[] f7742a;
    private Object[] b;

    /* renamed from: c, reason: collision with root package name */
    private int f7743c;

    /* renamed from: d, reason: collision with root package name */
    private int f7744d;

    public fo() {
        this(10);
    }

    private void b(long j7, Object obj) {
        int i9 = this.f7743c;
        int i10 = this.f7744d;
        Object[] objArr = this.b;
        int length = (i9 + i10) % objArr.length;
        this.f7742a[length] = j7;
        objArr[length] = obj;
        this.f7744d = i10 + 1;
    }

    private Object d() {
        boolean z8;
        if (this.f7744d > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        Object[] objArr = this.b;
        int i9 = this.f7743c;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.f7743c = (i9 + 1) % objArr.length;
        this.f7744d--;
        return obj;
    }

    public synchronized void a(long j7, Object obj) {
        a(j7);
        b();
        b(j7, obj);
    }

    public synchronized Object c() {
        return this.f7744d == 0 ? null : d();
    }

    public synchronized int e() {
        return this.f7744d;
    }

    public fo(int i9) {
        this.f7742a = new long[i9];
        this.b = a(i9);
    }

    public synchronized Object c(long j7) {
        return a(j7, true);
    }

    public synchronized void a() {
        this.f7743c = 0;
        this.f7744d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    private void b() {
        int length = this.b.length;
        if (this.f7744d < length) {
            return;
        }
        int i9 = length * 2;
        long[] jArr = new long[i9];
        Object[] a6 = a(i9);
        int i10 = this.f7743c;
        int i11 = length - i10;
        System.arraycopy(this.f7742a, i10, jArr, 0, i11);
        System.arraycopy(this.b, this.f7743c, a6, 0, i11);
        int i12 = this.f7743c;
        if (i12 > 0) {
            System.arraycopy(this.f7742a, 0, jArr, i11, i12);
            System.arraycopy(this.b, 0, a6, i11, this.f7743c);
        }
        this.f7742a = jArr;
        this.b = a6;
        this.f7743c = 0;
    }

    private void a(long j7) {
        if (this.f7744d > 0) {
            if (j7 <= this.f7742a[((this.f7743c + r0) - 1) % this.b.length]) {
                a();
            }
        }
    }

    private static Object[] a(int i9) {
        return new Object[i9];
    }

    private Object a(long j7, boolean z8) {
        Object obj = null;
        long j9 = Long.MAX_VALUE;
        while (this.f7744d > 0) {
            long j10 = j7 - this.f7742a[this.f7743c];
            if (j10 < 0 && (z8 || (-j10) >= j9)) {
                break;
            }
            obj = d();
            j9 = j10;
        }
        return obj;
    }

    public synchronized Object b(long j7) {
        return a(j7, false);
    }
}
