package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import eb.j;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class zzgcy<V> extends zzgfk implements ua.b {
    private static final Object zzbc;
    private static final zza zzbf;
    static final boolean zzd;
    static final zzger zze;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public abstract class zza {
        public /* synthetic */ zza(zzgdb zzgdbVar) {
        }

        public abstract zzd zza(zzgcy zzgcyVar, zzd zzdVar);

        public abstract zzk zzb(zzgcy zzgcyVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzgcy zzgcyVar, zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzgcy zzgcyVar, Object obj, Object obj2);

        public abstract boolean zzg(zzgcy zzgcyVar, zzk zzkVar, zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgcy.zzd) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        public zzb(boolean z10, Throwable th2) {
            this.zzc = z10;
            this.zzd = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgcy.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th2) {
            th2.getClass();
            this.zzb = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<? super zzgcy<?>, zzk> zzc;
        final AtomicReferenceFieldUpdater<? super zzgcy<?>, zzd> zzd;
        final AtomicReferenceFieldUpdater<? super zzgcy<?>, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final zzd zza(zzgcy zzgcyVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzgcyVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final zzk zzb(zzgcy zzgcyVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzgcyVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final boolean zze(zzgcy zzgcyVar, zzd zzdVar, zzd zzdVar2) {
            return zzgcz.zza(this.zzd, zzgcyVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final boolean zzf(zzgcy zzgcyVar, Object obj, Object obj2) {
            return zzgcz.zza(this.zze, zzgcyVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final boolean zzg(zzgcy zzgcyVar, zzk zzkVar, zzk zzkVar2) {
            return zzgcz.zza(this.zzc, zzgcyVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class zzf<V> implements Runnable {
        final zzgcy<V> zza;
        final ua.b zzb;

        public zzf(zzgcy zzgcyVar, ua.b bVar) {
            this.zza = zzgcyVar;
            this.zzb = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzgcy) this.zza).value == this) {
                ua.b bVar = this.zzb;
                if (zzgcy.zzbf.zzf(this.zza, this, zzgcy.zze(bVar))) {
                    zzgcy.zzx(this.zza, false);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    final class zzg extends zza {
        private zzg() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final zzd zza(zzgcy zzgcyVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzgcyVar) {
                zzdVar2 = zzgcyVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzgcyVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final zzk zzb(zzgcy zzgcyVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzgcyVar) {
                zzkVar2 = zzgcyVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzgcyVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final boolean zze(zzgcy zzgcyVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzgcyVar) {
                if (zzgcyVar.listeners == zzdVar) {
                    zzgcyVar.listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final boolean zzf(zzgcy zzgcyVar, Object obj, Object obj2) {
            synchronized (zzgcyVar) {
                if (zzgcyVar.value == obj) {
                    zzgcyVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final boolean zzg(zzgcy zzgcyVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzgcyVar) {
                if (zzgcyVar.waiters == zzkVar) {
                    zzgcyVar.waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }

        public /* synthetic */ zzg(zzgdb zzgdbVar) {
            super(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface zzh<V> extends ua.b {
        @Override // ua.b
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public abstract class zzi<V> extends zzgcy<V> implements zzh<V> {
    }

    /* loaded from: classes3.dex */
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
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzgcy.zzj.1
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
                    zzc = unsafe.objectFieldOffset(zzgcy.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzgcy.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzgcy.class.getDeclaredField(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        }

        private zzj() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final zzd zza(zzgcy zzgcyVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzgcyVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzgcyVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final zzk zzb(zzgcy zzgcyVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzgcyVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzgcyVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final boolean zze(zzgcy zzgcyVar, zzd zzdVar, zzd zzdVar2) {
            return zzgda.zza(zza, zzgcyVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final boolean zzf(zzgcy zzgcyVar, Object obj, Object obj2) {
            return zzgda.zza(zza, zzgcyVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcy.zza
        public final boolean zzg(zzgcy zzgcyVar, zzk zzkVar, zzk zzkVar2) {
            return zzgda.zza(zza, zzgcyVar, zzc, zzkVar, zzkVar2);
        }

        public /* synthetic */ zzj(zzgdb zzgdbVar) {
            super(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        public zzk() {
            zzgcy.zzbf.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z10) {
        }
    }

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        zza zzgVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zzd = z10;
        zze = new zzger(zzgcy.class);
        zzgdb zzgdbVar = null;
        try {
            zzgVar = new zzj(zzgdbVar);
            th3 = null;
            th2 = null;
        } catch (Error | Exception e2) {
            try {
                th2 = null;
                th3 = e2;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzgcy.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzgcy.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzgcy.class, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
            } catch (Error | Exception e10) {
                th2 = e10;
                th3 = e2;
                zzgVar = new zzg(zzgdbVar);
            }
        }
        zzbf = zzgVar;
        if (th2 != null) {
            zzger zzgerVar = zze;
            Logger zza2 = zzgerVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzgerVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
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
        Throwable th2 = ((zzb) obj).zzd;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(ua.b bVar) {
        Throwable zzl;
        if (bVar instanceof zzh) {
            Object obj = ((zzgcy) bVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th2 = zzbVar.zzd;
                    obj = th2 != null ? new zzb(false, th2) : zzb.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((bVar instanceof zzgfk) && (zzl = ((zzgfk) bVar).zzl()) != null) {
            return new zzc(zzl);
        }
        boolean isCancelled = bVar.isCancelled();
        if ((!zzd) & isCancelled) {
            zzb zzbVar2 = zzb.zzb;
            Objects.requireNonNull(zzbVar2);
            return zzbVar2;
        }
        try {
            Object zzf2 = zzf(bVar);
            if (isCancelled) {
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(bVar))));
            }
            if (zzf2 == null) {
                return zzbc;
            }
            return zzf2;
        } catch (Error e2) {
            e = e2;
            return new zzc(e);
        } catch (CancellationException e10) {
            if (!isCancelled) {
                return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(bVar)), e10));
            }
            return new zzb(false, e10);
        } catch (ExecutionException e11) {
            if (isCancelled) {
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(bVar)), e11));
            }
            return new zzc(e11.getCause());
        } catch (Exception e12) {
            e = e12;
            return new zzc(e);
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzu(StringBuilder sb2) {
        try {
            Object zzf2 = zzf(this);
            sb2.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (zzf2 == this) {
                sb2.append("this future");
            } else {
                sb2.append(zzf2.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e2.getCause());
            sb2.append("]");
        } catch (Exception e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private final void zzv(StringBuilder sb2) {
        String concat;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb2.append(", setFuture=[");
            zzw(sb2, ((zzf) obj).zzb);
            sb2.append("]");
        } else {
            try {
                concat = zzfxf.zza(zza());
            } catch (Exception | StackOverflowError e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null) {
                sb2.append(", info=[");
                sb2.append(concat);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            zzu(sb2);
        }
    }

    private final void zzw(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception | StackOverflowError e2) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e2.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(zzgcy zzgcyVar, boolean z10) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzbf.zzb(zzgcyVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                zzgcyVar.zzq();
            }
            zzgcyVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzbf.zza(zzgcyVar, zzd.zza);
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
                    zzgcyVar = zzfVar.zza;
                    if (zzgcyVar.value == zzfVar) {
                        if (zzbf.zzf(zzgcyVar, zzfVar, zze(zzfVar.zzb))) {
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
            z10 = false;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            zze.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", j.l("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
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

    @Override // ua.b
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfwq.zzc(runnable, "Runnable was null.");
        zzfwq.zzc(executor, "Executor was null.");
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
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgcy.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.ads.zzgcy.zzd
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzgcy$zzb r1 = new com.google.android.gms.internal.ads.zzgcy$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzgcy$zzb r1 = com.google.android.gms.internal.ads.zzgcy.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzgcy$zzb r1 = com.google.android.gms.internal.ads.zzgcy.zzb.zzb
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.zzgcy$zza r6 = com.google.android.gms.internal.ads.zzgcy.zzbf
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzx(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgcy.zzf
            if (r4 == 0) goto L56
            com.google.android.gms.internal.ads.zzgcy$zzf r0 = (com.google.android.gms.internal.ads.zzgcy.zzf) r0
            ua.b r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgcy.zzh
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.ads.zzgcy r4 = (com.google.android.gms.internal.ads.zzgcy) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgcy.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r3
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r2 = r3
            goto L5f
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgcy.zzf
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcy.cancel(boolean):boolean");
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
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzu(sb2);
        } else {
            zzv(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (this instanceof ScheduledFuture) {
            return a4.j.f("remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
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

    public boolean zzd(Throwable th2) {
        th2.getClass();
        if (!zzbf.zzf(this, null, new zzc(th2))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final Throwable zzl() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public void zzq() {
    }

    public final void zzr(Future future) {
        boolean z10;
        if (future != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 & isCancelled()) {
            future.cancel(zzt());
        }
    }

    public final boolean zzs(ua.b bVar) {
        zzc zzcVar;
        bVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (bVar.isDone()) {
                if (!zzbf.zzf(this, null, zze(bVar))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, bVar);
            if (zzbf.zzf(this, null, zzfVar)) {
                try {
                    bVar.addListener(zzfVar, zzgdw.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        zzcVar = new zzc(th2);
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
            bVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzt() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j3, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzA(obj);
            }
            long j10 = 0;
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
                            j10 = 0;
                        } else {
                            zzkVar = this.waiters;
                        }
                    } while (zzkVar != zzk.zza);
                }
                Object obj3 = this.value;
                Objects.requireNonNull(obj3);
                return zzA(obj3);
            }
            while (nanos > j10) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzA(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                    j10 = 0;
                } else {
                    throw new InterruptedException();
                }
            }
            String zzgcyVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z10) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z10) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, " for ", zzgcyVar));
        }
        throw new InterruptedException();
    }
}
