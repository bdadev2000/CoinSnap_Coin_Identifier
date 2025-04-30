package com.meta.analytics.dsp.uinode;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Re, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC1449Re extends AsyncTask<String, Void, C1450Rf> {
    public static byte[] A05;
    public static String[] A06 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A07;
    public static final Set<String> A08;
    public C09647f A00;
    public RJ A01;
    public InterfaceC1448Rd A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final C1450Rf A00(String... strArr) {
        if (KL.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String A02 = A02(str);
                Map<String, String> map = this.A03;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        A02 = A03(A02, entry.getKey(), entry.getValue());
                    }
                }
                int i9 = 1;
                while (true) {
                    int i10 = i9 + 1;
                    if (i9 > 2) {
                        return null;
                    }
                    if (A06(A02)) {
                        return new C1450Rf(this.A01);
                    }
                    i9 = i10;
                }
            }
            return null;
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, Ascii.SYN, Ascii.SYN, Ascii.VT, Ascii.SYN, 68, Ascii.VT, Ascii.DC4, 1, 10, Ascii.CR, 10, 3, 68, 17, Ascii.SYN, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    static {
        A04();
        A07 = AsyncTaskC1449Re.class.getSimpleName();
        HashSet hashSet = new HashSet();
        A08 = hashSet;
        hashSet.add(A01(0, 1, 73));
        hashSet.add(A01(29, 4, 24));
    }

    public AsyncTaskC1449Re(C09647f c09647f) {
        this(c09647f, null, null);
    }

    public AsyncTaskC1449Re(C09647f c09647f, Map<String, String> extraData) {
        this(c09647f, extraData, null);
    }

    public AsyncTaskC1449Re(C09647f c09647f, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = c09647f;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), LJ.A01(this.A00.A03().A61()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 92);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 124);
        }
        StringBuilder append = new StringBuilder().append(str).append(A01).append(str2);
        String prepend = A01(2, 1, 100);
        StringBuilder append2 = append.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return append2.append(prepend2).toString();
    }

    private final void A05(C1450Rf response) {
        if (KL.A02(this)) {
            return;
        }
        try {
            InterfaceC1448Rd interfaceC1448Rd = this.A02;
            if (interfaceC1448Rd != null) {
                interfaceC1448Rd.AEC(response);
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    private boolean A06(String str) {
        RJ ADy;
        RK A00 = C1447Rc.A00(this.A00);
        try {
            Map<String, String> map = this.A04;
            if (map == null || map.size() == 0) {
                ADy = A00.ADy(str, new RY());
            } else {
                RY params = new RY();
                params.A05(this.A04);
                ADy = A00.ADz(str, params.A08());
            }
            this.A01 = ADy;
        } catch (Exception e4) {
            Log.e(A07, A01(4, 19, 62) + str, e4);
        }
        RJ rj = this.A01;
        String[] strArr = A06;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A06[2] = "iiLT70HajwBiOF9fGWlLisdNhF1wiwwV";
        return rj != null && rj.A83() == 200;
    }

    public final void A07(InterfaceC1448Rd interfaceC1448Rd) {
        this.A02 = interfaceC1448Rd;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C1450Rf doInBackground(String[] strArr) {
        if (KL.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        InterfaceC1448Rd interfaceC1448Rd = this.A02;
        if (interfaceC1448Rd != null) {
            interfaceC1448Rd.AEA();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C1450Rf c1450Rf) {
        if (KL.A02(this)) {
            return;
        }
        try {
            A05(c1450Rf);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            KL.A00(th, this);
        }
    }
}
