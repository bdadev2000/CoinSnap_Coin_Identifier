package y;

import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31421a;

    public /* synthetic */ b(int i2) {
        this.f31421a = i2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f31421a) {
            case 0:
                return InstrumentUtility.c(file, str);
            case 1:
                return InstrumentUtility.b(file, str);
            case 2:
                return InstrumentUtility.a(file, str);
            case 3:
                return ErrorReportHandler.c(file, str);
            case 4:
                return CrashlyticsReportPersistence.b(file, str);
            default:
                return CrashlyticsReportPersistence.d(file, str);
        }
    }
}
