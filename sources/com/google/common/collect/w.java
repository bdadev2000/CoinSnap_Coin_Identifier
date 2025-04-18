package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class w extends y1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ra.g f12046b;

    /* renamed from: c, reason: collision with root package name */
    public final y1 f12047c;

    public w(q1 q1Var, y1 y1Var) {
        this.f12046b = q1Var;
        this.f12047c = y1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ra.g gVar = this.f12046b;
        return this.f12047c.compare(gVar.apply(obj), gVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f12046b.equals(wVar.f12046b) && this.f12047c.equals(wVar.f12047c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12046b, this.f12047c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12047c);
        String valueOf2 = String.valueOf(this.f12046b);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 13);
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
