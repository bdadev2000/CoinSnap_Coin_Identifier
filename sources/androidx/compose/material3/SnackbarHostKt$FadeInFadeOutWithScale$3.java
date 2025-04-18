package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SnackbarHostKt$FadeInFadeOutWithScale$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f11518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f11519c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11520f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$3(SnackbarData snackbarData, Modifier modifier, q qVar, int i2, int i3) {
        super(2);
        this.f11517a = snackbarData;
        this.f11518b = modifier;
        this.f11519c = qVar;
        this.d = i2;
        this.f11520f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SnackbarHostKt.a(this.f11517a, this.f11518b, this.f11519c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f11520f);
        return b0.f30125a;
    }
}
