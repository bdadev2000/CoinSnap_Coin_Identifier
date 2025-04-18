package be;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import s2.h;

/* loaded from: classes4.dex */
public abstract class b extends AsyncTask {
    public h a;

    /* renamed from: b, reason: collision with root package name */
    public final qa.a f2427b;

    public b(qa.a aVar) {
        this.f2427b = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        h hVar = this.a;
        if (hVar != null) {
            hVar.f24172f = null;
            b bVar = (b) ((ArrayDeque) hVar.f24171d).poll();
            hVar.f24172f = bVar;
            if (bVar != null) {
                bVar.executeOnExecutor((ThreadPoolExecutor) hVar.f24170c, new Object[0]);
            }
        }
    }
}
