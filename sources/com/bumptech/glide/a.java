package com.bumptech.glide;

/* loaded from: classes.dex */
public final class a implements Cloneable {
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof a) {
            z1.d dVar = a6.c.f252d;
            ((a) obj).getClass();
            return w4.m.b(dVar, dVar);
        }
        return false;
    }

    public final int c() {
        return a6.c.f252d.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b(obj);
    }

    public final int hashCode() {
        return c();
    }
}
