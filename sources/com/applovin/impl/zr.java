package com.applovin.impl;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zr extends bk {

    /* renamed from: o, reason: collision with root package name */
    private final yg f12688o;

    /* renamed from: p, reason: collision with root package name */
    private final vr f12689p;

    public zr() {
        super("WebvttDecoder");
        this.f12688o = new yg();
        this.f12689p = new vr();
    }

    private static void b(yg ygVar) {
        do {
        } while (!TextUtils.isEmpty(ygVar.l()));
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i9, boolean z8) {
        xr a6;
        this.f12688o.a(bArr, i9);
        ArrayList arrayList = new ArrayList();
        try {
            as.b(this.f12688o);
            do {
            } while (!TextUtils.isEmpty(this.f12688o.l()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int a9 = a(this.f12688o);
                if (a9 == 0) {
                    return new bs(arrayList2);
                }
                if (a9 == 1) {
                    b(this.f12688o);
                } else if (a9 == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f12688o.l();
                        arrayList.addAll(this.f12689p.c(this.f12688o));
                    } else {
                        throw new ml("A style block was found after the first cue.");
                    }
                } else if (a9 == 3 && (a6 = yr.a(this.f12688o, arrayList)) != null) {
                    arrayList2.add(a6);
                }
            }
        } catch (ah e4) {
            throw new ml(e4);
        }
    }

    private static int a(yg ygVar) {
        int i9 = -1;
        int i10 = 0;
        while (i9 == -1) {
            i10 = ygVar.d();
            String l = ygVar.l();
            if (l == null) {
                i9 = 0;
            } else if ("STYLE".equals(l)) {
                i9 = 2;
            } else {
                i9 = l.startsWith("NOTE") ? 1 : 3;
            }
        }
        ygVar.f(i10);
        return i9;
    }
}
