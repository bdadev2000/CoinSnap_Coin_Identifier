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

/* loaded from: classes3.dex */
public interface zzcfk extends com.google.android.gms.ads.internal.client.zza, zzdel, zzcfb, zzbmm, zzcgn, zzcgr, zzbmy, zzaym, zzcgu, com.google.android.gms.ads.internal.zzn, zzcgx, zzcgy, zzccf, zzcgz {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccf
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

    void measure(int i10, int i11);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzccf
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzccf
    void zzC(zzcgm zzcgmVar);

    @Override // com.google.android.gms.internal.ads.zzcfb
    zzfet zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcgz
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcgx
    zzavc zzI();

    zzazz zzJ();

    zzbfm zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    zzchc zzN();

    @Override // com.google.android.gms.internal.ads.zzcgw
    zzche zzO();

    zzeeu zzP();

    zzeew zzQ();

    @Override // com.google.android.gms.internal.ads.zzcgn
    zzfew zzR();

    zzffs zzS();

    ua.b zzT();

    String zzU();

    List zzV();

    void zzW(zzfet zzfetVar, zzfew zzfewVar);

    void zzX();

    void zzY();

    void zzZ(int i10);

    void zzaA(String str, Predicate predicate);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z10, int i10);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z10);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, zzbjr zzbjrVar);

    void zzah();

    void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaj(zzche zzcheVar);

    void zzak(zzazz zzazzVar);

    void zzal(boolean z10);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z10);

    void zzap(zzbfk zzbfkVar);

    void zzaq(boolean z10);

    void zzar(zzbfm zzbfmVar);

    void zzas(zzeeu zzeeuVar);

    void zzat(zzeew zzeewVar);

    void zzau(int i10);

    void zzav(boolean z10);

    void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzax(boolean z10);

    void zzay(boolean z10);

    void zzaz(String str, zzbjr zzbjrVar);

    @Override // com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccf
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzccf
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzccf
    zzbda zzm();

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzccf
    VersionInfoParcel zzn();

    @Override // com.google.android.gms.internal.ads.zzccf
    zzcgm zzq();

    @Override // com.google.android.gms.internal.ads.zzccf
    void zzt(String str, zzcdr zzcdrVar);
}
