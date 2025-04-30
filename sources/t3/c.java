package T3;

import a2.C0335d;
import a2.C0337f;
import android.os.Handler;
import android.os.Message;
import com.mbridge.msdk.foundation.entity.o;
import j5.C2400c;

/* loaded from: classes2.dex */
public final class c implements Handler.Callback {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3014c;

    public /* synthetic */ c(Object obj, int i9) {
        this.b = i9;
        this.f3014c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.b) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                C2400c c2400c = (C2400c) this.f3014c;
                o.v(message.obj);
                synchronized (c2400c.f21107c) {
                    throw null;
                }
            default:
                int i9 = message.what;
                C0337f c0337f = (C0337f) this.f3014c;
                if (i9 == 1) {
                    c0337f.b((C0335d) message.obj);
                    return true;
                }
                if (i9 == 2) {
                    c0337f.f3938d.i((C0335d) message.obj);
                }
                return false;
        }
    }
}
