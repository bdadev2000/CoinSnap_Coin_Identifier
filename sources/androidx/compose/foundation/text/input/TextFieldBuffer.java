package androidx.compose.foundation.text.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextFieldBuffer implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final TextFieldCharSequence f6293a;

    /* renamed from: b, reason: collision with root package name */
    public final OffsetMappingCalculator f6294b;

    /* renamed from: c, reason: collision with root package name */
    public final PartialGapBuffer f6295c;
    public ChangeTracker d;

    /* renamed from: f, reason: collision with root package name */
    public long f6296f;

    @ExperimentalFoundationApi
    /* loaded from: classes4.dex */
    public interface ChangeList {
    }

    public TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i2) {
        changeTracker = (i2 & 2) != 0 ? null : changeTracker;
        textFieldCharSequence2 = (i2 & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2;
        offsetMappingCalculator = (i2 & 8) != 0 ? null : offsetMappingCalculator;
        this.f6293a = textFieldCharSequence2;
        this.f6294b = offsetMappingCalculator;
        this.f6295c = new PartialGapBuffer(textFieldCharSequence);
        this.d = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.f6296f = textFieldCharSequence.f6298b;
    }

    public final ChangeTracker a() {
        ChangeTracker changeTracker = this.d;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker(null);
        this.d = changeTracker2;
        return changeTracker2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) {
        PartialGapBuffer partialGapBuffer = this.f6295c;
        b(partialGapBuffer.length(), partialGapBuffer.length(), 1);
        partialGapBuffer.a(partialGapBuffer.length(), partialGapBuffer.length(), r5, 0, String.valueOf(c2).length());
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r5 == r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r4, int r5, int r6) {
        /*
            r3 = this;
            androidx.compose.foundation.text.input.internal.ChangeTracker r0 = r3.a()
            r0.e(r4, r5, r6)
            androidx.compose.foundation.text.input.internal.OffsetMappingCalculator r0 = r3.f6294b
            if (r0 == 0) goto Le
            r0.c(r4, r5, r6)
        Le:
            int r0 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r4, r5)
            long r1 = r3.f6296f
            int r5 = androidx.compose.ui.text.TextRange.f(r1)
            long r1 = r3.f6296f
            int r1 = androidx.compose.ui.text.TextRange.e(r1)
            if (r1 >= r0) goto L25
            return
        L25:
            if (r5 > r0) goto L31
            if (r4 > r1) goto L31
            int r4 = r4 - r0
            int r6 = r6 - r4
            if (r5 != r1) goto L2e
            goto L3c
        L2e:
            int r0 = r1 + r6
            goto L46
        L31:
            if (r5 <= r0) goto L38
            if (r1 >= r4) goto L38
            int r0 = r0 + r6
            r5 = r0
            goto L46
        L38:
            if (r5 < r4) goto L3e
            int r4 = r4 - r0
            int r6 = r6 - r4
        L3c:
            int r5 = r5 + r6
            goto L2e
        L3e:
            if (r0 >= r5) goto L46
            int r5 = r0 + r6
            int r4 = r4 - r0
            int r6 = r6 - r4
            int r0 = r6 + r1
        L46:
            long r4 = androidx.compose.ui.text.TextRangeKt.a(r5, r0)
            r3.f6296f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldBuffer.b(int, int, int):void");
    }

    public final String toString() {
        return this.f6295c.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            PartialGapBuffer partialGapBuffer = this.f6295c;
            b(partialGapBuffer.length(), partialGapBuffer.length(), charSequence.length());
            partialGapBuffer.a(partialGapBuffer.length(), partialGapBuffer.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        if (charSequence != null) {
            PartialGapBuffer partialGapBuffer = this.f6295c;
            b(partialGapBuffer.length(), partialGapBuffer.length(), i3 - i2);
            partialGapBuffer.a(partialGapBuffer.length(), partialGapBuffer.length(), r5, 0, charSequence.subSequence(i2, i3).length());
        }
        return this;
    }
}
