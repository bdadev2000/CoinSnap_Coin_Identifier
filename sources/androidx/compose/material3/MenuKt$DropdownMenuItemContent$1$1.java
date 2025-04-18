package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MenuKt$DropdownMenuItemContent$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f9760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemColors f9761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9762c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RowScope f9763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f9764g;

    /* renamed from: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f9765a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar) {
            super(2);
            this.f9765a = pVar;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                Modifier b2 = SizeKt.b(Modifier.Companion.f14687a, ListTokens.f13424l, 0.0f, 2);
                MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
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
                this.f9765a.invoke(composer, 0);
                composer.p();
            }
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RowScope f9766a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f9767b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f9768c;
        public final /* synthetic */ p d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RowScope rowScope, p pVar, p pVar2, p pVar3) {
            super(2);
            this.f9766a = rowScope;
            this.f9767b = pVar;
            this.f9768c = pVar2;
            this.d = pVar3;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                Modifier j2 = PaddingKt.j(this.f9766a.a(Modifier.Companion.f14687a, 1.0f, true), this.f9767b != null ? MenuKt.f9739c : 0, 0.0f, this.f9768c != null ? MenuKt.f9739c : 0, 0.0f, 10);
                MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
                int E = composer.E();
                PersistentCompositionLocalMap m2 = composer.m();
                Modifier c2 = ComposedModifierKt.c(composer, j2);
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
                this.d.invoke(composer, 0);
                composer.p();
            }
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass3 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f9769a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(p pVar) {
            super(2);
            this.f9769a = pVar;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                Modifier b2 = SizeKt.b(Modifier.Companion.f14687a, ListTokens.f13432t, 0.0f, 2);
                MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
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
                this.f9769a.invoke(composer, 0);
                composer.p();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuItemContent$1$1(p pVar, MenuItemColors menuItemColors, boolean z2, p pVar2, p pVar3) {
        super(2);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
        this.f9760a = pVar;
        this.f9761b = menuItemColors;
        this.f9762c = z2;
        this.d = pVar2;
        this.f9763f = rowScopeInstance;
        this.f9764g = pVar3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            composer.J(1264683960);
            boolean z2 = this.f9762c;
            MenuItemColors menuItemColors = this.f9761b;
            p pVar = this.f9760a;
            if (pVar != null) {
                CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(z2 ? menuItemColors.f9734b : menuItemColors.e, ContentColorKt.f8654a), ComposableLambdaKt.c(2035552199, new AnonymousClass1(pVar), composer), composer, 56);
            }
            composer.D();
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.f8654a;
            ProvidedValue d = androidx.compose.foundation.text.input.a.d(z2 ? menuItemColors.f9733a : menuItemColors.d, dynamicProvidableCompositionLocal);
            p pVar2 = this.f9764g;
            RowScope rowScope = this.f9763f;
            p pVar3 = this.d;
            CompositionLocalKt.a(d, ComposableLambdaKt.c(-1728894036, new AnonymousClass2(rowScope, pVar, pVar3, pVar2), composer), composer, 56);
            if (pVar3 != null) {
                CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(z2 ? menuItemColors.f9735c : menuItemColors.f9736f, dynamicProvidableCompositionLocal), ComposableLambdaKt.c(580312062, new AnonymousClass3(pVar3), composer), composer, 56);
            }
        }
        return b0.f30125a;
    }
}
