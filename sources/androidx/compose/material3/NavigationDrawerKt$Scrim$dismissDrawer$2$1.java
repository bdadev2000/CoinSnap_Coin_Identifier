package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavigationDrawerKt$Scrim$dismissDrawer$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f10198b;

    /* renamed from: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.a f10199a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q0.a aVar) {
            super(0);
            this.f10199a = aVar;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f10199a.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$dismissDrawer$2$1(String str, q0.a aVar) {
        super(1);
        this.f10197a = str;
        this.f10198b = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.l(semanticsPropertyReceiver, this.f10197a);
        SemanticsPropertiesKt.h(semanticsPropertyReceiver, new AnonymousClass1(this.f10198b));
        return b0.f30125a;
    }
}
