package com.google.android.gms.internal.ads;

import com.applovin.impl.L;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.o;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public abstract class zzgeh<V> extends zzggw implements f4.c {
    private static final Object zzbc;
    private static final zza zzbf;
    static final boolean zzd;
    static final zzggd zze;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class zza {
        public /* synthetic */ zza(zzgeg zzgegVar) {
        }

        public abstract zzd zza(zzgeh zzgehVar, zzd zzdVar);

        public abstract zzk zzb(zzgeh zzgehVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzgeh zzgehVar, zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzgeh zzgehVar, Object obj, Object obj2);

        public abstract boolean zzg(zzgeh zzgehVar, zzk zzkVar, zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgeh.zzd) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        public zzb(boolean z8, Throwable th) {
            this.zzc = z8;
            this.zzd = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgeh.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* loaded from: classes2.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzgeh, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzgeh, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzgeh, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final zzd zza(zzgeh zzgehVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzgehVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final zzk zzb(zzgeh zzgehVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzgehVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final boolean zze(zzgeh zzgehVar, zzd zzdVar, zzd zzdVar2) {
            return zzgei.zza(this.zzd, zzgehVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final boolean zzf(zzgeh zzgehVar, Object obj, Object obj2) {
            return zzgei.zza(this.zze, zzgehVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final boolean zzg(zzgeh zzgehVar, zzk zzkVar, zzk zzkVar2) {
            return zzgei.zza(this.zzc, zzgehVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzf<V> implements Runnable {
        final zzgeh<V> zza;
        final f4.c zzb;

        public zzf(zzgeh zzgehVar, f4.c cVar) {
            this.zza = zzgehVar;
            this.zzb = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzgeh) this.zza).value == this) {
                f4.c cVar = this.zzb;
                if (zzgeh.zzbf.zzf(this.zza, this, zzgeh.zze(cVar))) {
                    zzgeh.zzx(this.zza, false);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    final class zzg extends zza {
        private zzg() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final zzd zza(zzgeh zzgehVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzgehVar) {
                try {
                    zzdVar2 = zzgehVar.listeners;
                    if (zzdVar2 != zzdVar) {
                        zzgehVar.listeners = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final zzk zzb(zzgeh zzgehVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzgehVar) {
                try {
                    zzkVar2 = zzgehVar.waiters;
                    if (zzkVar2 != zzkVar) {
                        zzgehVar.waiters = zzkVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final boolean zze(zzgeh zzgehVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzgehVar) {
                try {
                    if (zzgehVar.listeners == zzdVar) {
                        zzgehVar.listeners = zzdVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final boolean zzf(zzgeh zzgehVar, Object obj, Object obj2) {
            synchronized (zzgehVar) {
                try {
                    if (zzgehVar.value == obj) {
                        zzgehVar.value = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final boolean zzg(zzgeh zzgehVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzgehVar) {
                try {
                    if (zzgehVar.waiters == zzkVar) {
                        zzgehVar.waiters = zzkVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ zzg(zzgej zzgejVar) {
            super(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface zzh<V> extends f4.c {
        @Override // f4.c
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class zzi<V> extends zzgeh<V> implements zzh<V> {
    }

    /* loaded from: classes2.dex */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzgeh.zzj.1
                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzgeh.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzgeh.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzgeh.class.getDeclaredField(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (PrivilegedActionException e9) {
                throw new RuntimeException("Could not initialize intrinsics", e9.getCause());
            }
        }

        private zzj() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final zzd zza(zzgeh zzgehVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzgehVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzgehVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final zzk zzb(zzgeh zzgehVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzgehVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzgehVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final boolean zze(zzgeh zzgehVar, zzd zzdVar, zzd zzdVar2) {
            return zzgek.zza(zza, zzgehVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final boolean zzf(zzgeh zzgehVar, Object obj, Object obj2) {
            return zzgek.zza(zza, zzgehVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgeh.zza
        public final boolean zzg(zzgeh zzgehVar, zzk zzkVar, zzk zzkVar2) {
            return zzgek.zza(zza, zzgehVar, zzc, zzkVar, zzkVar2);
        }

        public /* synthetic */ zzj(zzgel zzgelVar) {
            super(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        public zzk(boolean z8) {
        }

        public zzk() {
            zzgeh.zzbf.zzd(this, Thread.currentThread());
        }
    }

    static {
        boolean z8;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z8 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z8 = false;
        }
        zzd = z8;
        zze = new zzggd(zzgeh.class);
        byte b = 0;
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | Exception e4) {
            try {
                th = null;
                th2 = e4;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzgeh.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzgeh.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzgeh.class, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
            } catch (Error | Exception e9) {
                th = e9;
                th2 = e4;
                zzgVar = new zzg(b == true ? 1 : 0);
            }
        }
        zzbf = zzgVar;
        if (th != null) {
            zzggd zzggdVar = zze;
            Logger zza2 = zzggdVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzggdVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzbc = new Object();
    }

    private static final Object zzA(Object obj) throws ExecutionException {
        if (!(obj instanceof zzb)) {
            if (!(obj instanceof zzc)) {
                if (obj == zzbc) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((zzc) obj).zzb);
        }
        Throwable th = ((zzb) obj).zzd;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(f4.c cVar) {
        Throwable zzl;
        if (cVar instanceof zzh) {
            Object obj = ((zzgeh) cVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((cVar instanceof zzggw) && (zzl = ((zzggw) cVar).zzl()) != null) {
            return new zzc(zzl);
        }
        boolean isCancelled = cVar.isCancelled();
        if ((!zzd) & isCancelled) {
            zzb zzbVar2 = zzb.zzb;
            Objects.requireNonNull(zzbVar2);
            return zzbVar2;
        }
        try {
            Object zzf2 = zzf(cVar);
            if (isCancelled) {
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(cVar))));
            }
            if (zzf2 == null) {
                return zzbc;
            }
            return zzf2;
        } catch (Error e4) {
            e = e4;
            return new zzc(e);
        } catch (CancellationException e9) {
            if (!isCancelled) {
                return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(cVar)), e9));
            }
            return new zzb(false, e9);
        } catch (ExecutionException e10) {
            if (isCancelled) {
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(cVar)), e10));
            }
            return new zzc(e10.getCause());
        } catch (Exception e11) {
            e = e11;
            return new zzc(e);
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzu(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append("null");
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        } catch (Exception e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzv(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzw(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = zzfyv.zza(zza());
            } catch (Exception | StackOverflowError e4) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e4.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzu(sb);
        }
    }

    private final void zzw(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e4) {
            e = e4;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e9) {
            e = e9;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(zzgeh zzgehVar, boolean z8) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzbf.zzb(zzgehVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z8) {
                zzgehVar.zzq();
            }
            zzgehVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzbf.zza(zzgehVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzgehVar = zzfVar.zza;
                    if (zzgehVar.value == zzfVar) {
                        if (zzbf.zzf(zzgehVar, zzfVar, zze(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z8 = false;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e4) {
            zze.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", AbstractC2914a.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e4);
        }
    }

    private final void zzz(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbf.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // f4.c
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfyg.zzc(runnable, "Runnable was null.");
        zzfyg.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzbf.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgeh.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L60
            boolean r1 = com.google.android.gms.internal.ads.zzgeh.zzd
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzgeh$zzb r1 = new com.google.android.gms.internal.ads.zzgeh$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzgeh$zzb r1 = com.google.android.gms.internal.ads.zzgeh.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzgeh$zzb r1 = com.google.android.gms.internal.ads.zzgeh.zzb.zzb
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.zzgeh$zza r6 = com.google.android.gms.internal.ads.zzgeh.zzbf
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L59
            zzx(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgeh.zzf
            if (r4 == 0) goto L53
            com.google.android.gms.internal.ads.zzgeh$zzf r0 = (com.google.android.gms.internal.ads.zzgeh.zzf) r0
            f4.c r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgeh.zzh
            if (r4 == 0) goto L55
            r4 = r0
            com.google.android.gms.internal.ads.zzgeh r4 = (com.google.android.gms.internal.ads.zzgeh) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgeh.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r3
            goto L2b
        L53:
            r2 = r3
            goto L60
        L55:
            r0.cancel(r8)
            goto L53
        L59:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgeh.zzf
            if (r6 != 0) goto L2b
            r2 = r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgeh.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                return zzA(obj2);
            }
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzbf;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzz(zzkVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzA(obj);
                    }
                    zzkVar = this.waiters;
                } while (zzkVar != zzk.zza);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzA(obj3);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.value != null) & (!(r0 instanceof zzf));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzu(sb);
        } else {
            zzv(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (this instanceof ScheduledFuture) {
            return L.j("remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    public void zzb() {
    }

    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzbc;
        }
        if (!zzbf.zzf(this, null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    public boolean zzd(Throwable th) {
        th.getClass();
        if (!zzbf.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    public final Throwable zzl() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    public void zzq() {
    }

    public final void zzr(Future future) {
        boolean z8;
        if (future != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 & isCancelled()) {
            future.cancel(zzt());
        }
    }

    public final boolean zzs(f4.c cVar) {
        zzc zzcVar;
        cVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (cVar.isDone()) {
                if (!zzbf.zzf(this, null, zze(cVar))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, cVar);
            if (zzbf.zzf(this, null, zzfVar)) {
                try {
                    cVar.addListener(zzfVar, zzgfh.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzbf.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            cVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzt() {
        Object obj = this.value;
        if ((obj instanceof zzb) && ((zzb) obj).zzc) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j7);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z8 = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzA(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    do {
                        zza zzaVar = zzbf;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzA(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzz(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzz(zzkVar2);
                        } else {
                            zzkVar = this.waiters;
                        }
                    } while (zzkVar != zzk.zza);
                }
                Object obj3 = this.value;
                Objects.requireNonNull(obj3);
                return zzA(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzA(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzgehVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j9 = -nanos;
                long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
                long nanos2 = j9 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z8 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z8) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z8) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(o.k(str, " for ", zzgehVar));
        }
        throw new InterruptedException();
    }
}
