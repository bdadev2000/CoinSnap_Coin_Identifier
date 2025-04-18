package androidx.compose.material3;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
final class TabRowKt$ScrollableTabRowWithSubcomposeImpl$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollState f11881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f11882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11883c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f11884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11885g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRowWithSubcomposeImpl$1(float f2, int i2, ScrollState scrollState, p pVar, p pVar2, q qVar) {
        super(2);
        this.f11881a = scrollState;
        this.f11882b = f2;
        this.f11883c = pVar;
        this.d = pVar2;
        this.f11884f = qVar;
        this.f11885g = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Object u2 = composer.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.g(composer));
                composer.o(compositionScopedCoroutineScopeCanceller);
                u2 = compositionScopedCoroutineScopeCanceller;
            }
            d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u2).f13774a;
            ScrollState scrollState = this.f11881a;
            boolean I = composer.I(scrollState) | composer.I(d0Var);
            Object u3 = composer.u();
            if (I || u3 == composer$Companion$Empty$1) {
                u3 = new ScrollableTabData(scrollState, d0Var);
                composer.o(u3);
            }
            ScrollableTabData scrollableTabData = (ScrollableTabData) u3;
            Modifier b2 = ClipKt.b(SelectableGroupKt.a(ScrollKt.a(SizeKt.u(SizeKt.d(Modifier.Companion.f14687a, 1.0f), Alignment.Companion.d, 2), scrollState)));
            boolean b3 = composer.b(this.f11882b) | composer.I(this.f11883c) | composer.I(this.d) | composer.I(this.f11884f) | composer.w(scrollableTabData) | composer.c(this.f11885g);
            float f2 = this.f11882b;
            p pVar = this.f11883c;
            p pVar2 = this.d;
            int i2 = this.f11885g;
            q qVar = this.f11884f;
            Object u4 = composer.u();
            if (b3 || u4 == composer$Companion$Empty$1) {
                u4 = new TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1(f2, pVar, pVar2, scrollableTabData, i2, qVar);
                composer.o(u4);
            }
            SubcomposeLayoutKt.a(b2, (p) u4, composer, 0, 0);
        }
        return b0.f30125a;
    }
}
