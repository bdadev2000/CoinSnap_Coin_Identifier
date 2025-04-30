package J1;

import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;

/* loaded from: classes.dex */
public abstract /* synthetic */ class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1552a = 0;

    static {
        int i9 = y.f1553Q7;
    }

    public static zzga a(int i9, int i10, g gVar) {
        try {
            zzfz zzy = zzga.zzy();
            zzgg zzy2 = zzgk.zzy();
            zzy2.zzn(gVar.f1520a);
            zzy2.zzm(gVar.b);
            zzy2.zzo(i9);
            zzy.zzl(zzy2);
            zzy.zzn(i10);
            return (zzga) zzy.zzf();
        } catch (Exception e4) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e4);
            return null;
        }
    }

    public static zzge b(int i9) {
        try {
            zzgd zzy = zzge.zzy();
            zzy.zzm(i9);
            return (zzge) zzy.zzf();
        } catch (Exception e4) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e4);
            return null;
        }
    }
}
