package g6;

import android.os.AsyncTask;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractAsyncTaskC2304a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public C.c f20487a;
    public final a7.b b;

    public AbstractAsyncTaskC2304a(a7.b bVar) {
        this.b = bVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C.c cVar = this.f20487a;
        if (cVar != null) {
            cVar.f349f = null;
            cVar.j();
        }
    }
}
