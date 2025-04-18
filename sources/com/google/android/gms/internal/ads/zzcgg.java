package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
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
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcgg extends FrameLayout implements zzcfo {
    private final zzcfo zza;
    private final zzcby zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcgg(zzcfo zzcfoVar) {
        super(zzcfoVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcfoVar;
        this.zzb = new zzcby(zzcfoVar.zzE(), this, this);
        addView((View) zzcfoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void destroy() {
        final zzegd zzP;
        final zzegf zzQ = zzQ();
        if (zzQ != null) {
            zzfun zzfunVar = com.google.android.gms.ads.internal.util.zzt.zza;
            zzfunVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcge
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzu.zzA().zzi(zzegf.this.zza());
                }
            });
            zzcfo zzcfoVar = this.zza;
            Objects.requireNonNull(zzcfoVar);
            zzfunVar.postDelayed(new zzcgc(zzcfoVar), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeV)).intValue());
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeX)).booleanValue() || (zzP = zzP()) == null) {
            this.zza.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgf
                @Override // java.lang.Runnable
                public final void run() {
                    zzP.zzf(new zzcgd(zzcgg.this));
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(g.f30053h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfo zzcfoVar = this.zza;
        if (zzcfoVar != null) {
            zzcfoVar.onAdClicked();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfo
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfo
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzA(int i2) {
        this.zza.zzA(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzB(int i2) {
        this.zzb.zzg(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final void zzC(zzcgq zzcgqVar) {
        this.zza.zzC(zzcgqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcff
    public final zzfgh zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchd
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchb
    public final zzavn zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final zzbai zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    @Nullable
    public final zzbfq zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final zzchg zzN() {
        return ((zzcgn) this.zza).zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcha
    public final zzchi zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final zzegd zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final zzegf zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcgr
    public final zzfgk zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final zzfhg zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final ListenableFuture zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzW(zzfgh zzfghVar, zzfgk zzfgkVar) {
        this.zza.zzW(zzfghVar, zzfgkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzY() {
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzZ(int i2) {
        this.zza.zzZ(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zza(String str) {
        ((zzcgn) this.zza).zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaA(String str, Predicate predicate) {
        this.zza.zzaA(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaD(boolean z2, int i2) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaQ)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzaD(z2, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaG() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    public final /* synthetic */ void zzaI(boolean z2) {
        zzcfo zzcfoVar = this.zza;
        zzfun zzfunVar = com.google.android.gms.ads.internal.util.zzt.zza;
        Objects.requireNonNull(zzcfoVar);
        zzfunVar.post(new zzcgc(zzcfoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z2, boolean z3) {
        this.zza.zzaJ(zzcVar, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaK(String str, String str2, int i2) {
        this.zza.zzaK(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaL(boolean z2, int i2, boolean z3) {
        this.zza.zzaL(z2, i2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaM(boolean z2, int i2, String str, String str2, boolean z3) {
        this.zza.zzaM(z2, i2, str, str2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaN(boolean z2, int i2, String str, boolean z3, boolean z4) {
        this.zza.zzaN(z2, i2, str, z3, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzab() {
        this.zza.zzab();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzac(boolean z2) {
        this.zza.zzac(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzad() {
        this.zza.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzae(String str, String str2, @Nullable String str3) {
        this.zza.zzae(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaf() {
        this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzag(String str, zzbjw zzbjwVar) {
        this.zza.zzag(str, zzbjwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzah() {
        zzegf zzQ;
        zzegd zzP;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzu.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzt.zzy());
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeX)).booleanValue() && (zzP = zzP()) != null) {
            zzP.zza(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeW)).booleanValue() && (zzQ = zzQ()) != null && zzQ.zzb()) {
            com.google.android.gms.ads.internal.zzu.zzA().zzg(zzQ.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzai(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaj(zzchi zzchiVar) {
        this.zza.zzaj(zzchiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzak(zzbai zzbaiVar) {
        this.zza.zzak(zzbaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzal(boolean z2) {
        this.zza.zzal(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzao(boolean z2) {
        this.zza.zzao(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzap(zzbfo zzbfoVar) {
        this.zza.zzap(zzbfoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaq(boolean z2) {
        this.zza.zzaq(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzar(@Nullable zzbfq zzbfqVar) {
        this.zza.zzar(zzbfqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzas(@Nullable zzegd zzegdVar) {
        this.zza.zzas(zzegdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzat(zzegf zzegfVar) {
        this.zza.zzat(zzegfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzau(int i2) {
        this.zza.zzau(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzav(boolean z2) {
        this.zza.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzaw(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzax(boolean z2) {
        this.zza.zzax(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzay(boolean z2) {
        this.zza.zzay(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaz(String str, zzbjw zzbjwVar) {
        this.zza.zzaz(str, zzbjwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdG() {
        zzcfo zzcfoVar = this.zza;
        if (zzcfoVar != null) {
            zzcfoVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdf() {
        zzcfo zzcfoVar = this.zza;
        if (zzcfoVar != null) {
            zzcfoVar.zzdf();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final void zzdh() {
        this.zza.zzdh();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final String zzdi() {
        return this.zza.zzdi();
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(zzayu zzayuVar) {
        this.zza.zzdp(zzayuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdO)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzh() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdO)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzccj
    @Nullable
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzbdh zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcgn) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final zzbdi zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchc, com.google.android.gms.internal.ads.zzccj
    public final VersionInfoParcel zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzcby zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzcdv zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final zzcgq zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final String zzr() {
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final void zzt(String str, zzcdv zzcdvVar) {
        this.zza.zzt(str, zzcdvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzu() {
        this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzv(boolean z2, long j2) {
        this.zza.zzv(z2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzx(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzy(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzz(boolean z2) {
        this.zza.zzz(false);
    }
}
