package ie;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import he.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public abstract class e {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f19604b;

    /* renamed from: c, reason: collision with root package name */
    public b f19605c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19606d;

    public final void a(b bVar) {
        s sVar = (s) bVar;
        sVar.f19077g0.remove(this);
        if (!c()) {
            d(sVar);
            k(Integer.MAX_VALUE);
        }
        this.f19606d = false;
    }

    public final void b(a aVar) {
        ArrayList arrayList = this.a;
        if (!arrayList.contains(aVar)) {
            arrayList.add(aVar);
            aVar.a(this, this.f19604b);
        }
    }

    public final boolean c() {
        return this.f19604b == Integer.MAX_VALUE;
    }

    public void d(b bVar) {
    }

    public void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
    }

    public void f(s sVar, CaptureRequest captureRequest, CaptureResult captureResult) {
    }

    public void g(s sVar, CaptureRequest captureRequest) {
        if (this.f19606d) {
            i(sVar);
            this.f19606d = false;
        }
    }

    public void h(b bVar) {
    }

    public void i(b bVar) {
        this.f19605c = bVar;
    }

    public final Object j(CameraCharacteristics.Key key, Object obj) {
        Object obj2 = ((s) this.f19605c).X.get(key);
        if (obj2 != null) {
            return obj2;
        }
        return obj;
    }

    public final void k(int i10) {
        if (i10 != this.f19604b) {
            this.f19604b = i10;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(this, this.f19604b);
            }
            if (this.f19604b == Integer.MAX_VALUE) {
                ((s) this.f19605c).f19077g0.remove(this);
                h(this.f19605c);
            }
        }
    }

    public final void l(b bVar) {
        this.f19605c = bVar;
        s sVar = (s) bVar;
        CopyOnWriteArrayList copyOnWriteArrayList = sVar.f19077g0;
        if (!copyOnWriteArrayList.contains(this)) {
            copyOnWriteArrayList.add(this);
        }
        if (sVar.f19071a0 != null) {
            i(bVar);
        } else {
            this.f19606d = true;
        }
    }
}
