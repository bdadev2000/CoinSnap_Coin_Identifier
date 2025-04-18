package androidx.compose.ui.focus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FocusStateImpl implements FocusState {

    /* renamed from: a, reason: collision with root package name */
    public static final FocusStateImpl f14886a;

    /* renamed from: b, reason: collision with root package name */
    public static final FocusStateImpl f14887b;

    /* renamed from: c, reason: collision with root package name */
    public static final FocusStateImpl f14888c;
    public static final /* synthetic */ FocusStateImpl[] d;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.focus.FocusStateImpl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.focus.FocusStateImpl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.ui.focus.FocusStateImpl] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.ui.focus.FocusStateImpl] */
    static {
        ?? r02 = new Enum("Active", 0);
        f14886a = r02;
        ?? r1 = new Enum("ActiveParent", 1);
        f14887b = r1;
        ?? r2 = new Enum("Captured", 2);
        ?? r3 = new Enum("Inactive", 3);
        f14888c = r3;
        d = new FocusStateImpl[]{r02, r1, r2, r3};
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) d.clone();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                throw new RuntimeException();
            }
        }
        return false;
    }

    public final boolean b() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        throw new RuntimeException();
    }
}
