package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import d0.b0;

/* loaded from: classes3.dex */
public final class ActivityResultLauncherHolder<I> {

    /* renamed from: a, reason: collision with root package name */
    public ActivityResultLauncher f203a;

    public final void a(Object obj) {
        b0 b0Var;
        ActivityResultLauncher activityResultLauncher = this.f203a;
        if (activityResultLauncher != null) {
            activityResultLauncher.b(obj);
            b0Var = b0.f30125a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
