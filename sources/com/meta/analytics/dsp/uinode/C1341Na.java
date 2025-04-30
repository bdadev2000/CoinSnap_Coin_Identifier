package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Na, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1341Na {
    public static String[] A07 = {"FOFLIt4izaDLaQDOMIXk8qYNT283z5pM", "oiToeohcscvINDKXEsytRf9HFldaqPXB", "4ipPd9h88IiL3d99rWL92oIsRR1k6HBA", "hPx", "0GhefH5NzI2ypbPnqUG75Cq8VmhNX1", "2b6", "snO0JYp8WiAdMwbOevXppfTs6iFhTSIS", "awSLBYFe7Md8cHgboMT9P3Pgh1wlsZGE"};
    public final String A00 = C1341Na.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<C0S> A03;
    public final WeakReference<InterfaceC1342Nb> A04;
    public final WeakReference<RE> A05;
    public final WeakReference<C1515Ts> A06;

    public C1341Na(C1515Ts c1515Ts, InterfaceC1342Nb interfaceC1342Nb, RE re, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1636Yn c1636Yn) {
        this.A06 = new WeakReference<>(c1515Ts);
        this.A04 = new WeakReference<>(interfaceC1342Nb);
        this.A05 = new WeakReference<>(re);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1636Yn.A0E());
    }

    private C0S A00() {
        C0S funnel = this.A03.get();
        if (funnel == null) {
            return new C1771bb();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return LJ.A01(C8J.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i9, String str) {
        A00().AGz(i9, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AH0();
        if (this.A06.get() == null || this.A01.get() == null || this.A02.get() == null) {
            return;
        }
        boolean z8 = this.A02.get().get();
        String[] strArr = A07;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A07[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        if (z8) {
            this.A01.get().set(true);
            A00().AH1();
            if (this.A06.get().isShown()) {
                A00().AH2();
                new Handler(Looper.getMainLooper()).post(new C1517Tu(this.A05));
            }
            InterfaceC1342Nb interfaceC1342Nb = this.A04.get();
            if (interfaceC1342Nb != null) {
                new Handler(Looper.getMainLooper()).post(new NZ(this, interfaceC1342Nb));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C1515Ts webView = this.A06.get();
        if (webView == null || webView.A06()) {
            A00().AH3(true);
            return;
        }
        InterfaceC1342Nb listener = this.A04.get();
        if (listener == null) {
            A00().AH3(true);
        } else {
            A00().AH3(false);
            listener.ACU();
        }
    }
}
