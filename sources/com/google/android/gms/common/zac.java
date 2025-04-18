package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.c;
import androidx.activity.result.i;

/* loaded from: classes3.dex */
final class zac implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ c zac;
    final /* synthetic */ GoogleApiAvailability zad;

    public zac(GoogleApiAvailability googleApiAvailability, Activity activity, int i10, c cVar) {
        this.zad = googleApiAvailability;
        this.zaa = activity;
        this.zab = i10;
        this.zac = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.zac.a(new i(errorResolutionPendingIntent.getIntentSender()).b());
    }
}
