package kotlinx.coroutines.internal;

import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a8\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\tH\u0082\b\u001a!\u0010\r\u001a\u0002H\u000e\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f*\u0002H\u000eH\u0000¢\u0006\u0002\u0010\u0010\u001av\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u0002H\u001328\b\b\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0080\bø\u0001\u0000\u001aj\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\u0002H\u00132\u0006\u0010\u0016\u001a\u00020\u001726\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u001f\u001a\u0002H\u0013H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "POINTERS_SHIFT", "", "addConditionally", "", "Lkotlinx/atomicfu/AtomicInt;", "delta", "condition", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", BidResponsed.KEY_CUR, "close", "N", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "findSegmentAndMoveForward", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "S", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicRef;", "id", "", "startFrom", "createNewSegment", "Lkotlin/Function2;", "prev", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "moveForward", "to", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,269:1\n46#1,8:284\n107#2,7:270\n107#2,7:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n74#1:284,8\n27#1:270,7\n85#1:277,7\n*E\n"})
/* loaded from: classes3.dex */
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    public static final /* synthetic */ Symbol access$getCLOSED$p() {
        return CLOSED;
    }

    private static final boolean addConditionally$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i10, Function1<? super Integer, Boolean> function1) {
        int i11;
        do {
            i11 = atomicIntegerFieldUpdater.get(obj);
            if (!function1.invoke(Integer.valueOf(i11)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i11, i11 + i10));
        return true;
    }

    private static final boolean addConditionally$atomicfu$array(Object obj, AtomicIntegerArray atomicIntegerArray, int i10, int i11, Function1<? super Integer, Boolean> function1) {
        int i12;
        do {
            i12 = atomicIntegerArray.get(i10);
            if (!function1.invoke(Integer.valueOf(i12)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i10, i12, i12 + i11));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n10) {
        while (true) {
            Object nextOrClosed = n10.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n10;
            }
            ?? r02 = (ConcurrentLinkedListNode) nextOrClosed;
            if (r02 == 0) {
                if (n10.markAsClosed()) {
                    return n10;
                }
            } else {
                n10 = r02;
            }
        }
    }

    public static final Object findSegmentAndMoveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j3, Segment segment, Function2 function2) {
        Object findSegmentInternal;
        boolean z10;
        do {
            findSegmentInternal = findSegmentInternal(segment, j3, function2);
            if (SegmentOrClosed.m1722isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment m1720getSegmentimpl = SegmentOrClosed.m1720getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater.get(obj);
                z10 = true;
                if (segment2.id >= m1720getSegmentimpl.id) {
                    break;
                }
                boolean z11 = false;
                if (!m1720getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    z10 = false;
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(obj, segment2, m1720getSegmentimpl)) {
                        z11 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(obj) != segment2) {
                        break;
                    }
                }
                if (z11) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                } else if (m1720getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m1720getSegmentimpl.remove();
                }
            }
        } while (!z10);
        return findSegmentInternal;
    }

    public static final Object findSegmentAndMoveForward$atomicfu$array(Object obj, AtomicReferenceArray atomicReferenceArray, int i10, long j3, Segment segment, Function2 function2) {
        Object findSegmentInternal;
        boolean z10;
        do {
            findSegmentInternal = findSegmentInternal(segment, j3, function2);
            if (SegmentOrClosed.m1722isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment m1720getSegmentimpl = SegmentOrClosed.m1720getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment2 = (Segment) atomicReferenceArray.get(i10);
                z10 = true;
                if (segment2.id >= m1720getSegmentimpl.id) {
                    break;
                }
                boolean z11 = false;
                if (!m1720getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    z10 = false;
                    break;
                }
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i10, segment2, m1720getSegmentimpl)) {
                        z11 = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i10) != segment2) {
                        break;
                    }
                }
                if (z11) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                } else if (m1720getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m1720getSegmentimpl.remove();
                }
            }
        } while (!z10);
        return findSegmentInternal;
    }

    public static final <S extends Segment<S>> Object findSegmentInternal(S s5, long j3, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s5.id >= j3 && !s5.isRemoved()) {
                return SegmentOrClosed.m1717constructorimpl(s5);
            }
            Object nextOrClosed = s5.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m1717constructorimpl(CLOSED);
            }
            S s10 = (S) ((ConcurrentLinkedListNode) nextOrClosed);
            if (s10 == null) {
                s10 = function2.invoke(Long.valueOf(s5.id + 1), s5);
                if (s5.trySetNext(s10)) {
                    if (s5.isRemoved()) {
                        s5.remove();
                    }
                }
            }
            s5 = s10;
        }
    }

    public static final boolean moveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Segment segment) {
        while (true) {
            Segment segment2 = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment2.id >= segment.id) {
                return true;
            }
            boolean z10 = false;
            if (!segment.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(obj, segment2, segment)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(obj) != segment2) {
                    break;
                }
            }
            if (z10) {
                if (segment2.decPointers$kotlinx_coroutines_core()) {
                    segment2.remove();
                }
                return true;
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
        }
    }

    public static final boolean moveForward$atomicfu$array(Object obj, AtomicReferenceArray atomicReferenceArray, int i10, Segment segment) {
        while (true) {
            Segment segment2 = (Segment) atomicReferenceArray.get(i10);
            if (segment2.id >= segment.id) {
                return true;
            }
            boolean z10 = false;
            if (!segment.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (true) {
                if (atomicReferenceArray.compareAndSet(i10, segment2, segment)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceArray.get(i10) != segment2) {
                    break;
                }
            }
            if (z10) {
                if (segment2.decPointers$kotlinx_coroutines_core()) {
                    segment2.remove();
                }
                return true;
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
        }
    }
}
