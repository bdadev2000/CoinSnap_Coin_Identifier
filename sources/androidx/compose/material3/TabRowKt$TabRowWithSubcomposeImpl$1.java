package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class TabRowKt$TabRowWithSubcomposeImpl$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f11961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRowWithSubcomposeImpl$1(p pVar, p pVar2, q qVar) {
        super(2);
        this.f11959a = pVar;
        this.f11960b = pVar2;
        this.f11961c = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier d = SizeKt.d(Modifier.Companion.f14687a, 1.0f);
            p pVar = this.f11959a;
            boolean I = composer.I(pVar);
            p pVar2 = this.f11960b;
            boolean I2 = I | composer.I(pVar2);
            q qVar = this.f11961c;
            boolean I3 = I2 | composer.I(qVar);
            Object u2 = composer.u();
            if (I3 || u2 == Composer.Companion.f13690a) {
                u2 = new TabRowKt$TabRowWithSubcomposeImpl$1$1$1(pVar, pVar2, qVar);
                composer.o(u2);
            }
            SubcomposeLayoutKt.a(d, (p) u2, composer, 6, 0);
        }
        return b0.f30125a;
    }
}
