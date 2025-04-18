package fb;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import jb.o;
import ka.f;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ib.a, hb.a, cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f17769b;

    public /* synthetic */ a(b bVar) {
        this.f17769b = bVar;
    }

    @Override // ib.a
    public final void a(o oVar) {
        b bVar = this.f17769b;
        synchronized (bVar) {
            if (bVar.f17770b instanceof ib.b) {
                bVar.f17771c.add(oVar);
            }
            bVar.f17770b.a(oVar);
        }
    }

    @Override // hb.a
    public final void f(Bundle bundle) {
        this.f17769b.a.f(bundle);
    }

    @Override // cc.a
    public final void h(cc.c cVar) {
        b bVar = this.f17769b;
        bVar.getClass();
        b6.a aVar = b6.a.f2288f;
        aVar.d("AnalyticsConnector now available.", null);
        za.b bVar2 = (za.b) cVar.get();
        hb.d dVar = new hb.d(bVar2, 0);
        qa.a aVar2 = new qa.a(2, 0);
        za.c cVar2 = (za.c) bVar2;
        qa.a b3 = cVar2.b(aVar2, "clx");
        if (b3 == null) {
            aVar.d("Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            b3 = cVar2.b(aVar2, AppMeasurement.CRASH_ORIGIN);
            if (b3 != null) {
                aVar.i("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (b3 != null) {
            aVar.d("Registered Firebase Analytics listener.", null);
            f fVar = new f(2);
            hb.c cVar3 = new hb.c(dVar, TimeUnit.MILLISECONDS);
            synchronized (bVar) {
                Iterator it = bVar.f17771c.iterator();
                while (it.hasNext()) {
                    fVar.a((o) it.next());
                }
                aVar2.f23737d = fVar;
                aVar2.f23736c = cVar3;
                bVar.f17770b = fVar;
                bVar.a = cVar3;
            }
            return;
        }
        aVar.i("Could not register Firebase Analytics listener; a listener is already registered.", null);
    }
}
