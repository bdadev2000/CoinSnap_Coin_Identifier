package com.facebook.bolts;

import com.facebook.bolts.BoltsExecutors;
import e0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class Task<TResult> {

    @NotNull
    public static final ExecutorService BACKGROUND_EXECUTOR;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Executor IMMEDIATE_EXECUTOR;

    @NotNull
    private static final Task<?> TASK_CANCELLED;

    @NotNull
    private static final Task<Boolean> TASK_FALSE;

    @NotNull
    private static final Task<?> TASK_NULL;

    @NotNull
    private static final Task<Boolean> TASK_TRUE;

    @NotNull
    public static final Executor UI_THREAD_EXECUTOR;

    @Nullable
    private static volatile UnobservedExceptionHandler unobservedExceptionHandler;
    private boolean cancelledField;
    private boolean completeField;
    private final Condition condition;

    @Nullable
    private List<Continuation<TResult, Void>> continuations;

    @Nullable
    private Exception errorField;
    private boolean errorHasBeenObserved;

    @NotNull
    private final ReentrantLock lock;

    @Nullable
    private TResult resultField;

    @Nullable
    private UnobservedErrorNotifier unobservedErrorNotifier;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: call$lambda-2, reason: not valid java name */
        public static final void m497call$lambda2(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Callable callable) {
            p0.a.s(taskCompletionSource, "$tcs");
            p0.a.s(callable, "$callable");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                taskCompletionSource.setCancelled();
                return;
            }
            try {
                taskCompletionSource.setResult(callable.call());
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e) {
                taskCompletionSource.setError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeAfterTask(com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, Continuation<TResult, Task<TContinuationResult>> continuation, Task<TResult> task, Executor executor, CancellationToken cancellationToken) {
            try {
                executor.execute(new e(cancellationToken, taskCompletionSource, continuation, task, 1));
            } catch (Exception e) {
                taskCompletionSource.setError(new ExecutorException(e));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: completeAfterTask$lambda-7, reason: not valid java name */
        public static final void m498completeAfterTask$lambda7(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
            p0.a.s(taskCompletionSource, "$tcs");
            p0.a.s(continuation, "$continuation");
            p0.a.s(task, "$task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                taskCompletionSource.setCancelled();
                return;
            }
            try {
                Task task2 = (Task) continuation.then(task);
                if (task2 == null) {
                    taskCompletionSource.setResult(null);
                } else {
                    task2.continueWith(new a(cancellationToken, taskCompletionSource, 2));
                }
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e) {
                taskCompletionSource.setError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: completeAfterTask$lambda-7$lambda-6, reason: not valid java name */
        public static final Void m499completeAfterTask$lambda7$lambda6(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Task task) {
            p0.a.s(taskCompletionSource, "$tcs");
            p0.a.s(task, "task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                taskCompletionSource.setCancelled();
                return null;
            }
            if (task.isCancelled()) {
                taskCompletionSource.setCancelled();
            } else if (task.isFaulted()) {
                taskCompletionSource.setError(task.getError());
            } else {
                taskCompletionSource.setResult(task.getResult());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeImmediately(com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, Continuation<TResult, TContinuationResult> continuation, Task<TResult> task, Executor executor, CancellationToken cancellationToken) {
            try {
                executor.execute(new e(cancellationToken, taskCompletionSource, continuation, task, 0));
            } catch (Exception e) {
                taskCompletionSource.setError(new ExecutorException(e));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: completeImmediately$lambda-5, reason: not valid java name */
        public static final void m500completeImmediately$lambda5(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
            p0.a.s(taskCompletionSource, "$tcs");
            p0.a.s(continuation, "$continuation");
            p0.a.s(task, "$task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                taskCompletionSource.setCancelled();
                return;
            }
            try {
                taskCompletionSource.setResult(continuation.then(task));
            } catch (CancellationException unused) {
                taskCompletionSource.setCancelled();
            } catch (Exception e) {
                taskCompletionSource.setError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: delay$lambda-0, reason: not valid java name */
        public static final void m501delay$lambda0(com.facebook.bolts.TaskCompletionSource taskCompletionSource) {
            p0.a.s(taskCompletionSource, "$tcs");
            taskCompletionSource.trySetResult(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: delay$lambda-1, reason: not valid java name */
        public static final void m502delay$lambda1(ScheduledFuture scheduledFuture, com.facebook.bolts.TaskCompletionSource taskCompletionSource) {
            p0.a.s(taskCompletionSource, "$tcs");
            scheduledFuture.cancel(true);
            taskCompletionSource.trySetCancelled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: whenAny$lambda-4, reason: not valid java name */
        public static final Void m503whenAny$lambda4(AtomicBoolean atomicBoolean, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Task task) {
            p0.a.s(atomicBoolean, "$isAnyTaskComplete");
            p0.a.s(taskCompletionSource, "$firstCompleted");
            p0.a.s(task, "it");
            if (atomicBoolean.compareAndSet(false, true)) {
                taskCompletionSource.setResult(task);
                return null;
            }
            task.getError();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: whenAnyResult$lambda-3, reason: not valid java name */
        public static final Void m504whenAnyResult$lambda3(AtomicBoolean atomicBoolean, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Task task) {
            p0.a.s(atomicBoolean, "$isAnyTaskComplete");
            p0.a.s(taskCompletionSource, "$firstCompleted");
            p0.a.s(task, "it");
            if (atomicBoolean.compareAndSet(false, true)) {
                taskCompletionSource.setResult(task);
                return null;
            }
            task.getError();
            return null;
        }

        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
            p0.a.s(callable, "callable");
            p0.a.s(executor, "executor");
            return call(callable, executor, null);
        }

        @NotNull
        public final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable) {
            p0.a.s(callable, "callable");
            return call(callable, Task.BACKGROUND_EXECUTOR, null);
        }

        @NotNull
        public final <TResult> Task<TResult> cancelled() {
            return Task.TASK_CANCELLED;
        }

        @NotNull
        public final Task<Void> delay(long j2) {
            return delay$facebook_bolts_release(j2, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), null);
        }

        @NotNull
        public final Task<Void> delay$facebook_bolts_release(long j2, @NotNull ScheduledExecutorService scheduledExecutorService, @Nullable CancellationToken cancellationToken) {
            p0.a.s(scheduledExecutorService, "executor");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                return cancelled();
            }
            if (j2 <= 0) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new androidx.compose.material.ripple.a(taskCompletionSource, 17), j2, TimeUnit.MILLISECONDS);
            if (cancellationToken != null) {
                cancellationToken.register(new com.facebook.appevents.b(7, schedule, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<TResult> forError(@Nullable Exception exc) {
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setError(exc);
            return taskCompletionSource.getTask();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <TResult> Task<TResult> forResult(@Nullable TResult tresult) {
            if (tresult == 0) {
                return Task.TASK_NULL;
            }
            if (tresult instanceof Boolean) {
                return ((Boolean) tresult).booleanValue() ? Task.TASK_TRUE : Task.TASK_FALSE;
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setResult(tresult);
            return taskCompletionSource.getTask();
        }

        @Nullable
        public final UnobservedExceptionHandler getUnobservedExceptionHandler() {
            return Task.unobservedExceptionHandler;
        }

        public final void setUnobservedExceptionHandler(@Nullable UnobservedExceptionHandler unobservedExceptionHandler) {
            Task.unobservedExceptionHandler = unobservedExceptionHandler;
        }

        @NotNull
        public final Task<Void> whenAll(@NotNull Collection<? extends Task<?>> collection) {
            p0.a.s(collection, "tasks");
            if (collection.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final ArrayList arrayList = new ArrayList();
            final ReentrantLock reentrantLock = new ReentrantLock();
            final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Iterator<? extends Task<?>> it = collection.iterator();
            while (it.hasNext()) {
                it.next().continueWith(new Continuation() { // from class: com.facebook.bolts.Task$Companion$whenAll$1
                    @Override // com.facebook.bolts.Continuation
                    public /* bridge */ /* synthetic */ Object then(Task task) {
                        return then((Task<Object>) task);
                    }

                    @Override // com.facebook.bolts.Continuation
                    @Nullable
                    public final Void then(@NotNull Task<Object> task) {
                        p0.a.s(task, "it");
                        if (task.isFaulted()) {
                            ReentrantLock reentrantLock2 = reentrantLock;
                            ArrayList<Exception> arrayList2 = arrayList;
                            reentrantLock2.lock();
                            try {
                                arrayList2.add(task.getError());
                            } finally {
                                reentrantLock2.unlock();
                            }
                        }
                        if (task.isCancelled()) {
                            atomicBoolean.set(true);
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (arrayList.size() != 0) {
                                if (arrayList.size() == 1) {
                                    taskCompletionSource.setError(arrayList.get(0));
                                } else {
                                    taskCompletionSource.setError(new AggregateException(androidx.compose.foundation.text.input.a.o(new Object[]{Integer.valueOf(arrayList.size())}, 1, "There were %d exceptions.", "java.lang.String.format(format, *args)"), arrayList));
                                }
                            } else if (atomicBoolean.get()) {
                                taskCompletionSource.setCancelled();
                            } else {
                                taskCompletionSource.setResult(null);
                            }
                        }
                        return null;
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<List<TResult>> whenAllResult(@NotNull final Collection<Task<TResult>> collection) {
            p0.a.s(collection, "tasks");
            return (Task<List<TResult>>) whenAll(collection).onSuccess(new Continuation<Void, List<? extends TResult>>() { // from class: com.facebook.bolts.Task$Companion$whenAllResult$1
                @Override // com.facebook.bolts.Continuation
                @NotNull
                public List<TResult> then(@NotNull Task<Void> task) {
                    p0.a.s(task, "task");
                    if (collection.isEmpty()) {
                        return w.f30218a;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<Task<TResult>> it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getResult());
                    }
                    return arrayList;
                }
            });
        }

        @NotNull
        public final Task<Task<?>> whenAny(@NotNull Collection<? extends Task<?>> collection) {
            p0.a.s(collection, "tasks");
            if (collection.isEmpty()) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Iterator<? extends Task<?>> it = collection.iterator();
            while (it.hasNext()) {
                it.next().continueWith(new d(atomicBoolean, taskCompletionSource, 1));
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<Task<TResult>> whenAnyResult(@NotNull Collection<Task<TResult>> collection) {
            p0.a.s(collection, "tasks");
            if (collection.isEmpty()) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            int i2 = 0;
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Iterator<Task<TResult>> it = collection.iterator();
            while (it.hasNext()) {
                it.next().continueWith(new d(atomicBoolean, taskCompletionSource, i2));
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor, @Nullable CancellationToken cancellationToken) {
            p0.a.s(callable, "callable");
            p0.a.s(executor, "executor");
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            try {
                executor.execute(new androidx.room.e(cancellationToken, 3, taskCompletionSource, callable));
            } catch (Exception e) {
                taskCompletionSource.setError(new ExecutorException(e));
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable, @Nullable CancellationToken cancellationToken) {
            p0.a.s(callable, "callable");
            return call(callable, Task.BACKGROUND_EXECUTOR, cancellationToken);
        }

        @NotNull
        public final Task<Void> delay(long j2, @Nullable CancellationToken cancellationToken) {
            return delay$facebook_bolts_release(j2, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), cancellationToken);
        }

        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable) {
            p0.a.s(callable, "callable");
            return call(callable, Task.IMMEDIATE_EXECUTOR, null);
        }

        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @Nullable CancellationToken cancellationToken) {
            p0.a.s(callable, "callable");
            return call(callable, Task.IMMEDIATE_EXECUTOR, cancellationToken);
        }
    }

    @d0.a
    /* loaded from: classes2.dex */
    public final class TaskCompletionSource extends com.facebook.bolts.TaskCompletionSource<TResult> {
        final /* synthetic */ Task<TResult> this$0;

        public TaskCompletionSource(Task task) {
            p0.a.s(task, "this$0");
            this.this$0 = task;
        }
    }

    /* loaded from: classes2.dex */
    public interface UnobservedExceptionHandler {
        void unobservedException(@NotNull Task<?> task, @NotNull UnobservedTaskException unobservedTaskException);
    }

    static {
        BoltsExecutors.Companion companion = BoltsExecutors.Companion;
        BACKGROUND_EXECUTOR = companion.background();
        IMMEDIATE_EXECUTOR = companion.immediate$facebook_bolts_release();
        UI_THREAD_EXECUTOR = AndroidExecutors.Companion.uiThread();
        TASK_NULL = new Task<>((Object) null);
        TASK_TRUE = new Task<>(Boolean.TRUE);
        TASK_FALSE = new Task<>(Boolean.FALSE);
        TASK_CANCELLED = new Task<>(true);
    }

    public Task() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
    }

    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable) {
        return Companion.call(callable);
    }

    @NotNull
    public static final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable) {
        return Companion.callInBackground(callable);
    }

    @NotNull
    public static final <TResult> Task<TResult> cancelled() {
        return Companion.cancelled();
    }

    public static /* synthetic */ Task continueWhile$default(Task task, Callable callable, Continuation continuation, Executor executor, CancellationToken cancellationToken, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        if ((i2 & 8) != 0) {
            cancellationToken = null;
        }
        return task.continueWhile(callable, continuation, executor, cancellationToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: continueWith$lambda-10$lambda-9, reason: not valid java name */
    public static final Void m492continueWith$lambda10$lambda9(com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        p0.a.s(taskCompletionSource, "$tcs");
        p0.a.s(continuation, "$continuation");
        p0.a.s(executor, "$executor");
        p0.a.s(task, "task");
        Companion.completeImmediately(taskCompletionSource, continuation, task, executor, cancellationToken);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: continueWithTask$lambda-12$lambda-11, reason: not valid java name */
    public static final Void m493continueWithTask$lambda12$lambda11(com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        p0.a.s(taskCompletionSource, "$tcs");
        p0.a.s(continuation, "$continuation");
        p0.a.s(executor, "$executor");
        p0.a.s(task, "task");
        Companion.completeAfterTask(taskCompletionSource, continuation, task, executor, cancellationToken);
        return null;
    }

    @NotNull
    public static final Task<Void> delay(long j2) {
        return Companion.delay(j2);
    }

    @NotNull
    public static final <TResult> Task<TResult> forError(@Nullable Exception exc) {
        return Companion.forError(exc);
    }

    @NotNull
    public static final <TResult> Task<TResult> forResult(@Nullable TResult tresult) {
        return Companion.forResult(tresult);
    }

    @Nullable
    public static final UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return Companion.getUnobservedExceptionHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: makeVoid$lambda-8, reason: not valid java name */
    public static final Task m494makeVoid$lambda8(Task task) {
        p0.a.s(task, "task");
        return task.isCancelled() ? Companion.cancelled() : task.isFaulted() ? Companion.forError(task.getError()) : Companion.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-13, reason: not valid java name */
    public static final Task m495onSuccess$lambda13(CancellationToken cancellationToken, Continuation continuation, Task task) {
        p0.a.s(continuation, "$continuation");
        p0.a.s(task, "task");
        return (cancellationToken == null || !cancellationToken.isCancellationRequested()) ? task.isFaulted() ? Companion.forError(task.getError()) : task.isCancelled() ? Companion.cancelled() : task.continueWith(continuation) : Companion.cancelled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccessTask$lambda-14, reason: not valid java name */
    public static final Task m496onSuccessTask$lambda14(CancellationToken cancellationToken, Continuation continuation, Task task) {
        p0.a.s(continuation, "$continuation");
        p0.a.s(task, "task");
        return (cancellationToken == null || !cancellationToken.isCancellationRequested()) ? task.isFaulted() ? Companion.forError(task.getError()) : task.isCancelled() ? Companion.cancelled() : task.continueWithTask(continuation) : Companion.cancelled();
    }

    private final void runContinuations() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<Continuation<TResult, Void>> list = this.continuations;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((Continuation) it.next()).then(this);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            this.continuations = null;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final void setUnobservedExceptionHandler(@Nullable UnobservedExceptionHandler unobservedExceptionHandler2) {
        Companion.setUnobservedExceptionHandler(unobservedExceptionHandler2);
    }

    @NotNull
    public static final Task<Void> whenAll(@NotNull Collection<? extends Task<?>> collection) {
        return Companion.whenAll(collection);
    }

    @NotNull
    public static final <TResult> Task<List<TResult>> whenAllResult(@NotNull Collection<Task<TResult>> collection) {
        return Companion.whenAllResult(collection);
    }

    @NotNull
    public static final Task<Task<?>> whenAny(@NotNull Collection<? extends Task<?>> collection) {
        return Companion.whenAny(collection);
    }

    @NotNull
    public static final <TResult> Task<Task<TResult>> whenAnyResult(@NotNull Collection<Task<TResult>> collection) {
        return Companion.whenAnyResult(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <TOut> Task<TOut> cast() {
        return this;
    }

    @NotNull
    public final Task<Void> continueWhile(@NotNull Callable<Boolean> callable, @NotNull Continuation<Void, Task<Void>> continuation) {
        p0.a.s(callable, "predicate");
        p0.a.s(continuation, "continuation");
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor) {
        p0.a.s(continuation, "continuation");
        p0.a.s(executor, "executor");
        return continueWith(continuation, executor, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor) {
        p0.a.s(continuation, "continuation");
        p0.a.s(executor, "executor");
        return continueWithTask(continuation, executor, null);
    }

    @Nullable
    public final Exception getError() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.errorField != null) {
                this.errorHasBeenObserved = true;
                UnobservedErrorNotifier unobservedErrorNotifier = this.unobservedErrorNotifier;
                if (unobservedErrorNotifier != null) {
                    unobservedErrorNotifier.setObserved();
                    this.unobservedErrorNotifier = null;
                }
            }
            Exception exc = this.errorField;
            reentrantLock.unlock();
            return exc;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Nullable
    public final TResult getResult() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.resultField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.cancelledField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCompleted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.completeField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isFaulted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.errorField != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.bolts.Continuation] */
    @NotNull
    public final Task<Void> makeVoid() {
        return continueWithTask(new Object());
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor) {
        p0.a.s(continuation, "continuation");
        p0.a.s(executor, "executor");
        return onSuccess(continuation, executor, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor) {
        p0.a.s(continuation, "continuation");
        p0.a.s(executor, "executor");
        return onSuccessTask(continuation, executor, null);
    }

    public final boolean trySetCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                reentrantLock.unlock();
                return false;
            }
            this.completeField = true;
            this.cancelledField = true;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetError(@Nullable Exception exc) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.errorField = exc;
            this.errorHasBeenObserved = false;
            this.condition.signalAll();
            runContinuations();
            if (!this.errorHasBeenObserved && unobservedExceptionHandler != null) {
                this.unobservedErrorNotifier = new UnobservedErrorNotifier(this);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetResult(@Nullable TResult tresult) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                reentrantLock.unlock();
                return false;
            }
            this.completeField = true;
            this.resultField = tresult;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void waitForCompletion() throws InterruptedException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @Nullable CancellationToken cancellationToken) {
        return Companion.call(callable, cancellationToken);
    }

    @NotNull
    public static final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable, @Nullable CancellationToken cancellationToken) {
        return Companion.callInBackground(callable, cancellationToken);
    }

    @NotNull
    public static final Task<Void> delay(long j2, @Nullable CancellationToken cancellationToken) {
        return Companion.delay(j2, cancellationToken);
    }

    @NotNull
    public final Task<Void> continueWhile(@NotNull Callable<Boolean> callable, @NotNull Continuation<Void, Task<Void>> continuation, @Nullable CancellationToken cancellationToken) {
        p0.a.s(callable, "predicate");
        p0.a.s(continuation, "continuation");
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor, @Nullable CancellationToken cancellationToken) {
        List<Continuation<TResult, Void>> list;
        p0.a.s(continuation, "continuation");
        p0.a.s(executor, "executor");
        com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (!isCompleted && (list = this.continuations) != null) {
                list.add(new b(taskCompletionSource, continuation, executor, cancellationToken, 0));
            }
            if (isCompleted) {
                Companion.completeImmediately(taskCompletionSource, continuation, this, executor, cancellationToken);
            }
            return taskCompletionSource.getTask();
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor, @Nullable CancellationToken cancellationToken) {
        List<Continuation<TResult, Void>> list;
        p0.a.s(continuation, "continuation");
        p0.a.s(executor, "executor");
        com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (!isCompleted && (list = this.continuations) != null) {
                list.add(new b(taskCompletionSource, continuation, executor, cancellationToken, 1));
            }
            if (isCompleted) {
                Companion.completeAfterTask(taskCompletionSource, continuation, this, executor, cancellationToken);
            }
            return taskCompletionSource.getTask();
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor, @Nullable CancellationToken cancellationToken) {
        p0.a.s(continuation, "continuation");
        p0.a.s(executor, "executor");
        return continueWithTask(new a(cancellationToken, continuation, 0), executor);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor, @Nullable CancellationToken cancellationToken) {
        p0.a.s(continuation, "continuation");
        p0.a.s(executor, "executor");
        return continueWithTask(new a(cancellationToken, continuation, 1), executor);
    }

    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
        return Companion.call(callable, executor);
    }

    @NotNull
    public final Task<Void> continueWhile(@NotNull final Callable<Boolean> callable, @NotNull final Continuation<Void, Task<Void>> continuation, @NotNull final Executor executor, @Nullable final CancellationToken cancellationToken) {
        p0.a.s(callable, "predicate");
        p0.a.s(continuation, "continuation");
        p0.a.s(executor, "executor");
        return makeVoid().continueWithTask((Continuation<Void, Task<TContinuationResult>>) new Continuation<Void, Task<Void>>() { // from class: com.facebook.bolts.Task$continueWhile$predicateContinuation$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.bolts.Continuation
            @NotNull
            public Task<Void> then(@NotNull Task<Void> task) throws Exception {
                p0.a.s(task, "task");
                CancellationToken cancellationToken2 = CancellationToken.this;
                if (cancellationToken2 != null && cancellationToken2.isCancellationRequested()) {
                    return Task.Companion.cancelled();
                }
                Boolean call = callable.call();
                p0.a.r(call, "predicate.call()");
                if (call.booleanValue()) {
                    return Task.Companion.forResult(null).onSuccessTask(continuation, executor).onSuccessTask(this, executor);
                }
                return Task.Companion.forResult(null);
            }
        }, executor);
    }

    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor, @Nullable CancellationToken cancellationToken) {
        return Companion.call(callable, executor, cancellationToken);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation) {
        p0.a.s(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        p0.a.s(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    private Task(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        trySetResult(tresult);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation, @Nullable CancellationToken cancellationToken) {
        p0.a.s(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @Nullable CancellationToken cancellationToken) {
        p0.a.s(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final boolean waitForCompletion(long j2, @NotNull TimeUnit timeUnit) throws InterruptedException {
        p0.a.s(timeUnit, "timeUnit");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await(j2, timeUnit);
            }
            boolean isCompleted = isCompleted();
            reentrantLock.unlock();
            return isCompleted;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private Task(boolean z2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        if (z2) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation) {
        p0.a.s(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        p0.a.s(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation, @Nullable CancellationToken cancellationToken) {
        p0.a.s(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @Nullable CancellationToken cancellationToken) {
        p0.a.s(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }
}
