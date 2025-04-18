package androidx.lifecycle;

/* loaded from: classes.dex */
public enum n {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final l Companion = new l();

    public final o a() {
        switch (m.a[ordinal()]) {
            case 1:
            case 2:
                return o.CREATED;
            case 3:
            case 4:
                return o.STARTED;
            case 5:
                return o.RESUMED;
            case 6:
                return o.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
