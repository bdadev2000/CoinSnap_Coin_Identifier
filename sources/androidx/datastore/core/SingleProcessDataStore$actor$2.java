package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import b1.s;
import b1.u;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import d0.b0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.r;
import p0.a;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SingleProcessDataStore$actor$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SingleProcessDataStore$actor$2 f19000a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SingleProcessDataStore.Message message = (SingleProcessDataStore.Message) obj;
        Throwable th = (Throwable) obj2;
        a.s(message, SDKConstants.PARAM_DEBUG_MESSAGE);
        if (message instanceof SingleProcessDataStore.Message.Update) {
            SingleProcessDataStore.Message.Update update = (SingleProcessDataStore.Message.Update) message;
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            s sVar = (s) update.f18996b;
            sVar.getClass();
            sVar.Z(new u(false, th));
        }
        return b0.f30125a;
    }
}
