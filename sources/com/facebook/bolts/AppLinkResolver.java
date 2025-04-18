package com.facebook.bolts;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface AppLinkResolver {
    @NotNull
    Task<AppLink> getAppLinkFromUrlInBackground(@NotNull Uri uri);
}
