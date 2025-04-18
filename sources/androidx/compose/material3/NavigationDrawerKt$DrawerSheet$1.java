package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavigationDrawerKt$DrawerSheet$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerPredictiveBackState f10089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10091c;
    public final /* synthetic */ q d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DrawerSheet$1(DrawerPredictiveBackState drawerPredictiveBackState, boolean z2, WindowInsets windowInsets, q qVar) {
        super(2);
        this.f10089a = drawerPredictiveBackState;
        this.f10090b = z2;
        this.f10091c = windowInsets;
        this.d = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Modifier modifier;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            DrawerPredictiveBackState drawerPredictiveBackState = this.f10089a;
            if (drawerPredictiveBackState != null) {
                float f2 = NavigationDrawerKt.f10042a;
                modifier = GraphicsLayerModifierKt.a(companion, new NavigationDrawerKt$predictiveBackDrawerChild$1(drawerPredictiveBackState, this.f10090b));
            } else {
                modifier = companion;
            }
            Modifier c2 = WindowInsetsPaddingKt.c(SizeKt.q(companion, NavigationDrawerKt.f10043b, 0.0f, DrawerDefaults.d, 10).T0(modifier), this.f10091c);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c3 = ComposedModifierKt.c(composer, c2);
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
            Updater.b(composer, c3, ComposeUiNode.Companion.d);
            this.d.invoke(ColumnScopeInstance.f3837a, composer, 6);
            composer.p();
        }
        return b0.f30125a;
    }
}
