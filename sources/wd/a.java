package wd;

import java.util.Date;
import java.util.Iterator;
import qc.s0;
import vd.i;

/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f26963f = new a(new nd.e(1));
    public final s0 a = new s0(17);

    /* renamed from: b, reason: collision with root package name */
    public Date f26964b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26965c;

    /* renamed from: d, reason: collision with root package name */
    public final nd.e f26966d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26967e;

    public a(nd.e eVar) {
        this.f26966d = eVar;
    }

    @Override // wd.d
    public final void a(boolean z10) {
        Date date;
        Date date2;
        if (!this.f26967e && z10) {
            switch (this.a.f23872b) {
                case 15:
                    date = new Date();
                    break;
                default:
                    date = new Date();
                    break;
            }
            Date date3 = this.f26964b;
            if (date3 == null || date.after(date3)) {
                this.f26964b = date;
                if (this.f26965c) {
                    Iterator it = c.f26969c.a().iterator();
                    while (it.hasNext()) {
                        yd.a aVar = ((i) it.next()).f26513e;
                        Date date4 = this.f26964b;
                        if (date4 != null) {
                            date2 = (Date) date4.clone();
                        } else {
                            date2 = null;
                        }
                        aVar.a(date2);
                    }
                }
            }
        }
        this.f26967e = z10;
    }
}
