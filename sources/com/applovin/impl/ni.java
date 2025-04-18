package com.applovin.impl;

/* loaded from: classes.dex */
public final class ni {

    /* renamed from: b, reason: collision with root package name */
    public static final ni f6416b = new ni(false);
    public final boolean a;

    public ni(boolean z10) {
        this.a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ni.class == obj.getClass() && this.a == ((ni) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return !this.a ? 1 : 0;
    }
}
