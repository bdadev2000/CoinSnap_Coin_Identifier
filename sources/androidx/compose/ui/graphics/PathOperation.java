package androidx.compose.ui.graphics;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PathOperation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes8.dex */
public final class PathOperation {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Difference = m4801constructorimpl(0);
    private static final int Intersect = m4801constructorimpl(1);
    private static final int Union = m4801constructorimpl(2);
    private static final int Xor = m4801constructorimpl(3);
    private static final int ReverseDifference = m4801constructorimpl(4);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m4800boximpl(int i) {
        return new PathOperation(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4801constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4802equalsimpl(int i, Object obj) {
        return (obj instanceof PathOperation) && i == ((PathOperation) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4803equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4804hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m4802equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4804hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    /* compiled from: PathOperation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation$Companion;", "", "()V", "Difference", "Landroidx/compose/ui/graphics/PathOperation;", "getDifference-b3I0S0c", "()I", "I", "Intersect", "getIntersect-b3I0S0c", "ReverseDifference", "getReverseDifference-b3I0S0c", "Union", "getUnion-b3I0S0c", "Xor", "getXor-b3I0S0c", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m4807getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m4808getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m4810getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m4811getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        /* renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m4809getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }
    }

    private /* synthetic */ PathOperation(int i) {
        this.value = i;
    }

    public String toString() {
        return m4805toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4805toStringimpl(int i) {
        return m4803equalsimpl0(i, Difference) ? "Difference" : m4803equalsimpl0(i, Intersect) ? "Intersect" : m4803equalsimpl0(i, Union) ? "Union" : m4803equalsimpl0(i, Xor) ? "Xor" : m4803equalsimpl0(i, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }
}
