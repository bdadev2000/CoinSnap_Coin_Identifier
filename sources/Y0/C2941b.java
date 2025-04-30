package y0;

import F7.p;
import Q7.InterfaceC0253v;
import android.net.Uri;
import android.view.InputEvent;
import t7.AbstractC2712a;
import t7.y;
import w7.f;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2941b extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f24277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f24278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Uri f24279i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InputEvent f24280j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2941b(d dVar, Uri uri, InputEvent inputEvent, f fVar) {
        super(2, fVar);
        this.f24278h = dVar;
        this.f24279i = uri;
        this.f24280j = inputEvent;
    }

    @Override // y7.AbstractC2952a
    public final f c(Object obj, f fVar) {
        return new C2941b(this.f24278h, this.f24279i, this.f24280j, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C2941b) c((InterfaceC0253v) obj, (f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f24277g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            A0.d dVar = this.f24278h.f24284a;
            this.f24277g = 1;
            if (dVar.c(this.f24279i, this.f24280j, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return y.f23029a;
    }
}
