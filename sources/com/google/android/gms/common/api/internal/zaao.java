package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaao extends zaav {
    final /* synthetic */ zaaw zaa;
    private final Map zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaao(zaaw zaawVar, Map map) {
        super(zaawVar, null);
        this.zaa = zaawVar;
        this.zac = map;
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    public final void zaa() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        boolean z8;
        Context context2;
        zabi zabiVar;
        com.google.android.gms.signin.zae zaeVar;
        com.google.android.gms.signin.zae zaeVar2;
        zabi zabiVar2;
        Context context3;
        boolean z9;
        googleApiAvailabilityLight = this.zaa.zad;
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(googleApiAvailabilityLight);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.zac.keySet()) {
            if (client.requiresGooglePlayServices()) {
                z9 = ((zaal) this.zac.get(client)).zac;
                if (!z9) {
                    arrayList.add(client);
                }
            }
            arrayList2.add(client);
        }
        int i9 = 0;
        int i10 = -1;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i9 < size) {
                Api.Client client2 = (Api.Client) arrayList2.get(i9);
                context3 = this.zaa.zac;
                i10 = zalVar.zab(context3, client2);
                i9++;
                if (i10 == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i9 < size2) {
                Api.Client client3 = (Api.Client) arrayList.get(i9);
                context = this.zaa.zac;
                i10 = zalVar.zab(context, client3);
                i9++;
                if (i10 != 0) {
                    break;
                }
            }
        }
        if (i10 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i10, null);
            zaaw zaawVar = this.zaa;
            zabiVar2 = zaawVar.zaa;
            zabiVar2.zal(new zaam(this, zaawVar, connectionResult));
            return;
        }
        zaaw zaawVar2 = this.zaa;
        z8 = zaawVar2.zam;
        if (z8) {
            zaeVar = zaawVar2.zak;
            if (zaeVar != null) {
                zaeVar2 = zaawVar2.zak;
                zaeVar2.zab();
            }
        }
        for (Api.Client client4 : this.zac.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) this.zac.get(client4);
            if (client4.requiresGooglePlayServices()) {
                context2 = this.zaa.zac;
                if (zalVar.zab(context2, client4) != 0) {
                    zaaw zaawVar3 = this.zaa;
                    zabiVar = zaawVar3.zaa;
                    zabiVar.zal(new zaan(this, zaawVar3, connectionProgressReportCallbacks));
                }
            }
            client4.connect(connectionProgressReportCallbacks);
        }
    }
}
