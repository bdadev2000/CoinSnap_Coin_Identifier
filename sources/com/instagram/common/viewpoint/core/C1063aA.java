package com.instagram.common.viewpoint.core;

import android.os.Handler;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.aA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1063aA extends KY {
    public static byte[] A01;
    public static String[] A02 = {"QJHZKkwEEt2XAA8qb811yZkloXTxKqNm", "0Eo8hyAH95ZWxpQDtz3kXr2Dg2BAnbpt", "yx1IzqDtrK1i7eGrpZodHZ", "KUuZPkausU2VOaHnsIAk0Hn07pOf06lA", "ddvRVBlQrtqHFM3JEeiDXs23nPXnVLtA", "0N8fJtCAvq63STI6q3YZ9dLrj33X3xUc", "d0kigy9sFkFC2aZLzfYLsKXCuWX9Z7p3", "u6xVOdZhMjB663K3VBvQukbaw71N5v3b"};
    public final /* synthetic */ AnonymousClass65 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = (copyOfRange[i5] ^ i4) ^ 122;
            if (A02[2].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "wsWgA7V3OPhtM2agFx6R9FkGRpDQ8hFC";
            strArr[5] = "5QDbKue07C6BH4ozhF9MSdyiVJUT25MO";
            copyOfRange[i5] = (byte) i6;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{43, 57, 57, 47, 62, 57};
    }

    static {
        A02();
    }

    public C1063aA(AnonymousClass65 anonymousClass65) {
        this.A00 = anonymousClass65;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        Handler handler;
        JSONObject jSONObject;
        C03226f c03226f;
        String str;
        String str2;
        try {
            jSONObject = this.A00.A05;
            JSONArray jSONArray = jSONObject.getJSONArray(A00(0, 6, 48));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                AnonymousClass63 assetData = AnonymousClass63.A00(jSONArray.getJSONObject(i2));
                this.A00.A09(assetData.A04, assetData);
            }
            c03226f = this.A00.A02;
            C1065aC c1065aC = new C1065aC(this);
            str = this.A00.A04;
            str2 = this.A00.A03;
            c03226f.A0W(c1065aC, new C6Y(str, str2));
        } catch (JSONException unused) {
            handler = this.A00.A00;
            handler.post(new C1064aB(this));
        }
    }
}
