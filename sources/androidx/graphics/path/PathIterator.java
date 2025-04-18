package androidx.graphics.path;

import java.util.Iterator;
import r0.a;

/* loaded from: classes3.dex */
public final class PathIterator implements Iterator<PathSegment>, a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class ConicEvaluation {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ ConicEvaluation[] f19917a = {new Enum("AsConic", 0), new Enum("AsQuadratics", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ConicEvaluation EF5;

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) f19917a.clone();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final PathSegment next() {
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
