package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbiv implements zzbjr {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        WindowManager windowManager = (WindowManager) zzcfkVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzv.zzq();
        DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzs.zzt(windowManager);
        int i10 = zzt.widthPixels;
        int i11 = zzt.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcfkVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i10));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i11));
        zzcfkVar.zzd("locationReady", hashMap);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("GET LOCATION COMPILED");
    }
}
