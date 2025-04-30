package p8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class q extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f22439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f22440f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, s sVar, long j7) {
        super(str, true);
        this.f22439e = sVar;
        this.f22440f = j7;
    }

    @Override // l8.a
    public final long a() {
        s sVar;
        boolean z8;
        synchronized (this.f22439e) {
            sVar = this.f22439e;
            long j7 = sVar.f22458p;
            long j9 = sVar.f22457o;
            if (j7 < j9) {
                z8 = true;
            } else {
                sVar.f22457o = j9 + 1;
                z8 = false;
            }
        }
        if (z8) {
            sVar.b(null);
            return -1L;
        }
        try {
            sVar.f22445A.i(false, 1, 0);
        } catch (IOException e4) {
            sVar.b(e4);
        }
        return this.f22440f;
    }
}
