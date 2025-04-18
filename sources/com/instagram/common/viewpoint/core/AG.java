package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class AG {
    public static final AG A01 = new AG(0);
    public final int A00;

    public AG(int i2) {
        this.A00 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((AG) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }
}
