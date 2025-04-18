package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.dp;
import com.applovin.impl.f9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n6 implements dp.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f25678a;

    /* renamed from: b, reason: collision with root package name */
    private final List f25679b;

    public n6(int i2) {
        this(i2, eb.h());
    }

    private boolean a(int i2) {
        return (i2 & this.f25678a) != 0;
    }

    private vp b(dp.b bVar) {
        return new vp(c(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private List c(dp.b bVar) {
        String str;
        int i2;
        if (a(32)) {
            return this.f25679b;
        }
        bh bhVar = new bh(bVar.d);
        ArrayList arrayList = this.f25679b;
        while (bhVar.a() > 0) {
            int w = bhVar.w();
            int d = bhVar.d() + bhVar.w();
            if (w == 134) {
                arrayList = new ArrayList();
                int w2 = bhVar.w() & 31;
                for (int i3 = 0; i3 < w2; i3++) {
                    String c2 = bhVar.c(3);
                    int w3 = bhVar.w();
                    boolean z2 = (w3 & 128) != 0;
                    if (z2) {
                        i2 = w3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte w4 = (byte) bhVar.w();
                    bhVar.g(1);
                    arrayList.add(new f9.b().f(str).e(c2).a(i2).a(z2 ? o3.a((w4 & 64) != 0) : null).a());
                }
            }
            bhVar.f(d);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public n6(int i2, List list) {
        this.f25678a = i2;
        this.f25679b = list;
    }

    @Override // com.applovin.impl.dp.c
    public dp a(int i2, dp.b bVar) {
        if (i2 == 2) {
            return new ih(new fa(b(bVar)));
        }
        if (i2 == 3 || i2 == 4) {
            return new ih(new sf(bVar.f23524b));
        }
        if (i2 == 21) {
            return new ih(new ab());
        }
        if (i2 == 27) {
            if (a(4)) {
                return null;
            }
            return new ih(new ha(a(bVar), a(1), a(8)));
        }
        if (i2 == 36) {
            return new ih(new ia(a(bVar)));
        }
        if (i2 != 89) {
            if (i2 != 138) {
                if (i2 == 172) {
                    return new ih(new m(bVar.f23524b));
                }
                if (i2 != 257) {
                    if (i2 != 129) {
                        if (i2 != 130) {
                            if (i2 == 134) {
                                if (a(16)) {
                                    return null;
                                }
                                return new hj(new eh("application/x-scte35"));
                            }
                            if (i2 != 135) {
                                switch (i2) {
                                    case 15:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new ih(new k0(false, bVar.f23524b));
                                    case 16:
                                        return new ih(new ga(b(bVar)));
                                    case 17:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new ih(new bc(bVar.f23524b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (!a(64)) {
                            return null;
                        }
                    }
                    return new ih(new j(bVar.f23524b));
                }
                return new hj(new eh("application/vnd.dvb.ait"));
            }
            return new ih(new e7(bVar.f23524b));
        }
        return new ih(new m7(bVar.f23525c));
    }

    @Override // com.applovin.impl.dp.c
    public SparseArray a() {
        return new SparseArray();
    }

    private nj a(dp.b bVar) {
        return new nj(c(bVar));
    }
}
