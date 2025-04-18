package com.google.android.gms.appset;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public interface AppSetIdClient {
    @NonNull
    Task<AppSetIdInfo> getAppSetIdInfo();
}
