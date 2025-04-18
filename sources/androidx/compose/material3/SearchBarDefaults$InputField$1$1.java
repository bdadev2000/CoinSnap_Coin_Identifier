package androidx.compose.material3;

import androidx.compose.ui.focus.FocusState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SearchBarDefaults$InputField$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f10862a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$1$1(l lVar) {
        super(1);
        this.f10862a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (((FocusState) obj).a()) {
            this.f10862a.invoke(Boolean.TRUE);
        }
        return b0.f30125a;
    }
}
