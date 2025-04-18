package androidx.graphics.path;

import android.graphics.PointF;
import android.support.v4.media.d;
import java.util.Arrays;
import p0.a;

/* loaded from: classes4.dex */
public final class PathSegment {

    /* renamed from: a, reason: collision with root package name */
    public final Type f19918a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF[] f19919b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19920c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final Type f19921a;

        /* renamed from: b, reason: collision with root package name */
        public static final Type f19922b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f19923c;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.graphics.path.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.graphics.path.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.graphics.path.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.graphics.path.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.graphics.path.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.graphics.path.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.graphics.path.PathSegment$Type] */
        static {
            ?? r02 = new Enum("Move", 0);
            ?? r1 = new Enum("Line", 1);
            ?? r2 = new Enum("Quadratic", 2);
            ?? r3 = new Enum("Conic", 3);
            ?? r4 = new Enum("Cubic", 4);
            ?? r5 = new Enum("Close", 5);
            f19921a = r5;
            ?? r6 = new Enum("Done", 6);
            f19922b = r6;
            f19923c = new Type[]{r02, r1, r2, r3, r4, r5, r6};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f19923c.clone();
        }
    }

    public PathSegment(Type type, PointF[] pointFArr, float f2) {
        this.f19918a = type;
        this.f19919b = pointFArr;
        this.f19920c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.g(PathSegment.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        a.q(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        PathSegment pathSegment = (PathSegment) obj;
        return this.f19918a == pathSegment.f19918a && Arrays.equals(this.f19919b, pathSegment.f19919b) && this.f19920c == pathSegment.f19920c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19920c) + (((this.f19918a.hashCode() * 31) + Arrays.hashCode(this.f19919b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.f19918a);
        sb.append(", points=");
        String arrays = Arrays.toString(this.f19919b);
        a.r(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", weight=");
        return d.n(sb, this.f19920c, ')');
    }
}
