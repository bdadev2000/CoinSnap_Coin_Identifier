package p5;

import android.util.Log;
import h0.C2312b;
import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes2.dex */
public final class z extends AbstractC2960i implements F7.q {

    /* renamed from: g, reason: collision with root package name */
    public int f22369g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ T7.c f22370h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Throwable f22371i;

    /* JADX WARN: Type inference failed for: r0v0, types: [p5.z, y7.i] */
    @Override // F7.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        ?? abstractC2960i = new AbstractC2960i(3, (w7.f) obj3);
        abstractC2960i.f22370h = (T7.c) obj;
        abstractC2960i.f22371i = (Throwable) obj2;
        return abstractC2960i.i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f22369g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            T7.c cVar = this.f22370h;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f22371i);
            C2312b c2312b = new C2312b(true);
            this.f22370h = null;
            this.f22369g = 1;
            if (cVar.a(c2312b, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return t7.y.f23029a;
    }
}
