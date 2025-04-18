package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Fj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0532Fj extends AbstractC1168bu {
    public static byte[] A03;
    public long A00;
    public View A01;
    public C0515Ei A02;

    static {
        A05();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public C0532Fj(C0515Ei c0515Ei, C02081t c02081t) {
        super(c0515Ei, c02081t);
        this.A00 = 10000L;
        this.A02 = c0515Ei;
    }

    private C1171bx A01(Runnable runnable) {
        return new C1171bx(this, runnable);
    }

    private List<JSONObject> A04(C02091u c02091u) {
        ArrayList arrayList = new ArrayList();
        JSONObject A032 = c02091u.A03();
        if (A032.has(A03(22, 12, 71))) {
            try {
                this.A00 = A032.getJSONObject(r1).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = A032.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i2 = 0; i2 < adsArray.length(); i2++) {
                        arrayList.add((JSONObject) adsArray.get(i2));
                    }
                }
            } catch (JSONException unused) {
                String A033 = A03(36, 38, 101);
                this.A02.A0E().A5F(C0625Jg.A01(AdErrorType.UNKNOWN_ERROR, A033).A03().getErrorCode(), A033);
                return arrayList;
            }
        } else {
            arrayList.add(A032);
        }
        return arrayList;
    }

    private void A06(InterfaceC1215cf interfaceC1215cf, JSONObject jSONObject, C8X c8x) {
        this.A0C = false;
        C1170bw c1170bw = new C1170bw(this, interfaceC1215cf, LV.A02(jSONObject, A03(34, 2, Opcodes.FREM)));
        A0G().postDelayed(c1170bw, c8x.A05());
        interfaceC1215cf.A9p(this.A02, this.A09, this.A08.A08, A01(c1170bw), jSONObject, c8x);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1168bu
    public final void A0O() {
        if (this.A01 != null) {
            this.A02.A0E().A4K();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0E().A4L();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1168bu
    public final void A0Q(InterfaceC01780p interfaceC01780p, C8W c8w, C8U c8u, final C02091u c02091u) {
        this.A02.A0E().A4E();
        final InterfaceC1215cf interfaceC1215cf = (InterfaceC1215cf) interfaceC01780p;
        if (interfaceC1215cf.AH5()) {
            final List<JSONObject> A04 = A04(c02091u);
            A06(interfaceC1215cf, A04.get(0), c02091u.A01());
            if (A04.size() > 1) {
                A0G().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.1v
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0532Fj.this.A0Z(interfaceC1215cf, A04, c02091u);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC1215cf, c02091u.A03(), c02091u.A01());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1168bu
    public final void A0T(String str) {
        this.A02.A0E().A4J(str != null);
        super.A0T(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1168bu
    public final void A0X(boolean z2) {
        super.A0X(z2);
        this.A01 = null;
    }

    public final /* synthetic */ void A0Z(InterfaceC1215cf interfaceC1215cf, List list, C02091u c02091u) {
        A06(interfaceC1215cf, (JSONObject) list.get(1), c02091u.A01());
    }
}
