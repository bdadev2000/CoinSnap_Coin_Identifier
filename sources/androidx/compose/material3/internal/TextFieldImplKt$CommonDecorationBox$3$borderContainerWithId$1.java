package androidx.compose.material3.internal;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f13043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f13044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f13045c;

    /* renamed from: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final /* synthetic */ class AnonymousClass1 extends s {
        @Override // x0.j
        public final Object get() {
            return ((MutableState) this.receiver).getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1(MutableState mutableState, PaddingValues paddingValues, p pVar) {
        super(2);
        this.f13043a = mutableState;
        this.f13044b = paddingValues;
        this.f13045c = pVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [q0.a, kotlin.jvm.internal.a0] */
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier e = OutlinedTextFieldKt.e(LayoutIdKt.b(Modifier.Companion.f14687a, "Container"), new a0(this.f13043a, MutableState.class, "value", "getValue()Ljava/lang/Object;", 0), this.f13044b);
            MeasurePolicy e2 = BoxKt.e(Alignment.Companion.f14659a, true);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, e);
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
            Updater.b(composer, e2, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            this.f13045c.invoke(composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
