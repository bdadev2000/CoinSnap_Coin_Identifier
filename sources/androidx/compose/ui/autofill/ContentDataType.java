package androidx.compose.ui.autofill;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ContentDataType.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType;", "", "dataType", "", "constructor-impl", "(I)I", "getDataType", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes8.dex */
public final class ContentDataType {
    private final int dataType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Text = m4133constructorimpl(1);
    private static final int List = m4133constructorimpl(3);
    private static final int Date = m4133constructorimpl(4);
    private static final int Toggle = m4133constructorimpl(2);
    private static final int None = m4133constructorimpl(0);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContentDataType m4132boximpl(int i) {
        return new ContentDataType(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4133constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4134equalsimpl(int i, Object obj) {
        return (obj instanceof ContentDataType) && i == ((ContentDataType) obj).m4138unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4135equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4136hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4137toStringimpl(int i) {
        return "ContentDataType(dataType=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m4134equalsimpl(this.dataType, obj);
    }

    public int hashCode() {
        return m4136hashCodeimpl(this.dataType);
    }

    public String toString() {
        return m4137toStringimpl(this.dataType);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4138unboximpl() {
        return this.dataType;
    }

    private /* synthetic */ ContentDataType(int i) {
        this.dataType = i;
    }

    public final int getDataType() {
        return this.dataType;
    }

    /* compiled from: ContentDataType.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType$Companion;", "", "()V", "Date", "Landroidx/compose/ui/autofill/ContentDataType;", "getDate-A48pgw8", "()I", "I", "List", "getList-A48pgw8", "None", "getNone-A48pgw8", "Text", "getText-A48pgw8", "Toggle", "getToggle-A48pgw8", "from", "value", "", "from-LGGHU18$ui_release", "(I)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getText-A48pgw8, reason: not valid java name */
        public final int m4143getTextA48pgw8() {
            return ContentDataType.Text;
        }

        /* renamed from: getList-A48pgw8, reason: not valid java name */
        public final int m4141getListA48pgw8() {
            return ContentDataType.List;
        }

        /* renamed from: getDate-A48pgw8, reason: not valid java name */
        public final int m4140getDateA48pgw8() {
            return ContentDataType.Date;
        }

        /* renamed from: getToggle-A48pgw8, reason: not valid java name */
        public final int m4144getToggleA48pgw8() {
            return ContentDataType.Toggle;
        }

        /* renamed from: getNone-A48pgw8, reason: not valid java name */
        public final int m4142getNoneA48pgw8() {
            return ContentDataType.None;
        }

        /* renamed from: from-LGGHU18$ui_release, reason: not valid java name */
        public final int m4139fromLGGHU18$ui_release(int value) {
            if (value == 0) {
                return m4142getNoneA48pgw8();
            }
            if (value == 1) {
                return m4143getTextA48pgw8();
            }
            if (value == 2) {
                return m4144getToggleA48pgw8();
            }
            if (value == 3) {
                return m4141getListA48pgw8();
            }
            if (value == 4) {
                return m4140getDateA48pgw8();
            }
            throw new IllegalArgumentException("Invalid autofill type value: " + value);
        }
    }
}
