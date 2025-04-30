package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C09647f extends ContextWrapper {
    public final InterfaceC09657h A00;
    public final AtomicReference<String> A01;

    public C09647f(Context context, InterfaceC09657h interfaceC09657h) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = interfaceC09657h;
    }

    public final InterfaceC09456g A00() {
        return this.A00.A6L();
    }

    public final C1635Ym A01() {
        return this.A00.A7r(this);
    }

    public final C7g A02() {
        return this.A00.A6A(this);
    }

    public final InterfaceC09667i A03() {
        return this.A00.A6v(this);
    }

    public final C7k A04() {
        return this.A00.A7q(this);
    }

    public final InterfaceC09687l A05() {
        return this.A00.A86();
    }

    public final InterfaceC09767w A06() {
        return this.A00.A6j(this);
    }

    public final AnonymousClass89 A07() {
        return this.A00.A6l(this);
    }

    public final C09828c A08() {
        return this.A00.A7y();
    }

    public final J2 A09() {
        return this.A00.A5u(A01());
    }

    public final JE A0A() {
        return this.A00.A7s(A01());
    }

    public final String A0B() {
        return this.A01.get();
    }

    public final void A0C(String str) {
        this.A01.set(str);
    }
}
