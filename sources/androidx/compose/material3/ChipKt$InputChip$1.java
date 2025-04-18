package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
final class ChipKt$InputChip$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f8406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shape f8407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f8408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$InputChip$1(float f2, Shape shape, p pVar) {
        super(2);
        this.f8406a = f2;
        this.f8407b = shape;
        this.f8408c = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = this.f8406a;
            boolean b2 = composer.b(f2);
            Shape shape = this.f8407b;
            boolean I = b2 | composer.I(shape);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new ChipKt$InputChip$1$1$1(f2, shape);
                composer.o(u2);
            }
            Modifier a2 = GraphicsLayerModifierKt.a(companion, (l) u2);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.e, false);
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
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            this.f8408c.invoke(composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
