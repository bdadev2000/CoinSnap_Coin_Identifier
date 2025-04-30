package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
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
import x.b;

/* loaded from: classes2.dex */
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
        Handler handler;
        Context context;
        Handler handler2;
        this.zaa = googleApiManager;
        handler = googleApiManager.zar;
        Api.Client zab = googleApi.zab(handler.getLooper(), this);
        this.zac = zab;
        this.zad = googleApi.getApiKey();
        this.zae = new zaad();
        this.zah = googleApi.zaa();
        if (zab.requiresSignIn()) {
            context = googleApiManager.zai;
            handler2 = googleApiManager.zar;
            this.zai = googleApi.zac(context, handler2);
            return;
        }
        this.zai = null;
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
                Long l = (Long) bVar.get(feature2.getName());
                if (l == null || l.longValue() < feature2.getVersion()) {
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

    public final void zaE(Status status) {
        Handler handler;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        zaF(status, null, false);
    }

    private final void zaF(@Nullable Status status, @Nullable Exception exc, boolean z8) {
        Handler handler;
        boolean z9;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        boolean z10 = true;
        if (status != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (exc != null) {
            z10 = false;
        }
        if (z9 != z10) {
            Iterator it = this.zab.iterator();
            while (it.hasNext()) {
                zai zaiVar = (zai) it.next();
                if (!z8 || zaiVar.zac == 2) {
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
        for (int i9 = 0; i9 < size; i9++) {
            zai zaiVar = (zai) arrayList.get(i9);
            if (this.zac.isConnected()) {
                if (zaM(zaiVar)) {
                    this.zab.remove(zaiVar);
                }
            } else {
                return;
            }
        }
    }

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

    public final void zaI(int i9) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        com.google.android.gms.common.internal.zal zalVar;
        zan();
        this.zaj = true;
        this.zae.zae(i9, this.zac.getLastDisconnectMessage());
        ApiKey apiKey = this.zad;
        GoogleApiManager googleApiManager = this.zaa;
        handler = googleApiManager.zar;
        handler2 = googleApiManager.zar;
        handler.sendMessageDelayed(Message.obtain(handler2, 9, apiKey), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        ApiKey apiKey2 = this.zad;
        GoogleApiManager googleApiManager2 = this.zaa;
        handler3 = googleApiManager2.zar;
        handler4 = googleApiManager2.zar;
        handler3.sendMessageDelayed(Message.obtain(handler4, 11, apiKey2), 120000L);
        zalVar = this.zaa.zak;
        zalVar.zac();
        Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            ((zaci) it.next()).zac.run();
        }
    }

    private final void zaJ() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j7;
        ApiKey apiKey = this.zad;
        handler = this.zaa.zar;
        handler.removeMessages(12, apiKey);
        ApiKey apiKey2 = this.zad;
        GoogleApiManager googleApiManager = this.zaa;
        handler2 = googleApiManager.zar;
        handler3 = googleApiManager.zar;
        Message obtainMessage = handler3.obtainMessage(12, apiKey2);
        j7 = this.zaa.zae;
        handler2.sendMessageDelayed(obtainMessage, j7);
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
        Handler handler;
        Handler handler2;
        if (this.zaj) {
            GoogleApiManager googleApiManager = this.zaa;
            ApiKey apiKey = this.zad;
            handler = googleApiManager.zar;
            handler.removeMessages(11, apiKey);
            GoogleApiManager googleApiManager2 = this.zaa;
            ApiKey apiKey2 = this.zad;
            handler2 = googleApiManager2.zar;
            handler2.removeMessages(9, apiKey2);
            this.zaj = false;
        }
    }

    private final boolean zaM(zai zaiVar) {
        boolean z8;
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        Handler handler6;
        Handler handler7;
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
        z8 = this.zaa.zas;
        if (z8 && zacVar.zaa(this)) {
            zabs zabsVar = new zabs(this.zad, zaC, null);
            int indexOf = this.zak.indexOf(zabsVar);
            if (indexOf >= 0) {
                zabs zabsVar2 = (zabs) this.zak.get(indexOf);
                handler5 = this.zaa.zar;
                handler5.removeMessages(15, zabsVar2);
                GoogleApiManager googleApiManager = this.zaa;
                handler6 = googleApiManager.zar;
                handler7 = googleApiManager.zar;
                handler6.sendMessageDelayed(Message.obtain(handler7, 15, zabsVar2), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                return false;
            }
            this.zak.add(zabsVar);
            GoogleApiManager googleApiManager2 = this.zaa;
            handler = googleApiManager2.zar;
            handler2 = googleApiManager2.zar;
            handler.sendMessageDelayed(Message.obtain(handler2, 15, zabsVar), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
            GoogleApiManager googleApiManager3 = this.zaa;
            handler3 = googleApiManager3.zar;
            handler4 = googleApiManager3.zar;
            handler3.sendMessageDelayed(Message.obtain(handler4, 16, zabsVar), 120000L);
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
        Object obj;
        zaae zaaeVar;
        Set set;
        zaae zaaeVar2;
        obj = GoogleApiManager.zac;
        synchronized (obj) {
            try {
                GoogleApiManager googleApiManager = this.zaa;
                zaaeVar = googleApiManager.zao;
                if (zaaeVar != null) {
                    set = googleApiManager.zap;
                    if (set.contains(this.zad)) {
                        zaaeVar2 = this.zaa.zao;
                        zaaeVar2.zah(connectionResult, this.zah);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zaO(boolean z8) {
        Handler handler;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        if (this.zac.isConnected() && this.zag.isEmpty()) {
            if (this.zae.zag()) {
                if (z8) {
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

    public static /* bridge */ /* synthetic */ ApiKey zag(zabq zabqVar) {
        return zabqVar.zad;
    }

    public static /* bridge */ /* synthetic */ void zai(zabq zabqVar, Status status) {
        zabqVar.zaE(status);
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
        Handler handler;
        Handler handler2;
        Feature feature;
        Feature[] zab;
        if (zabqVar.zak.remove(zabsVar)) {
            handler = zabqVar.zaa.zar;
            handler.removeMessages(15, zabsVar);
            handler2 = zabqVar.zaa.zar;
            handler2.removeMessages(16, zabsVar);
            feature = zabsVar.zab;
            ArrayList arrayList = new ArrayList(zabqVar.zab.size());
            for (zai zaiVar : zabqVar.zab) {
                if ((zaiVar instanceof zac) && (zab = ((zac) zaiVar).zab(zabqVar)) != null && ArrayUtils.contains(zab, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                zai zaiVar2 = (zai) arrayList.get(i9);
                zabqVar.zab.remove(zaiVar2);
                zaiVar2.zae(new UnsupportedApiCallException(feature));
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zay(zabq zabqVar, boolean z8) {
        return zabqVar.zaO(false);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Handler handler;
        Handler handler2;
        GoogleApiManager googleApiManager = this.zaa;
        Looper myLooper = Looper.myLooper();
        handler = googleApiManager.zar;
        if (myLooper == handler.getLooper()) {
            zaH();
        } else {
            handler2 = this.zaa.zar;
            handler2.post(new zabm(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i9) {
        Handler handler;
        Handler handler2;
        GoogleApiManager googleApiManager = this.zaa;
        Looper myLooper = Looper.myLooper();
        handler = googleApiManager.zar;
        if (myLooper == handler.getLooper()) {
            zaI(i9);
        } else {
            handler2 = this.zaa.zar;
            handler2.post(new zabn(this, i9));
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
    public final void zaa(ConnectionResult connectionResult, Api api, boolean z8) {
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
        Handler handler;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        return this.zal;
    }

    public final Api.Client zaf() {
        return this.zac;
    }

    public final Map zah() {
        return this.zag;
    }

    public final void zan() {
        Handler handler;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        this.zal = null;
    }

    public final void zao() {
        Handler handler;
        com.google.android.gms.common.internal.zal zalVar;
        Context context;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        if (!this.zac.isConnected() && !this.zac.isConnecting()) {
            try {
                GoogleApiManager googleApiManager = this.zaa;
                zalVar = googleApiManager.zak;
                context = googleApiManager.zai;
                int zab = zalVar.zab(context, this.zac);
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
                } catch (SecurityException e4) {
                    zar(new ConnectionResult(10), e4);
                }
            } catch (IllegalStateException e9) {
                zar(new ConnectionResult(10), e9);
            }
        }
    }

    public final void zap(zai zaiVar) {
        Handler handler;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
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
        Handler handler;
        com.google.android.gms.common.internal.zal zalVar;
        boolean z8;
        Status zaF;
        Status zaF2;
        Status zaF3;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        zact zactVar = this.zai;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        zalVar = this.zaa.zak;
        zalVar.zac();
        zaD(connectionResult);
        if ((this.zac instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            this.zaa.zaf = true;
            GoogleApiManager googleApiManager = this.zaa;
            handler5 = googleApiManager.zar;
            handler6 = googleApiManager.zar;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            status = GoogleApiManager.zab;
            zaE(status);
            return;
        }
        if (this.zab.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        if (exc != null) {
            handler4 = this.zaa.zar;
            Preconditions.checkHandlerThread(handler4);
            zaF(null, exc, false);
            return;
        }
        z8 = this.zaa.zas;
        if (z8) {
            zaF2 = GoogleApiManager.zaF(this.zad, connectionResult);
            zaF(zaF2, null, true);
            if (!this.zab.isEmpty() && !zaN(connectionResult) && !this.zaa.zaE(connectionResult, this.zah)) {
                if (connectionResult.getErrorCode() == 18) {
                    this.zaj = true;
                }
                if (this.zaj) {
                    GoogleApiManager googleApiManager2 = this.zaa;
                    ApiKey apiKey = this.zad;
                    handler2 = googleApiManager2.zar;
                    handler3 = googleApiManager2.zar;
                    handler2.sendMessageDelayed(Message.obtain(handler3, 9, apiKey), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                    return;
                }
                zaF3 = GoogleApiManager.zaF(this.zad, connectionResult);
                zaE(zaF3);
                return;
            }
            return;
        }
        zaF = GoogleApiManager.zaF(this.zad, connectionResult);
        zaE(zaF);
    }

    public final void zas(@NonNull ConnectionResult connectionResult) {
        Handler handler;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        Api.Client client = this.zac;
        client.disconnect("onSignInFailed for " + client.getClass().getName() + " with " + String.valueOf(connectionResult));
        zar(connectionResult, null);
    }

    public final void zat(zal zalVar) {
        Handler handler;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        this.zaf.add(zalVar);
    }

    public final void zau() {
        Handler handler;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        if (this.zaj) {
            zao();
        }
    }

    public final void zav() {
        Handler handler;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
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
        Handler handler;
        GoogleApiAvailability googleApiAvailability;
        Context context;
        Status status;
        handler = this.zaa.zar;
        Preconditions.checkHandlerThread(handler);
        if (this.zaj) {
            zaL();
            GoogleApiManager googleApiManager = this.zaa;
            googleApiAvailability = googleApiManager.zaj;
            context = googleApiManager.zai;
            if (googleApiAvailability.isGooglePlayServicesAvailable(context) == 18) {
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
