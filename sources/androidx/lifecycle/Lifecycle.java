package androidx.lifecycle;

import e1.i1;
import e1.o0;
import e1.t0;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class Lifecycle {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f19985a = new AtomicReference(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Event {
        private static final /* synthetic */ Event[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final Event ON_ANY;
        public static final Event ON_CREATE;
        public static final Event ON_DESTROY;
        public static final Event ON_PAUSE;
        public static final Event ON_RESUME;
        public static final Event ON_START;
        public static final Event ON_STOP;

        /* loaded from: classes2.dex */
        public static final class Companion {

            /* loaded from: classes2.dex */
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[2] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[3] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[4] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[0] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[1] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                }
            }

            public static Event a(State state) {
                p0.a.s(state, "state");
                int ordinal = state.ordinal();
                if (ordinal == 2) {
                    return Event.ON_DESTROY;
                }
                if (ordinal == 3) {
                    return Event.ON_STOP;
                }
                if (ordinal != 4) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            public static Event b(State state) {
                p0.a.s(state, "state");
                int ordinal = state.ordinal();
                if (ordinal == 1) {
                    return Event.ON_CREATE;
                }
                if (ordinal == 2) {
                    return Event.ON_START;
                }
                if (ordinal != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }

            public static Event c(State state) {
                p0.a.s(state, "state");
                int ordinal = state.ordinal();
                if (ordinal == 2) {
                    return Event.ON_CREATE;
                }
                if (ordinal == 3) {
                    return Event.ON_START;
                }
                if (ordinal != 4) {
                    return null;
                }
                return Event.ON_RESUME;
            }
        }

        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19986a;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f19986a = iArr;
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.Lifecycle$Event] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.Lifecycle$Event$Companion] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.Lifecycle$Event] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.Lifecycle$Event] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.Lifecycle$Event] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.Lifecycle$Event] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.lifecycle.Lifecycle$Event] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.lifecycle.Lifecycle$Event] */
        static {
            ?? r02 = new Enum("ON_CREATE", 0);
            ON_CREATE = r02;
            ?? r1 = new Enum("ON_START", 1);
            ON_START = r1;
            ?? r2 = new Enum("ON_RESUME", 2);
            ON_RESUME = r2;
            ?? r3 = new Enum("ON_PAUSE", 3);
            ON_PAUSE = r3;
            ?? r4 = new Enum("ON_STOP", 4);
            ON_STOP = r4;
            ?? r5 = new Enum("ON_DESTROY", 5);
            ON_DESTROY = r5;
            ?? r6 = new Enum("ON_ANY", 6);
            ON_ANY = r6;
            $VALUES = new Event[]{r02, r1, r2, r3, r4, r5, r6};
            Companion = new Object();
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        public final State a() {
            switch (WhenMappings.f19986a[ordinal()]) {
                case 1:
                case 2:
                    return State.f19989c;
                case 3:
                case 4:
                    return State.d;
                case 5:
                    return State.f19990f;
                case 6:
                    return State.f19987a;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f19987a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f19988b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f19989c;
        public static final State d;

        /* renamed from: f, reason: collision with root package name */
        public static final State f19990f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ State[] f19991g;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.Lifecycle$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Lifecycle$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.Lifecycle$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.Lifecycle$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.Lifecycle$State, java.lang.Enum] */
        static {
            ?? r02 = new Enum("DESTROYED", 0);
            f19987a = r02;
            ?? r1 = new Enum("INITIALIZED", 1);
            f19988b = r1;
            ?? r2 = new Enum("CREATED", 2);
            f19989c = r2;
            ?? r3 = new Enum("STARTED", 3);
            d = r3;
            ?? r4 = new Enum("RESUMED", 4);
            f19990f = r4;
            f19991g = new State[]{r02, r1, r2, r3, r4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f19991g.clone();
        }

        public final boolean a(State state) {
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(LifecycleObserver lifecycleObserver);

    public abstract State b();

    public o0 c() {
        i1 c2 = t0.c(b());
        a(new b(c2, 1));
        return new o0(c2);
    }

    public abstract void d(LifecycleObserver lifecycleObserver);
}
