package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import eb.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import r.c;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class GoogleApiManager implements Handler.Callback {

    @NonNull
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    private static final Object zac = new Object();

    @Nullable
    private static GoogleApiManager zad;

    @Nullable
    private TelemetryData zag;

    @Nullable
    private TelemetryLoggingClient zah;
    private final Context zai;
    private final GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;
    private final Handler zar;
    private volatile boolean zas;
    private long zae = 10000;
    private boolean zaf = false;
    private final AtomicInteger zal = new AtomicInteger(1);
    private final AtomicInteger zam = new AtomicInteger(0);
    private final Map zan = new ConcurrentHashMap(5, 0.75f, 1);

    @Nullable
    private zaae zao = null;
    private final Set zap = new c(0);
    private final Set zaq = new c(0);

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zas = true;
        this.zai = context;
        com.google.android.gms.internal.base.zau zauVar = new com.google.android.gms.internal.base.zau(looper, this);
        this.zar = zauVar;
        this.zaj = googleApiAvailability;
        this.zak = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zas = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (zac) {
            GoogleApiManager googleApiManager = zad;
            if (googleApiManager != null) {
                googleApiManager.zam.incrementAndGet();
                Handler handler = googleApiManager.zar;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    public static Status zaF(ApiKey apiKey, ConnectionResult connectionResult) {
        return new Status(connectionResult, j.l("API: ", apiKey.zaa(), " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)));
    }

    @ResultIgnorabilityUnspecified
    private final zabq zaG(GoogleApi googleApi) {
        Map map = this.zan;
        ApiKey apiKey = googleApi.getApiKey();
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq(this, googleApi);
            this.zan.put(apiKey, zabqVar);
        }
        if (zabqVar.zaA()) {
            this.zaq.add(apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    private final TelemetryLoggingClient zaH() {
        if (this.zah == null) {
            this.zah = TelemetryLogging.getClient(this.zai);
        }
        return this.zah;
    }

    private final void zaI() {
        TelemetryData telemetryData = this.zag;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaD()) {
                zaH().log(telemetryData);
            }
            this.zag = null;
        }
    }

    private final void zaJ(TaskCompletionSource taskCompletionSource, int i10, GoogleApi googleApi) {
        zacd zaa2;
        if (i10 != 0 && (zaa2 = zacd.zaa(this, i10, googleApi.getApiKey())) != null) {
            Task task = taskCompletionSource.getTask();
            final Handler handler = this.zar;
            handler.getClass();
            task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, zaa2);
        }
    }

    public static /* bridge */ /* synthetic */ Handler zad(GoogleApiManager googleApiManager) {
        return googleApiManager.zar;
    }

    @NonNull
    public static GoogleApiManager zaj() {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public static GoogleApiManager zak(@NonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            if (zad == null) {
                zad = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        ApiKey apiKey;
        boolean zaO;
        ApiKey apiKey2;
        ApiKey apiKey3;
        ApiKey apiKey4;
        ApiKey apiKey5;
        int i10 = message.what;
        long j3 = 300000;
        zabq zabqVar = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j3 = 10000;
                }
                this.zae = j3;
                this.zar.removeMessages(12);
                for (ApiKey apiKey6 : this.zan.keySet()) {
                    Handler handler = this.zar;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey6), this.zae);
                }
                return true;
            case 2:
                zal zalVar = (zal) message.obj;
                Iterator it = zalVar.zab().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ApiKey apiKey7 = (ApiKey) it.next();
                        zabq zabqVar2 = (zabq) this.zan.get(apiKey7);
                        if (zabqVar2 == null) {
                            zalVar.zac(apiKey7, new ConnectionResult(13), null);
                        } else if (zabqVar2.zaz()) {
                            zalVar.zac(apiKey7, ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                        } else {
                            ConnectionResult zad2 = zabqVar2.zad();
                            if (zad2 != null) {
                                zalVar.zac(apiKey7, zad2, null);
                            } else {
                                zabqVar2.zat(zalVar);
                                zabqVar2.zao();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (zabq zabqVar3 : this.zan.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq zabqVar4 = (zabq) this.zan.get(zachVar.zac.getApiKey());
                if (zabqVar4 == null) {
                    zabqVar4 = zaG(zachVar.zac);
                }
                if (zabqVar4.zaA() && this.zam.get() != zachVar.zab) {
                    zachVar.zaa.zad(zaa);
                    zabqVar4.zav();
                } else {
                    zabqVar4.zap(zachVar.zaa);
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.zan.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabq zabqVar5 = (zabq) it2.next();
                        if (zabqVar5.zab() == i11) {
                            zabqVar = zabqVar5;
                        }
                    }
                }
                if (zabqVar != null) {
                    if (connectionResult.getErrorCode() == 13) {
                        zabqVar.zaE(new Status(17, j.l("Error resolution was canceled by the user, original error message: ", this.zaj.getErrorString(connectionResult.getErrorCode()), ": ", connectionResult.getErrorMessage())));
                    } else {
                        apiKey = zabqVar.zad;
                        zabqVar.zaE(zaF(apiKey, connectionResult));
                    }
                } else {
                    Log.wtf("GoogleApiManager", a.i("Could not find API instance ", i11, " while trying to fail enqueued calls."), new Exception());
                }
                return true;
            case 6:
                if (this.zai.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zai.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabl(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = 300000L;
                    }
                }
                return true;
            case 7:
                zaG((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zau();
                }
                return true;
            case 10:
                Iterator it3 = this.zaq.iterator();
                while (it3.hasNext()) {
                    zabq zabqVar6 = (zabq) this.zan.remove((ApiKey) it3.next());
                    if (zabqVar6 != null) {
                        zabqVar6.zav();
                    }
                }
                this.zaq.clear();
                return true;
            case 11:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zaB();
                }
                return true;
            case 14:
                zaaf zaafVar = (zaaf) message.obj;
                ApiKey zaa2 = zaafVar.zaa();
                if (!this.zan.containsKey(zaa2)) {
                    zaafVar.zab().setResult(Boolean.FALSE);
                } else {
                    zaO = ((zabq) this.zan.get(zaa2)).zaO(false);
                    zaafVar.zab().setResult(Boolean.valueOf(zaO));
                }
                return true;
            case 15:
                zabs zabsVar = (zabs) message.obj;
                Map map = this.zan;
                apiKey2 = zabsVar.zaa;
                if (map.containsKey(apiKey2)) {
                    Map map2 = this.zan;
                    apiKey3 = zabsVar.zaa;
                    zabq.zal((zabq) map2.get(apiKey3), zabsVar);
                }
                return true;
            case 16:
                zabs zabsVar2 = (zabs) message.obj;
                Map map3 = this.zan;
                apiKey4 = zabsVar2.zaa;
                if (map3.containsKey(apiKey4)) {
                    Map map4 = this.zan;
                    apiKey5 = zabsVar2.zaa;
                    zabq.zam((zabq) map4.get(apiKey5), zabsVar2);
                }
                return true;
            case 17:
                zaI();
                return true;
            case 18:
                zace zaceVar = (zace) message.obj;
                if (zaceVar.zac == 0) {
                    zaH().log(new TelemetryData(zaceVar.zab, Arrays.asList(zaceVar.zaa)));
                } else {
                    TelemetryData telemetryData = this.zag;
                    if (telemetryData != null) {
                        List zab2 = telemetryData.zab();
                        if (telemetryData.zaa() == zaceVar.zab && (zab2 == null || zab2.size() < zaceVar.zad)) {
                            this.zag.zac(zaceVar.zaa);
                        } else {
                            this.zar.removeMessages(17);
                            zaI();
                        }
                    }
                    if (this.zag == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zaceVar.zaa);
                        this.zag = new TelemetryData(zaceVar.zab, arrayList);
                        Handler handler2 = this.zar;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaceVar.zac);
                    }
                }
                return true;
            case 19:
                this.zaf = false;
                return true;
            default:
                j.v("Unknown message id: ", i10, "GoogleApiManager");
                return false;
        }
    }

    public final void zaA(@NonNull zaae zaaeVar) {
        synchronized (zac) {
            if (this.zao != zaaeVar) {
                this.zao = zaaeVar;
                this.zap.clear();
            }
            this.zap.addAll(zaaeVar.zaa());
        }
    }

    public final void zaB(@NonNull zaae zaaeVar) {
        synchronized (zac) {
            if (this.zao == zaaeVar) {
                this.zao = null;
                this.zap.clear();
            }
        }
    }

    public final boolean zaD() {
        if (this.zaf) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zaa2 = this.zak.zaa(this.zai, 203400000);
        if (zaa2 != -1 && zaa2 != 0) {
            return false;
        }
        return true;
    }

    @ResultIgnorabilityUnspecified
    public final boolean zaE(ConnectionResult connectionResult, int i10) {
        return this.zaj.zah(this.zai, connectionResult, i10);
    }

    public final int zaa() {
        return this.zal.getAndIncrement();
    }

    @Nullable
    public final zabq zai(ApiKey apiKey) {
        return (zabq) this.zan.get(apiKey);
    }

    @NonNull
    public final Task zam(@NonNull Iterable iterable) {
        zal zalVar = new zal(iterable);
        this.zar.sendMessage(this.zar.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public final Task zan(@NonNull GoogleApi googleApi) {
        zaaf zaafVar = new zaaf(googleApi.getApiKey());
        this.zar.sendMessage(this.zar.obtainMessage(14, zaafVar));
        return zaafVar.zab().getTask();
    }

    @NonNull
    public final Task zao(@NonNull GoogleApi googleApi, @NonNull RegisterListenerMethod registerListenerMethod, @NonNull UnregisterListenerMethod unregisterListenerMethod, @NonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaJ(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(8, new zach(new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource), this.zam.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public final Task zap(@NonNull GoogleApi googleApi, @NonNull ListenerHolder.ListenerKey listenerKey, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaJ(taskCompletionSource, i10, googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(13, new zach(new zah(listenerKey, taskCompletionSource), this.zam.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final void zau(@NonNull GoogleApi googleApi, int i10, @NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zar.sendMessage(this.zar.obtainMessage(4, new zach(new zae(i10, apiMethodImpl), this.zam.get(), googleApi)));
    }

    public final void zav(@NonNull GoogleApi googleApi, int i10, @NonNull TaskApiCall taskApiCall, @NonNull TaskCompletionSource taskCompletionSource, @NonNull StatusExceptionMapper statusExceptionMapper) {
        zaJ(taskCompletionSource, taskApiCall.zaa(), googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(4, new zach(new zag(i10, taskApiCall, taskCompletionSource, statusExceptionMapper), this.zam.get(), googleApi)));
    }

    public final void zaw(MethodInvocation methodInvocation, int i10, long j3, int i11) {
        this.zar.sendMessage(this.zar.obtainMessage(18, new zace(methodInvocation, i10, j3, i11)));
    }

    public final void zax(@NonNull ConnectionResult connectionResult, int i10) {
        if (!zaE(connectionResult, i10)) {
            Handler handler = this.zar;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
        }
    }

    public final void zay() {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaz(@NonNull GoogleApi googleApi) {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }
}
