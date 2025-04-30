package com.applovin.impl;

/* loaded from: classes.dex */
public final class ni {
    public static final ni b = new ni(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9352a;

    public ni(boolean z8) {
        this.f9352a = z8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ni.class == obj.getClass() && this.f9352a == ((ni) obj).f9352a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return !this.f9352a ? 1 : 0;
    }
}
