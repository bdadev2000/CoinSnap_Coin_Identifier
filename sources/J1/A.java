package J1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzcd;
import com.google.android.gms.internal.play_billing.zzga;
import java.util.List;
import java.util.Objects;
import p1.C2537a;

/* loaded from: classes.dex */
public final class A extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1485a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f1486c;

    public A(B b, boolean z8) {
        this.f1486c = b;
        this.b = z8;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i9;
        try {
            if (this.f1485a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.b) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                context.registerReceiver(this, intentFilter, i9);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f1485a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Bundle bundle, g gVar, int i9) {
        byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
        B b = this.f1486c;
        if (byteArray != null) {
            try {
                ((E1.d) ((y) b.f1489d)).C(zzga.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzcd.zza()));
                return;
            } catch (Throwable unused) {
                zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        ((E1.d) ((y) b.f1489d)).C(x.a(23, i9, gVar));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i9 = 1;
        B b = this.f1486c;
        if (extras == null) {
            zzb.zzk("BillingBroadcastManager", "Bundle is null.");
            y yVar = (y) b.f1489d;
            g gVar = z.f1560h;
            ((E1.d) yVar).C(x.a(11, 1, gVar));
            C2537a c2537a = (C2537a) b.f1488c;
            if (c2537a != null) {
                c2537a.b(gVar, null);
                return;
            }
            return;
        }
        g zze = zzb.zze(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW")) {
            i9 = 2;
        }
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (zze.f1520a != 0) {
                    b(extras, zze, i9);
                    ((C2537a) b.f1488c).b(zze, zzai.zzk());
                    return;
                }
                b.getClass();
                zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                y yVar2 = (y) b.f1489d;
                g gVar2 = z.f1560h;
                ((E1.d) yVar2).C(x.a(77, i9, gVar2));
                ((C2537a) b.f1488c).b(gVar2, zzai.zzk());
                return;
            }
            return;
        }
        List zzi = zzb.zzi(extras);
        if (zze.f1520a == 0) {
            ((E1.d) ((y) b.f1489d)).D(x.b(i9));
        } else {
            b(extras, zze, i9);
        }
        ((C2537a) b.f1488c).b(zze, zzi);
    }
}
