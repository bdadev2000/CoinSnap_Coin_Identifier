package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: com.facebook.ads.redexgen.X.5V, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5V implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0P;
    public static String[] A0Q = {"6hyfNvrTK6t0uOk4ZUiKTcly4lO9QIT3", "Cx5XWQG9gTlQcsVl0OO6K9WlulTSTZ", "4fLDdlgMQ2q", "AM05mUF2qaDkDYU3MyDNTK", "rN7iVf06fBiMXo1UDWoI2bEJDxOmVmjv", "9bqAz3M9pAQkcUJXzFdGLS", "1D1uNCEUmAwDpqE", "h0QQnxfLOYpp7kAK6sPhgGYv8wQTA65G"};
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public KB A07;
    public MD A08;
    public AbstractC0763Mo A09;
    public C0781Ng A0A;
    public C0850Px A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final AudienceNetworkActivity A0L;
    public final AudienceNetworkActivityApi A0M;
    public final C1070Yn A0N;
    public final List<C5T> A0O = new ArrayList();
    public int A01 = -1;
    public boolean A0F = false;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0P, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0P = new byte[]{-3, 38, 71, 68, 87, 73, -36, -11, -24, -23, -13, -20, -89, -5, -10, -89, -16, -11, -19, -20, -7, -89, -3, -16, -20, -2, -37, 0, -9, -20, -89, -19, -7, -10, -12, -89, -16, -11, -5, -20, -11, -5, -89, -10, -7, -89, -6, -24, -3, -20, -21, -48, -11, -6, -5, -24, -11, -22, -20, -38, -5, -24, -5, -20, -12, 1, -14, -12, -10, 7, -4, 9, -4, 7, Ascii.FF, -44, -46, -35, -35, -42, -29, -59, -22, -31, -42, 1, 10, 7, 3, Ascii.FF, Ascii.DC2, -14, Ascii.CR, 9, 3, Ascii.FF, -32, -20, -22, -85, -29, -34, -32, -30, -33, -20, -20, -24, -85, -34, -31, -16, -85, -34, -31, -17, -30, -19, -20, -17, -15, -26, -21, -28, -85, -61, -58, -53, -58, -48, -59, -36, -66, -63, -36, -49, -62, -51, -52, -49, -47, -58, -53, -60, -36, -61, -55, -52, -44, Ascii.SI, Ascii.ESC, Ascii.EM, -38, Ascii.DC2, Ascii.CR, Ascii.SI, 17, Ascii.SO, Ascii.ESC, Ascii.ESC, Ascii.ETB, -38, Ascii.CR, Ascii.DLE, Ascii.US, -38, Ascii.NAK, Ascii.SUB, 32, 17, Ascii.RS, Ascii.US, 32, Ascii.NAK, 32, Ascii.NAK, Ascii.CR, Ascii.CAN, -38, Ascii.CR, Ascii.SI, 32, Ascii.NAK, 34, Ascii.NAK, 32, 37, Ascii.VT, Ascii.DLE, 17, Ascii.US, 32, Ascii.RS, Ascii.ESC, 37, 17, Ascii.DLE, -23, -11, -13, -76, -20, -25, -23, -21, -24, -11, -11, -15, -76, -25, -22, -7, -76, -17, -12, -6, -21, -8, -7, -6, -17, -6, -17, -25, -14, -76, -22, -17, -7, -13, -17, -7, -7, -21, -22, Ascii.DLE, Ascii.FS, Ascii.SUB, -37, 19, Ascii.SO, Ascii.DLE, Ascii.DC2, Ascii.SI, Ascii.FS, Ascii.FS, Ascii.CAN, -37, Ascii.SO, 17, 32, -37, Ascii.SYN, Ascii.ESC, 33, Ascii.DC2, Ascii.US, 32, 33, Ascii.SYN, 33, Ascii.SYN, Ascii.SO, Ascii.EM, -37, 17, Ascii.SYN, 32, Ascii.GS, Ascii.EM, Ascii.SO, 38, Ascii.DC2, 17, 54, 66, 64, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 52, 55, 70, 1, 60, 65, 71, 56, 69, 70, 71, 60, 71, 60, 52, 63, 1, 56, 69, 69, 66, 69, 75, 87, 85, Ascii.SYN, 78, 73, 75, 77, 74, 87, 87, 83, Ascii.SYN, 73, 76, 91, Ascii.SYN, 81, 86, 92, 77, 90, 91, 92, 81, 92, 81, 73, 84, Ascii.SYN, 78, 81, 86, 81, 91, 80, 71, 73, 75, 92, 81, 94, 81, 92, 97, 40, 52, 50, -13, 43, 38, 40, 42, 39, 52, 52, 48, -13, 38, 41, 56, -13, 46, 51, 57, 42, 55, 56, 57, 46, 57, 46, 38, 49, -13, 46, 50, 53, 55, 42, 56, 56, 46, 52, 51, -13, 49, 52, 44, 44, 42, 41, Base64.padSymbol, 78, Base64.padSymbol, 70, 76, Ascii.SO, 3, Ascii.DLE, 6, Ascii.NAK, 5, 3, Ascii.DC2, 7, -10, -18, -19, -14, -22, -3, -14, -8, -9, -51, -22, -3, -22, 85, 92, 83, 83, 75, 82, 65, 78, 78, 69, 64, 65, 32, 81, 73, 76, 79, 85, 79, -10, -14, -25, -23, -21, -13, -21, -12, -6, -49, -22, 41, 40, 43, 45, 43, Ascii.SUB, 34, 45, -16, -14, -27, -28, -27, -26, -23, -18, -27, -28, -49, -14, -23, -27, -18, -12, -31, -12, -23, -17, -18, -53, -27, -7, 54, 41, 53, 57, 41, 55, 56, Ascii.CAN, 45, 49, 41, 87, 79, 77, 84, 37, 74, 88, 73, 86, 55, 73, 71, 83, 82, 72, 87, -4, -9, -25, -9, -6, -15, -19, -10, -4, -23, -4, -15, -9, -10, 95, 88, 83, 91, 95, 79, 51, 78, -17, -30, -34, -16, -51, -14, -23, -34};
    }

    static {
        A0B();
    }

    public C5V(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0L = audienceNetworkActivity;
        this.A0M = audienceNetworkActivityApi;
        C1070Yn A02 = C03495c.A02(audienceNetworkActivity);
        this.A0N = A02;
        A02.A0L(this);
    }

    private int A00() {
        Rect rect = new Rect();
        Window window = this.A0L.getWindow();
        if (window == null) {
            return 2;
        }
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.top < 200 && rect.left < 200) {
            return 1;
        }
        return 0;
    }

    private MD A02(Intent intent) {
        C5S c5s = new C5S(this, intent, this.A0N.A09(), this.A0N, null);
        if (this.A07 == null) {
            return null;
        }
        switch (C5R.A00[this.A07.ordinal()]) {
            case 1:
                return C5S.A0E(c5s, this.A06);
            case 2:
                return C5S.A08(c5s);
            case 3:
                MD A09 = C5S.A09(c5s);
                if (A0Q[6].length() != 15) {
                    throw new RuntimeException();
                }
                A0Q[2] = "9AjKOltSNiH";
                return A09;
            case 4:
                return C5S.A0A(c5s);
            case 5:
                return C5S.A0B(c5s);
            case 6:
                return C5S.A0C(c5s);
            case 7:
                return C5S.A0D(c5s);
            case 8:
                return C5S.A03(c5s);
            case 9:
                MD A04 = C5S.A04(c5s);
                if (A0Q[1].length() != 0) {
                    A0Q[1] = "wwrXZHO6We2";
                    return A04;
                }
                A0Q[1] = "bd05r2lrBXgQHiU8zhW56DndFWzJq";
                return A04;
            case 10:
                return C5S.A05(c5s);
            case 11:
                MD A06 = C5S.A06(c5s);
                if (A0Q[2].length() == 25) {
                    throw new RuntimeException();
                }
                A0Q[7] = "st3v0TpfdqXoPWlO02nQcse4uCAIapoF";
                return A06;
            case 12:
                return C5S.A07(c5s);
            case 13:
            case 14:
                MD A0F = C5S.A0F(c5s, this.A07);
                if (A0Q[7].charAt(27) == 'B') {
                    throw new RuntimeException();
                }
                A0Q[1] = "x";
                return A0F;
            case 15:
                return c5s.A0U();
            default:
                return null;
        }
    }

    private String A05() {
        KB kb2 = this.A07;
        String value = kb2 != null ? kb2.A02() : null;
        if (value != null) {
            return value;
        }
        return A06(429, 4, 120);
    }

    private void A08() {
        String str = this.A0E;
        if (str != null) {
            C0850Px A01 = AbstractC0849Pw.A01(this.A0N, str);
            this.A0B = A01;
            if (A01 != null) {
                this.A06.addView(this.A0B, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
    }

    private void A09() {
        if ((this.A0N.A0F().A01() || C0659Ih.A1c(this.A0N)) && Build.VERSION.SDK_INT >= 24) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.5Q
                @Override // java.lang.Runnable
                public final void run() {
                    C5V.this.A0M();
                }
            }, 1000L);
        }
    }

    private void A0A() {
        boolean z10 = !this.A0J || C0659Ih.A1a(this.A0N);
        boolean shouldCallOnDestroy = this.A0I;
        if (!shouldCallOnDestroy && z10) {
            boolean shouldCallOnDestroy2 = A0I();
            if (shouldCallOnDestroy2) {
                A0G(QP.A03.A02());
            } else {
                A0G(A06(149, 48, 61));
            }
            this.A0I = true;
        }
    }

    private void A0C(Intent intent) {
        if (C0659Ih.A11(this.A0L)) {
            KB kb2 = this.A07;
            KB kb3 = KB.A03;
            if (A0Q[2].length() == 25) {
                throw new RuntimeException();
            }
            A0Q[1] = "ROWUzhbvPevH2";
            if (kb2 != kb3 && Build.VERSION.SDK_INT >= 18) {
                this.A0A = new C0781Ng();
                this.A0A.A0C(intent.getStringExtra(A06(448, 11, 23)));
                C0781Ng c0781Ng = this.A0A;
                String placementId = this.A0L.getPackageName();
                c0781Ng.A0B(placementId);
                String placementId2 = A06(491, 11, 85);
                long longExtra = intent.getLongExtra(placementId2, 0L);
                if (longExtra != 0) {
                    this.A0A.A09(longExtra);
                }
                TextView textView = new TextView(this.A0L);
                String placementId3 = A06(1, 5, 115);
                textView.setText(placementId3);
                textView.setTextColor(-1);
                AbstractC0737Lo.A0M(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                C5U c5u = new C5U(this, null);
                textView.setOnLongClickListener(c5u);
                this.A06.setOnLongClickListener(c5u);
                this.A06.getOverlay().add(this.A0A);
            }
        }
    }

    private void A0D(Intent intent, Bundle bundle) {
        String A06 = A06(540, 8, 10);
        String A062 = A06(532, 8, 123);
        String A063 = A06(467, 24, 17);
        if (bundle != null) {
            Bundle A02 = C0708Kj.A02(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = A02.getInt(A063, -1);
            this.A0C = A02.getString(A062);
            this.A07 = (KB) A02.getSerializable(A06);
            return;
        }
        this.A01 = intent.getIntExtra(A063, -1);
        this.A0C = intent.getStringExtra(A062);
        this.A07 = (KB) intent.getSerializableExtra(A06);
        this.A02 = intent.getIntExtra(A06(PglCryptUtils.INPUT_INVALID, 16, 117), 0) * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r3.equals(r6) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0G(java.lang.String r6) {
        /*
            r5 = this;
            r2 = 355(0x163, float:4.97E-43)
            r1 = 47
            r0 = 86
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            r4 = 1
            if (r0 != 0) goto L1d
            com.facebook.ads.redexgen.X.QP r0 = com.facebook.ads.redexgen.uinode.QP.A0A
            java.lang.String r0 = r0.A02()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L1f
        L1d:
            r5.A0H = r4
        L1f:
            r2 = 275(0x113, float:3.85E-43)
            r1 = 35
            r0 = 100
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L5a
            com.facebook.ads.redexgen.X.QP r0 = com.facebook.ads.redexgen.uinode.QP.A09
            java.lang.String r3 = r0.A02()
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C5V.A0Q
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 15
            if (r1 == r0) goto L48
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C5V.A0Q
            java.lang.String r1 = "BsUqgJlN3izr4734FAkiK4"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "DZ4pb9dksBh2p0w2isnwDh"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r3.equals(r6)
            if (r0 == 0) goto L5c
        L5a:
            r5.A0G = r4
        L5c:
            r2 = 96
            r1 = 53
            r0 = 14
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L72
            r0 = 9
            r5.finish(r0)
            return
        L72:
            r2 = 310(0x136, float:4.34E-43)
            r1 = 45
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L88
            r0 = 10
            r5.finish(r0)
            return
        L88:
            r0 = 0
            r5.A0P(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C5V.A0G(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(String str, C02451a c02451a) {
        if (this.A08 == null) {
            return;
        }
        if (this.A09 == null) {
            C1070Yn c1070Yn = this.A0N;
            this.A09 = AbstractC0764Mp.A02(c1070Yn, c1070Yn.A09(), str, c02451a, this.A08, new ZW(this, null));
            this.A09.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
        AbstractC0737Lo.A0J(this.A09);
        AbstractC0737Lo.A0T(this.A06);
        this.A06.addView(this.A09);
        this.A09.A0K();
    }

    private boolean A0I() {
        return this.A07 == KB.A0H || this.A07 == KB.A0G || this.A07 == KB.A08 || this.A07 == KB.A05 || this.A07 == KB.A0F;
    }

    public final AudienceNetworkActivity A0J() {
        return this.A0L;
    }

    public final C1070Yn A0K() {
        return this.A0N;
    }

    public final void A0L() {
        if (A0I()) {
            A0G(QP.A09.A02());
        } else {
            A0G(A06(275, 35, 100));
        }
    }

    public final /* synthetic */ void A0M() {
        if (this.A0L.isInMultiWindowMode()) {
            this.A0N.A0E().AA6(A00());
        }
    }

    public final void A0N(C5T c5t) {
        this.A0O.add(c5t);
    }

    public final void A0O(C5T c5t) {
        this.A0O.remove(c5t);
    }

    public final void A0P(String str, C04308q c04308q) {
        Intent intent = new Intent(str + A06(0, 1, 84) + this.A0C);
        if (c04308q != null) {
            intent.putExtra(A06(402, 5, 105), c04308q);
        }
        C02852o.A00(this.A0L).A07(intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AbstractC0714Kr.A00();
        if (0 != 0) {
            throw new NullPointerException(A06(433, 15, 109));
        }
        this.A0M.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i10) {
        this.A0N.A0E().A2c(String.valueOf(A0J().hashCode()), i10, A05());
        if (this.A0L.isFinishing()) {
            return;
        }
        if (C0659Ih.A1U(this.A0N) && !this.A0H && !this.A0G) {
            this.A0N.A0E().AAX();
            A0L();
        }
        if (A0I() && !this.A0F) {
            A0G(QP.A05.A02());
        } else {
            A0G(A06(197, 39, 23));
        }
        this.A0J = true;
        A0A();
        this.A0M.finish(i10);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i10, int i11, Intent intent) {
        MD md2 = this.A08;
        if (md2 != null && md2.onActivityResult(i10, i11, intent)) {
            return;
        }
        U1.A09(i10, i11, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = this.A03;
        long currentTime = currentTimeMillis - this.A04;
        long j10 = j3 + currentTime;
        this.A03 = j10;
        this.A04 = currentTimeMillis;
        if (j10 > this.A02) {
            boolean shouldIntercept = false;
            Iterator<C5T> it = this.A0O.iterator();
            while (it.hasNext()) {
                if (it.next().A8u()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0M.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.A00 != configuration.orientation) {
            HashMap hashMap = new HashMap();
            int i10 = configuration.orientation;
            String A06 = A06(518, 14, 25);
            if (i10 == 1) {
                hashMap.put(A06, A06(459, 8, 74));
            } else {
                hashMap.put(A06, A06(TTAdConstant.DOWNLOAD_APP_INFO_CODE, 9, 51));
            }
            J9 j92 = J9.A0K;
            MD md2 = this.A08;
            JA.A02(j92, hashMap, md2 == null ? A06(0, 0, 50) : md2.getCurrentClientToken(), this.A0N.A09());
            this.A00 = configuration.orientation;
            A09();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(Bundle bundle) {
        AbstractC0739Lq.A02();
        if (C0659Ih.A1p(this.A0L)) {
            Window window = this.A0L.getWindow();
            String[] strArr = A0Q;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            A0Q[6] = "7njofUp2AYjKONZ";
            window.setFlags(16777216, 16777216);
        }
        Intent intent = C0708Kj.A01(this.A0L.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        this.A05 = intent;
        C1070Yn A03 = C0708Kj.A03(intent);
        if (A03 != null) {
            C1070Yn startAdContext = this.A0N;
            startAdContext.A0J(A03.A0E());
            C1070Yn startAdContext2 = this.A0N;
            startAdContext2.A0C(A03.A0B());
            C1070Yn startAdContext3 = this.A0N;
            startAdContext3.A0M(A03.A0G());
        }
        A0D(this.A05, bundle);
        this.A0N.A0E().A2d(String.valueOf(A0J().hashCode()), A05());
        String stringExtra = this.A05.getStringExtra(A06(75, 10, 2));
        boolean z10 = stringExtra == null || !(stringExtra.equals(AdPlacementType.INTERSTITIAL.name()) || stringExtra.equals(AdPlacementType.REWARDED_VIDEO.name()));
        if (C0659Ih.A2N(this.A0N) && this.A07 == KB.A03 && z10) {
            this.A0L.getWindow().setFlags(512, 512);
        } else {
            this.A0L.requestWindowFeature(1);
            this.A0L.getWindow().setFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.A0L);
        this.A06 = relativeLayout;
        AbstractC0737Lo.A0M(relativeLayout, 0);
        this.A0L.setContentView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        MD A02 = A02(this.A05);
        this.A08 = A02;
        if (A02 == null) {
            this.A0N.A07().A9a(A06(64, 11, 36), C8A.A0A, new C8B(A06(6, 58, 24)));
            A0L();
            finish(7);
            return;
        }
        A02.A9Q(this.A05, bundle, this);
        A0G(A06(236, 39, 62));
        this.A04 = System.currentTimeMillis();
        this.A0E = this.A05.getStringExtra(A06(TTAdConstant.PACKAGE_NAME_CODE, 13, 26));
        A08();
        A0C(this.A05);
        this.A00 = this.A0L.getResources().getConfiguration().orientation;
        String A06 = A06(85, 11, 47);
        if (bundle != null) {
            this.A0D = bundle.getString(A06);
        } else {
            this.A0D = this.A05.getStringExtra(A06);
        }
        if (C0659Ih.A1x(this.A0L) && this.A0L.getWindow() != null) {
            this.A0L.getWindow().addFlags(128);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (com.facebook.ads.redexgen.uinode.C0659Ih.A11(r4.A0L) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        r4.A0A.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r3 = r4.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (com.facebook.ads.redexgen.uinode.C5V.A0Q[2].length() == 25) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        r2 = com.facebook.ads.redexgen.uinode.C5V.A0Q;
        r2[5] = "rHb3ILEFnyWtMYiOwcguj0";
        r2[3] = "XKBHK5KZoSEcfbvzOM5yLt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        r3.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r3 != null) goto L15;
     */
    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.Yn r0 = r4.A0N
            com.facebook.ads.redexgen.X.0S r2 = r0.A0E()
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0J()
            int r0 = r0.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r4.A05()
            r2.A2e(r1, r0)
            r4.A0A()
            android.widget.RelativeLayout r0 = r4.A06
            if (r0 == 0) goto L23
            r0.removeAllViews()
        L23:
            com.facebook.ads.redexgen.X.MD r0 = r4.A08
            if (r0 == 0) goto L4e
            r0.onDestroy()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C5V.A0Q
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L44
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L44:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C5V.A0Q
            java.lang.String r1 = "BK5JyIukG"
            r0 = 1
            r2[r0] = r1
            r0 = 0
            r4.A08 = r0
        L4e:
            com.facebook.ads.redexgen.X.Ng r3 = r4.A0A
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C5V.A0Q
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L97
            if (r3 == 0) goto L73
        L66:
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0L
            boolean r0 = com.facebook.ads.redexgen.uinode.C0659Ih.A11(r0)
            if (r0 == 0) goto L73
            com.facebook.ads.redexgen.X.Ng r0 = r4.A0A
            r0.A07()
        L73:
            com.facebook.ads.redexgen.X.Mo r3 = r4.A09
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C5V.A0Q
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L94
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C5V.A0Q
            java.lang.String r1 = "rHb3ILEFnyWtMYiOwcguj0"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "XKBHK5KZoSEcfbvzOM5yLt"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L93
        L90:
            r3.A0J()
        L93:
            return
        L94:
            if (r3 == 0) goto L93
            goto L90
        L97:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C5V.A0Q
            java.lang.String r1 = "VoJV9dI9dal5KZ60JkB8i5Bpps"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L73
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C5V.onDestroy():void");
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0N.A0E().A2f(String.valueOf(A0J().hashCode()), A05());
        this.A03 += System.currentTimeMillis() - this.A04;
        MD md2 = this.A08;
        if (md2 != null) {
            md2.ACW(false);
            if (!this.A0L.isFinishing()) {
                JA.A02(J9.A0E, null, this.A08.getCurrentClientToken(), this.A0N.A09());
                this.A0K = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0N.A0E().A2g(String.valueOf(A0J().hashCode()), A05());
        this.A04 = System.currentTimeMillis();
        MD md2 = this.A08;
        if (md2 != null) {
            md2.ACu(false);
            if (this.A0K) {
                JA.A02(J9.A0F, null, this.A08.getCurrentClientToken(), this.A0N.A09());
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        MD md2 = this.A08;
        if (md2 != null) {
            md2.AFT(bundle2);
        }
        bundle2.putInt(A06(467, 24, 17), this.A01);
        bundle2.putString(A06(532, 8, 123), this.A0C);
        bundle2.putString(A06(85, 11, 47), this.A0D);
        bundle2.putSerializable(A06(540, 8, 10), this.A07);
        C0708Kj.A09(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0N.A0E().A2h(String.valueOf(A0J().hashCode()), A05());
        int i10 = this.A01;
        if (i10 != -1) {
            M7.A02(this.A0L, i10, this.A0N);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0N.A0E().A2i(String.valueOf(A0J().hashCode()), A05());
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.A0M.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        A0L();
        finish(5);
    }
}
