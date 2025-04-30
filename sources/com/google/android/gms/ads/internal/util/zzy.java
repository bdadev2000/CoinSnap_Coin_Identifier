package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbep;
import java.util.List;
import java.util.Locale;

@TargetApi(28)
/* loaded from: classes2.dex */
public class zzy extends zzw {
    public static final /* synthetic */ WindowInsets zzl(Activity activity, View view, WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzm() == null) {
            displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    Locale locale = Locale.US;
                    String str2 = rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom;
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(str2);
                }
                zzi.zzD(str);
            } else {
                com.google.android.gms.ads.internal.zzu.zzo().zzi().zzD("");
            }
        }
        zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean z8, Activity activity) {
        int i9;
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        i9 = attributes.layoutInDisplayCutoutMode;
        int i10 = 1;
        if (true != z8) {
            i10 = 2;
        }
        if (i10 != i9) {
            attributes.layoutInDisplayCutoutMode = i10;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zzj(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzk(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbg)).booleanValue() && com.google.android.gms.ads.internal.zzu.zzo().zzi().zzm() == null && !activity.isInMultiWindowMode()) {
            zzn(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzx
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzy.zzl(activity, view, windowInsets);
                }
            });
        }
    }
}
