package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001aH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0016\u0010#\u001a\u0004\u0018\u00010\u00072\n\u0010$\u001a\u00060\tj\u0002`%H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010'\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\"\u0010(\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+J$\u0010,\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+H\u0002J\u000e\u0010-\u001a\u00020\u0018*\u0004\u0018\u00010\u0007H\u0002R\t\u0010\u0003\u001a\u00020\u0004X\u0082\u0004R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\t\u0010\f\u001a\u00020\u0004X\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eX\u0082\u0004R\t\u0010\u000f\u001a\u00020\u0004X\u0082\u0004R\u0014\u0010\u0010\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006."}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "()V", "blockingTasksInBuffer", "Lkotlinx/atomicfu/AtomicInt;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "bufferSize", "", "getBufferSize", "()I", "consumerIndex", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "size", "getSize$kotlinx_coroutines_core", "add", "task", "fair", "", "addLast", "offloadAllWorkTo", "", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "poll", "pollBlocking", "pollBuffer", "pollCpu", "pollTo", "queue", "pollWithExclusiveMode", "onlyBlocking", "stealWithExclusiveMode", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryExtractFromTheMiddle", "index", "trySteal", "", "stolenTaskRef", "Lkotlin/jvm/internal/Ref$ObjectRef;", "tryStealLastScheduled", "decrementIfBlocking", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,255:1\n93#2:256\n93#2:257\n93#2:258\n93#2:261\n93#2:262\n1#3:259\n25#4:260\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n95#1:256\n162#1:257\n185#1:258\n205#1:261\n249#1:262\n205#1:260\n*E\n"})
/* loaded from: classes5.dex */
public final class WorkQueue {

    @Volatile
    private volatile int blockingTasksInBuffer;
    private final AtomicReferenceArray<Task> buffer = new AtomicReferenceArray<>(128);

    @Volatile
    private volatile int consumerIndex;

    @Volatile
    private volatile Object lastScheduledTask;

    @Volatile
    private volatile int producerIndex;
    private static final AtomicReferenceFieldUpdater lastScheduledTask$FU = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");
    private static final AtomicIntegerFieldUpdater producerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");
    private static final AtomicIntegerFieldUpdater consumerIndex$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");
    private static final AtomicIntegerFieldUpdater blockingTasksInBuffer$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");

    public static /* synthetic */ Task add$default(WorkQueue workQueue, Task task, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return workQueue.add(task, z10);
    }

    private final Task addLast(Task task) {
        if (getBufferSize() == 127) {
            return task;
        }
        boolean z10 = true;
        if (task.taskContext.getTaskMode() != 1) {
            z10 = false;
        }
        if (z10) {
            blockingTasksInBuffer$FU.incrementAndGet(this);
        }
        int i10 = producerIndex$FU.get(this) & 127;
        while (this.buffer.get(i10) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i10, task);
        producerIndex$FU.incrementAndGet(this);
        return null;
    }

    private final void decrementIfBlocking(Task task) {
        if (task != null) {
            boolean z10 = true;
            if (task.taskContext.getTaskMode() != 1) {
                z10 = false;
            }
            if (z10) {
                blockingTasksInBuffer$FU.decrementAndGet(this);
            }
        }
    }

    private final int getBufferSize() {
        return producerIndex$FU.get(this) - consumerIndex$FU.get(this);
    }

