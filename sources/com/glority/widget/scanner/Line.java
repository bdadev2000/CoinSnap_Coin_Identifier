package com.glority.widget.scanner;

import android.graphics.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Line.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003J\u0016\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019J&\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003J\u000e\u0010#\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0006\u0010&\u001a\u00020\u0016J\u0006\u0010'\u001a\u00020\u0016J\u0006\u0010(\u001a\u00020\u0016J\r\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010+J\t\u0010,\u001a\u00020-HÖ\u0001J\u000e\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0003J\u0016\u00100\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u00062"}, d2 = {"Lcom/glority/widget/scanner/Line;", "", "a", "", "b", "c", "(III)V", "getA", "()I", "setA", "(I)V", "getB", "setB", "getC", "setC", "component1", "component2", "component3", "copy", "empty", "", "equals", "", "other", "footPoint", "Landroid/graphics/Point;", "x", "y", "from", "point1", "point2", "x1", "y1", "x2", "y2", "getX", "getY", "hashCode", "isEmpty", "isNotEmpty", "isSlopExist", "slop", "", "()Ljava/lang/Float;", "toString", "", "translate", "d", "value", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final /* data */ class Line {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Line EMPTY = new Line(0, 0, 0, 7, null);
    private int a;
    private int b;
    private int c;

    public Line() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ Line copy$default(Line line, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = line.a;
        }
        if ((i4 & 2) != 0) {
            i2 = line.b;
        }
        if ((i4 & 4) != 0) {
            i3 = line.c;
        }
        return line.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getA() {
        return this.a;
    }

    /* renamed from: component2, reason: from getter */
    public final int getB() {
        return this.b;
    }

    /* renamed from: component3, reason: from getter */
    public final int getC() {
        return this.c;
    }

    public final Line copy(int a2, int b, int c) {
        return new Line(a2, b, c);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Line)) {
            return false;
        }
        Line line = (Line) other;
        return this.a == line.a && this.b == line.b && this.c == line.c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "Line(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ")";
    }

    public Line(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public /* synthetic */ Line(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getA() {
        return this.a;
    }

    public final int getB() {
        return this.b;
    }

    public final int getC() {
        return this.c;
    }

    public final void setA(int i) {
        this.a = i;
    }

    public final void setB(int i) {
        this.b = i;
    }

    public final void setC(int i) {
        this.c = i;
    }

    public final int getY(int x) {
        int i = this.b;
        if (i == 0) {
            return 0;
        }
        return (int) (((-this.c) - (this.a * x)) / i);
    }

    public final int getX(int y) {
        int i = this.a;
        if (i == 0) {
            return 0;
        }
        return (int) (((-this.c) - (this.b * y)) / i);
    }

    public final int value(int x, int y) {
        return (int) ((this.a * x) + (this.b * y) + this.c);
    }

    public final void from(int x1, int y1, int x2, int y2) {
        int i = y2 - y1;
        this.a = i;
        this.b = x1 - x2;
        this.c = (int) ((y1 * (x2 - x1)) - (x1 * i));
    }

    public final void from(Point point1, Point point2) {
        Intrinsics.checkNotNullParameter(point1, "point1");
        Intrinsics.checkNotNullParameter(point2, "point2");
        from(point1.x, point1.y, point2.x, point2.y);
    }

    public final Point footPoint(int x, int y) {
        int i = this.a;
        long j = i * i;
        int i2 = this.b;
        long j2 = j + (i2 * i2);
        if (j2 == 0) {
            return null;
        }
        int i3 = this.b;
        long j3 = i3 * i3;
        long j4 = x;
        int i4 = this.a;
        long j5 = i4 * i3;
        long j6 = y;
        int i5 = this.c;
        return new Point((int) ((((j3 * j4) - (j5 * j6)) - (i4 * i5)) / j2), (int) (((((i4 * i4) * j6) - ((i4 * i3) * j4)) - (i3 * i5)) / j2));
    }

    public final void translate(int d) {
        int i = this.c;
        int i2 = this.a;
        long j = i2 * i2;
        int i3 = this.b;
        this.c = i + (d * ((int) Math.sqrt(j + (i3 * i3))));
    }

    public final void empty() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public final boolean isEmpty() {
        return this.a == 0 || this.b == 0;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final boolean isSlopExist() {
        return this.b != 0;
    }

    public final Float slop() {
        int i = this.b;
        if (i == 0) {
            return null;
        }
        return Float.valueOf((-this.a) / i);
    }

    /* compiled from: Line.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/widget/scanner/Line$Companion;", "", "()V", "EMPTY", "Lcom/glority/widget/scanner/Line;", "getEMPTY", "()Lcom/glority/widget/scanner/Line;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Line getEMPTY() {
            return Line.EMPTY;
        }
    }
}
