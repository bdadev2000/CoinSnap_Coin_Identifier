package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f11515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$2$1$1(q qVar, SnackbarData snackbarData) {
        super(2);
        this.f11515a = qVar;
        this.f11516b = snackbarData;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            SnackbarData snackbarData = this.f11516b;
            p0.a.p(snackbarData);
            this.f11515a.invoke(snackbarData, composer, 0);
        }
        return b0.f30125a;
    }
}
