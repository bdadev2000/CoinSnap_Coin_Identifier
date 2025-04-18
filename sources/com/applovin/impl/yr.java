package com.applovin.impl;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class yr extends ek {

    /* renamed from: o, reason: collision with root package name */
    private final bh f28238o;

    /* renamed from: p, reason: collision with root package name */
    private final ur f28239p;

    public yr() {
        super("WebvttDecoder");
        this.f28238o = new bh();
        this.f28239p = new ur();
    }

    private static void b(bh bhVar) {
        do {
        } while (!TextUtils.isEmpty(bhVar.l()));
    }

    @Override // com.applovin.impl.ek
    public nl a(byte[] bArr, int i2, boolean z2) {
        wr a2;
        this.f28238o.a(bArr, i2);
        ArrayList arrayList = new ArrayList();
        try {
            zr.b(this.f28238o);
            do {
            } while (!TextUtils.isEmpty(this.f28238o.l()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int a3 = a(this.f28238o);
                if (a3 == 0) {
                    return new as(arrayList2);
                }
                if (a3 == 1) {
                    b(this.f28238o);
                } else if (a3 == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f28238o.l();
                        arrayList.addAll(this.f28239p.c(this.f28238o));
                    } else {
                        throw new pl("A style block was found after the first cue.");
                    }
                } else if (a3 == 3 && (a2 = xr.a(this.f28238o, arrayList)) != null) {
                    arrayList2.add(a2);
                }
            }
        } catch (dh e) {
            throw new pl(e);
        }
    }

    private static int a(bh bhVar) {
        int i2 = -1;
        int i3 = 0;
        while (i2 == -1) {
            i3 = bhVar.d();
            String l2 = bhVar.l();
            if (l2 == null) {
                i2 = 0;
            } else if ("STYLE".equals(l2)) {
                i2 = 2;
            } else {
                i2 = l2.startsWith("NOTE") ? 1 : 3;
            }
        }
        bhVar.f(i3);
        return i2;
    }
}
