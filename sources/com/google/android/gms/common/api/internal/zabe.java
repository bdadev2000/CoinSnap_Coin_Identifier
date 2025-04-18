package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
public final class zabe extends GoogleApiClient implements zabz {

    @Nullable
    zabx zab;
    final Map zac;
    Set zad;
    final ClientSettings zae;
    final Map zaf;
    final Api.AbstractClientBuilder zag;

    @Nullable
    Set zah;
    final zadc zai;
    private final Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;
    private final int zam;
    private final Context zan;
    private final Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final zabc zas;
    private final GoogleApiAvailability zat;
    private final ListenerHolders zau;
    private final ArrayList zav;
    private Integer zaw;
    private final com.google.android.gms.common.internal.zaj zax;

    @Nullable
    private zaca zal = null;
    final Queue zaa = new LinkedList();

    public zabe(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder abstractClientBuilder, Map map, List list, List list2, Map map2, int i10, int i11, ArrayList arrayList) {
        long j3;
        if (true != ClientLibraryUtils.isPackageSide()) {
            j3 = 120000;
        } else {
            j3 = 10000;
        }
        this.zaq = j3;
        this.zar = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.zad = new HashSet();
        this.zau = new ListenerHolders();
        this.zaw = null;
        this.zah = null;
        zaay zaayVar = new zaay(this);
        this.zax = zaayVar;
        this.zan = context;
        this.zaj = lock;
        this.zak = new com.google.android.gms.common.internal.zak(looper, zaayVar);
        this.zao = looper;
        this.zas = new zabc(this, looper);
        this.zat = googleApiAvailability;
        this.zam = i10;
        if (i10 >= 0) {
            this.zaw = Integer.valueOf(i11);
        }
        this.zaf = map;
        this.zac = map2;
        this.zav = arrayList;
        this.zai = new zadc();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.zak.zaf((GoogleApiClient.ConnectionCallbacks) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zak.zag((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.zae = clientSettings;
        this.zag = abstractClientBuilder;
    }

    public static int zad(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            z11 |= client.requiresSignIn();
            z12 |= client.providesSignIn();
        }
        if (z11) {
            if (z12 && z10) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    public static String zag(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static /* bridge */ /* synthetic */ void zai(zabe zabeVar) {
        zabeVar.zaj.lock();
        try {
            if (zabeVar.zap) {
                zabeVar.zan();
            }
        } finally {
            zabeVar.zaj.unlock();
        }
    }

    public static /* bridge */ /* synthetic */ void zaj(zabe zabeVar) {
        zabeVar.zaj.lock();
        try {
            if (zabeVar.zak()) {
                zabeVar.zan();
            }
        } finally {
            zabeVar.zaj.unlock();
        }
    }

    private final void zal(int i10) {
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            throw new IllegalStateException("Cannot use sign-in mode: " + zag(i10) + ". Mode was already set to " + zag(this.zaw.intValue()));
        }
        if (this.zal != null) {
            return;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (Api.Client client : this.zac.values()) {
            z10 |= client.requiresSignIn();
            z11 |= client.providesSignIn();
        }
        int intValue = this.zaw.intValue();
        if (intValue != 1) {
            if (intValue == 2 && z10) {
                this.zal = zaaa.zag(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
                return;
            }
        } else if (z10) {
            if (z11) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.zal = new zabi(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zam(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z10) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new zabb(this, statusPendingResult, z10, googleApiClient));
    }

    private final void zan() {
        this.zak.zab();
        ((zaca) Preconditions.checkNotNull(this.zal)).zaq();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final ConnectionResult blockingConnect() {
        boolean z10 = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaj.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw == null) {
                    z10 = false;
                }
                Preconditions.checkState(z10, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            zal(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            return ((zaca) Preconditions.checkNotNull(this.zal)).zab();
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.zaw;
        boolean z10 = true;
        if (num != null && num.intValue() == 2) {
            z10 = false;
        }
        Preconditions.checkState(z10, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.zac.containsKey(Common.CLIENT_KEY)) {
            zam(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            zaaz zaazVar = new zaaz(this, atomicReference, statusPendingResult);
            zaba zabaVar = new zaba(this, statusPendingResult);
            GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.zan);
            builder.addApi(Common.API);
            builder.addConnectionCallbacks(zaazVar);
            builder.addOnConnectionFailedListener(zabaVar);
            builder.setHandler(this.zas);
            GoogleApiClient build = builder.build();
            atomicReference.set(build);
            build.connect();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.zaj.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.zam >= 0) {
                Preconditions.checkState(this.zaw != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) Preconditions.checkNotNull(this.zaw)).intValue();
            this.zaj.lock();
            if (intValue == 3 || intValue == 1) {
                i10 = intValue;
            } else if (intValue != 2) {
                i10 = intValue;
                Preconditions.checkArgument(z10, "Illegal sign-in mode: " + i10);
                zal(i10);
                zan();
                this.zaj.unlock();
            }
            z10 = true;
            Preconditions.checkArgument(z10, "Illegal sign-in mode: " + i10);
            zal(i10);
            zan();
            this.zaj.unlock();
        } catch (Throwable th2) {
            throw th2;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.zaj.lock();
        try {
            this.zai.zab();
            zaca zacaVar = this.zal;
            if (zacaVar != null) {
                zacaVar.zar();
            }
            this.zau.zab();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.zaa) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            this.zaa.clear();
            if (this.zal != null) {
                zak();
                this.zak.zaa();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.zan);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.zap);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        zaca zacaVar = this.zal;
        if (zacaVar != null) {
            zacaVar.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t5) {
        String str;
        Api<?> api = t5.getApi();
        boolean containsKey = this.zac.containsKey(t5.getClientKey());
        if (api != null) {
            str = api.zad();
        } else {
            str = "the API";
        }
        Preconditions.checkArgument(containsKey, "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.zaj.lock();
        try {
            zaca zacaVar = this.zal;
            if (zacaVar == null) {
                this.zaa.add(t5);
            } else {
                t5 = (T) zacaVar.zae(t5);
            }
            return t5;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t5) {
        String str;
        Map map = this.zac;
        Api<?> api = t5.getApi();
        boolean containsKey = map.containsKey(t5.getClientKey());
        if (api != null) {
            str = api.zad();
        } else {
            str = "the API";
        }
        Preconditions.checkArgument(containsKey, "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.zaj.lock();
        try {
            zaca zacaVar = this.zal;
            if (zacaVar != null) {
                if (this.zap) {
                    this.zaa.add(t5);
                    while (!this.zaa.isEmpty()) {
                        BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) this.zaa.remove();
                        this.zai.zaa(apiMethodImpl);
                        apiMethodImpl.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                    }
                } else {
                    t5 = (T) zacaVar.zaf(t5);
                }
                return t5;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        C c10 = (C) this.zac.get(anyClientKey);
        Preconditions.checkNotNull(c10, "Appropriate Api was not requested.");
        return c10;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        ConnectionResult connectionResult;
        this.zaj.lock();
        try {
            if (!isConnected() && !this.zap) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (this.zac.containsKey(api.zab())) {
                ConnectionResult zad = ((zaca) Preconditions.checkNotNull(this.zal)).zad(api);
                if (zad == null) {
                    if (this.zap) {
                        connectionResult = ConnectionResult.RESULT_SUCCESS;
                    } else {
                        Log.w("GoogleApiClientImpl", zaf());
                        Log.wtf("GoogleApiClientImpl", api.zad() + " requested in getConnectionResult is not connected but is not present in the failed  connections map", new Exception());
                        connectionResult = new ConnectionResult(8, null);
                    }
                    return connectionResult;
                }
                return zad;
            }
            throw new IllegalArgumentException(api.zad() + " was never registered with GoogleApiClient");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.zao;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@NonNull Api<?> api) {
        return this.zac.containsKey(api.zab());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Api.Client client;
        if (!isConnected() || (client = (Api.Client) this.zac.get(api.zab())) == null || !client.isConnected()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zaw();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zax();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zaj(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zay(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zaca zacaVar = this.zal;
        if (zacaVar != null) {
            zacaVar.zau();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zag(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(@NonNull L l10) {
        this.zaj.lock();
        try {
            return this.zau.zaa(l10, this.zao, "NO_TYPE");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.zam >= 0) {
            zak.zaa(lifecycleActivity).zae(this.zam);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, connectionResult.getErrorCode())) {
            zak();
        }
        if (!this.zap) {
            this.zak.zac(connectionResult);
            this.zak.zaa();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(@Nullable Bundle bundle) {
        while (!this.zaa.isEmpty()) {
            execute((BaseImplementation.ApiMethodImpl) this.zaa.remove());
        }
        this.zak.zad(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.zap) {
                this.zap = true;
                if (this.zab == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.zab = this.zat.zac(this.zan.getApplicationContext(), new zabd(this));
                    } catch (SecurityException unused) {
                    }
                }
                zabc zabcVar = this.zas;
                zabcVar.sendMessageDelayed(zabcVar.obtainMessage(1), this.zaq);
                zabc zabcVar2 = this.zas;
                zabcVar2.sendMessageDelayed(zabcVar2.obtainMessage(2), this.zar);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zai.zab.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zadc.zaa);
        }
        this.zak.zae(i10);
        this.zak.zaa();
        if (i10 == 2) {
            zan();
        }
    }

    public final String zaf() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @ResultIgnorabilityUnspecified
    public final boolean zak() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        this.zas.removeMessages(2);
        this.zas.removeMessages(1);
        zabx zabxVar = this.zab;
        if (zabxVar != null) {
            zabxVar.zab();
            this.zab = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zadaVar) {
        this.zaj.lock();
        try {
            if (this.zah == null) {
                this.zah = new HashSet();
            }
            this.zah.add(zadaVar);
        } finally {
            this.zaj.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r3 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        throw r3;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zap(com.google.android.gms.common.api.internal.zada r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.lock()
            java.util.Set r0 = r2.zah     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L16
            java.lang.String r3 = "Attempted to remove pending transform when no transforms are registered."
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            android.util.Log.wtf(r1, r3, r0)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L16:
            boolean r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L27
            java.lang.String r3 = "Failed to remove pending transform - this may lead to memory leaks!"
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            android.util.Log.wtf(r1, r3, r0)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L27:
            java.util.concurrent.locks.Lock r3 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r3.lock()     // Catch: java.lang.Throwable -> L57
            java.util.Set r3 = r2.zah     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto L36
            java.util.concurrent.locks.Lock r3 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r3.unlock()     // Catch: java.lang.Throwable -> L57
            goto L43
        L36:
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L50
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L4a
        L43:
            com.google.android.gms.common.api.internal.zaca r3 = r2.zal     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L4a
            r3.zat()     // Catch: java.lang.Throwable -> L57
        L4a:
            java.util.concurrent.locks.Lock r3 = r2.zaj
            r3.unlock()
            return
        L50:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zaj     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            throw r3     // Catch: java.lang.Throwable -> L57
        L57:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabe.zap(com.google.android.gms.common.api.internal.zada):void");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j3, @NonNull TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.zaj.lock();
        try {
            Integer num = this.zaw;
            if (num == null) {
                this.zaw = Integer.valueOf(zad(this.zac.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zal(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            return ((zaca) Preconditions.checkNotNull(this.zal)).zac(j3, timeUnit);
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i10) {
        this.zaj.lock();
        boolean z10 = true;
        if (i10 != 3 && i10 != 1) {
            if (i10 == 2) {
                i10 = 2;
            } else {
                z10 = false;
            }
        }
        try {
            Preconditions.checkArgument(z10, "Illegal sign-in mode: " + i10);
            zal(i10);
            zan();
        } finally {
            this.zaj.unlock();
        }
    }
}
