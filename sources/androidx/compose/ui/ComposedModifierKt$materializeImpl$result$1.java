package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import p0.a;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ComposedModifierKt$materializeImpl$result$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Composer f14684a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$materializeImpl$result$1(Composer composer) {
        super(2);
        this.f14684a = composer;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Modifier modifier = (Modifier) obj;
        Modifier modifier2 = (Modifier.Element) obj2;
        if (modifier2 instanceof ComposedModifier) {
            q qVar = ((ComposedModifier) modifier2).f14682a;
            a.q(qVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            e.g(3, qVar);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Composer composer = this.f14684a;
            modifier2 = ComposedModifierKt.b(composer, (Modifier) qVar.invoke(companion, composer, 0));
        }
        return modifier.T0(modifier2);
    }
}
