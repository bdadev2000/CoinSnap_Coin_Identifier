package androidx.compose.material3.internal;

import android.support.v4.media.d;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f13055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextStyle f13057c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(Transition.TransitionAnimationState transitionAnimationState, long j2, TextStyle textStyle, p pVar) {
        super(3);
        this.f13055a = transitionAnimationState;
        this.f13056b = j2;
        this.f13057c = textStyle;
        this.d = pVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.I(modifier) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            State state = this.f13055a;
            boolean I = composer.I(state);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1$1$1(state);
                composer.o(u2);
            }
            Modifier a2 = GraphicsLayerModifierKt.a(modifier, (l) u2);
            long j2 = this.f13056b;
            TextStyle textStyle = this.f13057c;
            p pVar = this.d;
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, a2);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(composer.j() instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            Updater.b(composer, e, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar2);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            TextFieldImplKt.c(j2, textStyle, pVar, composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
