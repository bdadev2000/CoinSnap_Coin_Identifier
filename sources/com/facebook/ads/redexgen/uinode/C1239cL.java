package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1239cL {
    public final InterfaceC1243cP A00;
    public final String A01;
    public final Collection<C1253ca> A02;
    public final Collection<C1253ca> A03;
    public final List<Rect> A04;

    public C1239cL(String str, InterfaceC1243cP interfaceC1243cP, List<Rect> rects, Collection<C1253ca> collection, Collection<C1253ca> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1243cP;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
