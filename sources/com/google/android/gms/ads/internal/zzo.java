package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.internal.ads.zzfgq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzo extends WebViewClient {
    final /* synthetic */ zzu zza;

    public zzo(zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzbl zzblVar;
        zzbl zzblVar2;
        zzbl zzblVar3;
        zzbl zzblVar4;
        zzu zzuVar = this.zza;
        zzblVar = zzuVar.zzg;
        if (zzblVar != null) {
            try {
                zzblVar2 = zzuVar.zzg;
                zzblVar2.zzf(zzfgq.zzd(1, null, null));
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
        zzu zzuVar2 = this.zza;
        zzblVar3 = zzuVar2.zzg;
        if (zzblVar3 != null) {
            try {
                zzblVar4 = zzuVar2.zzg;
                zzblVar4.zze(0);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbl zzblVar;
        zzbl zzblVar2;
        zzbl zzblVar3;
        zzbl zzblVar4;
        zzbl zzblVar5;
        zzbl zzblVar6;
        zzbl zzblVar7;
        zzbl zzblVar8;
        zzbl zzblVar9;
        zzbl zzblVar10;
        zzbl zzblVar11;
        zzbl zzblVar12;
        zzbl zzblVar13;
        if (str.startsWith(this.zza.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzu zzuVar = this.zza;
            zzblVar10 = zzuVar.zzg;
            if (zzblVar10 != null) {
                try {
                    zzblVar11 = zzuVar.zzg;
                    zzblVar11.zzf(zzfgq.zzd(3, null, null));
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                }
            }
            zzu zzuVar2 = this.zza;
            zzblVar12 = zzuVar2.zzg;
            if (zzblVar12 != null) {
                try {
                    zzblVar13 = zzuVar2.zzg;
                    zzblVar13.zze(3);
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzu zzuVar3 = this.zza;
            zzblVar6 = zzuVar3.zzg;
            if (zzblVar6 != null) {
                try {
                    zzblVar7 = zzuVar3.zzg;
                    zzblVar7.zzf(zzfgq.zzd(1, null, null));
                } catch (RemoteException e11) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e11);
                }
            }
            zzu zzuVar4 = this.zza;
            zzblVar8 = zzuVar4.zzg;
            if (zzblVar8 != null) {
                try {
                    zzblVar9 = zzuVar4.zzg;
                    zzblVar9.zze(0);
                } catch (RemoteException e12) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e12);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzu zzuVar5 = this.zza;
            zzblVar4 = zzuVar5.zzg;
            if (zzblVar4 != null) {
                try {
                    zzblVar5 = zzuVar5.zzg;
                    zzblVar5.zzi();
                } catch (RemoteException e13) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e13);
                }
            }
            this.zza.zzV(this.zza.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzu zzuVar6 = this.zza;
        zzblVar = zzuVar6.zzg;
        if (zzblVar != null) {
            try {
                zzblVar2 = zzuVar6.zzg;
                zzblVar2.zzc();
                zzblVar3 = this.zza.zzg;
                zzblVar3.zzh();
            } catch (RemoteException e14) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e14);
            }
        }
        zzu.zzw(this.zza, zzu.zzo(this.zza, str));
        return true;
    }
}
