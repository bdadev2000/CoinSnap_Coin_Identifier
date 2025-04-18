package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class ModalBottomSheetKt$Scrim$dismissSheet$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f9929b;

    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.a f9930a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q0.a aVar) {
            super(0);
            this.f9930a = aVar;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f9930a.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$dismissSheet$2$1(String str, q0.a aVar) {
        super(1);
        this.f9928a = str;
        this.f9929b = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.u(semanticsPropertyReceiver, 1.0f);
        SemanticsPropertiesKt.l(semanticsPropertyReceiver, this.f9928a);
        SemanticsPropertiesKt.h(semanticsPropertyReceiver, new AnonymousClass1(this.f9929b));
        return b0.f30125a;
    }
}
