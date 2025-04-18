package com.facebook.ads.redexgen.uinode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.1A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1A extends BroadcastReceiver {
    public static byte[] A03;
    public static String[] A04 = {"X1IVw5mZrPwWgp59pDL9aLZ3Fov3W2Wm", "N1AsLxATz8LfRIPBbwS0prqi9bKFNGwZ", "KvfN8PD7zJtQDsMeVTqT5dRzLvhiPQFs", "CwJ4sBopjGul5sxVyPsrv7O0APgi12j8", "riYYfsMk5nddhbnpPSj9znzkTr5bDpPf", "Be1xHvNUMQ0R9QZ", "t7JwnvsmbbV8km6q46", "oSYhwD14tF3vT8zAS1lFRiV2H2FAfEUD"};
    public Context A00;
    public C0490Ba A01;
    public boolean A02 = false;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.EM, 3, Ascii.SI, Ascii.CR, 78, 6, 1, 3, 5, 2, Ascii.SI, Ascii.SI, Ascii.VT, 78, 1, 4, 19, 78, 9, Ascii.SO, Ascii.DC4, 5, Ascii.DC2, 19, Ascii.DC4, 9, Ascii.DC4, 9, 1, Ascii.FF, 78, 4, 9, 19, Ascii.DLE, Ascii.FF, 1, Ascii.EM, 5, 4, 19, Ascii.US, Ascii.GS, 94, Ascii.SYN, 17, 19, Ascii.NAK, Ascii.DC2, Ascii.US, Ascii.US, Ascii.ESC, 94, 17, Ascii.DC4, 3, 94, Ascii.EM, Ascii.RS, 4, Ascii.NAK, 2, 3, 4, Ascii.EM, 4, Ascii.EM, 17, Ascii.FS, 94, Ascii.DC4, Ascii.EM, 3, 0, Ascii.FS, 17, 9, Ascii.NAK, Ascii.DC4, 74, Ascii.DC2, 1, Ascii.DC2, Ascii.EM, 3, 81, 68, 83, 71, 78, 83, 76, 98, 85, 64, 98, 77, 72, 66, 74, 83, 70, 81, 69, 76, 81, 78, 96, 87, 66, 96, 79, 74, 64, 72, Ascii.EM, 45, 50, 63, 62, 52, Ascii.DC2, 53, 47, 62, 41, 40, 47, 50, 47, 58, 55, Ascii.RS, 45, 62, 53, 47, 2, Ascii.GS, Ascii.DLE, 17, Ascii.ESC, Base64.padSymbol, Ascii.SUB, 0, 17, 6, 7, 0, Ascii.GS, 0, Ascii.NAK, Ascii.CAN, 49, 2, 17, Ascii.SUB, 0, 78};
    }

    static {
        A01();
    }

    public C1A(C0490Ba c0490Ba, Context context) {
        this.A01 = c0490Ba;
        this.A00 = context;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(40, 40, 17) + this.A01.getUniqueId());
        intentFilter.addAction(A00(137, 22, 21) + this.A01.getUniqueId());
        intentFilter.addAction(A00(100, 16, 66) + this.A01.getUniqueId());
        C02852o.A00(this.A00).A06(this, intentFilter);
    }

    public final void A03() {
        try {
            C02852o.A00(this.A00).A05(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String action2 = A00(0, 1, 66);
        String[] split = action.split(action2);
        if (split.length != 2) {
            return;
        }
        String str = split[1];
        String action3 = this.A01.getUniqueId();
        if (!str.equals(action3)) {
            return;
        }
        String str2 = split[0];
        String action4 = A00(1, 39, 1);
        if (str2.equals(action4)) {
            if (this.A01.getListener() != null) {
                this.A01.getListener().ABP();
                this.A01.getListener().ADi();
                return;
            }
            return;
        }
        String str3 = split[0];
        String[] split2 = A04;
        if (split2[2].charAt(17) != 'T') {
            throw new RuntimeException();
        }
        A04[7] = "czH1g8WXqBVBzZgoSLVA20jYFFcQLh15";
        String action5 = A00(116, 21, 58);
        if (str3.equals(action5)) {
            String action6 = A00(80, 5, 22);
            Serializable serializableExtra = intent.getSerializableExtra(action6);
            if (serializableExtra instanceof C0766Mr) {
                if (this.A01.getListener() != null) {
                    this.A01.getListener().ABV();
                    this.A01.getListener().ADi();
                }
                if (this.A02) {
                    this.A01.A0Y(1);
                } else {
                    this.A01.A0Y(((C0766Mr) serializableExtra).A01());
                }
                this.A01.setVisibility(0);
                this.A01.A0b(QM.A04, 1);
                return;
            }
            if (serializableExtra instanceof C0837Pk) {
                if (this.A01.getListener() == null) {
                    return;
                }
                MP listener = this.A01.getListener();
                String[] split3 = A04;
                if (split3[4].charAt(15) != 'p') {
                    throw new RuntimeException();
                }
                A04[0] = "WizhEabCQfIhxCPZxjxQrLo8096TZ2te";
                listener.ABc();
                return;
            }
            if (serializableExtra instanceof P5) {
                if (this.A01.getListener() == null) {
                    return;
                }
                this.A01.getListener().ABe();
                return;
            }
            if (serializableExtra instanceof C9H) {
                if (this.A01.getListener() != null) {
                    this.A01.getListener().AB8();
                }
                this.A02 = true;
                return;
            }
            if (serializableExtra instanceof O8) {
                if (this.A01.getListener() != null) {
                    MP listener2 = this.A01.getListener();
                    String[] split4 = A04;
                    String action7 = split4[5];
                    if (action7.length() != 15) {
                        A04[5] = "OhpiyJuLhpOH2Z5";
                        listener2.ACY();
                    } else {
                        A04[1] = "rjxpcIZarLCWG40Y5u8euDt94bevKfNO";
                        listener2.ACY();
                    }
                }
                this.A02 = false;
                return;
            }
            if (!(serializableExtra instanceof AnonymousClass98) || this.A01.getListener() == null) {
                return;
            }
            this.A01.getListener().onPause();
            return;
        }
        String str4 = split[0];
        String action8 = A00(85, 15, 64);
        if (!str4.equals(action8)) {
            return;
        }
        this.A01.A0m();
    }
}
