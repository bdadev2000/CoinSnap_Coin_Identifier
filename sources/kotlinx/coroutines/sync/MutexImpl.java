package kotlinx.coroutines.sync;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002+,B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u001b\u0010 \u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u001b\u0010\"\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010!J\u001e\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010\nH\u0014J\u001e\u0010%\u001a\u00020\u00192\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010)\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010*\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eRk\u0010\u000f\u001a_\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u0010j\u0002`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001cX\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "(Z)V", "isLocked", "()Z", "onLock", "Lkotlinx/coroutines/selects/SelectClause2;", "", "getOnLock$annotations", "()V", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSelectCancellationUnlockConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "Lkotlin/Function1;", "", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "owner", "Lkotlinx/atomicfu/AtomicRef;", "holdsLock", "holdsLockImpl", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "onLockProcessResult", "result", "onLockRegFunction", "toString", "", "tryLock", "tryLockImpl", "unlock", "CancellableContinuationWithOwner", "SelectInstanceWithOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n332#2,12:311\n1#3:323\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n175#1:311,12\n*E\n"})
/* loaded from: classes5.dex */
public class MutexImpl extends SemaphoreImpl implements Mutex {
    private static final AtomicReferenceFieldUpdater owner$FU = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner");
    private final Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> onSelectCancellationUnlockConstructor;

    @Volatile
    private volatile Object owner;

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0001J\u0011\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u0017\u001a\u00020\u0002H\u0097\u0001J2\u0010\u0018\u001a\u00020\u00022'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00020\u001aj\u0002`\u001dH\u0096\u0001J\u001d\u0010\u0018\u001a\u00020\u00022\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010 \u001a\u00020!H\u0096\u0001J:\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010%J\u001f\u0010&\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0096\u0001ø\u0001\u0000¢\u0006\u0002\u0010)J$\u0010*\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007H\u0097\u0001¢\u0006\u0002\u0010,JF\u0010*\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00072#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u0004\u0018\u00010\u00072\u0006\u0010/\u001a\u00020\u0014H\u0097\u0001J\u001a\u00100\u001a\u00020\u0002*\u0002012\u0006\u0010#\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0002\u00102J\u0015\u00103\u001a\u00020\u0002*\u0002012\u0006\u0010/\u001a\u00020\u0014H\u0097\u0001R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0012\u0010\u0011\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner;", "Lkotlinx/coroutines/CancellableContinuation;", "", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/CancellableContinuationImpl;Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "isActive", "", "()Z", "isCancelled", "isCompleted", "cancel", "cause", "", "completeResume", BidResponsed.KEY_TOKEN, "initCancellability", "invokeOnCancellation", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", CampaignEx.JSON_NATIVE_VIDEO_RESUME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "onCancellation", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function1;)V", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "tryResume", "idempotent", "(Lkotlin/Unit;Ljava/lang/Object;)Ljava/lang/Object;", "(Lkotlin/Unit;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tryResumeWithException", "exception", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/Unit;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    /* loaded from: classes5.dex */
    public final class CancellableContinuationWithOwner implements CancellableContinuation<Unit>, Waiter {

        @JvmField
        public final CancellableContinuationImpl<Unit> cont;

