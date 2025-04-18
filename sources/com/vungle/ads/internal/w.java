package com.vungle.ads.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w {
    private y downCoordinate;
    private y upCoordinate;

    public w(y downCoordinate, y upCoordinate) {
        Intrinsics.checkNotNullParameter(downCoordinate, "downCoordinate");
        Intrinsics.checkNotNullParameter(upCoordinate, "upCoordinate");
        this.downCoordinate = downCoordinate;
        this.upCoordinate = upCoordinate;
    }

    public static /* synthetic */ w copy$default(w wVar, y yVar, y yVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            yVar = wVar.downCoordinate;
        }
        if ((i10 & 2) != 0) {
            yVar2 = wVar.upCoordinate;
        }
        return wVar.copy(yVar, yVar2);
    }

    public final y component1() {
        return this.downCoordinate;
    }

    public final y component2() {
        return this.upCoordinate;
    }

    public final w copy(y downCoordinate, y upCoordinate) {
        Intrinsics.checkNotNullParameter(downCoordinate, "downCoordinate");
        Intrinsics.checkNotNullParameter(upCoordinate, "upCoordinate");
        return new w(downCoordinate, upCoordinate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.downCoordinate, wVar.downCoordinate) && Intrinsics.areEqual(this.upCoordinate, wVar.upCoordinate);
    }

    public final y getDownCoordinate() {
        return this.downCoordinate;
    }

    public final y getUpCoordinate() {
        return this.upCoordinate;
    }

    public int hashCode() {
        return this.upCoordinate.hashCode() + (this.downCoordinate.hashCode() * 31);
    }

    public final boolean ready() {
        return (this.downCoordinate.getX() == Integer.MIN_VALUE || this.downCoordinate.getY() == Integer.MIN_VALUE || this.upCoordinate.getX() == Integer.MIN_VALUE || this.upCoordinate.getY() == Integer.MIN_VALUE) ? false : true;
    }

    public final void setDownCoordinate(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<set-?>");
        this.downCoordinate = yVar;
    }

    public final void setUpCoordinate(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<set-?>");
        this.upCoordinate = yVar;
    }

    public String toString() {
        return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ')';
    }
}
