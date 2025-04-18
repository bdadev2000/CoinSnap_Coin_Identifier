package androidx.room;

/* loaded from: classes2.dex */
public final class FtsOptions {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class MatchInfo {

        /* renamed from: a, reason: collision with root package name */
        public static final MatchInfo f21265a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ MatchInfo[] f21266b;

        /* JADX INFO: Fake field, exist only in values array */
        MatchInfo EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.room.FtsOptions$MatchInfo] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.room.FtsOptions$MatchInfo] */
        static {
            ?? r02 = new Enum("FTS3", 0);
            ?? r1 = new Enum("FTS4", 1);
            f21265a = r1;
            f21266b = new MatchInfo[]{r02, r1};
        }

        public static MatchInfo valueOf(String str) {
            return (MatchInfo) Enum.valueOf(MatchInfo.class, str);
        }

        public static MatchInfo[] values() {
            return (MatchInfo[]) f21266b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Order {

        /* renamed from: a, reason: collision with root package name */
        public static final Order f21267a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Order[] f21268b;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.room.FtsOptions$Order] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.room.FtsOptions$Order] */
        static {
            ?? r02 = new Enum("ASC", 0);
            f21267a = r02;
            f21268b = new Order[]{r02, new Enum("DESC", 1)};
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) f21268b.clone();
        }
    }
}
