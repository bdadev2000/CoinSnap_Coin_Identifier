package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0069b f22509a = EnumC0069b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private Object f22510b;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22511a;

        static {
            int[] iArr = new int[EnumC0069b.values().length];
            f22511a = iArr;
            try {
                iArr[EnumC0069b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22511a[EnumC0069b.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0069b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.f22509a = EnumC0069b.FAILED;
        this.f22510b = a();
        if (this.f22509a == EnumC0069b.DONE) {
            return false;
        }
        this.f22509a = EnumC0069b.READY;
        return true;
    }

    public abstract Object a();

    public final Object b() {
        this.f22509a = EnumC0069b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f22509a != EnumC0069b.FAILED);
        int i2 = a.f22511a[this.f22509a.ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f22509a = EnumC0069b.NOT_READY;
        Object obj = this.f22510b;
        this.f22510b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
