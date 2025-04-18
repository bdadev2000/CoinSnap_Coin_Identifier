package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface zzdkx {
    boolean zzA();

    boolean zzB();

    boolean zzC(Bundle bundle);

    int zza();

    JSONObject zze(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType);

    JSONObject zzf(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType);

    void zzg();

    void zzh();

    void zzi();

    void zzj(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar);

    void zzk(View view, View view2, Map map, Map map2, boolean z2, @Nullable ImageView.ScaleType scaleType);

    void zzl(String str);

    void zzm(Bundle bundle);

    void zzo(@Nullable View view, View view2, Map map, Map map2, boolean z2, @Nullable ImageView.ScaleType scaleType, int i2);

    void zzp();

    void zzq(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType);

    void zzr();

    void zzs(@Nullable View view, MotionEvent motionEvent, View view2);

    void zzt(Bundle bundle);

    void zzu(View view);

    void zzv();

    void zzw(com.google.android.gms.ads.internal.client.zzdd zzddVar);

    void zzx(zzbhw zzbhwVar);

    void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void zzz(View view, Map map);
}
