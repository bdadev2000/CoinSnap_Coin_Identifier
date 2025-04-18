package androidx.viewpager.widget;

import android.view.View;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) ((View) obj).getLayoutParams();
        c cVar2 = (c) ((View) obj2).getLayoutParams();
        boolean z10 = cVar.a;
        if (z10 != cVar2.a) {
            if (z10) {
                return 1;
            }
            return -1;
        }
        return cVar.f2116e - cVar2.f2116e;
    }
}
