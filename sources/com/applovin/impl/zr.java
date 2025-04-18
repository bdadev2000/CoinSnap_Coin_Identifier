package com.applovin.impl;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zr extends bk {

    /* renamed from: o, reason: collision with root package name */
    private final yg f9497o;

    /* renamed from: p, reason: collision with root package name */
    private final vr f9498p;

    public zr() {
        super("WebvttDecoder");
        this.f9497o = new yg();
        this.f9498p = new vr();
    }

    private static void b(yg ygVar) {
        do {
        } while (!TextUtils.isEmpty(ygVar.l()));
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i10, boolean z10) {
        xr a;
        this.f9497o.a(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            as.b(this.f9497o);
            do {
            } while (!TextUtils.isEmpty(this.f9497o.l()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int a10 = a(this.f9497o);
                if (a10 == 0) {
                    return new bs(arrayList2);
                }
                if (a10 == 1) {
                    b(this.f9497o);
                } else if (a10 == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f9497o.l();
                        arrayList.addAll(this.f9498p.c(this.f9497o));
                    } else {
                        throw new ml("A style block was found after the first cue.");
                    }
                } else if (a10 == 3 && (a = yr.a(this.f9497o, arrayList)) != null) {
                    arrayList2.add(a);
                }
            }
        } catch (ah e2) {
            throw new ml(e2);
        }
    }

    private static int a(yg ygVar) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = ygVar.d();
            String l10 = ygVar.l();
            if (l10 == null) {
                i10 = 0;
            } else if ("STYLE".equals(l10)) {
                i10 = 2;
            } else {
                i10 = l10.startsWith("NOTE") ? 1 : 3;
            }
        }
        ygVar.f(i11);
        return i10;
    }
}