        @JvmField
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(CancellableContinuationImpl<? super Unit> cancellableContinuationImpl, Object obj) {
            this.cont = cancellableContinuationImpl;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(Throwable cause) {
            return this.cont.cancel(cause);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @InternalCoroutinesApi
        public void completeResume(Object token) {
            this.cont.completeResume(token);
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @InternalCoroutinesApi
        public void initCancellability() {
            this.cont.initCancellability();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(Function1<? super Throwable, Unit> handler) {
            this.cont.invokeOnCancellation(handler);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCancelled() {
            return this.cont.isCancelled();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
            return this.cont.isCompleted();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resume(Unit unit, Function1 function1) {
            resume2(unit, (Function1<? super Throwable, Unit>) function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @ExperimentalCoroutinesApi
        public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, Unit unit) {
            this.cont.resumeUndispatched(coroutineDispatcher, unit);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @ExperimentalCoroutinesApi
        public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th2) {
            this.cont.resumeUndispatchedWithException(coroutineDispatcher, th2);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            this.cont.resumeWith(result);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @InternalCoroutinesApi
        public Object tryResume(Unit value, Object idempotent) {
            return this.cont.tryResume(value, idempotent);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @InternalCoroutinesApi
        public Object tryResumeWithException(Throwable exception) {
            return this.cont.tryResumeWithException(exception);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int index) {
            this.cont.invokeOnCancellation(segment, index);
        }

        /* renamed from: resume, reason: avoid collision after fix types in other method */
        public void resume2(Unit value, Function1<? super Throwable, Unit> onCancellation) {
            MutexImpl.owner$FU.set(MutexImpl.this, this.owner);
            CancellableContinuationImpl<Unit> cancellableContinuationImpl = this.cont;
            final MutexImpl mutexImpl = MutexImpl.this;
            cancellableContinuationImpl.resume(value, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    MutexImpl.this.unlock(this.owner);
                }
            });
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ Object tryResume(Unit unit, Object obj, Function1 function1) {
            return tryResume2(unit, obj, (Function1<? super Throwable, Unit>) function1);
        }

        /* renamed from: tryResume, reason: avoid collision after fix types in other method */
        public Object tryResume2(Unit value, Object idempotent, Function1<? super Throwable, Unit> onCancellation) {
            final MutexImpl mutexImpl = MutexImpl.this;
            Object tryResume = this.cont.tryResume(value, idempotent, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    MutexImpl.owner$FU.set(MutexImpl.this, this.owner);
                    MutexImpl.this.unlock(this.owner);
                }
            });
            if (tryResume != null) {
                MutexImpl.owner$FU.set(MutexImpl.this, this.owner);
            }
            return tryResume;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u001d\u0010\u000f\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner;", "Q", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "select", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/selects/SelectInstanceInternal;Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "disposeOnCompletion", "", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", "selectInRegistrationPhase", "internalResult", "trySelect", "", "clauseObject", "result", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    /* loaded from: classes5.dex */
    public final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {

        @JvmField
        public final Object owner;

        @JvmField
        public final SelectInstanceInternal<Q> select;

        public SelectInstanceWithOwner(SelectInstanceInternal<Q> selectInstanceInternal, Object obj) {
            this.select = selectInstanceInternal;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void disposeOnCompletion(DisposableHandle disposableHandle) {
            this.select.disposeOnCompletion(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public CoroutineContext getContext() {
            return this.select.getContext();
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int index) {
            this.select.invokeOnCancellation(segment, index);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void selectInRegistrationPhase(Object internalResult) {
            MutexImpl.owner$FU.set(MutexImpl.this, this.owner);
            this.select.selectInRegistrationPhase(internalResult);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public boolean trySelect(Object clauseObject, Object result) {
            boolean trySelect = this.select.trySelect(clauseObject, result);
            MutexImpl mutexImpl = MutexImpl.this;
            if (trySelect) {
                MutexImpl.owner$FU.set(mutexImpl, this.owner);
            }
            return trySelect;
        }
    }

    public MutexImpl(boolean z10) {
        super(1, z10 ? 1 : 0);
        Symbol symbol;
        if (z10) {
            symbol = null;
        } else {
            symbol = MutexKt.NO_OWNER;
        }
        this.owner = symbol;
        this.onSelectCancellationUnlockConstructor = new Function3<SelectInstance<?>, Object, Object, Function1<? super Throwable, ? extends Unit>>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Function1<Throwable, Unit> invoke(SelectInstance<?> selectInstance, final Object obj, Object obj2) {
                final MutexImpl mutexImpl = MutexImpl.this;
                return new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        MutexImpl.this.unlock(obj);
                    }
                };
            }
        };
    }

    public static /* synthetic */ void getOnLock$annotations() {
    }

    private final int holdsLockImpl(Object owner) {
        Symbol symbol;
        while (isLocked()) {
            Object obj = owner$FU.get(this);
            symbol = MutexKt.NO_OWNER;
            if (obj != symbol) {
                if (obj == owner) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    public static /* synthetic */ Object lock$suspendImpl(MutexImpl mutexImpl, Object obj, Continuation<? super Unit> continuation) {
        if (mutexImpl.tryLock(obj)) {
            return Unit.INSTANCE;
        }
        Object lockSuspend = mutexImpl.lockSuspend(obj, continuation);
        if (lockSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return lockSuspend;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lockSuspend(Object obj, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            acquire((CancellableContinuation<? super Unit>) new CancellableContinuationWithOwner(orCreateCancellableContinuation, obj));
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

    private final int tryLockImpl(Object owner) {
        while (!tryAcquire()) {
            if (owner == null) {
                return 1;
            }
            int holdsLockImpl = holdsLockImpl(owner);
            if (holdsLockImpl == 1) {
                return 2;
            }
            if (holdsLockImpl == 2) {
                return 1;
            }
        }
        owner$FU.set(this, owner);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public SelectClause2<Object, Mutex> getOnLock() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.INSTANCE;
        Intrinsics.checkNotNull(mutexImpl$onLock$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$1, 3);
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.INSTANCE;
        Intrinsics.checkNotNull(mutexImpl$onLock$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$2, 3), this.onSelectCancellationUnlockConstructor);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(Object owner) {
        return holdsLockImpl(owner) == 1;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return getAvailablePermits() == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, Continuation<? super Unit> continuation) {
        return lock$suspendImpl(this, obj, continuation);
    }

    public Object onLockProcessResult(Object owner, Object result) {
        Symbol symbol;
        symbol = MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER;
        if (!Intrinsics.areEqual(result, symbol)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
    }

    public void onLockRegFunction(SelectInstance<?> select, Object owner) {
        Symbol symbol;
        if (owner != null && holdsLock(owner)) {
            symbol = MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER;
            select.selectInRegistrationPhase(symbol);
        } else {
            Intrinsics.checkNotNull(select, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            onAcquireRegFunction(new SelectInstanceWithOwner((SelectInstanceInternal) select, owner), owner);
        }
    }

    public String toString() {
        return "Mutex@" + DebugStringsKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + owner$FU.get(this) + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object owner) {
        int tryLockImpl = tryLockImpl(owner);
        if (tryLockImpl == 0) {
            return true;
        }
        if (tryLockImpl != 1) {
            if (tryLockImpl != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object owner) {
        Symbol symbol;
        boolean z10;
        Symbol symbol2;
        while (isLocked()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = owner$FU;
            Object obj = atomicReferenceFieldUpdater.get(this);
            symbol = MutexKt.NO_OWNER;
            if (obj != symbol) {
                boolean z11 = false;
                if (obj != owner && owner != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    symbol2 = MutexKt.NO_OWNER;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol2)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    if (z11) {
                        release();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }
}
