package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7j extends ContextWrapper {
    public final InterfaceC03477l A00;
    public final AtomicReference<String> A01;

    public C7j(Context context, InterfaceC03477l interfaceC03477l) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = interfaceC03477l;
    }

    public final InterfaceC03266j A00() {
        return this.A00.A6j();
    }

    public final C1044Zr A01() {
        return this.A00.A8F(this);
    }

    public final InterfaceC03467k A02() {
        return this.A00.A6Y(this);
    }

    public final InterfaceC03487m A03() {
        return this.A00.A7J(this);
    }

    public final InterfaceC03497o A04() {
        return this.A00.A8E(this);
    }

    public final InterfaceC03507p A05() {
        return this.A00.A8U();
    }

    public final AnonymousClass80 A06() {
        return this.A00.A77(this);
    }

    public final C8D A07() {
        return this.A00.A79(this);
    }

    public final C03648h A08() {
        return this.A00.A8M();
    }

    public final J7 A09() {
        return this.A00.A6H(A01());
    }

    public final JJ A0A() {
        return this.A00.A8G(A01());
    }

    public final String A0B() {
        return this.A01.get();
    }

    public final void A0C(String str) {
        this.A01.set(str);
    }
}
