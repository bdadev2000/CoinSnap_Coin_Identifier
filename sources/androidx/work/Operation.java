package androidx.work;

/* loaded from: classes.dex */
public interface Operation {

    /* renamed from: a, reason: collision with root package name */
    public static final State.SUCCESS f21887a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final State.IN_PROGRESS f21888b = new Object();

    /* loaded from: classes.dex */
    public static abstract class State {

        /* loaded from: classes.dex */
        public static final class FAILURE extends State {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f21889a;

            public FAILURE(Throwable th) {
                this.f21889a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", this.f21889a.getMessage());
            }
        }

        /* loaded from: classes.dex */
        public static final class IN_PROGRESS extends State {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes.dex */
        public static final class SUCCESS extends State {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
