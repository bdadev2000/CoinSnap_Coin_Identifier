package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5S */
/* loaded from: assets/audience_network.dex */
public class C5S {
    public static byte[] A04;
    public final Intent A00;
    public final C5V A01;
    public final C1636Yn A02;
    public final J2 A03;

    static {
        A0T();
    }

    public static String A0S(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0T() {
        A04 = new byte[]{Ascii.DEL, 99, Ascii.GS, Ascii.CAN, 35, Ascii.CAN, Ascii.GS, 8, Ascii.GS, 35, Ascii.RS, 9, Ascii.DC2, Ascii.CAN, Ascii.DLE, Ascii.EM, 88, 90, 87, 87, 94, 73, 111, 66, 75, 94, 80, 91, 82, 90, 93, 86, 87, 114, 87, 119, 82, 71, 82, 113, 70, 93, 87, 95, 86, 0, Ascii.SI, 10, Ascii.DC2, 3, Ascii.DC4, 3, 2, 57, 5, 10, Ascii.SI, 5, Ascii.CR, 57, 2, 3, 10, 7, Ascii.US, 57, Ascii.VT, Ascii.NAK, 52, 59, 46, 51, 44, 63, Ascii.ESC, 62, Ascii.RS, 59, 46, 59, Ascii.CAN, 47, 52, 62, 54, 63, Ascii.SYN, 1, 19, 5, Ascii.SYN, 0, 1, 0, 50, Ascii.CR, 0, 1, Ascii.VT, 37, 0, 32, 5, Ascii.DLE, 5, 38, 17, 10, 0, 8, 1, 79, 80, 93, 92, 86, 102, 77, 80, 84, 92, 102, 73, 86, 85, 85, 80, 87, 94, 102, 80, 87, 77, 92, 75, 79, 88, 85};
    }

    public C5S(C5V c5v, Intent intent, J2 j22, C1636Yn c1636Yn) {
        this.A01 = c5v;
        this.A00 = intent;
        this.A03 = j22;
        this.A02 = c1636Yn;
    }

    public /* synthetic */ C5S(C5V c5v, Intent intent, J2 j22, C1636Yn c1636Yn, C5R c5r) {
        this(c5v, intent, j22, c1636Yn);
    }

    private FU A00() {
        return (FU) this.A00.getSerializableExtra(A0S(2, 14, 51));
    }

    public MD A02() {
        if (C1225Ih.A2N(this.A02)) {
            String stringExtra = this.A00.getStringExtra(A0S(45, 23, 41));
            C5V c5v = this.A01;
            C1636Yn c1636Yn = this.A02;
            J2 j22 = this.A03;
            ZW zw = new ZW(c5v, null);
            Intent intent = this.A00;
            String clickDelayMs = A0S(16, 10, 116);
            String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0S(0, 2, 29);
            }
            return new ViewOnClickListenerC1064Bi(c5v, c1636Yn, j22, zw, stringExtra2, Integer.parseInt(stringExtra));
        }
        C5V c5v2 = this.A01;
        return new UT(c5v2, this.A02, this.A03, new ZW(c5v2, null));
    }

    public UD A0G() {
        return new UD(this.A02, this.A03, new ZW(this.A01, null), A00(), null, new U9());
    }

    public UD A0H() {
        FS fs = (FS) this.A00.getSerializableExtra(A0S(86, 25, 43));
        return new UD(this.A02, this.A03, new C1118Ea(this.A01, null), fs, fs.A0T(), new U8());
    }

    public UA A0I(RelativeLayout relativeLayout) {
        UA ua = new UA(this.A02, new ZV(this), this.A03, new ZW(this.A01, null));
        ua.A05(relativeLayout);
        ua.A04(this.A00.getIntExtra(A0S(111, 27, 118), 200));
        AbstractC1303Lo.A0M(relativeLayout, ViewCompat.MEASURED_STATE_MASK);
        return ua;
    }

    public B3 A0J() {
        return new B3(this.A02, this.A03, new ZW(this.A01, null), A00(), new U9(), 1);
    }

    public B3 A0K() {
        return new B3(this.A02, this.A03, new ZW(this.A01, null), (FS) this.A00.getSerializableExtra(A0S(86, 25, 43)), new U8(), 0);
    }

    public TI A0L() {
        PB A02;
        AbstractC1739b5 abstractC1739b5 = (AbstractC1739b5) this.A00.getSerializableExtra(A0S(68, 18, 21));
        if (abstractC1739b5 == null || (A02 = PC.A02(abstractC1739b5.A0S())) == null) {
            return null;
        }
        return new TI(this.A02, new ZW(this.A01, null), A02, abstractC1739b5.A12());
    }

    public C1485So A0M(KB kb) {
        InterfaceC1324Mj u8;
        MC c1118Ea;
        C1737b3 c1737b3 = (C1737b3) this.A00.getSerializableExtra(A0S(26, 19, 124));
        if (kb == KB.A04) {
            u8 = new U9();
            c1118Ea = new ZW(this.A01, null);
        } else {
            u8 = new U8();
            c1118Ea = new C1118Ea(this.A01, null);
        }
        return new C1485So(this.A02, u8, this.A03, c1737b3, new C09416c(this.A02), c1118Ea);
    }

    public C9Y A0N() {
        return new C9Y(this.A02, new U9(), this.A03, A00(), new C09416c(this.A02), new ZW(this.A01, null));
    }

    public C9Q A0O() {
        return new C9Q(this.A02, new U9(), this.A03, A00(), new C09416c(this.A02), new ZW(this.A01, null));
    }

    public C9Q A0P() {
        return new C9Q(this.A02, new U8(), this.A03, (FS) this.A00.getSerializableExtra(A0S(86, 25, 43)), new C09416c(this.A02), new C1118Ea(this.A01, null));
    }

    public C9P A0Q() {
        String str;
        FU A00 = A00();
        str = this.A01.A0C;
        A00.A0Z(str);
        return new C9P(this.A02, this.A03, new C09416c(this.A02), new ZW(this.A01, null), A00);
    }

    public C9P A0R() {
        String str;
        FS fs = (FS) this.A00.getSerializableExtra(A0S(86, 25, 43));
        str = this.A01.A0C;
        fs.A0Z(str);
        return new C9P(this.A02, this.A03, new C09416c(this.A02), new ZW(this.A01, null), fs);
    }

    public final UC A0U() {
        return new UC(this.A02, this.A01);
    }
}
