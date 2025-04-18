package m3;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public Map f21552c;

    /* renamed from: d, reason: collision with root package name */
    public Map f21553d;

    /* renamed from: e, reason: collision with root package name */
    public float f21554e;

    /* renamed from: f, reason: collision with root package name */
    public Map f21555f;

    /* renamed from: g, reason: collision with root package name */
    public List f21556g;

    /* renamed from: h, reason: collision with root package name */
    public r.l f21557h;

    /* renamed from: i, reason: collision with root package name */
    public r.e f21558i;

    /* renamed from: j, reason: collision with root package name */
    public List f21559j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f21560k;

    /* renamed from: l, reason: collision with root package name */
    public float f21561l;

    /* renamed from: m, reason: collision with root package name */
    public float f21562m;

    /* renamed from: n, reason: collision with root package name */
    public float f21563n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21564o;
    public final e0 a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f21551b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f21565p = 0;

    public final void a(String str) {
        y3.b.b(str);
        this.f21551b.add(str);
    }

    public final float b() {
        return ((this.f21562m - this.f21561l) / this.f21563n) * 1000.0f;
    }

    public final Map c() {
        float c10 = y3.h.c();
        if (c10 != this.f21554e) {
            this.f21554e = c10;
            for (Map.Entry entry : this.f21553d.entrySet()) {
                Map map = this.f21553d;
                String str = (String) entry.getKey();
                y yVar = (y) entry.getValue();
                float f10 = this.f21554e / c10;
                int i10 = (int) (yVar.a * f10);
                int i11 = (int) (yVar.f21615b * f10);
                y yVar2 = new y(i10, i11, yVar.f21616c, yVar.f21617d, yVar.f21618e);
                Bitmap bitmap = yVar.f21619f;
                if (bitmap != null) {
                    yVar2.f21619f = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
                }
                map.put(str, yVar2);
            }
        }
        return this.f21553d;
    }

    public final r3.h d(String str) {
        int size = this.f21556g.size();
        for (int i10 = 0; i10 < size; i10++) {
            r3.h hVar = (r3.h) this.f21556g.get(i10);
            String str2 = hVar.a;
            boolean z10 = true;
            if (!str2.equalsIgnoreCase(str) && (!str2.endsWith("\r") || !str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                z10 = false;
            }
            if (z10) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f21559j.iterator();
        while (it.hasNext()) {
            sb2.append(((u3.e) it.next()).a("\t"));
        }
        return sb2.toString();
    }
}
