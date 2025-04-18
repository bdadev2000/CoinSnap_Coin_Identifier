package o9;

import android.os.Handler;
import com.facebook.r0;
import s7.f0;

/* loaded from: classes3.dex */
public final class h {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23203b;

    public h(Handler handler, f0 f0Var) {
        this.a = handler;
        this.f23203b = f0Var;
    }

    public final void a(z zVar) {
        Object obj = this.a;
        if (((Handler) obj) != null) {
            ((Handler) obj).post(new r0(22, this, zVar));
        }
    }
}
