package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1718d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1720g;

    public t1(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1716b = i10;
        this.f1717c = arrayList;
        this.f1718d = arrayList2;
        this.f1719f = arrayList3;
        this.f1720g = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f1716b; i10++) {
            ViewCompat.setTransitionName((View) this.f1717c.get(i10), (String) this.f1718d.get(i10));
            ViewCompat.setTransitionName((View) this.f1719f.get(i10), (String) this.f1720g.get(i10));
        }
    }
}
