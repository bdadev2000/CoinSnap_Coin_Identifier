package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class ViewGroupKt$iterator$1 implements Iterator<View>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f18758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18759b;

    public ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.f18759b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18758a < this.f18759b.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i2 = this.f18758a;
        this.f18758a = i2 + 1;
        View childAt = this.f18759b.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2 = this.f18758a - 1;
        this.f18758a = i2;
        this.f18759b.removeViewAt(i2);
    }
}
