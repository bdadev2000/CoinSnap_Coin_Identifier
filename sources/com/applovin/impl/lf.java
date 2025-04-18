package com.applovin.impl;

import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class lf extends bk {

    /* renamed from: o, reason: collision with root package name */
    private final yg f5862o;

    public lf() {
        super("Mp4WebvttDecoder");
        this.f5862o = new yg();
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i10, boolean z10) {
        this.f5862o.a(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f5862o.a() > 0) {
            if (this.f5862o.a() >= 8) {
                int j3 = this.f5862o.j();
                if (this.f5862o.j() == 1987343459) {
                    arrayList.add(a(this.f5862o, j3 - 8));
                } else {
                    this.f5862o.g(j3 - 8);
                }
            } else {
                throw new ml("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new mf(arrayList);
    }

    private static z4 a(yg ygVar, int i10) {
        CharSequence charSequence = null;
        z4.b bVar = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                int j3 = ygVar.j();
                int j10 = ygVar.j();
                int i11 = j3 - 8;
                String a = yp.a(ygVar.c(), ygVar.d(), i11);
                ygVar.g(i11);
                i10 = (i10 - 8) - i11;
                if (j10 == 1937011815) {
                    bVar = yr.c(a);
                } else if (j10 == 1885436268) {
                    charSequence = yr.a((String) null, a.trim(), Collections.emptyList());
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
