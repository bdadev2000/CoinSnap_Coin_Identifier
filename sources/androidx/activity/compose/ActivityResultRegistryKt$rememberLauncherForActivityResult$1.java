package androidx.activity.compose;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityResultLauncherHolder f205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityResultRegistry f206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f207c;
    public final /* synthetic */ ActivityResultContract d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ State f208f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1(ActivityResultLauncherHolder activityResultLauncherHolder, ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract, MutableState mutableState) {
        super(1);
        this.f205a = activityResultLauncherHolder;
        this.f206b = activityResultRegistry;
        this.f207c = str;
        this.d = activityResultContract;
        this.f208f = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final State state = this.f208f;
        ActivityResultCallback activityResultCallback = new ActivityResultCallback() { // from class: androidx.activity.compose.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                ((l) State.this.getValue()).invoke(obj2);
            }
        };
        ActivityResultLauncher d = this.f206b.d(this.f207c, this.d, activityResultCallback);
        final ActivityResultLauncherHolder activityResultLauncherHolder = this.f205a;
        activityResultLauncherHolder.f203a = d;
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                b0 b0Var;
                ActivityResultLauncher activityResultLauncher = ActivityResultLauncherHolder.this.f203a;
                if (activityResultLauncher != null) {
                    activityResultLauncher.c();
                    b0Var = b0.f30125a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    throw new IllegalStateException("Launcher has not been initialized".toString());
                }
            }
        };
    }
}
