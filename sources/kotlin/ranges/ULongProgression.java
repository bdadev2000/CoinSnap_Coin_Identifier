package kotlin.ranges;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0086\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst-s-VKNKU", "()J", "J", "last", "getLast-s-VKNKU", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes4.dex */
public class ULongProgression implements Iterable<ULong>, KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/ULongProgression;", "rangeStart", "Lkotlin/ULong;", "rangeEnd", "step", "", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final ULongProgression m1378fromClosedRange7ftBX0g(long rangeStart, long rangeEnd, long step) {
            return new ULongProgression(rangeStart, rangeEnd, step, null);
        }
    }

    public /* synthetic */ ULongProgression(long j3, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j3, j10, j11);
    }

    public boolean equals(Object other) {
        if (other instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) other).isEmpty()) {
                ULongProgression uLongProgression = (ULongProgression) other;
                if (this.first != uLongProgression.first || this.last != uLongProgression.last || this.step != uLongProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: getFirst-s-VKNKU, reason: not valid java name and from getter */
    public final long getFirst() {
        return this.first;
    }

    /* renamed from: getLast-s-VKNKU, reason: not valid java name and from getter */
    public final long getLast() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j3 = this.first;
        int m319constructorimpl = ((int) ULong.m319constructorimpl(j3 ^ ULong.m319constructorimpl(j3 >>> 32))) * 31;
        long j10 = this.last;
        int m319constructorimpl2 = (m319constructorimpl + ((int) ULong.m319constructorimpl(j10 ^ ULong.m319constructorimpl(j10 >>> 32)))) * 31;
        long j11 = this.step;
        return m319constructorimpl2 + ((int) ((j11 >>> 32) ^ j11));
    }

    public boolean isEmpty() {
        long j3 = this.step;
        long j10 = this.first ^ Long.MIN_VALUE;
        long j11 = Long.MIN_VALUE ^ this.last;
        if (j3 > 0) {
            if (Long.compare(j10, j11) > 0) {
                return true;
            }
        } else if (Long.compare(j10, j11) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<ULong> iterator() {
        return new ULongProgressionIterator(this.first, this.last, this.step, null);
    }

    public String toString() {
        StringBuilder sb2;
        long j3;
        if (this.step > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) ULong.m365toStringimpl(this.first));
            sb2.append("..");
            sb2.append((Object) ULong.m365toStringimpl(this.last));
            sb2.append(" step ");
            j3 = this.step;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) ULong.m365toStringimpl(this.first));
            sb2.append(" downTo ");
            sb2.append((Object) ULong.m365toStringimpl(this.last));
            sb2.append(" step ");
            j3 = -this.step;
        }
        sb2.append(j3);
        return sb2.toString();
    }

    private ULongProgression(long j3, long j10, long j11) {
        if (j11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j11 != Long.MIN_VALUE) {
            this.first = j3;
            this.last = UProgressionUtilKt.m1352getProgressionLastElement7ftBX0g(j3, j10, j11);
            this.step = j11;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }
}
