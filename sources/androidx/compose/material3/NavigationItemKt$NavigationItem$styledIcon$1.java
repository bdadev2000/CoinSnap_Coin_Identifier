package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavigationItemKt$NavigationItem$styledIcon$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationItemColors f10263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10265c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f10266f;

    /* renamed from: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f10267a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$NavigationItem$styledIcon$1(NavigationItemColors navigationItemColors, boolean z2, boolean z3, p pVar, p pVar2) {
        super(2);
        this.f10263a = navigationItemColors;
        this.f10264b = z2;
        this.f10265c = z3;
        this.d = pVar;
        this.f10266f = pVar2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            boolean z2 = this.f10265c;
            NavigationItemColors navigationItemColors = this.f10263a;
            long j2 = !z2 ? navigationItemColors.f10233f : this.f10264b ? navigationItemColors.f10230a : navigationItemColors.d;
            p pVar = this.d;
            Modifier modifier = Modifier.Companion.f14687a;
            if (pVar != null) {
                modifier = SemanticsModifierKt.a(modifier, AnonymousClass1.f10267a);
            }
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, modifier);
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
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar2);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(j2, ContentColorKt.f8654a), this.f10266f, composer, 8);
            composer.p();
        }
        return b0.f30125a;
    }
}
