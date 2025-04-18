package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

@Stable
/* loaded from: classes2.dex */
public final class TransformedTextFieldState {

    /* renamed from: a, reason: collision with root package name */
    public final TextFieldState f6651a;

    /* renamed from: b, reason: collision with root package name */
    public InputTransformation f6652b;

    /* renamed from: c, reason: collision with root package name */
    public final CodepointTransformation f6653c;
    public final OutputTransformation d;
    public final State e;

    /* renamed from: f, reason: collision with root package name */
    public final State f6654f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6655g;

    /* loaded from: classes2.dex */
    public static final class Companion {

        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6656a;

            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f6656a = iArr;
            }
        }

        public static final long a(long j2, OffsetMappingCalculator offsetMappingCalculator) {
            int i2 = TextRange.f17057c;
            long a2 = offsetMappingCalculator.a((int) (j2 >> 32), false);
            long a3 = TextRange.c(j2) ? a2 : offsetMappingCalculator.a((int) (4294967295L & j2), false);
            int min = Math.min(TextRange.f(a2), TextRange.f(a3));
            int max = Math.max(TextRange.e(a2), TextRange.e(a3));
            return TextRange.g(j2) ? TextRangeKt.a(max, min) : TextRangeKt.a(min, max);
        }

        public static long b(long j2, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
            int i2 = TextRange.f17057c;
            long a2 = offsetMappingCalculator.a((int) (j2 >> 32), true);
            long a3 = TextRange.c(j2) ? a2 : offsetMappingCalculator.a((int) (j2 & 4294967295L), true);
            int min = Math.min(TextRange.f(a2), TextRange.f(a3));
            int max = Math.max(TextRange.e(a2), TextRange.e(a3));
            long a4 = TextRange.g(j2) ? TextRangeKt.a(max, min) : TextRangeKt.a(min, max);
            if (!TextRange.c(j2) || TextRange.c(a4)) {
                return a4;
            }
            WedgeAffinity wedgeAffinity = selectionWedgeAffinity != null ? selectionWedgeAffinity.f6480a : null;
            int i3 = wedgeAffinity == null ? -1 : WhenMappings.f6656a[wedgeAffinity.ordinal()];
            if (i3 == -1) {
                return a4;
            }
            if (i3 == 1) {
                int i4 = (int) (a4 >> 32);
                return TextRangeKt.a(i4, i4);
            }
            if (i3 != 2) {
                throw new RuntimeException();
            }
            int i5 = (int) (a4 & 4294967295L);
            return TextRangeKt.a(i5, i5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TransformedText {

        /* renamed from: a, reason: collision with root package name */
        public final TextFieldCharSequence f6657a;

        /* renamed from: b, reason: collision with root package name */
        public final OffsetMappingCalculator f6658b;

        public TransformedText(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            this.f6657a = textFieldCharSequence;
            this.f6658b = offsetMappingCalculator;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) obj;
            return p0.a.g(this.f6657a, transformedText.f6657a) && p0.a.g(this.f6658b, transformedText.f6658b);
        }

        public final int hashCode() {
            return this.f6658b.hashCode() + (this.f6657a.hashCode() * 31);
        }

        public final String toString() {
            return "TransformedText(text=" + ((Object) this.f6657a) + ", offsetMapping=" + this.f6658b + ')';
        }
    }

    public TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation) {
        ParcelableSnapshotMutableState f2;
        this.f6651a = textFieldState;
        this.f6652b = inputTransformation;
        this.f6653c = codepointTransformation;
        this.d = outputTransformation;
        this.e = outputTransformation != null ? SnapshotStateKt.e(new TransformedTextFieldState$outputTransformedText$1$1(this, outputTransformation)) : null;
        this.f6654f = codepointTransformation != null ? SnapshotStateKt.e(new TransformedTextFieldState$codepointTransformedText$1$1(this, codepointTransformation)) : null;
        f2 = SnapshotStateKt.f(new SelectionWedgeAffinity(WedgeAffinity.f6668a), StructuralEqualityPolicy.f14078a);
        this.f6655g = f2;
    }

    public static void h(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i2) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
        }
        InputTransformation inputTransformation = transformedTextFieldState.f6652b;
        TextFieldState textFieldState = transformedTextFieldState.f6651a;
        textFieldState.f6307b.f6400b.b();
        EditingBuffer editingBuffer = textFieldState.f6307b;
        if (z2) {
            editingBuffer.b();
        }
        long e = editingBuffer.e();
        editingBuffer.f(TextRange.f(e), TextRange.e(e), charSequence);
        int length = charSequence.length() + TextRange.f(e);
        editingBuffer.h(length, length);
        TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public static void i(TransformedTextFieldState transformedTextFieldState, String str, long j2, boolean z2, int i2) {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = (i2 & 4) != 0 ? TextFieldEditUndoBehavior.f6873a : null;
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        InputTransformation inputTransformation = transformedTextFieldState.f6652b;
        TextFieldState textFieldState = transformedTextFieldState.f6651a;
        textFieldState.f6307b.f6400b.b();
        EditingBuffer editingBuffer = textFieldState.f6307b;
        long f2 = transformedTextFieldState.f(j2);
        editingBuffer.f(TextRange.f(f2), TextRange.e(f2), str);
        int length = str.length() + TextRange.f(f2);
        editingBuffer.h(length, length);
        TextFieldState.a(textFieldState, inputTransformation, z2, textFieldEditUndoBehavior);
    }

    public final void a() {
        InputTransformation inputTransformation = this.f6652b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
        TextFieldState textFieldState = this.f6651a;
        textFieldState.f6307b.f6400b.b();
        EditingBuffer editingBuffer = textFieldState.f6307b;
        editingBuffer.h(TextRange.e(editingBuffer.e()), TextRange.e(editingBuffer.e()));
        TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.compose.foundation.text.input.internal.b r5, h0.g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f6662b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.jvm.internal.q.m(r6)
            goto L5b
        L2f:
            kotlin.jvm.internal.q.m(r6)
            r0.getClass()
            r0.f6661a = r5
            r0.d = r3
            b1.l r6 = new b1.l
            h0.g r0 = b1.f0.r(r0)
            r6.<init>(r3, r0)
            r6.p()
            androidx.compose.foundation.text.input.TextFieldState r0 = r4.f6651a
            androidx.compose.runtime.collection.MutableVector r0 = r0.f6309f
            r0.b(r5)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1 r0 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
            r0.<init>(r4, r5)
            r6.z(r0)
            java.lang.Object r5 = r6.o()
            if (r5 != r1) goto L5b
            return
        L5b:
            d0.e r5 = new d0.e
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.b(androidx.compose.foundation.text.input.internal.b, h0.g):void");
    }

    public final TextFieldCharSequence c() {
        TransformedText transformedText;
        TextFieldCharSequence textFieldCharSequence;
        State state = this.e;
        return (state == null || (transformedText = (TransformedText) state.getValue()) == null || (textFieldCharSequence = transformedText.f6657a) == null) ? this.f6651a.b() : textFieldCharSequence;
    }

    public final TextFieldCharSequence d() {
        TransformedText transformedText;
        TextFieldCharSequence textFieldCharSequence;
        State state = this.f6654f;
        return (state == null || (transformedText = (TransformedText) state.getValue()) == null || (textFieldCharSequence = transformedText.f6657a) == null) ? c() : textFieldCharSequence;
    }

    public final long e(int i2) {
        TransformedText transformedText;
        TransformedText transformedText2;
        State state = this.e;
        OffsetMappingCalculator offsetMappingCalculator = null;
        OffsetMappingCalculator offsetMappingCalculator2 = (state == null || (transformedText2 = (TransformedText) state.getValue()) == null) ? null : transformedText2.f6658b;
        State state2 = this.f6654f;
        if (state2 != null && (transformedText = (TransformedText) state2.getValue()) != null) {
            offsetMappingCalculator = transformedText.f6658b;
        }
        long a2 = offsetMappingCalculator != null ? offsetMappingCalculator.a(i2, false) : TextRangeKt.a(i2, i2);
        return offsetMappingCalculator2 != null ? Companion.a(a2, offsetMappingCalculator2) : a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
        if (p0.a.g(this.f6651a, transformedTextFieldState.f6651a) && p0.a.g(this.f6653c, transformedTextFieldState.f6653c)) {
            return p0.a.g(this.d, transformedTextFieldState.d);
        }
        return false;
    }

    public final long f(long j2) {
        TransformedText transformedText;
        TransformedText transformedText2;
        State state = this.e;
        OffsetMappingCalculator offsetMappingCalculator = null;
        OffsetMappingCalculator offsetMappingCalculator2 = (state == null || (transformedText2 = (TransformedText) state.getValue()) == null) ? null : transformedText2.f6658b;
        State state2 = this.f6654f;
        if (state2 != null && (transformedText = (TransformedText) state2.getValue()) != null) {
            offsetMappingCalculator = transformedText.f6658b;
        }
        if (offsetMappingCalculator != null) {
            j2 = Companion.a(j2, offsetMappingCalculator);
        }
        return offsetMappingCalculator2 != null ? Companion.a(j2, offsetMappingCalculator2) : j2;
    }

    public final long g(long j2) {
        TransformedText transformedText;
        TransformedText transformedText2;
        State state = this.e;
        OffsetMappingCalculator offsetMappingCalculator = (state == null || (transformedText2 = (TransformedText) state.getValue()) == null) ? null : transformedText2.f6658b;
        State state2 = this.f6654f;
        OffsetMappingCalculator offsetMappingCalculator2 = (state2 == null || (transformedText = (TransformedText) state2.getValue()) == null) ? null : transformedText.f6658b;
        if (offsetMappingCalculator != null) {
            j2 = Companion.b(j2, offsetMappingCalculator, null);
        }
        return offsetMappingCalculator2 != null ? Companion.b(j2, offsetMappingCalculator2, (SelectionWedgeAffinity) this.f6655g.getValue()) : j2;
    }

    public final int hashCode() {
        int hashCode = this.f6651a.hashCode() * 31;
        CodepointTransformation codepointTransformation = this.f6653c;
        int hashCode2 = (hashCode + (codepointTransformation != null ? codepointTransformation.hashCode() : 0)) * 31;
        OutputTransformation outputTransformation = this.d;
        return hashCode2 + (outputTransformation != null ? outputTransformation.hashCode() : 0);
    }

    public final void j(long j2) {
        k(f(j2));
    }

    public final void k(long j2) {
        InputTransformation inputTransformation = this.f6652b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
        TextFieldState textFieldState = this.f6651a;
        textFieldState.f6307b.f6400b.b();
        EditingBuffer editingBuffer = textFieldState.f6307b;
        int i2 = TextRange.f17057c;
        editingBuffer.h((int) (j2 >> 32), (int) (j2 & 4294967295L));
        TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.f6651a + ", outputTransformation=" + this.d + ", outputTransformedText=" + this.e + ", codepointTransformation=" + this.f6653c + ", codepointTransformedText=" + this.f6654f + ", outputText=\"" + ((Object) c()) + "\", visualText=\"" + ((Object) d()) + "\")";
    }
}
