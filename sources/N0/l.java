package N0;

import a.AbstractC0325a;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public L.i[] f2048a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public int f2049c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2050d;

    public l() {
        this.f2048a = null;
        this.f2049c = 0;
    }

    public L.i[] getPathData() {
        return this.f2048a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(L.i[] iVarArr) {
        L.i[] iVarArr2 = this.f2048a;
        boolean z8 = false;
        if (iVarArr2 != null && iVarArr != null && iVarArr2.length == iVarArr.length) {
            int i9 = 0;
            while (true) {
                if (i9 < iVarArr2.length) {
                    L.i iVar = iVarArr2[i9];
                    char c9 = iVar.f1673a;
                    L.i iVar2 = iVarArr[i9];
                    if (c9 != iVar2.f1673a || iVar.b.length != iVar2.b.length) {
                        break;
                    } else {
                        i9++;
                    }
                } else {
                    z8 = true;
                    break;
                }
            }
        }
        if (!z8) {
            this.f2048a = AbstractC0325a.e(iVarArr);
            return;
        }
        L.i[] iVarArr3 = this.f2048a;
        for (int i10 = 0; i10 < iVarArr.length; i10++) {
            iVarArr3[i10].f1673a = iVarArr[i10].f1673a;
            int i11 = 0;
            while (true) {
                float[] fArr = iVarArr[i10].b;
                if (i11 < fArr.length) {
                    iVarArr3[i10].b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f2048a = null;
        this.f2049c = 0;
        this.b = lVar.b;
        this.f2050d = lVar.f2050d;
        this.f2048a = AbstractC0325a.e(lVar.f2048a);
    }
}
