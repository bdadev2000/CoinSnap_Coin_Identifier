package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class TabKt$Tab$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11764c;
    public final /* synthetic */ Indication d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0.a f11766g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f11767h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$3(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z3, q0.a aVar, q qVar) {
        super(2);
        this.f11762a = modifier;
        this.f11763b = z2;
        this.f11764c = mutableInteractionSource;
        this.d = indication;
        this.f11765f = z3;
        this.f11766g = aVar;
        this.f11767h = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier d = SizeKt.d(SelectableKt.a(this.f11762a, this.f11763b, this.f11764c, this.d, this.f11765f, new Role(4), this.f11766g), 1.0f);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.e, Alignment.Companion.f14670n, composer, 54);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, d);
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
            Updater.b(composer, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            this.f11767h.invoke(ColumnScopeInstance.f3837a, composer, 6);
            composer.p();
        }
        return b0.f30125a;
    }
}
