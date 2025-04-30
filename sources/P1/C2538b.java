package p1;

import J1.C0209b;
import J1.j;
import J1.l;
import J1.m;
import J1.q;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.o;
import j5.C2400c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2538b {

    /* renamed from: r, reason: collision with root package name */
    public static C2538b f22173r;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f22174a;
    public ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public C2400c f22175c;

    /* renamed from: e, reason: collision with root package name */
    public C0209b f22177e;

    /* renamed from: f, reason: collision with root package name */
    public List f22178f;

    /* renamed from: g, reason: collision with root package name */
    public List f22179g;

    /* renamed from: k, reason: collision with root package name */
    public int f22183k;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f22176d = Boolean.FALSE;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f22180h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f22181i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public String f22182j = "";
    public boolean l = false;
    public boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f22184n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f22185o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final C2537a f22186p = new C2537a(this);

    /* renamed from: q, reason: collision with root package name */
    public final C2537a f22187q = new C2537a(this);

    public static C2538b a() {
        if (f22173r == null) {
            f22173r = new C2538b();
        }
        return f22173r;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, J1.p] */
    public static ArrayList c(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            ?? obj = new Object();
            obj.f1537a = str2;
            obj.b = str;
            if (!"first_party".equals(str)) {
                if (obj.f1537a != null) {
                    if (obj.b != null) {
                        arrayList2.add(new q(obj));
                    } else {
                        throw new IllegalArgumentException("Product type must be provided.");
                    }
                } else {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
            } else {
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }
        }
        return arrayList2;
    }

    public final String b(String str) {
        m mVar = (m) this.f22181i.get(str);
        if (mVar == null) {
            return "";
        }
        ArrayList arrayList = mVar.f1535i;
        ArrayList arrayList2 = ((l) arrayList.get(arrayList.size() - 1)).b.f1526a;
        Log.e("PurchaseEG", "getPriceSub: " + ((j) o.g(arrayList2, 1)).f1524a);
        return ((j) arrayList2.get(arrayList2.size() - 1)).f1524a;
    }
}
