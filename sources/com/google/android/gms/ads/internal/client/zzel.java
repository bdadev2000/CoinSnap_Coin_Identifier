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
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbpc;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzel {
    final zzbd zza;
    private final zzbpc zzb;
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
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;

    @Nullable
    private OnPaidEventListener zzp;

    public zzel(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzr.zza, null, 0);
    }

    private static zzs zzD(Context context, AdSize[] adSizeArr, int i10) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzs zzsVar = new zzs(context, adSizeArr);
        zzsVar.zzj = zzE(i10);
        return zzsVar;
    }

    private static boolean zzE(int i10) {
        return i10 == 1;
    }

    public final boolean zzA() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                return zzbyVar.zzY();
            }
            return false;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
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
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
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
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
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
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
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
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
        return null;
    }

    public final String zzj() {
        zzby zzbyVar;
        if (this.zzl == null && (zzbyVar = this.zzj) != null) {
            try {
                this.zzl = zzbyVar.zzr();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
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
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final /* synthetic */ void zzl(IObjectWrapper iObjectWrapper) {
        this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzm(zzei zzeiVar) {
        zzby zzbyVar;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.zzj == null) {
                if (this.zzh != null && this.zzl != null) {
                    Context context = this.zzm.getContext();
                    zzs zzD = zzD(context, this.zzh, this.zzn);
                    if ("search_v2".equals(zzD.zza)) {
                        zzbyVar = (zzby) new zzao(zzbc.zza(), context, zzD, this.zzl).zzd(context, false);
                    } else {
                        zzbyVar = (zzby) new zzam(zzbc.zza(), context, zzD, this.zzl, this.zzb).zzd(context, false);
                    }
                    this.zzj = zzbyVar;
                    zzbyVar.zzD(new zzg(this.zza));
                    zza zzaVar = this.zzf;
                    if (zzaVar != null) {
                        this.zzj.zzC(new zzb(zzaVar));
                    }
                    AppEventListener appEventListener = this.zzi;
                    if (appEventListener != null) {
                        this.zzj.zzG(new zzaza(appEventListener));
                    }
                    if (this.zzk != null) {
                        this.zzj.zzU(new zzga(this.zzk));
                    }
                    this.zzj.zzP(new zzfs(this.zzp));
                    this.zzj.zzN(this.zzo);
                    zzby zzbyVar2 = this.zzj;
                    if (zzbyVar2 != null) {
                        try {
                            final IObjectWrapper zzn = zzbyVar2.zzn();
                            if (zzn != null) {
                                if (((Boolean) zzbel.zzf.zze()).booleanValue()) {
                                    if (((Boolean) zzbe.zzc().zza(zzbcn.zzkP)).booleanValue()) {
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
                        } catch (RemoteException e2) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            if (zzeiVar != null) {
                zzeiVar.zzq(currentTimeMillis);
            }
            zzby zzbyVar3 = this.zzj;
            zzbyVar3.getClass();
            zzbyVar3.zzab(this.zzc.zza(this.zzm.getContext(), zzeiVar));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzn() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzz();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzo() {
        if (!this.zzd.getAndSet(true)) {
            try {
                zzby zzbyVar = this.zzj;
                if (zzbyVar != null) {
                    zzbyVar.zzA();
                }
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void zzp() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzB();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzq(@Nullable zza zzaVar) {
        zzb zzbVar;
        try {
            this.zzf = zzaVar;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                if (zzaVar != null) {
                    zzbVar = new zzb(zzaVar);
                } else {
                    zzbVar = null;
                }
                zzbyVar.zzC(zzbVar);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
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
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzF(zzD(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
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
        zzaza zzazaVar;
        try {
            this.zzi = appEventListener;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                if (appEventListener != null) {
                    zzazaVar = new zzaza(appEventListener);
                } else {
                    zzazaVar = null;
                }
                zzbyVar.zzG(zzazaVar);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzw(boolean z10) {
        this.zzo = z10;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzN(z10);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzx(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzP(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        zzga zzgaVar;
        this.zzk = videoOptions;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                if (videoOptions == null) {
                    zzgaVar = null;
                } else {
                    zzgaVar = new zzga(videoOptions);
                }
                zzbyVar.zzU(zzgaVar);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
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
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public zzel(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, zzr.zza, null, i10);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10) {
        this(viewGroup, attributeSet, z10, zzr.zza, null, 0);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, int i10) {
        this(viewGroup, attributeSet, z10, zzr.zza, null, i10);
    }

    public zzel(ViewGroup viewGroup, @Nullable AttributeSet attributeSet, boolean z10, zzr zzrVar, @Nullable zzby zzbyVar, int i10) {
        zzs zzsVar;
        this.zzb = new zzbpc();
        this.zze = new VideoController();
        this.zza = new zzek(this);
        this.zzm = viewGroup;
        this.zzc = zzrVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzaa zzaaVar = new zzaa(context, attributeSet);
                this.zzh = zzaaVar.zzb(z10);
                this.zzl = zzaaVar.zza();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzb = zzbc.zzb();
                    AdSize adSize = this.zzh[0];
                    int i11 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzsVar = new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzs zzsVar2 = new zzs(context, adSize);
                        zzsVar2.zzj = zzE(i11);
                        zzsVar = zzsVar2;
                    }
                    zzb.zzn(viewGroup, zzsVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                zzbc.zzb().zzm(viewGroup, new zzs(context, AdSize.BANNER), e2.getMessage(), e2.getMessage());
            }
        }
    }
}
