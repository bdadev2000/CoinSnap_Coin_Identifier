package sd;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import kd.i;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d extends a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24995f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(qa.a aVar, HashSet hashSet, JSONObject jSONObject, long j3, int i10) {
        super(aVar, hashSet, jSONObject, j3);
        this.f24995f = i10;
    }

    @Override // sd.b
    /* renamed from: a */
    public final void onPostExecute(String str) {
        switch (this.f24995f) {
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
        int i10 = this.f24995f;
        JSONObject jSONObject2 = this.f24992d;
        switch (i10) {
            case 0:
                return jSONObject2.toString();
            default:
                qa.a aVar = this.f24994b;
                switch (aVar.f23735b) {
                    case 16:
                        jSONObject = (JSONObject) aVar.f23736c;
                        break;
                    default:
                        jSONObject = (JSONObject) aVar.f23736c;
                        break;
                }
                if (qd.c.e(jSONObject2, jSONObject)) {
                    return null;
                }
                aVar.a(jSONObject2);
                return jSONObject2.toString();
        }
    }

    public final void c(String str) {
        b6.b bVar = b6.b.f2297i;
        HashSet hashSet = this.f24991c;
        int i10 = this.f24995f;
        long j3 = this.f24993e;
        switch (i10) {
            case 0:
                nd.c cVar = nd.c.f22727c;
                if (cVar != null) {
                    for (i iVar : Collections.unmodifiableCollection(cVar.a)) {
                        if (hashSet.contains(iVar.f20675h)) {
                            pd.a aVar = iVar.f20672e;
                            if (j3 >= aVar.f23598f && aVar.f23597e != 3) {
                                aVar.f23597e = 3;
                                bVar.a(aVar.f(), "setNativeViewHierarchy", str, aVar.a);
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                nd.c cVar2 = nd.c.f22727c;
                if (cVar2 != null) {
                    for (i iVar2 : Collections.unmodifiableCollection(cVar2.a)) {
                        if (hashSet.contains(iVar2.f20675h)) {
                            pd.a aVar2 = iVar2.f20672e;
                            if (j3 >= aVar2.f23598f) {
                                aVar2.f23597e = 2;
                                bVar.a(aVar2.f(), "setNativeViewHierarchy", str, aVar2.a);
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
        switch (this.f24995f) {
            case 0:
                return b();
            default:
                return b();
        }
    }

    @Override // sd.b, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f24995f) {
            case 0:
                onPostExecute((String) obj);
                return;
            default:
                onPostExecute((String) obj);
                return;
        }
    }
}
