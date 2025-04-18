package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class BO extends FrameLayout implements MS, U9 {
    public static byte[] A0I;
    public static String[] A0J = {"UTx0mthy689a2sWy4JVu0tmbo5tf7DAX", "DpQrJfF4GGVCKG366ycalUQvQmaAeTpv", "eTaJ9UlZkoiVo78onrsfkh8qyWU6l07Y", "ASk", "tRl9yBUHWghtVC3MTlEkON1DGIMHt5L9", "IjjI8eijgHBxehc5IxL2bCSmbEZHlZYm", "ajbOHBl4KDnxYMWXO0J67", "uiq3lL8JcMvDgND3txStxUQziaPHduab"};
    public C5Q A00;
    public C5W A01;
    public InterfaceC0782Pl A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC1187cD A06;
    public final C1045Zs A07;
    public final J7 A08;
    public final JF A09;
    public final ViewOnSystemUiVisibilityChangeListenerC0683Lq A0A;
    public final C0688Lv A0B;
    public final MR A0C;
    public final N9 A0D;
    public final PT A0E;
    public final C0772Pb A0F;
    public final AbstractC0832Rj A0G;
    public final C0833Rk A0H;

    public static String A0B(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{24, 47, 47, 50, 47, 125, 62, 47, 56, 60, 41, 52, 51, 58, 125, 62, 50, 51, 59, 52, 58, 125, 23, 14, 18, 19, 78, 69, 76, 68, 67, 72, 73, 114, 76, 73, 36, 47, 38, 46, 41, 34, 35, 24, 38, 35, 24, 46, 41, 35, 34, Utf8.REPLACEMENT_BYTE, 46, 37, 44, 36, 35, 40, 41, 18, 44, 41, 18, 57, 34, 57, 44, 33, 91, 80, 89, 81, 86, 93, 92, 103, 76, 81, 85, 93, 103, 75, 72, 93, 86, 76, 35, 44, 41, 35, 43, 31, 51, 47, 53, 50, 35, 37, 74, 76, 90, 77, 92, 83, 86, 92, 84};
    }

    static {
        A0D();
    }

    public BO(C1045Zs c1045Zs, J7 j7, MR mr, AbstractC1187cD abstractC1187cD, N9 n9, int i2) {
        super(c1045Zs);
        this.A01 = new UM(this);
        this.A0G = new UL(this);
        this.A03 = true;
        this.A07 = c1045Zs;
        this.A08 = j7;
        this.A0C = mr;
        this.A06 = abstractC1187cD;
        this.A0D = n9;
        C0772Pb A02 = AbstractC0773Pc.A02(abstractC1187cD.A0l());
        if (A02 == null) {
            this.A0F = new C0772Pb(this.A07, abstractC1187cD, j7, i2);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new UK(this));
        M3.A0G(1003, this.A0F.A0O());
        if (this.A06.A11()) {
            this.A0E = new PT(this.A07, this.A08, this.A06, new C03226f(this.A07), this.A09, this.A0C, this.A0D, new UJ(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new PP(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new C0833Rk(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0O());
        this.A0H.A0X(this.A06.A0P());
        this.A0F.A0e(this.A0H);
        this.A0A = new ViewOnSystemUiVisibilityChangeListenerC0683Lq(this);
        this.A0A.A05(EnumC0682Lp.A02);
        setBackgroundColor(0);
        if (C0608Im.A1p(c1045Zs)) {
            c1045Zs.A0A().AHQ(mediaView, abstractC1187cD.A1U(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean A1a = abstractC1187cD.A1a();
            String A0B = A0B(68, 18, 20);
            String A0B2 = A0B(36, 16, 107);
            String A0B3 = A0B(52, 16, 97);
            String A0B4 = A0B(26, 10, 1);
            if (A1a) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 0);
                jSONObject.put(A0B, this.A06.A0V());
            } else if (L6.A05(abstractC1187cD.A0b())) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 1);
                jSONObject.put(A0B, this.A06.A0V());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(C8E.A15, A0B(0, 26, Opcodes.LREM));
        }
    }

    private void A0C() {
        Q7 A0F = new Q5(this.A07, this.A06.A1P().A0F(), this.A06.A1S()).A0A(this.A06.A1O().A01()).A0F();
        addView(A0F, new FrameLayout.LayoutParams(-1, -1));
        A0F.A04(new UH(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0E().A5d();
            this.A0F.A0X();
        } else {
            this.A07.A0E().A5e();
            if (this.A0F.A0k()) {
                AGz();
                if (C0608Im.A1p(this.A07)) {
                    this.A07.A0A().ABh();
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            C0772Pb c0772Pb = this.A0F;
            String[] strArr = A0J;
            if (strArr[0].charAt(1) != strArr[2].charAt(1)) {
                throw new RuntimeException();
            }
            A0J[6] = "m5i7x933C7hHEFpC39NkE";
            ViewGroup parent = c0772Pb.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3q(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A12()) {
            this.A0A.A05(EnumC0682Lp.A03);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        OH oh = new OH(this.A07, this.A0D.A6p(), this.A0H, this.A0B, this.A08, this.A06.A1Q(), this.A0C);
        HashMap hashMap = new HashMap();
        hashMap.put(A0B(86, 12, 108), A0B(98, 9, 19));
        oh.A08(this.A06.A1U(), str, hashMap);
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void A8q() {
        A0F(this.A06.A1P().A0G().A05());
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void A8r(String str) {
        A0F(str);
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void A8v() {
        this.A0C.A4P(this.A0D.A6F());
        C0799Qc serverSideRewardHandler = new C0799Qc(this.A07, this.A0D, this.A06.A0m(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void A9j() {
        new Handler(Looper.getMainLooper()).post(new UI(this));
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        C0772Pb.A0B().incrementAndGet();
        c5q.A0A(this.A01);
        this.A00 = c5q;
        A0E();
        if (this.A06.A1P().A0R()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void AC2() {
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void AC6() {
        if (this.A0E != null) {
            this.A0E.A0P();
        }
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void ACm(boolean z2) {
        if (this.A0E != null) {
            this.A0E.A0R(z2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void ACz(boolean z2) {
        if (this.A0E != null) {
            this.A0E.A0S(z2);
        }
        if (z2) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void ADN(boolean z2) {
        if (this.A0E != null) {
            this.A0E.A0T(z2);
        }
        if (this.A03) {
            this.A03 = false;
        } else if (z2) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void ADb() {
        if (this.A0E != null) {
            this.A0E.A0Q();
        }
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void AE5(boolean z2) {
        if (this.A0E != null) {
            this.A0E.A0U(z2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void AE7(boolean z2) {
        if (this.A0E != null) {
            this.A0E.A0V(z2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void AEK(String str) {
        String urlString = this.A06.A1V(str);
        if (urlString == null) {
            return;
        }
        L2.A0M(new L2(), this.A07, L5.A00(urlString), this.A06.A1U());
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void AGz() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.U9
    public final void close() {
        if (this.A00 == null) {
            return;
        }
        this.A00.finish(4);
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public String getCurrentClientToken() {
        return this.A06.A1U();
    }

    private ViewGroup getMediaView() {
        if (this.A0E != null) {
            return this.A0E;
        }
        return this.A0F.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void onDestroy() {
        if (C0608Im.A1p(this.A07)) {
            this.A07.A0A().AHC(getMediaView());
        }
        PT pt = this.A0E;
        String[] strArr = A0J;
        if (strArr[4].charAt(27) != strArr[5].charAt(27)) {
            throw new RuntimeException();
        }
        A0J[6] = "GZe1biqFkGajjfTMFdC84";
        if (pt != null) {
            this.A0E.A0O();
        }
        this.A0A.A03();
        this.A08.A9x(this.A06.A1U(), new O8().A02(this.A0B).A03(this.A0H).A05());
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        AbstractC0773Pc.A04(this.A06.A0l());
        C0772Pb.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(MR mr) {
    }

    public void setRtfActionsJavascriptListener(InterfaceC0782Pl interfaceC0782Pl) {
        this.A02 = interfaceC0782Pl;
    }
}
