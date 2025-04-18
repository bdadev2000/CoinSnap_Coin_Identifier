package androidx.compose.ui.text;

import b1.f0;
import e0.u;
import java.util.ArrayList;
import q0.l;

/* loaded from: classes2.dex */
public final class MultiParagraphKt {
    public static final int a(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i4);
            char c2 = paragraphInfo.f16929b > i2 ? (char) 1 : paragraphInfo.f16930c <= i2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i3 = i4 + 1;
            } else {
                if (c2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int b(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i4);
            char c2 = paragraphInfo.d > i2 ? (char) 1 : paragraphInfo.e <= i2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i3 = i4 + 1;
            } else {
                if (c2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int c(ArrayList arrayList, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((ParagraphInfo) u.L0(arrayList)).f16932g) {
            return f0.p(arrayList);
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i3);
            char c2 = paragraphInfo.f16931f > f2 ? (char) 1 : paragraphInfo.f16932g <= f2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i2 = i3 + 1;
            } else {
                if (c2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void d(ArrayList arrayList, long j2, l lVar) {
        int size = arrayList.size();
        for (int a2 = a(TextRange.f(j2), arrayList); a2 < size; a2++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(a2);
            if (paragraphInfo.f16929b >= TextRange.e(j2)) {
                return;
            }
            if (paragraphInfo.f16929b != paragraphInfo.f16930c) {
                lVar.invoke(paragraphInfo);
            }
        }
    }
}
