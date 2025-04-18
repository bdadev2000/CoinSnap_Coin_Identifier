package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;

/* loaded from: classes3.dex */
public interface LayoutCoordinates {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    boolean B();

    long D(long j2);

    default void E(LayoutCoordinates layoutCoordinates, float[] fArr) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    long M(long j2);

    default void P(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    Rect Q(LayoutCoordinates layoutCoordinates, boolean z2);

    default long U(LayoutCoordinates layoutCoordinates, long j2) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    long a();

    LayoutCoordinates a0();

    long e0(long j2);

    default long n(long j2) {
        return 9205357640488583168L;
    }

    long v(LayoutCoordinates layoutCoordinates, long j2);

    LayoutCoordinates z();
}
