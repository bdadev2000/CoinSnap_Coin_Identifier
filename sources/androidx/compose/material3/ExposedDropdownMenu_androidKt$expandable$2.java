package androidx.compose.material3;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;

/* loaded from: classes3.dex */
final class ExposedDropdownMenu_androidKt$expandable$2 extends r implements l {

    /* renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.a f9383a = null;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f9384b = null;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f9385c = null;

        public AnonymousClass1() {
            super(0);
        }

        @Override // q0.a
        public final Object invoke() {
            SoftwareKeyboardController softwareKeyboardController;
            this.f9383a.invoke();
            if (p0.a.g(this.f9384b, "PrimaryEditable") && (softwareKeyboardController = this.f9385c) != null) {
                softwareKeyboardController.show();
            }
            return Boolean.TRUE;
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        if (p0.a.g(null, "SecondaryEditable")) {
            SemanticsPropertiesKt.r(semanticsPropertyReceiver, 0);
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16834c;
            n nVar = SemanticsPropertiesKt.f16865a[0];
            semanticsPropertyKey.getClass();
            semanticsPropertyReceiver.b(semanticsPropertyKey, null);
            SemanticsPropertiesKt.l(semanticsPropertyReceiver, null);
        } else {
            SemanticsPropertiesKt.r(semanticsPropertyReceiver, 6);
        }
        SemanticsPropertiesKt.h(semanticsPropertyReceiver, new AnonymousClass1());
        return b0.f30125a;
    }
}
