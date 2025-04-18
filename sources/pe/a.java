package pe;

import android.graphics.SurfaceTexture;
import he.a0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23604c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f23603b = i10;
        this.f23604c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = null;
        switch (this.f23603b) {
            case 0:
                synchronized (((e) this.f23604c).f23613d) {
                    if (!((e) this.f23604c).f23612c) {
                        long currentTimeMillis = System.currentTimeMillis();
                        Iterator it = ((e) this.f23604c).f23611b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                d dVar2 = (d) it.next();
                                if (dVar2.f23609e <= currentTimeMillis) {
                                    dVar = dVar2;
                                }
                            }
                        }
                        if (dVar != null) {
                            ((e) this.f23604c).f23612c = true;
                        }
                    }
                }
                if (dVar != null) {
                    e eVar = (e) this.f23604c;
                    eVar.getClass();
                    te.i iVar = ((a0) ((hb.d) eVar.a).f19011c).a;
                    k0.a aVar = new k0.a(17, eVar, dVar, iVar);
                    iVar.getClass();
                    if (Thread.currentThread() == iVar.f25393b) {
                        aVar.run();
                        return;
                    } else {
                        iVar.f25394c.post(aVar);
                        return;
                    }
                }
                return;
            default:
                ye.g gVar = ((ye.d) this.f23604c).f28184c.f28187b;
                SurfaceTexture surfaceTexture = gVar.f28189k;
                if (surfaceTexture != null) {
                    surfaceTexture.setOnFrameAvailableListener(null);
                    gVar.f28189k.release();
                    gVar.f28189k = null;
                }
                te.d dVar3 = gVar.f28190l;
                if (dVar3 != null) {
                    dVar3.b();
                    gVar.f28190l = null;
                    return;
                }
                return;
        }
    }
}
