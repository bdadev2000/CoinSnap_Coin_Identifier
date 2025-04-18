package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import d0.b0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f18718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Menu f18719b = null;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18718a < this.f18719b.size();
    }

    @Override // java.util.Iterator
    public final MenuItem next() {
        int i2 = this.f18718a;
        this.f18718a = i2 + 1;
        MenuItem item = this.f18719b.getItem(i2);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        b0 b0Var;
        int i2 = this.f18718a - 1;
        this.f18718a = i2;
        Menu menu = this.f18719b;
        MenuItem item = menu.getItem(i2);
        if (item != null) {
            menu.removeItem(item.getItemId());
            b0Var = b0.f30125a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
