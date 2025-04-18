package com.iab.omid.library.bytedance2.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f extends a {
    public f(b.InterfaceC0160b interfaceC0160b, HashSet<String> hashSet, JSONObject jSONObject, long j3) {
        super(interfaceC0160b, hashSet, jSONObject, j3);
    }

    private void b(String str) {
        com.iab.omid.library.bytedance2.internal.c c10 = com.iab.omid.library.bytedance2.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : c10.b()) {
                if (this.f12305c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f12307e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.bytedance2.utils.c.h(this.f12306d, this.f12308b.a())) {
            return null;
        }
        this.f12308b.a(this.f12306d);
        return this.f12306d.toString();
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
