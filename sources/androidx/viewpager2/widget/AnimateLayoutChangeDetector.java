package androidx.viewpager2.widget;

import android.view.ViewGroup;
import java.util.Comparator;

/* loaded from: classes.dex */
final class AnimateLayoutChangeDetector {

    /* renamed from: androidx.viewpager2.widget.AnimateLayoutChangeDetector$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 implements Comparator<int[]> {
        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        new ViewGroup.MarginLayoutParams(-1, -1).setMargins(0, 0, 0, 0);
    }
}
