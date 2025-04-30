package u6;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class p0 extends o0 {

    /* renamed from: C, reason: collision with root package name */
    public static final C.c f23390C;

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f23391D;

    /* renamed from: B, reason: collision with root package name */
    public long f23392B;

    static {
        C.c cVar = new C.c(30);
        f23390C = cVar;
        cVar.B(new String[]{"ads_shimmer_native_home"}, new int[]{2}, new int[]{R.layout.ads_shimmer_native_home});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23391D = sparseIntArray;
        sparseIntArray.put(R.id.imgTopBar, 3);
        sparseIntArray.put(R.id.txtScreenName, 4);
        sparseIntArray.put(R.id.lottie_premium, 5);
        sparseIntArray.put(R.id.ctlArRuler, 6);
        sparseIntArray.put(R.id.imgBackgroundAr, 7);
        sparseIntArray.put(R.id.imgIconAr, 8);
        sparseIntArray.put(R.id.txtAr, 9);
        sparseIntArray.put(R.id.frAdsContainer, 10);
        sparseIntArray.put(R.id.viewStraightRuler, 11);
        sparseIntArray.put(R.id.imgIconStraightRuler, 12);
        sparseIntArray.put(R.id.imgBackgroundStraightRuler, 13);
        sparseIntArray.put(R.id.txtStraightRuler, 14);
        sparseIntArray.put(R.id.guidelineCenterVertical, 15);
        sparseIntArray.put(R.id.viewProtractor, 16);
        sparseIntArray.put(R.id.imgIconProtractor, 17);
        sparseIntArray.put(R.id.imgBackgroundProtractor, 18);
        sparseIntArray.put(R.id.txtProtractor, 19);
        sparseIntArray.put(R.id.viewBottom, 20);
        sparseIntArray.put(R.id.viewSpiritLevel, 21);
        sparseIntArray.put(R.id.imgIconSpiritLevel, 22);
        sparseIntArray.put(R.id.imgBackgroundSpiritLevel, 23);
        sparseIntArray.put(R.id.txtSpiritLevel, 24);
        sparseIntArray.put(R.id.viewSetting, 25);
        sparseIntArray.put(R.id.imgIconSetting, 26);
        sparseIntArray.put(R.id.imgBackgroundSetting, 27);
        sparseIntArray.put(R.id.txtSetting, 28);
        sparseIntArray.put(R.id.viewBottom2, 29);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23392B = 0L;
        }
        this.f23381u.F();
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23392B != 0) {
                    return true;
                }
                if (this.f23381u.H()) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d0.AbstractC2158e
    public final void I() {
        synchronized (this) {
            this.f23392B = 2L;
        }
        this.f23381u.I();
        L();
    }

    @Override // d0.AbstractC2158e
    public final void M(InterfaceC0511v interfaceC0511v) {
        super.M(interfaceC0511v);
        this.f23381u.M(interfaceC0511v);
    }
}
