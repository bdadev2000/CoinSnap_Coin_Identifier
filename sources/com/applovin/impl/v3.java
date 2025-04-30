package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v3 extends tg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f11665a;

    public v3(Comparator comparator) {
        this.f11665a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.applovin.impl.tg, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f11665a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v3) {
            return this.f11665a.equals(((v3) obj).f11665a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11665a.hashCode();
    }

    public String toString() {
        return this.f11665a.toString();
    }
}
