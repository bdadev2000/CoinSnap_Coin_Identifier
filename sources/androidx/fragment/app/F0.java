package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class F0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4647d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4648f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4649g;

    public F0(int i9, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.b = i9;
        this.f4646c = arrayList;
        this.f4647d = arrayList2;
        this.f4648f = arrayList3;
        this.f4649g = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i9 = 0; i9 < this.b; i9++) {
            ViewCompat.setTransitionName((View) this.f4646c.get(i9), (String) this.f4647d.get(i9));
            ViewCompat.setTransitionName((View) this.f4648f.get(i9), (String) this.f4649g.get(i9));
        }
    }
}
