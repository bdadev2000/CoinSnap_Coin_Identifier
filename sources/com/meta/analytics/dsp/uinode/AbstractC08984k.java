package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08984k {
    public static byte[] A06;
    public static String[] A07 = {"wCFFy4v0UHolBGzubHhtaTK0KlaK5TU8", "WXL", "veTi", "n3", "rW28yUWMMTgiQlEcIz6smwE3e87Fn5Ax", "QU5acghFPGL2KQJts4swUt9W5A9MK8iM", "qIZlYUWuFA6tmX766BSANKSPkXlWbMWT", "RhPzJuizv3JTUr3AZhw4zLdz5ZpO"};
    public InterfaceC08964i A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{85, 84, 123, 84, 83, 87, 91, 78, 83, 85, 84, 73, 124, 83, 84, 83, 73, 82, 95, 94};
    }

    public abstract boolean A0D(AnonymousClass56 anonymousClass56);

    public abstract boolean A0E(AnonymousClass56 anonymousClass56, C08974j c08974j, C08974j c08974j2);

    public abstract boolean A0F(AnonymousClass56 anonymousClass56, C08974j c08974j, C08974j c08974j2);

    public abstract boolean A0G(AnonymousClass56 anonymousClass56, C08974j c08974j, C08974j c08974j2);

    public abstract boolean A0H(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, C08974j c08974j, C08974j c08974j2);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(AnonymousClass56 anonymousClass56);

    public abstract boolean A0L();

    static {
        A03();
    }

    public static int A00(AnonymousClass56 anonymousClass56) {
        int i9;
        i9 = anonymousClass56.A0C;
        int i10 = i9 & 14;
        if (anonymousClass56.A0Z()) {
            return 4;
        }
        int flags = i10 & 4;
        if (flags == 0) {
            int A0J = anonymousClass56.A0J();
            int A0G = anonymousClass56.A0G();
            String[] strArr = A07;
            String str = strArr[3];
            String str2 = strArr[1];
            int oldPos = str.length();
            int flags2 = str2.length();
            if (oldPos == flags2) {
                throw new RuntimeException();
            }
            A07[0] = "z6mPnscAmNwlAliMzxZ9cFQDVALsWjfG";
            if (A0J != -1 && A0G != -1 && A0J != A0G) {
                return i10 | 2048;
            }
            return i10;
        }
        return i10;
    }

    private final C08974j A01() {
        return new C08974j();
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        return this.A01;
    }

    public final long A06() {
        return this.A02;
    }

    public final long A07() {
        return this.A03;
    }

    public final C08974j A08(AnonymousClass53 anonymousClass53, AnonymousClass56 anonymousClass56) {
        return A01().A01(anonymousClass56);
    }

    public final C08974j A09(AnonymousClass53 anonymousClass53, AnonymousClass56 anonymousClass56, int i9, List<Object> payloads) {
        return A01().A01(anonymousClass56);
    }

    public final void A0A() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A02(0, 20, 16));
        }
        this.A05.clear();
    }

    public final void A0B(InterfaceC08964i interfaceC08964i) {
        this.A04 = interfaceC08964i;
    }

    public final void A0C(AnonymousClass56 anonymousClass56) {
        InterfaceC08964i interfaceC08964i = this.A04;
        if (interfaceC08964i != null) {
            interfaceC08964i.AAj(anonymousClass56);
        }
    }

    public boolean A0M(AnonymousClass56 anonymousClass56, List<Object> payloads) {
        return A0D(anonymousClass56);
    }
}
