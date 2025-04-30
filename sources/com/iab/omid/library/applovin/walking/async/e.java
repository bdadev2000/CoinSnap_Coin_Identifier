package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e extends a {
    public e(b.InterfaceC0145b interfaceC0145b, HashSet<String> hashSet, JSONObject jSONObject, long j7) {
        super(interfaceC0145b, hashSet, jSONObject, j7);
    }

    private void b(String str) {
        com.iab.omid.library.applovin.internal.c c9 = com.iab.omid.library.applovin.internal.c.c();
        if (c9 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c9.b()) {
                if (this.f14478c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f14480e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f14479d.toString();
    }

    @Override // com.iab.omid.library.applovin.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