    private final Task pollBuffer() {
        Task andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = consumerIndex$FU;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - producerIndex$FU.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.buffer.getAndSet(i11, null)) != null) {
                decrementIfBlocking(andSet);
                return andSet;
            }
        }
    }

    private final boolean pollTo(GlobalQueue queue) {
        Task pollBuffer = pollBuffer();
        if (pollBuffer == null) {
            return false;
        }
        queue.addLast(pollBuffer);
        return true;
    }

    private final Task pollWithExclusiveMode(boolean onlyBlocking) {
        Task task;
        boolean z10;
        boolean z11;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lastScheduledTask$FU;
            task = (Task) atomicReferenceFieldUpdater.get(this);
            if (task != null) {
                z10 = false;
                if (task.taskContext.getTaskMode() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 != onlyBlocking) {
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, task, null)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != task) {
                        break;
                    }
                }
            }
            int i10 = consumerIndex$FU.get(this);
            int i11 = producerIndex$FU.get(this);
            while (i10 != i11) {
                if (onlyBlocking && blockingTasksInBuffer$FU.get(this) == 0) {
                    return null;
                }
                i11--;
                Task tryExtractFromTheMiddle = tryExtractFromTheMiddle(i11, onlyBlocking);
                if (tryExtractFromTheMiddle != null) {
                    return tryExtractFromTheMiddle;
                }
            }
            return null;
        } while (!z10);
        return task;
    }

    private final Task stealWithExclusiveMode(int stealingMode) {
        int i10 = consumerIndex$FU.get(this);
        int i11 = producerIndex$FU.get(this);
        boolean z10 = true;
        if (stealingMode != 1) {
            z10 = false;
        }
        while (i10 != i11) {
            if (z10 && blockingTasksInBuffer$FU.get(this) == 0) {
                return null;
            }
            int i12 = i10 + 1;
            Task tryExtractFromTheMiddle = tryExtractFromTheMiddle(i10, z10);
            if (tryExtractFromTheMiddle == null) {
                i10 = i12;
            } else {
                return tryExtractFromTheMiddle;
            }
        }
        return null;
    }

    private final Task tryExtractFromTheMiddle(int index, boolean onlyBlocking) {
        boolean z10;
        int i10 = index & 127;
        Task task = this.buffer.get(i10);
        if (task != null) {
            boolean z11 = false;
            if (task.taskContext.getTaskMode() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 == onlyBlocking) {
                AtomicReferenceArray<Task> atomicReferenceArray = this.buffer;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i10, task, null)) {
                        z11 = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i10) != task) {
                        break;
                    }
                }
                if (z11) {
                    if (onlyBlocking) {
                        blockingTasksInBuffer$FU.decrementAndGet(this);
                    }
                    return task;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlinx.coroutines.scheduling.Task, java.lang.Object] */
    private final long tryStealLastScheduled(int stealingMode, Ref.ObjectRef<Task> stolenTaskRef) {
        ?? r12;
        boolean z10;
        boolean z11;
        int i10;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lastScheduledTask$FU;
            r12 = (Task) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            z10 = false;
            if (r12.taskContext.getTaskMode() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            if ((i10 & stealingMode) == 0) {
                return -2L;
            }
            long nanoTime = TasksKt.schedulerTimeSource.nanoTime() - r12.submissionTime;
            long j3 = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
            if (nanoTime < j3) {
                return j3 - nanoTime;
            }
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, r12, null)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != r12) {
                    break;
                }
            }
        } while (!z10);
        stolenTaskRef.element = r12;
        return -1L;
    }

    public final Task add(Task task, boolean fair) {
        if (fair) {
            return addLast(task);
        }
        Task task2 = (Task) lastScheduledTask$FU.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return addLast(task2);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return lastScheduledTask$FU.get(this) != null ? getBufferSize() + 1 : getBufferSize();
    }

    public final void offloadAllWorkTo(GlobalQueue globalQueue) {
        Task task = (Task) lastScheduledTask$FU.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        do {
        } while (pollTo(globalQueue));
    }

    public final Task poll() {
        Task task = (Task) lastScheduledTask$FU.getAndSet(this, null);
        return task == null ? pollBuffer() : task;
    }

    public final Task pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    public final Task pollCpu() {
        return pollWithExclusiveMode(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int stealingMode, Ref.ObjectRef<Task> stolenTaskRef) {
        T t5;
        if (stealingMode == 3) {
            t5 = pollBuffer();
        } else {
            t5 = stealWithExclusiveMode(stealingMode);
        }
        if (t5 != 0) {
            stolenTaskRef.element = t5;
            return -1L;
        }
        return tryStealLastScheduled(stealingMode, stolenTaskRef);
    }
}
