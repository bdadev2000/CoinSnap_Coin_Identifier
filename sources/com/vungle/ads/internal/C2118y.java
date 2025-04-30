package com.vungle.ads.internal;

/* renamed from: com.vungle.ads.internal.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2118y {

    /* renamed from: x, reason: collision with root package name */
    private final int f19766x;

    /* renamed from: y, reason: collision with root package name */
    private final int f19767y;

    public C2118y(int i9, int i10) {
        this.f19766x = i9;
        this.f19767y = i10;
    }

    public static /* synthetic */ C2118y copy$default(C2118y c2118y, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = c2118y.f19766x;
        }
        if ((i11 & 2) != 0) {
            i10 = c2118y.f19767y;
        }
        return c2118y.copy(i9, i10);
    }

    public final int component1() {
        return this.f19766x;
    }

    public final int component2() {
        return this.f19767y;
    }

    public final C2118y copy(int i9, int i10) {
        return new C2118y(i9, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2118y)) {
            return false;
        }
        C2118y c2118y = (C2118y) obj;
        return this.f19766x == c2118y.f19766x && this.f19767y == c2118y.f19767y;
    }

    public final int getX() {
        return this.f19766x;
    }

    public final int getY() {
        return this.f19767y;
    }

    public int hashCode() {
        return Integer.hashCode(this.f19767y) + (Integer.hashCode(this.f19766x) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Coordinate(x=");
        sb.append(this.f19766x);
        sb.append(", y=");
        return com.mbridge.msdk.foundation.entity.o.l(sb, this.f19767y, ')');
    }
}
