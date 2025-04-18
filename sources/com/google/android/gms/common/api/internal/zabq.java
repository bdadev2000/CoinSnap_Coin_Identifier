package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import r.b;

/* loaded from: classes3.dex */
public final class zabq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {
    final /* synthetic */ GoogleApiManager zaa;
    private final Api.Client zac;
    private final ApiKey zad;
    private final zaad zae;
    private final int zah;

    @Nullable
    private final zact zai;
    private boolean zaj;
    private final Queue zab = new LinkedList();
    private final Set zaf = new HashSet();
    private final Map zag = new HashMap();
    private final List zak = new ArrayList();

    @Nullable
    private ConnectionResult zal = null;
    private int zam = 0;

    public zabq(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        this.zaa = googleApiManager;
        Api.Client zab = googleApi.zab(GoogleApiManager.zad(googleApiManager).getLooper(), this);
        this.zac = zab;
        this.zad = googleApi.getApiKey();
        this.zae = new zaad();
        this.zah = googleApi.zaa();
        if (zab.requiresSignIn()) {
            this.zai = googleApi.zac(GoogleApiManager.zac(googleApiManager), GoogleApiManager.zad(googleApiManager));
        } else {
            this.zai = null;
        }
    }

    @Nullable
    private final Feature zaC(@Nullable Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.zac.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            b bVar = new b(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                bVar.put(feature.getName(), Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) bVar.getOrDefault(feature2.getName(), null);
                if (l10 == null || l10.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void zaD(ConnectionResult connectionResult) {
        String str;
        for (zal zalVar : this.zaf) {
            if (Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                str = this.zac.getEndpointPackageName();
            } else {
                str = null;
            }
            zalVar.zac(this.zad, connectionResult, str);
        }
        this.zaf.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaE(Status status) {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        zaF(status, null, false);
    }

    private final void zaF(@Nullable Status status, @Nullable Exception exc, boolean z10) {
        boolean z11;
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        boolean z12 = false;
        if (status != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (exc == null) {
            z12 = true;
        }
        if (z11 != z12) {
            Iterator it = this.zab.iterator();
            while (it.hasNext()) {
                zai zaiVar = (zai) it.next();
                if (!z10 || zaiVar.zac == 2) {
                    if (status != null) {
                        zaiVar.zad(status);
                    } else {
                        zaiVar.zae(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void zaG() {
        ArrayList arrayList = new ArrayList(this.zab);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zai zaiVar = (zai) arrayList.get(i10);
            if (this.zac.isConnected()) {
                if (zaM(zaiVar)) {
                    this.zab.remove(zaiVar);
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaH() {
        zan();
        zaD(ConnectionResult.RESULT_SUCCESS);
        zaL();
        Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            zaci zaciVar = (zaci) it.next();
            if (zaC(zaciVar.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    zaciVar.zaa.registerListener(this.zac, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        zaG();
        zaJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaI(int i10) {
        zan();
        this.zaj = true;
        this.zae.zae(i10, this.zac.getLastDisconnectMessage());
        ApiKey apiKey = this.zad;
        GoogleApiManager googleApiManager = this.zaa;
        GoogleApiManager.zad(googleApiManager).sendMessageDelayed(Message.obtain(GoogleApiManager.zad(googleApiManager), 9, apiKey), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        ApiKey apiKey2 = this.zad;
        GoogleApiManager googleApiManager2 = this.zaa;
        GoogleApiManager.zad(googleApiManager2).sendMessageDelayed(Message.obtain(GoogleApiManager.zad(googleApiManager2), 11, apiKey2), 120000L);
        GoogleApiManager.zal(this.zaa).zac();
        Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            ((zaci) it.next()).zac.run();
        }
    }

    private final void zaJ() {
        GoogleApiManager.zad(this.zaa).removeMessages(12, this.zad);
        ApiKey apiKey = this.zad;
        GoogleApiManager googleApiManager = this.zaa;
        GoogleApiManager.zad(googleApiManager).sendMessageDelayed(GoogleApiManager.zad(googleApiManager).obtainMessage(12, apiKey), GoogleApiManager.zab(this.zaa));
    }

    private final void zaK(zai zaiVar) {
        zaiVar.zag(this.zae, zaA());
        try {
            zaiVar.zaf(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void zaL() {
        if (this.zaj) {
            GoogleApiManager googleApiManager = this.zaa;
            GoogleApiManager.zad(googleApiManager).removeMessages(11, this.zad);
            GoogleApiManager googleApiManager2 = this.zaa;
            GoogleApiManager.zad(googleApiManager2).removeMessages(9, this.zad);
            this.zaj = false;
        }
    }

    private final boolean zaM(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaK(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature zaC = zaC(zacVar.zab(this));
        if (zaC == null) {
            zaK(zaiVar);
            return true;
        }
        Log.w("GoogleApiManager", this.zac.getClass().getName() + " could not execute call because it requires feature (" + zaC.getName() + ", " + zaC.getVersion() + ").");
        if (GoogleApiManager.zaC(this.zaa) && zacVar.zaa(this)) {
            zabs zabsVar = new zabs(this.zad, zaC, null);
            int indexOf = this.zak.indexOf(zabsVar);
            if (indexOf >= 0) {
                zabs zabsVar2 = (zabs) this.zak.get(indexOf);
                GoogleApiManager.zad(this.zaa).removeMessages(15, zabsVar2);
                GoogleApiManager googleApiManager = this.zaa;
                GoogleApiManager.zad(googleApiManager).sendMessageDelayed(Message.obtain(GoogleApiManager.zad(googleApiManager), 15, zabsVar2), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                return false;
            }
            this.zak.add(zabsVar);
            GoogleApiManager googleApiManager2 = this.zaa;
            GoogleApiManager.zad(googleApiManager2).sendMessageDelayed(Message.obtain(GoogleApiManager.zad(googleApiManager2), 15, zabsVar), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
            GoogleApiManager googleApiManager3 = this.zaa;
            GoogleApiManager.zad(googleApiManager3).sendMessageDelayed(Message.obtain(GoogleApiManager.zad(googleApiManager3), 16, zabsVar), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!zaN(connectionResult)) {
                this.zaa.zaE(connectionResult, this.zah);
                return false;
            }
            return false;
        }
        zacVar.zae(new UnsupportedApiCallException(zaC));
        return true;
    }

    private final boolean zaN(@NonNull ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.zaq()) {
            GoogleApiManager googleApiManager = this.zaa;
            if (GoogleApiManager.zah(googleApiManager) != null && GoogleApiManager.zas(googleApiManager).contains(this.zad)) {
                GoogleApiManager.zah(this.zaa).zah(connectionResult, this.zah);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaO(boolean z10) {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        if (this.zac.isConnected() && this.zag.isEmpty()) {
            if (this.zae.zag()) {
                if (z10) {
                    zaJ();
                    return false;
                }
                return false;
            }
            this.zac.disconnect("Timing out service connection.");
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ void zal(zabq zabqVar, zabs zabsVar) {
        if (zabqVar.zak.contains(zabsVar) && !zabqVar.zaj) {
            if (!zabqVar.zac.isConnected()) {
                zabqVar.zao();
            } else {
                zabqVar.zaG();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zam(zabq zabqVar, zabs zabsVar) {
        Feature[] zab;
        if (zabqVar.zak.remove(zabsVar)) {
            GoogleApiManager.zad(zabqVar.zaa).removeMessages(15, zabsVar);
            GoogleApiManager.zad(zabqVar.zaa).removeMessages(16, zabsVar);
            Feature zaa = zabs.zaa(zabsVar);
            ArrayList arrayList = new ArrayList(zabqVar.zab.size());
            for (zai zaiVar : zabqVar.zab) {
                if ((zaiVar instanceof zac) && (zab = ((zac) zaiVar).zab(zabqVar)) != null && ArrayUtils.contains(zab, zaa)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zai zaiVar2 = (zai) arrayList.get(i10);
                zabqVar.zab.remove(zaiVar2);
                zaiVar2.zae(new UnsupportedApiCallException(zaa));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        if (Looper.myLooper() == GoogleApiManager.zad(this.zaa).getLooper()) {
            zaH();
        } else {
            GoogleApiManager.zad(this.zaa).post(new zabm(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == GoogleApiManager.zad(this.zaa).getLooper()) {
            zaI(i10);
        } else {
            GoogleApiManager.zad(this.zaa).post(new zabn(this, i10));
        }
    }

    public final boolean zaA() {
        return this.zac.requiresSignIn();
    }

    @ResultIgnorabilityUnspecified
    public final boolean zaB() {
        return zaO(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult, Api api, boolean z10) {
        throw null;
    }

    public final int zab() {
        return this.zah;
    }

    public final int zac() {
        return this.zam;
    }

    @Nullable
    public final ConnectionResult zad() {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        return this.zal;
    }

    public final Api.Client zaf() {
        return this.zac;
    }

    public final Map zah() {
        return this.zag;
    }

    public final void zan() {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        this.zal = null;
    }

    public final void zao() {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        if (!this.zac.isConnected() && !this.zac.isConnecting()) {
            try {
                GoogleApiManager googleApiManager = this.zaa;
                int zab = GoogleApiManager.zal(googleApiManager).zab(GoogleApiManager.zac(googleApiManager), this.zac);
                if (zab != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(zab, null);
                    Log.w("GoogleApiManager", "The service for " + this.zac.getClass().getName() + " is not available: " + connectionResult.toString());
                    zar(connectionResult, null);
                    return;
                }
                GoogleApiManager googleApiManager2 = this.zaa;
                Api.Client client = this.zac;
                zabu zabuVar = new zabu(googleApiManager2, client, this.zad);
                if (client.requiresSignIn()) {
                    ((zact) Preconditions.checkNotNull(this.zai)).zae(zabuVar);
                }
                try {
                    this.zac.connect(zabuVar);
                } catch (SecurityException e2) {
                    zar(new ConnectionResult(10), e2);
                }
            } catch (IllegalStateException e10) {
                zar(new ConnectionResult(10), e10);
            }
        }
    }

    public final void zap(zai zaiVar) {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        if (this.zac.isConnected()) {
            if (zaM(zaiVar)) {
                zaJ();
                return;
            } else {
                this.zab.add(zaiVar);
                return;
            }
        }
        this.zab.add(zaiVar);
        ConnectionResult connectionResult = this.zal;
        if (connectionResult != null && connectionResult.hasResolution()) {
            zar(this.zal, null);
        } else {
            zao();
        }
    }

    public final void zaq() {
        this.zam++;
    }

    public final void zar(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        zact zactVar = this.zai;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        GoogleApiManager.zal(this.zaa).zac();
        zaD(connectionResult);
        if ((this.zac instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            GoogleApiManager.zat(this.zaa, true);
            GoogleApiManager googleApiManager = this.zaa;
            GoogleApiManager.zad(googleApiManager).sendMessageDelayed(GoogleApiManager.zad(googleApiManager).obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            zaE(GoogleApiManager.zaf());
            return;
        }
        if (this.zab.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        if (exc != null) {
            Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
            zaF(null, exc, false);
            return;
        }
        if (GoogleApiManager.zaC(this.zaa)) {
            zaF(GoogleApiManager.zag(this.zad, connectionResult), null, true);
            if (!this.zab.isEmpty() && !zaN(connectionResult) && !this.zaa.zaE(connectionResult, this.zah)) {
                if (connectionResult.getErrorCode() == 18) {
                    this.zaj = true;
                }
                if (this.zaj) {
                    GoogleApiManager googleApiManager2 = this.zaa;
                    GoogleApiManager.zad(googleApiManager2).sendMessageDelayed(Message.obtain(GoogleApiManager.zad(googleApiManager2), 9, this.zad), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                    return;
                }
                zaE(GoogleApiManager.zag(this.zad, connectionResult));
                return;
            }
            return;
        }
        zaE(GoogleApiManager.zag(this.zad, connectionResult));
    }

    public final void zas(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        Api.Client client = this.zac;
        client.disconnect("onSignInFailed for " + client.getClass().getName() + " with " + String.valueOf(connectionResult));
        zar(connectionResult, null);
    }

    public final void zat(zal zalVar) {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        this.zaf.add(zalVar);
    }

    public final void zau() {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        if (this.zaj) {
            zao();
        }
    }

    public final void zav() {
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        zaE(GoogleApiManager.zaa);
        this.zae.zaf();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            zap(new zah(listenerKey, new TaskCompletionSource()));
        }
        zaD(new ConnectionResult(4));
        if (this.zac.isConnected()) {
            this.zac.onUserSignOut(new zabp(this));
        }
    }

    public final void zaw() {
        Status status;
        Preconditions.checkHandlerThread(GoogleApiManager.zad(this.zaa));
        if (this.zaj) {
            zaL();
            GoogleApiManager googleApiManager = this.zaa;
            if (GoogleApiManager.zae(googleApiManager).isGooglePlayServicesAvailable(GoogleApiManager.zac(googleApiManager)) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            zaE(status);
            this.zac.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean zaz() {
        return this.zac.isConnected();
    }
}
