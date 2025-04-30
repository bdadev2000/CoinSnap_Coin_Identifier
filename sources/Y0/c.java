package y0;

import F7.p;
import Q7.InterfaceC0253v;
import android.net.Uri;
import t7.AbstractC2712a;
import t7.y;
import w7.f;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class c extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f24281g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f24282h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Uri f24283i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Uri uri, f fVar) {
        super(2, fVar);
        this.f24282h = dVar;
        this.f24283i = uri;
    }

    @Override // y7.AbstractC2952a
    public final f c(Object obj, f fVar) {
        return new c(this.f24282h, this.f24283i, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((c) c((InterfaceC0253v) obj, (f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f24281g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            A0.d dVar = this.f24282h.f24284a;
            this.f24281g = 1;
            if (dVar.d(this.f24283i, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return y.f23029a;
    }
}
