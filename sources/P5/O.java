package p5;

import Q7.InterfaceC0253v;
import android.util.Log;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import t7.AbstractC2712a;
import u4.C2763h;
import u4.C2764i;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes2.dex */
public final class O extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f22291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f22292h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(String str, w7.f fVar) {
        super(2, fVar);
        this.f22292h = str;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new O(this.f22292h, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((O) c((InterfaceC0253v) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f22291g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            q5.c cVar = q5.c.f22796a;
            this.f22291g = 1;
            obj = cVar.b(this);
            if (obj == enumC2928a) {
                return enumC2928a;
            }
        }
        Collection<C2764i> values = ((Map) obj).values();
        String str = this.f22292h;
        for (C2764i c2764i : values) {
            q5.e eVar = new q5.e(str);
            c2764i.getClass();
            String str2 = "App Quality Sessions session changed: " + eVar;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            C2763h c2763h = c2764i.b;
            synchronized (c2763h) {
                if (!Objects.equals((String) c2763h.f23122d, str)) {
                    C2763h.a((z4.c) c2763h.f23121c, c2763h.b, str);
                    c2763h.f23122d = str;
                }
            }
            Log.d("SessionLifecycleClient", "Notified " + q5.d.b + " of new session " + str);
        }
        return t7.y.f23029a;
    }
}
