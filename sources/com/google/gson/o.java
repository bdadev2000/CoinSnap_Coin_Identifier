package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o extends p implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12121b = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).f12121b.equals(this.f12121b));
    }

    public final int hashCode() {
        return this.f12121b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f12121b.iterator();
    }
}
