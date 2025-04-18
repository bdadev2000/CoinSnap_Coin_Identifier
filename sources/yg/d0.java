package yg;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes4.dex */
public final class d0 extends l {
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f28224b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum[] f28225c;

    /* renamed from: d, reason: collision with root package name */
    public final o f28226d;

    public d0(Class cls) {
        this.a = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f28225c = enumArr;
            this.f28224b = new String[enumArr.length];
            int i10 = 0;
            while (true) {
                Enum[] enumArr2 = this.f28225c;
                if (i10 < enumArr2.length) {
                    String name = enumArr2[i10].name();
                    String[] strArr = this.f28224b;
                    Field field = cls.getField(name);
                    Set set = zg.b.a;
                    j jVar = (j) field.getAnnotation(j.class);
                    if (jVar != null) {
                        String name2 = jVar.name();
                        if (!"\u0000".equals(name2)) {
                            name = name2;
                        }
                    }
                    strArr[i10] = name;
                    i10++;
                } else {
                    this.f28226d = o.a(this.f28224b);
                    return;
                }
            }
        } catch (NoSuchFieldException e2) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e2);
        }
    }

    @Override // yg.l
    public final Object fromJson(p pVar) {
        int i10;
        q qVar = (q) pVar;
        int i11 = qVar.f28254i;
        if (i11 == 0) {
            i11 = qVar.W();
        }
        if (i11 >= 8 && i11 <= 11) {
            o oVar = this.f28226d;
            if (i11 == 11) {
                i10 = qVar.Y(qVar.f28257l, oVar);
            } else {
                int e2 = qVar.f28252g.e(oVar.f28242b);
                if (e2 != -1) {
                    qVar.f28254i = 0;
                    int[] iArr = qVar.f28246f;
                    int i12 = qVar.f28243b - 1;
                    iArr[i12] = iArr[i12] + 1;
                    i10 = e2;
                } else {
                    String t5 = qVar.t();
                    int Y = qVar.Y(t5, oVar);
                    if (Y == -1) {
                        qVar.f28254i = 11;
                        qVar.f28257l = t5;
                        qVar.f28246f[qVar.f28243b - 1] = r1[r0] - 1;
                    }
                    i10 = Y;
                }
            }
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            return this.f28225c[i10];
        }
        String z10 = pVar.z();
        throw new androidx.fragment.app.z("Expected one of " + Arrays.asList(this.f28224b) + " but was " + pVar.t() + " at path " + z10);
    }

    @Override // yg.l
    public final void toJson(s sVar, Object obj) {
        sVar.s(this.f28224b[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return "JsonAdapter(" + this.a.getName() + ")";
    }
}
