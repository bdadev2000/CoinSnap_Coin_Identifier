package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class DatePickerDialog_androidKt$DatePickerDialog$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Shape f8740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8742c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f8743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f8744g;

    /* renamed from: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f8745a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f8746b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f8747c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar, p pVar2, q qVar) {
            super(2);
            this.f8745a = qVar;
            this.f8746b = pVar;
            this.f8747c = pVar2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.f3776g;
                Modifier.Companion companion = Modifier.Companion.f14687a;
                ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$SpaceBetween$1, Alignment.Companion.f14669m, composer, 6);
                int E = composer.E();
                PersistentCompositionLocalMap m2 = composer.m();
                Modifier c2 = ComposedModifierKt.c(composer, companion);
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
                p pVar = ComposeUiNode.Companion.f15898g;
                Updater.b(composer, a2, pVar);
                p pVar2 = ComposeUiNode.Companion.f15897f;
                Updater.b(composer, m2, pVar2);
                p pVar3 = ComposeUiNode.Companion.f15900i;
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                    d.w(E, composer, E, pVar3);
                }
                p pVar4 = ComposeUiNode.Companion.d;
                Updater.b(composer, c2, pVar4);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3837a;
                Modifier c3 = columnScopeInstance.c(1.0f, false);
                BiasAlignment biasAlignment = Alignment.Companion.f14659a;
                MeasurePolicy e = BoxKt.e(biasAlignment, false);
                int E2 = composer.E();
                PersistentCompositionLocalMap m3 = composer.m();
                Modifier c4 = ComposedModifierKt.c(composer, c3);
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
                Updater.b(composer, e, pVar);
                Updater.b(composer, m3, pVar2);
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E2))) {
                    d.w(E2, composer, E2, pVar3);
                }
                Updater.b(composer, c4, pVar4);
                this.f8745a.invoke(columnScopeInstance, composer, 6);
                composer.p();
                Modifier e2 = PaddingKt.e(columnScopeInstance.a(companion, Alignment.Companion.f14671o), DatePickerDialog_androidKt.f8737a);
                MeasurePolicy e3 = BoxKt.e(biasAlignment, false);
                int E3 = composer.E();
                PersistentCompositionLocalMap m4 = composer.m();
                Modifier c5 = ComposedModifierKt.c(composer, e2);
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
                Updater.b(composer, e3, pVar);
                Updater.b(composer, m4, pVar2);
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E3))) {
                    d.w(E3, composer, E3, pVar3);
                }
                Updater.b(composer, c5, pVar4);
                ShapeKeyTokens shapeKeyTokens = DialogTokens.f13311a;
                ProvideContentColorTextStyleKt.a(ColorSchemeKt.f(ColorSchemeKeyTokens.f13278n, composer), TypographyKt.a(TypographyKeyTokens.f13649j, composer), ComposableLambdaKt.c(642347978, new DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1(this.f8746b, this.f8747c), composer), composer, 384);
                composer.p();
                composer.p();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerDialog_androidKt$DatePickerDialog$1(Shape shape, DatePickerColors datePickerColors, float f2, q qVar, p pVar, p pVar2) {
        super(2);
        this.f8740a = shape;
        this.f8741b = datePickerColors;
        this.f8742c = f2;
        this.d = qVar;
        this.f8743f = pVar;
        this.f8744g = pVar2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            SurfaceKt.a(SizeKt.g(SizeKt.m(Modifier.Companion.f14687a, DatePickerModalTokens.f13291c), 0.0f, DatePickerModalTokens.f13289a, 1), this.f8740a, this.f8741b.f8702a, 0L, this.f8742c, 0.0f, null, ComposableLambdaKt.c(-1706202235, new AnonymousClass1(this.f8743f, this.f8744g, this.d), composer), composer, 12582918, 104);
        }
        return b0.f30125a;
    }
}
