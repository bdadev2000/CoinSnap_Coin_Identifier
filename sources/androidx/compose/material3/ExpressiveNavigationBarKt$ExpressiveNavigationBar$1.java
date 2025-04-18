package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class ExpressiveNavigationBarKt$ExpressiveNavigationBar$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f9393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f9394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9395c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressiveNavigationBarKt$ExpressiveNavigationBar$1(Modifier modifier, WindowInsets windowInsets, int i2, p pVar) {
        super(2);
        this.f9393a = modifier;
        this.f9394b = windowInsets;
        this.f9395c = i2;
        this.d = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier a2 = SelectableGroupKt.a(SizeKt.b(WindowInsetsPaddingKt.c(this.f9393a, this.f9394b), 0.0f, ExpressiveNavigationBarKt.f9387b, 1));
            int i2 = this.f9395c;
            if (i2 == 0) {
                obj3 = new Object();
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("Invalid ItemsArrangement value.");
                }
                obj3 = new Object();
            }
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
            Updater.b(composer, obj3, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            this.d.invoke(composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
