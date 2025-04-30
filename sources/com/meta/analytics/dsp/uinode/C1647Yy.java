package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1647Yy implements AnonymousClass66 {
    public static byte[] A03;
    public static String[] A04 = {"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    public final InterfaceC1454Rj A01;
    public Set<AnonymousClass69> A00 = new HashSet();
    public final List<AnonymousClass68> A02 = new ArrayList();

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, Ascii.VT, -46, -72, -67, Ascii.VT, 41, 59, 59, 45, 60, 59};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.A9C()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<AnonymousClass69> A01 = A01(this.A01.A6h());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            Iterator<AnonymousClass68> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A3d();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (AnonymousClass69 anonymousClass69 : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), anonymousClass69.A8D(), anonymousClass69.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C1647Yy(InterfaceC1201Hj interfaceC1201Hj) {
        InterfaceC1454Rj A4i = interfaceC1201Hj.A4i(EnumC1455Rk.A0B);
        this.A01 = A4i;
        A4i.A3R(new C1648Yz(this));
        A03();
    }

    public static Set<AnonymousClass69> A01(JSONObject jSONObject) {
        C1646Yx A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (optJSONArray == null) {
            return null;
        }
        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
            if (optJSONObject == null || (A00 = C1646Yx.A00(optJSONObject)) == null) {
                return null;
            }
            hashSet.add(A00);
            if (A04[1].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass66
    public final void A3P(AnonymousClass68 anonymousClass68) {
        this.A02.add(anonymousClass68);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass66
    public final synchronized Set<AnonymousClass69> A62() {
        return new HashSet(this.A00);
    }
}
