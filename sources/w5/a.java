package W5;

import android.os.AsyncTask;

/* loaded from: classes3.dex */
public abstract class a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public C.c f3619a;
    public final a7.b b;

    public a(a7.b bVar) {
        this.b = bVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C.c cVar = this.f3619a;
        if (cVar != null) {
            cVar.f349f = null;
            cVar.j();
        }
    }
}
