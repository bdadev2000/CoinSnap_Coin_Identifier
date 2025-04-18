package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SearchBar_androidKt$DockedSearchBar$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f10906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10907b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10908c;
    public final /* synthetic */ q d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$DockedSearchBar$1(p pVar, boolean z2, SearchBarColors searchBarColors, q qVar) {
        super(2);
        this.f10906a = pVar;
        this.f10907b = z2;
        this.f10908c = searchBarColors;
        this.d = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            boolean z2 = this.f10907b;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, companion);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3837a;
            this.f10906a.invoke(composer, 0);
            AnimatedVisibilityKt.b(columnScopeInstance, z2, null, SearchBar_androidKt.f10904l, SearchBar_androidKt.f10905m, null, ComposableLambdaKt.c(-1743690306, new SearchBar_androidKt$DockedSearchBar$1$1$1(this.f10908c, this.d), composer), composer, 1600518, 18);
            composer.p();
        }
        return b0.f30125a;
    }
}
