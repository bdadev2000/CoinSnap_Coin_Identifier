package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.google.android.gms.stats.CodePackage;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1364Nx implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"eK2iG9BFnR5LMlE7G3m8", "2ToUjM2zwZ75WerTaDOi0LZSzIqlBfkc", "7dSK8vzOrDGLLmFObH3b", "garB0MzcdmAd1iXvvKCbdmDeJ8TMxCEG", "k0fVZwzOfWxa", CodePackage.OTA, "EVmJiz3R0TMllDo4HJAPWmaYp66nl7Ex", "xkv8Ynv3GUGlmRL7DeQJBLAGHPyG9ojQ"};
    public final /* synthetic */ BK A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[4].length() != 12) {
                throw new RuntimeException();
            }
            A02[5] = "7dr";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 58);
            i12++;
        }
    }

    public static void A01() {
        byte[] bArr = {9, -4, -9, -8, 2};
        if (A02[5].length() != 3) {
            throw new RuntimeException();
        }
        A02[4] = "UQKYIP1cQ1d2";
        A01 = bArr;
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1364Nx(BK bk) {
        this.A00 = bk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC1508Tl ctaButton;
        if (KL.A02(this)) {
            return;
        }
        try {
            ctaButton = this.A00.getCtaButton();
            ctaButton.A09(A00(0, 5, 89));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
