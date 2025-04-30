package d5;

import h5.i;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes2.dex */
public final class f implements ResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ResponseHandler f19906a;
    public final i b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.e f19907c;

    public f(ResponseHandler responseHandler, i iVar, b5.e eVar) {
        this.f19906a = responseHandler;
        this.b = iVar;
        this.f19907c = eVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.f19907c.k(this.b.c());
        this.f19907c.f(httpResponse.getStatusLine().getStatusCode());
        Long a6 = h.a(httpResponse);
        if (a6 != null) {
            this.f19907c.j(a6.longValue());
        }
        String b = h.b(httpResponse);
        if (b != null) {
            this.f19907c.i(b);
        }
        this.f19907c.c();
        return this.f19906a.handleResponse(httpResponse);
    }
}
