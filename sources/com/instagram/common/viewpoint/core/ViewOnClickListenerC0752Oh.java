package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Oh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0752Oh implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"aUyhDgZzCxx0Fo0aLoCtiuJX5lt1Em7h", "IU9gnqoqDa2n7WEe3wiWby57KruBSWfN", "57fa1VpsBY39tHMgQ3Qgx4ZAKOvpZO", "l1cFWBsWpb1xIqaJVfDZzdeVbcwmQJ4W", "uLRqkE9KSQI", "XsB4rZ8TcHUkKOxnTnbB33RXLsHLV", "pJcUqIp9KWRXB2hM3LzKI8otqYa3cTkH", "iQ2u1wDEylPYZ9kZrZj99NoP6udHs7RH"};
    public final /* synthetic */ C0903Uc A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-85, -81, -93, -87, -89};
        if (A02[0].charAt(22) == '9') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "S9ialwmDFK349gex3NgP3vDabM3jB4SC";
        strArr[1] = "CB0B92gOKY82Q5M73UaMoIgaE8byLodA";
        A01 = bArr;
    }

    static {
        A01();
    }

    public ViewOnClickListenerC0752Oh(C0903Uc c0903Uc) {
        this.A00 = c0903Uc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 15));
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
