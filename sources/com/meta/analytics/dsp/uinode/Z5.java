package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class Z5 extends KT {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass62 A00;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{62, 44, 44, 58, 43, 44};
    }

    public Z5(AnonymousClass62 anonymousClass62) {
        this.A00 = anonymousClass62;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        Handler handler;
        JSONObject jSONObject;
        C09416c c09416c;
        String str;
        String str2;
        try {
            jSONObject = this.A00.A05;
            JSONArray jSONArray = jSONObject.getJSONArray(A00(0, 6, 77));
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                AnonymousClass60 assetData = AnonymousClass60.A00(jSONArray.getJSONObject(i9));
                this.A00.A09(assetData.A04, assetData);
            }
            c09416c = this.A00.A02;
            Z7 z72 = new Z7(this);
            str = this.A00.A04;
            str2 = this.A00.A03;
            c09416c.A0W(z72, new C6V(str, str2));
        } catch (JSONException unused) {
            handler = this.A00.A00;
            handler.post(new Z6(this));
        }
    }
}
