package com.iab.omid.library.applovin.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends a {
    public f(b.InterfaceC0161b interfaceC0161b, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0161b, hashSet, jSONObject, j2);
    }

    private void b(String str) {
        com.iab.omid.library.applovin.internal.c c2 = com.iab.omid.library.applovin.internal.c.c();
        if (c2 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c2.b()) {
                if (this.f29024c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.applovin.utils.c.h(this.d, this.f29026b.a())) {
            return null;
        }
        this.f29026b.a(this.d);
        return this.d.toString();
    }

    @Override // com.iab.omid.library.applovin.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
