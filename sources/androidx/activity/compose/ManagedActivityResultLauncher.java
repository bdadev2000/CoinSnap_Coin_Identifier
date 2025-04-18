package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityResultLauncherHolder f226a;

    /* renamed from: b, reason: collision with root package name */
    public final State f227b;

    public ManagedActivityResultLauncher(ActivityResultLauncherHolder activityResultLauncherHolder, MutableState mutableState) {
        this.f226a = activityResultLauncherHolder;
        this.f227b = mutableState;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final ActivityResultContract a() {
        return (ActivityResultContract) this.f227b.getValue();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void b(Object obj) {
        this.f226a.a(obj);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void c() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
