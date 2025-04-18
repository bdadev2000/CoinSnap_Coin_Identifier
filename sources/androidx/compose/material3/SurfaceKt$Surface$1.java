package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SurfaceKt$Surface$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shape f11618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11619c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f11620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f11621g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f11622h;

    /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass2 f11623a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            SemanticsPropertiesKt.k((SemanticsPropertyReceiver) obj);
            return b0.f30125a;
        }
    }

    @e(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass3 extends i implements p {
        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new i(2, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((PointerInputScope) obj, (g) obj2);
            b0 b0Var = b0.f30125a;
            anonymousClass3.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            q.m(obj);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$1(Modifier modifier, Shape shape, long j2, float f2, BorderStroke borderStroke, float f3, p pVar) {
        super(2);
        this.f11617a = modifier;
        this.f11618b = shape;
        this.f11619c = j2;
        this.d = f2;
        this.f11620f = borderStroke;
        this.f11621g = f3;
        this.f11622h = pVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [j0.i, q0.p] */
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        b0 b0Var = b0.f30125a;
        if (intValue == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier b2 = SuspendingPointerInputFilterKt.b(SemanticsModifierKt.b(SurfaceKt.e(this.f11617a, this.f11618b, SurfaceKt.f(this.f11619c, this.d, composer), this.f11620f, ((Density) composer.K(CompositionLocalsKt.f16434f)).y1(this.f11621g)), false, AnonymousClass2.f11623a), b0Var, new i(2, null));
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, true);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, b2);
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
            this.f11622h.invoke(composer, 0);
            composer.p();
        }
        return b0Var;
    }
}
