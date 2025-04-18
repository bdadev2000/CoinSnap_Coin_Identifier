package androidx.compose.material3;

import androidx.compose.ui.focus.FocusManager;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.SearchBarDefaults$InputField$5$1", f = "SearchBar.android.kt", l = {571}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SearchBarDefaults$InputField$5$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FocusManager f10879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$5$1(boolean z2, FocusManager focusManager, g gVar) {
        super(2, gVar);
        this.f10878b = z2;
        this.f10879c = focusManager;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SearchBarDefaults$InputField$5$1(this.f10878b, this.f10879c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchBarDefaults$InputField$5$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f10877a;
        if (i2 == 0) {
            q.m(obj);
            if (this.f10878b) {
                this.f10877a = 1;
                if (p0.a.L(100L, this) == aVar) {
                    return aVar;
                }
            }
            return b0.f30125a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        this.f10879c.q(false);
        return b0.f30125a;
    }
}
