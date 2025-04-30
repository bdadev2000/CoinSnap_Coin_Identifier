package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1764bU extends KT {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C08070w A00;
    public final /* synthetic */ String A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            int i13 = (copyOfRange[i12] - i11) - 47;
            if (A03[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            copyOfRange[i12] = (byte) i13;
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

    public C1764bU(C08070w c08070w, String str) {
        this.A00 = c08070w;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C09647f c09647f;
        C09647f c09647f2;
        CountDownLatch countDownLatch;
        C08060v c08060v;
        C08060v c08060v2;
        C08060v c08060v3;
        boolean A0J;
        C08060v c08060v4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c08060v = this.A00.A02;
            synchronized (c08060v) {
                c08060v2 = this.A00.A02;
                Iterator<String> keys = c08060v2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C08070w c08070w = this.A00;
                        c08060v4 = c08070w.A02;
                        c08070w.A0E((C1T) c08060v4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                c08060v3 = this.A00.A02;
                c08060v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e4) {
            c09647f2 = this.A00.A03;
            AnonymousClass89 A07 = c09647f2.A07();
            String encryptedId = A00(0, 17, 8);
            A07.A9a(encryptedId, C8A.A1B, new C8B(e4));
        } catch (JSONException e9) {
            this.A00.A0M();
            c09647f = this.A00.A03;
            AnonymousClass89 A072 = c09647f.A07();
            String encryptedId2 = A00(0, 17, 8);
            A072.A9a(encryptedId2, C8A.A1A, new C8B(e9));
        }
    }
}
