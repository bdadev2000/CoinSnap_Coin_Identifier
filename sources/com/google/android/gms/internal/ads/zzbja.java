package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.applovin.impl.adview.t;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbja implements zzbjw {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfo zzcfoVar = (zzcfo) obj;
        WindowManager windowManager = (WindowManager) zzcfoVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzu.zzp();
        DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzt.zzt(windowManager);
        int i2 = zzt.widthPixels;
        int i3 = zzt.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcfoVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        t.s(iArr[1], hashMap, "yInPixels", i2, "windowWidthInPixels");
        hashMap.put("windowHeightInPixels", Integer.valueOf(i3));
        zzcfoVar.zzd("locationReady", hashMap);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("GET LOCATION COMPILED");
    }
}
