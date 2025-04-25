package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.LogEvents;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

/* compiled from: SnapshotIdSet.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J:\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002'\u0010\u0011\u001a#\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0012H\u0086\bJ\u001d\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0002J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0096\u0002J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "upperSet", "", "lowerSet", "lowerBound", "belowBound", "", "(JJI[I)V", "and", "bits", "andNot", "clear", "bit", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "fastForEach", "", "block", "Lkotlin/Function1;", LogEvents.exportemptyalert_close_click_type_get, "", "iterator", "", "lowest", "default", "or", "set", "toString", "", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class SnapshotIdSet implements Iterable<Integer>, KMappedMarker {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    private SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = i;
        this.belowBound = iArr;
    }

    public final boolean get(int bit) {
        int[] iArr;
        int i = bit - this.lowerBound;
        if (i >= 0 && i < 64) {
            return ((1 << i) & this.lowerSet) != 0;
        }
        if (i >= 64 && i < 128) {
            return ((1 << (i - 64)) & this.upperSet) != 0;
        }
        if (i <= 0 && (iArr = this.belowBound) != null) {
            return SnapshotIdSetKt.binarySearch(iArr, bit) >= 0;
        }
        return false;
    }

    public final SnapshotIdSet set(int bit) {
        int i;
        int[] iArr;
        int i2 = this.lowerBound;
        int i3 = bit - i2;
        long j = 0;
        if (i3 >= 0 && i3 < 64) {
            long j2 = 1 << i3;
            long j3 = this.lowerSet;
            if ((j3 & j2) == 0) {
                return new SnapshotIdSet(this.upperSet, j3 | j2, i2, this.belowBound);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j4 = 1 << (i3 - 64);
            long j5 = this.upperSet;
            if ((j5 & j4) == 0) {
                return new SnapshotIdSet(j5 | j4, this.lowerSet, i2, this.belowBound);
            }
        } else if (i3 >= 128) {
            if (!get(bit)) {
                long j6 = this.upperSet;
                long j7 = this.lowerSet;
                int i4 = this.lowerBound;
                int i5 = ((bit + 1) / 64) * 64;
                ArrayList arrayList = null;
                long j8 = j7;
                long j9 = j6;
                while (true) {
                    if (i4 >= i5) {
                        i = i4;
                        break;
                    }
                    if (j8 != j) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            int[] iArr2 = this.belowBound;
                            if (iArr2 != null) {
                                for (int i6 : iArr2) {
                                    arrayList.add(Integer.valueOf(i6));
                                }
                            }
                        }
                        for (int i7 = 0; i7 < 64; i7++) {
                            if (((1 << i7) & j8) != 0) {
                                arrayList.add(Integer.valueOf(i7 + i4));
                            }
                        }
                        j = 0;
                    }
                    if (j9 == j) {
                        i = i5;
                        j8 = j;
                        break;
                    }
                    i4 += 64;
                    j8 = j9;
                    j9 = j;
                }
                if (arrayList == null || (iArr = CollectionsKt.toIntArray(arrayList)) == null) {
                    iArr = this.belowBound;
                }
                return new SnapshotIdSet(j9, j8, i, iArr).set(bit);
            }
        } else {
            int[] iArr3 = this.belowBound;
            if (iArr3 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, i2, new int[]{bit});
            }
            int binarySearch = SnapshotIdSetKt.binarySearch(iArr3, bit);
            if (binarySearch < 0) {
                int i8 = -(binarySearch + 1);
                int length = iArr3.length;
                int[] iArr4 = new int[length + 1];
                ArraysKt.copyInto(iArr3, iArr4, 0, 0, i8);
                ArraysKt.copyInto(iArr3, iArr4, i8 + 1, i8, length);
                iArr4[i8] = bit;
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr4);
            }
        }
        return this;
    }

    public final SnapshotIdSet clear(int bit) {
        int[] iArr;
        int binarySearch;
        int i = this.lowerBound;
        int i2 = bit - i;
        if (i2 >= 0 && i2 < 64) {
            long j = 1 << i2;
            long j2 = this.lowerSet;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.upperSet, j2 & (~j), i, this.belowBound);
            }
        } else if (i2 >= 64 && i2 < 128) {
            long j3 = 1 << (i2 - 64);
            long j4 = this.upperSet;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(j4 & (~j3), this.lowerSet, i, this.belowBound);
            }
        } else if (i2 < 0 && (iArr = this.belowBound) != null && (binarySearch = SnapshotIdSetKt.binarySearch(iArr, bit)) >= 0) {
            int length = iArr.length;
            int i3 = length - 1;
            if (i3 == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[i3];
            if (binarySearch > 0) {
                ArraysKt.copyInto(iArr, iArr2, 0, 0, binarySearch);
            }
            if (binarySearch < i3) {
                ArraysKt.copyInto(iArr, iArr2, binarySearch, binarySearch + 1, length);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i = bits.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet & (~bits.upperSet), this.lowerSet & (~bits.lowerSet), i2, iArr2);
            }
        }
        int[] iArr3 = bits.belowBound;
        if (iArr3 != null) {
            snapshotIdSet = this;
            for (int i3 : iArr3) {
                snapshotIdSet = snapshotIdSet.clear(i3);
            }
        } else {
            snapshotIdSet = this;
        }
        if (bits.lowerSet != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((bits.lowerSet & (1 << i4)) != 0) {
                    snapshotIdSet = snapshotIdSet.clear(bits.lowerBound + i4);
                }
            }
        }
        if (bits.upperSet != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if ((bits.upperSet & (1 << i5)) != 0) {
                    snapshotIdSet = snapshotIdSet.clear(i5 + 64 + bits.lowerBound);
                }
            }
        }
        return snapshotIdSet;
    }

    public final SnapshotIdSet and(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (Intrinsics.areEqual(bits, snapshotIdSet) || Intrinsics.areEqual(this, snapshotIdSet)) {
            return snapshotIdSet;
        }
        int i = bits.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j = this.upperSet;
                long j2 = bits.upperSet;
                long j3 = j & j2;
                long j4 = this.lowerSet;
                SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
                long j5 = bits.lowerSet;
                long j6 = j4 & j5;
                if (j3 != 0 || j6 != 0 || iArr2 != null) {
                    snapshotIdSet2 = new SnapshotIdSet(j & j2, j5 & j4, i2, iArr2);
                }
                return snapshotIdSet2;
            }
        }
        SnapshotIdSet snapshotIdSet3 = snapshotIdSet;
        int i3 = 0;
        if (this.belowBound == null) {
            int[] iArr3 = this.belowBound;
            if (iArr3 != null) {
                for (int i4 : iArr3) {
                    if (bits.get(i4)) {
                        snapshotIdSet3 = snapshotIdSet3.set(i4);
                    }
                }
            }
            SnapshotIdSet snapshotIdSet4 = snapshotIdSet3;
            long j7 = 0;
            if (this.lowerSet != 0) {
                int i5 = 0;
                while (i5 < 64) {
                    if ((this.lowerSet & (1 << i5)) != j7) {
                        int i6 = this.lowerBound + i5;
                        if (bits.get(i6)) {
                            snapshotIdSet4 = snapshotIdSet4.set(i6);
                        }
                    }
                    i5++;
                    j7 = 0;
                }
            }
            long j8 = 0;
            if (this.upperSet == 0) {
                return snapshotIdSet4;
            }
            while (i3 < 64) {
                if ((this.upperSet & (1 << i3)) != j8) {
                    int i7 = i3 + 64 + this.lowerBound;
                    if (bits.get(i7)) {
                        snapshotIdSet4 = snapshotIdSet4.set(i7);
                    }
                }
                i3++;
                j8 = 0;
            }
            return snapshotIdSet4;
        }
        int[] iArr4 = bits.belowBound;
        if (iArr4 != null) {
            for (int i8 : iArr4) {
                if (get(i8)) {
                    snapshotIdSet3 = snapshotIdSet3.set(i8);
                }
            }
        }
        SnapshotIdSet snapshotIdSet5 = snapshotIdSet3;
        long j9 = 0;
        if (bits.lowerSet != 0) {
            int i9 = 0;
            while (i9 < 64) {
                if ((bits.lowerSet & (1 << i9)) != j9) {
                    int i10 = bits.lowerBound + i9;
                    if (get(i10)) {
                        snapshotIdSet5 = snapshotIdSet5.set(i10);
                    }
                }
                i9++;
                j9 = 0;
            }
        }
        if (bits.upperSet == 0) {
            return snapshotIdSet5;
        }
        while (i3 < 64) {
            if ((bits.upperSet & (1 << i3)) != 0) {
                int i11 = i3 + 64 + bits.lowerBound;
                if (get(i11)) {
                    snapshotIdSet5 = snapshotIdSet5.set(i11);
                }
            }
            i3++;
        }
        return snapshotIdSet5;
    }

    public final SnapshotIdSet or(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return bits;
        }
        int i = bits.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet | bits.upperSet, this.lowerSet | bits.lowerSet, i2, iArr2);
            }
        }
        int i3 = 0;
        if (this.belowBound == null) {
            int[] iArr3 = this.belowBound;
            if (iArr3 != null) {
                for (int i4 : iArr3) {
                    bits = bits.set(i4);
                }
            }
            if (this.lowerSet != 0) {
                for (int i5 = 0; i5 < 64; i5++) {
                    if ((this.lowerSet & (1 << i5)) != 0) {
                        bits = bits.set(this.lowerBound + i5);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i3 < 64) {
                    if ((this.upperSet & (1 << i3)) != 0) {
                        bits = bits.set(i3 + 64 + this.lowerBound);
                    }
                    i3++;
                }
            }
            return bits;
        }
        int[] iArr4 = bits.belowBound;
        if (iArr4 != null) {
            snapshotIdSet = this;
            for (int i6 : iArr4) {
                snapshotIdSet = snapshotIdSet.set(i6);
            }
        } else {
            snapshotIdSet = this;
        }
        if (bits.lowerSet != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if ((bits.lowerSet & (1 << i7)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i7);
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i3 < 64) {
                if ((bits.upperSet & (1 << i3)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(i3 + 64 + bits.lowerBound);
                }
                i3++;
            }
        }
        return snapshotIdSet;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return SequencesKt.sequence(new SnapshotIdSet$iterator$1(this, null)).iterator();
    }

    public final void fastForEach(Function1<? super Integer, Unit> block) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i : iArr) {
                block.invoke(Integer.valueOf(i));
            }
        }
        if (this.lowerSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.lowerSet & (1 << i2)) != 0) {
                    block.invoke(Integer.valueOf(this.lowerBound + i2));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.upperSet & (1 << i3)) != 0) {
                    block.invoke(Integer.valueOf(i3 + 64 + this.lowerBound));
                }
            }
        }
    }

    public final int lowest(int r6) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.lowerSet;
        if (j != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(j);
        }
        long j2 = this.upperSet;
        return j2 != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(j2) : r6;
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append(super.toString()).append(" [");
        SnapshotIdSet snapshotIdSet = this;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotIdSet, 10));
        Iterator<Integer> it = snapshotIdSet.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        return append.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null)).append(']').toString();
    }

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }

    public final SnapshotIdSet fastFold(SnapshotIdSet initial, Function2<? super SnapshotIdSet, ? super Integer, SnapshotIdSet> operation) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i : iArr) {
                initial = operation.invoke(initial, Integer.valueOf(i));
            }
        }
        if (this.lowerSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.lowerSet & (1 << i2)) != 0) {
                    initial = operation.invoke(initial, Integer.valueOf(this.lowerBound + i2));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.upperSet & (1 << i3)) != 0) {
                    initial = operation.invoke(initial, Integer.valueOf(i3 + 64 + this.lowerBound));
                }
            }
        }
        return initial;
    }
}
