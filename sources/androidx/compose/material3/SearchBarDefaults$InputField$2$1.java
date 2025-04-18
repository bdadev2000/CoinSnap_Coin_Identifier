package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;

/* loaded from: classes4.dex */
final class SearchBarDefaults$InputField$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10865c;
    public final /* synthetic */ FocusRequester d;

    /* renamed from: androidx.compose.material3.SearchBarDefaults$InputField$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FocusRequester f10866a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FocusRequester focusRequester) {
            super(0);
            this.f10866a = focusRequester;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f10866a.b();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$2$1(String str, boolean z2, String str2, FocusRequester focusRequester) {
        super(1);
        this.f10863a = str;
        this.f10864b = z2;
        this.f10865c = str2;
        this.d = focusRequester;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.l(semanticsPropertyReceiver, this.f10863a);
        if (this.f10864b) {
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16834c;
            n nVar = SemanticsPropertiesKt.f16865a[0];
            semanticsPropertyKey.getClass();
            semanticsPropertyReceiver.b(semanticsPropertyKey, this.f10865c);
        }
        SemanticsPropertiesKt.h(semanticsPropertyReceiver, new AnonymousClass1(this.d));
        return b0.f30125a;
    }
}
