package androidx.constraintlayout.solver.state;

/* loaded from: classes3.dex */
public class State {

    /* renamed from: androidx.constraintlayout.solver.state.State$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17971a;

        static {
            int[] iArr = new int[Helper.values().length];
            f17971a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17971a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17971a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17971a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17971a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Chain {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Chain[] f17972a = {new Enum("SPREAD", 0), new Enum("SPREAD_INSIDE", 1), new Enum("PACKED", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Chain EF5;

        public static Chain valueOf(String str) {
            return (Chain) Enum.valueOf(Chain.class, str);
        }

        public static Chain[] values() {
            return (Chain[]) f17972a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Constraint {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Constraint[] f17973a = {new Enum("LEFT_TO_LEFT", 0), new Enum("LEFT_TO_RIGHT", 1), new Enum("RIGHT_TO_LEFT", 2), new Enum("RIGHT_TO_RIGHT", 3), new Enum("START_TO_START", 4), new Enum("START_TO_END", 5), new Enum("END_TO_START", 6), new Enum("END_TO_END", 7), new Enum("TOP_TO_TOP", 8), new Enum("TOP_TO_BOTTOM", 9), new Enum("BOTTOM_TO_TOP", 10), new Enum("BOTTOM_TO_BOTTOM", 11), new Enum("BASELINE_TO_BASELINE", 12), new Enum("CENTER_HORIZONTALLY", 13), new Enum("CENTER_VERTICALLY", 14)};

        /* JADX INFO: Fake field, exist only in values array */
        Constraint EF5;

        public static Constraint valueOf(String str) {
            return (Constraint) Enum.valueOf(Constraint.class, str);
        }

        public static Constraint[] values() {
            return (Constraint[]) f17973a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Direction {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f17974a = {new Enum("LEFT", 0), new Enum("RIGHT", 1), new Enum("START", 2), new Enum("END", 3), new Enum("TOP", 4), new Enum("BOTTOM", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        Direction EF5;

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f17974a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Helper {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Helper[] f17975a = {new Enum("HORIZONTAL_CHAIN", 0), new Enum("VERTICAL_CHAIN", 1), new Enum("ALIGN_HORIZONTALLY", 2), new Enum("ALIGN_VERTICALLY", 3), new Enum("BARRIER", 4), new Enum("LAYER", 5), new Enum("FLOW", 6)};

        /* JADX INFO: Fake field, exist only in values array */
        Helper EF5;

        public static Helper valueOf(String str) {
            return (Helper) Enum.valueOf(Helper.class, str);
        }

        public static Helper[] values() {
            return (Helper[]) f17975a.clone();
        }
    }
}
