package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class GK implements InterfaceC1215cf {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public InterfaceC01860x A01;
    public C01870y A02;
    public C1194cK A03;
    public C1192cI A04;
    public C0515Ei A05;
    public InterfaceC0704Ml A06;
    public C0705Mm A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(C0515Ei c0515Ei, C1192cI c1192cI, C03226f c03226f, InterfaceC01860x interfaceC01860x, C0705Mm c0705Mm) {
        String A6r = c1192cI.A6r();
        if (!TextUtils.isEmpty(A6r)) {
            c03226f.A0d(new JF(A6r, c0515Ei.A09()));
        }
        JU A0F = c1192cI.A0F();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (A0F != null) {
            C03206d c03206d = new C03206d(c1192cI.A0F().getUrl(), c1192cI.A0F().getHeight(), c1192cI.A0F().getWidth(), c1192cI.A0Y(), A03(2, 16, 120));
            c03206d.A00 = new C6l(false, -1, -1);
            c03226f.A0V();
            c03226f.A0b(c03206d);
        }
        if (c1192cI.A0E() != null) {
            c03226f.A0b(new C03206d(c1192cI.A0E().getUrl(), c1192cI.A0E().getHeight(), c1192cI.A0E().getWidth(), c1192cI.A0Y(), A03(2, 16, 120)));
        }
        String A0b = c1192cI.A0b();
        if (A0b != null && !TextUtils.isEmpty(A0b)) {
            c03226f.A0a(new C03186b(A0b, c1192cI.A0Y(), A03(2, 16, 120), c1192cI.A0A()));
        }
        C1206cW c1206cW = new C1206cW(this, c0705Mm, interfaceC01860x, c0515Ei);
        String A0Y = c1192cI.A0Y();
        String clientToken2 = A03(2, 16, 120);
        c03226f.A0W(c1206cW, new C6Y(A0Y, clientToken2));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01780p
    public final String A6r() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A6r();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01780p
    public final AdPlacementType A82() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1215cf
    public final void A9p(C0515Ei c0515Ei, J7 j7, EnumC0627Jj enumC0627Jj, InterfaceC01860x interfaceC01860x, JSONObject jSONObject, C8X c8x) {
        c0515Ei.A0E().A43();
        this.A05 = c0515Ei;
        this.A01 = interfaceC01860x;
        C03226f c03226f = new C03226f(c0515Ei);
        this.A00 = System.currentTimeMillis();
        C1192cI A00 = AnonymousClass16.A00(c0515Ei, jSONObject, LV.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = A00;
        if (!AbstractC01750l.A06(c0515Ei, A00, j7)) {
            InterfaceC0704Ml adViewListener = new C1208cY(this, c0515Ei);
            this.A06 = adViewListener;
            C0705Mm c0705Mm = new C0705Mm(c0515Ei, j7, c03226f, new WeakReference(adViewListener), c8x.A04(), c8x.A07(), c8x.A08(), c8x.A09(), A00, this.A08);
            this.A07 = c0705Mm;
            this.A03 = new C1194cK(c0515Ei, new C1207cX(this, c0515Ei, interfaceC01860x), c0705Mm.getViewabilityChecker(), j7, A00);
            A05(c0515Ei, A00, c03226f, interfaceC01860x, c0705Mm);
            this.A02 = new C01870y(c0515Ei, this.A08, this, interfaceC01860x);
            this.A02.A02();
            return;
        }
        c0515Ei.A0E().A4g();
        interfaceC01860x.ACN(this, C0625Jg.A00(AdErrorType.NO_FILL));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01780p
    public final boolean AH5() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01780p
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC1229ct A0E = this.A05.A0E();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            A0E.A41(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        C01870y c01870y = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (c01870y != null) {
            this.A02.A03();
        }
    }
}
