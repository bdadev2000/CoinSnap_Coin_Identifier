package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class ZT implements InterfaceC03497o {
    public static byte[] A01;
    public final C7j A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, 25, 15, 29, 26, 20, 15};
    }

    public ZT(C7j c7j) {
        this.A00 = c7j;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03497o
    public final String A6c() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03497o
    public final String A7R() {
        return KE.A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03497o
    public final String A7S() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03497o
    public final String A7n() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03497o
    public final String A7t() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03497o
    public final C7n A8D() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new ZU(this, advertisingIdInfoDirectly);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03497o
    public final String A8d() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03497o
    public final String A8f() {
        return A00(0, 7, Opcodes.FREM);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03497o
    public final String A8g() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03497o
    public final boolean A9O() {
        return BuildConfigApi.isDebug();
    }
}
