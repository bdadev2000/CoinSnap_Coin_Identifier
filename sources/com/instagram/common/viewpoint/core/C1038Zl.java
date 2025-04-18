package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Zl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1038Zl implements AnonymousClass80 {
    public static byte[] A04;
    public Context A00;
    public final InterfaceC03577z A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C03567x A01 = A00();

    static {
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{113, 101, 122, 106, 102, 112, 97, 97, 124, 123, 114, 102, 106, 126, 112, 108};
    }

    public C1038Zl(Context context, InterfaceC03577z interfaceC03577z) {
        this.A00 = context;
        this.A02 = interfaceC03577z;
    }

    private C03567x A00() {
        return C03567x.A00(KJ.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    private void A02() {
        this.A02.AAq(new C1039Zm(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C03567x c03567x = new C03567x(strArr, num, num2);
        C03567x newSettings = this.A01;
        if (c03567x.equals(newSettings)) {
            return;
        }
        this.A01 = c03567x;
        this.A03.set(true);
        SharedPreferences.Editor edit = KJ.A00(this.A00).edit();
        C03567x newSettings2 = this.A01;
        edit.putString(A01(0, 16, 100), newSettings2.A07()).apply();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass80
    public final C03567x A76() {
        A02();
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass80
    public final boolean A9e() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> A0Y = C0608Im.A0Y(this.A00);
        String identifier = this.A01.A07();
        Iterator<String> it = A0Y.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass80
    public final boolean AGj() {
        A02();
        return this.A03.getAndSet(false);
    }
}
