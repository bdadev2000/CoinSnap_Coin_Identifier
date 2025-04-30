package R5;

import a5.C0398b;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f2735f;

    /* renamed from: a, reason: collision with root package name */
    public C0398b f2736a;
    public Date b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2737c;

    /* renamed from: d, reason: collision with root package name */
    public e f2738d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2739e;

    /* JADX WARN: Type inference failed for: r0v0, types: [R5.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a5.b, java.lang.Object] */
    static {
        e eVar = new e(0);
        ?? obj = new Object();
        obj.f2736a = new Object();
        obj.f2738d = eVar;
        f2735f = obj;
    }

    @Override // R5.d
    public final void a(boolean z8) {
        Date date;
        if (!this.f2739e && z8) {
            this.f2736a.getClass();
            Date date2 = new Date();
            Date date3 = this.b;
            if (date3 == null || date2.after(date3)) {
                this.b = date2;
                if (this.f2737c) {
                    Iterator it = Collections.unmodifiableCollection(c.f2741c.b).iterator();
                    while (it.hasNext()) {
                        T5.a aVar = ((O5.k) it.next()).f2232e;
                        Date date4 = this.b;
                        if (date4 != null) {
                            date = (Date) date4.clone();
                        } else {
                            date = null;
                        }
                        aVar.d(date);
                    }
                }
            }
        }
        this.f2739e = z8;
    }
}
