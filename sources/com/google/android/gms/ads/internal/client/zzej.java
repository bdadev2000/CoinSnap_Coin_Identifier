package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzfyv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzej {
    private static zzej zza;
    private zzco zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();

    @Nullable
    private OnAdInspectorClosedListener zzh = null;

    @NonNull
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzej() {
    }

    private final void zzA(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzco) new zzaq(zzay.zza(), context).zzd(context, false);
        }
    }

    private final void zzB(@NonNull RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set request configuration parcel.", e4);
        }
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            try {
                if (zza == null) {
                    zza = new zzej();
                }
                zzejVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzejVar;
    }

    public static InitializationStatus zzy(List list) {
        AdapterStatus.State state;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbnn zzbnnVar = (zzbnn) it.next();
            String str = zzbnnVar.zza;
            if (zzbnnVar.zzb) {
                state = AdapterStatus.State.READY;
            } else {
                state = AdapterStatus.State.NOT_READY;
            }
            hashMap.put(str, new zzbnv(state, zzbnnVar.zzd, zzbnnVar.zzc));
        }
        return new zzbnw(hashMap);
    }

    private final void zzz(Context context, @Nullable String str) {
        try {
            zzbqx.zza().zzb(context, null);
            this.zzg.zzk();
            this.zzg.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("MobileAdsSettingManager initialization failed", e4);
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            float f9 = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                f9 = zzcoVar.zze();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get app volume.", e4);
            }
            return f9;
        }
    }

    @NonNull
    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        boolean z8;
        InitializationStatus zzy;
        synchronized (this.zzf) {
            try {
                if (this.zzg != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Preconditions.checkState(z8, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    zzy = zzy(this.zzg.zzg());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to get Initialization status.");
                    return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.gms.ads.MobileAds", new zzee(zzej.this));
                            return hashMap;
                        }
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzy;
    }

    public final String zzh() {
        boolean z8;
        String zzc;
        synchronized (this.zzf) {
            try {
                if (this.zzg != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Preconditions.checkState(z8, "MobileAds.initialize() must be called prior to getting version string.");
                try {
                    zzc = zzfyv.zzc(this.zzg.zzf());
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get internal version.", e4);
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    public final void zzl(Context context) {
        synchronized (this.zzf) {
            zzA(context);
            try {
                this.zzg.zzi();
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
    public final void zzm(android.content.Context r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzej.zzm(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    public final /* synthetic */ void zzn(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final /* synthetic */ void zzo(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzA(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzm(new zzeg(null));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        boolean z8;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Preconditions.checkState(z8, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to open debug menu.", e4);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to register RtbAdapter", e4);
            }
        }
    }

    public final void zzs(boolean z8) {
        boolean z9;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            Preconditions.checkState(z9, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzp(z8);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set app mute state.", e4);
            }
        }
    }

    public final void zzt(float f9) {
        boolean z8;
        boolean z9 = true;
        if (f9 >= 0.0f && f9 <= 1.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkArgument(z8, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z9 = false;
            }
            Preconditions.checkState(z9, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzq(f9);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set app volume.", e4);
            }
        }
    }

    public final void zzu(String str) {
        boolean z8;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Preconditions.checkState(z8, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzg.zzt(str);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set plugin.", e4);
            }
        }
    }

    public final void zzv(@NonNull RequestConfiguration requestConfiguration) {
        boolean z8;
        if (requestConfiguration != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkArgument(z8, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            try {
                RequestConfiguration requestConfiguration2 = this.zzi;
                this.zzi = requestConfiguration;
                if (this.zzg == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    zzB(requestConfiguration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzw() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            boolean z8 = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                z8 = zzcoVar.zzv();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get app mute state.", e4);
            }
            return z8;
        }
    }

    public final boolean zzx(boolean z8) {
        boolean z9;
        String str;
        synchronized (this.zzf) {
            try {
                if (this.zzg != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Preconditions.checkState(z9, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
                try {
                    this.zzg.zzj(z8);
                } catch (RemoteException e4) {
                    if (z8) {
                        str = "enable";
                    } else {
                        str = "disable";
                    }
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to " + str + " the publisher first-party ID.", e4);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
