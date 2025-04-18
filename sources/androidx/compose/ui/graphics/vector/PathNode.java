package androidx.compose.ui.graphics.vector;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public abstract class PathNode {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15349a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15350b;

    @Immutable
    /* loaded from: classes.dex */
    public static final class ArcTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15351c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f15352f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f15353g;

        /* renamed from: h, reason: collision with root package name */
        public final float f15354h;

        /* renamed from: i, reason: collision with root package name */
        public final float f15355i;

        public ArcTo(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
            super(false, false, 3);
            this.f15351c = f2;
            this.d = f3;
            this.e = f4;
            this.f15352f = z2;
            this.f15353g = z3;
            this.f15354h = f5;
            this.f15355i = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.compare(this.f15351c, arcTo.f15351c) == 0 && Float.compare(this.d, arcTo.d) == 0 && Float.compare(this.e, arcTo.e) == 0 && this.f15352f == arcTo.f15352f && this.f15353g == arcTo.f15353g && Float.compare(this.f15354h, arcTo.f15354h) == 0 && Float.compare(this.f15355i, arcTo.f15355i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15355i) + d.b(this.f15354h, d.g(this.f15353g, d.g(this.f15352f, d.b(this.e, d.b(this.d, Float.hashCode(this.f15351c) * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.f15351c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.d);
            sb.append(", theta=");
            sb.append(this.e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f15352f);
            sb.append(", isPositiveArc=");
            sb.append(this.f15353g);
            sb.append(", arcStartX=");
            sb.append(this.f15354h);
            sb.append(", arcStartY=");
            return d.n(sb, this.f15355i, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class Close extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public static final Close f15356c = new PathNode(false, false, 3);
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class CurveTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15357c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final float f15358f;

        /* renamed from: g, reason: collision with root package name */
        public final float f15359g;

        /* renamed from: h, reason: collision with root package name */
        public final float f15360h;

        public CurveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
            super(true, false, 2);
            this.f15357c = f2;
            this.d = f3;
            this.e = f4;
            this.f15358f = f5;
            this.f15359g = f6;
            this.f15360h = f7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.compare(this.f15357c, curveTo.f15357c) == 0 && Float.compare(this.d, curveTo.d) == 0 && Float.compare(this.e, curveTo.e) == 0 && Float.compare(this.f15358f, curveTo.f15358f) == 0 && Float.compare(this.f15359g, curveTo.f15359g) == 0 && Float.compare(this.f15360h, curveTo.f15360h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15360h) + d.b(this.f15359g, d.b(this.f15358f, d.b(this.e, d.b(this.d, Float.hashCode(this.f15357c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurveTo(x1=");
            sb.append(this.f15357c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            sb.append(this.f15358f);
            sb.append(", x3=");
            sb.append(this.f15359g);
            sb.append(", y3=");
            return d.n(sb, this.f15360h, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class HorizontalTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15361c;

        public HorizontalTo(float f2) {
            super(false, false, 3);
            this.f15361c = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f15361c, ((HorizontalTo) obj).f15361c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15361c);
        }

        public final String toString() {
            return d.n(new StringBuilder("HorizontalTo(x="), this.f15361c, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class LineTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15362c;
        public final float d;

        public LineTo(float f2, float f3) {
            super(false, false, 3);
            this.f15362c = f2;
            this.d = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.compare(this.f15362c, lineTo.f15362c) == 0 && Float.compare(this.d, lineTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.f15362c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LineTo(x=");
            sb.append(this.f15362c);
            sb.append(", y=");
            return d.n(sb, this.d, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class MoveTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15363c;
        public final float d;

        public MoveTo(float f2, float f3) {
            super(false, false, 3);
            this.f15363c = f2;
            this.d = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.compare(this.f15363c, moveTo.f15363c) == 0 && Float.compare(this.d, moveTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.f15363c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.f15363c);
            sb.append(", y=");
            return d.n(sb, this.d, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class QuadTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15364c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final float f15365f;

        public QuadTo(float f2, float f3, float f4, float f5) {
            super(false, true, 1);
            this.f15364c = f2;
            this.d = f3;
            this.e = f4;
            this.f15365f = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.compare(this.f15364c, quadTo.f15364c) == 0 && Float.compare(this.d, quadTo.d) == 0 && Float.compare(this.e, quadTo.e) == 0 && Float.compare(this.f15365f, quadTo.f15365f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15365f) + d.b(this.e, d.b(this.d, Float.hashCode(this.f15364c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuadTo(x1=");
            sb.append(this.f15364c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            return d.n(sb, this.f15365f, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15366c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final float f15367f;

        public ReflectiveCurveTo(float f2, float f3, float f4, float f5) {
            super(true, false, 2);
            this.f15366c = f2;
            this.d = f3;
            this.e = f4;
            this.f15367f = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.compare(this.f15366c, reflectiveCurveTo.f15366c) == 0 && Float.compare(this.d, reflectiveCurveTo.d) == 0 && Float.compare(this.e, reflectiveCurveTo.e) == 0 && Float.compare(this.f15367f, reflectiveCurveTo.f15367f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15367f) + d.b(this.e, d.b(this.d, Float.hashCode(this.f15366c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.f15366c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            return d.n(sb, this.f15367f, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15368c;
        public final float d;

        public ReflectiveQuadTo(float f2, float f3) {
            super(false, true, 1);
            this.f15368c = f2;
            this.d = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.compare(this.f15368c, reflectiveQuadTo.f15368c) == 0 && Float.compare(this.d, reflectiveQuadTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.f15368c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.f15368c);
            sb.append(", y=");
            return d.n(sb, this.d, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeArcTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15369c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f15370f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f15371g;

        /* renamed from: h, reason: collision with root package name */
        public final float f15372h;

        /* renamed from: i, reason: collision with root package name */
        public final float f15373i;

        public RelativeArcTo(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
            super(false, false, 3);
            this.f15369c = f2;
            this.d = f3;
            this.e = f4;
            this.f15370f = z2;
            this.f15371g = z3;
            this.f15372h = f5;
            this.f15373i = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.compare(this.f15369c, relativeArcTo.f15369c) == 0 && Float.compare(this.d, relativeArcTo.d) == 0 && Float.compare(this.e, relativeArcTo.e) == 0 && this.f15370f == relativeArcTo.f15370f && this.f15371g == relativeArcTo.f15371g && Float.compare(this.f15372h, relativeArcTo.f15372h) == 0 && Float.compare(this.f15373i, relativeArcTo.f15373i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15373i) + d.b(this.f15372h, d.g(this.f15371g, d.g(this.f15370f, d.b(this.e, d.b(this.d, Float.hashCode(this.f15369c) * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.f15369c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.d);
            sb.append(", theta=");
            sb.append(this.e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f15370f);
            sb.append(", isPositiveArc=");
            sb.append(this.f15371g);
            sb.append(", arcStartDx=");
            sb.append(this.f15372h);
            sb.append(", arcStartDy=");
            return d.n(sb, this.f15373i, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeCurveTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15374c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final float f15375f;

        /* renamed from: g, reason: collision with root package name */
        public final float f15376g;

        /* renamed from: h, reason: collision with root package name */
        public final float f15377h;

        public RelativeCurveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
            super(true, false, 2);
            this.f15374c = f2;
            this.d = f3;
            this.e = f4;
            this.f15375f = f5;
            this.f15376g = f6;
            this.f15377h = f7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.compare(this.f15374c, relativeCurveTo.f15374c) == 0 && Float.compare(this.d, relativeCurveTo.d) == 0 && Float.compare(this.e, relativeCurveTo.e) == 0 && Float.compare(this.f15375f, relativeCurveTo.f15375f) == 0 && Float.compare(this.f15376g, relativeCurveTo.f15376g) == 0 && Float.compare(this.f15377h, relativeCurveTo.f15377h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15377h) + d.b(this.f15376g, d.b(this.f15375f, d.b(this.e, d.b(this.d, Float.hashCode(this.f15374c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.f15374c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            sb.append(this.f15375f);
            sb.append(", dx3=");
            sb.append(this.f15376g);
            sb.append(", dy3=");
            return d.n(sb, this.f15377h, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeHorizontalTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15378c;

        public RelativeHorizontalTo(float f2) {
            super(false, false, 3);
            this.f15378c = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.f15378c, ((RelativeHorizontalTo) obj).f15378c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15378c);
        }

        public final String toString() {
            return d.n(new StringBuilder("RelativeHorizontalTo(dx="), this.f15378c, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeLineTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15379c;
        public final float d;

        public RelativeLineTo(float f2, float f3) {
            super(false, false, 3);
            this.f15379c = f2;
            this.d = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.compare(this.f15379c, relativeLineTo.f15379c) == 0 && Float.compare(this.d, relativeLineTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.f15379c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
            sb.append(this.f15379c);
            sb.append(", dy=");
            return d.n(sb, this.d, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeMoveTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15380c;
        public final float d;

        public RelativeMoveTo(float f2, float f3) {
            super(false, false, 3);
            this.f15380c = f2;
            this.d = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.compare(this.f15380c, relativeMoveTo.f15380c) == 0 && Float.compare(this.d, relativeMoveTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.f15380c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.f15380c);
            sb.append(", dy=");
            return d.n(sb, this.d, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeQuadTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15381c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final float f15382f;

        public RelativeQuadTo(float f2, float f3, float f4, float f5) {
            super(false, true, 1);
            this.f15381c = f2;
            this.d = f3;
            this.e = f4;
            this.f15382f = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.compare(this.f15381c, relativeQuadTo.f15381c) == 0 && Float.compare(this.d, relativeQuadTo.d) == 0 && Float.compare(this.e, relativeQuadTo.e) == 0 && Float.compare(this.f15382f, relativeQuadTo.f15382f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15382f) + d.b(this.e, d.b(this.d, Float.hashCode(this.f15381c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.f15381c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            return d.n(sb, this.f15382f, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeReflectiveCurveTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15383c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final float f15384f;

        public RelativeReflectiveCurveTo(float f2, float f3, float f4, float f5) {
            super(true, false, 2);
            this.f15383c = f2;
            this.d = f3;
            this.e = f4;
            this.f15384f = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.compare(this.f15383c, relativeReflectiveCurveTo.f15383c) == 0 && Float.compare(this.d, relativeReflectiveCurveTo.d) == 0 && Float.compare(this.e, relativeReflectiveCurveTo.e) == 0 && Float.compare(this.f15384f, relativeReflectiveCurveTo.f15384f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15384f) + d.b(this.e, d.b(this.d, Float.hashCode(this.f15383c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.f15383c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            return d.n(sb, this.f15384f, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeReflectiveQuadTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15385c;
        public final float d;

        public RelativeReflectiveQuadTo(float f2, float f3) {
            super(false, true, 1);
            this.f15385c = f2;
            this.d = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.compare(this.f15385c, relativeReflectiveQuadTo.f15385c) == 0 && Float.compare(this.d, relativeReflectiveQuadTo.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.f15385c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.f15385c);
            sb.append(", dy=");
            return d.n(sb, this.d, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeVerticalTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15386c;

        public RelativeVerticalTo(float f2) {
            super(false, false, 3);
            this.f15386c = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.f15386c, ((RelativeVerticalTo) obj).f15386c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15386c);
        }

        public final String toString() {
            return d.n(new StringBuilder("RelativeVerticalTo(dy="), this.f15386c, ')');
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class VerticalTo extends PathNode {

        /* renamed from: c, reason: collision with root package name */
        public final float f15387c;

        public VerticalTo(float f2) {
            super(false, false, 3);
            this.f15387c = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f15387c, ((VerticalTo) obj).f15387c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f15387c);
        }

        public final String toString() {
            return d.n(new StringBuilder("VerticalTo(y="), this.f15387c, ')');
        }
    }

    public PathNode(boolean z2, boolean z3, int i2) {
        z2 = (i2 & 1) != 0 ? false : z2;
        z3 = (i2 & 2) != 0 ? false : z3;
        this.f15349a = z2;
        this.f15350b = z3;
    }
}
