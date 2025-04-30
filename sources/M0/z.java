package M0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public w b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f1941c;

    /* JADX WARN: Removed duplicated region for block: B:116:0x01df A[EDGE_INSN: B:116:0x01df->B:117:0x01df BREAK  A[LOOP:1: B:17:0x0088->B:50:0x01d6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.z.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f1941c;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = A.f1837c;
        ViewGroup viewGroup2 = this.f1941c;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) A.b().getOrDefault(viewGroup2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((w) it.next()).C(viewGroup2);
            }
        }
        this.b.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
