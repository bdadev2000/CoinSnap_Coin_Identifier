package O5;

import J1.p;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2202a;
    public final Serializable b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f2203c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2204d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2205e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2206f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2207g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2208h;

    public d(p pVar, WebView webView, String str, List list, Z5.c cVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.f2203c = new HashMap();
        this.f2207g = pVar;
        this.f2202a = webView;
        this.f2204d = str;
        this.f2208h = cVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Z5.g gVar = (Z5.g) it.next();
                ((HashMap) this.f2203c).put(UUID.randomUUID().toString(), gVar);
            }
        }
        this.f2206f = null;
        this.f2205e = null;
    }

    public static d a(p pVar, String str, List list, String str2, String str3) {
        R2.b.c(str, "OM SDK JS script content is null");
        R2.b.c(list, "VerificationScriptResources is null");
        if (str3 != null && str3.length() > 256) {
            throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
        return new d(pVar, null, str, list, str2, str3, e.NATIVE);
    }

    public d(p pVar, WebView webView, String str, List list, String str2, String str3, e eVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.f2203c = new HashMap();
        this.f2207g = pVar;
        this.f2202a = webView;
        this.f2204d = str;
        this.f2208h = eVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                ((HashMap) this.f2203c).put(UUID.randomUUID().toString(), jVar);
            }
        }
        this.f2206f = str2;
        this.f2205e = str3;
    }

    public d(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, r4.c cVar) {
        this.f2204d = str;
        this.f2205e = str2;
        this.f2207g = arrayList;
        this.f2206f = str3;
        this.f2202a = str4;
        this.b = str5;
        this.f2203c = str6;
        this.f2208h = cVar;
    }
}
