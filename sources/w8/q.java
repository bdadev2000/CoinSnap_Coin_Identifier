package w8;

import java.util.RandomAccess;
import u7.AbstractC2812c;

/* loaded from: classes3.dex */
public final class q extends AbstractC2812c implements RandomAccess {
    public final i[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f24031c;

    public q(i[] iVarArr, int[] iArr) {
        this.b = iVarArr;
        this.f24031c = iArr;
    }

    @Override // u7.AbstractC2812c
    public final int b() {
        return this.b.length;
    }

    @Override // u7.AbstractC2812c, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return super.contains((i) obj);
    }

    @Override // java.util.List
    public final Object get(int i9) {
        return this.b[i9];
    }

    @Override // u7.AbstractC2812c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.indexOf((i) obj);
    }

    @Override // u7.AbstractC2812c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.lastIndexOf((i) obj);
    }
}
