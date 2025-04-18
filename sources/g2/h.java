package g2;

import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends i {
    public final Matrix a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17954b;

    /* renamed from: c, reason: collision with root package name */
    public float f17955c;

    /* renamed from: d, reason: collision with root package name */
    public float f17956d;

    /* renamed from: e, reason: collision with root package name */
    public float f17957e;

    /* renamed from: f, reason: collision with root package name */
    public float f17958f;

    /* renamed from: g, reason: collision with root package name */
    public float f17959g;

    /* renamed from: h, reason: collision with root package name */
    public float f17960h;

    /* renamed from: i, reason: collision with root package name */
    public float f17961i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f17962j;

    /* renamed from: k, reason: collision with root package name */
    public final int f17963k;

    /* renamed from: l, reason: collision with root package name */
    public String f17964l;

    public h(h hVar, r.b bVar) {
        j fVar;
        this.a = new Matrix();
        this.f17954b = new ArrayList();
        this.f17955c = 0.0f;
        this.f17956d = 0.0f;
        this.f17957e = 0.0f;
        this.f17958f = 1.0f;
        this.f17959g = 1.0f;
        this.f17960h = 0.0f;
        this.f17961i = 0.0f;
        Matrix matrix = new Matrix();
        this.f17962j = matrix;
        this.f17964l = null;
        this.f17955c = hVar.f17955c;
        this.f17956d = hVar.f17956d;
        this.f17957e = hVar.f17957e;
        this.f17958f = hVar.f17958f;
        this.f17959g = hVar.f17959g;
        this.f17960h = hVar.f17960h;
        this.f17961i = hVar.f17961i;
        String str = hVar.f17964l;
        this.f17964l = str;
        this.f17963k = hVar.f17963k;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(hVar.f17962j);
        ArrayList arrayList = hVar.f17954b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof h) {
                this.f17954b.add(new h((h) obj, bVar));
            } else {
                if (obj instanceof g) {
                    fVar = new g((g) obj);
                } else if (obj instanceof f) {
                    fVar = new f((f) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f17954b.add(fVar);
                Object obj2 = fVar.f17965b;
                if (obj2 != null) {
                    bVar.put(obj2, fVar);
                }
            }
        }
    }

    @Override // g2.i
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17954b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((i) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // g2.i
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f17954b;
            if (i10 < arrayList.size()) {
                z10 |= ((i) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f17962j;
        matrix.reset();
        matrix.postTranslate(-this.f17956d, -this.f17957e);
        matrix.postScale(this.f17958f, this.f17959g);
        matrix.postRotate(this.f17955c, 0.0f, 0.0f);
        matrix.postTranslate(this.f17960h + this.f17956d, this.f17961i + this.f17957e);
    }

    public String getGroupName() {
        return this.f17964l;
    }

    public Matrix getLocalMatrix() {
        return this.f17962j;
    }

    public float getPivotX() {
        return this.f17956d;
    }

    public float getPivotY() {
        return this.f17957e;
    }

    public float getRotation() {
        return this.f17955c;
    }

    public float getScaleX() {
        return this.f17958f;
    }

    public float getScaleY() {
        return this.f17959g;
    }

    public float getTranslateX() {
        return this.f17960h;
    }

    public float getTranslateY() {
        return this.f17961i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f17956d) {
            this.f17956d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f17957e) {
            this.f17957e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f17955c) {
            this.f17955c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f17958f) {
            this.f17958f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f17959g) {
            this.f17959g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f17960h) {
            this.f17960h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f17961i) {
            this.f17961i = f10;
            c();
        }
    }

    public h() {
        this.a = new Matrix();
        this.f17954b = new ArrayList();
        this.f17955c = 0.0f;
        this.f17956d = 0.0f;
        this.f17957e = 0.0f;
        this.f17958f = 1.0f;
        this.f17959g = 1.0f;
        this.f17960h = 0.0f;
        this.f17961i = 0.0f;
        this.f17962j = new Matrix();
        this.f17964l = null;
    }
}
