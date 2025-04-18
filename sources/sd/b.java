package sd;

import android.os.AsyncTask;
import ic.t;

/* loaded from: classes4.dex */
public abstract class b extends AsyncTask {
    public t a;

    /* renamed from: b, reason: collision with root package name */
    public final qa.a f24994b;

    public b(qa.a aVar) {
        this.f24994b = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        t tVar = this.a;
        if (tVar != null) {
            tVar.f19576d = null;
            tVar.a();
        }
    }
}
