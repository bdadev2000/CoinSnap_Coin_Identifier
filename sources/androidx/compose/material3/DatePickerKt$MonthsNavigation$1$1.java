package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DatePickerKt$MonthsNavigation$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f8918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8920c;
    public final /* synthetic */ q0.a d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f8921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0.a f8922g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f8923h;

    /* renamed from: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f8924a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(2);
            this.f8924a = str;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                String str = this.f8924a;
                Modifier.Companion companion = Modifier.Companion.f14687a;
                boolean I = composer.I(str);
                Object u2 = composer.u();
                if (I || u2 == Composer.Companion.f13690a) {
                    u2 = new DatePickerKt$MonthsNavigation$1$1$1$1$1(this.f8924a);
                    composer.o(u2);
                }
                TextKt.b(str, SemanticsModifierKt.b(companion, false, (l) u2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131068);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$MonthsNavigation$1$1(q0.a aVar, boolean z2, String str, q0.a aVar2, boolean z3, q0.a aVar3, boolean z4) {
        super(2);
        this.f8918a = aVar;
        this.f8919b = z2;
        this.f8920c = str;
        this.d = aVar2;
        this.f8921f = z3;
        this.f8922g = aVar3;
        this.f8923h = z4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            DatePickerKt.m(this.f8918a, this.f8919b, null, ComposableLambdaKt.c(1377272806, new AnonymousClass1(this.f8920c), composer), composer, 3072, 4);
            if (!this.f8919b) {
                q0.a aVar = this.d;
                boolean z2 = this.f8921f;
                q0.a aVar2 = this.f8922g;
                boolean z3 = this.f8923h;
                Modifier.Companion companion = Modifier.Companion.f14687a;
                RowMeasurePolicy a2 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14666j, composer, 0);
                int E = composer.E();
                PersistentCompositionLocalMap m2 = composer.m();
                Modifier c2 = ComposedModifierKt.c(composer, companion);
                ComposeUiNode.h8.getClass();
                q0.a aVar3 = ComposeUiNode.Companion.f15895b;
                if (!(composer.j() instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                composer.z();
                if (composer.e()) {
                    composer.B(aVar3);
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
                IconButtonKt.a(aVar, null, z2, null, null, ComposableSingletons$DatePickerKt.f8599c, composer, 196608, 26);
                IconButtonKt.a(aVar2, null, z3, null, null, ComposableSingletons$DatePickerKt.d, composer, 196608, 26);
                composer.p();
            }
        }
        return b0.f30125a;
    }
}
