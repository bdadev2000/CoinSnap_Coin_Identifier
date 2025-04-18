package com.facebook.ads.redexgen.uinode;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class P6 extends WebChromeClient {
    public static byte[] A01;
    public final /* synthetic */ PB A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -44, -39, -48, -71, -32, -40, -51, -48, -35, 83, 75, 89, 89, 71, 77, 75, 68, 64, 70, 67, 52, 54, Ascii.SUB, 53};
    }

    public P6(PB pb2) {
        this.A00 = pb2;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        JA ja2;
        C0825Oy c0825Oy;
        C1070Yn c1070Yn;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 123), consoleMessage.message());
                jSONObject.put(A00(0, 10, 0), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 102), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            ja2 = this.A00.A0D;
            ja2.A04(J9.A0N, null);
            c0825Oy = this.A00.A0E;
            c0825Oy.A04(C8A.A14, jSONObject2);
            c1070Yn = this.A00.A0B;
            c1070Yn.A0E().A5K(jSONObject2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
