package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1156bi implements C2I {
    public static byte[] A06;
    public final AnonymousClass20 A00;
    public final AnonymousClass27 A01;
    public final C1045Zs A02;
    public final Handler A03;
    public final String A04;
    public final C2C A05;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 70);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-104, -85, -92, -102, -94, -101, -75, -101, -82, -86, -88, -105, -87, -75, -95, -101, -81, -25, -20, -14, -3, -29, -16, -16, -19, -16, -3, -31, -19, -30, -29, -3, -23, -29, -9, -6, -5, -7, 6, -24, -21, 6, -16, -21, 6, -14, -20, 0, 21, 22, 20, 33, 7, 20, 20, 17, 20, 33, 15, 7, 21, 21, 3, 9, 7, 33, 13, 7, 27};
    }

    public abstract void A08();

    public abstract void A09();

    public AbstractC1156bi(C1045Zs c1045Zs, String str, C2D c2d) {
        this.A02 = c1045Zs;
        this.A04 = str;
        DynamicLoaderFactory.makeLoader(this.A02).getInitApi().onAdLoadInvoked(this.A02);
        this.A00 = new C1159bl(c1045Zs, this);
        this.A01 = new AnonymousClass27(c1045Zs, this);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A05 = c2d.A52(this.A00, this, this.A01);
    }

    public final AnonymousClass20 A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A04;
    }

    public final void A05() {
        if (this.A01.A01) {
            this.A02.A0E().AFI();
            A06();
        } else {
            this.A02.A0E().AFA();
            this.A01.A02 = true;
            this.A01.A0E(AbstractC0610Ip.A02.get());
        }
    }

    public final void A06() {
        this.A02.A0E().AFN();
        if (!this.A01.A0F(this.A05.A7h(), this.A05.A50(this.A04))) {
            A09();
            this.A02.A0E().AFG();
        }
    }

    public final void A07() {
        if (!C0608Im.A0r(this.A02)) {
            return;
        }
        ExecutorC0690Lx.A00(new C1157bj(this));
    }

    public final void A0A(int i2) {
        this.A01.A0D(this.A02, i2);
    }

    public final void A0B(int i2, AdErrorType adErrorType, String str) {
        Bundle bundle = new Bundle();
        String A01 = A01(48, 21, 124);
        if (str != null) {
            bundle.putString(A01, str);
        } else {
            bundle.putString(A01, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A01(17, 18, 88), adErrorType.getErrorCode());
        ACk(i2, this.A04, bundle);
    }

    public final void A0C(Message message) {
        this.A05.A8u(message);
    }

    @Override // com.instagram.common.viewpoint.core.C2I
    public final void ACk(int i2, String str, Bundle bundle) {
        Message obtain = Message.obtain((Handler) null, i2);
        obtain.getData().putString(A01(35, 13, 97), str);
        if (bundle != null) {
            obtain.getData().putBundle(A01(0, 17, 16), bundle);
        }
        Runnable callbackApiRunnable = new C1158bk(this, obtain);
        this.A03.post(callbackApiRunnable);
    }
}
