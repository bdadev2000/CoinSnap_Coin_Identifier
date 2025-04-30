package p5;

import Q7.InterfaceC0253v;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t7.AbstractC2712a;
import u4.C2764i;
import u7.AbstractC2816g;
import u7.C2813d;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes2.dex */
public final class Q extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f22293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ U4.y f22294h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f22295i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U4.y yVar, ArrayList arrayList, w7.f fVar) {
        super(2, fVar);
        this.f22294h = yVar;
        this.f22295i = arrayList;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new Q(this.f22294h, (ArrayList) this.f22295i, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((Q) c((InterfaceC0253v) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Comparator] */
    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f22293g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            q5.c cVar = q5.c.f22796a;
            this.f22293g = 1;
            obj = cVar.b(this);
            if (obj == enumC2928a) {
                return enumC2928a;
            }
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((C2764i) it.next()).f23123a.c()) {
                        U4.y yVar = this.f22294h;
                        List list = this.f22295i;
                        for (Message message : AbstractC2816g.R(new Object(), AbstractC2816g.J(new ArrayList(new C2813d(new Message[]{U4.y.a(yVar, list, 2), U4.y.a(yVar, list, 1)}, true))))) {
                            if (((Messenger) yVar.b) != null) {
                                try {
                                    Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                    Messenger messenger = (Messenger) yVar.b;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e4) {
                                    Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e4);
                                    yVar.i(message);
                                }
                            } else {
                                yVar.i(message);
                            }
                        }
                    }
                }
            }
            Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
        }
        return t7.y.f23029a;
    }
}
