package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.input.a;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzfyo;
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
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class zzey {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzey zzb;
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

    private zzey() {
    }

    public static InitializationStatus zzA(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzblu zzbluVar = (zzblu) it.next();
            hashMap.put(zzbluVar.zza, new zzbmc(zzbluVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbluVar.zzd, zzbluVar.zzc));
        }
        return new zzbmd(hashMap);
    }

    private final void zzB(Context context, @Nullable String str) {
        try {
            zzbpd.zza().zzb(context, null);
            this.zzj.zzk();
            this.zzj.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    private final void zzC(Context context) {
        if (this.zzj == null) {
            this.zzj = (zzcz) new zzav(zzbc.zza(), context).zzd(context, false);
        }
    }

    private final void zzD(@NonNull RequestConfiguration requestConfiguration) {
        try {
            this.zzj.zzu(new zzfw(requestConfiguration));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static zzey zzf() {
        zzey zzeyVar;
        synchronized (zzey.class) {
            try {
                if (zzb == null) {
                    zzb = new zzey();
                }
                zzeyVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzeyVar;
    }

    public static /* bridge */ /* synthetic */ Optional zzk(zzey zzeyVar, zzfu zzfuVar) {
        String str = zzfuVar.zza;
        AdFormat adFormat = AdFormat.getAdFormat(zzfuVar.zzb);
        if (adFormat == null) {
            return Optional.empty();
        }
        zzm zzmVar = zzfuVar.zzc;
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
        builder2.setBufferSize(zzfuVar.zzd);
        return Optional.of(builder2.build());
    }

    public final float zza() {
        synchronized (this.zzi) {
            zzcz zzczVar = this.zzj;
            float f2 = 1.0f;
            if (zzczVar == null) {
                return 1.0f;
            }
            try {
                f2 = zzczVar.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get app volume.", e);
            }
            return f2;
        }
    }

    @NonNull
    public final RequestConfiguration zzc() {
        return this.zzl;
    }

    public final InitializationStatus zze() {
        InitializationStatus zzA;
        synchronized (this.zzi) {
            try {
                Preconditions.checkState(this.zzj != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    zzA = zzA(this.zzj.zzg());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to get Initialization status.");
                    return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzem
                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.gms.ads.MobileAds", new zzet(zzey.this));
                            return hashMap;
                        }
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzA;
    }

    public final Status zzg(@NonNull Context context, @NonNull List list, @NonNull PreloadCallback preloadCallback) {
        boolean z2;
        Status status;
        int bufferSize;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String k2 = a.k(String.valueOf(preloadConfiguration.getAdFormat()), "#", preloadConfiguration.getAdUnitId());
            hashMap.put(k2, Integer.valueOf(((Integer) hashMap.getOrDefault(k2, 0)).intValue() + 1));
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z2 = true;
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                hashMap2.compute(adFormat, new BiFunction() { // from class: com.google.android.gms.ads.internal.client.zzen
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        Integer num = (Integer) obj2;
                        Set set = zzey.zza;
                        return Integer.valueOf(num != null ? 1 + num.intValue() : 1);
                    }
                });
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, adFormat.name()));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", adFormat.name()));
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z2 = true;
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AdFormat.APP_OPEN_AD, (Integer) zzbe.zzc().zza(zzbcv.zzet)), new AbstractMap.SimpleEntry(AdFormat.INTERSTITIAL, (Integer) zzbe.zzc().zza(zzbcv.zzer)), new AbstractMap.SimpleEntry(AdFormat.REWARDED, (Integer) zzbe.zzc().zza(zzbcv.zzes))};
        HashMap hashMap3 = new HashMap(3);
        for (int i2 = 0; i2 < 3; i2++) {
            Map.Entry entry = entryArr[i2];
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
            int intValue = ((Integer) entry2.getValue()).intValue();
            int intValue2 = ((Integer) unmodifiableMap.getOrDefault(adFormat2, 0)).intValue();
            if (intValue > intValue2) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", Integer.valueOf(intValue2), adFormat2.name()));
                z2 = true;
            }
        }
        if (z2) {
            StringBuilder sb = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                if (it4.hasNext()) {
                    sb.append(", ");
                }
            }
            String sb2 = sb.toString();
            com.google.android.gms.ads.internal.util.client.zzm.zzg(sb2);
            status = new Status(13, sb2);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        zzbcv.zza(context);
        synchronized (this.zzd) {
            try {
                if (this.zze == null) {
                    this.zze = zzbc.zza().zzg(context, new zzbph());
                }
                ArrayList arrayList = new ArrayList();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    PreloadConfiguration preloadConfiguration3 = (PreloadConfiguration) it5.next();
                    zzm zza2 = zzr.zza.zza(context, preloadConfiguration3.getAdRequest().zza());
                    zza2.zzc.putBoolean("is_sdk_preload", true);
                    if (preloadConfiguration3.getBufferSize() <= 0) {
                        int ordinal = preloadConfiguration3.getAdFormat().ordinal();
                        bufferSize = ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 1 : ((Integer) zzbe.zzc().zza(zzbcv.zzy)).intValue() : ((Integer) zzbe.zzc().zza(zzbcv.zzA)).intValue() : ((Integer) zzbe.zzc().zza(zzbcv.zzz)).intValue();
                    } else {
                        bufferSize = preloadConfiguration3.getBufferSize();
                    }
                    int ordinal2 = preloadConfiguration3.getAdFormat().ordinal();
                    int max = Math.max(Math.min(ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 5 ? 1 : ((Integer) zzbe.zzc().zza(zzbcv.zzv)).intValue() : ((Integer) zzbe.zzc().zza(zzbcv.zzx)).intValue() : ((Integer) zzbe.zzc().zza(zzbcv.zzw)).intValue(), 15), 1);
                    int ordinal3 = preloadConfiguration3.getAdFormat().ordinal();
                    arrayList.add(new zzfu(preloadConfiguration3.getAdUnitId(), preloadConfiguration3.getAdFormat().getValue(), zza2, Math.max(Math.min(bufferSize, max), Math.min(ordinal3 != 1 ? ordinal3 != 2 ? ordinal3 != 5 ? 1 : ((Integer) zzbe.zzc().zza(zzbcv.zzB)).intValue() : ((Integer) zzbe.zzc().zza(zzbcv.zzD)).intValue() : ((Integer) zzbe.zzc().zza(zzbcv.zzC)).intValue(), max))));
                }
                try {
                    this.zze.zzi(arrayList, new zzes(this, preloadCallback));
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to start preload.", e);
                    return Status.RESULT_INTERNAL_ERROR;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final String zzi() {
        String zzc;
        synchronized (this.zzi) {
            try {
                Preconditions.checkState(this.zzj != null, "MobileAds.initialize() must be called prior to getting version string.");
                try {
                    zzc = zzfyo.zzc(this.zzj.zzf());
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get internal version.", e);
                    return "";
                }
            } catch (Throwable th) {
                throw th;
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:31:0x006d, B:33:0x007e, B:35:0x0090, B:36:0x00d3, B:39:0x00a0, B:41:0x00ae, B:43:0x00c0, B:44:0x00cb, B:45:0x0062, B:49:0x0068), top: B:25:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:31:0x006d, B:33:0x007e, B:35:0x0090, B:36:0x00d3, B:39:0x00a0, B:41:0x00ae, B:43:0x00c0, B:44:0x00cb, B:45:0x0062, B:49:0x0068), top: B:25:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzo(android.content.Context r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzey.zzo(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
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
                this.zzj.zzm(new zzev(null));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzs(Context context, String str) {
        synchronized (this.zzi) {
            Preconditions.checkState(this.zzj != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzj.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzt(Class cls) {
        synchronized (this.zzi) {
            try {
                this.zzj.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzu(boolean z2) {
        synchronized (this.zzi) {
            Preconditions.checkState(this.zzj != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzj.zzp(z2);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzv(float f2) {
        boolean z2 = true;
        Preconditions.checkArgument(f2 >= 0.0f && f2 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzi) {
            if (this.zzj == null) {
                z2 = false;
            }
            Preconditions.checkState(z2, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzj.zzq(f2);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzw(String str) {
        synchronized (this.zzi) {
            Preconditions.checkState(this.zzj != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzj.zzt(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzx(@NonNull RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzi) {
            try {
                RequestConfiguration requestConfiguration2 = this.zzl;
                this.zzl = requestConfiguration;
                if (this.zzj == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    zzD(requestConfiguration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzy() {
        synchronized (this.zzi) {
            zzcz zzczVar = this.zzj;
            boolean z2 = false;
            if (zzczVar == null) {
                return false;
            }
            try {
                z2 = zzczVar.zzv();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get app mute state.", e);
            }
            return z2;
        }
    }

    public final boolean zzz(boolean z2) {
        synchronized (this.zzi) {
            try {
                Preconditions.checkState(this.zzj != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
                try {
                    this.zzj.zzj(z2);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to " + (z2 ? "enable" : "disable") + " the publisher first-party ID.", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
