package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class TabSlots {

    /* renamed from: a, reason: collision with root package name */
    public static final TabSlots f11981a;

    /* renamed from: b, reason: collision with root package name */
    public static final TabSlots f11982b;

    /* renamed from: c, reason: collision with root package name */
    public static final TabSlots f11983c;
    public static final /* synthetic */ TabSlots[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.material3.TabSlots] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.material3.TabSlots] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.material3.TabSlots] */
    static {
        ?? r02 = new Enum("Tabs", 0);
        f11981a = r02;
        ?? r1 = new Enum("Divider", 1);
        f11982b = r1;
        ?? r2 = new Enum("Indicator", 2);
        f11983c = r2;
        d = new TabSlots[]{r02, r1, r2};
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) d.clone();
    }
}
