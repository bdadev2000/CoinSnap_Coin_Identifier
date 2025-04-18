package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;

/* loaded from: classes3.dex */
public interface Path {

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Direction {

        /* renamed from: a, reason: collision with root package name */
        public static final Direction f15004a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f15005b;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.graphics.Path$Direction] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.graphics.Path$Direction] */
        static {
            ?? r02 = new Enum("CounterClockwise", 0);
            f15004a = r02;
            f15005b = new Direction[]{r02, new Enum("Clockwise", 1)};
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f15005b.clone();
        }
    }

    boolean a();

    Rect b();

    void c(float f2, float f3);

    void close();

    void d(float f2, float f3, float f4, float f5, float f6, float f7);

    void e(float f2, float f3, float f4, float f5);

    void f(float f2, float f3, float f4, float f5);

    void g(int i2);

    default void h(float f2, float f3, float f4, float f5) {
        e(f2, f3, f4, f5);
    }

    void i(Rect rect, Direction direction);

    boolean isEmpty();

    default void j() {
        reset();
    }

    void k(long j2);

    default void l(float f2, float f3, float f4, float f5) {
        f(f2, f3, f4, f5);
    }

    int m();

    void n(float f2, float f3);

    void o(float f2, float f3, float f4, float f5, float f6, float f7);

    boolean q(Path path, Path path2, int i2);

    void r(float f2, float f3);

    void reset();

    void t(Path path, long j2);

    void u(float f2, float f3);

    void v(RoundRect roundRect, Direction direction);
}
