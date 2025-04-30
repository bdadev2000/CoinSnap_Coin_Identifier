package com.google.android.gms.ads.query;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class UpdateImpressionUrlsCallback {
    @KeepForSdk
    public void onFailure(@NonNull String str) {
    }

    @KeepForSdk
    public void onSuccess(@NonNull List<Uri> list) {
    }
}
