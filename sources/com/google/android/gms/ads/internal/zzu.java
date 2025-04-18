package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzcaj;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes3.dex */
public final class zzu extends zzbx {
    private final VersionInfoParcel zza;
    private final com.google.android.gms.ads.internal.client.zzs zzb;
    private final Future zzc = zzcaj.zza.zzb(new zzq(this));
    private final Context zzd;
    private final zzs zze;

    @Nullable
    private WebView zzf;

    @Nullable
    private zzbl zzg;

    @Nullable
    private zzavc zzh;
    private AsyncTask zzi;

    public zzu(Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, VersionInfoParcel versionInfoParcel) {
        this.zzd = context;
        this.zza = versionInfoParcel;
        this.zzb = zzsVar;
        this.zzf = new WebView(context);
        this.zze = new zzs(context, str);
        zzV(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new zzo(this));
        this.zzf.setOnTouchListener(new zzp(this));
    }

    public static /* bridge */ /* synthetic */ String zzo(zzu zzuVar, String str) {
        if (zzuVar.zzh != null) {
            Uri parse = Uri.parse(str);
            try {
                parse = zzuVar.zzh.zza(parse, zzuVar.zzd, null, null);
            } catch (zzavd e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to process ad data", e2);
            }
            return parse.toString();
        }
        return str;
    }

    public static /* bridge */ /* synthetic */ void zzw(zzu zzuVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzuVar.zzd.startActivity(intent);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) throws RemoteException {
        this.zzg = zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbai zzbaiVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzefVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtp zzbtpVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(zzbdi zzbdiVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbts zzbtsVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwp zzbwpVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzgaVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzV(int i10) {
        if (this.zzf == null) {
            return;
        }
        this.zzf.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        this.zze.zzf(zzmVar, this.zza);
        this.zzi = new zzr(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcqVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzbc.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzd, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzs zzg() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final zzdy zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzf);
    }

    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbdz.zzd.zze());
        builder.appendQueryParameter("query", this.zze.zzd());
        builder.appendQueryParameter("pubId", this.zze.zzc());
        builder.appendQueryParameter("mappver", this.zze.zza());
        Map zze = this.zze.zze();
        for (String str : zze.keySet()) {
            builder.appendQueryParameter(str, (String) zze.get(str));
        }
        Uri build = builder.build();
        zzavc zzavcVar = this.zzh;
        if (zzavcVar != null) {
            try {
                build = zzavcVar.zzb(build, this.zzd);
            } catch (zzavd e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to process ad data", e2);
            }
        }
        return a.m(zzq(), "#", build.getEncodedQuery());
    }

    public final String zzq() {
        String zzb = this.zze.zzb();
        if (true == TextUtils.isEmpty(zzb)) {
            zzb = "www.google.com";
        }
        return e.f("https://", zzb, (String) zzbdz.zzd.zze());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzt() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(false);
        this.zzf.destroy();
        this.zzf = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbo zzboVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
