package o;

import android.os.Bundle;
import android.util.Pair;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import s7.w1;
import v8.z;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22945c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22946d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22947f;

    public /* synthetic */ q(Object obj, int i10, Object obj2, int i11) {
        this.f22944b = i11;
        this.f22946d = obj;
        this.f22945c = i10;
        this.f22947f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22944b;
        int i11 = this.f22945c;
        Object obj = this.f22947f;
        Object obj2 = this.f22946d;
        switch (i10) {
            case 0:
                ((t) obj2).onGreatestScrollPercentageIncreased(i11, (Bundle) obj);
                return;
            case 1:
                ((u1.a) obj2).f25417b.f(i11, obj);
                return;
            case 2:
                ((u1.c) obj2).f(i11, obj);
                return;
            case 3:
                MaxAdPlacer.c((MaxAdPlacer) obj2, i11, (Collection) obj);
                return;
            case 4:
                Pair pair = (Pair) obj;
                ((t7.p) ((w1) ((r4.c) obj2).f24000d).f24828h).j(((Integer) pair.first).intValue(), (z) pair.second, i11);
                return;
            case 5:
                x7.q qVar = (x7.q) obj2;
                x7.r rVar = (x7.r) obj;
                qVar.getClass();
                rVar.getClass();
                rVar.j(qVar.a, qVar.f27496b, i11);
                return;
            default:
                n9.l lVar = (n9.l) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    n9.n nVar = (n9.n) it.next();
                    if (!nVar.f22560d) {
                        if (i11 != -1) {
                            nVar.f22558b.a(i11);
                        }
                        nVar.f22559c = true;
                        lVar.invoke(nVar.a);
                    }
                }
                return;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, int i10, int i11) {
        this.f22944b = i11;
        this.f22946d = obj;
        this.f22947f = obj2;
        this.f22945c = i10;
    }
}
