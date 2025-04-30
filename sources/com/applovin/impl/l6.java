package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l6 implements ep.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f8820a;
    private final List b;

    public l6(int i9) {
        this(i9, ab.h());
    }

    private wp b(ep.b bVar) {
        return new wp(c(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private List c(ep.b bVar) {
        boolean z8;
        String str;
        int i9;
        List list;
        if (a(32)) {
            return this.b;
        }
        yg ygVar = new yg(bVar.f7475d);
        ArrayList arrayList = this.b;
        while (ygVar.a() > 0) {
            int w2 = ygVar.w();
            int d2 = ygVar.d() + ygVar.w();
            if (w2 == 134) {
                arrayList = new ArrayList();
                int w9 = ygVar.w() & 31;
                for (int i10 = 0; i10 < w9; i10++) {
                    String c9 = ygVar.c(3);
                    int w10 = ygVar.w();
                    boolean z9 = true;
                    if ((w10 & 128) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        i9 = w10 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i9 = 1;
                    }
                    byte w11 = (byte) ygVar.w();
                    ygVar.g(1);
                    if (z8) {
                        if ((w11 & 64) == 0) {
                            z9 = false;
                        }
                        list = m3.a(z9);
                    } else {
                        list = null;
                    }
                    arrayList.add(new d9.b().f(str).e(c9).a(i9).a(list).a());
                }
            }
            ygVar.f(d2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.applovin.impl.ep.c
    public ep a(int i9, ep.b bVar) {
        if (i9 == 2) {
            return new fh(new da(b(bVar)));
        }
        if (i9 == 3 || i9 == 4) {
            return new fh(new nf(bVar.b));
        }
        if (i9 == 21) {
            return new fh(new wa());
        }
        if (i9 == 27) {
            if (a(4)) {
                return null;
            }
            return new fh(new fa(a(bVar), a(1), a(8)));
        }
        if (i9 == 36) {
            return new fh(new ga(a(bVar)));
        }
        if (i9 != 89) {
            if (i9 != 138) {
                if (i9 == 172) {
                    return new fh(new C0722m(bVar.b));
                }
                if (i9 != 257) {
                    if (i9 != 129) {
                        if (i9 != 130) {
                            if (i9 == 134) {
                                if (a(16)) {
                                    return null;
                                }
                                return new dj(new bh(MimeTypes.APPLICATION_SCTE35));
                            }
                            if (i9 != 135) {
                                switch (i9) {
                                    case 15:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new fh(new C0715k0(false, bVar.b));
                                    case 16:
                                        return new fh(new ea(b(bVar)));
                                    case 17:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new fh(new wb(bVar.b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (!a(64)) {
                            return null;
                        }
                    }
                    return new fh(new C0710j(bVar.b));
                }
                return new dj(new bh("application/vnd.dvb.ait"));
            }
            return new fh(new c7(bVar.b));
        }
        return new fh(new k7(bVar.f7474c));
    }

    public l6(int i9, List list) {
        this.f8820a = i9;
        this.b = list;
    }

    private boolean a(int i9) {
        return (i9 & this.f8820a) != 0;
    }

    @Override // com.applovin.impl.ep.c
    public SparseArray a() {
        return new SparseArray();
    }

    private jj a(ep.b bVar) {
        return new jj(c(bVar));
    }
}
