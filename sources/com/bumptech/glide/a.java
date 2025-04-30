package com.bumptech.glide;

import h2.C2316a;
import j2.n;

/* loaded from: classes.dex */
public final class a implements Cloneable {
    public C2316a b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof a) {
            return n.b(this.b, ((a) obj).b);
        }
        return false;
    }

    public final int c() {
        C2316a c2316a = this.b;
        if (c2316a != null) {
            return c2316a.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && b(obj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c();
    }
}
