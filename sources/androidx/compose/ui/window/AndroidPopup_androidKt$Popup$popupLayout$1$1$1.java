package androidx.compose.ui.window;

import android.support.v4.media.d;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import x0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ State f17649b;

    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f17650a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            n[] nVarArr = SemanticsPropertiesKt.f16865a;
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16847r;
            b0 b0Var = b0.f30125a;
            ((SemanticsPropertyReceiver) obj).b(semanticsPropertyKey, b0Var);
            return b0Var;
        }
    }

    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass3 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ State f17652a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(State state) {
            super(2);
            this.f17652a = state;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.f17615a;
                ((p) this.f17652a.getValue()).invoke(composer, 0);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$popupLayout$1$1$1(PopupLayout popupLayout, MutableState mutableState) {
        super(2);
        this.f17648a = popupLayout;
        this.f17649b = mutableState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier b2 = SemanticsModifierKt.b(Modifier.Companion.f14687a, false, AnonymousClass1.f17650a);
            PopupLayout popupLayout = this.f17648a;
            boolean w = composer.w(popupLayout);
            Object u2 = composer.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1(popupLayout);
                composer.o(u2);
            }
            Modifier a2 = AlphaKt.a(OnRemeasuredModifierKt.a(b2, (l) u2), popupLayout.getCanCalculatePosition() ? 1.0f : 0.0f);
            ComposableLambdaImpl c2 = ComposableLambdaKt.c(606497925, new AnonymousClass3(this.f17649b), composer);
            AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f17656a;
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c3 = ComposedModifierKt.c(composer, a2);
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
            Updater.b(composer, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c3, ComposeUiNode.Companion.d);
            c2.invoke(composer, 6);
            composer.p();
        }
        return b0.f30125a;
    }
}
