package b0;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class g implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2267b;

    public /* synthetic */ g(int i10) {
        this.f2267b = i10;
    }

    public final int a(View view, View view2) {
        switch (this.f2267b) {
            case 0:
                float z10 = ViewCompat.getZ(view);
                float z11 = ViewCompat.getZ(view2);
                if (z10 > z11) {
                    return -1;
                }
                if (z10 < z11) {
                    return 1;
                }
                return 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return 1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.compare(java.lang.Object, java.lang.Object):int");
    }
}
