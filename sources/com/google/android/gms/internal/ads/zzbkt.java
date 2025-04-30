package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.applovin.impl.L;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbkt implements zzblp {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        WindowManager windowManager = (WindowManager) zzchdVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzu.zzp();
        DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzt.zzt(windowManager);
        int i9 = zzt.widthPixels;
        int i10 = zzt.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzchdVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        L.q(iArr[1], hashMap, "yInPixels", i9, "windowWidthInPixels");
        hashMap.put("windowHeightInPixels", Integer.valueOf(i10));
        zzchdVar.zzd("locationReady", hashMap);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("GET LOCATION COMPILED");
    }
}
