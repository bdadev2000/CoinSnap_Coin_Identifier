package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SurfaceKt$Surface$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shape f11644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11645c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f11646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f11647g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11648h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11649i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f11650j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f11651k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f11652l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$4(Modifier modifier, Shape shape, long j2, float f2, BorderStroke borderStroke, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, l lVar, float f3, ComposableLambdaImpl composableLambdaImpl) {
        super(2);
        this.f11643a = modifier;
        this.f11644b = shape;
        this.f11645c = j2;
        this.d = f2;
        this.f11646f = borderStroke;
        this.f11647g = z2;
        this.f11648h = mutableInteractionSource;
        this.f11649i = z3;
        this.f11650j = lVar;
        this.f11651k = f3;
        this.f11652l = composableLambdaImpl;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f9627a;
            Modifier a2 = ToggleableKt.a(SurfaceKt.e(this.f11643a.T0(MinimumInteractiveModifier.f9779a), this.f11644b, SurfaceKt.f(this.f11645c, this.d, composer), this.f11646f, ((Density) composer.K(CompositionLocalsKt.f16434f)).y1(this.f11651k)), this.f11647g, this.f11648h, RippleKt.a(false, 0.0f, 0L, composer, 0, 7), this.f11649i, null, this.f11650j);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, true);
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
            Updater.b(composer, e, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            this.f11652l.invoke(composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
