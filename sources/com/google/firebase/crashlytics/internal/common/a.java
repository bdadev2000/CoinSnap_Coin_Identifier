package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28861a;

    public /* synthetic */ a(int i2) {
        this.f28861a = i2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f28861a) {
            case 0:
                return CrashlyticsAppQualitySessionsStore.a(file, str);
            default:
                return CrashlyticsController.a(file, str);
        }
    }
}
