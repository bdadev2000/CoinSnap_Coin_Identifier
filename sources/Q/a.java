package Q;

import C2.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2449c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2450d;

    public /* synthetic */ a(int i9, int i10, Object obj) {
        this.b = i10;
        this.f2450d = obj;
        this.f2449c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                K.b bVar = (K.b) ((E1.c) this.f2450d).f972c;
                if (bVar != null) {
                    bVar.g(this.f2449c);
                    return;
                }
                return;
            case 1:
                ((RecyclerView) this.f2450d).smoothScrollToPosition(this.f2449c);
                return;
            case 2:
                ((SystemForegroundService) this.f2450d).f5237g.cancel(this.f2449c);
                return;
            case 3:
                ((j) this.f2450d).f14032j.smoothScrollToPosition(this.f2449c);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f2450d;
                int size = arrayList.size();
                int i9 = 0;
                if (this.f2449c != 1) {
                    while (i9 < size) {
                        ((j0.h) arrayList.get(i9)).a();
                        i9++;
                    }
                    return;
                } else {
                    while (i9 < size) {
                        ((j0.h) arrayList.get(i9)).b();
                        i9++;
                    }
                    return;
                }
        }
    }

    public a(RecyclerView recyclerView, int i9) {
        this.b = 1;
        this.f2449c = i9;
        this.f2450d = recyclerView;
    }

    public a(List list, int i9, Throwable th) {
        this.b = 4;
        m.h(list, "initCallbacks cannot be null");
        this.f2450d = new ArrayList(list);
        this.f2449c = i9;
    }
}
