package androidx.compose.foundation.text.selection;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpSize;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidSelectionHandles_androidKt$SelectionHandle$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f7015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7017c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f7018f;

    /* renamed from: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f7019a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f7020b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Modifier f7021c;
        public final /* synthetic */ OffsetProvider d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j2, boolean z2, Modifier modifier, OffsetProvider offsetProvider) {
            super(2);
            this.f7019a = j2;
            this.f7020b = z2;
            this.f7021c = modifier;
            this.d = offsetProvider;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                long j2 = this.f7019a;
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
                OffsetProvider offsetProvider = this.d;
                boolean z2 = this.f7020b;
                if (j2 != 9205357640488583168L) {
                    composer.J(-837727128);
                    Arrangement.Horizontal horizontal = z2 ? Arrangement.Absolute.f3779b : Arrangement.Absolute.f3778a;
                    Modifier l2 = SizeKt.l(this.f7021c, DpSize.b(j2), DpSize.a(j2), 0.0f, 0.0f, 12);
                    RowMeasurePolicy a2 = RowKt.a(horizontal, Alignment.Companion.f14666j, composer, 0);
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
                    Updater.b(composer, a2, ComposeUiNode.Companion.f15898g);
                    Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
                    p pVar = ComposeUiNode.Companion.f15900i;
                    if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                        d.w(E, composer, E, pVar);
                    }
                    Updater.b(composer, c2, ComposeUiNode.Companion.d);
                    Modifier.Companion companion = Modifier.Companion.f14687a;
                    boolean w = composer.w(offsetProvider);
                    Object u2 = composer.u();
                    if (w || u2 == composer$Companion$Empty$1) {
                        u2 = new AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1$1$1(offsetProvider);
                        composer.o(u2);
                    }
                    AndroidSelectionHandles_androidKt.c(companion, (q0.a) u2, z2, composer, 6);
                    composer.p();
                    composer.D();
                } else {
                    composer.J(-836867312);
                    boolean w2 = composer.w(offsetProvider);
                    Object u3 = composer.u();
                    if (w2 || u3 == composer$Companion$Empty$1) {
                        u3 = new AndroidSelectionHandles_androidKt$SelectionHandle$1$1$2$1(offsetProvider);
                        composer.o(u3);
                    }
                    AndroidSelectionHandles_androidKt.c(this.f7021c, (q0.a) u3, z2, composer, 0);
                    composer.D();
                }
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1(ViewConfiguration viewConfiguration, long j2, boolean z2, Modifier modifier, OffsetProvider offsetProvider) {
        super(2);
        this.f7015a = viewConfiguration;
        this.f7016b = j2;
        this.f7017c = z2;
        this.d = modifier;
        this.f7018f = offsetProvider;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            CompositionLocalKt.a(CompositionLocalsKt.f16445q.c(this.f7015a), ComposableLambdaKt.c(-1426434671, new AnonymousClass1(this.f7016b, this.f7017c, this.d, this.f7018f), composer), composer, 56);
        }
        return b0.f30125a;
    }
}
