package kotlinx.coroutines.sync;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import eb.j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0016\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017Jb\u0010\u0016\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0019\u001a\u0002H\u00182!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001d0\u00122!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0012H\u0083\b¢\u0006\u0002\u0010\u001fJ\u0016\u0010\u0016\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0005J\u0011\u0010!\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0003H\u0002J\u001e\u0010&\u001a\u00020\u00142\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0004J\b\u0010+\u001a\u00020\u0014H\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020\u001dH\u0002J\f\u0010.\u001a\u00020\u001d*\u00020*H\u0002R\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\t\u0010\r\u001a\u00020\fX\u0082\u0004R\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Semaphore;", "permits", "", "acquiredPermits", "(II)V", "_availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "availablePermits", "getAvailablePermits", "()I", "deqIdx", "Lkotlinx/atomicfu/AtomicLong;", "enqIdx", TtmlNode.TAG_HEAD, "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "onCancellationRelease", "Lkotlin/Function1;", "", "", "tail", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "W", "waiter", "suspend", "Lkotlin/ParameterName;", "name", "", "onAcquired", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/CancellableContinuation;", "acquireSlowPath", "addAcquireToQueue", "Lkotlinx/coroutines/Waiter;", "coerceAvailablePermitsAtMaximum", "decPermits", "onAcquireRegFunction", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "", "release", "tryAcquire", "tryResumeNextFromQueue", "tryResumeAcquire", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n205#1,10:411\n205#1,10:421\n1#2:398\n332#3,12:399\n72#4,3:431\n46#4,8:434\n72#4,3:445\n46#4,8:448\n375#5:442\n375#5:443\n367#5:444\n378#5:456\n367#5:457\n375#5:458\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n197#1:411,10\n221#1:421,10\n187#1:399,12\n289#1:431,3\n289#1:434,8\n322#1:445,3\n322#1:448,8\n293#1:442\n299#1:443\n313#1:444\n328#1:456\n334#1:457\n337#1:458\n*E\n"})
/* loaded from: classes5.dex */
public class SemaphoreImpl implements Semaphore {

    @Volatile
    private volatile int _availablePermits;

    @Volatile
    private volatile long deqIdx;

    @Volatile
    private volatile long enqIdx;

    @Volatile
    private volatile Object head;
    private final Function1<Throwable, Unit> onCancellationRelease;
    private final int permits;

