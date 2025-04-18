package com.vungle.ads.internal;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: x, reason: collision with root package name */
    private final int f16761x;

    /* renamed from: y, reason: collision with root package name */
    private final int f16762y;

    public y(int i10, int i11) {
        this.f16761x = i10;
        this.f16762y = i11;
    }

    public static /* synthetic */ y copy$default(y yVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = yVar.f16761x;
        }
        if ((i12 & 2) != 0) {
            i11 = yVar.f16762y;
        }
        return yVar.copy(i10, i11);
    }

    public final int component1() {
        return this.f16761x;
    }

    public final int component2() {
        return this.f16762y;
    }

    public final y copy(int i10, int i11) {
        return new y(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f16761x == yVar.f16761x && this.f16762y == yVar.f16762y;
    }

    public final int getX() {
        return this.f16761x;
    }

    public final int getY() {
        return this.f16762y;
    }

    public int hashCode() {
        return Integer.hashCode(this.f16762y) + (Integer.hashCode(this.f16761x) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Coordinate(x=");
        sb2.append(this.f16761x);
        sb2.append(", y=");
        return a4.j.i(sb2, this.f16762y, ')');
    }
}
