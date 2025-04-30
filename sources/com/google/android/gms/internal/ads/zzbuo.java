package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbuo extends NativeAd {
    private final zzbjs zza;

    @Nullable
    private final zzbun zzc;

    @Nullable
    private final NativeAd.AdChoicesInfo zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6))|19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23))|36|37|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[Catch: RemoteException -> 0x00a9, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00a9, blocks: (B:42:0x0094, B:44:0x009c), top: B:41:0x0094 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbuo(com.google.android.gms.internal.ads.zzbjs r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zze = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch: android.os.RemoteException -> L35
            if (r6 == 0) goto L48
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L35
        L20:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L35
            if (r2 == 0) goto L48
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L35
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L35
            if (r3 == 0) goto L37
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzbhv r2 = com.google.android.gms.internal.ads.zzbhu.zzg(r2)     // Catch: android.os.RemoteException -> L35
            goto L38
        L35:
            r6 = move-exception
            goto L45
        L37:
            r2 = r1
        L38:
            if (r2 == 0) goto L20
            java.util.List r3 = r5.zzb     // Catch: android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzbun r4 = new com.google.android.gms.internal.ads.zzbun     // Catch: android.os.RemoteException -> L35
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L35
            r3.add(r4)     // Catch: android.os.RemoteException -> L35
            goto L20
        L45:
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L48:
            com.google.android.gms.internal.ads.zzbjs r6 = r5.zza     // Catch: android.os.RemoteException -> L69
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L69
            if (r6 == 0) goto L7c
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L69
        L54:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L69
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L69
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L69
            if (r3 == 0) goto L6b
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L69
            com.google.android.gms.ads.internal.client.zzcw r2 = com.google.android.gms.ads.internal.client.zzcv.zzb(r2)     // Catch: android.os.RemoteException -> L69
            goto L6c
        L69:
            r6 = move-exception
            goto L79
        L6b:
            r2 = r1
        L6c:
            if (r2 == 0) goto L54
            java.util.List r3 = r5.zze     // Catch: android.os.RemoteException -> L69
            com.google.android.gms.ads.internal.client.zzcx r4 = new com.google.android.gms.ads.internal.client.zzcx     // Catch: android.os.RemoteException -> L69
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L69
            r3.add(r4)     // Catch: android.os.RemoteException -> L69
            goto L54
        L79:
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L7c:
            com.google.android.gms.internal.ads.zzbjs r6 = r5.zza     // Catch: android.os.RemoteException -> L8a
            com.google.android.gms.internal.ads.zzbhv r6 = r6.zzk()     // Catch: android.os.RemoteException -> L8a
            if (r6 == 0) goto L8c
            com.google.android.gms.internal.ads.zzbun r2 = new com.google.android.gms.internal.ads.zzbun     // Catch: android.os.RemoteException -> L8a
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L8a
            goto L92
        L8a:
            r6 = move-exception
            goto L8e
        L8c:
            r2 = r1
            goto L92
        L8e:
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
            goto L8c
        L92:
            r5.zzc = r2
            com.google.android.gms.internal.ads.zzbjs r6 = r5.zza     // Catch: android.os.RemoteException -> La9
            com.google.android.gms.internal.ads.zzbho r6 = r6.zzi()     // Catch: android.os.RemoteException -> La9
            if (r6 == 0) goto Lad
            com.google.android.gms.internal.ads.zzbul r6 = new com.google.android.gms.internal.ads.zzbul     // Catch: android.os.RemoteException -> La9
            com.google.android.gms.internal.ads.zzbjs r2 = r5.zza     // Catch: android.os.RemoteException -> La9
            com.google.android.gms.internal.ads.zzbho r2 = r2.zzi()     // Catch: android.os.RemoteException -> La9
            r6.<init>(r2)     // Catch: android.os.RemoteException -> La9
            r1 = r6
            goto Lad
        La9:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        Lad:
            r5.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuo.<init>(com.google.android.gms.internal.ads.zzbjs):void");
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to cancelUnconfirmedClick", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.zza.zzx();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzC();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getAdvertiser() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getBody() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getCallToAction() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzf = this.zza.zzf();
            if (zzf != null) {
                return zzf;
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getHeadline() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final NativeAd.Image getIcon() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final MediaContent getMediaContent() {
        try {
            if (this.zza.zzj() != null) {
                return new com.google.android.gms.ads.internal.client.zzep(this.zza.zzj(), null);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getPrice() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        try {
            zzdnVar = this.zza.zzg();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            zzdnVar = null;
        }
        return ResponseInfo.zza(zzdnVar);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final Double getStarRating() {
        try {
            double zze = this.zza.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final String getStore() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzH();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.zza.zzH()) {
                    if (muteThisAdReason == null) {
                        this.zza.zzy(null);
                        return;
                    } else if (muteThisAdReason instanceof com.google.android.gms.ads.internal.client.zzcx) {
                        this.zza.zzy(((com.google.android.gms.ads.internal.client.zzcx) muteThisAdReason).zza());
                        return;
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzm.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e9) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e9);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzI(bundle);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zza.zzD(new com.google.android.gms.ads.internal.client.zzct(muteThisAdListener));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zza.zzE(new com.google.android.gms.ads.internal.client.zzfe(onPaidEventListener));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to setOnPaidEventListener", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zza.zzF(new zzbuw(unconfirmedClickListener));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to setUnconfirmedClickListener", e4);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            return null;
        }
    }
}
