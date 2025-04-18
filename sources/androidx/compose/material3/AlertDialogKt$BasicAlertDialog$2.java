package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.DialogProperties;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlertDialogKt$BasicAlertDialog$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f7566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f7567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogProperties f7568c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$BasicAlertDialog$2(q0.a aVar, Modifier modifier, DialogProperties dialogProperties, p pVar, int i2, int i3) {
        super(2);
        this.f7566a = aVar;
        this.f7567b = modifier;
        this.f7568c = dialogProperties;
        this.d = pVar;
        this.f7569f = i2;
        this.f7570g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AlertDialogKt.d(this.f7566a, this.f7567b, this.f7568c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f7569f | 1), this.f7570g);
        return b0.f30125a;
    }
}
