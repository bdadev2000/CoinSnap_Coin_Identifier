package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i2) {
        super(new Status(i2, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i2), com.google.android.play.core.review.model.zza.zza(i2))));
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
