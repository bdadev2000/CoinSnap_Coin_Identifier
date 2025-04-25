package androidx.compose.ui.text.input;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ImeAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes8.dex */
public final class ImeAction {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Unspecified = m6623constructorimpl(-1);
    private static final int Default = m6623constructorimpl(1);
    private static final int None = m6623constructorimpl(0);
    private static final int Go = m6623constructorimpl(2);
    private static final int Search = m6623constructorimpl(3);
    private static final int Send = m6623constructorimpl(4);
    private static final int Previous = m6623constructorimpl(5);
    private static final int Next = m6623constructorimpl(6);
    private static final int Done = m6623constructorimpl(7);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m6622boximpl(int i) {
        return new ImeAction(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6623constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6624equalsimpl(int i, Object obj) {
        return (obj instanceof ImeAction) && i == ((ImeAction) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6625equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6626hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m6624equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6626hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    private /* synthetic */ ImeAction(int i) {
        this.value = i;
    }

    public String toString() {
        return m6627toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6627toStringimpl(int i) {
        return m6625equalsimpl0(i, Unspecified) ? "Unspecified" : m6625equalsimpl0(i, None) ? "None" : m6625equalsimpl0(i, Default) ? Profile.DEFAULT_PROFILE_NAME : m6625equalsimpl0(i, Go) ? "Go" : m6625equalsimpl0(i, Search) ? "Search" : m6625equalsimpl0(i, Send) ? "Send" : m6625equalsimpl0(i, Previous) ? "Previous" : m6625equalsimpl0(i, Next) ? "Next" : m6625equalsimpl0(i, Done) ? "Done" : "Invalid";
    }

    /* compiled from: ImeAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R$\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R$\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R$\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R$\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R$\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/input/ImeAction;", "getDefault-eUduSuo$annotations", "getDefault-eUduSuo", "()I", "I", "Done", "getDone-eUduSuo$annotations", "getDone-eUduSuo", "Go", "getGo-eUduSuo$annotations", "getGo-eUduSuo", "Next", "getNext-eUduSuo$annotations", "getNext-eUduSuo", "None", "getNone-eUduSuo$annotations", "getNone-eUduSuo", "Previous", "getPrevious-eUduSuo$annotations", "getPrevious-eUduSuo", "Search", "getSearch-eUduSuo$annotations", "getSearch-eUduSuo", "Send", "getSend-eUduSuo$annotations", "getSend-eUduSuo", "Unspecified", "getUnspecified-eUduSuo$annotations", "getUnspecified-eUduSuo", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m6629getDefaulteUduSuo$annotations() {
        }

        /* renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m6630getDoneeUduSuo$annotations() {
        }

        /* renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m6631getGoeUduSuo$annotations() {
        }

        /* renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m6632getNexteUduSuo$annotations() {
        }

        /* renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m6633getNoneeUduSuo$annotations() {
        }

        /* renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m6634getPreviouseUduSuo$annotations() {
        }

        /* renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m6635getSearcheUduSuo$annotations() {
        }

        /* renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m6636getSendeUduSuo$annotations() {
        }

        /* renamed from: getUnspecified-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m6637getUnspecifiedeUduSuo$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-eUduSuo, reason: not valid java name */
        public final int m6646getUnspecifiedeUduSuo() {
            return ImeAction.Unspecified;
        }

        /* renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m6638getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m6642getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m6640getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m6644getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m6645getSendeUduSuo() {
            return ImeAction.Send;
        }

        /* renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m6643getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m6641getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m6639getDoneeUduSuo() {
            return ImeAction.Done;
        }
    }
}
