package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
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
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class TabKt$LeadingIconTab$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11735c;
    public final /* synthetic */ Indication d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0.a f11737g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f11738h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f11739i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$LeadingIconTab$1(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z3, q0.a aVar, p pVar, p pVar2) {
        super(2);
        this.f11733a = modifier;
        this.f11734b = z2;
        this.f11735c = mutableInteractionSource;
        this.d = indication;
        this.f11736f = z3;
        this.f11737g = aVar;
        this.f11738h = pVar;
        this.f11739i = pVar2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier d = SizeKt.d(PaddingKt.h(SelectableKt.a(SizeKt.e(this.f11733a, TabKt.f11728a), this.f11734b, this.f11735c, this.d, this.f11736f, new Role(4), this.f11737g), TabKt.f11730c, 0.0f, 2), 1.0f);
            RowMeasurePolicy a2 = RowKt.a(Arrangement.e, Alignment.Companion.f14667k, composer, 54);
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
            this.f11738h.invoke(composer, 0);
            SpacerKt.a(SizeKt.m(Modifier.Companion.f14687a, TabKt.f11732g), composer);
            TextKt.a(TextStyle.a(3, 16744447, 0L, 0L, 0L, 0L, null, TypographyKt.a(PrimaryNavigationTabTokens.f13491f, composer), null, null, null), this.f11739i, composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
