package com.google.firebase.crashlytics.internal.breadcrumbs;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public interface BreadcrumbSource {
    void registerBreadcrumbHandler(@Nullable BreadcrumbHandler breadcrumbHandler);
}
