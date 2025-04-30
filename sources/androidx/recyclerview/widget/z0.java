package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5142a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f5143c;

    /* renamed from: d, reason: collision with root package name */
    public int f5144d;

    /* renamed from: e, reason: collision with root package name */
    public int f5145e;

    public final boolean a() {
        int i9;
        int i10;
        int i11;
        int i12 = this.f5142a;
        int i13 = 2;
        if ((i12 & 7) != 0) {
            int i14 = this.f5144d;
            int i15 = this.b;
            if (i14 > i15) {
                i11 = 1;
            } else if (i14 == i15) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            if ((i11 & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 112) != 0) {
            int i16 = this.f5144d;
            int i17 = this.f5143c;
            if (i16 > i17) {
                i10 = 1;
            } else if (i16 == i17) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if (((i10 << 4) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 1792) != 0) {
            int i18 = this.f5145e;
            int i19 = this.b;
            if (i18 > i19) {
                i9 = 1;
            } else if (i18 == i19) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            if (((i9 << 8) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 28672) != 0) {
            int i20 = this.f5145e;
            int i21 = this.f5143c;
            if (i20 > i21) {
                i13 = 1;
            } else if (i20 != i21) {
                i13 = 4;
            }
            if ((i12 & (i13 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
