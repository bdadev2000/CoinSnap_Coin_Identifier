package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class VC implements LG {
    public static byte[] A01;
    public static String[] A02 = {"RKj", "", "UN15gotjq8", "ajoBiEUEQKFJNLqm", "ifgUnXqkKiJSPGKzKRtyUVwCV1ynqJ", "MgNPOwYKG3krpOkrgoqalUsb7GIlLECG", "4d5pH5OlBXd1RidH0kkNXmSukCNaNWUQ", "ZdfTYbLhRFsUmKvgir0oysIbzYx0fUOP"};
    public final /* synthetic */ VA A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -7, -21, -23, -7, -29};
    }

    static {
        A01();
    }

    public VC(VA va) {
        this.A00 = va;
    }

    public /* synthetic */ VC(VA va, VH vh) {
        this(va);
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ABb() {
        boolean z2;
        boolean A0V;
        this.A00.A0a.setToolbarActionMessage(A00(0, 0, 19));
        this.A00.A0I();
        z2 = this.A00.A0X;
        if (z2) {
            A0V = this.A00.A0V();
            String[] strArr = A02;
            if (strArr[5].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            A02[4] = "QDC88FCswtzFK8CArK72WEL9jXMBl5";
            if (A0V) {
                this.A00.A0a.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0a.setToolbarActionMode(0);
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ADF(float f2) {
        boolean z2;
        C01901b c01901b;
        boolean z3;
        AbstractC1187cD abstractC1187cD;
        float A03;
        AbstractC1187cD abstractC1187cD2;
        AbstractC1187cD abstractC1187cD3;
        boolean z4;
        AbstractC1187cD abstractC1187cD4;
        boolean z5;
        AbstractC1187cD abstractC1187cD5;
        this.A00.A0O((int) f2);
        z2 = this.A00.A0Y;
        if (!z2) {
            c01901b = this.A00.A0J;
            this.A00.A0a.setProgress(100.0f * (1.0f - (f2 / c01901b.A07())));
            return;
        }
        z3 = this.A00.A0E;
        if (z3) {
            abstractC1187cD4 = this.A00.A0I;
            if (A02[6].charAt(27) != 'a') {
                throw new RuntimeException();
            }
            A02[4] = "3MuDy2E798EtOoHK0e0a3SiH1QgAy5";
            A03 = 1.0f - (f2 / abstractC1187cD4.A1P().A0E().A02());
            z5 = this.A00.A0H;
            if (z5 || A03 < 1.0f) {
                this.A00.A0H = false;
                abstractC1187cD5 = this.A00.A0I;
                this.A00.A0a.setToolbarActionMessage(abstractC1187cD5.A1T().A02().replace(A00(0, 6, Opcodes.LNEG), String.valueOf((int) f2)));
            } else {
                this.A00.A0H = true;
                MQ mq = this.A00.A0a;
                String A00 = A00(0, 0, 19);
                if (A02[3].length() != 16) {
                    mq.setToolbarActionMessage(A00);
                } else {
                    String[] strArr = A02;
                    strArr[5] = "wpbUz5ctYXHuYyRf6fVCU3uRzsMt7dE8";
                    strArr[7] = "BBfRd69Z77LUH69GeqVAIKhho7h2fuMA";
                    mq.setToolbarActionMessage(A00);
                }
            }
        } else {
            abstractC1187cD = this.A00.A0I;
            A03 = 1.0f - (f2 / abstractC1187cD.A1P().A0E().A03());
        }
        this.A00.A0a.setProgress(100.0f * A03);
        abstractC1187cD2 = this.A00.A0I;
        float A022 = abstractC1187cD2.A1P().A0E().A02() - f2;
        abstractC1187cD3 = this.A00.A0I;
        float percentageOfReward = abstractC1187cD3.A1P().A0E().A03();
        boolean z6 = A022 >= percentageOfReward;
        z4 = this.A00.A0H;
        if (!z4 && z6) {
            this.A00.A0a.setToolbarActionMode(1);
        }
    }
}
