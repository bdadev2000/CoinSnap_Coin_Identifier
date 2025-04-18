package o9;

import android.os.Handler;
import android.os.Message;
import n9.h0;

/* loaded from: classes3.dex */
public final class g implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f23201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f23202c;

    public g(j jVar, k8.l lVar) {
        this.f23202c = jVar;
        Handler j3 = h0.j(this);
        this.f23201b = j3;
        lVar.a(this, j3);
    }

    public final void a(long j3) {
        j jVar = this.f23202c;
        if (this == jVar.f23223n1 && jVar.L != null) {
            if (j3 == Long.MAX_VALUE) {
                jVar.A0 = true;
                return;
            }
            try {
                jVar.o0(j3);
                jVar.x0(jVar.f23219j1);
                jVar.C0.f26881e++;
                jVar.w0();
                jVar.W(j3);
            } catch (s7.r e2) {
                jVar.B0 = e2;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = h0.a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
