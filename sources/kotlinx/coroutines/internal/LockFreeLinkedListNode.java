package kotlinx.coroutines.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.InternalCoroutinesApi;

@InternalCoroutinesApi
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000fJ%\u0010\u0017\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0086\bJ \u0010\u001a\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0001J\u0012\u0010\u001b\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000fJ\u001b\u0010\u001c\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0082\u0010J\u0019\u0010\u001f\u001a\u00060\u0000j\u0002`\u000f2\n\u0010 \u001a\u00060\u0000j\u0002`\u000fH\u0082\u0010J\u0014\u0010!\u001a\u00020\u00152\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0002J%\u0010\"\u001a\u00020#2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0081\bJ\u0010\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fH\u0014J\b\u0010%\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fH\u0001J\b\u0010'\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u00020)H\u0016J(\u0010*\u001a\u00020+2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000f2\u0006\u0010,\u001a\u00020#H\u0001J%\u0010-\u001a\u00020\u00152\n\u0010.\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0000¢\u0006\u0002\b/R\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004R\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004X\u0082\u0004R\u0011\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0015\u0010\u000e\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0012\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u00061"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lkotlinx/coroutines/internal/Removed;", "isRemoved", "", "()Z", "next", "getNext", "()Ljava/lang/Object;", "nextNode", "Lkotlinx/coroutines/internal/Node;", "getNextNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "prevNode", "getPrevNode", "addLast", "", "node", "addLastIf", "condition", "Lkotlin/Function0;", "addNext", "addOneIfEmpty", "correctPrev", "op", "Lkotlinx/coroutines/internal/OpDescriptor;", "findPrevNonRemoved", "current", "finishAdd", "makeCondAddOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "nextIfRemoved", "remove", "removeOrNext", "removed", "toString", "", "tryCondAddNext", "", "condAdd", "validateNode", "prev", "validateNode$kotlinx_coroutines_core", "CondAddOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n73#1,3:369\n1#2:368\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n*L\n134#1:369,3\n*E\n"})
/* loaded from: classes3.dex */
public class LockFreeLinkedListNode {
    private static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");
    private static final AtomicReferenceFieldUpdater _prev$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");
    private static final AtomicReferenceFieldUpdater _removedRef$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");

    @Volatile
    private volatile Object _next = this;

    @Volatile
    private volatile Object _prev = this;

