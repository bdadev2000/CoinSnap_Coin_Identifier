package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SwipeToDismissBoxValue {

    /* renamed from: a, reason: collision with root package name */
    public static final SwipeToDismissBoxValue f11671a;

    /* renamed from: b, reason: collision with root package name */
    public static final SwipeToDismissBoxValue f11672b;

    /* renamed from: c, reason: collision with root package name */
    public static final SwipeToDismissBoxValue f11673c;
    public static final /* synthetic */ SwipeToDismissBoxValue[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.material3.SwipeToDismissBoxValue] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.material3.SwipeToDismissBoxValue] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.material3.SwipeToDismissBoxValue] */
    static {
        ?? r02 = new Enum("StartToEnd", 0);
        f11671a = r02;
        ?? r1 = new Enum("EndToStart", 1);
        f11672b = r1;
        ?? r2 = new Enum("Settled", 2);
        f11673c = r2;
        d = new SwipeToDismissBoxValue[]{r02, r1, r2};
    }

    public static SwipeToDismissBoxValue valueOf(String str) {
        return (SwipeToDismissBoxValue) Enum.valueOf(SwipeToDismissBoxValue.class, str);
    }

    public static SwipeToDismissBoxValue[] values() {
        return (SwipeToDismissBoxValue[]) d.clone();
    }
}
