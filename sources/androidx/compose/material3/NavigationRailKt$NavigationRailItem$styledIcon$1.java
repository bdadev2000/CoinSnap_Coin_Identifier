package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
final class NavigationRailKt$NavigationRailItem$styledIcon$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationRailItemColors f10354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10356c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f10358g;

    /* renamed from: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f10359a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$styledIcon$1(NavigationRailItemColors navigationRailItemColors, boolean z2, boolean z3, p pVar, boolean z4, p pVar2) {
        super(2);
        this.f10354a = navigationRailItemColors;
        this.f10355b = z2;
        this.f10356c = z3;
        this.d = pVar;
        this.f10357f = z4;
        this.f10358g = pVar2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            boolean z2 = this.f10356c;
            boolean z3 = this.f10355b;
            NavigationRailItemColors navigationRailItemColors = this.f10354a;
            State a2 = SingleValueAnimationKt.a(!z2 ? navigationRailItemColors.f10319f : z3 ? navigationRailItemColors.f10316a : navigationRailItemColors.d, AnimationSpecKt.d(Opcodes.FCMPG, 0, null, 6), composer, 48);
            p pVar = this.d;
            Modifier modifier = Modifier.Companion.f14687a;
            if (pVar != null && (this.f10357f || z3)) {
                modifier = SemanticsModifierKt.a(modifier, AnonymousClass1.f10359a);
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
            CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(((Color) a2.getValue()).f14964a, ContentColorKt.f8654a), this.f10358g, composer, 8);
            composer.p();
        }
        return b0.f30125a;
    }
}