    @Volatile
    private volatile Object tail;
    private static final AtomicReferenceFieldUpdater head$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, TtmlNode.TAG_HEAD);
    private static final AtomicLongFieldUpdater deqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");
    private static final AtomicReferenceFieldUpdater tail$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");
    private static final AtomicLongFieldUpdater enqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");
    private static final AtomicIntegerFieldUpdater _availablePermits$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");

    public SemaphoreImpl(int i10, int i11) {
        boolean z10;
        this.permits = i10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= 0 && i11 <= i10) {
                SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
                this.head = semaphoreSegment;
                this.tail = semaphoreSegment;
                this._availablePermits = i10 - i11;
                this.onCancellationRelease = new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                        invoke2(th2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th2) {
                        SemaphoreImpl.this.release();
                    }
                };
                return;
            }
            throw new IllegalArgumentException(j.i("The number of acquired permits should be in 0..", i10).toString());
        }
        throw new IllegalArgumentException(j.i("Semaphore should have at least 1 permit, but had ", i10).toString());
    }

    public static /* synthetic */ Object acquire$suspendImpl(SemaphoreImpl semaphoreImpl, Continuation<? super Unit> continuation) {
        if (semaphoreImpl.decPermits() > 0) {
            return Unit.INSTANCE;
        }
        Object acquireSlowPath = semaphoreImpl.acquireSlowPath(continuation);
        if (acquireSlowPath == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return acquireSlowPath;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                acquire((CancellableContinuation<? super Unit>) orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return result;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean addAcquireToQueue(kotlinx.coroutines.Waiter r17) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreImpl.addAcquireToQueue(kotlinx.coroutines.Waiter):boolean");
    }

    private final void coerceAvailablePermitsAtMaximum() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        do {
            atomicIntegerFieldUpdater = _availablePermits$FU;
            i10 = atomicIntegerFieldUpdater.get(this);
            i11 = this.permits;
            if (i10 <= i11) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    private final boolean tryResumeAcquire(Object obj) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Object tryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, this.onCancellationRelease);
            if (tryResume != null) {
                cancellableContinuation.completeResume(tryResume);
                return true;
            }
            return false;
        }
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, Unit.INSTANCE);
        }
        throw new IllegalStateException(("unexpected: " + obj).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean tryResumeNextFromQueue() {
        /*
            r15 = this;
            r0 = r15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.SemaphoreImpl.head$FU
            java.lang.Object r2 = r1.get(r15)
            kotlinx.coroutines.sync.SemaphoreSegment r2 = (kotlinx.coroutines.sync.SemaphoreSegment) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$FU
            long r3 = r3.getAndIncrement(r15)
            int r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r5 = (long) r5
            long r5 = r3 / r5
            kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 r7 = kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE
        L18:
            java.lang.Object r8 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r2, r5, r7)
            boolean r9 = kotlinx.coroutines.internal.SegmentOrClosed.m1722isClosedimpl(r8)
            if (r9 != 0) goto L66
            kotlinx.coroutines.internal.Segment r9 = kotlinx.coroutines.internal.SegmentOrClosed.m1720getSegmentimpl(r8)
        L26:
            java.lang.Object r12 = r1.get(r15)
            kotlinx.coroutines.internal.Segment r12 = (kotlinx.coroutines.internal.Segment) r12
            long r13 = r12.id
            long r10 = r9.id
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 < 0) goto L36
        L34:
            r9 = 1
            goto L59
        L36:
            boolean r10 = r9.tryIncPointers$kotlinx_coroutines_core()
            if (r10 != 0) goto L3e
            r9 = 0
            goto L59
        L3e:
            boolean r10 = r1.compareAndSet(r15, r12, r9)
            if (r10 == 0) goto L46
            r10 = 1
            goto L4d
        L46:
            java.lang.Object r10 = r1.get(r15)
            if (r10 == r12) goto L3e
            r10 = 0
        L4d:
            if (r10 == 0) goto L5c
            boolean r9 = r12.decPointers$kotlinx_coroutines_core()
            if (r9 == 0) goto L34
            r12.remove()
            goto L34
        L59:
            if (r9 == 0) goto L18
            goto L66
        L5c:
            boolean r10 = r9.decPointers$kotlinx_coroutines_core()
            if (r10 == 0) goto L26
            r9.remove()
            goto L26
        L66:
            kotlinx.coroutines.internal.Segment r1 = kotlinx.coroutines.internal.SegmentOrClosed.m1720getSegmentimpl(r8)
            kotlinx.coroutines.sync.SemaphoreSegment r1 = (kotlinx.coroutines.sync.SemaphoreSegment) r1
            r1.cleanPrev()
            long r7 = r1.id
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L77
            r2 = 0
            return r2
        L77:
            int r2 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.getAcquirers()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto Lc5
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getMAX_SPIN_CYCLES$p()
            r4 = 0
        L91:
            if (r4 >= r3) goto La6
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r1.getAcquirers()
            java.lang.Object r5 = r5.get(r2)
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            if (r5 != r6) goto La3
            r5 = 1
            return r5
        La3:
            int r4 = r4 + 1
            goto L91
        La6:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getBROKEN$p()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.getAcquirers()
        Lb2:
            boolean r3 = r1.compareAndSet(r2, r4, r5)
            if (r3 == 0) goto Lba
            r10 = 1
            goto Lc1
        Lba:
            java.lang.Object r3 = r1.get(r2)
            if (r3 == r4) goto Lb2
            r10 = 0
        Lc1:
            r6 = 1
            r1 = r10 ^ 1
            return r1
        Lc5:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.SemaphoreKt.access$getCANCELLED$p()
            if (r3 != r1) goto Lcd
            r1 = 0
            return r1
        Lcd:
            boolean r1 = r15.tryResumeAcquire(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreImpl.tryResumeNextFromQueue():boolean");
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public Object acquire(Continuation<? super Unit> continuation) {
        return acquire$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
        return Math.max(_availablePermits$FU.get(this), 0);
    }

    public final void onAcquireRegFunction(SelectInstance<?> select, Object ignoredParam) {
        while (decPermits() <= 0) {
            Intrinsics.checkNotNull(select, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((Waiter) select)) {
                return;
            }
        }
        select.selectInRegistrationPhase(Unit.INSTANCE);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
        do {
            int andIncrement = _availablePermits$FU.getAndIncrement(this);
            if (andIncrement < this.permits) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
        } while (!tryResumeNextFromQueue());
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _availablePermits$FU;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    private final <W> void acquire(W waiter, Function1<? super W, Boolean> suspend, Function1<? super W, Unit> onAcquired) {
        while (decPermits() <= 0) {
            if (suspend.invoke(waiter).booleanValue()) {
                return;
            }
        }
        onAcquired.invoke(waiter);
    }

    public final void acquire(CancellableContinuation<? super Unit> waiter) {
        while (decPermits() <= 0) {
            Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((Waiter) waiter)) {
                return;
            }
        }
        waiter.resume(Unit.INSTANCE, this.onCancellationRelease);
    }
}
