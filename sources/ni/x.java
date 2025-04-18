package ni;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class x implements wh.l {
    public final /* synthetic */ f a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f22894b;

    public x(b0 b0Var, f fVar) {
        this.f22894b = b0Var;
        this.a = fVar;
    }

    @Override // wh.l
    public final void onFailure(wh.k kVar, IOException iOException) {
        try {
            this.a.onFailure(this.f22894b, iOException);
        } catch (Throwable th2) {
            com.facebook.appevents.g.K(th2);
            th2.printStackTrace();
        }
    }

    @Override // wh.l
    public final void onResponse(wh.k kVar, wh.u0 u0Var) {
        f fVar = this.a;
        b0 b0Var = this.f22894b;
        try {
            try {
                fVar.onResponse(b0Var, b0Var.c(u0Var));
            } catch (Throwable th2) {
                com.facebook.appevents.g.K(th2);
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            com.facebook.appevents.g.K(th3);
            try {
                fVar.onFailure(b0Var, th3);
            } catch (Throwable th4) {
                com.facebook.appevents.g.K(th4);
                th4.printStackTrace();
            }
        }
    }
}
