package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
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
/* loaded from: classes.dex */
public final class AndroidDialog_androidKt$Dialog$dialog$1$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f17606a;

    /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f17607a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            n[] nVarArr = SemanticsPropertiesKt.f16865a;
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16848s;
            b0 b0Var = b0.f30125a;
            ((SemanticsPropertyReceiver) obj).b(semanticsPropertyKey, b0Var);
            return b0Var;
        }
    }

    /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass2 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ State f17608a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(State state) {
            super(2);
            this.f17608a = state;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                ((p) this.f17608a.getValue()).invoke(composer, 0);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$dialog$1$1$1(MutableState mutableState) {
        super(2);
        this.f17606a = mutableState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            AndroidDialog_androidKt.b(SemanticsModifierKt.b(Modifier.Companion.f14687a, false, AnonymousClass1.f17607a), ComposableLambdaKt.c(-533674951, new AnonymousClass2(this.f17606a), composer), composer, 48, 0);
        }
        return b0.f30125a;
    }
}
