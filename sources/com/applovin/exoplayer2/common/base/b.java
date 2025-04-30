package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0008b f6166a = EnumC0008b.NOT_READY;
    private Object b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6167a;

        static {
            int[] iArr = new int[EnumC0008b.values().length];
            f6167a = iArr;
            try {
                iArr[EnumC0008b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6167a[EnumC0008b.DONE.ordinal()] = 2;
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
        this.f6166a = EnumC0008b.FAILED;
        this.b = a();
        if (this.f6166a != EnumC0008b.DONE) {
            this.f6166a = EnumC0008b.READY;
            return true;
        }
        return false;
    }

    public abstract Object a();

    public final Object b() {
        this.f6166a = EnumC0008b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z8;
        if (this.f6166a != EnumC0008b.FAILED) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkState(z8);
        int i9 = a.f6167a[this.f6166a.ordinal()];
        if (i9 == 1) {
            return true;
        }
        if (i9 == 2) {
            return false;
        }
        return c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f6166a = EnumC0008b.NOT_READY;
            Object obj = this.b;
            this.b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
