package y8;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import n9.h0;
import y7.u;

/* loaded from: classes3.dex */
public final class q implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final m9.q f28113b;

    /* renamed from: c, reason: collision with root package name */
    public final u f28114c;

    /* renamed from: h, reason: collision with root package name */
    public z8.c f28118h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28119i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28120j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28121k;

    /* renamed from: g, reason: collision with root package name */
    public final TreeMap f28117g = new TreeMap();

    /* renamed from: f, reason: collision with root package name */
    public final Handler f28116f = h0.j(this);

    /* renamed from: d, reason: collision with root package name */
    public final m8.b f28115d = new m8.b(1);

    public q(z8.c cVar, u uVar, m9.q qVar) {
        this.f28118h = cVar;
        this.f28114c = uVar;
        this.f28113b = qVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f28121k) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        o oVar = (o) message.obj;
        long j3 = oVar.a;
        TreeMap treeMap = this.f28117g;
        long j10 = oVar.f28108b;
        Long l10 = (Long) treeMap.get(Long.valueOf(j10));
        if (l10 == null) {
            treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
        } else if (l10.longValue() > j3) {
            treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
        }
        return true;
    }
}
