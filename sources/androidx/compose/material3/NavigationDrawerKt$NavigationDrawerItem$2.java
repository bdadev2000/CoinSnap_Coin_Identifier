package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class NavigationDrawerKt$NavigationDrawerItem$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f10160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavigationDrawerItemColors f10161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10162c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f10163f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$NavigationDrawerItem$2(p pVar, NavigationDrawerItemColors navigationDrawerItemColors, boolean z2, p pVar2, p pVar3) {
        super(2);
        this.f10160a = pVar;
        this.f10161b = navigationDrawerItemColors;
        this.f10162c = z2;
        this.d = pVar2;
        this.f10163f = pVar3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier j2 = PaddingKt.j(companion, 16, 0.0f, 24, 0.0f, 10);
            RowMeasurePolicy a2 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14667k, composer, 48);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, j2);
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
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(composer, a2, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(composer, m2, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(composer, c2, pVar4);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
            composer.J(-449407448);
            p pVar5 = this.f10160a;
            NavigationDrawerItemColors navigationDrawerItemColors = this.f10161b;
            boolean z2 = this.f10162c;
            if (pVar5 != null) {
                CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(((Color) navigationDrawerItemColors.d(z2, composer).getValue()).f14964a, ContentColorKt.f8654a), pVar5, composer, 8);
                SpacerKt.a(SizeKt.r(companion, 12), composer);
            }
            composer.D();
            Modifier a3 = rowScopeInstance.a(companion, 1.0f, true);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int E2 = composer.E();
            PersistentCompositionLocalMap m3 = composer.m();
            Modifier c3 = ComposedModifierKt.c(composer, a3);
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
            Updater.b(composer, e, pVar);
            Updater.b(composer, m3, pVar2);
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E2))) {
                d.w(E2, composer, E2, pVar3);
            }
            Updater.b(composer, c3, pVar4);
            long j3 = ((Color) navigationDrawerItemColors.a(z2, composer).getValue()).f14964a;
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.f8654a;
            CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(j3, dynamicProvidableCompositionLocal), this.f10163f, composer, 8);
            composer.p();
            composer.J(-449392467);
            p pVar6 = this.d;
            if (pVar6 != null) {
                SpacerKt.a(SizeKt.r(companion, 12), composer);
                CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(((Color) navigationDrawerItemColors.c(z2, composer).getValue()).f14964a, dynamicProvidableCompositionLocal), pVar6, composer, 8);
            }
            composer.D();
            composer.p();
        }
        return b0.f30125a;
    }
}
