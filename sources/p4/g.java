package p4;

import android.os.Handler;
import android.os.Message;
import ic.t;

/* loaded from: classes.dex */
public final class g implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23438c;

    public /* synthetic */ g(Object obj, int i10) {
        this.f23437b = i10;
        this.f23438c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f23437b) {
            case 0:
                int i10 = message.what;
                Object obj = this.f23438c;
                if (i10 == 1) {
                    ((h) obj).b((e) message.obj);
                    return true;
                }
                if (i10 != 2) {
                    return false;
                }
                ((h) obj).f23441d.i((e) message.obj);
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                t tVar = (t) this.f23438c;
                a4.j.t(message.obj);
                synchronized (tVar.a) {
                    a4.j.t(tVar.f19575c);
                    throw null;
                }
        }
    }
}
