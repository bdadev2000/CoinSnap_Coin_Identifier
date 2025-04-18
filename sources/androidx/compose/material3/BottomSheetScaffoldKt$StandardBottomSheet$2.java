package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class BottomSheetScaffoldKt$StandardBottomSheet$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f7993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SheetState f7994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7995c;
    public final /* synthetic */ d0 d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f7996f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$2(p pVar, SheetState sheetState, boolean z2, d0 d0Var, q qVar) {
        super(2);
        this.f7993a = pVar;
        this.f7994b = sheetState;
        this.f7995c = z2;
        this.d = d0Var;
        this.f7996f = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ColumnScopeInstance columnScopeInstance;
        p pVar;
        p pVar2;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier d = SizeKt.d(companion, 1.0f);
            SheetState sheetState = this.f7994b;
            boolean z2 = this.f7995c;
            d0 d0Var = this.d;
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
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
            p pVar3 = ComposeUiNode.Companion.f15898g;
            Updater.b(composer, a2, pVar3);
            p pVar4 = ComposeUiNode.Companion.f15897f;
            Updater.b(composer, m2, pVar4);
            p pVar5 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar5);
            }
            p pVar6 = ComposeUiNode.Companion.d;
            Updater.b(composer, c2, pVar6);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f3837a;
            composer.J(-1168080147);
            p pVar7 = this.f7993a;
            if (pVar7 != null) {
                String a3 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_bottom_sheet_collapse_description, composer);
                String a4 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_bottom_sheet_dismiss_description, composer);
                String a5 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_bottom_sheet_expand_description, composer);
                Modifier a6 = columnScopeInstance2.a(companion, Alignment.Companion.f14670n);
                boolean I = composer.I(sheetState) | composer.a(z2) | composer.I(a5) | composer.w(d0Var) | composer.I(a3) | composer.I(a4);
                Object u2 = composer.u();
                if (I || u2 == Composer.Companion.f13690a) {
                    columnScopeInstance = columnScopeInstance2;
                    pVar = pVar6;
                    pVar2 = pVar5;
                    BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1 bottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1 = new BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1(sheetState, z2, a5, a3, a4, d0Var);
                    composer.o(bottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1);
                    u2 = bottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1;
                } else {
                    columnScopeInstance = columnScopeInstance2;
                    pVar = pVar6;
                    pVar2 = pVar5;
                }
                Modifier b2 = SemanticsModifierKt.b(a6, true, (l) u2);
                MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
                int E2 = composer.E();
                PersistentCompositionLocalMap m3 = composer.m();
                Modifier c3 = ComposedModifierKt.c(composer, b2);
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
                Updater.b(composer, e, pVar3);
                Updater.b(composer, m3, pVar4);
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E2))) {
                    d.w(E2, composer, E2, pVar2);
                }
                Updater.b(composer, c3, pVar);
                pVar7.invoke(composer, 0);
                composer.p();
            } else {
                columnScopeInstance = columnScopeInstance2;
            }
            composer.D();
            this.f7996f.invoke(columnScopeInstance, composer, 6);
            composer.p();
        }
        return b0.f30125a;
    }
}
