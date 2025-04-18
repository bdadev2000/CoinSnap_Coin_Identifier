package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class V7 implements MS {
    public static byte[] A0D;
    public int A00;
    public TC A01;
    public C9S A02;
    public String A03;
    public final C1045Zs A04;
    public final J7 A05;
    public final MR A06;
    public final N4 A07;
    public final T7 A08;
    public final AbstractC0836Rn A0C = new C0447Bp(this);
    public final AbstractC0852Sd A0B = new C0446Bo(this);
    public final AbstractC0858Sj A09 = new C0445Bn(this);
    public final AbstractC0856Sh A0A = new C0444Bm(this);

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, 57, 34, 61, 33, 44, 52, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, 20, 18, 4, 47, 0, 21, 8, 23, 4, 34, 21, 0, 35, 20, 21, 21, 14, 15, 55, 40, 37, 36, 46, 8, 47, 53, 36, 51, 50, 53, 40, 53, 32, 45, 4, 55, 36, 47, 53, 81, 78, 67, 66, 72, 107, 72, 64, 64, 66, 85, 116, 107, 102, 103, 109, 79, 82, 70, 103, 120, 117, 116, 126, 66, 116, 116, 122, 69, 120, 124, 116, Utf8.REPLACEMENT_BYTE, 32, 45, 44, 38, 28, 27, 5};
    }

    public V7(C1045Zs c1045Zs, N4 n4, J7 j7, MR mr) {
        this.A04 = c1045Zs;
        this.A05 = j7;
        this.A07 = n4;
        this.A08 = new T7(c1045Zs);
        this.A08.A0c(new C8S(c1045Zs));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = mr;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        mr.A3q(this.A08, layoutParams);
        MZ closeButton = new MZ(c1045Zs);
        closeButton.setOnClickListener(new N2(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        mr.A3q(closeButton, params);
    }

    public final void A04(int i2) {
        this.A08.setVideoProgressReportIntervalMs(i2);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        String ctaText = A02(8, 11, 127);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            QI qi = new QI(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i2 = (int) (16.0f * LP.A02);
            layoutParams.setMargins(i2, i2, i2, i2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            qi.setOnClickListener(new N3(this));
            this.A06.A3q(qi, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, Opcodes.DNEG), 0);
        this.A02 = new C9S(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (C0608Im.A1q(this.A04)) {
            this.A01 = new TC(this.A04, this.A05, this.A08, this.A03, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0Y(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0b(EnumC0815Qs.A04, 17);
        }
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void ACz(boolean z2) {
        this.A06.A4Q(A02(37, 21, 39), new C0854Sf());
        this.A08.A0W();
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void ADN(boolean z2) {
        this.A06.A4Q(A02(37, 21, 39), new C0853Se());
        if (!this.A08.A0k()) {
            this.A08.A0b(EnumC0815Qs.A04, 18);
        }
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void onDestroy() {
        this.A06.A4Q(A02(37, 21, 39), new R6(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0i(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A06();
        }
        this.A08.A0Z(1);
        this.A08.A0V();
    }
}
