package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08070w {
    public static C08070w A08;
    public static byte[] A09;
    public static String[] A0A = {"TOlR5WIHpQxnCrBDCJGIvboS5c1GP2eb", "1A072KPTjzB", "BhIKZU0mEosMUOfZes2VT64q11XJ2Uhn", "3eQHzZddeWPmYl0bNsvnb2WjxREMTE8a", "x", "3ukMDhdDleVgfGP2GHVzNRiRwZbG92ZS", "tXOxwX9vQ8QECIpzr41AiGeD6LbiHgO3", "feL0RS1gsJrC9VyxtC"};
    public static final String A0B;
    public boolean A01;
    public final C09647f A03;
    public final String A04;
    public final Executor A07;
    public final CountDownLatch A05 = new CountDownLatch(1);
    public final CountDownLatch A06 = new CountDownLatch(1);
    public final C08060v A02 = new C08060v();
    public String A00 = null;

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 69);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {114, 115, 97, 10, Ascii.US, 65, 68, 83, 99, 65, 80, 80, 73, 78, 71, 105, 78, 70, 79, Ascii.SO, 84, 88, 84, 1, 3, Ascii.DC2, Ascii.DC2, 7, 6, 35, 6, 17, 76, Ascii.SYN, Ascii.SUB, Ascii.SYN, 37, 49, 38, 50, 54, 38, 45, 32, 58, Ascii.FS, 32, 34, 51, 51, 42, 45, 36};
        if (A0A[0].charAt(25) == 's') {
            throw new RuntimeException();
        }
        A0A[6] = "ekiMbk44dvQ4iEpOly1MsU0Tkyq5eij5";
        A09 = bArr;
    }

    static {
        A09();
        A0B = C08070w.class.getSimpleName();
    }

    public C08070w(C09647f c09647f, boolean z8, Executor executor, String str) {
        this.A03 = c09647f.A01();
        this.A04 = str;
        this.A07 = executor;
        if (z8) {
            A0A();
        }
    }

    public static synchronized C08070w A01(C09647f c09647f) {
        C08070w c08070w;
        synchronized (C08070w.class) {
            if (A08 == null) {
                A08 = new C08070w(c09647f, true, ExecutorC1308Lt.A06, A03(0, 0, 103));
            }
            c08070w = A08;
        }
        return c08070w;
    }

    private String A04(String str) {
        String A03 = A03(0, 0, 103);
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                if (file.exists() && file.length() > 0) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] data = new byte[(int) file.length()];
                    fileInputStream.read(data);
                    fileInputStream.close();
                    String fileContent = A03(0, 5, 98);
                    A03 = new String(data, fileContent);
                }
            }
        } catch (FileNotFoundException e4) {
            this.A03.A07().A9a(A03(36, 17, 6), C8A.A17, new C8B(e4));
        } catch (IOException e9) {
            this.A03.A07().A9a(A03(36, 17, 6), C8A.A19, new C8B(e9));
        }
        return A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        String A03 = A03(36, 17, 6);
        try {
            this.A02.A08(A04(this.A04 + A03(23, 13, 39)));
            this.A02.A0A(A04(A03(5, 18, 101)));
        } catch (C8B e4) {
            A0M();
            this.A03.A07().A9a(A03, C8A.A18, e4);
        } catch (JSONException e9) {
            A0M();
            this.A03.A07().A9a(A03, C8A.A1A, new C8B(e9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        String adsFrequencyCappingDataList;
        synchronized (this.A02) {
            adsFrequencyCappingDataList = this.A02.A05().toString();
        }
        A0G(A0K(), adsFrequencyCappingDataList);
    }

    private final void A0A() {
        this.A07.execute(new C1766bW(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E(C1T c1t, String str, boolean z8) {
        c1t.A07(z8);
        if (c1t.A08() || c1t.A09()) {
            this.A02.A07(str);
        } else {
            this.A02.A09(str);
        }
    }

    private void A0F(String str) {
        File file = new File(this.A03.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    private final synchronized void A0G(String str, String str2) {
        A0H(this.A04 + A03(23, 13, 39), str.getBytes());
        A0H(A03(5, 18, 101), str2.getBytes());
    }

    private void A0H(String str, byte[] bArr) {
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                FileOutputStream fout = new FileOutputStream(file);
                fout.write(bArr);
                fout.close();
            }
        } catch (FileNotFoundException e4) {
            this.A03.A07().A9a(A03(36, 17, 6), C8A.A17, new C8B(e4));
        } catch (IOException e9) {
            this.A03.A07().A9a(A03(36, 17, 6), C8A.A19, new C8B(e9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(String str) {
        boolean z8 = false;
        try {
            synchronized (this.A02) {
                z8 = this.A02.A05().get(str) instanceof C1T;
            }
        } catch (JSONException e4) {
            this.A03.A07().A9a(A03(36, 17, 6), C8A.A1A, new C8B(e4));
        }
        return z8;
    }

    public final String A0K() {
        return this.A02.A04();
    }

    public final void A0L() {
        if (!this.A01 || this.A00 == null) {
            return;
        }
        this.A07.execute(new C1763bT(this, this.A00));
    }

    public final synchronized void A0M() {
        A0F(this.A04 + A03(5, 18, 101));
        A0F(this.A04 + A03(23, 13, 39));
    }

    public final void A0N(String str) {
        if (!this.A01) {
            return;
        }
        this.A00 = str;
        this.A07.execute(new C1764bU(this, str));
    }

    public final void A0O(JSONObject jSONObject) {
        boolean A13 = C1225Ih.A13(this.A03);
        this.A01 = A13;
        if (!A13) {
            return;
        }
        this.A07.execute(new C1765bV(this, jSONObject));
    }
}
