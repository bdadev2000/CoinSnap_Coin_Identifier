package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzazj;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbph;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes3.dex */
public final class zzel {

    @VisibleForTesting
    final zzbd zza;
    private final zzbph zzb;
    private final zzr zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;

    @Nullable
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;

    @Nullable
    private AppEventListener zzi;

    @Nullable
    private zzby zzj;
    private VideoOptions zzk;
    private String zzl;

    @NotOnlyInitialized
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;

    @Nullable
    private OnPaidEventListener zzp;

    public zzel(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzr.zza, null, 0);
    }

    private static zzs zzD(Context context, AdSize[] adSizeArr, int i2) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzs zzsVar = new zzs(context, adSizeArr);
        zzsVar.zzj = zzE(i2);
        return zzsVar;
    }

    private static boolean zzE(int i2) {
        return i2 == 1;
    }

    public final boolean zzA() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                return zzbyVar.zzY();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean zzB() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                return zzbyVar.zzZ();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final AdSize[] zzC() {
        return this.zzh;
    }

    public final AdListener zza() {
        return this.zzg;
    }

    @Nullable
    public final AdSize zzb() {
        zzs zzg;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null && (zzg = zzbyVar.zzg()) != null) {
                return com.google.android.gms.ads.zzb.zzc(zzg.zze, zzg.zzb, zzg.zza);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    @Nullable
    public final OnPaidEventListener zzc() {
        return this.zzp;
    }

    @Nullable
    public final ResponseInfo zzd() {
        zzdy zzdyVar = null;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzdyVar = zzbyVar.zzk();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzdyVar);
    }

    public final VideoController zzf() {
        return this.zze;
    }

    public final VideoOptions zzg() {
        return this.zzk;
    }

    @Nullable
    public final AppEventListener zzh() {
        return this.zzi;
    }

    @Nullable
    public final zzeb zzi() {
        zzby zzbyVar = this.zzj;
        if (zzbyVar != null) {
            try {
                return zzbyVar.zzl();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final String zzj() {
        zzby zzbyVar;
        if (this.zzl == null && (zzbyVar = this.zzj) != null) {
            try {
                this.zzl = zzbyVar.zzr();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzx();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final /* synthetic */ void zzl(IObjectWrapper iObjectWrapper) {
        this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzm(zzei zzeiVar) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.zzj == null) {
                if (this.zzh == null || this.zzl == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzm.getContext();
                zzs zzD = zzD(context, this.zzh, this.zzn);
                zzby zzbyVar = "search_v2".equals(zzD.zza) ? (zzby) new zzao(zzbc.zza(), context, zzD, this.zzl).zzd(context, false) : (zzby) new zzam(zzbc.zza(), context, zzD, this.zzl, this.zzb).zzd(context, false);
                this.zzj = zzbyVar;
                zzbyVar.zzD(new zzg(this.zza));
                zza zzaVar = this.zzf;
                if (zzaVar != null) {
                    this.zzj.zzC(new zzb(zzaVar));
                }
                AppEventListener appEventListener = this.zzi;
                if (appEventListener != null) {
                    this.zzj.zzG(new zzazj(appEventListener));
                }
                if (this.zzk != null) {
                    this.zzj.zzU(new zzgb(this.zzk));
                }
                this.zzj.zzP(new zzft(this.zzp));
                this.zzj.zzN(this.zzo);
                zzby zzbyVar2 = this.zzj;
                if (zzbyVar2 != null) {
                    try {
                        final IObjectWrapper zzn = zzbyVar2.zzn();
                        if (zzn != null) {
                            if (((Boolean) zzbep.zzf.zze()).booleanValue()) {
                                if (((Boolean) zzbe.zzc().zza(zzbcv.zzkO)).booleanValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzej
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzel.this.zzl(zzn);
                                        }
                                    });
                                }
                            }
                            this.zzm.addView((View) ObjectWrapper.unwrap(zzn));
                        }
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
            if (zzeiVar != null) {
                zzeiVar.zzq(currentTimeMillis);
            }
            zzby zzbyVar3 = this.zzj;
            zzbyVar3.getClass();
            zzbyVar3.zzab(this.zzc.zza(this.zzm.getContext(), zzeiVar));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzn() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzz();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzo() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzA();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzp() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzB();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(@Nullable zza zzaVar) {
        try {
            this.zzf = zzaVar;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzr(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.zzh != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(adSizeArr);
    }

    public final void zzt(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzF(zzD(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String str) {
        if (this.zzl != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = str;
    }

    public final void zzv(@Nullable AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzG(appEventListener != null ? new zzazj(appEventListener) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzw(boolean z2) {
        this.zzo = z2;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzN(z2);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzx(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzP(new zzft(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzU(videoOptions == null ? null : new zzgb(videoOptions));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzz(zzby zzbyVar) {
        try {
            IObjectWrapper zzn = zzbyVar.zzn();
            if (zzn == null || ((View) ObjectWrapper.unwrap(zzn)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) ObjectWrapper.unwrap(zzn));
            this.zzj = zzbyVar;
            return true;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public zzel(ViewGroup viewGroup, int i2) {
        this(viewGroup, null, false, zzr.zza, null, i2);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z2) {
        this(viewGroup, attributeSet, z2, zzr.zza, null, 0);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z2, int i2) {
        this(viewGroup, attributeSet, z2, zzr.zza, null, i2);
    }

    @VisibleForTesting
    public zzel(ViewGroup viewGroup, @Nullable AttributeSet attributeSet, boolean z2, zzr zzrVar, @Nullable zzby zzbyVar, int i2) {
        zzs zzsVar;
        this.zzb = new zzbph();
        this.zze = new VideoController();
        this.zza = new zzek(this);
        this.zzm = viewGroup;
        this.zzc = zzrVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzaa zzaaVar = new zzaa(context, attributeSet);
                this.zzh = zzaaVar.zzb(z2);
                this.zzl = zzaaVar.zza();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzb = zzbc.zzb();
                    AdSize adSize = this.zzh[0];
                    int i3 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzsVar = new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzs zzsVar2 = new zzs(context, adSize);
                        zzsVar2.zzj = zzE(i3);
                        zzsVar = zzsVar2;
                    }
                    zzb.zzn(viewGroup, zzsVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzbc.zzb().zzm(viewGroup, new zzs(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}
