package nd;

import java.util.Date;
import java.util.Iterator;
import qc.s0;

/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f22721f = new a(new e(0));
    public final s0 a = new s0(15);

    /* renamed from: b, reason: collision with root package name */
    public Date f22722b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22723c;

    /* renamed from: d, reason: collision with root package name */
    public final e f22724d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22725e;

    public a(e eVar) {
        this.f22724d = eVar;
    }

    @Override // nd.d
    public final void a(boolean z10) {
        Date date;
        Date date2;
        if (!this.f22725e && z10) {
            switch (this.a.f23872b) {
                case 15:
                    date = new Date();
                    break;
                default:
                    date = new Date();
                    break;
            }
            Date date3 = this.f22722b;
            if (date3 == null || date.after(date3)) {
                this.f22722b = date;
                if (this.f22723c) {
                    Iterator it = c.f22727c.a().iterator();
                    while (it.hasNext()) {
                        pd.a aVar = ((kd.i) it.next()).f20672e;
                        Date date4 = this.f22722b;
                        if (date4 != null) {
                            date2 = (Date) date4.clone();
                        } else {
                            date2 = null;
                        }
                        aVar.b(date2);
                    }
                }
            }
        }
        this.f22725e = z10;
    }
}
