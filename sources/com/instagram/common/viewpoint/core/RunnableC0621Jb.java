package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0621Jb implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C7j A00;
    public final /* synthetic */ C0624Je A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, 11, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC0621Jb(C0624Je c0624Je, String str, C7j c7j) {
        this.A01 = c0624Je;
        this.A02 = str;
        this.A00 = c7j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i2;
        int i3;
        int i4;
        if (KQ.A02(this)) {
            return;
        }
        try {
            C8F nvl = new C8F(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, Opcodes.FNEG), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0623Jd c0623Jd = (C0623Jd) it.next();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 23));
                i2 = c0623Jd.A00;
                StringBuilder append2 = append.append(i2).append(';');
                i3 = c0623Jd.A02;
                StringBuilder append3 = append2.append(i3).append(';');
                i4 = c0623Jd.A01;
                jSONArray.put(append3.append(i4).toString());
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A07().AA1(A00(10, 9, Opcodes.LNEG), C8E.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
