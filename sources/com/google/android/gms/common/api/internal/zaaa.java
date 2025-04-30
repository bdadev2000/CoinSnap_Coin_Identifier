package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import x.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaaa implements zaca {
    private final Context zaa;
    private final zabe zab;
    private final Looper zac;
    private final zabi zad;
    private final zabi zae;
    private final Map zaf;

    @Nullable
    private final Api.Client zah;

    @Nullable
    private Bundle zai;
    private final Lock zam;
    private final Set zag = Collections.newSetFromMap(new WeakHashMap());

    @Nullable
    private ConnectionResult zaj = null;

    @Nullable
    private ConnectionResult zak = null;
    private boolean zal = false;
    private int zan = 0;

    /* JADX WARN: Type inference failed for: r1v5, types: [x.l, java.util.Map] */
    private zaaa(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, @Nullable Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.zaa = context;
        this.zab = zabeVar;
        this.zam = lock;
        this.zac = looper;
        this.zah = client;
        this.zad = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new zax(this, null));
        this.zae = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new zaz(this, null));
        ?? lVar = new l();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            lVar.put((Api.AnyClientKey) it.next(), this.zad);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            lVar.put((Api.AnyClientKey) it2.next(), this.zae);
        }
        this.zaf = Collections.unmodifiableMap(lVar);
    }

    private final void zaA(ConnectionResult connectionResult) {
        int i9 = this.zan;
        if (i9 != 1) {
            if (i9 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.zan = 0;
            }
            this.zab.zaa(connectionResult);
        }
        zaB();
        this.zan = 0;
    }

    private final void zaB() {
        Iterator it = this.zag.iterator();
        while (it.hasNext()) {
            ((SignInConnectionListener) it.next()).onComplete();
        }
        this.zag.clear();
    }

    private final boolean zaC() {
        ConnectionResult connectionResult = this.zak;
        if (connectionResult != null && connectionResult.getErrorCode() == 4) {
            return true;
        }
        return false;
    }

    private final boolean zaD(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabiVar = (zabi) this.zaf.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.zae);
    }

    private static boolean zaE(@Nullable ConnectionResult connectionResult) {
        if (connectionResult != null && connectionResult.isSuccess()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [x.l, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v0, types: [x.l, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [x.l, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [x.l, java.util.Map] */
    public static zaaa zag(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        ?? lVar = new l();
        ?? lVar2 = new l();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                lVar.put((Api.AnyClientKey) entry.getKey(), client2);
            } else {
                lVar2.put((Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        Preconditions.checkState(!lVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ?? lVar3 = new l();
        ?? lVar4 = new l();
        for (Api api : map2.keySet()) {
            Api.AnyClientKey zab = api.zab();
            if (lVar.containsKey(zab)) {
                lVar3.put(api, (Boolean) map2.get(api));
            } else if (lVar2.containsKey(zab)) {
                lVar4.put(api, (Boolean) map2.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            zat zatVar = (zat) arrayList.get(i9);
            if (lVar3.containsKey(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else if (lVar4.containsKey(zatVar.zaa)) {
                arrayList3.add(zatVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zaaa(context, zabeVar, lock, looper, googleApiAvailabilityLight, lVar, lVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, lVar3, lVar4);
    }

    public static /* bridge */ /* synthetic */ void zan(zaaa zaaaVar, int i9, boolean z8) {
        zaaaVar.zab.zac(i9, z8);
        zaaaVar.zak = null;
        zaaaVar.zaj = null;
    }

    public static /* bridge */ /* synthetic */ void zao(zaaa zaaaVar, Bundle bundle) {
        Bundle bundle2 = zaaaVar.zai;
        if (bundle2 == null) {
            zaaaVar.zai = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void zap(zaaa zaaaVar) {
        ConnectionResult connectionResult;
        if (zaE(zaaaVar.zaj)) {
            if (!zaE(zaaaVar.zak) && !zaaaVar.zaC()) {
                ConnectionResult connectionResult2 = zaaaVar.zak;
                if (connectionResult2 != null) {
                    if (zaaaVar.zan == 1) {
                        zaaaVar.zaB();
                        return;
                    } else {
                        zaaaVar.zaA(connectionResult2);
                        zaaaVar.zad.zar();
                        return;
                    }
                }
                return;
            }
            int i9 = zaaaVar.zan;
            if (i9 != 1) {
                if (i9 != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    zaaaVar.zan = 0;
                    return;
                }
                ((zabe) Preconditions.checkNotNull(zaaaVar.zab)).zab(zaaaVar.zai);
            }
            zaaaVar.zaB();
            zaaaVar.zan = 0;
            return;
        }
        if (zaaaVar.zaj != null && zaE(zaaaVar.zak)) {
            zaaaVar.zae.zar();
            zaaaVar.zaA((ConnectionResult) Preconditions.checkNotNull(zaaaVar.zaj));
            return;
        }
        ConnectionResult connectionResult3 = zaaaVar.zaj;
        if (connectionResult3 != null && (connectionResult = zaaaVar.zak) != null) {
            if (zaaaVar.zae.zaf < zaaaVar.zad.zaf) {
                connectionResult3 = connectionResult;
            }
            zaaaVar.zaA(connectionResult3);
        }
    }

    @Nullable
    private final PendingIntent zaz() {
        Api.Client client = this.zah;
        if (client == null) {
            return null;
        }
        return PendingIntent.getActivity(this.zaa, System.identityHashCode(this.zab), client.getSignInIntent(), com.google.android.gms.internal.base.zap.zaa | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long j7, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @Nullable
    public final ConnectionResult zad(@NonNull Api api) {
        if (Objects.equal(this.zaf.get(api.zab()), this.zae)) {
            if (zaC()) {
                return new ConnectionResult(4, zaz());
            }
            return this.zae.zad(api);
        }
        return this.zad.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zae(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (zaD(apiMethodImpl)) {
            if (zaC()) {
                apiMethodImpl.setFailedResult(new Status(4, (String) null, zaz()));
                return apiMethodImpl;
            }
            this.zae.zae(apiMethodImpl);
            return apiMethodImpl;
        }
        this.zad.zae(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zaf(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (zaD(apiMethodImpl)) {
            if (zaC()) {
                apiMethodImpl.setFailedResult(new Status(4, (String) null, zaz()));
                return apiMethodImpl;
            }
            return this.zae.zaf(apiMethodImpl);
        }
        return this.zad.zaf(apiMethodImpl);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zaq();
        this.zae.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zar();
        this.zae.zar();
        zaB();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.zae.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.zad.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        this.zad.zat();
        this.zae.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        this.zam.lock();
        try {
            boolean zax = zax();
            this.zae.zar();
            this.zak = new ConnectionResult(4);
            if (zax) {
                new com.google.android.gms.internal.base.zau(this.zac).post(new zav(this));
            } else {
                zaB();
            }
            this.zam.unlock();
        } catch (Throwable th) {
            this.zam.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.zan == 1) goto L11;
     */
    @Override // com.google.android.gms.common.api.internal.zaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zaw() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.lock()
            com.google.android.gms.common.api.internal.zabi r0 = r3.zad     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.zabi r0 = r3.zae     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.zaC()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            int r0 = r3.zan     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L25
        L21:
            r1 = r2
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.unlock()
            return r1
        L2b:
            java.util.concurrent.locks.Lock r1 = r3.zam
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaaa.zaw():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        boolean z8;
        this.zam.lock();
        try {
            if (this.zan == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            return z8;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        this.zam.lock();
        try {
            boolean z8 = false;
            if (!zax()) {
                if (zaw()) {
                }
                this.zam.unlock();
                return z8;
            }
            if (!this.zae.zaw()) {
                this.zag.add(signInConnectionListener);
                z8 = true;
                if (this.zan == 0) {
                    this.zan = 1;
                }
                this.zak = null;
                this.zae.zaq();
            }
            this.zam.unlock();
            return z8;
        } catch (Throwable th) {
            this.zam.unlock();
            throw th;
        }
    }
}
