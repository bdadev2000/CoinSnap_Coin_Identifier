package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1720am implements K3 {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C08050u A0G = null;
    public static final K4 A0H = null;
    public static final String A0I;
    public InterfaceC08000p A00;
    public InterfaceC08000p A01;
    public C8S A04;
    public K1 A05;
    public AbstractC08010q A06;
    public final C08311u A07;
    public final J2 A08;
    public final C08050u A09;
    public final K4 A0A;
    public final C1636Yn A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, Ascii.DEL, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 39, 108, 103, 110, 102, 97, 47, 97, 96, 123, 47, 99, 96, 110, 107, 106, 107, 38, 57, Ascii.FS, Ascii.EM, 8, Ascii.FF, Ascii.GS, 10, 88, 17, Ascii.VT, 88, Ascii.SYN, Ascii.CR, Ascii.DC4, Ascii.DC4, 88, 80, Ascii.ESC, Ascii.DLE, Ascii.EM, 17, Ascii.SYN, Ascii.GS, Ascii.FS, 81, 45, 8, Ascii.CR, Ascii.FS, Ascii.CAN, 9, Ascii.RS, 76, 5, Ascii.US, 76, 2, Ascii.EM, 0, 0, 76, 68, 2, 3, 76, Ascii.SI, 4, Ascii.CR, 5, 2, 69, 78, 107, 110, Ascii.DEL, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 5, 36, 107, 38, 36, 57, 46, 107, 42, 47, 107, 40, 42, 37, 47, 34, 47, 42, 63, 46, 56, 101, 122, 95, 66, 67, 74, Ascii.CR, 76, 73, 76, 93, 89, 72, 95, Ascii.CR, 89, 84, 93, 72, 3, 46, 43, 111, 46, 35, 61, 42, 46, 43, 54, 111, 60, 59, 46, 61, 59, 42, 43, 94, 91, 76, 52, 37, 60, Ascii.SUB, 17, Ascii.CAN, Ascii.DLE, Ascii.ETB, 38, 9, Ascii.CAN, Ascii.VT, Ascii.CAN, Ascii.DC4, 10, 76, 91, 74, 79, 90, 79, 97, 76, 68, 75, 77, 90, Ascii.SO, 71, 93, Ascii.SO, 64, 91, 66, 66, 38, 45, 32, 49, 58, 51, 55, 38, 39, Ascii.FS, 42, 39, 122, 113, 105, 118, 109, 112, 113, 114, 122, 113, 107, 63, 118, 108, 63, 122, 114, 111, 107, 102, 38, 50, 37, 49, 53, 37, 46, 35, 57, Ascii.US, 35, 33, 48, 48, 41, 46, 39, Ascii.FS, Ascii.ESC, 3, Ascii.DC4, Ascii.EM, Ascii.FS, 17, 85, 5, Ascii.EM, Ascii.DC4, Ascii.SYN, Ascii.DLE, Ascii.CAN, Ascii.DLE, Ascii.ESC, 1, 85, Ascii.FS, Ascii.ESC, 85, 7, Ascii.DLE, 6, 5, Ascii.SUB, Ascii.ESC, 6, Ascii.DLE, 10, 9, 7, 2, 57, Ascii.DC2, Ascii.SI, Ascii.VT, 3, 57, Ascii.VT, Ascii.NAK, 44, 59, 47, 43, 59, 45, 42, 1, 55, 58};
    }

    public abstract void A0M();

    public abstract void A0O(InterfaceC08000p interfaceC08000p, C8S c8s, C8Q c8q, C08321v c08321v);

    static {
        A08();
        AbstractC1305Lq.A02();
        A0I = AbstractC1720am.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC1720am(C1636Yn c1636Yn, C08311u c08311u) {
        this.A0B = c1636Yn;
        this.A07 = c08311u;
        K4 k42 = A0H;
        if (k42 != null) {
            this.A0A = k42;
        } else {
            this.A0A = new K4(c1636Yn);
        }
        this.A0A.A0P(this);
        C08050u c08050u = A0G;
        if (c08050u != null) {
            this.A09 = c08050u;
        } else {
            this.A09 = new C08050u();
        }
        DynamicLoaderFactory.makeLoader(c1636Yn).getInitApi().onAdLoadInvoked(c1636Yn);
        this.A08 = c1636Yn.A09();
        c1636Yn.A0E().A4r();
    }

    private void A09(C1538Up c1538Up) {
        C8S placement = c1538Up.A00();
        if (placement == null || placement.A05() == null) {
            String A07 = A07(279, 29, 125);
            C1242Jb error = new C1242Jb(AdErrorType.NO_AD_PLACEMENT, A07);
            this.A0B.A0E().A4t(error.A03().getErrorCode(), A07);
            AbstractC08010q abstractC08010q = this.A06;
            if (abstractC08010q != null) {
                abstractC08010q.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C8S c8s = this.A04;
        JSONObject A09 = c8s.A09();
        String A072 = A07(195, 3, 93);
        if (A09 == null) {
            C8Q A04 = c8s.A04();
            if (!A0D(c8s, A04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().A9a(A072, C8A.A0a, new C8B(A07(81, 26, 100), A04.A02()));
                ABR(C1242Jb.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C08321v loadConfig = new C08321v(A04.A04(), c8s.A05(), this.A07.A0A, c8s.A05().A0C());
            A0O(this.A00, c8s, A04, loadConfig);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C8Q A042 = c8s.A04();
        do {
            if (arrayList.isEmpty()) {
                if (A0D(c8s, A042)) {
                    arrayList.add(A042);
                } else {
                    return;
                }
            } else if (A0C(A042)) {
                arrayList.add(A042);
            }
            A042 = c8s.A04();
        } while (A042 != null);
        if (this.A00 == null) {
            this.A0B.A07().A9a(A072, C8A.A0a, new C8B(A07(56, 25, 112), ((C8Q) arrayList.get(0)).A02()));
            ABR(C1242Jb.A00(AdErrorType.INTERNAL_ERROR));
            return;
        }
        boolean loaded = false;
        try {
            if (arrayList.size() > 1 && this.A00.AGd()) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C8Q) it.next()).A04());
                }
                jSONObject.put(A07(PsExtractor.AUDIO_STREAM, 3, 55), jSONArray);
                jSONObject.put(A07(198, 12, 113), c8s.A09());
                C08321v loadConfig2 = new C08321v(jSONObject, c8s.A05(), this.A07.A0A, c8s.A05().A0C());
                A0O(this.A00, c8s, A042, loadConfig2);
                loaded = true;
            }
        } catch (Exception unused) {
            loaded = false;
        }
        if (!loaded) {
            if (arrayList.isEmpty()) {
                C1242Jb A01 = C1242Jb.A01(AdErrorType.NO_FILL, A07(0, 0, 73));
                this.A0B.A0E().A4t(A01.A03().getErrorCode(), A07(133, 22, 67));
                AbstractC08010q abstractC08010q2 = this.A06;
                if (abstractC08010q2 != null) {
                    abstractC08010q2.A0G(A01);
                    return;
                }
                return;
            }
            InterfaceC08000p interfaceC08000p = this.A00;
            String[] strArr = A0E;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "F2ixlBYVHNYJB4bAHADqJrSynawwg1yM";
            strArr2[5] = "djkwyiiWLTaQwWMcVWQWfq0o8Ww2Jgo9";
            if (interfaceC08000p == null) {
                this.A0B.A07().A9a(A072, C8A.A0a, new C8B(A07(22, 34, 7), ((C8Q) arrayList.get(0)).A02()));
                ABR(C1242Jb.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C8Q c8q = (C8Q) arrayList.get(0);
            C08321v loadConfig3 = new C08321v(c8q.A04(), c8s.A05(), this.A07.A0A, c8s.A05().A0C());
            A0O(this.A00, c8s, c8q, loadConfig3);
        }
    }

    private final void A0A(String str, AdExperienceType adExperienceType) {
        this.A0B.A0E().A4u(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            ABR(new C1242Jb(AdErrorType.API_NOT_SUPPORTED, A07(0, 0, 73)));
            return;
        }
        try {
            C1251Jl bidPayload = new C1251Jl(this.A0B, str, this.A07.A0A, this.A07.A09);
            K1 A01 = this.A07.A01(this.A0B, bidPayload, adExperienceType);
            this.A05 = A01;
            this.A0A.A0O(A01);
        } catch (C1243Jc e4) {
            C1242Jb A02 = C1242Jb.A02(e4);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            ABR(A02);
        }
    }

    private void A0B(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 75));
            C08070w.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0C(C8Q c8q) {
        return (c8q == null || c8q.A04() == null) ? false : true;
    }

    private boolean A0D(C8S c8s, C8Q c8q) {
        String A07 = A07(0, 0, 73);
        if (c8q == null) {
            C1242Jb A01 = C1242Jb.A01(AdErrorType.NO_FILL, A07);
            this.A0B.A0E().A4t(A01.A03().getErrorCode(), A07(133, 22, 67));
            AbstractC08010q abstractC08010q = this.A06;
            if (abstractC08010q != null) {
                abstractC08010q.A0G(A01);
            }
            return false;
        }
        String A02 = c8q.A02();
        InterfaceC08000p A00 = this.A09.A00(this.A0B, c8s.A05().A0D());
        if (A00 == null) {
            this.A0B.A07().A9a(A07(195, 3, 93), C8A.A0a, new C8B(A07(0, 22, 2), A02));
            ABR(C1242Jb.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (this.A07.A00() != A00.A7e()) {
            C1242Jb A012 = C1242Jb.A01(AdErrorType.INTERNAL_ERROR, A07);
            this.A0B.A0E().A4t(A012.A03().getErrorCode(), A07(155, 19, 37));
            AbstractC08010q abstractC08010q2 = this.A06;
            if (abstractC08010q2 != null) {
                abstractC08010q2.A0G(A012);
            }
            return false;
        }
        this.A00 = A00;
        String[] strArr = A0E;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[0] = "MKxF4EMWgzzLH5X7HNcHVA2i4zdAiZz9";
        strArr2[5] = "4tfdEW2uI31voJBW941pIR5b1aNGKiQe";
        JSONObject dataObject = c8q.A04();
        if (dataObject != null) {
            String adapterName = dataObject.optString(A07(320, 10, 86));
            this.A0B.A0E().AGD(adapterName);
            this.A0B.A0C(adapterName);
            C1635Ym A002 = AbstractC09637e.A00();
            if (A002 != null) {
                A002.A0C(adapterName);
            }
            A0B(dataObject.optJSONObject(A07(262, 17, 72)));
            if (this.A05 == null) {
                String A072 = A07(242, 20, 23);
                C1242Jb A013 = C1242Jb.A01(AdErrorType.UNKNOWN_ERROR, A072);
                this.A0B.A0E().A4t(A013.A03().getErrorCode(), A072);
                AbstractC08010q abstractC08010q3 = this.A06;
                if (abstractC08010q3 != null) {
                    abstractC08010q3.A0G(A013);
                }
                return false;
            }
            return true;
        }
        String A073 = A07(212, 18, 38);
        C1242Jb A014 = C1242Jb.A01(AdErrorType.UNKNOWN_ERROR, A073);
        this.A0B.A0E().A4t(A014.A03().getErrorCode(), A073);
        AbstractC08010q abstractC08010q4 = this.A06;
        if (abstractC08010q4 != null) {
            abstractC08010q4.A0G(A014);
        }
        return false;
    }

    public final long A0E() {
        C8S c8s = this.A04;
        if (c8s != null) {
            return c8s.A03();
        }
        return -1L;
    }

    public final Handler A0F() {
        return A0F;
    }

    public C1F A0G() {
        return ((AbstractC1743b9) this.A01).A0H();
    }

    public final C8T A0H() {
        C8S c8s = this.A04;
        if (c8s == null) {
            return null;
        }
        return c8s.A05();
    }

    public final void A0I() {
        String A6T;
        this.A0B.A0E().A2q(C1294Lf.A01(this.A03));
        InterfaceC08000p interfaceC08000p = this.A01;
        if (interfaceC08000p == null || (A6T = interfaceC08000p.A6T()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A04 = C1294Lf.A04(this.A03);
        String clientToken = A07(308, 12, 110);
        hashMap.put(clientToken, A04);
        new JA(A6T, this.A08).A04(J9.A08, hashMap);
    }

    public final void A0J() {
        InterfaceC08000p interfaceC08000p = this.A01;
        String A07 = A07(195, 3, 93);
        if (interfaceC08000p == null) {
            String A072 = A07(107, 26, 7);
            this.A0B.A07().A9a(A07, C8A.A0Q, new C8B(A072));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A4t(adErrorType.getErrorCode(), A072);
            AbstractC08010q abstractC08010q = this.A06;
            if (abstractC08010q != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC08010q.A0G(C1242Jb.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A4w();
            return;
        }
        if (this.A0C) {
            String A073 = A07(174, 18, 71);
            this.A0B.A07().A9a(A07, C8A.A0M, new C8B(A073));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A4t(adErrorType2.getErrorCode(), A073);
            AbstractC08010q abstractC08010q2 = this.A06;
            if (abstractC08010q2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC08010q2.A0G(C1242Jb.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0E().A4v();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A6T())) {
            this.A08.AA3(this.A01.A6T());
        }
        this.A0B.A0E().A4x();
        this.A0C = true;
        A0M();
    }

    public final void A0K() {
        A0V(false);
    }

    public final void A0L() {
        if (this.A02 != null) {
            C08070w.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0N(InterfaceC08000p interfaceC08000p) {
        if (interfaceC08000p != null) {
            interfaceC08000p.onDestroy();
        }
    }

    public final void A0P(AbstractC08010q abstractC08010q) {
        this.A06 = abstractC08010q;
    }

    public final void A0Q(C08321v c08321v) {
        A0S(c08321v.A03().optString(A07(210, 2, 39)));
    }

    public void A0R(String str) {
        A0A(str, null);
    }

    public final void A0S(String str) {
        this.A0B.A0E().A4q();
        if (!TextUtils.isEmpty(str)) {
            new JA(str, this.A08).A04(J9.A04, null);
        }
    }

    public final void A0T(String str) {
        A0R(str);
    }

    public final void A0U(String str, AdExperienceType adExperienceType) {
        A0A(str, adExperienceType);
    }

    public void A0V(boolean z8) {
        if (!z8 && !this.A0C) {
            return;
        }
        this.A0B.A0E().A4y();
        A0N(this.A01);
        this.A0C = false;
    }

    public final boolean A0W() {
        C8S c8s = this.A04;
        return c8s == null || c8s.A0C();
    }

    @Override // com.meta.analytics.dsp.uinode.K3
    public final synchronized void ABR(C1242Jb c1242Jb) {
        A0F().post(new C1721an(this, c1242Jb));
    }

    @Override // com.meta.analytics.dsp.uinode.K3
    public final synchronized void ADG(C1538Up c1538Up) {
        try {
            A09(c1538Up);
        } catch (Exception e4) {
            this.A0B.A07().A9a(A07(195, 3, 93), C8A.A0T, new C8B(e4));
        }
    }
}
