package qc;

import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes3.dex */
public final class u0 {
    public final CoroutineContext a;

    /* renamed from: b, reason: collision with root package name */
    public Messenger f23882b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingDeque f23883c;

    /* renamed from: d, reason: collision with root package name */
    public final v1.x f23884d;

    public u0(CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.a = backgroundDispatcher;
        this.f23883c = new LinkedBlockingDeque(20);
        this.f23884d = new v1.x(this, 1);
    }

    public static final Message a(u0 u0Var, List list, int i10) {
        Object obj;
        boolean z10;
        u0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        return (Message) obj;
    }

    public final void b(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = this.f23883c;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public final void c(int i10) {
        ArrayList arrayList = new ArrayList();
        this.f23883c.drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.a), null, null, new t0(this, arrayList, null), 3, null);
    }
}
