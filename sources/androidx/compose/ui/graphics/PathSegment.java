package androidx.compose.ui.graphics;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class PathSegment {

    /* renamed from: a, reason: collision with root package name */
    public final Type f15008a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f15009b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15010c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final Type f15011a;

        /* renamed from: b, reason: collision with root package name */
        public static final Type f15012b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f15013c;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.graphics.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.graphics.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.ui.graphics.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.ui.graphics.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.compose.ui.graphics.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.compose.ui.graphics.PathSegment$Type] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.compose.ui.graphics.PathSegment$Type] */
        static {
            ?? r02 = new Enum("Move", 0);
            ?? r1 = new Enum("Line", 1);
            ?? r2 = new Enum("Quadratic", 2);
            ?? r3 = new Enum("Conic", 3);
            ?? r4 = new Enum("Cubic", 4);
            ?? r5 = new Enum("Close", 5);
            f15011a = r5;
            ?? r6 = new Enum("Done", 6);
            f15012b = r6;
            f15013c = new Type[]{r02, r1, r2, r3, r4, r5, r6};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f15013c.clone();
        }
    }

    public PathSegment(Type type, float[] fArr, float f2) {
        this.f15008a = type;
        this.f15009b = fArr;
        this.f15010c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathSegment.class == obj.getClass()) {
            PathSegment pathSegment = (PathSegment) obj;
            if (this.f15008a == pathSegment.f15008a && Arrays.equals(this.f15009b, pathSegment.f15009b) && this.f15010c == pathSegment.f15010c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15010c) + ((Arrays.hashCode(this.f15009b) + (this.f15008a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.f15008a);
        sb.append(", points=");
        String arrays = Arrays.toString(this.f15009b);
        p0.a.r(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", weight=");
        return android.support.v4.media.d.n(sb, this.f15010c, ')');
    }
}
