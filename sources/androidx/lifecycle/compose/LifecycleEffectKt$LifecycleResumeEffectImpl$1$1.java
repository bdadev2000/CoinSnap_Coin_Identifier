package androidx.lifecycle.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class LifecycleEffectKt$LifecycleResumeEffectImpl$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f20188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleResumePauseEffectScope f20189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20190c;

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20191a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20191a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEffectKt$LifecycleResumeEffectImpl$1$1(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, l lVar) {
        super(1);
        this.f20188a = lifecycleOwner;
        this.f20189b = lifecycleResumePauseEffectScope;
        this.f20190c = lVar;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        final ?? obj2 = new Object();
        final b bVar = new b(this.f20189b, obj2, this.f20190c, 0);
        final LifecycleOwner lifecycleOwner = this.f20188a;
        lifecycleOwner.getLifecycle().a(bVar);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                LifecycleOwner.this.getLifecycle().d(bVar);
                LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) obj2.f30930a;
                if (lifecyclePauseOrDisposeEffectResult != null) {
                    lifecyclePauseOrDisposeEffectResult.a();
                }
            }
        };
    }
}
