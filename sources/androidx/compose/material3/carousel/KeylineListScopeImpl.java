package androidx.compose.material3.carousel;

import android.support.v4.media.d;
import b1.f0;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class KeylineListScopeImpl implements KeylineListScope {

    /* renamed from: b, reason: collision with root package name */
    public float f12733b;

    /* renamed from: a, reason: collision with root package name */
    public int f12732a = -1;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12734c = new ArrayList();

    /* loaded from: classes.dex */
    public static final class TmpKeyline {

        /* renamed from: a, reason: collision with root package name */
        public final float f12735a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f12736b;

        public TmpKeyline(float f2, boolean z2) {
            this.f12735a = f2;
            this.f12736b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) obj;
            return Float.compare(this.f12735a, tmpKeyline.f12735a) == 0 && this.f12736b == tmpKeyline.f12736b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12736b) + (Float.hashCode(this.f12735a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TmpKeyline(size=");
            sb.append(this.f12735a);
            sb.append(", isAnchor=");
            return d.s(sb, this.f12736b, ')');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList b(int r27, float r28, int r29, int r30, float r31, float r32, float r33, java.util.ArrayList r34) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.KeylineListScopeImpl.b(int, float, int, int, float, float, float, java.util.ArrayList):java.util.ArrayList");
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public final void a(float f2, boolean z2) {
        ArrayList arrayList = this.f12734c;
        arrayList.add(new TmpKeyline(f2, z2));
        if (f2 > this.f12733b) {
            this.f12732a = f0.p(arrayList);
            this.f12733b = f2;
        }
    }

    public final int c() {
        int i2 = this.f12732a;
        while (true) {
            ArrayList arrayList = this.f12734c;
            if (i2 >= f0.p(arrayList)) {
                break;
            }
            int i3 = i2 + 1;
            if (((TmpKeyline) arrayList.get(i3)).f12735a != this.f12733b) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }
}
