package androidx.compose.foundation.text;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.DpSize;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class AndroidCursorHandle_androidKt$CursorHandle$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f5396b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$CursorHandle$1(long j2, Modifier modifier) {
        super(2);
        this.f5395a = j2;
        this.f5396b = modifier;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            long j2 = this.f5395a;
            if (j2 != 9205357640488583168L) {
                composer.J(1828881000);
                Modifier l2 = SizeKt.l(this.f5396b, DpSize.b(j2), DpSize.a(j2), 0.0f, 0.0f, 12);
                MeasurePolicy e = BoxKt.e(Alignment.Companion.f14660b, false);
                int E = composer.E();
                PersistentCompositionLocalMap m2 = composer.m();
                Modifier c2 = ComposedModifierKt.c(composer, l2);
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
                AndroidCursorHandle_androidKt.b(null, composer, 0, 1);
                composer.p();
                composer.D();
            } else {
                composer.J(1829217412);
                AndroidCursorHandle_androidKt.b(this.f5396b, composer, 0, 0);
                composer.D();
            }
        }
        return b0.f30125a;
    }
}
