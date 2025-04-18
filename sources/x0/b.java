package x0;

import ac.e;
import android.graphics.Rect;
import java.util.Comparator;
import o0.j;

/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f27303b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f27304c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27305d;

    /* renamed from: f, reason: collision with root package name */
    public final e f27306f;

    public b(boolean z10, e eVar) {
        this.f27305d = z10;
        this.f27306f = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f27306f.getClass();
        Rect rect = this.f27303b;
        ((j) obj).f(rect);
        Rect rect2 = this.f27304c;
        ((j) obj2).f(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z10 = this.f27305d;
        if (i12 < i13) {
            if (!z10) {
                return -1;
            }
            return 1;
        }
        if (i12 > i13) {
            if (z10) {
                return -1;
            }
            return 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            if (!z10) {
                return -1;
            }
            return 1;
        }
        if (i16 > i17) {
            if (z10) {
                return -1;
            }
            return 1;
        }
        return 0;
    }
}
