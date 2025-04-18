package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public final class zzfwl {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfxd zzc = new zzfxd("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    @VisibleForTesting
    final zzfxc zza;
    private final String zze;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzfwh] */
    public zzfwl(Context context) {
        if (zzfxf.zza(context)) {
            this.zza = new zzfxc(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, new Object() { // from class: com.google.android.gms.internal.ads.zzfwh
            });
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    public static /* synthetic */ boolean zzh(String str) {
        return !zzk(str);
    }

    private static void zzi(String str, Consumer consumer) {
        if (zzk(str)) {
            return;
        }
        str.getClass();
        consumer.accept(str.trim());
    }

    private static boolean zzj(zzfwq zzfwqVar, String str, List list) {
        if (list.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.zzfwi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return zzfwl.zzh((String) obj);
            }
        })) {
            return true;
        }
        zzc.zza(str, new Object[0]);
        zzfwo zzc2 = zzfwp.zzc();
        zzc2.zzb(8160);
        zzfwqVar.zza(zzc2.zzc());
        return false;
    }

    private static boolean zzk(String str) {
        return zzfyo.zzc(str).trim().isEmpty();
    }

    public final void zza() {
        if (this.zza == null) {
            return;
        }
        zzc.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzn();
    }

    public final void zzb(final zzfvs zzfvsVar, final zzfwq zzfwqVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfwqVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzfvsVar.zzb(), zzfvsVar.zza()))) {
            this.zza.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwb
                @Override // java.lang.Runnable
                public final void run() {
                    zzfwl.this.zzc(zzfvsVar, zzfwqVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzc(zzfvs zzfvsVar, zzfwq zzfwqVar) {
        try {
            zzfxc zzfxcVar = this.zza;
            zzfxcVar.getClass();
            zzfvc zzfvcVar = (zzfvc) zzfxcVar.zzc();
            if (zzfvcVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzfvsVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfwe
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = zzfwl.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfvsVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfwf
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = zzfwl.zzb;
                    bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, (String) obj);
                }
            });
            zzfvcVar.zze(bundle, new zzfwk(this, zzfwqVar));
        } catch (RemoteException e) {
            zzc.zzb(e, "dismiss overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzd(zzfwn zzfwnVar, zzfwq zzfwqVar) {
        try {
            zzfxc zzfxcVar = this.zza;
            zzfxcVar.getClass();
            zzfvc zzfvcVar = (zzfvc) zzfxcVar.zzc();
            if (zzfvcVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzfwnVar.zzf());
            zzi(zzfwnVar.zzg(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfwj
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = zzfwl.zzb;
                    bundle.putString("adFieldEnifd", (String) obj);
                }
            });
            bundle.putInt("layoutGravity", zzfwnVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfwnVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzfwnVar.zze());
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfvx
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = zzfwl.zzb;
                    bundle.putString("deeplinkUrl", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfvy
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = zzfwl.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfwnVar.zzh(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfvz
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = zzfwl.zzb;
                    bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfwa
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = zzfwl.zzb;
                    bundle.putString("thirdPartyAuthCallerId", (String) obj);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzfvcVar.zzf(str, bundle, new zzfwk(this, zzfwqVar));
        } catch (RemoteException e) {
            zzc.zzb(e, "show overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zze(zzfws zzfwsVar, int i2, zzfwq zzfwqVar) {
        try {
            zzfxc zzfxcVar = this.zza;
            zzfxcVar.getClass();
            zzfvc zzfvcVar = (zzfvc) zzfxcVar.zzc();
            if (zzfvcVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i2);
            zzi(zzfwsVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfvw
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i3 = zzfwl.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfwsVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfwc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i3 = zzfwl.zzb;
                    bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, (String) obj);
                }
            });
            zzfvcVar.zzg(bundle, new zzfwk(this, zzfwqVar));
        } catch (RemoteException e) {
            zzc.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i2), this.zze);
        }
    }

    public final void zzf(final zzfwn zzfwnVar, final zzfwq zzfwqVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfwqVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzfwnVar.zzh()))) {
            this.zza.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwg
                @Override // java.lang.Runnable
                public final void run() {
                    zzfwl.this.zzd(zzfwnVar, zzfwqVar);
                }
            });
        }
    }

    public final void zzg(final zzfws zzfwsVar, final zzfwq zzfwqVar, final int i2) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfwqVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzfwsVar.zzb(), zzfwsVar.zza()))) {
            this.zza.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwd
                @Override // java.lang.Runnable
                public final void run() {
                    zzfwl.this.zze(zzfwsVar, i2, zzfwqVar);
                }
            });
        }
    }
}
