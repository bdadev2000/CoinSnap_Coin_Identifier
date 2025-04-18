package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1146bY implements AnonymousClass22 {
    public static byte[] A0A;
    public static final String A0B;
    public long A02;
    public RewardedVideoAd A03;
    public C1E A04;
    public C0527Fe A05;
    public final C1045Zs A07;
    public final S2SRewardedVideoAdExtendedListener A08;
    public final C1136bO A09;
    public int A00 = 0;
    public boolean A06 = false;
    public long A01 = -1;

    public static String A09(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0A = new byte[]{116, -95, 83, -108, -105, 83, -97, -94, -108, -105, 83, -100, -90, 83, -108, -97, -91, -104, -108, -105, -84, 83, -100, -95, 83, -93, -91, -94, -102, -91, -104, -90, -90, 97, 83, -116, -94, -88, 83, -90, -101, -94, -88, -97, -105, 83, -86, -108, -100, -89, 83, -103, -94, -91, 83, -108, -105, Byte.MAX_VALUE, -94, -108, -105, -104, -105, 91, 92, 83, -89, -94, 83, -107, -104, 83, -106, -108, -97, -97, -104, -105, -60, -15, -15, -18, -15, -97, -21, -18, -32, -29, -24, -19, -26, -97, -15, -28, -10, -32, -15, -29, -28, -29, -97, -11, -24, -29, -28, -18, -97, -32, -29, -19, -4, -11};
    }

    static {
        A0A();
        A0B = C1146bY.class.getSimpleName();
    }

    public C1146bY(C1136bO c1136bO, C2I c2i, String str) {
        this.A09 = c1136bO;
        this.A07 = c1136bO.A0B;
        this.A08 = new C1133bL(str, c2i, this, c1136bO);
    }

    private void A0C(String str, AdExperienceType adExperienceType, boolean z2) {
        String extraHints;
        if (!this.A06 && this.A05 != null) {
            Log.w(A0B, A09(0, 78, 37));
        }
        A0D(false);
        this.A06 = false;
        C02081t c02081t = new C02081t(this.A09.A0D, EnumC0629Jl.A07, AdPlacementType.REWARDED_VIDEO, EnumC0627Jj.A08, 1, this.A09.A0C);
        c02081t.A08(z2);
        if (C0608Im.A2T(this.A07) && (extraHints = L6.A02(this.A07, this.A09.A06)) != null) {
            this.A09.A06 = extraHints;
        }
        c02081t.A06(this.A09.A06);
        c02081t.A07(this.A09.A07);
        this.A05 = new C0527Fe(this.A09.A0B, c02081t);
        this.A05.A0R(new C1148ba(this));
        this.A05.A0W(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z2) {
        if (this.A05 != null) {
            this.A05.A0R(new C1147bZ(this));
            this.A05.A0X(z2);
            this.A05.A0J();
            this.A05 = null;
        }
    }

    public final long A0F() {
        if (this.A05 != null) {
            return this.A05.A0F();
        }
        return -1L;
    }

    public final C1136bO A0G() {
        return this.A09;
    }

    public final C1045Zs A0H() {
        return this.A07;
    }

    public final void A0I(RewardData rewardData) {
        this.A09.A03 = rewardData;
        if (this.A06 && this.A05 != null) {
            this.A05.A0Z(rewardData);
        }
    }

    public final void A0J(String str, AdExperienceType adExperienceType, boolean z2) {
        this.A01 = System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z2);
        } catch (Exception e) {
            Log.e(A0B, A09(78, 31, Opcodes.LREM), e);
            this.A09.A0B.A07().AA0(A09(109, 3, 126), C8E.A0b, new C8F(e));
            AdError internalError = AdError.internalError(AdError.INTERNAL_ERROR_2004);
            this.A09.A0B.A0E().A38(C0687Lu.A01(this.A01), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A08.onError(this.A09.A6E(), internalError);
        }
    }

    public final boolean A0K() {
        return this.A05 == null || this.A05.A0Y();
    }

    public final boolean A0L() {
        return this.A06;
    }

    public final boolean A0M(int i2, long j2) {
        if (!this.A06) {
            this.A08.onError(this.A09.A6E(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A08.A02(i2);
            this.A05.A08.A03(j2);
            this.A05.A0L();
            this.A06 = false;
            return true;
        }
        this.A06 = false;
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass22
    public final void destroy() {
        A0D(true);
    }
}
