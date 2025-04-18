package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class f1 extends e1 {
    public static final SparseIntArray V;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(R.id.layoutTimePicker, 1);
        sparseIntArray.put(R.id.numberPickerHour, 2);
        sparseIntArray.put(R.id.numberPickerMinute, 3);
        sparseIntArray.put(R.id.layoutDateOfWeek, 4);
        sparseIntArray.put(R.id.btnM, 5);
        sparseIntArray.put(R.id.tvM, 6);
        sparseIntArray.put(R.id.btnT, 7);
        sparseIntArray.put(R.id.tvT, 8);
        sparseIntArray.put(R.id.btnW, 9);
        sparseIntArray.put(R.id.tvW, 10);
        sparseIntArray.put(R.id.btnTh, 11);
        sparseIntArray.put(R.id.tvTh, 12);
        sparseIntArray.put(R.id.btnF, 13);
        sparseIntArray.put(R.id.tvF, 14);
        sparseIntArray.put(R.id.btnSa, 15);
        sparseIntArray.put(R.id.tvSa, 16);
        sparseIntArray.put(R.id.btnS, 17);
        sparseIntArray.put(R.id.tvS, 18);
        sparseIntArray.put(R.id.tvPleaseChooseAtLeast1Day, 19);
        sparseIntArray.put(R.id.btnSound, 20);
        sparseIntArray.put(R.id.tvSoundName, 21);
        sparseIntArray.put(R.id.btnVibration, 22);
        sparseIntArray.put(R.id.icSwVibration, 23);
        sparseIntArray.put(R.id.edtTitle, 24);
        sparseIntArray.put(R.id.tvTitle, 25);
        sparseIntArray.put(R.id.tvPleasaeTypeYourTitle, 26);
        sparseIntArray.put(R.id.edtDescription, 27);
        sparseIntArray.put(R.id.btnCancel, 28);
        sparseIntArray.put(R.id.btnSave, 29);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f1(android.view.View r32) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f1.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.U = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.U != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.U = 1L;
        }
        L();
    }
}
