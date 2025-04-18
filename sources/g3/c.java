package g3;

import a4.y;
import androidx.recyclerview.widget.s0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: r, reason: collision with root package name */
    public static c f18006r;
    public ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f18007b;

    /* renamed from: c, reason: collision with root package name */
    public k3.a f18008c;

    /* renamed from: e, reason: collision with root package name */
    public a4.d f18010e;

    /* renamed from: f, reason: collision with root package name */
    public List f18011f;

    /* renamed from: g, reason: collision with root package name */
    public List f18012g;

    /* renamed from: k, reason: collision with root package name */
    public int f18016k;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f18009d = Boolean.FALSE;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f18013h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f18014i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public String f18015j = "";

    /* renamed from: l, reason: collision with root package name */
    public boolean f18017l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18018m = false;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f18019n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f18020o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final a f18021p = new a(this);

    /* renamed from: q, reason: collision with root package name */
    public final s0 f18022q = new s0(this, 0);

    public static c a() {
        if (f18006r == null) {
            f18006r = new c();
        }
        return f18006r;
    }

    public static ArrayList b(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            y yVar = new y();
            yVar.f170b = str2;
            yVar.f171c = str;
            arrayList2.add(yVar.a());
        }
        return arrayList2;
    }
}
