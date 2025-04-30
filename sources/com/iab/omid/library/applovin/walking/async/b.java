package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f14481a;
    protected final InterfaceC0145b b;

    /* loaded from: classes3.dex */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.async.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0145b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0145b interfaceC0145b) {
        this.b = interfaceC0145b;
    }

    public void a(a aVar) {
        this.f14481a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f14481a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
