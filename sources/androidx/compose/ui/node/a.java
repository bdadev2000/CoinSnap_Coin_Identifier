package androidx.compose.ui.node;

import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.errorreport.ErrorReportData;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import d0.k;
import java.io.File;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16175a;

    public /* synthetic */ a(int i2) {
        this.f16175a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int m554sendErrorReports$lambda0;
        int oldestEventFileFirst;
        int lambda$static$0;
        switch (this.f16175a) {
            case 0:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                float f2 = layoutNode.C.f15995r.A;
                float f3 = layoutNode2.C.f15995r.A;
                return f2 == f3 ? p0.a.E(layoutNode.C(), layoutNode2.C()) : Float.compare(f2, f3);
            case 1:
                k kVar = (k) obj;
                k kVar2 = (k) obj2;
                return (((Number) kVar.f30135b).intValue() - ((Number) kVar.f30134a).intValue()) - (((Number) kVar2.f30135b).intValue() - ((Number) kVar2.f30134a).intValue());
            case 2:
                return ANRHandler.b((InstrumentData) obj, (InstrumentData) obj2);
            case 3:
                return CrashHandler.Companion.b((InstrumentData) obj, (InstrumentData) obj2);
            case 4:
                m554sendErrorReports$lambda0 = ErrorReportHandler.m554sendErrorReports$lambda0((ErrorReportData) obj, (ErrorReportData) obj2);
                return m554sendErrorReports$lambda0;
            case 5:
                return ((Double) obj).compareTo((Double) obj2);
            case 6:
                oldestEventFileFirst = CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
                return oldestEventFileFirst;
            default:
                lambda$static$0 = CrashlyticsReportPersistence.lambda$static$0((File) obj, (File) obj2);
                return lambda$static$0;
        }
    }
}
