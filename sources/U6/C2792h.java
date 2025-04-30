package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2792h extends AbstractC2791g {

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f23317D;

    /* renamed from: C, reason: collision with root package name */
    public long f23318C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23317D = sparseIntArray;
        sparseIntArray.put(R.id.imv_background, 1);
        sparseIntArray.put(R.id.imv_back, 2);
        sparseIntArray.put(R.id.tv_ar_ruler_premium, 3);
        sparseIntArray.put(R.id.imv_unlock_everything, 4);
        sparseIntArray.put(R.id.imv_premium_iap, 5);
        sparseIntArray.put(R.id.tv_ad_fee, 6);
        sparseIntArray.put(R.id.imv_hand, 7);
        sparseIntArray.put(R.id.tv_enjoy_all, 8);
        sparseIntArray.put(R.id.imv_infinity, 9);
        sparseIntArray.put(R.id.tv_experience_a_smoother, 10);
        sparseIntArray.put(R.id.constraint_yearly, 11);
        sparseIntArray.put(R.id.imv_switch_life_time, 12);
        sparseIntArray.put(R.id.tv_life_time, 13);
        sparseIntArray.put(R.id.tv_sub_money, 14);
        sparseIntArray.put(R.id.imv_arrow_right, 15);
        sparseIntArray.put(R.id.tv_money, 16);
        sparseIntArray.put(R.id.tv_best_choice, 17);
        sparseIntArray.put(R.id.constraint_monthly, 18);
        sparseIntArray.put(R.id.imv_switch_monthly, 19);
        sparseIntArray.put(R.id.tv_monthly, 20);
        sparseIntArray.put(R.id.tv_money_monthly, 21);
        sparseIntArray.put(R.id.tv_continue, 22);
        sparseIntArray.put(R.id.tv_cancel, 23);
        sparseIntArray.put(R.id.tv_iap_policy, 24);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2792h(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.C2792h.<init>(android.view.View):void");
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23318C = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23318C != 0) {
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
            this.f23318C = 1L;
        }
        L();
    }
}
