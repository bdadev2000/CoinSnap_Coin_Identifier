package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC0947Tq extends AsyncTask<String, Void, Bitmap[]> implements InterfaceC03947b {
    public static byte[] A0A;
    public static String[] A0B = {"Y", "r8ye64eLoQHeOJVpmB1uxWw1zCCHhuzX", "pvZIfONmKv3cVbimQPa9", "RLgA2SApOIsDDawooMs2KL5D8ZiCWoW1", "kM6akDIqkvY", "0vJdyNO9qrz2JF8Kt31GcmRDql8haFQB", "b8N1ZLVb0I2QrMIKflin5UtA7D7V4D", "X"};
    public int A00;
    public int A01;
    public InterfaceC0782Nh A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final WeakReference<C0780Nf> A06;
    public final WeakReference<C1070Yn> A07;
    public final WeakReference<ImageView> A08;
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-89, -91, -82, -91, -78, -87, -93};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final Bitmap[] A03(String... strArr) {
        if (KL.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            Bitmap bitmap = null;
            Bitmap bitmap2 = null;
            C1070Yn c1070Yn = this.A07.get();
            if (c1070Yn == null) {
                return new Bitmap[]{null, null};
            }
            try {
                bitmap = new C03756c(c1070Yn).A0N(str, this.A00, this.A01);
                if (bitmap != null && !this.A03) {
                    bitmap2 = AbstractC0744Lv.A01(c1070Yn, bitmap, this.A04, this.A05);
                }
            } catch (Throwable th2) {
                c1070Yn.A07().A9a(A00(0, 7, 16), C8A.A1V, new C8B(th2));
            }
            return new Bitmap[]{bitmap, bitmap2};
        } catch (Throwable th3) {
            KL.A00(th3, this);
            return null;
        }
    }

    static {
        A01();
    }

    public AsyncTaskC0947Tq(ViewGroup viewGroup, int i10, int i11, C1070Yn c1070Yn) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1070Yn);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i10;
        this.A05 = i11;
    }

    public AsyncTaskC0947Tq(ViewGroup viewGroup, C1070Yn c1070Yn) {
        this(viewGroup, 12, 16, c1070Yn);
    }

    public AsyncTaskC0947Tq(ImageView imageView, C1070Yn c1070Yn) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1070Yn);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public AsyncTaskC0947Tq(C0780Nf c0780Nf, C1070Yn c1070Yn) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1070Yn);
        this.A06 = new WeakReference<>(c0780Nf);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] result) {
        C0780Nf c0780Nf;
        if (KL.A02(this)) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.A08;
            if (weakReference != null) {
                ImageView imageView = weakReference.get();
                if (result[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(result[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(result[0]);
                }
            }
            WeakReference<C0780Nf> weakReference2 = this.A06;
            if (weakReference2 != null && (c0780Nf = weakReference2.get()) != null) {
                c0780Nf.setImage(result[0], result[1]);
            }
            WeakReference<ViewGroup> weakReference3 = this.A09;
            if (weakReference3 != null && weakReference3.get() != null && result[1] != null) {
                AbstractC0737Lo.A0S(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), result[1]));
            }
            InterfaceC0782Nh interfaceC0782Nh = this.A02;
            if (interfaceC0782Nh != null) {
                interfaceC0782Nh.ABh(result[0] != null);
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }

    public final AsyncTaskC0947Tq A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final AsyncTaskC0947Tq A05(int i10, int i11) {
        this.A00 = i10;
        this.A01 = i11;
        return this;
    }

    public final AsyncTaskC0947Tq A06(InterfaceC0782Nh interfaceC0782Nh) {
        this.A02 = interfaceC0782Nh;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            InterfaceC0782Nh interfaceC0782Nh = this.A02;
            if (interfaceC0782Nh != null) {
                interfaceC0782Nh.ABh(false);
                return;
            }
            return;
        }
        executeOnExecutor(ExecutorC0742Lt.A06, str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03947b
    public final C1070Yn A5t() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) {
        if (KL.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th2) {
            KL.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) {
        if (KL.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th2) {
            KL.A00(th2, this);
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "X";
            strArr2[7] = "y";
        }
    }
}
