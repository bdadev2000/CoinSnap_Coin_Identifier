package androidx.compose.ui.focus;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FocusDirection.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes8.dex */
public final class FocusDirection {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Next = m4184constructorimpl(1);
    private static final int Previous = m4184constructorimpl(2);
    private static final int Left = m4184constructorimpl(3);
    private static final int Right = m4184constructorimpl(4);
    private static final int Up = m4184constructorimpl(5);
    private static final int Down = m4184constructorimpl(6);
    private static final int Enter = m4184constructorimpl(7);
    private static final int Exit = m4184constructorimpl(8);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m4183boximpl(int i) {
        return new FocusDirection(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4184constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4185equalsimpl(int i, Object obj) {
        return (obj instanceof FocusDirection) && i == ((FocusDirection) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4186equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4187hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m4185equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4187hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    private /* synthetic */ FocusDirection(int i) {
        this.value = i;
    }

    public String toString() {
        return m4188toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4188toStringimpl(int i) {
        if (m4186equalsimpl0(i, Next)) {
            return "Next";
        }
        if (m4186equalsimpl0(i, Previous)) {
            return "Previous";
        }
        if (m4186equalsimpl0(i, Left)) {
            return "Left";
        }
        if (m4186equalsimpl0(i, Right)) {
            return "Right";
        }
        if (m4186equalsimpl0(i, Up)) {
            return "Up";
        }
        if (m4186equalsimpl0(i, Down)) {
            return "Down";
        }
        if (m4186equalsimpl0(i, Enter)) {
            return "Enter";
        }
        if (m4186equalsimpl0(i, Exit)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    /* compiled from: FocusDirection.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0006R$\u0010\u000b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection$Companion;", "", "()V", "Down", "Landroidx/compose/ui/focus/FocusDirection;", "getDown-dhqQ-8s", "()I", "I", "Enter", "getEnter-dhqQ-8s$annotations", "getEnter-dhqQ-8s", "Exit", "getExit-dhqQ-8s$annotations", "getExit-dhqQ-8s", "Left", "getLeft-dhqQ-8s", "Next", "getNext-dhqQ-8s", "Previous", "getPrevious-dhqQ-8s", "Right", "getRight-dhqQ-8s", "Up", "getUp-dhqQ-8s", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEnter-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m4190getEnterdhqQ8s$annotations() {
        }

        /* renamed from: getExit-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m4191getExitdhqQ8s$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m4196getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m4197getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m4195getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m4198getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m4199getUpdhqQ8s() {
            return FocusDirection.Up;
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m4192getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m4193getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m4194getExitdhqQ8s() {
            return FocusDirection.Exit;
        }
    }
}
