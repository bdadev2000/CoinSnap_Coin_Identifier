package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ContextMenuUi_androidKt$ContextMenuColumn$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuColors f2961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f2962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f2963c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuUi_androidKt$ContextMenuColumn$1(ContextMenuColors contextMenuColors, Modifier modifier, q qVar, int i2, int i3) {
        super(2);
        this.f2961a = contextMenuColors;
        this.f2962b = modifier;
        this.f2963c = qVar;
        this.d = i2;
        this.f2964f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ContextMenuUi_androidKt.a(this.f2961a, this.f2962b, this.f2963c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f2964f);
        return b0.f30125a;
    }
}
