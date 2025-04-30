package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1805cL {
    public final InterfaceC1809cP A00;
    public final String A01;
    public final Collection<C1819ca> A02;
    public final Collection<C1819ca> A03;
    public final List<Rect> A04;

    public C1805cL(String str, InterfaceC1809cP interfaceC1809cP, List<Rect> rects, Collection<C1819ca> collection, Collection<C1819ca> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1809cP;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
