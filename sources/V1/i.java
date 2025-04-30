package v1;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public Map f23485c;

    /* renamed from: d, reason: collision with root package name */
    public Map f23486d;

    /* renamed from: e, reason: collision with root package name */
    public float f23487e;

    /* renamed from: f, reason: collision with root package name */
    public Map f23488f;

    /* renamed from: g, reason: collision with root package name */
    public List f23489g;

    /* renamed from: h, reason: collision with root package name */
    public x.m f23490h;

    /* renamed from: i, reason: collision with root package name */
    public x.f f23491i;

    /* renamed from: j, reason: collision with root package name */
    public List f23492j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f23493k;
    public float l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public float f23494n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23495o;

    /* renamed from: a, reason: collision with root package name */
    public final C2837C f23484a = new C2837C();
    public final HashSet b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f23496p = 0;

    public final void a(String str) {
        H1.c.b(str);
        this.b.add(str);
    }

    public final float b() {
        return ((this.m - this.l) / this.f23494n) * 1000.0f;
    }

    public final Map c() {
        float c9 = H1.i.c();
        if (c9 != this.f23487e) {
            for (Map.Entry entry : this.f23486d.entrySet()) {
                Map map = this.f23486d;
                String str = (String) entry.getKey();
                w wVar = (w) entry.getValue();
                float f9 = this.f23487e / c9;
                int i9 = (int) (wVar.f23562a * f9);
                int i10 = (int) (wVar.b * f9);
                w wVar2 = new w(i9, i10, wVar.f23563c, wVar.f23564d, wVar.f23565e);
                Bitmap bitmap = wVar.f23566f;
                if (bitmap != null) {
                    wVar2.f23566f = Bitmap.createScaledBitmap(bitmap, i9, i10, true);
                }
                map.put(str, wVar2);
            }
        }
        this.f23487e = c9;
        return this.f23486d;
    }

    public final A1.h d(String str) {
        int size = this.f23489g.size();
        for (int i9 = 0; i9 < size; i9++) {
            A1.h hVar = (A1.h) this.f23489g.get(i9);
            String str2 = hVar.f24a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f23492j.iterator();
        while (it.hasNext()) {
            sb.append(((D1.e) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
