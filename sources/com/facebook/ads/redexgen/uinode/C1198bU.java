package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1198bU extends KT {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C02410w A00;
    public final /* synthetic */ String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 47;
            if (A03[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A03[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        A03[3] = "LuOw";
        A02 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    static {
        A02();
    }

    public C1198bU(C02410w c02410w, String str) {
        this.A00 = c02410w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C03987f c03987f;
        C03987f c03987f2;
        CountDownLatch countDownLatch;
        C02400v c02400v;
        C02400v c02400v2;
        C02400v c02400v3;
        boolean A0J;
        C02400v c02400v4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c02400v = this.A00.A02;
            synchronized (c02400v) {
                c02400v2 = this.A00.A02;
                Iterator<String> keys = c02400v2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C02410w c02410w = this.A00;
                        c02400v4 = c02410w.A02;
                        c02410w.A0E((C1T) c02400v4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                c02400v3 = this.A00.A02;
                c02400v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e2) {
            c03987f2 = this.A00.A03;
            AnonymousClass89 A07 = c03987f2.A07();
            String encryptedId = A00(0, 17, 8);
            A07.A9a(encryptedId, C8A.A1B, new C8B(e2));
        } catch (JSONException e10) {
            this.A00.A0M();
            c03987f = this.A00.A03;
            AnonymousClass89 A072 = c03987f.A07();
            String encryptedId2 = A00(0, 17, 8);
            A072.A9a(encryptedId2, C8A.A1A, new C8B(e10));
        }
    }
}
