package f4;

import A4.e;
import J1.C0209b;
import J1.g;
import J1.n;
import J1.o;
import J1.x;
import J1.z;
import Q7.AbstractC0251t;
import Q7.AbstractC0255x;
import V7.i;
import W1.w;
import a1.AbstractC0329c;
import android.app.Activity;
import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.app.AbstractC0407h;
import androidx.core.app.C0406g;
import androidx.core.view.ViewCompat;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b1.AbstractC0551d;
import c0.C0585d;
import c2.ViewTreeObserverOnDrawListenerC0593d;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.ar.core.H;
import d1.C2168i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import p1.C2537a;
import p4.k;
import q4.C2645d;
import u.BinderC2735d;
import u4.C2772q;
import w7.l;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class b implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20327c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20328d;

    public /* synthetic */ b(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f20327c = obj;
        this.f20328d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        ((java.lang.Runnable) r10.f20327c).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r10.f20327c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        p4.k.f22238h.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f20327c), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f20328d     // Catch: java.lang.Throwable -> L5e
            p4.k r2 = (p4.k) r2     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayDeque r2 = r2.f22239c     // Catch: java.lang.Throwable -> L5e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f20328d     // Catch: java.lang.Throwable -> L20
            p4.k r0 = (p4.k) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f22240d     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1f:
            return
        L20:
            r0 = move-exception
            goto L83
        L22:
            long r6 = r0.f22241f     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f22241f = r6     // Catch: java.lang.Throwable -> L20
            r0.f22240d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f20328d     // Catch: java.lang.Throwable -> L20
            p4.k r4 = (p4.k) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f22239c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f20327c = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4d
            java.lang.Object r0 = r10.f20328d     // Catch: java.lang.Throwable -> L20
            p4.k r0 = (p4.k) r0     // Catch: java.lang.Throwable -> L20
            r0.f22240d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4c:
            return
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f20327c     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
        L5b:
            r10.f20327c = r2     // Catch: java.lang.Throwable -> L5e
            goto L2
        L5e:
            r0 = move-exception
            goto L85
        L60:
            r0 = move-exception
            goto L80
        L62:
            r3 = move-exception
            java.util.logging.Logger r4 = p4.k.f22238h     // Catch: java.lang.Throwable -> L60
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r6.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r10.f20327c     // Catch: java.lang.Throwable -> L60
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L60
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
            goto L5b
        L80:
            r10.f20327c = r2     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L5e
        L85:
            if (r1 == 0) goto L8e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.b.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                a aVar = (a) this.f20328d;
                try {
                    aVar.onSuccess(y8.a.k((c) ((Future) this.f20327c)));
                    return;
                } catch (Error e4) {
                    e = e4;
                    aVar.onFailure(e);
                    return;
                } catch (RuntimeException e9) {
                    e = e9;
                    aVar.onFailure(e);
                    return;
                } catch (ExecutionException e10) {
                    aVar.onFailure(e10.getCause());
                    return;
                }
            case 1:
                C0209b c0209b = (C0209b) this.f20327c;
                c0209b.getClass();
                g gVar = z.f1563k;
                c0209b.i(x.a(24, 9, gVar));
                ((o) this.f20328d).a(gVar, zzai.zzk());
                return;
            case 2:
                C0209b c0209b2 = (C0209b) this.f20327c;
                c0209b2.getClass();
                c0209b2.i(x.a(24, 7, z.f1563k));
                ((n) this.f20328d).e(new ArrayList());
                return;
            case 3:
                C0209b c0209b3 = (C0209b) this.f20327c;
                g gVar2 = (g) this.f20328d;
                if (((C2537a) c0209b3.f1494d.f1488c) != null) {
                    ((C2537a) c0209b3.f1494d.f1488c).b(gVar2, null);
                    return;
                } else {
                    zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 4:
                C0209b c0209b4 = (C0209b) this.f20327c;
                c0209b4.getClass();
                g gVar3 = z.f1563k;
                c0209b4.i(x.a(24, 3, gVar3));
                ((C2645d) this.f20328d).getClass();
                C2645d.y(gVar3);
                return;
            case 5:
                Future future = (Future) this.f20327c;
                if (!future.isDone() && !future.isCancelled()) {
                    future.cancel(true);
                    zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    Runnable runnable = (Runnable) this.f20328d;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                K.b bVar = (K.b) ((E1.c) this.f20327c).f972c;
                if (bVar != null) {
                    bVar.h((Typeface) this.f20328d);
                    return;
                }
                return;
            case 7:
                ((S.a) this.f20327c).accept(this.f20328d);
                return;
            case 8:
                S1.c cVar = (S1.c) this.f20328d;
                if (cVar.f2794d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f20327c).run();
                    return;
                } catch (Throwable th) {
                    cVar.f2793c.a(th);
                    return;
                }
            case 9:
                int i9 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f20327c).run();
                    } catch (Throwable th2) {
                        AbstractC0255x.i(th2, l.b);
                    }
                    i iVar = (i) this.f20328d;
                    Runnable l = iVar.l();
                    if (l != null) {
                        this.f20327c = l;
                        i9++;
                        if (i9 >= 16) {
                            AbstractC0251t abstractC0251t = iVar.f3519d;
                            if (abstractC0251t.k()) {
                                abstractC0251t.j(iVar, this);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            case 10:
                androidx.work.o e11 = androidx.work.o.e();
                String str = W0.a.f3549d;
                C2168i c2168i = (C2168i) this.f20327c;
                e11.b(str, AbstractC2914a.d("Scheduling work ", c2168i.f19801a), new Throwable[0]);
                ((W0.a) this.f20328d).f3550a.e(c2168i);
                return;
            case 11:
                ((C0406g) this.f20327c).b = this.f20328d;
                return;
            case 12:
                ((Application) this.f20327c).unregisterActivityLifecycleCallbacks((C0406g) this.f20328d);
                return;
            case 13:
                try {
                    Method method = AbstractC0407h.f4403d;
                    Object obj = this.f20328d;
                    Object obj2 = this.f20327c;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0407h.f4404e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e12) {
                    if (e12.getClass() == RuntimeException.class && e12.getMessage() != null && e12.getMessage().startsWith("Unable to stop")) {
                        throw e12;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 14:
                for (AbstractC0329c abstractC0329c : (List) this.f20327c) {
                    Object obj3 = ((AbstractC0551d) this.f20328d).f5263e;
                    abstractC0329c.b = obj3;
                    abstractC0329c.d(abstractC0329c.f3914d, obj3);
                }
                return;
            case 15:
                w a6 = w.a();
                a6.getClass();
                j2.n.a();
                a6.f3604d.set(true);
                ((ViewTreeObserverOnDrawListenerC0593d) this.f20328d).f5390c.f5391c = true;
                View view = ((ViewTreeObserverOnDrawListenerC0593d) this.f20328d).b;
                view.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener) this.f20327c);
                ((ViewTreeObserverOnDrawListenerC0593d) this.f20328d).f5390c.b.clear();
                return;
            case 16:
                if (!((AtomicBoolean) this.f20327c).getAndSet(true)) {
                    Log.w("ARCore-InstallService", "requestInstall timed out, launching fullscreen.");
                    e eVar = (e) this.f20328d;
                    ((H) eVar.f53f).getClass();
                    H.e((Activity) eVar.f51c, (B3.e) eVar.f52d);
                    return;
                }
                return;
            case 17:
                e1.i iVar2 = (e1.i) this.f20327c;
                try {
                    ((Runnable) this.f20328d).run();
                    return;
                } finally {
                    iVar2.a();
                }
            case 18:
                synchronized (((ConstraintTrackingWorker) this.f20328d).f5240c) {
                    if (((ConstraintTrackingWorker) this.f20328d).f5241d) {
                        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f20328d;
                        constraintTrackingWorker.f5242f.i(new Object());
                    } else {
                        ((ConstraintTrackingWorker) this.f20328d).f5242f.k((c) this.f20327c);
                    }
                }
                return;
            case 19:
                try {
                    a();
                    return;
                } catch (Error e13) {
                    synchronized (((k) this.f20328d).f22239c) {
                        ((k) this.f20328d).f22240d = 1;
                        throw e13;
                    }
                }
            case 20:
                ((BinderC2735d) this.f20328d).f23039c.onMessageChannelReady((Bundle) this.f20327c);
                return;
            case 21:
                C2772q.a((C2772q) this.f20328d, (B4.c) this.f20327c);
                return;
            default:
                C0585d c0585d = ((SwipeDismissBehavior) this.f20328d).f13907a;
                if (c0585d != null && c0585d.f()) {
                    ViewCompat.postOnAnimation((View) this.f20327c, this);
                    return;
                }
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.b) {
            case 0:
                C.c cVar = new C.c(b.class.getSimpleName());
                a7.b bVar = new a7.b(17, false);
                ((a7.b) cVar.f349f).f4078d = bVar;
                cVar.f349f = bVar;
                bVar.f4077c = (a) this.f20328d;
                return cVar.toString();
            case 19:
                Runnable runnable = (Runnable) this.f20327c;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i9 = ((k) this.f20328d).f22240d;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                str = "null";
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(int i9, Object obj, Object obj2, boolean z8) {
        this.b = i9;
        this.f20328d = obj;
        this.f20327c = obj2;
    }

    public b(k kVar) {
        this.b = 19;
        this.f20328d = kVar;
    }

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z8) {
        this.b = 22;
        this.f20328d = swipeDismissBehavior;
        this.f20327c = view;
    }
}
