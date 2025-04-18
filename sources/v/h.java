package v;

import d0.b0;
import java.io.IOException;
import kotlin.jvm.internal.q;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class h implements Callback, q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final Call f31381a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.k f31382b;

    public h(Call call, b1.l lVar) {
        this.f31381a = call;
        this.f31382b = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        try {
            this.f31381a.cancel();
        } catch (Throwable unused) {
        }
        return b0.f30125a;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        if (call.isCanceled()) {
            return;
        }
        this.f31382b.resumeWith(q.d(iOException));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        this.f31382b.resumeWith(response);
    }
}
