package U4;

import P1.C0229c;
import Q7.AbstractC0255x;
import Q7.InterfaceC0253v;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Message;
import android.util.Log;
import com.facebook.internal.C1838g;
import com.google.android.gms.tasks.Task;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p5.Q;
import q4.C2643b;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static y f3333e;

    /* renamed from: a, reason: collision with root package name */
    public Object f3334a;
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3335c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3336d;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f3334a = obj;
        this.b = obj2;
        this.f3335c = obj3;
        this.f3336d = obj4;
    }

    public static final Message a(y yVar, List list, int i9) {
        Object obj;
        yVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i9) {
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

    public static synchronized y e() {
        y yVar;
        synchronized (y.class) {
            try {
                if (f3333e == null) {
                    f3333e = new y(0);
                }
                yVar = f3333e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yVar;
    }

    public synchronized void b(N1.f fVar, P1.v vVar) {
        C0229c c0229c = (C0229c) ((HashMap) this.b).put(fVar, new C0229c(fVar, vVar, (ReferenceQueue) this.f3335c));
        if (c0229c != null) {
            c0229c.f2295c = null;
            c0229c.clear();
        }
    }

    public void c(C0229c c0229c) {
        P1.B b;
        synchronized (this) {
            ((HashMap) this.b).remove(c0229c.f2294a);
            if (c0229c.b && (b = c0229c.f2295c) != null) {
                ((P1.n) ((P1.u) this.f3336d)).e(c0229c.f2294a, new P1.v(b, true, false, c0229c.f2294a, (P1.u) this.f3336d));
            }
        }
    }

    public void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((x.l) this.b).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    d(arrayList2.get(i9), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public boolean f(Context context) {
        boolean z8;
        if (((Boolean) this.f3335c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f3335c = Boolean.valueOf(z8);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f3335c).booleanValue();
    }

    public boolean g(Context context) {
        boolean z8;
        if (((Boolean) this.b) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.b = Boolean.valueOf(z8);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.b).booleanValue();
    }

    public void h(e0.o oVar) {
        S7.h hVar;
        Object m = ((S7.c) this.f3335c).m(oVar);
        Throwable th = null;
        if (m instanceof S7.h) {
            if (m instanceof S7.h) {
                hVar = (S7.h) m;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                th = hVar.f2841a;
            }
            if (th == null) {
                throw new IllegalStateException("Channel was closed normally");
            }
            throw th;
        }
        if (!(m instanceof S7.i)) {
            if (((AtomicInteger) this.f3336d).getAndIncrement() == 0) {
                AbstractC0255x.l((InterfaceC0253v) this.f3334a, null, null, new e0.l(this, null), 3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void i(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f3335c;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public void j(int i9) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f3335c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i9, 0, 0);
        G7.j.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        AbstractC0255x.l(AbstractC0255x.a((w7.k) this.f3334a), null, null, new Q(this, arrayList, null), 3);
    }

    public Task k(Callable callable) {
        Task continueWith;
        synchronized (this.f3335c) {
            continueWith = ((Task) this.b).continueWith((Executor) this.f3334a, new C1838g(callable));
            this.b = continueWith.continueWith((Executor) this.f3334a, new C2643b(2));
        }
        return continueWith;
    }

    public Task l(Callable callable) {
        Task continueWithTask;
        synchronized (this.f3335c) {
            continueWithTask = ((Task) this.b).continueWithTask((Executor) this.f3334a, new C1838g(callable));
            this.b = continueWithTask.continueWith((Executor) this.f3334a, new C2643b(2));
        }
        return continueWithTask;
    }

    public y(Typeface typeface, k0.b bVar) {
        int i9;
        int i10;
        this.f3336d = typeface;
        this.f3334a = bVar;
        this.f3335c = new j0.r(1024);
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i11 = a6 + bVar.f21396a;
            i9 = bVar.b.getInt(bVar.b.getInt(i11) + i11);
        } else {
            i9 = 0;
        }
        this.b = new char[i9 * 2];
        int a9 = bVar.a(6);
        if (a9 != 0) {
            int i12 = a9 + bVar.f21396a;
            i10 = bVar.b.getInt(bVar.b.getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            j0.u uVar = new j0.u(this, i13);
            k0.a c9 = uVar.c();
            int a10 = c9.a(4);
            Character.toChars(a10 != 0 ? c9.b.getInt(a10 + c9.f21396a) : 0, (char[]) this.b, i13 * 2);
            C2.m.e("invalid metadata codepoint length", uVar.b() > 0);
            ((j0.r) this.f3335c).a(uVar, 0, uVar.b() - 1);
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public y(int i9) {
        switch (i9) {
            case 2:
                this.f3334a = new S.d(10);
                this.b = new x.l();
                this.f3335c = new ArrayList();
                this.f3336d = new HashSet();
                return;
            case 3:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new Object());
                this.b = new HashMap();
                this.f3335c = new ReferenceQueue();
                this.f3334a = newSingleThreadExecutor;
                newSingleThreadExecutor.execute(new B3.k(this, 3));
                return;
            case 8:
                this.b = null;
                this.f3335c = new ArrayList();
                this.f3336d = null;
                this.f3334a = "";
                return;
            default:
                this.f3334a = null;
                this.b = null;
                this.f3335c = null;
                this.f3336d = new ArrayDeque();
                return;
        }
    }
}
