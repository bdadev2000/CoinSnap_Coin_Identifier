package androidx.compose.ui.graphics;

import java.util.Iterator;

/* loaded from: classes2.dex */
public interface PathIterator extends Iterator<PathSegment>, r0.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class ConicEvaluation {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ ConicEvaluation[] f15007a = {new Enum("AsConic", 0), new Enum("AsQuadratics", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ConicEvaluation EF5;

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) f15007a.clone();
        }
    }
}
