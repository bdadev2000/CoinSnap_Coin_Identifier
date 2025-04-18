package androidx.work.impl.utils.futures;

import android.support.v4.media.d;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestrictTo
/* loaded from: classes.dex */
public abstract class AbstractFuture<V> implements ListenableFuture<V> {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f22239f = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicHelper f22240g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f22241h;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f22242a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Listener f22243b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Waiter f22244c;

    /* loaded from: classes.dex */
    public static abstract class AtomicHelper {
        public abstract boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract void d(Waiter waiter, Waiter waiter2);

        public abstract void e(Waiter waiter, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class Cancellation {

        /* renamed from: c, reason: collision with root package name */
        public static final Cancellation f22245c;
        public static final Cancellation d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f22246a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f22247b;

        static {
            if (AbstractFuture.d) {
                d = null;
                f22245c = null;
            } else {
                d = new Cancellation(false, null);
                f22245c = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z2, Throwable th) {
            this.f22246a = z2;
            this.f22247b = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class Failure {

        /* renamed from: b, reason: collision with root package name */
        public static final Failure f22248b = new Failure(new Throwable("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f22249a;

        /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$Failure$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public Failure(Throwable th) {
            boolean z2 = AbstractFuture.d;
            th.getClass();
            this.f22249a = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class Listener {
        public static final Listener d = new Listener(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f22250a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f22251b;

        /* renamed from: c, reason: collision with root package name */
        public Listener f22252c;

        public Listener(Runnable runnable, Executor executor) {
            this.f22250a = runnable;
            this.f22251b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f22253a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f22254b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f22255c;
        public final AtomicReferenceFieldUpdater d;
        public final AtomicReferenceFieldUpdater e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f22253a = atomicReferenceFieldUpdater;
            this.f22254b = atomicReferenceFieldUpdater2;
            this.f22255c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == listener);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f22255c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == waiter);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            this.f22254b.lazySet(waiter, waiter2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            this.f22253a.lazySet(waiter, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class SetFuture<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractFuture f22256a;

        /* renamed from: b, reason: collision with root package name */
        public final ListenableFuture f22257b;

        public SetFuture(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.f22256a = abstractFuture;
            this.f22257b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f22256a.f22242a != this) {
                return;
            }
            if (AbstractFuture.f22240g.b(this.f22256a, this, AbstractFuture.e(this.f22257b))) {
                AbstractFuture.b(this.f22256a);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f22243b != listener) {
                        return false;
                    }
                    abstractFuture.f22243b = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f22242a != obj) {
                        return false;
                    }
                    abstractFuture.f22242a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f22244c != waiter) {
                        return false;
                    }
                    abstractFuture.f22244c = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            waiter.f22260b = waiter2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            waiter.f22259a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class Waiter {

        /* renamed from: c, reason: collision with root package name */
        public static final Waiter f22258c = new Object();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f22259a;

        /* renamed from: b, reason: collision with root package name */
        public volatile Waiter f22260b;

        public Waiter() {
            AbstractFuture.f22240g.e(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    static {
        ?? r2;
        try {
            th = null;
            r2 = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            r2 = new Object();
        }
        f22240g = r2;
        if (th != null) {
            f22239f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f22241h = new Object();
    }

    public static void b(AbstractFuture abstractFuture) {
        Listener listener;
        Listener listener2;
        Listener listener3 = null;
        while (true) {
            Waiter waiter = abstractFuture.f22244c;
            if (f22240g.c(abstractFuture, waiter, Waiter.f22258c)) {
                while (waiter != null) {
                    Thread thread = waiter.f22259a;
                    if (thread != null) {
                        waiter.f22259a = null;
                        LockSupport.unpark(thread);
                    }
                    waiter = waiter.f22260b;
                }
                do {
                    listener = abstractFuture.f22243b;
                } while (!f22240g.a(abstractFuture, listener, Listener.d));
                while (true) {
                    listener2 = listener3;
                    listener3 = listener;
                    if (listener3 == null) {
                        break;
                    }
                    listener = listener3.f22252c;
                    listener3.f22252c = listener2;
                }
                while (listener2 != null) {
                    listener3 = listener2.f22252c;
                    Runnable runnable = listener2.f22250a;
                    if (runnable instanceof SetFuture) {
                        SetFuture setFuture = (SetFuture) runnable;
                        abstractFuture = setFuture.f22256a;
                        if (abstractFuture.f22242a == setFuture) {
                            if (f22240g.b(abstractFuture, setFuture, e(setFuture.f22257b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, listener2.f22251b);
                    }
                    listener2 = listener3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f22239f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof Cancellation) {
            Throwable th = ((Cancellation) obj).f22247b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f22249a);
        }
        if (obj == f22241h) {
            return null;
        }
        return obj;
    }

    public static Object e(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) listenableFuture).f22242a;
            if (!(obj instanceof Cancellation)) {
                return obj;
            }
            Cancellation cancellation = (Cancellation) obj;
            return cancellation.f22246a ? cancellation.f22247b != null ? new Cancellation(false, cancellation.f22247b) : Cancellation.d : obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!d) && isCancelled) {
            return Cancellation.d;
        }
        try {
            Object f2 = f(listenableFuture);
            return f2 == null ? f22241h : f2;
        } catch (CancellationException e) {
            if (isCancelled) {
                return new Cancellation(false, e);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    public static Object f(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object f2 = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(f2 == this ? "this future" : String.valueOf(f2));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        Listener listener = this.f22243b;
        Listener listener2 = Listener.d;
        if (listener != listener2) {
            Listener listener3 = new Listener(runnable, executor);
            do {
                listener3.f22252c = listener;
                if (f22240g.a(this, listener, listener3)) {
                    return;
                } else {
                    listener = this.f22243b;
                }
            } while (listener != listener2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f22242a;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        Cancellation cancellation = d ? new Cancellation(z2, new CancellationException("Future.cancel() was called.")) : z2 ? Cancellation.f22245c : Cancellation.d;
        AbstractFuture<V> abstractFuture = this;
        boolean z3 = false;
        while (true) {
            if (f22240g.b(abstractFuture, obj, cancellation)) {
                b(abstractFuture);
                if (!(obj instanceof SetFuture)) {
                    return true;
                }
                ListenableFuture listenableFuture = ((SetFuture) obj).f22257b;
                if (!(listenableFuture instanceof AbstractFuture)) {
                    listenableFuture.cancel(z2);
                    return true;
                }
                abstractFuture = (AbstractFuture) listenableFuture;
                obj = abstractFuture.f22242a;
                if (!(obj == null) && !(obj instanceof SetFuture)) {
                    return true;
                }
                z3 = true;
            } else {
                obj = abstractFuture.f22242a;
                if (!(obj instanceof SetFuture)) {
                    return z3;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f22242a;
        if (obj instanceof SetFuture) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture = ((SetFuture) obj).f22257b;
            return d.r(sb, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a8 -> B:33:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(Waiter waiter) {
        waiter.f22259a = null;
        while (true) {
            Waiter waiter2 = this.f22244c;
            if (waiter2 == Waiter.f22258c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f22260b;
                if (waiter2.f22259a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f22260b = waiter4;
                    if (waiter3.f22259a == null) {
                        break;
                    }
                } else if (!f22240g.c(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f22242a instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof SetFuture)) & (this.f22242a != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f22242a;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return d(obj2);
            }
            Waiter waiter = this.f22244c;
            Waiter waiter2 = Waiter.f22258c;
            if (waiter != waiter2) {
                Waiter waiter3 = new Waiter();
                do {
                    AtomicHelper atomicHelper = f22240g;
                    atomicHelper.d(waiter3, waiter);
                    if (atomicHelper.c(this, waiter, waiter3)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                h(waiter3);
                                throw new InterruptedException();
                            }
                            obj = this.f22242a;
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return d(obj);
                    }
                    waiter = this.f22244c;
                } while (waiter != waiter2);
            }
            return d(this.f22242a);
        }
        throw new InterruptedException();
    }
}
