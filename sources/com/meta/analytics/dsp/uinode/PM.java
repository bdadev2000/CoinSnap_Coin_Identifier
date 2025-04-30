package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class PM {
    public static byte[] A08;
    public WeakReference<PB> A00;
    public WeakReference<TD> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1636Yn A03;
    public final C1391Oy A04;
    public final String A05;
    public final String A06;
    public final WeakReference<J2> A07;

    static {
        A09();
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, Ascii.VT, Ascii.FF, 7, Ascii.ESC, Ascii.DC2, Ascii.SUB, 63, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, Ascii.FF, Ascii.ESC, Ascii.DC4, Ascii.DC4, Ascii.VT, Ascii.DC2, 5, 19, Ascii.VT, Ascii.EM, Ascii.EM, 7, Ascii.CR, Ascii.VT, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, Ascii.ESC, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public PM(C1636Yn c1636Yn, PB pb, J2 j22, C1391Oy c1391Oy, String str, String str2) {
        this.A03 = c1636Yn;
        this.A00 = new WeakReference<>(pb);
        this.A07 = new WeakReference<>(j22);
        this.A04 = c1391Oy;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
    }

    private void A05() {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8X();
    }

    private void A06() {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9K();
    }

    private void A07() {
        this.A03.A0E().A5F();
        this.A02 = true;
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AGY();
        if (C1225Ih.A1W(this.A03)) {
            this.A03.A0A().ABG();
        }
    }

    private void A08() {
        TD uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.ABb();
    }

    private void A0A(PB pb, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = KE.A00(this.A03);
        String A01 = A01(57, 5, 81);
        String A012 = A01(0, 0, 21);
        String storageValue = jSONObject.optString(A01, A012);
        String key = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        String string = A00.getString(A01(14, 4, 103) + key, A012);
        if (string != null) {
            A012 = string;
        }
        pb.A0g(storageValue, A012);
    }

    private void A0B(PB pb, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(98, 5, 12);
        String A012 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01, A012);
        String optString2 = jSONObject.optString(A01(57, 5, 81), A012);
        KE.A00(this.A03).edit().putString(A01(14, 4, 103) + jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50)), optString).apply();
        pb.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(PK pk, String str) throws JSONException {
        switch (PJ.A00[pk.ordinal()]) {
            case 1:
                A0I(new JSONObject(str));
                break;
            case 2:
                A06();
                break;
            case 3:
                A04();
                break;
            case 4:
                A07();
                break;
            case 5:
                A0K(new JSONObject(str));
                break;
            case 6:
                A0L(new JSONObject(str));
                break;
            case 7:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case 8:
                A05();
            case 9:
                this.A03.A0E().A5R(str);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(pk, str);
                break;
            case 15:
                A0J(new JSONObject(str));
                break;
            case 16:
                A08();
                break;
            case 17:
                A0M(new JSONObject(str));
                break;
        }
        PB pb = this.A00.get();
        if (pb == null) {
            return;
        }
        switch (pk) {
            case A06:
                pb.A0S();
                return;
            case A05:
                pb.A0R();
                return;
            case A0P:
                A0B(pb, str);
                return;
            case A0L:
                A0A(pb, str);
                return;
            case A0F:
                pb.A0i(A03(new JSONObject(str)));
                return;
            default:
                return;
        }
    }

    private void A0D(PK pk, String str) throws JSONException {
        TD td = this.A01.get();
        if (td == null) {
            return;
        }
        switch (pk) {
            case A0C:
                td.ABf();
                return;
            case A0N:
                td.AD8();
                return;
            case A0K:
                A0G(td, str);
                return;
            case A0J:
                A0F(td, str);
                return;
            case A0G:
                A0E(td, str);
                return;
            default:
                return;
        }
    }

    private void A0E(TD td, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 108);
        td.ACL(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(TD td, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 118);
        td.ADc(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(TD td, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 82);
        td.ADe(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        TD td = this.A01.get();
        if (td == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(productUrl)) {
            td.A8S();
        } else {
            td.A8T(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        J2 j22 = this.A07.get();
        if (j22 == null) {
            return;
        }
        String optString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        new JA(this.A06, j22).A05(optString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (optInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0E().A9Y(optInt, message);
    }

    private void A0M(JSONObject jSONObject) {
        String optString;
        TD td = this.A01.get();
        if (td == null || (optString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        td.ADr(optString);
    }

    public final void A0N(TD td) {
        this.A01 = new WeakReference<>(td);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        ExecutorC1297Li.A00(new PI(this, str));
    }
}
