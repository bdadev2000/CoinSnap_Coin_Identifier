package T;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f2943a;
    public L.e[] b;

    public y0() {
        this(new G0());
    }

    public final void a() {
        L.e[] eVarArr = this.b;
        if (eVarArr != null) {
            L.e eVar = eVarArr[0];
            L.e eVar2 = eVarArr[1];
            G0 g02 = this.f2943a;
            if (eVar2 == null) {
                eVar2 = g02.f2863a.f(2);
            }
            if (eVar == null) {
                eVar = g02.f2863a.f(1);
            }
            g(L.e.a(eVar, eVar2));
            L.e eVar3 = this.b[4];
            if (eVar3 != null) {
                f(eVar3);
            }
            L.e eVar4 = this.b[5];
            if (eVar4 != null) {
                d(eVar4);
            }
            L.e eVar5 = this.b[6];
            if (eVar5 != null) {
                h(eVar5);
            }
        }
    }

    @NonNull
    public abstract G0 b();

    public void c(int i9, @NonNull L.e eVar) {
        char c9;
        if (this.b == null) {
            this.b = new L.e[9];
        }
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                L.e[] eVarArr = this.b;
                if (i10 != 1) {
                    c9 = 2;
                    if (i10 != 2) {
                        if (i10 != 4) {
                            c9 = '\b';
                            if (i10 != 8) {
                                if (i10 != 16) {
                                    if (i10 != 32) {
                                        if (i10 != 64) {
                                            if (i10 != 128) {
                                                if (i10 != 256) {
                                                    throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i10, "type needs to be >= FIRST and <= LAST, type="));
                                                }
                                            } else {
                                                c9 = 7;
                                            }
                                        } else {
                                            c9 = 6;
                                        }
                                    } else {
                                        c9 = 5;
                                    }
                                } else {
                                    c9 = 4;
                                }
                            } else {
                                c9 = 3;
                            }
                        }
                    } else {
                        c9 = 1;
                    }
                } else {
                    c9 = 0;
                }
                eVarArr[c9] = eVar;
            }
        }
    }

    public abstract void e(@NonNull L.e eVar);

    public abstract void g(@NonNull L.e eVar);

    public y0(@NonNull G0 g02) {
        this.f2943a = g02;
    }

    public void d(@NonNull L.e eVar) {
    }

    public void f(@NonNull L.e eVar) {
    }

    public void h(@NonNull L.e eVar) {
    }
}
