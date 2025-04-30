package d5;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.mbridge.msdk.foundation.entity.o;
import g5.C2303f;
import h5.i;
import i8.C;
import i8.I;
import i8.InterfaceC2373j;
import i8.InterfaceC2374k;
import i8.u;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class g implements InterfaceC2374k {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2374k f19908a;
    public final b5.e b;

    /* renamed from: c, reason: collision with root package name */
    public final i f19909c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19910d;

    public g(InterfaceC2374k interfaceC2374k, C2303f c2303f, i iVar, long j7) {
        this.f19908a = interfaceC2374k;
        this.b = new b5.e(c2303f);
        this.f19910d = j7;
        this.f19909c = iVar;
    }

    @Override // i8.InterfaceC2374k
    public final void onFailure(InterfaceC2373j interfaceC2373j, IOException iOException) {
        C c9 = ((m8.i) interfaceC2373j).f21783c;
        b5.e eVar = this.b;
        if (c9 != null) {
            u uVar = c9.f20754a;
            if (uVar != null) {
                eVar.l(uVar.h().toString());
            }
            String str = c9.b;
            if (str != null) {
                eVar.e(str);
            }
        }
        eVar.h(this.f19910d);
        o.u(this.f19909c, eVar, eVar);
        this.f19908a.onFailure(interfaceC2373j, iOException);
    }

    @Override // i8.InterfaceC2374k
    public final void onResponse(InterfaceC2373j interfaceC2373j, I i9) {
        FirebasePerfOkHttpClient.a(i9, this.b, this.f19910d, this.f19909c.c());
        this.f19908a.onResponse(interfaceC2373j, i9);
    }
}
