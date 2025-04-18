package y;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements GraphRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31420b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f31419a = i2;
        this.f31420b = obj;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i2 = this.f31419a;
        Object obj = this.f31420b;
        switch (i2) {
            case 0:
                ExceptionAnalyzer.m541sendExceptionAnalysisReports$lambda1((InstrumentData) obj, graphResponse);
                return;
            default:
                ErrorReportHandler.m555sendErrorReports$lambda2((ArrayList) obj, graphResponse);
                return;
        }
    }
}
