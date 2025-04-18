package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends qp {
    private b a = b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private Object f4162b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.a = b.FAILED;
        this.f4162b = a();
        if (this.a != b.DONE) {
            this.a = b.READY;
            return true;
        }
        return false;
    }

    public abstract Object a();

    public final Object b() {
        this.a = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        if (this.a != b.FAILED) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10);
        int i10 = a.a[this.a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        return c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = b.NOT_READY;
            Object obj = this.f4162b;
            this.f4162b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
