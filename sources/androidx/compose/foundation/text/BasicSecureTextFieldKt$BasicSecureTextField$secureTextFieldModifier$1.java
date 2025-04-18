package androidx.compose.foundation.text;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;

/* loaded from: classes4.dex */
final class BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1 f5448a = new r(1);

    /* renamed from: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f5449a = new r(0);

        @Override // q0.a
        public final Object invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass2 f5450a = new r(0);

        @Override // q0.a
        public final Object invoke() {
            return Boolean.FALSE;
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.D;
        b0 b0Var = b0.f30125a;
        semanticsPropertyReceiver.b(semanticsPropertyKey, b0Var);
        SemanticsPropertiesKt.c(semanticsPropertyReceiver, AnonymousClass1.f5449a);
        SemanticsPropertiesKt.d(semanticsPropertyReceiver, AnonymousClass2.f5450a);
        return b0Var;
    }
}
