package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbb;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbrb;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzea {
    final zzaz zza;
    private final zzbrb zzb;
    private final zzp zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;

    @Nullable
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;

    @Nullable
    private AppEventListener zzi;

    @Nullable
    private zzbu zzj;
    private VideoOptions zzk;
    private String zzl;
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;

    @Nullable
    private OnPaidEventListener zzp;

    public zzea(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzp.zza, null, 0);
    }

    private static zzq zzD(Context context, AdSize[] adSizeArr, int i9) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzqVar = new zzq(context, adSizeArr);
        zzqVar.zzj = zzE(i9);
        return zzqVar;
    }

    private static boolean zzE(int i9) {
        return i9 == 1;
    }

    public final boolean zzA() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                return zzbuVar.zzY();
            }
            return false;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
            return false;
        }
    }

    public final boolean zzB() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                return zzbuVar.zzZ();
            }
            return false;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
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
        zzq zzg;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null && (zzg = zzbuVar.zzg()) != null) {
                return com.google.android.gms.ads.zzb.zzc(zzg.zze, zzg.zzb, zzg.zza);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
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
        zzdn zzdnVar = null;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzdnVar = zzbuVar.zzk();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
        return ResponseInfo.zza(zzdnVar);
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
    public final zzdq zzi() {
        zzbu zzbuVar = this.zzj;
        if (zzbuVar != null) {
            try {
                return zzbuVar.zzl();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
            }
        }
        return null;
    }

    public final String zzj() {
        zzbu zzbuVar;
        if (this.zzl == null && (zzbuVar = this.zzj) != null) {
            try {
                this.zzl = zzbuVar.zzr();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzx();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final /* synthetic */ void zzl(IObjectWrapper iObjectWrapper) {
        this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzm(zzdx zzdxVar) {
        zzbu zzbuVar;
        try {
            if (this.zzj == null) {
                if (this.zzh != null && this.zzl != null) {
                    Context context = this.zzm.getContext();
                    zzq zzD = zzD(context, this.zzh, this.zzn);
                    if ("search_v2".equals(zzD.zza)) {
                        zzbuVar = (zzbu) new zzal(zzay.zza(), context, zzD, this.zzl).zzd(context, false);
                    } else {
                        zzbuVar = (zzbu) new zzaj(zzay.zza(), context, zzD, this.zzl, this.zzb).zzd(context, false);
                    }
                    this.zzj = zzbuVar;
                    zzbuVar.zzD(new zzg(this.zza));
                    zza zzaVar = this.zzf;
                    if (zzaVar != null) {
                        this.zzj.zzC(new zzb(zzaVar));
                    }
                    AppEventListener appEventListener = this.zzi;
                    if (appEventListener != null) {
                        this.zzj.zzG(new zzbbb(appEventListener));
                    }
                    if (this.zzk != null) {
                        this.zzj.zzU(new zzfk(this.zzk));
                    }
                    this.zzj.zzP(new zzfe(this.zzp));
                    this.zzj.zzN(this.zzo);
                    zzbu zzbuVar2 = this.zzj;
                    if (zzbuVar2 != null) {
                        try {
                            final IObjectWrapper zzn = zzbuVar2.zzn();
                            if (zzn != null) {
                                if (((Boolean) zzbgi.zzf.zze()).booleanValue()) {
                                    if (((Boolean) zzba.zzc().zza(zzbep.zzlg)).booleanValue()) {
                                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzdy
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzea.this.zzl(zzn);
                                            }
                                        });
                                    }
                                }
                                this.zzm.addView((View) ObjectWrapper.unwrap(zzn));
                            }
                        } catch (RemoteException e4) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            zzbu zzbuVar3 = this.zzj;
            zzbuVar3.getClass();
            zzbuVar3.zzab(this.zzc.zza(this.zzm.getContext(), zzdxVar));
        } catch (RemoteException e9) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e9);
        }
    }

    public final void zzn() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzz();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzo() {
        if (!this.zzd.getAndSet(true)) {
            try {
                zzbu zzbuVar = this.zzj;
                if (zzbuVar != null) {
                    zzbuVar.zzA();
                }
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
            }
        }
    }

    public final void zzp() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzB();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzq(@Nullable zza zzaVar) {
        zzb zzbVar;
        try {
            this.zzf = zzaVar;
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                if (zzaVar != null) {
                    zzbVar = new zzb(zzaVar);
                } else {
                    zzbVar = null;
                }
                zzbuVar.zzC(zzbVar);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzr(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.zzh == null) {
            zzt(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void zzt(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzF(zzD(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String str) {
        if (this.zzl == null) {
            this.zzl = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void zzv(@Nullable AppEventListener appEventListener) {
        zzbbb zzbbbVar;
        try {
            this.zzi = appEventListener;
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                if (appEventListener != null) {
                    zzbbbVar = new zzbbb(appEventListener);
                } else {
                    zzbbbVar = null;
                }
                zzbuVar.zzG(zzbbbVar);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzw(boolean z8) {
        this.zzo = z8;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzN(z8);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzx(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        zzfk zzfkVar;
        this.zzk = videoOptions;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                if (videoOptions == null) {
                    zzfkVar = null;
                } else {
                    zzfkVar = new zzfk(videoOptions);
                }
                zzbuVar.zzU(zzfkVar);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final boolean zzz(zzbu zzbuVar) {
        try {
            IObjectWrapper zzn = zzbuVar.zzn();
            if (zzn == null || ((View) ObjectWrapper.unwrap(zzn)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) ObjectWrapper.unwrap(zzn));
            this.zzj = zzbuVar;
            return true;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
            return false;
        }
    }

    public zzea(ViewGroup viewGroup, int i9) {
        this(viewGroup, null, false, zzp.zza, null, i9);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z8) {
        this(viewGroup, attributeSet, z8, zzp.zza, null, 0);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z8, int i9) {
        this(viewGroup, attributeSet, z8, zzp.zza, null, i9);
    }

    public zzea(ViewGroup viewGroup, @Nullable AttributeSet attributeSet, boolean z8, zzp zzpVar, @Nullable zzbu zzbuVar, int i9) {
        zzq zzqVar;
        this.zzb = new zzbrb();
        this.zze = new VideoController();
        this.zza = new zzdz(this);
        this.zzm = viewGroup;
        this.zzc = zzpVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i9;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzyVar = new zzy(context, attributeSet);
                this.zzh = zzyVar.zzb(z8);
                this.zzl = zzyVar.zza();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzb = zzay.zzb();
                    AdSize adSize = this.zzh[0];
                    int i10 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzqVar = zzq.zze();
                    } else {
                        zzq zzqVar2 = new zzq(context, adSize);
                        zzqVar2.zzj = zzE(i10);
                        zzqVar = zzqVar2;
                    }
                    zzb.zzn(viewGroup, zzqVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e4) {
                zzay.zzb().zzm(viewGroup, new zzq(context, AdSize.BANNER), e4.getMessage(), e4.getMessage());
            }
        }
    }
}
