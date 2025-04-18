package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class b implements Iterator {
    private EnumC0008b a = EnumC0008b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private Object f3420b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0008b.values().length];
            a = iArr;
            try {
                iArr[EnumC0008b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0008b.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0008b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.a = EnumC0008b.FAILED;
        this.f3420b = a();
        if (this.a != EnumC0008b.DONE) {
            this.a = EnumC0008b.READY;
            return true;
        }
        return false;
    }

    public abstract Object a();

    public final Object b() {
        this.a = EnumC0008b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        if (this.a != EnumC0008b.FAILED) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10);
        int i10 = a.a[this.a.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        return c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = EnumC0008b.NOT_READY;
            Object obj = this.f3420b;
            this.f3420b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
