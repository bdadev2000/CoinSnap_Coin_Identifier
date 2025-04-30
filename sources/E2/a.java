package E2;

import android.content.Context;
import com.applovin.impl.ob;
import com.applovin.impl.xl;
import com.applovin.impl.xq;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.r;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f976d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f977f;

    public /* synthetic */ a(long j7, Context context, String str) {
        this.b = 0;
        this.f976d = j7;
        this.f977f = str;
        this.f975c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Long l;
        int i9;
        m mVar;
        switch (this.b) {
            case 0:
                long j7 = this.f976d;
                String str = (String) this.f977f;
                Context context = (Context) this.f975c;
                G7.j.e(str, "$activityName");
                m mVar2 = d.f984f;
                if (mVar2 == null) {
                    l = null;
                } else {
                    l = mVar2.b;
                }
                if (d.f984f == null) {
                    d.f984f = new m(Long.valueOf(j7), null);
                    String str2 = d.f986h;
                    G7.j.d(context, "appContext");
                    n.b(context, str, str2);
                } else if (l != null) {
                    long longValue = j7 - l.longValue();
                    String str3 = d.f980a;
                    w wVar = w.f13674a;
                    t b = w.b(r.b());
                    if (b == null) {
                        i9 = 60;
                    } else {
                        i9 = b.b;
                    }
                    if (longValue > i9 * 1000) {
                        n.d(str, d.f984f, d.f986h);
                        String str4 = d.f986h;
                        G7.j.d(context, "appContext");
                        n.b(context, str, str4);
                        d.f984f = new m(Long.valueOf(j7), null);
                    } else if (longValue > 1000 && (mVar = d.f984f) != null) {
                        mVar.f1002d++;
                    }
                }
                m mVar3 = d.f984f;
                if (mVar3 != null) {
                    mVar3.b = Long.valueOf(j7);
                }
                m mVar4 = d.f984f;
                if (mVar4 != null) {
                    mVar4.a();
                    return;
                }
                return;
            case 1:
                ((ob) this.f977f).a((Context) this.f975c, this.f976d);
                return;
            case 2:
                xl.a((xl) this.f977f, (Thread) this.f975c, this.f976d);
                return;
            default:
                ((xq.a) this.f977f).a(this.f975c, this.f976d);
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, long j7, int i9) {
        this.b = i9;
        this.f977f = obj;
        this.f975c = obj2;
        this.f976d = j7;
    }
}
