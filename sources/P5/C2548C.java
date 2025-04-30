package p5;

import Q7.InterfaceC0253v;
import android.content.Context;
import android.util.Log;
import e0.InterfaceC2208i;
import java.io.IOException;
import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* renamed from: p5.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2548C extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f22250g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2549D f22251h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f22252i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2548C(C2549D c2549d, String str, w7.f fVar) {
        super(2, fVar);
        this.f22251h = c2549d;
        this.f22252i = str;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new C2548C(this.f22251h, this.f22252i, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C2548C) c((InterfaceC0253v) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f22250g;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC2712a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC2712a.f(obj);
                x xVar = C2549D.f22253e;
                Context context = this.f22251h.f22255a;
                xVar.getClass();
                InterfaceC2208i interfaceC2208i = (InterfaceC2208i) C2549D.f22254f.a(x.f22367a[0], context);
                C2547B c2547b = new C2547B(this.f22252i, null);
                this.f22250g = 1;
                if (interfaceC2208i.a(new h0.h(c2547b, null), this) == enumC2928a) {
                    return enumC2928a;
                }
            }
        } catch (IOException e4) {
            Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e4);
        }
        return t7.y.f23029a;
    }
}
