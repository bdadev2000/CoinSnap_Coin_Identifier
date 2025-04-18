package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class NH implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ NJ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, Ascii.DC4, 33, Ascii.DC2, Ascii.DC4, Ascii.SYN, 39, Ascii.FS, 41, Ascii.FS, 39, 44, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -60, -58, -41, -52, -46, -47, -111, -71, -84, -88, -70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C1070Yn c1070Yn;
        C1070Yn c1070Yn2;
        C1070Yn c1070Yn3;
        NI ni2;
        if (KL.A02(this)) {
            return;
        }
        try {
            str = this.A00.A07;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 35);
            str2 = this.A00.A07;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 33);
            str3 = this.A00.A07;
            Intent intent = new Intent(A002, AbstractC0721Ky.A00(str3));
            intent.addFlags(268435456);
            c1070Yn = this.A00.A0B;
            c1070Yn.A0E().A8g();
            try {
                c1070Yn3 = this.A00.A0B;
                C0708Kj.A0C(c1070Yn3, intent);
                ni2 = this.A00.A05;
                ni2.ACR();
            } catch (C0706Kh e2) {
                Throwable cause = e2.getCause();
                Throwable th2 = e2;
                if (cause != null) {
                    th2 = e2.getCause();
                }
                c1070Yn2 = this.A00.A0B;
                c1070Yn2.A07().A9a(A00(11, 11, 113), C8A.A00, new C8B(th2));
            }
        } catch (Throwable th3) {
            KL.A00(th3, this);
        }
    }

    public NH(NJ nj) {
        this.A00 = nj;
    }
}
