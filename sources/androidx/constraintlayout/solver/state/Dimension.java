package androidx.constraintlayout.solver.state;

/* loaded from: classes3.dex */
public class Dimension {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Type[] f17970a = {new Enum("FIXED", 0), new Enum("WRAP", 1), new Enum("MATCH_PARENT", 2), new Enum("MATCH_CONSTRAINT", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f17970a.clone();
        }
    }
}
