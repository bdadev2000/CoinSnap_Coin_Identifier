package j2;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import he.s;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19742b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19743c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19744d;

    public /* synthetic */ r(int i10, int i11, Object obj) {
        this.f19742b = i11;
        this.f19744d = obj;
        this.f19743c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.f19742b;
        boolean z11 = false;
        int i11 = this.f19743c;
        Object obj = this.f19744d;
        switch (i10) {
            case 0:
                ((RecyclerView) obj).smoothScrollToPosition(i11);
                return;
            case 1:
                ((SystemForegroundService) obj).f2218g.cancel(i11);
                return;
            case 2:
                try {
                    ((b5.b) obj).getClass();
                    throw null;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ((com.google.android.material.datepicker.k) obj).f11693j.smoothScrollToPosition(i11);
                return;
            case 4:
                Iterator it = ((CameraView) ((c1) obj).f11925d).f16492t.iterator();
                while (it.hasNext()) {
                    ((ng.c) it.next()).getClass();
                }
                return;
            case 5:
                s sVar = (s) obj;
                if (sVar.f19029d.f23631f.f23619b >= 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && sVar.f()) {
                    sVar.s(i11);
                    return;
                }
                if (i11 <= 0) {
                    i11 = 35;
                }
                sVar.f19092l = i11;
                if (sVar.f19029d.f23631f.f23619b >= 2) {
                    z11 = true;
                }
                if (z11) {
                    sVar.p();
                    return;
                }
                return;
            default:
                Iterator it2 = ((ye.f) obj).f28187b.f28191m.iterator();
                while (it2.hasNext()) {
                    ((xe.m) it2.next()).b(i11);
                }
                return;
        }
    }

    public r(p pVar, int i10) {
        this.f19742b = 0;
        this.f19743c = i10;
        this.f19744d = pVar;
    }
}
