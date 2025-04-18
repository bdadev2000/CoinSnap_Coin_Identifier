package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.common.net.HttpHeaders;
import q0.l;

/* loaded from: classes2.dex */
final class MeasuringIntrinsics {

    /* loaded from: classes2.dex */
    public static final class DefaultIntrinsicMeasurable implements Measurable {

        /* renamed from: a, reason: collision with root package name */
        public final IntrinsicMeasurable f15805a;

        /* renamed from: b, reason: collision with root package name */
        public final IntrinsicMinMax f15806b;

        /* renamed from: c, reason: collision with root package name */
        public final IntrinsicWidthHeight f15807c;

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.f15805a = intrinsicMeasurable;
            this.f15806b = intrinsicMinMax;
            this.f15807c = intrinsicWidthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int K(int i2) {
            return this.f15805a.K(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int R(int i2) {
            return this.f15805a.R(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int S(int i2) {
            return this.f15805a.S(i2);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public final Placeable V(long j2) {
            IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.f15811a;
            IntrinsicMinMax intrinsicMinMax = IntrinsicMinMax.f15809b;
            IntrinsicMinMax intrinsicMinMax2 = this.f15806b;
            IntrinsicMeasurable intrinsicMeasurable = this.f15805a;
            if (this.f15807c == intrinsicWidthHeight) {
                return new EmptyPlaceable(intrinsicMinMax2 == intrinsicMinMax ? intrinsicMeasurable.S(Constraints.h(j2)) : intrinsicMeasurable.R(Constraints.h(j2)), Constraints.d(j2) ? Constraints.h(j2) : 32767);
            }
            return new EmptyPlaceable(Constraints.e(j2) ? Constraints.i(j2) : 32767, intrinsicMinMax2 == intrinsicMinMax ? intrinsicMeasurable.s(Constraints.i(j2)) : intrinsicMeasurable.K(Constraints.i(j2)));
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final Object m() {
            return this.f15805a.m();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int s(int i2) {
            return this.f15805a.s(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int i2, int i3) {
            o0(IntSizeKt.a(i2, i3));
        }

        @Override // androidx.compose.ui.layout.Measured
        public final int Z(AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final void n0(long j2, float f2, l lVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class IntrinsicMinMax {

        /* renamed from: a, reason: collision with root package name */
        public static final IntrinsicMinMax f15808a;

        /* renamed from: b, reason: collision with root package name */
        public static final IntrinsicMinMax f15809b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ IntrinsicMinMax[] f15810c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.layout.MeasuringIntrinsics$IntrinsicMinMax] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.layout.MeasuringIntrinsics$IntrinsicMinMax] */
        static {
            ?? r02 = new Enum("Min", 0);
            f15808a = r02;
            ?? r1 = new Enum("Max", 1);
            f15809b = r1;
            f15810c = new IntrinsicMinMax[]{r02, r1};
        }

        public static IntrinsicMinMax valueOf(String str) {
            return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
        }

        public static IntrinsicMinMax[] values() {
            return (IntrinsicMinMax[]) f15810c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class IntrinsicWidthHeight {

        /* renamed from: a, reason: collision with root package name */
        public static final IntrinsicWidthHeight f15811a;

        /* renamed from: b, reason: collision with root package name */
        public static final IntrinsicWidthHeight f15812b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ IntrinsicWidthHeight[] f15813c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.layout.MeasuringIntrinsics$IntrinsicWidthHeight, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.layout.MeasuringIntrinsics$IntrinsicWidthHeight, java.lang.Enum] */
        static {
            ?? r02 = new Enum(HttpHeaders.WIDTH, 0);
            f15811a = r02;
            ?? r1 = new Enum("Height", 1);
            f15812b = r1;
            f15813c = new IntrinsicWidthHeight[]{r02, r1};
        }

        public static IntrinsicWidthHeight valueOf(String str) {
            return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
        }

        public static IntrinsicWidthHeight[] values() {
            return (IntrinsicWidthHeight[]) f15813c.clone();
        }
    }
}
