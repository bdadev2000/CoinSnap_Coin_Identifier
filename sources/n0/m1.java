package n0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* loaded from: classes.dex */
public final class m1 implements Iterator, KMutableIterator {

    /* renamed from: b, reason: collision with root package name */
    public int f22320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f22321c;

    public m1(ViewGroup viewGroup) {
        this.f22321c = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22320b < this.f22321c.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f22320b;
        this.f22320b = i10 + 1;
        View childAt = this.f22321c.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f22320b - 1;
        this.f22320b = i10;
        this.f22321c.removeViewAt(i10);
    }
}
