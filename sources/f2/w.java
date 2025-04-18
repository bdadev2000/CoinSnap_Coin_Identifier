package f2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final t f17662b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f17663c;

    public w(ViewGroup viewGroup, t tVar) {
        this.f17662b = tVar;
        this.f17663c = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d6 A[EDGE_INSN: B:121:0x01d6->B:122:0x01d6 BREAK  A[LOOP:1: B:17:0x0087->B:50:0x01cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.w.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f17663c;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        x.f17665c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) x.b().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((t) it.next()).B(viewGroup);
            }
        }
        this.f17662b.i(true);
    }
}
