package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzboy;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzfxf;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes3.dex */
public final class zzex {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzex zzb;
    private zzci zze;
    private zzcz zzj;
    private final Object zzc = new Object();
    private final Object zzd = new Object();
    private boolean zzg = false;
    private boolean zzh = false;
    private final Object zzi = new Object();

    @Nullable
    private OnAdInspectorClosedListener zzk = null;

    @NonNull
    private RequestConfiguration zzl = new RequestConfiguration.Builder().build();
    private final ArrayList zzf = new ArrayList();

    private zzex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzA(List list) {
        AdapterStatus.State state;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzblp zzblpVar = (zzblp) it.next();
            String str = zzblpVar.zza;
            if (zzblpVar.zzb) {
                state = AdapterStatus.State.READY;
            } else {
                state = AdapterStatus.State.NOT_READY;
            }
            hashMap.put(str, new zzblx(state, zzblpVar.zzd, zzblpVar.zzc));
        }
        return new zzbly(hashMap);
    }

    private final void zzB(Context context, @Nullable String str) {
        try {
            zzboy.zza().zzb(context, null);
            this.zzj.zzk();
            this.zzj.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("MobileAdsSettingManager initialization failed", e2);
        }
    }

    private final void zzC(Context context) {
        if (this.zzj == null) {
            this.zzj = (zzcz) new zzav(zzbc.zza(), context).zzd(context, false);
        }
    }

    private final void zzD(@NonNull RequestConfiguration requestConfiguration) {
        try {
            this.zzj.zzu(new zzfv(requestConfiguration));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set request configuration parcel.", e2);
        }
    }

    public static zzex zzf() {
        zzex zzexVar;
        synchronized (zzex.class) {
            if (zzb == null) {
                zzb = new zzex();
            }
            zzexVar = zzb;
        }
        return zzexVar;
    }

    public static /* bridge */ /* synthetic */ Optional zzk(zzex zzexVar, zzft zzftVar) {
        String str = zzftVar.zza;
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return Optional.empty();
        }
        zzm zzmVar = zzftVar.zzc;
        final AdRequest.Builder builder = new AdRequest.Builder();
        List list = zzmVar.zze;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.addKeyword((String) it.next());
            }
        }
        builder.zzc(zzmVar.zzm);
        for (String str2 : zzmVar.zzn.keySet()) {
            builder.addCustomTargeting(str2, zzmVar.zzn.getString(str2));
        }
        builder.setAdString(zzmVar.zzx);
        Optional.ofNullable(zzmVar.zzl).ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AdRequest.Builder.this.setContentUrl((String) obj);
            }
        });
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        AdRequest build = builder.build();
        PreloadConfiguration.Builder builder2 = new PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(build);
        builder2.setBufferSize(zzftVar.zzd);
        return Optional.of(builder2.build());
    }

    public final float zza() {
        synchronized (this.zzi) {
            zzcz zzczVar = this.zzj;
            float f10 = 1.0f;
            if (zzczVar == null) {
                return 1.0f;
            }
            try {
                f10 = zzczVar.zze();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get app volume.", e2);
            }
            return f10;
        }
    }

    @NonNull
    public final RequestConfiguration zzc() {
        return this.zzl;
    }

    public final InitializationStatus zze() {
        boolean z10;
        InitializationStatus zzA;
        synchronized (this.zzi) {
            if (this.zzj != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                zzA = zzA(this.zzj.zzg());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzem
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzet(zzex.this));
                        return hashMap;
                    }
                };
            }
        }
        return zzA;
    }

    public final Status zzg(@NonNull Context context, @NonNull List list, @NonNull PreloadCallback preloadCallback) {
        boolean z10;
        Status status;
        int bufferSize;
        int intValue;
        int intValue2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String m10 = a.m(String.valueOf(preloadConfiguration.getAdFormat()), "#", preloadConfiguration.getAdUnitId());
            hashMap.put(m10, Integer.valueOf(((Integer) hashMap.getOrDefault(m10, 0)).intValue() + 1));
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                    hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (!zza.contains(preloadConfiguration2.getAdFormat())) {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            } else {
                hashMap2.compute(adFormat, new BiFunction() { // from class: com.google.android.gms.ads.internal.client.zzen
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        Integer num = (Integer) obj2;
                        Set set = zzex.zza;
                        int i10 = 1;
                        if (num != null) {
                            i10 = 1 + num.intValue();
                        }
                        return Integer.valueOf(i10);
                    }
                });
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, adFormat.name()));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", adFormat.name()));
                }
            }
            z10 = true;
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AdFormat.APP_OPEN_AD, (Integer) zzbe.zzc().zza(zzbcn.zzeA)), new AbstractMap.SimpleEntry(AdFormat.INTERSTITIAL, (Integer) zzbe.zzc().zza(zzbcn.zzey)), new AbstractMap.SimpleEntry(AdFormat.REWARDED, (Integer) zzbe.zzc().zza(zzbcn.zzez))};
        HashMap hashMap3 = new HashMap(3);
        for (int i10 = 0; i10 < 3; i10++) {
            Map.Entry entry = entryArr[i10];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (hashMap3.put(key, value) != null) {
                key.toString();
                throw new IllegalArgumentException("duplicate key: ".concat(String.valueOf(key)));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry2.getKey();
            int intValue3 = ((Integer) entry2.getValue()).intValue();
            int intValue4 = ((Integer) unmodifiableMap.getOrDefault(adFormat2, 0)).intValue();
            if (intValue3 > intValue4) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", Integer.valueOf(intValue4), adFormat2.name()));
                z10 = true;
            }
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb2.append((String) it4.next());
                if (it4.hasNext()) {
                    sb2.append(", ");
                }
            }
            String sb3 = sb2.toString();
            com.google.android.gms.ads.internal.util.client.zzm.zzg(sb3);
            status = new Status(13, sb3);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        zzbcn.zza(context);
        synchronized (this.zzd) {
            if (this.zze == null) {
                this.zze = zzbc.zza().zzg(context, new zzbpc());
            }
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                PreloadConfiguration preloadConfiguration3 = (PreloadConfiguration) it5.next();
                zzm zza2 = zzr.zza.zza(context, preloadConfiguration3.getAdRequest().zza());
                zza2.zzc.putBoolean("is_sdk_preload", true);
                if (preloadConfiguration3.getBufferSize() <= 0) {
                    int ordinal = preloadConfiguration3.getAdFormat().ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 5) {
                                bufferSize = 1;
                            } else {
                                bufferSize = ((Integer) zzbe.zzc().zza(zzbcn.zzB)).intValue();
                            }
                        } else {
                            bufferSize = ((Integer) zzbe.zzc().zza(zzbcn.zzD)).intValue();
                        }
                    } else {
                        bufferSize = ((Integer) zzbe.zzc().zza(zzbcn.zzC)).intValue();
                    }
                } else {
                    bufferSize = preloadConfiguration3.getBufferSize();
                }
                int ordinal2 = preloadConfiguration3.getAdFormat().ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 5) {
                            intValue = 1;
                        } else {
                            intValue = ((Integer) zzbe.zzc().zza(zzbcn.zzy)).intValue();
                        }
                    } else {
                        intValue = ((Integer) zzbe.zzc().zza(zzbcn.zzA)).intValue();
                    }
                } else {
                    intValue = ((Integer) zzbe.zzc().zza(zzbcn.zzz)).intValue();
                }
                int max = Math.max(Math.min(intValue, 15), 1);
                int ordinal3 = preloadConfiguration3.getAdFormat().ordinal();
                if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        if (ordinal3 != 5) {
                            intValue2 = 1;
                        } else {
                            intValue2 = ((Integer) zzbe.zzc().zza(zzbcn.zzE)).intValue();
                        }
                    } else {
                        intValue2 = ((Integer) zzbe.zzc().zza(zzbcn.zzG)).intValue();
                    }
                } else {
                    intValue2 = ((Integer) zzbe.zzc().zza(zzbcn.zzF)).intValue();
                }
                arrayList.add(new zzft(preloadConfiguration3.getAdUnitId(), preloadConfiguration3.getAdFormat().getValue(), zza2, Math.max(Math.min(bufferSize, max), Math.min(intValue2, max))));
            }
            try {
                this.zze.zzi(arrayList, new zzes(this, preloadCallback));
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to start preload.", e2);
                return Status.RESULT_INTERNAL_ERROR;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final String zzi() {
        boolean z10;
        String zzc;
        synchronized (this.zzi) {
            if (this.zzj != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc = zzfxf.zzc(this.zzj.zzf());
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get internal version.", e2);
                return "";
            }
        }
        return zzc;
    }

    public final void zzn(Context context) {
        synchronized (this.zzi) {
            zzC(context);
            try {
                this.zzj.zzi();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzo(final Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzc) {
            if (this.zzg) {
                if (onInitializationCompleteListener != null) {
                    this.zzf.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.zzh) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
                return;
            }
            this.zzg = true;
            if (onInitializationCompleteListener != null) {
                this.zzf.add(onInitializationCompleteListener);
            }
            if (context != null) {
                synchronized (this.zzi) {
                    zzew zzewVar = null;
                    byte b3 = 0;
                    byte b10 = 0;
                    try {
                        zzC(context);
                        this.zzj.zzs(new zzev(this, zzewVar));
                        this.zzj.zzo(new zzbpc());
                        if (this.zzl.getTagForChildDirectedTreatment() != -1 || this.zzl.getTagForUnderAgeOfConsent() != -1) {
                            zzD(this.zzl);
                        }
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzk("MobileAdsSettingManager initialization failed", e2);
                    }
                    zzbcn.zza(context);
                    if (((Boolean) zzbel.zza.zze()).booleanValue()) {
                        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkO)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Initializing on bg thread");
                            ThreadPoolExecutor threadPoolExecutor = com.google.android.gms.ads.internal.util.client.zzb.zza;
                            final byte b11 = b10 == true ? 1 : 0;
                            threadPoolExecutor.execute(new Runnable(context, b11) { // from class: com.google.android.gms.ads.internal.client.zzeo
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzex.this.zzp(this.zzb, null);
                                }
                            });
                        }
                    }
                    if (((Boolean) zzbel.zzb.zze()).booleanValue()) {
                        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkO)).booleanValue()) {
                            ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                            final byte b12 = b3 == true ? 1 : 0;
                            executorService.execute(new Runnable(context, b12) { // from class: com.google.android.gms.ads.internal.client.zzep
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzex.this.zzq(this.zzb, null);
                                }
                            });
                        }
                    }
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Initializing on calling thread");
                    zzB(context, null);
                }
                return;
            }
            throw new IllegalArgumentException("Context cannot be null.");
        }
    }

    public final /* synthetic */ void zzp(Context context, String str) {
        synchronized (this.zzi) {
            zzB(context, null);
        }
    }

    public final /* synthetic */ void zzq(Context context, String str) {
        synchronized (this.zzi) {
            zzB(context, null);
        }
    }

    public final void zzr(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzi) {
            zzC(context);
            this.zzk = onAdInspectorClosedListener;
            try {
                this.zzj.zzm(new zzeu(null));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzs(Context context, String str) {
        boolean z10;
        synchronized (this.zzi) {
            if (this.zzj != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzj.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to open debug menu.", e2);
            }
        }
    }

    public final void zzt(Class cls) {
        synchronized (this.zzi) {
            try {
                this.zzj.zzh(cls.getCanonicalName());
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to register RtbAdapter", e2);
            }
        }
    }

    public final void zzu(boolean z10) {
        boolean z11;
        synchronized (this.zzi) {
            if (this.zzj != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkState(z11, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzj.zzp(z10);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set app mute state.", e2);
            }
        }
    }

    public final void zzv(float f10) {
        boolean z10;
        boolean z11 = true;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzi) {
            if (this.zzj == null) {
                z11 = false;
            }
            Preconditions.checkState(z11, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzj.zzq(f10);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set app volume.", e2);
            }
        }
    }

    public final void zzw(String str) {
        boolean z10;
        synchronized (this.zzi) {
            if (this.zzj != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzj.zzt(str);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set plugin.", e2);
            }
        }
    }

    public final void zzx(@NonNull RequestConfiguration requestConfiguration) {
        boolean z10;
        if (requestConfiguration != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "Null passed to setRequestConfiguration.");
        synchronized (this.zzi) {
            RequestConfiguration requestConfiguration2 = this.zzl;
            this.zzl = requestConfiguration;
            if (this.zzj == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzD(requestConfiguration);
            }
        }
    }

    public final boolean zzy() {
        synchronized (this.zzi) {
            zzcz zzczVar = this.zzj;
            boolean z10 = false;
            if (zzczVar == null) {
                return false;
            }
            try {
                z10 = zzczVar.zzv();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get app mute state.", e2);
            }
            return z10;
        }
    }

    public final boolean zzz(boolean z10) {
        boolean z11;
        String str;
        synchronized (this.zzi) {
            if (this.zzj != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkState(z11, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            try {
                this.zzj.zzj(z10);
            } catch (RemoteException e2) {
                if (z10) {
                    str = "enable";
                } else {
                    str = "disable";
                }
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to " + str + " the publisher first-party ID.", e2);
                return false;
            }
        }
        return true;
    }
}
