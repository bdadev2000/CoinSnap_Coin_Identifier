package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class AsyncTaskC09265n extends AsyncTask<C09285p, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    public final InterfaceC09275o A00;
    public final C1636Yn A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Drawable A00(C09285p... c09285pArr) {
        if (!KL.A02(this) && c09285pArr != null) {
            try {
                if (c09285pArr.length >= 1) {
                    String str = c09285pArr[0].A01;
                    String str2 = c09285pArr[0].A00;
                    Bitmap bitmap = null;
                    try {
                        bitmap = new C09416c(this.A01).A0N(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A07().A9a(A01(0, 7, 42), C8A.A1V, new C8B(th));
                    }
                    if (bitmap != null) {
                        return V2.A05(this.A01, bitmap, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                KL.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, 63};
    }

    static {
        A02();
    }

    public AsyncTaskC09265n(C1636Yn c1636Yn, InterfaceC09275o interfaceC09275o, boolean z8) {
        this.A01 = c1636Yn;
        this.A00 = interfaceC09275o;
        this.A02 = z8;
    }

    public /* synthetic */ AsyncTaskC09265n(C1636Yn c1636Yn, InterfaceC09275o interfaceC09275o, boolean z8, Z9 z9) {
        this(c1636Yn, interfaceC09275o, z8);
    }

    private final void A03(Drawable drawable) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.ABi(drawable);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C09285p[] c09285pArr) {
        if (KL.A02(this)) {
            return null;
        }
        try {
            return A00(c09285pArr);
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
        if (KL.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            KL.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
