package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Iv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1237Iv implements AudienceNetworkExportedActivityApi {
    public static byte[] A01;
    public static String[] A02 = {"lqcZKkXS6TgOyt76sZ5yjVO68Nd1QdQN", "bQWyI3suGbnh3U5StjCALiPIzXDV3Wa6", "hqk98641WxUvYLytASVEQqAqBzewRvKz", "WJUhx8cI8X6XmYecnMlLMKWkuLUkkXH9", "MP1e4gCZR", "1EPuqCSCyQ9J2YoomIIpPWX0Nb9xTOcz", "0suERcaSwAa0E2CxcbYZCTLc9cS16", "2TigNonfP4HCMPOeSAXXuXDynNOGBzuQ"};
    public final Activity A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {126, 121, 99, 104, 101, 97, 104, 118, 103, 103, 104, 120, 101, 126, 114, 121, 99, 118, 99, 126, 120, 121, 104, 124, 114, 110, 61, 58, 60, 49, 47, 42, 49, 39, 42, 49, 37, 43, 55};
        if (A02[2].charAt(23) != 'q') {
            throw new RuntimeException();
        }
        A02[2] = "wLiEtUSufX2SvKxRiuuw2ghqe6rTYyXA";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1237Iv(Activity activity) {
        this.A00 = activity;
    }

    private void A02(int i9) {
        this.A00.setResult(i9);
        this.A00.finish();
    }

    private boolean A03(C1236Iu c1236Iu) {
        String callingPackage = this.A00.getCallingPackage();
        if (callingPackage != null) {
            String callingPackage2 = c1236Iu.A03;
            if (callingPackage.equals(callingPackage2)) {
                return true;
            }
        }
        A02(12);
        if (c1236Iu.A00 instanceof C1701aT) {
            ((C1701aT) c1236Iu.A00).A0F().A0E().AEj();
        }
        if (c1236Iu.A00 instanceof C1698aQ) {
            ((C1698aQ) c1236Iu.A00).A0H().A0E().AEj();
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi
    public final void onCreate(Bundle bundle) {
        C1636Yn A05 = C09155c.A05(this.A00, UUID.randomUUID().toString());
        if (this.A00.isTaskRoot()) {
            A05.A0E().AEc();
            A02(10);
            return;
        }
        String adId = this.A00.getIntent().getStringExtra(A00(26, 13, 15));
        if (adId == null) {
            A05.A0E().AEf();
            A02(11);
            return;
        }
        C1236Iu A04 = VW.A00().A04(adId);
        AnonymousClass23 anonymousClass23 = A04 != null ? A04.A00 : null;
        if (A02[6].length() == 29) {
            A02[6] = "3hvfYctBGPg0BeMvR8jiqRXkEjCpv";
            if (A04 != null && (anonymousClass23 instanceof C1698aQ)) {
                if (!A03(A04)) {
                    return;
                }
                C1698aQ c1698aQ = (C1698aQ) anonymousClass23;
                c1698aQ.A0G().A02().A0I(this.A00);
                c1698aQ.A0M(this.A00.getIntent().getIntExtra(A00(0, 26, 86), -1), 0L);
            } else {
                if (A04 != null) {
                    boolean z8 = anonymousClass23 instanceof C1701aT;
                    if (A02[1].charAt(21) == 'i') {
                        A02[2] = "XUW1n7Q8abvbP2RLETYRfIyqCZkI4d7q";
                        if (z8) {
                            if (!A03(A04)) {
                                return;
                            }
                            C1701aT c1701aT = (C1701aT) anonymousClass23;
                            c1701aT.A0E().A05().A0I(this.A00);
                            c1701aT.A0J();
                        }
                    }
                }
                A05.A0E().AF5();
                A02(13);
                return;
            }
            this.A00.setResult(-1);
            this.A00.finish();
            return;
        }
        throw new RuntimeException();
    }
}
