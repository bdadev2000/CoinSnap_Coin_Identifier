package P1;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class E implements Handler.Callback {
    public final /* synthetic */ int b;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.b) {
            case 0:
                if (message.what == 1) {
                    ((B) message.obj).a();
                    return true;
                }
                return false;
            default:
                int i9 = message.what;
                if (i9 != 0) {
                    if (i9 != 1) {
                        return false;
                    }
                    com.mbridge.msdk.foundation.entity.o.v(message.obj);
                    throw null;
                }
                com.mbridge.msdk.foundation.entity.o.v(message.obj);
                throw null;
        }
    }
}