    @Volatile
    private volatile Object _removedRef;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @PublishedApi
    /* loaded from: classes3.dex */
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {

        @JvmField
        public final LockFreeLinkedListNode newNode;

        @JvmField
        public LockFreeLinkedListNode oldNext;

        public CondAddOp(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.newNode = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public void complete(LockFreeLinkedListNode affected, Object failure) {
            boolean z10 = true;
            boolean z11 = failure == null;
            LockFreeLinkedListNode lockFreeLinkedListNode = z11 ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(affected, this, lockFreeLinkedListNode)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(affected) != this) {
                        z10 = false;
                        break;
                    }
                }
                if (z10 && z11) {
                    LockFreeLinkedListNode lockFreeLinkedListNode2 = this.newNode;
                    LockFreeLinkedListNode lockFreeLinkedListNode3 = this.oldNext;
                    Intrinsics.checkNotNull(lockFreeLinkedListNode3);
                    lockFreeLinkedListNode2.finishAdd(lockFreeLinkedListNode3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r5 = ((kotlinx.coroutines.internal.Removed) r5).ref;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.compareAndSet(r3, r2, r5) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r4.get(r3) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r6 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlinx.coroutines.internal.LockFreeLinkedListNode correctPrev(kotlinx.coroutines.internal.OpDescriptor r11) {
        /*
            r10 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            java.lang.Object r5 = r4.get(r2)
            r6 = 0
            r7 = 1
            if (r5 != r10) goto L2c
            if (r0 != r2) goto L18
            return r2
        L18:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
        L1a:
            boolean r1 = r8.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L22
            r6 = r7
            goto L28
        L22:
            java.lang.Object r1 = r8.get(r10)
            if (r1 == r0) goto L1a
        L28:
            if (r6 != 0) goto L2b
            goto L0
        L2b:
            return r2
        L2c:
            boolean r8 = r10.isRemoved()
            if (r8 == 0) goto L33
            return r1
        L33:
            if (r5 != r11) goto L36
            return r2
        L36:
            boolean r8 = r5 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r8 == 0) goto L40
            kotlinx.coroutines.internal.OpDescriptor r5 = (kotlinx.coroutines.internal.OpDescriptor) r5
            r5.perform(r2)
            goto L0
        L40:
            boolean r8 = r5 instanceof kotlinx.coroutines.internal.Removed
            if (r8 == 0) goto L66
            if (r3 == 0) goto L5d
            kotlinx.coroutines.internal.Removed r5 = (kotlinx.coroutines.internal.Removed) r5
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = r5.ref
        L4a:
            boolean r8 = r4.compareAndSet(r3, r2, r5)
            if (r8 == 0) goto L52
            r6 = r7
            goto L58
        L52:
            java.lang.Object r8 = r4.get(r3)
            if (r8 == r2) goto L4a
        L58:
            if (r6 != 0) goto L5b
            goto L0
        L5b:
            r2 = r3
            goto La
        L5d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto Lb
        L66:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r3)
            r3 = r5
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.correctPrev(kotlinx.coroutines.internal.OpDescriptor):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    private final LockFreeLinkedListNode findPrevNonRemoved(LockFreeLinkedListNode current) {
        while (current.isRemoved()) {
            current = (LockFreeLinkedListNode) _prev$FU.get(current);
        }
        return current;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdd(LockFreeLinkedListNode next) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
        do {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(next);
            if (getNext() != next) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _prev$FU;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(next, lockFreeLinkedListNode, this)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(next) != lockFreeLinkedListNode) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        if (isRemoved()) {
            next.correctPrev(null);
        }
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final Removed removed() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _removedRef$FU;
        Removed removed = (Removed) atomicReferenceFieldUpdater.get(this);
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        atomicReferenceFieldUpdater.lazySet(this, removed2);
        return removed2;
    }

    public final void addLast(LockFreeLinkedListNode node) {
        do {
        } while (!getPrevNode().addNext(node, this));
    }

    public final boolean addLastIf(LockFreeLinkedListNode node, Function0<Boolean> condition) {
        int tryCondAddNext;
        LockFreeLinkedListNode$makeCondAddOp$1 lockFreeLinkedListNode$makeCondAddOp$1 = new LockFreeLinkedListNode$makeCondAddOp$1(node, condition);
        do {
            tryCondAddNext = getPrevNode().tryCondAddNext(node, this, lockFreeLinkedListNode$makeCondAddOp$1);
            if (tryCondAddNext == 1) {
                return true;
            }
        } while (tryCondAddNext != 2);
        return false;
    }

    @PublishedApi
    public final boolean addNext(LockFreeLinkedListNode node, LockFreeLinkedListNode next) {
        boolean z10;
        _prev$FU.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, next, node)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != next) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        node.finishAdd(next);
        return true;
    }

    public final boolean addOneIfEmpty(LockFreeLinkedListNode node) {
        boolean z10;
        _prev$FU.lazySet(node, this);
        _next$FU.lazySet(node, this);
        do {
            z10 = false;
            if (getNext() != this) {
                return false;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, this, node)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != this) {
                    break;
                }
            }
        } while (!z10);
        node.finishAdd(this);
        return true;
    }

    public final Object getNext() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    public final LockFreeLinkedListNode getNextNode() {
        return LockFreeLinkedListKt.unwrap(getNext());
    }

    public final LockFreeLinkedListNode getPrevNode() {
        LockFreeLinkedListNode correctPrev = correctPrev(null);
        return correctPrev == null ? findPrevNonRemoved((LockFreeLinkedListNode) _prev$FU.get(this)) : correctPrev;
    }

    public boolean isRemoved() {
        return getNext() instanceof Removed;
    }

    @PublishedApi
    public final CondAddOp makeCondAddOp(LockFreeLinkedListNode node, Function0<Boolean> condition) {
        return new LockFreeLinkedListNode$makeCondAddOp$1(node, condition);
    }

    public LockFreeLinkedListNode nextIfRemoved() {
        Object next = getNext();
        Removed removed = next instanceof Removed ? (Removed) next : null;
        if (removed != null) {
            return removed.ref;
        }
        return null;
    }

    /* renamed from: remove */
    public boolean mo1713remove() {
        return removeOrNext() == null;
    }

    @PublishedApi
    public final LockFreeLinkedListNode removeOrNext() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        boolean z10;
        do {
            Object next = getNext();
            if (next instanceof Removed) {
                return ((Removed) next).ref;
            }
            if (next == this) {
                return (LockFreeLinkedListNode) next;
            }
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            Removed removed = lockFreeLinkedListNode.removed();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, next, removed)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != next) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        lockFreeLinkedListNode.correctPrev(null);
        return null;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return DebugStringsKt.getClassSimpleName(this.receiver);
            }
        } + '@' + DebugStringsKt.getHexAddress(this);
    }

    @PublishedApi
    public final int tryCondAddNext(LockFreeLinkedListNode node, LockFreeLinkedListNode next, CondAddOp condAdd) {
        boolean z10;
        _prev$FU.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, next, condAdd)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != next) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return 0;
        }
        if (condAdd.perform(this) == null) {
            return 1;
        }
        return 2;
    }

    public final void validateNode$kotlinx_coroutines_core(LockFreeLinkedListNode prev, LockFreeLinkedListNode next) {
    }
}
