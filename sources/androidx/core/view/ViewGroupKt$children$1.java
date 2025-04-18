package androidx.core.view;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class ViewGroupKt$children$1 implements y0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18756a;

    public ViewGroupKt$children$1(ViewGroup viewGroup) {
        this.f18756a = viewGroup;
    }

    @Override // y0.j
    public final Iterator iterator() {
        return new ViewGroupKt$iterator$1(this.f18756a);
    }
}
