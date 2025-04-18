package a4;

import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d0 {
    public static final /* synthetic */ int a = 0;

    static {
        int i10 = e0.Q7;
    }

    public static zzga a(int i10, int i11, l lVar) {
        try {
            zzfz zzy = zzga.zzy();
            zzgg zzy2 = zzgk.zzy();
            zzy2.zzn(lVar.a);
            zzy2.zzm(lVar.f152b);
            zzy2.zzo(i10);
            zzy.zzl(zzy2);
            zzy.zzn(i11);
            return (zzga) zzy.zzf();
        } catch (Exception e2) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e2);
            return null;
        }
    }

    public static zzge b(int i10) {
        try {
            zzgd zzy = zzge.zzy();
            zzy.zzm(i10);
            return (zzge) zzy.zzf();
        } catch (Exception e2) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e2);
            return null;
        }
    }
}
