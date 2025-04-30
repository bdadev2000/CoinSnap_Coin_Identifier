package com.google.ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1858d extends com.google.ar.core.dependencies.i {
    public final /* synthetic */ AtomicBoolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A4.e f14289c;

    public BinderC1858d(A4.e eVar, AtomicBoolean atomicBoolean) {
        this.b = atomicBoolean;
        this.f14289c = eVar;
    }

    @Override // com.google.ar.core.dependencies.j
    public final void b(Bundle bundle) {
        if (this.b.getAndSet(true)) {
            return;
        }
        int i9 = bundle.getInt("error.code", -100);
        int i10 = bundle.getInt("install.status", 0);
        F f9 = F.f14262d;
        A4.e eVar = this.f14289c;
        if (i10 == 4) {
            ((B3.e) eVar.f52d).b(f9);
            return;
        }
        if (i9 != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 40);
            sb.append("requestInstall = ");
            sb.append(i9);
            sb.append(", launching fullscreen.");
            Log.w("ARCore-InstallService", sb.toString());
            ((H) eVar.f53f).getClass();
            H.e((Activity) eVar.f51c, (B3.e) eVar.f52d);
            return;
        }
        if (bundle.containsKey("resolution.intent")) {
            B3.e eVar2 = (B3.e) eVar.f52d;
            Activity activity = (Activity) eVar.f51c;
            ((H) eVar.f53f).getClass();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
            if (pendingIntent != null) {
                try {
                    activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
                    return;
                } catch (IntentSender.SendIntentException e4) {
                    eVar2.c(new FatalException("Installation Intent failed", e4));
                    return;
                }
            }
            Log.e("ARCore-InstallService", "Did not get pending intent.");
            eVar2.c(new FatalException("Installation intent failed to unparcel."));
            return;
        }
        if (i10 != 10) {
            switch (i10) {
                case 1:
                case 2:
                case 3:
                    ((B3.e) eVar.f52d).b(F.b);
                    return;
                case 4:
                    ((B3.e) eVar.f52d).b(f9);
                    return;
                case 5:
                    ((B3.e) eVar.f52d).c(new FatalException("Unexpected FAILED install status without error."));
                    return;
                case 6:
                    ((B3.e) eVar.f52d).b(F.f14261c);
                    return;
                default:
                    ((B3.e) eVar.f52d).c(new FatalException(A.a("Unexpected install status: ", Ascii.ESC, i10)));
                    return;
            }
        }
        ((B3.e) eVar.f52d).c(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
    }

    @Override // com.google.ar.core.dependencies.j
    public final void c(Bundle bundle) {
    }
}
