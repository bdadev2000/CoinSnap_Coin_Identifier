package com.instagram.common.viewpoint.core;

import com.safedk.android.internal.d;

/* renamed from: com.facebook.ads.redexgen.X.Su, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0869Su extends AbstractC03808x<C9R> {
    public static String[] A01 = {"Xm4oO1fgaoMOjj45N8r00LATVp4gHrYG", "MO5WiyOQHdAIBAUWSCIdsXDipyRYP8jB", "8ZD7midsUGLLHTawsvmUwyHXKE63ocNK", "eXsxAyUW", "", "KTVY2IhXiCn688zdyYvQYy9fTV", "AuZpLEz4ubgydEKdqdaVeIvdhtRZUWrW", "O3ESmZOEeO27LGblO6LyKeoijHa02l1o"};
    public final /* synthetic */ C9S A00;

    public C0869Su(C9S c9s) {
        this.A00 = c9s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C9R c9r) {
        int A00 = c9r.A00();
        int duration = c9r.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && A00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = A00 + d.f29936c;
        if (duration < currentPosition3) {
            if (duration == 0) {
                C9S c9s = this.A00;
                int currentPosition4 = this.A00.A00;
                c9s.A0i(currentPosition4);
                return;
            }
            this.A00.A0i(duration);
            return;
        }
        C9S c9s2 = this.A00;
        String[] strArr = A01;
        String str = strArr[7];
        String str2 = strArr[0];
        int duration2 = str.charAt(6);
        int currentPosition5 = str2.charAt(6);
        if (duration2 == currentPosition5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "eYEuq0G9XeIp1YNIhTPdTiyuyz";
        strArr2[3] = "ZD2QUH1g";
        c9s2.A0i(A00);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    public final Class<C9R> A01() {
        return C9R.class;
    }
}
