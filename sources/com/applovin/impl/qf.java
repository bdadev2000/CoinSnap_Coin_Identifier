package com.applovin.impl;

import com.applovin.impl.b5;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class qf extends ek {

    /* renamed from: o, reason: collision with root package name */
    private final bh f26170o;

    public qf() {
        super("Mp4WebvttDecoder");
        this.f26170o = new bh();
    }

    @Override // com.applovin.impl.ek
    public nl a(byte[] bArr, int i2, boolean z2) {
        this.f26170o.a(bArr, i2);
        ArrayList arrayList = new ArrayList();
        while (this.f26170o.a() > 0) {
            if (this.f26170o.a() >= 8) {
                int j2 = this.f26170o.j();
                if (this.f26170o.j() == 1987343459) {
                    arrayList.add(a(this.f26170o, j2 - 8));
                } else {
                    this.f26170o.g(j2 - 8);
                }
            } else {
                throw new pl("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new rf(arrayList);
    }

    private static b5 a(bh bhVar, int i2) {
        CharSequence charSequence = null;
        b5.b bVar = null;
        while (i2 > 0) {
            if (i2 >= 8) {
                int j2 = bhVar.j();
                int j3 = bhVar.j();
                int i3 = j2 - 8;
                String a2 = xp.a(bhVar.c(), bhVar.d(), i3);
                bhVar.g(i3);
                i2 = (i2 - 8) - i3;
                if (j3 == 1937011815) {
                    bVar = xr.c(a2);
                } else if (j3 == 1885436268) {
                    charSequence = xr.a((String) null, a2.trim(), Collections.emptyList());
                }
            } else {
                throw new pl("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.a(charSequence).a();
        }
        return xr.a(charSequence);
    }
}
