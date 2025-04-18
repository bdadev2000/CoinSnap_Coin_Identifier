package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fo {
    private long[] a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f4784b;

    /* renamed from: c, reason: collision with root package name */
    private int f4785c;

    /* renamed from: d, reason: collision with root package name */
    private int f4786d;

    public fo() {
        this(10);
    }

    private void b(long j3, Object obj) {
        int i10 = this.f4785c;
        int i11 = this.f4786d;
        Object[] objArr = this.f4784b;
        int length = (i10 + i11) % objArr.length;
        this.a[length] = j3;
        objArr[length] = obj;
        this.f4786d = i11 + 1;
    }

    private Object d() {
        boolean z10;
        if (this.f4786d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        Object[] objArr = this.f4784b;
        int i10 = this.f4785c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f4785c = (i10 + 1) % objArr.length;
        this.f4786d--;
        return obj;
    }

    public synchronized void a(long j3, Object obj) {
        a(j3);
        b();
        b(j3, obj);
    }

    public synchronized Object c() {
        return this.f4786d == 0 ? null : d();
    }

    public synchronized int e() {
        return this.f4786d;
    }

    public fo(int i10) {
        this.a = new long[i10];
        this.f4784b = a(i10);
    }

    public synchronized Object c(long j3) {
        return a(j3, true);
    }

    public synchronized void a() {
        this.f4785c = 0;
        this.f4786d = 0;
        Arrays.fill(this.f4784b, (Object) null);
    }

    private void b() {
        int length = this.f4784b.length;
        if (this.f4786d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] a = a(i10);
        int i11 = this.f4785c;
        int i12 = length - i11;
        System.arraycopy(this.a, i11, jArr, 0, i12);
        System.arraycopy(this.f4784b, this.f4785c, a, 0, i12);
        int i13 = this.f4785c;
        if (i13 > 0) {
            System.arraycopy(this.a, 0, jArr, i12, i13);
            System.arraycopy(this.f4784b, 0, a, i12, this.f4785c);
        }
        this.a = jArr;
        this.f4784b = a;
        this.f4785c = 0;
    }

    private void a(long j3) {
        if (this.f4786d > 0) {
            if (j3 <= this.a[((this.f4785c + r0) - 1) % this.f4784b.length]) {
                a();
            }
        }
    }

    private static Object[] a(int i10) {
        return new Object[i10];
    }

    private Object a(long j3, boolean z10) {
        Object obj = null;
        long j10 = Long.MAX_VALUE;
        while (this.f4786d > 0) {
            long j11 = j3 - this.a[this.f4785c];
            if (j11 < 0 && (z10 || (-j11) >= j10)) {
                break;
            }
            obj = d();
            j10 = j11;
        }
        return obj;
    }

    public synchronized Object b(long j3) {
        return a(j3, false);
    }
}
