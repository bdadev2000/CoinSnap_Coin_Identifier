package x7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.common.collect.n0;
import com.google.common.collect.r0;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c extends Handler {
    public final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Looper looper) {
        super(looper);
        this.a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        d dVar = this.a;
        if (i10 != 0) {
            if (i10 == 1 && obj == dVar.f27439x && dVar.j()) {
                dVar.f27439x = null;
                if (obj2 instanceof Exception) {
                    dVar.l((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    b0 b0Var = dVar.f27418b;
                    int i11 = dVar.f27421e;
                    if (i11 == 3) {
                        byte[] bArr2 = dVar.f27438w;
                        int i12 = n9.h0.a;
                        b0Var.provideKeyResponse(bArr2, bArr);
                        dVar.h(new nb.a(18));
                        return;
                    }
                    byte[] provideKeyResponse = b0Var.provideKeyResponse(dVar.f27437v, bArr);
                    if ((i11 == 2 || (i11 == 0 && dVar.f27438w != null)) && provideKeyResponse != null && provideKeyResponse.length != 0) {
                        dVar.f27438w = provideKeyResponse;
                    }
                    dVar.f27432p = 4;
                    dVar.h(new nb.a(19));
                    return;
                } catch (Exception e2) {
                    dVar.l(e2, true);
                    return;
                }
            }
            return;
        }
        if (obj == dVar.f27440y) {
            if (dVar.f27432p == 2 || dVar.j()) {
                dVar.f27440y = null;
                boolean z10 = obj2 instanceof Exception;
                r4.c cVar = dVar.f27419c;
                if (z10) {
                    cVar.x((Exception) obj2, false);
                    return;
                }
                try {
                    dVar.f27418b.provideProvisionResponse((byte[]) obj2);
                    cVar.f24000d = null;
                    r0 i13 = r0.i((Set) cVar.f23999c);
                    ((Set) cVar.f23999c).clear();
                    n0 listIterator = i13.listIterator(0);
                    while (listIterator.hasNext()) {
                        d dVar2 = (d) listIterator.next();
                        if (dVar2.m()) {
                            dVar2.i(true);
                        }
                    }
                } catch (Exception e10) {
                    cVar.x(e10, true);
                }
            }
        }
    }
}
