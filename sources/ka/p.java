package ka;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class p extends v {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f20606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f20607d;

    public p(ArrayList arrayList, Matrix matrix) {
        this.f20606c = arrayList;
        this.f20607d = matrix;
    }

    @Override // ka.v
    public final void a(Matrix matrix, ja.a aVar, int i10, Canvas canvas) {
        Iterator it = this.f20606c.iterator();
        while (it.hasNext()) {
            ((v) it.next()).a(this.f20607d, aVar, i10, canvas);
        }
    }
}
