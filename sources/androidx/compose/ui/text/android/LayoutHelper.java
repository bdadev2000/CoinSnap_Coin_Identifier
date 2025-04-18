package androidx.compose.ui.text.android;

import android.support.v4.media.d;
import android.text.Layout;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import java.text.Bidi;
import java.util.ArrayList;
import z0.m;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LayoutHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Layout f17077a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17078b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f17079c;
    public final boolean[] d;
    public char[] e;

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class BidiRun {

        /* renamed from: a, reason: collision with root package name */
        public final int f17080a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17081b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f17082c;

        public BidiRun(int i2, int i3, boolean z2) {
            this.f17080a = i2;
            this.f17081b = i3;
            this.f17082c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.f17080a == bidiRun.f17080a && this.f17081b == bidiRun.f17081b && this.f17082c == bidiRun.f17082c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17082c) + d.c(this.f17081b, Integer.hashCode(this.f17080a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.f17080a);
            sb.append(", end=");
            sb.append(this.f17081b);
            sb.append(", isRtl=");
            return d.s(sb, this.f17082c, ')');
        }
    }

    public LayoutHelper(Layout layout) {
        this.f17077a = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            int W0 = m.W0(this.f17077a.getText(), '\n', i2, false, 4);
            i2 = W0 < 0 ? this.f17077a.getText().length() : W0 + 1;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < this.f17077a.getText().length());
        this.f17078b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(null);
        }
        this.f17079c = arrayList2;
        this.d = new boolean[this.f17078b.size()];
        this.f17078b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r1.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi a(int r15) {
        /*
            r14 = this;
            boolean[] r0 = r14.d
            boolean r1 = r0[r15]
            java.util.ArrayList r2 = r14.f17079c
            if (r1 == 0) goto Lf
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        Lf:
            java.util.ArrayList r1 = r14.f17078b
            r3 = 0
            if (r15 != 0) goto L16
            r4 = r3
            goto L22
        L16:
            int r4 = r15 + (-1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
        L22:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r10 = r1 - r4
            char[] r5 = r14.e
            if (r5 == 0) goto L38
            int r6 = r5.length
            if (r6 >= r10) goto L36
            goto L38
        L36:
            r12 = r5
            goto L3b
        L38:
            char[] r5 = new char[r10]
            goto L36
        L3b:
            android.text.Layout r5 = r14.f17077a
            java.lang.CharSequence r6 = r5.getText()
            android.text.TextUtils.getChars(r6, r4, r1, r12, r3)
            boolean r1 = java.text.Bidi.requiresBidi(r12, r3, r10)
            r4 = 1
            r13 = 0
            if (r1 == 0) goto L6e
            int r1 = r14.e(r15)
            int r1 = r5.getLineForOffset(r1)
            int r1 = r5.getParagraphDirection(r1)
            r5 = -1
            if (r1 != r5) goto L5d
            r11 = r4
            goto L5e
        L5d:
            r11 = r3
        L5e:
            java.text.Bidi r1 = new java.text.Bidi
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r1
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            int r3 = r1.getRunCount()
            if (r3 != r4) goto L6f
        L6e:
            r1 = r13
        L6f:
            r2.set(r15, r1)
            r0[r15] = r4
            if (r1 == 0) goto L7d
            char[] r15 = r14.e
            if (r12 != r15) goto L7c
            r12 = r13
            goto L7d
        L7c:
            r12 = r15
        L7d:
            r14.e = r12
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.a(int):java.text.Bidi");
    }

    public final float b(int i2, boolean z2) {
        Layout layout = this.f17077a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i2));
        if (i2 > lineEnd) {
            i2 = lineEnd;
        }
        return z2 ? layout.getPrimaryHorizontal(i2) : layout.getSecondaryHorizontal(i2);
    }

    public final float c(int i2, boolean z2, boolean z3) {
        int i3;
        int i4;
        int i5 = i2;
        if (!z3) {
            return b(i2, z2);
        }
        Layout layout = this.f17077a;
        int a2 = LayoutCompat_androidKt.a(layout, i5, z3);
        int lineStart = layout.getLineStart(a2);
        int lineEnd = layout.getLineEnd(a2);
        if (i5 != lineStart && i5 != lineEnd) {
            return b(i2, z2);
        }
        if (i5 == 0 || i5 == layout.getText().length()) {
            return b(i2, z2);
        }
        int d = d(i5, z3);
        boolean z4 = layout.getParagraphDirection(layout.getLineForOffset(e(d))) == -1;
        int f2 = f(lineEnd, lineStart);
        int e = e(d);
        int i6 = lineStart - e;
        int i7 = f2 - e;
        Bidi a3 = a(d);
        Bidi createLineBidi = a3 != null ? a3.createLineBidi(i6, i7) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean z5 = (z2 || z4 == layout.isRtlCharAt(lineStart)) ? !z4 : z4;
            return (i5 != lineStart ? z5 : !z5) ? layout.getLineRight(a2) : layout.getLineLeft(a2);
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i8 = 0; i8 < runCount; i8++) {
            bidiRunArr[i8] = new BidiRun(createLineBidi.getRunStart(i8) + lineStart, createLineBidi.getRunLimit(i8) + lineStart, createLineBidi.getRunLevel(i8) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i9 = 0; i9 < runCount2; i9++) {
            bArr[i9] = (byte) createLineBidi.getRunLevel(i9);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        if (i5 == lineStart) {
            int i10 = 0;
            while (true) {
                if (i10 >= runCount) {
                    i4 = -1;
                    break;
                }
                if (bidiRunArr[i10].f17080a == i5) {
                    i4 = i10;
                    break;
                }
                i10++;
            }
            boolean z6 = (z2 || z4 == bidiRunArr[i4].f17082c) ? !z4 : z4;
            return (i4 == 0 && z6) ? layout.getLineLeft(a2) : (i4 != runCount - 1 || z6) ? z6 ? layout.getPrimaryHorizontal(bidiRunArr[i4 - 1].f17080a) : layout.getPrimaryHorizontal(bidiRunArr[i4 + 1].f17080a) : layout.getLineRight(a2);
        }
        if (i5 > f2) {
            i5 = f(i5, lineStart);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= runCount) {
                i3 = -1;
                break;
            }
            if (bidiRunArr[i11].f17081b == i5) {
                i3 = i11;
                break;
            }
            i11++;
        }
        boolean z7 = (z2 || z4 == bidiRunArr[i3].f17082c) ? z4 : !z4;
        return (i3 == 0 && z7) ? layout.getLineLeft(a2) : (i3 != runCount - 1 || z7) ? z7 ? layout.getPrimaryHorizontal(bidiRunArr[i3 - 1].f17081b) : layout.getPrimaryHorizontal(bidiRunArr[i3 + 1].f17081b) : layout.getLineRight(a2);
    }

    public final int d(int i2, boolean z2) {
        ArrayList arrayList = this.f17078b;
        int d = f0.d(arrayList, Integer.valueOf(i2));
        int i3 = d < 0 ? -(d + 1) : d + 1;
        if (z2 && i3 > 0) {
            int i4 = i3 - 1;
            if (i2 == ((Number) arrayList.get(i4)).intValue()) {
                return i4;
            }
        }
        return i3;
    }

    public final int e(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return ((Number) this.f17078b.get(i2 - 1)).intValue();
    }

    public final int f(int i2, int i3) {
        while (i2 > i3) {
            char charAt = this.f17077a.getText().charAt(i2 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((p0.a.E(charAt, 8192) < 0 || p0.a.E(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                break;
            }
            i2--;
        }
        return i2;
    }
}
