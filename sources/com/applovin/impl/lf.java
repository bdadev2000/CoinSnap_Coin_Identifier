package com.applovin.impl;

import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class lf extends bk {

    /* renamed from: o, reason: collision with root package name */
    private final yg f8830o;

    public lf() {
        super("Mp4WebvttDecoder");
        this.f8830o = new yg();
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i9, boolean z8) {
        this.f8830o.a(bArr, i9);
        ArrayList arrayList = new ArrayList();
        while (this.f8830o.a() > 0) {
            if (this.f8830o.a() >= 8) {
                int j7 = this.f8830o.j();
                if (this.f8830o.j() == 1987343459) {
                    arrayList.add(a(this.f8830o, j7 - 8));
                } else {
                    this.f8830o.g(j7 - 8);
                }
            } else {
                throw new ml("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new mf(arrayList);
    }

    private static z4 a(yg ygVar, int i9) {
        CharSequence charSequence = null;
        z4.b bVar = null;
        while (i9 > 0) {
            if (i9 >= 8) {
                int j7 = ygVar.j();
                int j9 = ygVar.j();
                int i10 = j7 - 8;
                String a6 = yp.a(ygVar.c(), ygVar.d(), i10);
                ygVar.g(i10);
                i9 = (i9 - 8) - i10;
                if (j9 == 1937011815) {
                    bVar = yr.c(a6);
                } else if (j9 == 1885436268) {
                    charSequence = yr.a((String) null, a6.trim(), Collections.emptyList());
                }
            } else {
                throw new ml("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.a(charSequence).a();
        }
        return yr.a(charSequence);
    }
}
