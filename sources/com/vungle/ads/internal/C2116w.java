package com.vungle.ads.internal;

/* renamed from: com.vungle.ads.internal.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2116w {
    private C2118y downCoordinate;
    private C2118y upCoordinate;

    public C2116w(C2118y c2118y, C2118y c2118y2) {
        G7.j.e(c2118y, "downCoordinate");
        G7.j.e(c2118y2, "upCoordinate");
        this.downCoordinate = c2118y;
        this.upCoordinate = c2118y2;
    }

    public static /* synthetic */ C2116w copy$default(C2116w c2116w, C2118y c2118y, C2118y c2118y2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            c2118y = c2116w.downCoordinate;
        }
        if ((i9 & 2) != 0) {
            c2118y2 = c2116w.upCoordinate;
        }
        return c2116w.copy(c2118y, c2118y2);
    }

    public final C2118y component1() {
        return this.downCoordinate;
    }

    public final C2118y component2() {
        return this.upCoordinate;
    }

    public final C2116w copy(C2118y c2118y, C2118y c2118y2) {
        G7.j.e(c2118y, "downCoordinate");
        G7.j.e(c2118y2, "upCoordinate");
        return new C2116w(c2118y, c2118y2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2116w)) {
            return false;
        }
        C2116w c2116w = (C2116w) obj;
        return G7.j.a(this.downCoordinate, c2116w.downCoordinate) && G7.j.a(this.upCoordinate, c2116w.upCoordinate);
    }

    public final C2118y getDownCoordinate() {
        return this.downCoordinate;
    }

    public final C2118y getUpCoordinate() {
        return this.upCoordinate;
    }

    public int hashCode() {
        return this.upCoordinate.hashCode() + (this.downCoordinate.hashCode() * 31);
    }

    public final boolean ready() {
        if (this.downCoordinate.getX() != Integer.MIN_VALUE && this.downCoordinate.getY() != Integer.MIN_VALUE && this.upCoordinate.getX() != Integer.MIN_VALUE && this.upCoordinate.getY() != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void setDownCoordinate(C2118y c2118y) {
        G7.j.e(c2118y, "<set-?>");
        this.downCoordinate = c2118y;
    }

    public final void setUpCoordinate(C2118y c2118y) {
        G7.j.e(c2118y, "<set-?>");
        this.upCoordinate = c2118y;
    }

    public String toString() {
        return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ')';
    }
}
