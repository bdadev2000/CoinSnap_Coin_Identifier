package n1;

import F2.h;
import T7.o;
import T7.r;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import g4.AbstractC2292b;
import java.util.LinkedHashMap;
import o1.C2492a;
import r6.EnumC2680a;
import t7.C2720i;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2470a extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21821e;

    public /* synthetic */ C2470a(int i9, Object obj, Object obj2) {
        this.f21819c = i9;
        this.f21820d = obj;
        this.f21821e = obj2;
    }

    @Override // F2.h
    public void F() {
        switch (this.f21819c) {
            case 2:
                r6.c cVar = (r6.c) this.f21820d;
                cVar.f22899d = false;
                Log.i("InterstitialAdsHelper", "onAdClosed: start count delay");
                cVar.f22900e.postDelayed(cVar.f22901f, cVar.f22898c * 1000);
                ((AbstractC2292b) this.f21821e).getClass();
                return;
            default:
                return;
        }
    }

    @Override // F2.h
    public final void G(LoadAdError loadAdError) {
        String str;
        String str2;
        r rVar;
        Object value;
        switch (this.f21819c) {
            case 0:
                Log.d("MiaAd", "Admob onAdFailedToLoad");
                ((h) this.f21821e).G(loadAdError);
                return;
            case 1:
                ((r6.c) this.f21820d).b.put((String) this.f21821e, EnumC2680a.f22893f);
                return;
            case 2:
                ((r6.c) this.f21820d).f22899d = true;
                if (loadAdError != null) {
                    str = loadAdError.getMessage();
                } else {
                    str = null;
                }
                Log.i("InterstitialAdsHelper", "onAdFailedToShow: " + str);
                ((AbstractC2292b) this.f21821e).getClass();
                return;
            default:
                if (loadAdError != null) {
                    str2 = loadAdError.getMessage();
                } else {
                    str2 = null;
                }
                Log.i("TAG", "onAdFailedToLoad: " + str2);
                o oVar = (o) ((r6.h) this.f21820d).b.get((C2720i) this.f21821e);
                if (oVar == null) {
                    return;
                }
                do {
                    rVar = (r) oVar;
                    value = rVar.getValue();
                } while (!rVar.b(value, EnumC2680a.f22893f));
                return;
        }
    }

    @Override // F2.h
    public void H(AdError adError) {
        switch (this.f21819c) {
            case 0:
                Log.d("MiaAd", "Admob onAdFailedToShow");
                ((h) this.f21821e).H(adError);
                return;
            default:
                return;
        }
    }

    @Override // F2.h
    public void J(C2492a c2492a) {
        switch (this.f21819c) {
            case 1:
                r6.c cVar = (r6.c) this.f21820d;
                LinkedHashMap linkedHashMap = cVar.b;
                EnumC2680a enumC2680a = EnumC2680a.f22892d;
                String str = (String) this.f21821e;
                linkedHashMap.put(str, enumC2680a);
                cVar.f22897a.put(str, c2492a);
                return;
            default:
                return;
        }
    }

    @Override // F2.h
    public void K(InterstitialAd interstitialAd) {
        switch (this.f21819c) {
            case 0:
                C2492a c2492a = (C2492a) this.f21820d;
                c2492a.f(interstitialAd);
                ((h) this.f21821e).J(c2492a);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r6 = r0.f22924c;
        r0 = (java.lang.Integer) r6.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r0 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r6.put(r2, java.lang.Integer.valueOf(r0 + 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r6 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        r1 = (T7.r) r6;
        r3 = r1.getValue();
        r4 = (r6.EnumC2680a) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r1.b(r3, r6.EnumC2680a.f22892d) == false) goto L16;
     */
    @Override // F2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M(o1.C2493b r6) {
        /*
            r5 = this;
            int r0 = r5.f21819c
            switch(r0) {
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r5.f21820d
            r6.h r0 = (r6.h) r0
            java.util.LinkedHashMap r1 = r0.f22923a
            java.lang.Object r2 = r5.f21821e
            t7.i r2 = (t7.C2720i) r2
            r1.put(r2, r6)
            java.util.LinkedHashMap r6 = r0.b
            java.lang.Object r6 = r6.get(r2)
            T7.o r6 = (T7.o) r6
            if (r6 == 0) goto L2f
        L1d:
            r1 = r6
            T7.r r1 = (T7.r) r1
            java.lang.Object r3 = r1.getValue()
            r4 = r3
            r6.a r4 = (r6.EnumC2680a) r4
            r6.a r4 = r6.EnumC2680a.f22892d
            boolean r1 = r1.b(r3, r4)
            if (r1 == 0) goto L1d
        L2f:
            java.util.LinkedHashMap r6 = r0.f22924c
            java.lang.Object r0 = r6.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L3e
            int r0 = r0.intValue()
            goto L3f
        L3e:
            r0 = 0
        L3f:
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.put(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C2470a.M(o1.b):void");
    }

    @Override // F2.h
    public void N() {
        switch (this.f21819c) {
            case 2:
                ((AbstractC2292b) this.f21821e).h();
                return;
            default:
                return;
        }
    }
}
