package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcgc extends FrameLayout implements zzcfk {
    private final zzcfk zza;
    private final zzcbu zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcgc(zzcfk zzcfkVar) {
        super(zzcfkVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcfkVar;
        this.zzb = new zzcbu(zzcfkVar.zzE(), this, this);
        addView((View) zzcfkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void destroy() {
        final zzeeu zzP;
        final zzeew zzQ = zzQ();
        if (zzQ != null) {
            zzftd zzftdVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzftdVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcga
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzv.zzB().zzi(zzeew.this.zza());
                }
            });
            zzcfk zzcfkVar = this.zza;
            Objects.requireNonNull(zzcfkVar);
            zzftdVar.postDelayed(new zzcfy(zzcfkVar), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfc)).intValue());
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && (zzP = zzP()) != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgb
                @Override // java.lang.Runnable
                public final void run() {
                    zzP.zzf(new zzcfz(zzcgc.this));
                }
            });
        } else {
            this.zza.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfk zzcfkVar = this.zza;
        if (zzcfkVar != null) {
            zzcfkVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfk
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfk
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzA(int i10) {
        this.zza.zzA(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzB(int i10) {
        this.zzb.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final void zzC(zzcgm zzcgmVar) {
        this.zza.zzC(zzcgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcfb
    public final zzfet zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgz
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgx
    public final zzavc zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzazz zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    @Nullable
    public final zzbfm zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzchc zzN() {
        return ((zzcgj) this.zza).zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgw
    public final zzche zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzeeu zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzeew zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgn
    public final zzfew zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzffs zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final ua.b zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzW(zzfet zzfetVar, zzfew zzfewVar) {
        this.zza.zzW(zzfetVar, zzfewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzY() {
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzZ(int i10) {
        this.zza.zzZ(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zza(String str) {
        ((zzcgj) this.zza).zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaA(String str, Predicate predicate) {
        this.zza.zzaA(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaD(boolean z10, int i10) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaT)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzaD(z10, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaG() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    public final /* synthetic */ void zzaI(boolean z10) {
        zzcfk zzcfkVar = this.zza;
        zzftd zzftdVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcfkVar);
        zzftdVar.post(new zzcfy(zzcfkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11) {
        this.zza.zzaJ(zzcVar, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaK(String str, String str2, int i10) {
        this.zza.zzaK(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaL(boolean z10, int i10, boolean z11) {
        this.zza.zzaL(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaM(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zza.zzaM(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaN(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zza.zzaN(z10, i10, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzab() {
        this.zza.zzab();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzac(boolean z10) {
        this.zza.zzac(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzad() {
        this.zza.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzae(String str, String str2, @Nullable String str3) {
        this.zza.zzae(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaf() {
        this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzag(String str, zzbjr zzbjrVar) {
        this.zza.zzag(str, zzbjrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzah() {
        zzeew zzQ;
        zzeeu zzP;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzv.zzq();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzy());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && (zzP = zzP()) != null) {
            zzP.zza(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfd)).booleanValue() && (zzQ = zzQ()) != null && zzQ.zzb()) {
            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzQ.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzai(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaj(zzche zzcheVar) {
        this.zza.zzaj(zzcheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzak(zzazz zzazzVar) {
        this.zza.zzak(zzazzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzal(boolean z10) {
        this.zza.zzal(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzao(boolean z10) {
        this.zza.zzao(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzap(zzbfk zzbfkVar) {
        this.zza.zzap(zzbfkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaq(boolean z10) {
        this.zza.zzaq(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzar(@Nullable zzbfm zzbfmVar) {
        this.zza.zzar(zzbfmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzas(@Nullable zzeeu zzeeuVar) {
        this.zza.zzas(zzeeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzat(zzeew zzeewVar) {
        this.zza.zzat(zzeewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzau(int i10) {
        this.zza.zzau(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzav(boolean z10) {
        this.zza.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzaw(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzax(boolean z10) {
        this.zza.zzax(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzay(boolean z10) {
        this.zza.zzay(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaz(String str, zzbjr zzbjrVar) {
        this.zza.zzaz(str, zzbjrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        zzcfk zzcfkVar = this.zza;
        if (zzcfkVar != null) {
            zzcfkVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
        zzcfk zzcfkVar = this.zza;
        if (zzcfkVar != null) {
            zzcfkVar.zzdf();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdh() {
        this.zza.zzdh();
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final String zzdi() {
        return this.zza.zzdi();
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        this.zza.zzdp(zzaylVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdV)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final int zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdV)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccf
    @Nullable
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final zzbcz zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcgj) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final zzbda zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzccf
    public final VersionInfoParcel zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final zzcbu zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final zzcdr zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final zzcgm zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final String zzr() {
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final void zzt(String str, zzcdr zzcdrVar) {
        this.zza.zzt(str, zzcdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzu() {
        this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzv(boolean z10, long j3) {
        this.zza.zzv(z10, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzy(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzz(boolean z10) {
        this.zza.zzz(false);
    }
}
