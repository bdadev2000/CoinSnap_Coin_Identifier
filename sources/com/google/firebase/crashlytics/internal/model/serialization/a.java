package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements CrashlyticsReportJsonTransform.ObjectParser {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28885a;

    public /* synthetic */ a(int i2) {
        this.f28885a = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object parse(JsonReader jsonReader) {
        switch (this.f28885a) {
            case 0:
                return CrashlyticsReportJsonTransform.d(jsonReader);
            case 1:
                return CrashlyticsReportJsonTransform.a(jsonReader);
            case 2:
                return CrashlyticsReportJsonTransform.f(jsonReader);
            case 3:
                return CrashlyticsReportJsonTransform.h(jsonReader);
            case 4:
                return CrashlyticsReportJsonTransform.g(jsonReader);
            case 5:
                return CrashlyticsReportJsonTransform.d(jsonReader);
            case 6:
                return CrashlyticsReportJsonTransform.b(jsonReader);
            case 7:
                return CrashlyticsReportJsonTransform.i(jsonReader);
            case 8:
                return CrashlyticsReportJsonTransform.i(jsonReader);
            case 9:
                return CrashlyticsReportJsonTransform.e(jsonReader);
            default:
                return CrashlyticsReportJsonTransform.c(jsonReader);
        }
    }
}
