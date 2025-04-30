package com.vungle.ads.internal.bidding;

import G7.j;
import a.AbstractC0325a;
import android.content.Context;
import c7.C0631h0;
import c7.s1;
import c7.v1;
import com.vungle.ads.C2137s;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.internal.F;
import com.vungle.ads.internal.network.y;
import com.vungle.ads.internal.util.h;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class e {
    public static final b Companion = new b(null);
    private static final int TOKEN_VERSION = 5;
    private final Context context;
    private long enterBackgroundTime;
    private final f8.b json;
    private int ordinalView;

    public e(Context context) {
        j.e(context, "context");
        this.context = context;
        this.json = R2.b.a(d.INSTANCE);
        h.Companion.addLifecycleListener(new a(this));
    }

    private final String bidTokenV5() {
        try {
            String constructV5Token$vungle_ads_release = constructV5Token$vungle_ads_release();
            u uVar = v.Companion;
            uVar.w("BidTokenEncoder", "BidToken: " + constructV5Token$vungle_ads_release);
            String convertForSending = s.INSTANCE.convertForSending(constructV5Token$vungle_ads_release);
            uVar.w("BidTokenEncoder", "After conversion: 5:" + convertForSending);
            return "5:" + convertForSending;
        } catch (Exception e4) {
            C2137s.INSTANCE.logError$vungle_ads_release(116, "Fail to gzip bidtoken " + e4.getLocalizedMessage(), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return null;
        }
    }

    /* renamed from: constructV5Token$lambda-0, reason: not valid java name */
    private static final y m37constructV5Token$lambda0(InterfaceC2717f interfaceC2717f) {
        return (y) interfaceC2717f.getValue();
    }

    public final String constructV5Token$vungle_ads_release() {
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        C0631h0 requestBody = m37constructV5Token$lambda0(AbstractC2712a.c(EnumC2718g.b, new c(this.context))).requestBody(!F.INSTANCE.signalsDisabled());
        v1 v1Var = new v1(requestBody.getDevice(), requestBody.getUser(), requestBody.getExt(), new s1(y.Companion.getHeaderUa()), this.ordinalView);
        f8.b bVar = this.json;
        return bVar.b(AbstractC0325a.q(bVar.b, G7.s.b(v1.class)), v1Var);
    }

    public final String encode() {
        this.ordinalView++;
        return bidTokenV5();
    }
}
