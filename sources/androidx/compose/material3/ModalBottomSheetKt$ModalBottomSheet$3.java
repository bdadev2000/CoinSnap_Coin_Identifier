package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class ModalBottomSheetKt$ModalBottomSheet$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f9824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SheetState f9825c;
    public final /* synthetic */ Animatable d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f9826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f9827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Modifier f9828h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f9829i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Shape f9830j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f9831k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f9832l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f9833m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f9834n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f9835o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f9836p;

    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f9837a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            SemanticsPropertiesKt.t((SemanticsPropertyReceiver) obj);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$3(long j2, q0.a aVar, SheetState sheetState, Animatable animatable, d0 d0Var, l lVar, Modifier modifier, float f2, Shape shape, long j3, long j4, float f3, p pVar, p pVar2, q qVar) {
        super(2);
        this.f9823a = j2;
        this.f9824b = aVar;
        this.f9825c = sheetState;
        this.d = animatable;
        this.f9826f = d0Var;
        this.f9827g = lVar;
        this.f9828h = modifier;
        this.f9829i = f2;
        this.f9830j = shape;
        this.f9831k = j3;
        this.f9832l = j4;
        this.f9833m = f3;
        this.f9834n = pVar;
        this.f9835o = pVar2;
        this.f9836p = qVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.r, q0.q] */
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier b2 = SemanticsModifierKt.b(ComposedModifierKt.a(SizeKt.f4107c, new r(3)), false, AnonymousClass1.f9837a);
            long j2 = this.f9823a;
            q0.a aVar = this.f9824b;
            Animatable animatable = this.d;
            d0 d0Var = this.f9826f;
            l lVar = this.f9827g;
            Modifier modifier = this.f9828h;
            float f2 = this.f9829i;
            Shape shape = this.f9830j;
            long j3 = this.f9831k;
            long j4 = this.f9832l;
            float f3 = this.f9833m;
            p pVar = this.f9834n;
            p pVar2 = this.f9835o;
            q qVar = this.f9836p;
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, b2);
            ComposeUiNode.h8.getClass();
            q0.a aVar2 = ComposeUiNode.Companion.f15895b;
            if (!(composer.j() instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            composer.z();
            if (composer.e()) {
                composer.B(aVar2);
            } else {
                composer.n();
            }
            Updater.b(composer, e, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar3);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
            SheetState sheetState = this.f9825c;
            ModalBottomSheetKt.c(j2, aVar, ((SheetValue) sheetState.f11199c.f12825h.getValue()) != SheetValue.f11206a, composer, 0);
            ModalBottomSheetKt.b(boxScopeInstance, animatable, d0Var, aVar, lVar, modifier, sheetState, f2, shape, j3, j4, f3, pVar, pVar2, qVar, composer, 70, 0, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
