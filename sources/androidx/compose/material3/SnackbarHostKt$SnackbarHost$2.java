package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SnackbarHostKt$SnackbarHost$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackbarHostState f11523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f11524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f11525c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11526f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$2(SnackbarHostState snackbarHostState, Modifier modifier, q qVar, int i2, int i3) {
        super(2);
        this.f11523a = snackbarHostState;
        this.f11524b = modifier;
        this.f11525c = qVar;
        this.d = i2;
        this.f11526f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SnackbarHostKt.b(this.f11523a, this.f11524b, this.f11525c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f11526f);
        return b0.f30125a;
    }
}
