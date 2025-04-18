package com.facebook.ads.redexgen.uinode;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class VT implements J1 {
    public static byte[] A0D;
    public static String[] A0E = {"uc0mqsrp7zbVSSUmEXyUZJQCGufws", "8g6ahr3vPydrTtk22", "YNqtB8iJmO2uVaHpbt6P5K9KH1grqDjF", "oDfi3coiS1yTvP0yt", "tbJDZpprNJoNbXk4MBqAl5O83qYFAo", "QKETic0g2MOurTT1w7cfpFQ", "PRNEoz9kKM8OadepDD5IPPYNQZFvnMHX", "tq93tXY5KQrS9ibGckbvCktGGZhVZKfr"};
    public static final String A0F;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final ConnectivityManager A04;
    public final C1069Ym A06;
    public final J0 A07;
    public final RK A08;
    public volatile boolean A0C;
    public final Runnable A0A = new VV(this);
    public final Runnable A09 = new VU(this);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-39, -22, -48, -44, -73, -36, -26, -29, -44, -25, -42, -37, -36, -31, -38, -109, -40, -23, -40, -31, -25, -109, -101, -45, 6, -15, -13, -2, 2, -9, -3, -4, -82, 5, -10, -9, -6, -13, -82, -14, -9, 1, -2, -17, 2, -15, -10, -9, -4, -11, -82, -13, 4, -13, -4, 2, 1, -68, -28, -10, 3, 7, -10, 3, -79, 1, 3, 0, -12, -10, 4, 4, -10, -11, -79, 1, -14, 3, 5, -6, -14, -3, -79, -13, -14, 5, -12, -7, -67, -79, -12, 0, -1, 5, -6, -1, 6, -6, -1, -8, -79, 5, 0, -79, -1, -10, 9, 5, -79, 0, -1, -10, -65, Ascii.ESC, 45, 58, 62, 45, 58, -24, 58, 45, 59, 56, 55, 54, 59, 45, -24, 49, 59, -24, 45, 53, 56, 60, 65, -10, -17, 1, Ascii.SO, Ascii.DC2, 1, Ascii.SO, -68, Ascii.SO, 1, Ascii.DLE, 17, Ascii.SO, 10, 1, 0, -68, -3, -68, 10, Ascii.VT, 10, -55, Ascii.SI, 17, -1, -1, 1, Ascii.SI, Ascii.SI, 2, 17, 8, -68, Ascii.SI, Ascii.DLE, -3, Ascii.DLE, 17, Ascii.SI, -68, -1, Ascii.VT, 0, 1, -68, Ascii.VT, 2, -68, -61, -43, -30, -26, -43, -30, -112, -25, -47, -29, -112, -27, -34, -47, -46, -36, -43, -112, -28, -33, -112, -32, -30, -33, -45, -43, -29, -29, -112, -47, -36, -36, -112, -43, -26, -43, -34, -28, -29, -100, -112, -28, -30, -23, -39, -34, -41, -112, -47, -41, -47, -39, -34, -98, -17, 7, 5, Ascii.FF, Ascii.FF, 5, 10, 3, -68, 0, 5, Ascii.SI, Ascii.FF, -3, Ascii.DLE, -1, 4, -68, 0, 17, 1, -68, Ascii.DLE, Ascii.VT, -68, 8, -3, -1, 7, -68, Ascii.VT, 2, -68, -1, Ascii.VT, 10, 10, 1, -1, Ascii.DLE, 5, Ascii.DC2, 5, Ascii.DLE, Ascii.NAK, -54, -31, -12, -12, -27, -19, -16, -12, -59, -47, -48, -48, -57, -59, -42, -53, -40, -53, -42, -37, 47, 44, 63, 44, -22, -5, -22, -13, -7, -8, 36, Ascii.NAK, 45, 32, 35, Ascii.NAK, Ascii.CAN};
    }

    static {
        A07();
        A0F = J1.class.getSimpleName();
    }

    public VT(C1069Ym c1069Ym, J0 j02) {
        this.A07 = j02;
        this.A06 = c1069Ym;
        this.A04 = (ConnectivityManager) c1069Ym.getSystemService(A03(293, 12, 10));
        this.A08 = C0881Rc.A01(c1069Ym);
        this.A03 = Ij.A0K(c1069Ym);
        this.A02 = Ij.A0J(c1069Ym);
    }

    public static /* synthetic */ int A00(VT vt) {
        int i10 = vt.A00 + 1;
        vt.A00 = i10;
        return i10;
    }

    private void A05() {
        this.A06.A04().A8z();
        this.A00 = 0;
        this.A01 = 0L;
        if (this.A0B.getQueue().size() == 0) {
            this.A07.AAi();
        }
    }

    private void A06() {
        if (this.A00 >= Ij.A09(this.A06)) {
            A05();
            A5B();
        } else {
            if (this.A00 == 1) {
                this.A01 = Ij.A0I(this.A06);
            } else {
                this.A01 *= 2;
            }
            A5C();
        }
    }

    private void A08(long j3) {
        this.A05.postDelayed(this.A09, j3);
    }

    private void A09(JSONObject jSONObject) throws JSONException {
        Map<String, String> shortEvnData = this.A06.A03().A4n();
        for (Map.Entry<String, String> entry : shortEvnData.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }

    public final void A0B() {
        try {
            NetworkInfo activeNetwork = this.A04.getActiveNetworkInfo();
            if (activeNetwork == null || !activeNetwork.isConnectedOrConnecting()) {
                if (this.A06.A04().A8z()) {
                    Log.e(A0F, A03(PsExtractor.VIDEO_STREAM_MASK, 46, 68));
                }
                A08(this.A02);
                return;
            }
            this.A06.A04().A8z();
            JSONObject A4a = this.A07.A4a();
            if (A4a == null) {
                this.A06.A04().A8z();
                A05();
                return;
            }
            boolean A8z = this.A06.A04().A8z();
            String A03 = A03(309, 6, 45);
            if (A8z && A4a.has(A03)) {
                JSONArray jSONArray = A4a.getJSONArray(A03);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String str = A03(4, 19, 27) + i10 + A03(0, 3, 88) + jSONArray.get(i10);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(286, 7, 40), String.valueOf(this.A00));
            A09(jSONObject);
            A4a.put(A03(305, 4, 115), jSONObject);
            RY ry = new RY();
            ry.put(A03(315, 7, 92), A4a.toString());
            RJ ADz = this.A08.ADz(this.A06.A04().A73(), ry.A08());
            String A69 = ADz != null ? ADz.A69() : null;
            if (!TextUtils.isEmpty(A69) && ADz != null) {
                if (ADz.A83() != 200) {
                    if (this.A06.A04().A8z()) {
                        String responseBody = A0F;
                        Log.e(responseBody, A03(138, 48, 68) + ADz.A83() + A03(3, 1, 78));
                    }
                    int A83 = ADz.A83();
                    if (A0E[4].length() != 29) {
                        String[] strArr = A0E;
                        strArr[1] = "880m74azdbQx5kAj6";
                        strArr[3] = "QSHShLBOeb5hWYBY9";
                        if (A83 == 413 && C0659Ih.A22(this.A06)) {
                            this.A07.ACo();
                            A05();
                            return;
                        } else {
                            if (A4a.has(A03)) {
                                this.A07.ABI(A4a.getJSONArray(A03));
                            }
                            A06();
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                if (!this.A07.ABJ(new JSONArray(A69))) {
                    if (this.A06.A04().A8z()) {
                        Log.w(A0F, A03(186, 54, 24));
                    }
                    A06();
                    return;
                } else {
                    if (this.A07.A9A()) {
                        if (this.A06.A04().A8z()) {
                            Log.i(A0F, A03(58, 55, 57));
                        }
                        A06();
                        return;
                    }
                    A05();
                    return;
                }
            }
            if (this.A06.A04().A8z()) {
                Log.e(A0F, A03(113, 25, 112));
            }
            if (C0659Ih.A1t(this.A06) && A4a.has(A03)) {
                this.A07.ABI(A4a.getJSONArray(A03));
            }
            A06();
        } catch (Exception e2) {
            if (this.A06.A04().A8z()) {
                Log.e(A0F, A03(23, 35, 54), e2);
            }
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.J1
    public final void A5B() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.J1
    public final void A5C() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}
