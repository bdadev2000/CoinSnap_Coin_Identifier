package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class JW implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C09647f A00;
    public final /* synthetic */ JZ A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, Ascii.ESC, 5, 60, 61, 39, 32, 59, 38, 45, 89, 78, 91, 68, 89, 95, 66, 69, 76, 54, 33, 53, 49, 33, 55, 48, Ascii.ESC, 45, 32};
    }

    public JW(JZ jz, String str, C09647f c09647f) {
        this.A01 = jz;
        this.A02 = str;
        this.A00 = c09647f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i9;
        int i10;
        int i11;
        if (KL.A02(this)) {
            return;
        }
        try {
            C8B nvl = new C8B(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), jSONArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JY jy = (JY) it.next();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 60));
                i9 = jy.A00;
                StringBuilder append2 = append.append(i9).append(';');
                i10 = jy.A02;
                StringBuilder append3 = append2.append(i10).append(';');
                i11 = jy.A01;
                jSONArray.put(append3.append(i11).toString());
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A07().A9b(A00(10, 9, 82), C8A.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
