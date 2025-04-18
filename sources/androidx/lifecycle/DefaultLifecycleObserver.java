package androidx.lifecycle;

/* loaded from: classes4.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "owner");
    }

    default void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    default void onPause(LifecycleOwner lifecycleOwner) {
    }

    default void onResume(LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "owner");
    }

    default void onStart(LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "owner");
    }

    default void onStop(LifecycleOwner lifecycleOwner) {
    }
}
