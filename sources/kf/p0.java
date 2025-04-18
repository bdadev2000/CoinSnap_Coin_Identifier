package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class p0 extends o0 {
    public static final h.c H;
    public static final SparseIntArray I;
    public long G;

    static {
        h.c cVar = new h.c(21);
        H = cVar;
        cVar.H(new int[]{2}, new int[]{R.layout.ads_shimmer_native_small}, new String[]{"ads_shimmer_native_small"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.icClose, 3);
        sparseIntArray.put(R.id.vpgListImage, 4);
        sparseIntArray.put(R.id.indicatorContainer, 5);
        sparseIntArray.put(R.id.containerInfo, 6);
        sparseIntArray.put(R.id.tvPlantName, 7);
        sparseIntArray.put(R.id.tvGenusTitle, 8);
        sparseIntArray.put(R.id.tvGenusValue, 9);
        sparseIntArray.put(R.id.tvFamilyTitle, 10);
        sparseIntArray.put(R.id.tvFamilyValue, 11);
        sparseIntArray.put(R.id.tvTreatmentTitle, 12);
        sparseIntArray.put(R.id.tvTreatmentValue, 13);
        sparseIntArray.put(R.id.tvCommonNameTitle, 14);
        sparseIntArray.put(R.id.rcvCommonName, 15);
        sparseIntArray.put(R.id.tvCommonDiseasesTitle, 16);
        sparseIntArray.put(R.id.rcvCommonDisease, 17);
        sparseIntArray.put(R.id.btnAddMyPlant, 18);
        sparseIntArray.put(R.id.btnAddPlant, 19);
        sparseIntArray.put(R.id.relay_ads, 20);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p0(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.p0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.G = 0L;
        }
        this.f20850x.F();
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.G != 0) {
                return true;
            }
            if (this.f20850x.H()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.G = 2L;
        }
        this.f20850x.I();
        L();
    }

    @Override // androidx.databinding.e
    public final void M(androidx.lifecycle.v vVar) {
        super.M(vVar);
        this.f20850x.M(vVar);
    }
}
