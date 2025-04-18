package com.facebook.internal;

import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class WorkQueue {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_MAX_CONCURRENT = 8;

    @NotNull
    private final Executor executor;
    private final int maxConcurrent;

    @Nullable
    private WorkNode pendingJobs;
    private int runningCount;

    @Nullable
    private WorkNode runningJobs;

    @NotNull
    private final ReentrantLock workLock;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* renamed from: assert */
        public final void m540assert(boolean z2) {
            if (!z2) {
                throw new FacebookException("Validation failed");
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface WorkItem {
        boolean cancel();

        boolean isRunning();

        void moveToFront();
    }

    /* loaded from: classes2.dex */
    public final class WorkNode implements WorkItem {

        @NotNull
        private final Runnable callback;
        private boolean isRunning;

        @Nullable
        private WorkNode next;

        @Nullable
        private WorkNode prev;
        final /* synthetic */ WorkQueue this$0;

        public WorkNode(@NotNull WorkQueue workQueue, Runnable runnable) {
            p0.a.s(workQueue, "this$0");
            p0.a.s(runnable, "callback");
            this.this$0 = workQueue;
            this.callback = runnable;
        }

        @NotNull
        public final WorkNode addToList(@Nullable WorkNode workNode, boolean z2) {
            Companion companion = WorkQueue.Companion;
            companion.m540assert(this.next == null);
            companion.m540assert(this.prev == null);
            if (workNode == null) {
                this.prev = this;
                this.next = this;
                workNode = this;
            } else {
                this.next = workNode;
                WorkNode workNode2 = workNode.prev;
                this.prev = workNode2;
                if (workNode2 != null) {
                    workNode2.next = this;
                }
                WorkNode workNode3 = this.next;
                if (workNode3 != null) {
                    workNode3.prev = workNode2 == null ? null : workNode2.next;
                }
            }
            return z2 ? this : workNode;
        }

        @Override // com.facebook.internal.WorkQueue.WorkItem
        public boolean cancel() {
            ReentrantLock reentrantLock = this.this$0.workLock;
            WorkQueue workQueue = this.this$0;
            reentrantLock.lock();
            try {
                if (isRunning()) {
                    reentrantLock.unlock();
                    return false;
                }
                workQueue.pendingJobs = removeFromList(workQueue.pendingJobs);
                reentrantLock.unlock();
                return true;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @NotNull
        public final Runnable getCallback() {
            return this.callback;
        }

        @Nullable
        public final WorkNode getNext() {
            return this.next;
        }

        @Override // com.facebook.internal.WorkQueue.WorkItem
        public boolean isRunning() {
            return this.isRunning;
        }

        @Override // com.facebook.internal.WorkQueue.WorkItem
        public void moveToFront() {
            ReentrantLock reentrantLock = this.this$0.workLock;
            WorkQueue workQueue = this.this$0;
            reentrantLock.lock();
            try {
                if (!isRunning()) {
                    workQueue.pendingJobs = removeFromList(workQueue.pendingJobs);
                    workQueue.pendingJobs = addToList(workQueue.pendingJobs, true);
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Nullable
        public final WorkNode removeFromList(@Nullable WorkNode workNode) {
            Companion companion = WorkQueue.Companion;
            companion.m540assert(this.next != null);
            companion.m540assert(this.prev != null);
            if (workNode == this && (workNode = this.next) == this) {
                workNode = null;
            }
            WorkNode workNode2 = this.next;
            if (workNode2 != null) {
                workNode2.prev = this.prev;
            }
            WorkNode workNode3 = this.prev;
            if (workNode3 != null) {
                workNode3.next = workNode2;
            }
            this.prev = null;
            this.next = null;
            return workNode;
        }

        public void setRunning(boolean z2) {
            this.isRunning = z2;
        }

        public final void verify(boolean z2) {
            WorkNode workNode;
            WorkNode workNode2;
            Companion companion = WorkQueue.Companion;
            WorkNode workNode3 = this.prev;
            if (workNode3 == null || (workNode = workNode3.next) == null) {
                workNode = this;
            }
            companion.m540assert(workNode == this);
            WorkNode workNode4 = this.next;
            if (workNode4 == null || (workNode2 = workNode4.prev) == null) {
                workNode2 = this;
            }
            companion.m540assert(workNode2 == this);
            companion.m540assert(isRunning() == z2);
        }
    }

    public WorkQueue() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ WorkItem addActiveWorkItem$default(WorkQueue workQueue, Runnable runnable, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return workQueue.addActiveWorkItem(runnable, z2);
    }

    private final void execute(WorkNode workNode) {
        this.executor.execute(new k(0, workNode, this));
    }

    /* renamed from: execute$lambda-2 */
    public static final void m539execute$lambda2(WorkNode workNode, WorkQueue workQueue) {
        p0.a.s(workNode, "$node");
        p0.a.s(workQueue, "this$0");
        try {
            workNode.getCallback().run();
        } finally {
            workQueue.finishItemAndStartNew(workNode);
        }
    }

    private final void finishItemAndStartNew(WorkNode workNode) {
        WorkNode workNode2;
        this.workLock.lock();
        if (workNode != null) {
            this.runningJobs = workNode.removeFromList(this.runningJobs);
            this.runningCount--;
        }
        if (this.runningCount < this.maxConcurrent) {
            workNode2 = this.pendingJobs;
            if (workNode2 != null) {
                this.pendingJobs = workNode2.removeFromList(workNode2);
                this.runningJobs = workNode2.addToList(this.runningJobs, false);
                this.runningCount++;
                workNode2.setRunning(true);
            }
        } else {
            workNode2 = null;
        }
        this.workLock.unlock();
        if (workNode2 != null) {
            execute(workNode2);
        }
    }

    private final void startItem() {
        finishItemAndStartNew(null);
    }

    @NotNull
    public final WorkItem addActiveWorkItem(@NotNull Runnable runnable) {
        p0.a.s(runnable, "callback");
        return addActiveWorkItem$default(this, runnable, false, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r1 = com.facebook.internal.WorkQueue.Companion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r6.runningCount != r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r1.m540assert(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r0.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r1 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        r1.verify(true);
        r4 = r4 + 1;
        r1 = r1.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r1 != r6.runningJobs) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void validate() {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.workLock
            r0.lock()
            com.facebook.internal.WorkQueue$WorkNode r1 = r6.runningJobs     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            r3 = 1
            r4 = r2
            if (r1 == 0) goto L29
        Lc:
            if (r1 == 0) goto L1d
            r1.verify(r3)     // Catch: java.lang.Throwable -> L1b
            int r4 = r4 + r3
            com.facebook.internal.WorkQueue$WorkNode r1 = r1.getNext()     // Catch: java.lang.Throwable -> L1b
            com.facebook.internal.WorkQueue$WorkNode r5 = r6.runningJobs     // Catch: java.lang.Throwable -> L1b
            if (r1 != r5) goto Lc
            goto L29
        L1b:
            r1 = move-exception
            goto L37
        L1d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2     // Catch: java.lang.Throwable -> L1b
        L29:
            com.facebook.internal.WorkQueue$Companion r1 = com.facebook.internal.WorkQueue.Companion     // Catch: java.lang.Throwable -> L1b
            int r5 = r6.runningCount     // Catch: java.lang.Throwable -> L1b
            if (r5 != r4) goto L30
            r2 = r3
        L30:
            com.facebook.internal.WorkQueue.Companion.access$assert(r1, r2)     // Catch: java.lang.Throwable -> L1b
            r0.unlock()
            return
        L37:
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WorkQueue.validate():void");
    }

    public WorkQueue(int i2) {
        this(i2, null, 2, null);
    }

    @NotNull
    public final WorkItem addActiveWorkItem(@NotNull Runnable runnable, boolean z2) {
        p0.a.s(runnable, "callback");
        WorkNode workNode = new WorkNode(this, runnable);
        ReentrantLock reentrantLock = this.workLock;
        reentrantLock.lock();
        try {
            this.pendingJobs = workNode.addToList(this.pendingJobs, z2);
            reentrantLock.unlock();
            startItem();
            return workNode;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public WorkQueue(int i2, @NotNull Executor executor) {
        p0.a.s(executor, "executor");
        this.maxConcurrent = i2;
        this.executor = executor;
        this.workLock = new ReentrantLock();
    }

    public /* synthetic */ WorkQueue(int i2, Executor executor, int i3, kotlin.jvm.internal.k kVar) {
        this((i3 & 1) != 0 ? 8 : i2, (i3 & 2) != 0 ? FacebookSdk.getExecutor() : executor);
    }
}
