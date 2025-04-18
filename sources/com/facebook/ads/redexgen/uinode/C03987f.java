package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03987f extends ContextWrapper {
    public final InterfaceC03997h A00;
    public final AtomicReference<String> A01;

    public C03987f(Context context, InterfaceC03997h interfaceC03997h) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = interfaceC03997h;
    }

    public final InterfaceC03796g A00() {
        return this.A00.A6L();
    }

    public final C1069Ym A01() {
        return this.A00.A7r(this);
    }

    public final C7g A02() {
        return this.A00.A6A(this);
    }

    public final InterfaceC04007i A03() {
        return this.A00.A6v(this);
    }

    public final C7k A04() {
        return this.A00.A7q(this);
    }

    public final InterfaceC04027l A05() {
        return this.A00.A86();
    }

    public final InterfaceC04107w A06() {
        return this.A00.A6j(this);
    }

    public final AnonymousClass89 A07() {
        return this.A00.A6l(this);
    }

    public final C04168c A08() {
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
