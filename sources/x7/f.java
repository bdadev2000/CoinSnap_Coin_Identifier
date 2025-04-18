package x7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class f extends Handler {
    public final /* synthetic */ i a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Looper looper) {
        super(looper);
        this.a = iVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        Iterator it = this.a.f27468m.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.p();
            if (Arrays.equals(dVar.f27437v, bArr)) {
                if (message.what == 2 && dVar.f27421e == 0 && dVar.f27432p == 4) {
                    int i10 = n9.h0.a;
                    dVar.i(false);
                    return;
                }
                return;
            }
        }
    }
}
