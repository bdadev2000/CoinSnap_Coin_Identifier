package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
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
/* loaded from: classes2.dex */
public final class ButtonKt$Button$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f8055c;

    /* renamed from: androidx.compose.material3.ButtonKt$Button$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f8056a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f8057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PaddingValues paddingValues, q qVar) {
            super(2);
            this.f8056a = paddingValues;
            this.f8057b = qVar;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                Modifier e = PaddingKt.e(SizeKt.a(Modifier.Companion.f14687a, ButtonDefaults.f8039c, ButtonDefaults.d), this.f8056a);
                RowMeasurePolicy a2 = RowKt.a(Arrangement.e, Alignment.Companion.f14667k, composer, 54);
                int E = composer.E();
                PersistentCompositionLocalMap m2 = composer.m();
                Modifier c2 = ComposedModifierKt.c(composer, e);
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
                this.f8057b.invoke(RowScopeInstance.f4094a, composer, 6);
                composer.p();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonKt$Button$2(long j2, PaddingValues paddingValues, q qVar) {
        super(2);
        this.f8053a = j2;
        this.f8054b = paddingValues;
        this.f8055c = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ProvideContentColorTextStyleKt.a(this.f8053a, MaterialTheme.b(composer).f12628m, ComposableLambdaKt.c(1327513942, new AnonymousClass1(this.f8054b, this.f8055c), composer), composer, 384);
        }
        return b0.f30125a;
    }
}
