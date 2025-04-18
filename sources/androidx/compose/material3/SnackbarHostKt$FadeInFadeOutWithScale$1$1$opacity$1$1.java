package androidx.compose.material3;

import androidx.compose.runtime.RecomposeScope;
import d0.b0;
import e0.t;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FadeInFadeOutState f11513b;

    /* renamed from: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SnackbarData f11514a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SnackbarData snackbarData) {
            super(1);
            this.f11514a = snackbarData;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            return Boolean.valueOf(p0.a.g(((FadeInFadeOutAnimationItem) obj).f9416a, this.f11514a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1(SnackbarData snackbarData, FadeInFadeOutState fadeInFadeOutState) {
        super(0);
        this.f11512a = snackbarData;
        this.f11513b = fadeInFadeOutState;
    }

    @Override // q0.a
    public final Object invoke() {
        FadeInFadeOutState fadeInFadeOutState = this.f11513b;
        Object obj = fadeInFadeOutState.f9418a;
        SnackbarData snackbarData = this.f11512a;
        if (!p0.a.g(snackbarData, obj)) {
            t.w0(new AnonymousClass1(snackbarData), fadeInFadeOutState.f9419b);
            RecomposeScope recomposeScope = fadeInFadeOutState.f9420c;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
            }
        }
        return b0.f30125a;
    }
}
