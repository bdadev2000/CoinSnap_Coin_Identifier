package g4;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class j0 implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18101b;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f18101b) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((g0) message.obj).a();
                return true;
            default:
                int i10 = message.what;
                if (i10 != 0) {
                    if (i10 != 1) {
                        return false;
                    }
                    a4.j.t(message.obj);
                    throw null;
                }
                a4.j.t(message.obj);
                throw null;
        }
    }
}
