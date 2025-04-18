package m9;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final k0.b f21759h = new k0.b(23);

    /* renamed from: i, reason: collision with root package name */
    public static final k0.b f21760i = new k0.b(24);
    public final int a;

    /* renamed from: e, reason: collision with root package name */
    public int f21764e;

    /* renamed from: f, reason: collision with root package name */
    public int f21765f;

    /* renamed from: g, reason: collision with root package name */
    public int f21766g;

    /* renamed from: c, reason: collision with root package name */
    public final t0[] f21762c = new t0[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21761b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f21763d = -1;

    public u0(int i10) {
        this.a = i10;
    }

    public final void a(int i10, float f10) {
        t0 t0Var;
        int i11 = this.f21763d;
        ArrayList arrayList = this.f21761b;
        if (i11 != 1) {
            Collections.sort(arrayList, f21759h);
            this.f21763d = 1;
        }
        int i12 = this.f21766g;
        t0[] t0VarArr = this.f21762c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f21766g = i13;
            t0Var = t0VarArr[i13];
        } else {
            t0Var = new t0();
        }
        int i14 = this.f21764e;
        this.f21764e = i14 + 1;
        t0Var.a = i14;
        t0Var.f21756b = i10;
        t0Var.f21757c = f10;
        arrayList.add(t0Var);
        this.f21765f += i10;
        while (true) {
            int i15 = this.f21765f;
            int i16 = this.a;
            if (i15 > i16) {
                int i17 = i15 - i16;
                t0 t0Var2 = (t0) arrayList.get(0);
                int i18 = t0Var2.f21756b;
                if (i18 <= i17) {
                    this.f21765f -= i18;
                    arrayList.remove(0);
                    int i19 = this.f21766g;
                    if (i19 < 5) {
                        this.f21766g = i19 + 1;
                        t0VarArr[i19] = t0Var2;
                    }
                } else {
                    t0Var2.f21756b = i18 - i17;
                    this.f21765f -= i17;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f21763d;
        ArrayList arrayList = this.f21761b;
        if (i10 != 0) {
            Collections.sort(arrayList, f21760i);
            this.f21763d = 0;
        }
        float f10 = 0.5f * this.f21765f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            t0 t0Var = (t0) arrayList.get(i12);
            i11 += t0Var.f21756b;
            if (i11 >= f10) {
                return t0Var.f21757c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((t0) arrayList.get(arrayList.size() - 1)).f21757c;
    }
}
