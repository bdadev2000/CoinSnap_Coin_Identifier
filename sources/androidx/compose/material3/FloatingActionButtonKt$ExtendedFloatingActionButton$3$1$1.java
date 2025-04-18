package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f9467a;

    /* renamed from: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f9468a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1(p pVar) {
        super(3);
        this.f9467a = pVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier a2 = SemanticsModifierKt.a(companion, AnonymousClass1.f9468a);
        RowMeasurePolicy a3 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14666j, composer, 0);
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
        Updater.b(composer, a3, ComposeUiNode.Companion.f15898g);
        Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
        p pVar = ComposeUiNode.Companion.f15900i;
        if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
            d.w(E, composer, E, pVar);
        }
        Updater.b(composer, c2, ComposeUiNode.Companion.d);
        SpacerKt.a(SizeKt.r(companion, FloatingActionButtonKt.f9451b), composer);
        this.f9467a.invoke(composer, 0);
        composer.p();
        return b0.f30125a;
    }
}
