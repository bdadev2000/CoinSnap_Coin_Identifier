package androidx.viewpager.widget;

import android.view.View;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) ((View) obj).getLayoutParams();
        c cVar2 = (c) ((View) obj2).getLayoutParams();
        boolean z8 = cVar.f5157a;
        if (z8 != cVar2.f5157a) {
            if (z8) {
                return 1;
            }
            return -1;
        }
        return cVar.f5160e - cVar2.f5160e;
    }
}
