package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzchd extends com.google.android.gms.ads.internal.client.zza, zzdhi, zzcgu, zzbok, zzcig, zzcik, zzbox, zzban, zzcin, com.google.android.gms.ads.internal.zzm, zzciq, zzcir, zzcee, zzcis {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcik, com.google.android.gms.internal.ads.zzcee
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i9, int i10);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcee
    void setBackgroundColor(int i9);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcee
    void zzC(zzcif zzcifVar);

    @Override // com.google.android.gms.internal.ads.zzcgu
    zzfgt zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcis
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzciq
    zzaxd zzI();

    zzbca zzJ();

    zzbhj zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    zzciv zzN();

    @Override // com.google.android.gms.internal.ads.zzcip
    zzcix zzO();

    zzehe zzP();

    zzehg zzQ();

    @Override // com.google.android.gms.internal.ads.zzcig
    zzfgw zzR();

    zzfhs zzS();

    f4.c zzT();

    String zzU();

    List zzV();

    void zzW(zzfgt zzfgtVar, zzfgw zzfgwVar);

    void zzX();

    void zzY();

    void zzZ(int i9);

    void zzaA(String str, Predicate predicate);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z8, int i9);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z8);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, zzblp zzblpVar);

    void zzah();

    void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaj(zzcix zzcixVar);

    void zzak(zzbca zzbcaVar);

    void zzal(boolean z8);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z8);

    void zzap(zzbhh zzbhhVar);

    void zzaq(boolean z8);

    void zzar(zzbhj zzbhjVar);

    void zzas(zzehe zzeheVar);

    void zzat(zzehg zzehgVar);

    void zzau(int i9);

    void zzav(boolean z8);

    void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzax(boolean z8);

    void zzay(boolean z8);

    void zzaz(String str, zzblp zzblpVar);

    @Override // com.google.android.gms.internal.ads.zzcik, com.google.android.gms.internal.ads.zzcee
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcee
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzcee
    zzbfc zzm();

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcee
    VersionInfoParcel zzn();

    @Override // com.google.android.gms.internal.ads.zzcee
    zzcif zzq();

    @Override // com.google.android.gms.internal.ads.zzcee
    void zzt(String str, zzcfp zzcfpVar);
}
