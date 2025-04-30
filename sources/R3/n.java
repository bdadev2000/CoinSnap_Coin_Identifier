package R3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f2713c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f2714d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f2713c = arrayList;
        this.f2714d = matrix;
    }

    @Override // R3.t
    public final void a(Matrix matrix, Q3.a aVar, int i9, Canvas canvas) {
        Iterator it = this.f2713c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f2714d, aVar, i9, canvas);
        }
    }
}
