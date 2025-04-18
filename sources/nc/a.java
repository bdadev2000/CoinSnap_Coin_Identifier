package nc;

import gb.c;
import pc.e;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f22719c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f22720d;

    public /* synthetic */ a(c cVar, e eVar, int i10) {
        this.f22718b = i10;
        this.f22719c = cVar;
        this.f22720d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22718b;
        e eVar = this.f22720d;
        c cVar = this.f22719c;
        switch (i10) {
            case 0:
                cVar.a(eVar);
                return;
            default:
                cVar.a(eVar);
                return;
        }
    }
}
