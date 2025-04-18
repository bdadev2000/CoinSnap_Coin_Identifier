package androidx.lifecycle.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LifecycleEffectKt$LifecycleStartEffectImpl$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f20217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleStartStopEffectScope f20218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20219c;

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20220a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20220a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEffectKt$LifecycleStartEffectImpl$1$1(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, l lVar) {
        super(1);
        this.f20217a = lifecycleOwner;
        this.f20218b = lifecycleStartStopEffectScope;
        this.f20219c = lVar;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        final ?? obj2 = new Object();
        final b bVar = new b(this.f20218b, obj2, this.f20219c, 1);
        final LifecycleOwner lifecycleOwner = this.f20217a;
        lifecycleOwner.getLifecycle().a(bVar);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                LifecycleOwner.this.getLifecycle().d(bVar);
                LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) obj2.f30930a;
                if (lifecycleStopOrDisposeEffectResult != null) {
                    lifecycleStopOrDisposeEffectResult.a();
                }
            }
        };
    }
}
