package be;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import ka.e;
import org.json.JSONObject;
import vd.i;

/* loaded from: classes4.dex */
public final class d extends a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2428f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(qa.a aVar, HashSet hashSet, JSONObject jSONObject, long j3, int i10) {
        super(aVar, hashSet, jSONObject, j3);
        this.f2428f = i10;
    }

    @Override // be.b
    /* renamed from: a */
    public final void onPostExecute(String str) {
        switch (this.f2428f) {
            case 0:
                c(str);
                super.onPostExecute(str);
                return;
            default:
                if (!TextUtils.isEmpty(str)) {
                    c(str);
                }
                super.onPostExecute(str);
                return;
        }
    }

    public final String b() {
        JSONObject jSONObject;
        int i10 = this.f2428f;
        JSONObject jSONObject2 = this.f2425d;
        switch (i10) {
            case 0:
                return jSONObject2.toString();
            default:
                qa.a aVar = this.f2427b;
                switch (aVar.f23735b) {
                    case 16:
                        jSONObject = (JSONObject) aVar.f23736c;
                        break;
                    default:
                        jSONObject = (JSONObject) aVar.f23736c;
                        break;
                }
                if (zd.b.e(jSONObject2, jSONObject)) {
                    return null;
                }
                aVar.a(jSONObject2);
                return jSONObject2.toString();
        }
    }

    public final void c(String str) {
        e eVar = e.f20531c;
        HashSet hashSet = this.f2424c;
        int i10 = this.f2428f;
        long j3 = this.f2426e;
        switch (i10) {
            case 0:
                wd.c cVar = wd.c.f26969c;
                if (cVar != null) {
                    for (i iVar : Collections.unmodifiableCollection(cVar.a)) {
                        if (hashSet.contains(iVar.f26516h)) {
                            yd.a aVar = iVar.f26513e;
                            if (j3 >= aVar.f28170e && aVar.f28169d != 3) {
                                aVar.f28169d = 3;
                                eVar.a(aVar.e(), "setNativeViewHierarchy", str, aVar.a);
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                wd.c cVar2 = wd.c.f26969c;
                if (cVar2 != null) {
                    for (i iVar2 : Collections.unmodifiableCollection(cVar2.a)) {
                        if (hashSet.contains(iVar2.f26516h)) {
                            yd.a aVar2 = iVar2.f26513e;
                            if (j3 >= aVar2.f28170e) {
                                aVar2.f28169d = 2;
                                eVar.a(aVar2.e(), "setNativeViewHierarchy", str, aVar2.a);
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        switch (this.f2428f) {
            case 0:
                return b();
            default:
                return b();
        }
    }

    @Override // be.b, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f2428f) {
            case 0:
                onPostExecute((String) obj);
                return;
            default:
                onPostExecute((String) obj);
                return;
        }
    }
}
