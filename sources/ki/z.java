package ki;

import java.util.RandomAccess;
import kotlin.collections.AbstractList;

/* loaded from: classes5.dex */
public final class z extends AbstractList implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f21034d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final l[] f21035b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f21036c;

    public z(l[] lVarArr, int[] iArr) {
        this.f21035b = lVarArr;
        this.f21036c = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return super.contains((l) obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f21035b[i10];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public final int get_size() {
        return this.f21035b.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof l)) {
            return -1;
        }
        return super.indexOf((l) obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof l)) {
            return -1;
        }
        return super.lastIndexOf((l) obj);
    }
}
