package N0;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f2051p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f2052a;
    public final Path b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f2053c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f2054d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f2055e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f2056f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2057g;

    /* renamed from: h, reason: collision with root package name */
    public float f2058h;

    /* renamed from: i, reason: collision with root package name */
    public float f2059i;

    /* renamed from: j, reason: collision with root package name */
    public float f2060j;

    /* renamed from: k, reason: collision with root package name */
    public float f2061k;
    public int l;
    public String m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f2062n;

    /* renamed from: o, reason: collision with root package name */
    public final x.b f2063o;

    /* JADX WARN: Type inference failed for: r0v4, types: [x.l, x.b] */
    public m() {
        this.f2053c = new Matrix();
        this.f2058h = 0.0f;
        this.f2059i = 0.0f;
        this.f2060j = 0.0f;
        this.f2061k = 0.0f;
        this.l = 255;
        this.m = null;
        this.f2062n = null;
        this.f2063o = new x.l();
        this.f2057g = new j();
        this.f2052a = new Path();
        this.b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f2035k != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(N0.j r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.m.a(N0.j, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f9) {
        setRootAlpha((int) (f9 * 255.0f));
    }

    public void setRootAlpha(int i9) {
        this.l = i9;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [x.l, x.b] */
    public m(m mVar) {
        this.f2053c = new Matrix();
        this.f2058h = 0.0f;
        this.f2059i = 0.0f;
        this.f2060j = 0.0f;
        this.f2061k = 0.0f;
        this.l = 255;
        this.m = null;
        this.f2062n = null;
        ?? lVar = new x.l();
        this.f2063o = lVar;
        this.f2057g = new j(mVar.f2057g, lVar);
        this.f2052a = new Path(mVar.f2052a);
        this.b = new Path(mVar.b);
        this.f2058h = mVar.f2058h;
        this.f2059i = mVar.f2059i;
        this.f2060j = mVar.f2060j;
        this.f2061k = mVar.f2061k;
        this.l = mVar.l;
        this.m = mVar.m;
        String str = mVar.m;
        if (str != null) {
            lVar.put(str, this);
        }
        this.f2062n = mVar.f2062n;
    }
}
