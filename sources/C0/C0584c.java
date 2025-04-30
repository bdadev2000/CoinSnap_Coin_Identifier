package c0;

import R3.e;
import U.i;
import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584c implements Comparator {
    public final Rect b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f5355c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5356d;

    /* renamed from: f, reason: collision with root package name */
    public final e f5357f;

    public C0584c(boolean z8, e eVar) {
        this.f5356d = z8;
        this.f5357f = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f5357f.getClass();
        Rect rect = this.b;
        ((i) obj).f(rect);
        Rect rect2 = this.f5355c;
        ((i) obj2).f(rect2);
        int i9 = rect.top;
        int i10 = rect2.top;
        if (i9 < i10) {
            return -1;
        }
        if (i9 > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z8 = this.f5356d;
        if (i11 < i12) {
            if (!z8) {
                return -1;
            }
            return 1;
        }
        if (i11 > i12) {
            if (z8) {
                return -1;
            }
            return 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            if (!z8) {
                return -1;
            }
            return 1;
        }
        if (i15 > i16) {
            if (z8) {
                return -1;
            }
            return 1;
        }
        return 0;
    }
}
