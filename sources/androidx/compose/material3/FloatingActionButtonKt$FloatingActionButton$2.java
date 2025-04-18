package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class FloatingActionButtonKt$FloatingActionButton$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9482b;

    /* renamed from: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f9483a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar) {
            super(2);
            this.f9483a = pVar;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                Modifier a2 = SizeKt.a(Modifier.Companion.f14687a, FabPrimaryTokens.d, FabPrimaryTokens.f13344b);
                MeasurePolicy e = BoxKt.e(Alignment.Companion.e, false);
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
                this.f9483a.invoke(composer, 0);
                composer.p();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$FloatingActionButton$2(long j2, p pVar) {
        super(2);
        this.f9481a = j2;
        this.f9482b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ProvideContentColorTextStyleKt.a(this.f9481a, TypographyKt.a(ExtendedFabPrimaryTokens.f13336b, composer), ComposableLambdaKt.c(-1771489750, new AnonymousClass1(this.f9482b), composer), composer, 384);
        }
        return b0.f30125a;
    }
}
