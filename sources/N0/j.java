package N0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f2038a;
    public final ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public float f2039c;

    /* renamed from: d, reason: collision with root package name */
    public float f2040d;

    /* renamed from: e, reason: collision with root package name */
    public float f2041e;

    /* renamed from: f, reason: collision with root package name */
    public float f2042f;

    /* renamed from: g, reason: collision with root package name */
    public float f2043g;

    /* renamed from: h, reason: collision with root package name */
    public float f2044h;

    /* renamed from: i, reason: collision with root package name */
    public float f2045i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f2046j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2047k;
    public String l;

    public j() {
        this.f2038a = new Matrix();
        this.b = new ArrayList();
        this.f2039c = 0.0f;
        this.f2040d = 0.0f;
        this.f2041e = 0.0f;
        this.f2042f = 1.0f;
        this.f2043g = 1.0f;
        this.f2044h = 0.0f;
        this.f2045i = 0.0f;
        this.f2046j = new Matrix();
        this.l = null;
    }

    @Override // N0.k
    public final boolean a() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i9 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i9)).a()) {
                return true;
            }
            i9++;
        }
    }

    @Override // N0.k
    public final boolean b(int[] iArr) {
        int i9 = 0;
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i9 < arrayList.size()) {
                z8 |= ((k) arrayList.get(i9)).b(iArr);
                i9++;
            } else {
                return z8;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f2046j;
        matrix.reset();
        matrix.postTranslate(-this.f2040d, -this.f2041e);
        matrix.postScale(this.f2042f, this.f2043g);
        matrix.postRotate(this.f2039c, 0.0f, 0.0f);
        matrix.postTranslate(this.f2044h + this.f2040d, this.f2045i + this.f2041e);
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.f2046j;
    }

    public float getPivotX() {
        return this.f2040d;
    }

    public float getPivotY() {
        return this.f2041e;
    }

    public float getRotation() {
        return this.f2039c;
    }

    public float getScaleX() {
        return this.f2042f;
    }

    public float getScaleY() {
        return this.f2043g;
    }

    public float getTranslateX() {
        return this.f2044h;
    }

    public float getTranslateY() {
        return this.f2045i;
    }

    public void setPivotX(float f9) {
        if (f9 != this.f2040d) {
            this.f2040d = f9;
            c();
        }
    }

    public void setPivotY(float f9) {
        if (f9 != this.f2041e) {
            this.f2041e = f9;
            c();
        }
    }

    public void setRotation(float f9) {
        if (f9 != this.f2039c) {
            this.f2039c = f9;
            c();
        }
    }

    public void setScaleX(float f9) {
        if (f9 != this.f2042f) {
            this.f2042f = f9;
            c();
        }
    }

    public void setScaleY(float f9) {
        if (f9 != this.f2043g) {
            this.f2043g = f9;
            c();
        }
    }

    public void setTranslateX(float f9) {
        if (f9 != this.f2044h) {
            this.f2044h = f9;
            c();
        }
    }

    public void setTranslateY(float f9) {
        if (f9 != this.f2045i) {
            this.f2045i = f9;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [N0.l, N0.i] */
    public j(j jVar, x.b bVar) {
        l lVar;
        this.f2038a = new Matrix();
        this.b = new ArrayList();
        this.f2039c = 0.0f;
        this.f2040d = 0.0f;
        this.f2041e = 0.0f;
        this.f2042f = 1.0f;
        this.f2043g = 1.0f;
        this.f2044h = 0.0f;
        this.f2045i = 0.0f;
        Matrix matrix = new Matrix();
        this.f2046j = matrix;
        this.l = null;
        this.f2039c = jVar.f2039c;
        this.f2040d = jVar.f2040d;
        this.f2041e = jVar.f2041e;
        this.f2042f = jVar.f2042f;
        this.f2043g = jVar.f2043g;
        this.f2044h = jVar.f2044h;
        this.f2045i = jVar.f2045i;
        String str = jVar.l;
        this.l = str;
        this.f2047k = jVar.f2047k;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f2046j);
        ArrayList arrayList = jVar.b;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            Object obj = arrayList.get(i9);
            if (obj instanceof j) {
                this.b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f2030f = 0.0f;
                    lVar2.f2032h = 1.0f;
                    lVar2.f2033i = 1.0f;
                    lVar2.f2034j = 0.0f;
                    lVar2.f2035k = 1.0f;
                    lVar2.l = 0.0f;
                    lVar2.m = Paint.Cap.BUTT;
                    lVar2.f2036n = Paint.Join.MITER;
                    lVar2.f2037o = 4.0f;
                    lVar2.f2029e = iVar.f2029e;
                    lVar2.f2030f = iVar.f2030f;
                    lVar2.f2032h = iVar.f2032h;
                    lVar2.f2031g = iVar.f2031g;
                    lVar2.f2049c = iVar.f2049c;
                    lVar2.f2033i = iVar.f2033i;
                    lVar2.f2034j = iVar.f2034j;
                    lVar2.f2035k = iVar.f2035k;
                    lVar2.l = iVar.l;
                    lVar2.m = iVar.m;
                    lVar2.f2036n = iVar.f2036n;
                    lVar2.f2037o = iVar.f2037o;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(lVar);
                Object obj2 = lVar.b;
                if (obj2 != null) {
                    bVar.put(obj2, lVar);
                }
            }
        }
    }
}
