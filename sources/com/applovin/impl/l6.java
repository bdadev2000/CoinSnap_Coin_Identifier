package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l6 implements ep.c {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5853b;

    public l6(int i10) {
        this(i10, ab.h());
    }

    private wp b(ep.b bVar) {
        return new wp(c(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private List c(ep.b bVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        if (a(32)) {
            return this.f5853b;
        }
        yg ygVar = new yg(bVar.f4509d);
        ArrayList arrayList = this.f5853b;
        while (ygVar.a() > 0) {
            int w10 = ygVar.w();
            int d10 = ygVar.d() + ygVar.w();
            if (w10 == 134) {
                arrayList = new ArrayList();
                int w11 = ygVar.w() & 31;
                for (int i11 = 0; i11 < w11; i11++) {
                    String c10 = ygVar.c(3);
                    int w12 = ygVar.w();
                    boolean z11 = true;
                    if ((w12 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = w12 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte w13 = (byte) ygVar.w();
                    ygVar.g(1);
                    if (z10) {
                        if ((w13 & 64) == 0) {
                            z11 = false;
                        }
                        list = m3.a(z11);
                    } else {
                        list = null;
                    }
                    arrayList.add(new d9.b().f(str).e(c10).a(i10).a(list).a());
                }
            }
            ygVar.f(d10);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.applovin.impl.ep.c
    public ep a(int i10, ep.b bVar) {
        if (i10 == 2) {
            return new fh(new da(b(bVar)));
        }
        if (i10 == 3 || i10 == 4) {
            return new fh(new nf(bVar.f4507b));
        }
        if (i10 == 21) {
            return new fh(new wa());
        }
        if (i10 == 27) {
            if (a(4)) {
                return null;
            }
            return new fh(new fa(a(bVar), a(1), a(8)));
        }
        if (i10 == 36) {
            return new fh(new ga(a(bVar)));
        }
        if (i10 != 89) {
            if (i10 != 138) {
                if (i10 == 172) {
                    return new fh(new m(bVar.f4507b));
                }
                if (i10 != 257) {
                    if (i10 != 129) {
                        if (i10 != 130) {
                            if (i10 == 134) {
                                if (a(16)) {
                                    return null;
                                }
                                return new dj(new bh(MimeTypes.APPLICATION_SCTE35));
                            }
                            if (i10 != 135) {
                                switch (i10) {
                                    case 15:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new fh(new k0(false, bVar.f4507b));
                                    case 16:
                                        return new fh(new ea(b(bVar)));
                                    case 17:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new fh(new wb(bVar.f4507b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (!a(64)) {
                            return null;
                        }
                    }
                    return new fh(new j(bVar.f4507b));
                }
                return new dj(new bh("application/vnd.dvb.ait"));
            }
            return new fh(new c7(bVar.f4507b));
        }
        return new fh(new k7(bVar.f4508c));
    }

    public l6(int i10, List list) {
        this.a = i10;
        this.f5853b = list;
    }

    private boolean a(int i10) {
        return (i10 & this.a) != 0;
    }

    @Override // com.applovin.impl.ep.c
    public SparseArray a() {
        return new SparseArray();
    }

    private jj a(ep.b bVar) {
        return new jj(c(bVar));
    }
}
