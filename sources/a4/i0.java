package a4;

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

/* loaded from: classes.dex */
public final class i0 extends BroadcastReceiver {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f144c;

    public i0(j0 j0Var, boolean z10) {
        this.f144c = j0Var;
        this.f143b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i10;
        if (this.a) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (true != this.f143b) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            context.registerReceiver(this, intentFilter, i10);
        } else {
            context.registerReceiver(this, intentFilter);
        }
        this.a = true;
    }

    public final void b(Bundle bundle, l lVar, int i10) {
        byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
        j0 j0Var = this.f144c;
        if (byteArray != null) {
            try {
                ((d3.g) j0Var.f146c).J(zzga.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzcd.zza()));
                return;
            } catch (Throwable unused) {
                zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        ((d3.g) j0Var.f146c).J(d0.a(23, i10, lVar));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i10 = 1;
        j0 j0Var = this.f144c;
        if (extras == null) {
            zzb.zzk("BillingBroadcastManager", "Bundle is null.");
            e0 e0Var = j0Var.f146c;
            l lVar = f0.f121h;
            ((d3.g) e0Var).J(d0.a(11, 1, lVar));
            x xVar = j0Var.f145b;
            if (xVar != null) {
                xVar.a(lVar, null);
                return;
            }
            return;
        }
        l zze = zzb.zze(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW")) {
            i10 = 2;
        }
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (zze.a != 0) {
                    b(extras, zze, i10);
                    j0Var.f145b.a(zze, zzai.zzk());
                    return;
                }
                j0Var.getClass();
                zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                e0 e0Var2 = j0Var.f146c;
                l lVar2 = f0.f121h;
                ((d3.g) e0Var2).J(d0.a(77, i10, lVar2));
                j0Var.f145b.a(lVar2, zzai.zzk());
                return;
            }
            return;
        }
        List zzi = zzb.zzi(extras);
        if (zze.a == 0) {
            ((d3.g) j0Var.f146c).K(d0.b(i10));
        } else {
            b(extras, zze, i10);
        }
        j0Var.f145b.a(zze, zzi);
    }
}
